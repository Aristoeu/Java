package trees;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test7501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7501");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) 'a', (int) (short) 0);
        segmentTree5.update(100, 10);
        int int17 = segmentTree5.getSum(100, 0);
        int int20 = segmentTree5.getSum((int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test7502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7502");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (short) 0, 1);
        segmentTree5.update(10, 10);
        segmentTree5.update(0, 10);
        segmentTree5.update((int) (short) 0, 1);
        int[] intArray37 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        segmentTree38.update((int) (short) 100, 0);
        int int44 = segmentTree38.getSum((int) (short) 0, (int) (short) 0);
        int int47 = segmentTree38.getSum((int) '#', (int) (byte) 10);
        segmentTree38.update((int) (short) 0, 1);
        segmentTree38.update(10, 10);
        segmentTree38.update((int) (short) 10, 0);
        int[] intArray64 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree65 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray64);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree66 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray64);
        int int70 = segmentTree38.constructTree(intArray64, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree71 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray64);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree72 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray64);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree73 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray64);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree74 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray64);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree75 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray64);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree76 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray64);
        // The following exception was thrown during execution in test generation
        try {
            int int80 = segmentTree5.constructTree(intArray64, 97, (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
    }

    @Test
    public void test7503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7503");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        segmentTree5.update((int) (byte) 100, (int) (short) 1);
        segmentTree5.update((int) (short) 10, 100);
        int int20 = segmentTree5.getSum(0, (int) (byte) 1);
        segmentTree5.update(0, (int) (short) 10);
        int int26 = segmentTree5.getSum(52, (-1));
        java.lang.Class<?> wildcardClass27 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7504");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum(100, (int) 'a');
        int int20 = segmentTree5.getSum((int) (short) 100, (int) (byte) 100);
        int int23 = segmentTree5.getSum((int) (byte) 0, (int) (short) 1);
        int int26 = segmentTree5.getSum((int) ' ', (int) (byte) 0);
        segmentTree5.update(100, (int) (short) 1);
        segmentTree5.update((int) (short) 10, (int) (short) 1);
        int[] intArray39 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray39);
        segmentTree40.update((int) ' ', (int) (byte) 10);
        segmentTree40.update((int) (short) 100, (int) '#');
        segmentTree40.update((int) (byte) 1, (int) (short) -1);
        int int52 = segmentTree40.getSum((-1), 0);
        int int55 = segmentTree40.getSum((int) 'a', (int) '#');
        int int58 = segmentTree40.getSum((int) '#', 100);
        segmentTree40.update((int) ' ', (int) (short) 1);
        segmentTree40.update((int) (short) 10, (int) '#');
        int int67 = segmentTree40.getSum((int) (short) 10, (int) '#');
        int[] intArray78 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree79 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray78);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree80 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray78);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree81 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray78);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree82 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray78);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree83 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray78);
        int int87 = segmentTree40.constructTree(intArray78, 0, 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree88 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray78);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree89 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray78);
        // The following exception was thrown during execution in test generation
        try {
            int int93 = segmentTree5.constructTree(intArray78, (int) (short) -1, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
    }

    @Test
    public void test7505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7505");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((-1), (int) (byte) -1);
        segmentTree5.update((int) (short) 0, 0);
        int int17 = segmentTree5.getSum((int) (byte) 100, (int) (short) 10);
        int int20 = segmentTree5.getSum((int) (short) 1, (int) ' ');
        segmentTree5.update((-1), 52);
        int int26 = segmentTree5.getSum(97, 52);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7506");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum((-1), (int) '#');
        segmentTree5.update((int) (byte) 100, (int) ' ');
        segmentTree5.update((int) (short) 10, (int) (short) 10);
        int int26 = segmentTree5.getSum((int) '#', (int) (short) 10);
        segmentTree5.update(0, (int) (byte) 1);
        int[] intArray42 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray42);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray42);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray42);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray42);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray42);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree48 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray42);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray42);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree50 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray42);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree51 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray42);
        // The following exception was thrown during execution in test generation
        try {
            int int55 = segmentTree5.constructTree(intArray42, (int) (short) 10, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 52, 100]");
    }

    @Test
    public void test7507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7507");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        int int14 = segmentTree5.getSum((int) (short) 0, (int) (short) -1);
        int int17 = segmentTree5.getSum(10, (int) (short) 0);
        segmentTree5.update((int) (short) 0, (int) (short) 100);
        segmentTree5.update(0, (int) (short) -1);
        segmentTree5.update((int) (short) -1, 10);
        segmentTree5.update((int) (byte) 10, (int) ' ');
        int int32 = segmentTree5.getSum((int) (byte) -1, (-1));
        int int35 = segmentTree5.getSum((int) (byte) -1, (int) (short) 0);
        segmentTree5.update((int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass39 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test7508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7508");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        segmentTree5.update(100, (-1));
        int int17 = segmentTree5.getSum((int) '#', (int) (byte) 1);
        int[] intArray28 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree29 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray28);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree30 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray28);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree31 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray28);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree32 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray28);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree33 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray28);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = segmentTree5.constructTree(intArray28, 52, 52, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7509");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (byte) 1, (int) (byte) 1);
        segmentTree5.update((int) (short) 0, (int) (short) 10);
        int int23 = segmentTree5.getSum(1, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree29 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray28);
        segmentTree29.update((int) (short) 100, 0);
        int int35 = segmentTree29.getSum((-1), (int) (byte) -1);
        segmentTree29.update((int) (short) 0, 0);
        segmentTree29.update((int) (short) 10, (int) (byte) -1);
        segmentTree29.update((int) (byte) 0, 0);
        segmentTree29.update(0, (int) (short) 10);
        segmentTree29.update((int) ' ', 0);
        int[] intArray62 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree63 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray62);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree64 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray62);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree65 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray62);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree66 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray62);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree67 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray62);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree68 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray62);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree69 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray62);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree70 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray62);
        int int74 = segmentTree29.constructTree(intArray62, 0, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int78 = segmentTree5.constructTree(intArray62, 100, (int) '#', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[10, 52, 100]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 100 + "'", int74 == 100);
    }

    @Test
    public void test7510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7510");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        segmentTree5.update(100, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (byte) -1, (int) (short) 0);
        int int23 = segmentTree5.getSum(0, (int) (byte) -1);
        int int26 = segmentTree5.getSum((int) 'a', (int) (short) -1);
        int int29 = segmentTree5.getSum((int) (byte) 1, (int) 'a');
        segmentTree5.update((int) (short) 100, 1);
        segmentTree5.update((int) '#', (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7511");
        int[] intArray8 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        int[] intArray23 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree24 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray23);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree25 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray23);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree26 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray23);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree27 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray23);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree28 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray23);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree29 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray23);
        int int33 = segmentTree13.constructTree(intArray23, (int) (byte) 1, (int) (byte) 1, 0);
        int int36 = segmentTree13.getSum((int) '4', (int) '4');
        segmentTree13.update((int) 'a', (int) (byte) 1);
        int[] intArray48 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray48);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree50 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray48);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree51 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray48);
        // The following exception was thrown during execution in test generation
        try {
            int int55 = segmentTree13.constructTree(intArray48, 0, (-1), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 52, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7512");
        int[] intArray12 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree20 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree21 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        int int24 = segmentTree21.getSum((int) (byte) 10, 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test7513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7513");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        segmentTree5.update((int) (byte) 100, (int) (short) 1);
        int int17 = segmentTree5.getSum(0, 1);
        segmentTree5.update((int) (byte) -1, (-1));
        int int23 = segmentTree5.getSum(0, (int) (short) 100);
        segmentTree5.update((int) (short) 1, (int) (short) -1);
        segmentTree5.update(0, (int) (short) 100);
        int[] intArray34 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        segmentTree35.update((int) (short) 100, 0);
        int int41 = segmentTree35.getSum((int) (short) 0, (int) (short) 0);
        int int44 = segmentTree35.getSum((int) '#', (int) (byte) 10);
        segmentTree35.update((int) (short) 0, 1);
        segmentTree35.update(10, 10);
        segmentTree35.update((int) (short) 10, 0);
        int[] intArray61 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree62 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree63 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray61);
        int int67 = segmentTree35.constructTree(intArray61, (int) (short) 0, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int71 = segmentTree5.constructTree(intArray61, 100, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test7514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7514");
        int[] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree2 = new com.thealgorithms.datastructures.trees.SegmentTree(35, intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7515");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((-1), (int) (byte) -1);
        segmentTree5.update(10, (int) ' ');
        int[] intArray24 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree25 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray24);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree26 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray24);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree27 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray24);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree28 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = segmentTree5.constructTree(intArray24, 35, 35, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7516");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum(100, (int) 'a');
        int int20 = segmentTree5.getSum((int) (short) 100, (int) (byte) 100);
        int int23 = segmentTree5.getSum((int) (byte) 0, (int) (short) 1);
        segmentTree5.update(0, (int) (byte) 1);
        int int29 = segmentTree5.getSum((int) '4', (int) (short) 10);
        segmentTree5.update((int) (byte) 100, (int) '4');
        int int35 = segmentTree5.getSum((int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test7517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7517");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) (short) -1, (int) (short) 100);
        segmentTree5.update((int) (short) 1, (int) (short) 0);
        segmentTree5.update((-1), 1);
        segmentTree5.update((int) (byte) -1, 1);
        segmentTree5.update((int) (byte) 10, (int) (byte) 10);
        segmentTree5.update(10, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 0, 100]");
    }

    @Test
    public void test7518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7518");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (short) -1, (int) (byte) -1);
        segmentTree5.update((int) (byte) 10, (int) (short) 10);
        segmentTree5.update((int) (byte) 0, (int) (short) 100);
        int[] intArray33 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree34 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray33);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray33);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray33);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray33);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = segmentTree5.constructTree(intArray33, (int) (byte) -1, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7519");
        int[] intArray5 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree6 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray5);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray5);
        segmentTree7.update((int) (short) -1, 1);
        segmentTree7.update((int) (short) -1, (int) 'a');
        int[] intArray22 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree23 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray22);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree24 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray22);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree25 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = segmentTree7.constructTree(intArray22, (int) (byte) 1, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 52, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7520");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, 1);
        int int26 = segmentTree5.getSum((int) (short) -1, 100);
        int int29 = segmentTree5.getSum((int) (byte) 0, (int) (short) -1);
        int int32 = segmentTree5.getSum((int) (byte) 1, (int) (byte) 10);
        int int35 = segmentTree5.getSum((int) ' ', (int) ' ');
        segmentTree5.update((int) (byte) 10, (int) '#');
        segmentTree5.update(97, 0);
        segmentTree5.update((int) (byte) 100, 100);
        java.lang.Class<?> wildcardClass45 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test7521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7521");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, 1);
        int int26 = segmentTree5.getSum((int) (short) -1, 100);
        int int29 = segmentTree5.getSum((int) (byte) 0, (int) (short) -1);
        segmentTree5.update((int) '#', 0);
        int int35 = segmentTree5.getSum((int) 'a', (int) (short) 0);
        segmentTree5.update((int) (short) 1, (int) (byte) 10);
        int int41 = segmentTree5.getSum(97, (int) (byte) 10);
        segmentTree5.update((int) '#', 97);
        java.lang.Class<?> wildcardClass45 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test7522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7522");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (byte) 1, (int) (byte) 1);
        segmentTree5.update((int) (short) 0, (int) (short) 10);
        segmentTree5.update((int) (byte) 100, (int) (byte) 1);
        int int26 = segmentTree5.getSum((int) 'a', (int) (byte) -1);
        int int29 = segmentTree5.getSum((int) (short) 10, (-1));
        segmentTree5.update((int) (byte) 10, (int) (short) 100);
        segmentTree5.update(0, (int) (byte) 1);
        int[] intArray39 = new int[] { 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray39);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray39);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = segmentTree5.constructTree(intArray39, 10, 52, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100]");
    }

    @Test
    public void test7523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7523");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        int int17 = segmentTree5.getSum((-1), 0);
        int int20 = segmentTree5.getSum((int) (short) 100, (int) (short) -1);
        segmentTree5.update(0, (int) '4');
        int int26 = segmentTree5.getSum(0, 100);
        segmentTree5.update((int) '4', (int) (byte) -1);
        int int32 = segmentTree5.getSum((int) (short) 10, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, -1, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7524");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum((int) '#', (int) (byte) 100);
        int int20 = segmentTree5.getSum((int) (short) 100, (int) (byte) 1);
        int int23 = segmentTree5.getSum((int) (short) 0, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test7525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7525");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum((int) '#', (int) (byte) 100);
        segmentTree5.update(10, 10);
        segmentTree5.update(0, (int) '4');
        int int26 = segmentTree5.getSum((int) (byte) 1, (int) '4');
        segmentTree5.update(0, (int) (short) 100);
        int int32 = segmentTree5.getSum(35, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7526");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (short) 0, 1);
        segmentTree5.update(10, 10);
        int int23 = segmentTree5.getSum((int) ' ', 10);
        segmentTree5.update((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (byte) 0, 1);
        int int32 = segmentTree5.getSum((int) (byte) 0, (int) (short) 1);
        int int35 = segmentTree5.getSum(10, (int) (short) 1);
        segmentTree5.update(0, (int) (short) 1);
        java.lang.Class<?> wildcardClass39 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test7527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7527");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) 'a', (int) (short) 0);
        segmentTree5.update(100, 10);
        segmentTree5.update((int) (byte) 10, 0);
        segmentTree5.update(10, (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) (short) -1);
        int int26 = segmentTree5.getSum(0, (int) '4');
        segmentTree5.update((int) (byte) 0, (int) (short) 10);
        int[] intArray41 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray41);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray41);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray41);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray41);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray41);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray41);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = segmentTree5.constructTree(intArray41, (int) (short) 0, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 100]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7528");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        segmentTree5.update((-1), (-1));
        segmentTree5.update((int) '4', (int) (byte) 10);
        int int29 = segmentTree5.getSum(100, (int) (byte) 0);
        segmentTree5.update(100, (int) ' ');
        int int35 = segmentTree5.getSum((int) (byte) 10, 100);
        segmentTree5.update((int) (byte) 1, (int) ' ');
        int int41 = segmentTree5.getSum((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 32, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
    }

    @Test
    public void test7529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7529");
        int[] intArray11 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        segmentTree12.update((int) (short) 100, 0);
        int int18 = segmentTree12.getSum((int) (short) 0, (int) (short) 0);
        int int21 = segmentTree12.getSum((int) '#', (int) (byte) 10);
        segmentTree12.update((int) (short) 0, 1);
        segmentTree12.update(10, 10);
        segmentTree12.update((int) (short) 10, 0);
        int[] intArray38 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray38);
        int int44 = segmentTree12.constructTree(intArray38, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree48 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree50 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree51 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray38);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test7530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7530");
        int[] intArray11 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray11);
        int int22 = segmentTree19.getSum(1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test7531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7531");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        int int17 = segmentTree5.getSum((-1), 0);
        int int20 = segmentTree5.getSum((int) 'a', (int) '#');
        int int23 = segmentTree5.getSum((int) '#', 100);
        int int26 = segmentTree5.getSum(100, (int) (byte) 10);
        int int29 = segmentTree5.getSum((int) ' ', (int) '4');
        segmentTree5.update((int) (short) 0, (int) (short) 10);
        int[] intArray42 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray42);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray42);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray42);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray42);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray42);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree48 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray42);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = segmentTree5.constructTree(intArray42, (int) (byte) 1, 52, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, 52, 100]");
    }

    @Test
    public void test7532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7532");
        int[] intArray10 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) 'a', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7533");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (short) 10, 0);
        segmentTree5.update(0, (int) (byte) 0);
        segmentTree5.update((int) 'a', 0);
        segmentTree5.update((int) (byte) 10, (int) (short) -1);
        int int23 = segmentTree5.getSum(0, (int) (short) -1);
        int int26 = segmentTree5.getSum((int) (byte) 1, (int) (short) 10);
        segmentTree5.update(32, (int) (byte) 100);
        int int32 = segmentTree5.getSum((int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7534");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        int int17 = segmentTree5.getSum((-1), 0);
        int int20 = segmentTree5.getSum((int) 'a', (int) '#');
        int int23 = segmentTree5.getSum((int) '#', 100);
        int int26 = segmentTree5.getSum((int) '4', (int) (short) 1);
        int int29 = segmentTree5.getSum((int) '#', (int) '4');
        segmentTree5.update(97, (int) (short) 100);
        int[] intArray46 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree48 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree50 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree51 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree52 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree53 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree54 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree55 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree56 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray46);
        // The following exception was thrown during execution in test generation
        try {
            int int60 = segmentTree5.constructTree(intArray46, (int) (short) -1, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 52, 100]");
    }

    @Test
    public void test7535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7535");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) 'a', (int) (short) 0);
        segmentTree5.update(100, 10);
        int int17 = segmentTree5.getSum((int) '4', (int) (byte) 100);
        segmentTree5.update((int) (short) 0, (int) 'a');
        int int23 = segmentTree5.getSum((int) (short) 10, (int) 'a');
        int int26 = segmentTree5.getSum(10, (int) '4');
        int int29 = segmentTree5.getSum((-1), (int) (byte) 10);
        int int32 = segmentTree5.getSum(0, (int) (short) 10);
        segmentTree5.update(10, (int) 'a');
        int int38 = segmentTree5.getSum(97, (int) (short) -1);
        segmentTree5.update(0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7536");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum((int) '#', (int) (byte) 100);
        segmentTree5.update(10, 10);
        segmentTree5.update(0, (int) '4');
        int int26 = segmentTree5.getSum((int) (byte) 1, (int) '4');
        segmentTree5.update(0, (int) (short) 100);
        int[] intArray39 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray39);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray39);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray39);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray39);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray39);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray39);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = segmentTree5.constructTree(intArray39, 100, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 52, 100]");
    }

    @Test
    public void test7537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7537");
        int[] intArray12 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 10, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7538");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        segmentTree5.update((int) (short) 1, (int) (short) -1);
        segmentTree5.update((int) 'a', 1);
        int int26 = segmentTree5.getSum((int) (short) 10, (int) (short) 1);
        segmentTree5.update(0, (int) ' ');
        segmentTree5.update((-1), 52);
        java.lang.Class<?> wildcardClass33 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7539");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum(100, (int) 'a');
        int int20 = segmentTree5.getSum((int) (short) 0, (int) (short) -1);
        segmentTree5.update((int) (byte) 100, (int) (byte) 0);
        int int26 = segmentTree5.getSum(0, 52);
        int int29 = segmentTree5.getSum((int) ' ', 100);
        segmentTree5.update((int) 'a', 0);
        int[] intArray38 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray38);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = segmentTree5.constructTree(intArray38, 100, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, 52, 100]");
    }

    @Test
    public void test7540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7540");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (short) 0, 1);
        segmentTree5.update(10, 10);
        segmentTree5.update((int) (short) 10, 0);
        int[] intArray31 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree32 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray31);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree33 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray31);
        int int37 = segmentTree5.constructTree(intArray31, (int) (short) 0, 0, (int) (byte) 0);
        segmentTree5.update((int) '4', (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test7541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7541");
        int[] intArray6 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        int int12 = segmentTree9.getSum((int) (short) 100, 0);
        segmentTree9.update((int) ' ', (int) (short) 10);
        segmentTree9.update((int) (short) -1, (int) 'a');
        int int21 = segmentTree9.getSum((int) (byte) 10, (int) (byte) 10);
        int int24 = segmentTree9.getSum(97, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test7542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7542");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, (int) '4');
        int int26 = segmentTree5.getSum((int) (byte) 10, (int) 'a');
        int int29 = segmentTree5.getSum((int) (short) -1, (int) (short) 0);
        int int32 = segmentTree5.getSum(0, (int) (short) -1);
        segmentTree5.update((int) (short) 100, (int) (short) 0);
        int int38 = segmentTree5.getSum((int) (byte) 10, 100);
        int[] intArray51 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree52 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray51);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree53 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray51);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree54 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray51);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree55 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray51);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree56 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray51);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree57 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray51);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree58 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray51);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = segmentTree5.constructTree(intArray51, 52, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7543");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update(10, 100);
        int int17 = segmentTree5.getSum((int) (byte) 1, (int) (byte) 0);
        int int20 = segmentTree5.getSum((int) '4', (int) ' ');
        segmentTree5.update(0, (int) (short) 0);
        segmentTree5.update((int) 'a', 97);
        segmentTree5.update((int) (byte) 1, (int) '4');
        segmentTree5.update(52, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test7544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7544");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) 'a', (int) (short) 0);
        segmentTree5.update(100, 10);
        int int17 = segmentTree5.getSum((int) '4', (int) (byte) 100);
        segmentTree5.update((int) '#', (int) '4');
        int int23 = segmentTree5.getSum((int) (short) 100, (int) (short) -1);
        segmentTree5.update(35, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test7545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7545");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((-1), (int) (byte) -1);
        segmentTree5.update((int) (byte) 10, (int) '4');
        int int17 = segmentTree5.getSum((int) ' ', (int) (byte) 1);
        segmentTree5.update((int) (byte) -1, 0);
        int int23 = segmentTree5.getSum((int) (byte) 10, 10);
        int int26 = segmentTree5.getSum((-1), 32);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7546");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        segmentTree5.update((int) (byte) 100, (int) (short) 1);
        int int17 = segmentTree5.getSum(0, 1);
        segmentTree5.update(10, (int) (byte) 0);
        segmentTree5.update((int) (byte) 100, (int) (short) 0);
        int int26 = segmentTree5.getSum(0, (int) (short) 100);
        int int29 = segmentTree5.getSum((int) ' ', (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7547");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (byte) -1, (int) '#');
        segmentTree5.update(1, (int) (byte) 1);
        segmentTree5.update(0, (int) (byte) 100);
        segmentTree5.update((int) 'a', (int) (byte) 0);
        int int29 = segmentTree5.getSum((int) (short) 0, 0);
        segmentTree5.update(52, 1);
        segmentTree5.update(100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test7548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7548");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        int int14 = segmentTree5.getSum((int) (byte) 100, (int) (short) 100);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) 1);
        int int20 = segmentTree5.getSum(0, (int) (short) -1);
        int int23 = segmentTree5.getSum((int) (byte) 1, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test7549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7549");
        int[] intArray6 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        int int10 = segmentTree7.getSum(1, (int) (byte) 10);
        int int13 = segmentTree7.getSum((int) ' ', (int) (byte) 0);
        segmentTree7.update(97, (int) ' ');
        int int19 = segmentTree7.getSum(52, 0);
        segmentTree7.update(0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test7550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7550");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (short) 0, 1);
        segmentTree5.update(10, 10);
        int int23 = segmentTree5.getSum((int) ' ', 10);
        segmentTree5.update((int) '#', (int) (byte) 10);
        segmentTree5.update((int) ' ', (int) (short) 100);
        segmentTree5.update(10, (int) ' ');
        segmentTree5.update(100, (int) (short) -1);
        int int38 = segmentTree5.getSum((int) 'a', 97);
        segmentTree5.update(0, (int) (short) 100);
        segmentTree5.update((int) 'a', (int) 'a');
        segmentTree5.update((int) (short) -1, 32);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7551");
        int[] intArray9 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray9);
        segmentTree10.update((int) (short) 100, 0);
        int int16 = segmentTree10.getSum((int) (short) 0, (int) (short) 0);
        int int19 = segmentTree10.getSum((int) '#', (int) (byte) 10);
        segmentTree10.update((int) (short) 0, 1);
        segmentTree10.update(10, 10);
        segmentTree10.update((int) (short) 10, 0);
        int[] intArray36 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray36);
        int int42 = segmentTree10.constructTree(intArray36, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray36);
        java.lang.Class<?> wildcardClass48 = intArray36.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test7552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7552");
        int[] intArray5 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree6 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray5);
        segmentTree6.update((int) (short) 100, 0);
        int int12 = segmentTree6.getSum((int) (short) 0, (int) (short) 0);
        int int15 = segmentTree6.getSum((int) '#', (int) (byte) 10);
        segmentTree6.update((int) (short) 0, 1);
        segmentTree6.update(10, 10);
        segmentTree6.update((int) (short) 10, 0);
        int[] intArray32 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree33 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray32);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree34 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray32);
        int int38 = segmentTree6.constructTree(intArray32, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray32);
        segmentTree39.update(0, 32);
        segmentTree39.update((int) ' ', (int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[32, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test7553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7553");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        int int14 = segmentTree5.getSum((int) (byte) -1, (int) 'a');
        segmentTree5.update((int) (byte) 100, (int) 'a');
        int int20 = segmentTree5.getSum((int) '#', (int) (short) -1);
        int int23 = segmentTree5.getSum((int) (short) 1, 1);
        segmentTree5.update((int) 'a', 0);
        int[] intArray38 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray38);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = segmentTree5.constructTree(intArray38, (int) (short) 10, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, 52, 100]");
    }

    @Test
    public void test7554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7554");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, 1);
        int int26 = segmentTree5.getSum((int) (short) -1, 100);
        segmentTree5.update((int) (byte) 1, (int) ' ');
        int int32 = segmentTree5.getSum(10, 0);
        java.lang.Class<?> wildcardClass33 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 32, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7555");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((-1), (int) (byte) -1);
        segmentTree5.update((int) (short) 0, 0);
        segmentTree5.update((int) (short) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 0, 0);
        segmentTree5.update(0, (int) (short) 10);
        segmentTree5.update((int) ' ', 0);
        segmentTree5.update((int) (byte) -1, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test7556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7556");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, 1);
        int int26 = segmentTree5.getSum((int) (short) -1, 100);
        segmentTree5.update((int) (byte) 1, (int) ' ');
        int int32 = segmentTree5.getSum((int) (byte) 100, (int) (short) 100);
        segmentTree5.update((int) (byte) 10, (int) (byte) 0);
        int int38 = segmentTree5.getSum(10, (int) (short) 1);
        int int41 = segmentTree5.getSum((int) (byte) 1, (-1));
        segmentTree5.update(97, (int) (short) 10);
        int[] intArray51 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree52 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray51);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = segmentTree5.constructTree(intArray51, (int) (byte) 10, 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 32, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7557");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        segmentTree5.update(100, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (byte) -1, (int) (short) 0);
        int int23 = segmentTree5.getSum(0, (int) (byte) -1);
        int int26 = segmentTree5.getSum((int) 'a', (int) (short) -1);
        int int29 = segmentTree5.getSum((int) (byte) 0, (int) (byte) 100);
        segmentTree5.update((int) (short) 0, 10);
        int int35 = segmentTree5.getSum((int) (byte) 10, (int) (short) -1);
        segmentTree5.update((int) '#', (-1));
        java.lang.Class<?> wildcardClass39 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test7558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7558");
        int[] intArray7 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray7);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray7);
        int int12 = segmentTree9.getSum((int) ' ', (int) (byte) 100);
        int int15 = segmentTree9.getSum(0, (int) (short) 0);
        segmentTree9.update(1, (int) (byte) 100);
        int[] intArray28 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree29 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray28);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree30 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray28);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree31 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray28);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree32 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray28);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = segmentTree9.constructTree(intArray28, 1, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 100, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7559");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) 'a', (int) (short) 0);
        int int14 = segmentTree5.getSum((int) (short) 0, (int) (byte) 0);
        int int17 = segmentTree5.getSum(0, (int) (byte) -1);
        segmentTree5.update(1, (int) (short) 100);
        segmentTree5.update((int) (byte) 1, (int) (byte) 10);
        int int26 = segmentTree5.getSum((int) (byte) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7560");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        segmentTree5.update(100, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (byte) -1, (int) (short) 0);
        int int23 = segmentTree5.getSum(0, (int) (byte) -1);
        int int26 = segmentTree5.getSum((-1), (int) 'a');
        segmentTree5.update((int) 'a', 52);
        segmentTree5.update(0, (int) (short) -1);
        int[] intArray45 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray45);
        segmentTree46.update((int) (short) 100, 0);
        int int52 = segmentTree46.getSum((int) (short) 0, (int) (short) 0);
        int int55 = segmentTree46.getSum((int) '#', (int) (byte) 10);
        segmentTree46.update((int) (short) 0, 1);
        segmentTree46.update(10, 10);
        segmentTree46.update((int) (short) 10, 0);
        int[] intArray72 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree73 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray72);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree74 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray72);
        int int78 = segmentTree46.constructTree(intArray72, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree79 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray72);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree80 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray72);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree81 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray72);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree82 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray72);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree83 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray72);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree84 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray72);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree85 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray72);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree86 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray72);
        // The following exception was thrown during execution in test generation
        try {
            int int90 = segmentTree5.constructTree(intArray72, (int) (byte) 0, 35, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test7561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7561");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) 'a', (int) (short) 0);
        segmentTree5.update((int) 'a', (int) (short) 1);
        segmentTree5.update(10, (int) (short) 1);
        segmentTree5.update((int) '4', (int) (short) 0);
        int int23 = segmentTree5.getSum((int) (short) 10, 1);
        segmentTree5.update((int) '4', 52);
        int int29 = segmentTree5.getSum((int) (byte) 10, (int) (short) -1);
        int int32 = segmentTree5.getSum(0, 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7562");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        segmentTree5.update(100, (-1));
        int int17 = segmentTree5.getSum((int) '#', (int) (byte) 1);
        int int20 = segmentTree5.getSum(0, (int) (byte) 1);
        int int23 = segmentTree5.getSum(0, (int) (short) 100);
        int int26 = segmentTree5.getSum((int) (byte) 10, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7563");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        segmentTree5.update(100, (-1));
        segmentTree5.update((int) (short) 1, (int) (short) 10);
        int int20 = segmentTree5.getSum((int) ' ', (int) '4');
        int int23 = segmentTree5.getSum((int) (byte) 100, (int) (byte) 100);
        segmentTree5.update((int) 'a', 32);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test7564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7564");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((-1), (int) (byte) -1);
        segmentTree5.update((int) (byte) 10, (int) '4');
        segmentTree5.update((-1), (int) (short) -1);
        segmentTree5.update((-1), (int) '#');
        segmentTree5.update((int) 'a', 100);
        int int26 = segmentTree5.getSum((int) (byte) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass27 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7565");
        int[] intArray7 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray7);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray7);
        segmentTree9.update(1, (int) (byte) 0);
        int int15 = segmentTree9.getSum((int) (short) 1, (-1));
        int int18 = segmentTree9.getSum(100, (int) (short) 0);
        segmentTree9.update((int) 'a', 97);
        int int24 = segmentTree9.getSum((int) (short) 0, 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 0, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test7566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7566");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        segmentTree5.update(10, (-1));
        int int20 = segmentTree5.getSum((int) (byte) 1, (int) (short) 100);
        int int23 = segmentTree5.getSum((int) (byte) 10, (int) '4');
        int int26 = segmentTree5.getSum((int) (short) 1, (int) (byte) 1);
        segmentTree5.update(0, (int) 'a');
        int int32 = segmentTree5.getSum((int) (byte) 0, (int) ' ');
        int int35 = segmentTree5.getSum((int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test7567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7567");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum((-1), (int) '#');
        segmentTree5.update((int) (byte) 100, (int) ' ');
        segmentTree5.update((int) (short) 100, (int) (short) 1);
        segmentTree5.update(10, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test7568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7568");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        int int17 = segmentTree5.getSum((-1), 0);
        int int20 = segmentTree5.getSum((int) 'a', (int) '#');
        int int23 = segmentTree5.getSum((int) '#', 100);
        int int26 = segmentTree5.getSum((int) '4', (int) (short) 1);
        int int29 = segmentTree5.getSum((int) '#', (int) '4');
        segmentTree5.update(97, (int) (short) 100);
        int int35 = segmentTree5.getSum(100, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test7569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7569");
        int[] intArray10 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray10);
        int int20 = segmentTree17.getSum((int) '#', (int) (byte) 100);
        segmentTree17.update((int) (byte) -1, (int) '4');
        int int26 = segmentTree17.getSum((int) (byte) 1, (int) '#');
        segmentTree17.update((int) (byte) 100, (int) '#');
        int int32 = segmentTree17.getSum(32, (int) 'a');
        int[] intArray40 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray40);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray40);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray40);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray40);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = segmentTree17.constructTree(intArray40, 100, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 52, 100]");
    }

    @Test
    public void test7570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7570");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (byte) -1, (int) '#');
        segmentTree5.update((int) ' ', (int) (short) -1);
        segmentTree5.update((-1), 0);
        segmentTree5.update((int) (byte) 0, (int) (byte) 0);
        segmentTree5.update(10, (int) '#');
        int int32 = segmentTree5.getSum(0, (int) (short) 10);
        int int35 = segmentTree5.getSum((-1), 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test7571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7571");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((-1), (int) (byte) -1);
        segmentTree5.update((int) (short) 0, 0);
        segmentTree5.update((int) (byte) 0, 0);
        int[] intArray29 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree30 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray29);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree31 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray29);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree32 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray29);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree33 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray29);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree34 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray29);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray29);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray29);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray29);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = segmentTree5.constructTree(intArray29, (int) ' ', 52, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 52, 100]");
    }

    @Test
    public void test7572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7572");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum(100, (int) 'a');
        int int20 = segmentTree5.getSum(1, (int) (short) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, (int) (byte) 0);
        segmentTree5.update((int) ' ', (int) (byte) 1);
        segmentTree5.update((int) '4', (int) (short) 0);
        segmentTree5.update(32, (-1));
        segmentTree5.update((int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test7573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7573");
        int[] intArray7 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray7);
        segmentTree8.update((int) (short) 100, 0);
        int int14 = segmentTree8.getSum((int) (short) 0, (int) (short) 0);
        int int17 = segmentTree8.getSum((int) '#', (int) (byte) 10);
        segmentTree8.update((int) (short) 0, 1);
        segmentTree8.update(10, 10);
        segmentTree8.update((int) (short) 10, 0);
        int[] intArray34 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray34);
        int int40 = segmentTree8.constructTree(intArray34, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray34);
        segmentTree43.update((-1), 0);
        segmentTree43.update(52, (int) (byte) 10);
        int int52 = segmentTree43.getSum(0, 52);
        segmentTree43.update((int) (short) 1, 100);
        segmentTree43.update((int) '#', (int) '#');
        segmentTree43.update(0, (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 100, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test7574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7574");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) (short) -1, (int) (short) 100);
        segmentTree5.update((int) 'a', (int) (short) 10);
        int int17 = segmentTree5.getSum(0, (int) '4');
        segmentTree5.update(1, (int) (byte) 1);
        int int23 = segmentTree5.getSum((int) (byte) 1, (int) (byte) 0);
        int int26 = segmentTree5.getSum((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7575");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum(100, (int) 'a');
        int int20 = segmentTree5.getSum(1, (int) (short) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, (int) (byte) 0);
        segmentTree5.update((int) ' ', (int) (byte) 1);
        segmentTree5.update(32, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test7576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7576");
        int[] intArray8 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        segmentTree11.update((int) (byte) 1, (int) '4');
        int int17 = segmentTree11.getSum((-1), (int) (byte) 100);
        segmentTree11.update((int) (short) -1, (int) (short) -1);
        int int23 = segmentTree11.getSum(0, (int) (byte) 1);
        int[] intArray33 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree34 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray33);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray33);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray33);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray33);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray33);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray33);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = segmentTree11.constructTree(intArray33, 0, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 52, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 52, 100]");
    }

    @Test
    public void test7577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7577");
        int[] intArray12 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree20 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree21 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        int int24 = segmentTree21.getSum((int) '4', (int) (byte) 0);
        segmentTree21.update((int) (short) 0, (int) (short) 0);
        int int30 = segmentTree21.getSum(97, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7578");
        int[] intArray8 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray8);
        int int14 = segmentTree11.getSum((int) 'a', 100);
        int int17 = segmentTree11.getSum((-1), 10);
        int int20 = segmentTree11.getSum((int) (byte) 10, 100);
        int int23 = segmentTree11.getSum((int) (byte) -1, 1);
        int int26 = segmentTree11.getSum(0, 10);
        int[] intArray35 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray35);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = segmentTree11.constructTree(intArray35, (-1), (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 52, 100]");
    }

    @Test
    public void test7579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7579");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        int int14 = segmentTree5.getSum((int) (short) 0, (int) (short) -1);
        int int17 = segmentTree5.getSum(10, (int) (short) 0);
        int int20 = segmentTree5.getSum((int) ' ', (int) (byte) 1);
        int int23 = segmentTree5.getSum((int) (byte) 100, 52);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test7580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7580");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (byte) -1, (int) '#');
        segmentTree5.update(1, (int) (byte) 1);
        segmentTree5.update(0, (int) (byte) 100);
        int int26 = segmentTree5.getSum((int) ' ', 100);
        segmentTree5.update(0, 1);
        segmentTree5.update((int) (short) -1, 0);
        java.lang.Class<?> wildcardClass33 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7581");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (byte) 1, (int) (byte) 1);
        int int20 = segmentTree5.getSum(100, (int) '#');
        int int23 = segmentTree5.getSum((int) (short) 10, (int) 'a');
        int int26 = segmentTree5.getSum((int) (short) 100, (int) (short) 1);
        int int29 = segmentTree5.getSum((int) (byte) -1, 32);
        segmentTree5.update((int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass33 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 0, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7582");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) 'a', (int) (short) 0);
        segmentTree5.update(100, 10);
        segmentTree5.update((int) (byte) 1, 10);
        segmentTree5.update((int) (short) 100, (-1));
        int int23 = segmentTree5.getSum((int) '#', (int) (byte) 0);
        int[] intArray32 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree33 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray32);
        segmentTree33.update((int) (short) 100, 0);
        int int39 = segmentTree33.getSum((int) (short) 0, (int) (short) 0);
        int int42 = segmentTree33.getSum((int) '#', (int) (byte) 10);
        segmentTree33.update((int) (short) 0, 1);
        segmentTree33.update(10, 10);
        segmentTree33.update((int) (short) 10, 0);
        int[] intArray59 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree60 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray59);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree61 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray59);
        int int65 = segmentTree33.constructTree(intArray59, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree66 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray59);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree67 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray59);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree68 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray59);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree69 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray59);
        // The following exception was thrown during execution in test generation
        try {
            int int73 = segmentTree5.constructTree(intArray59, (int) (short) 100, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
    }

    @Test
    public void test7583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7583");
        int[] intArray11 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree(32, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7584");
        int[] intArray5 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree6 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray5);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray5);
        int int10 = segmentTree7.getSum((int) (byte) 10, (int) (byte) 10);
        int int13 = segmentTree7.getSum((int) (short) 100, (int) (byte) 0);
        int int16 = segmentTree7.getSum(0, 52);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test7585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7585");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum(100, (int) 'a');
        int int20 = segmentTree5.getSum(1, (int) (short) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, (int) (byte) 0);
        segmentTree5.update((int) '#', (int) (byte) 10);
        segmentTree5.update(0, (int) (byte) 0);
        int int32 = segmentTree5.getSum((int) '#', (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7586");
        int[] intArray6 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        int int12 = segmentTree9.getSum((int) (short) 100, 0);
        segmentTree9.update((int) ' ', (int) (short) 10);
        segmentTree9.update((int) (byte) 1, (int) (byte) 100);
        segmentTree9.update((int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass22 = segmentTree9.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7587");
        int[] intArray8 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        segmentTree9.update((int) ' ', (int) (byte) 10);
        segmentTree9.update((int) (short) 100, (int) '#');
        segmentTree9.update((int) (byte) 1, (int) (short) -1);
        int int21 = segmentTree9.getSum((-1), 0);
        int int24 = segmentTree9.getSum((int) 'a', (int) '#');
        int int27 = segmentTree9.getSum((int) '#', 100);
        segmentTree9.update((int) ' ', (int) (short) 1);
        segmentTree9.update((int) (short) 10, (int) '#');
        int int36 = segmentTree9.getSum((int) (short) 10, (int) '#');
        int[] intArray47 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree48 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray47);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray47);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree50 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray47);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree51 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray47);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree52 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray47);
        int int56 = segmentTree9.constructTree(intArray47, 0, 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree57 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray47);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree58 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray47);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree59 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray47);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree60 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray47);
        segmentTree60.update((int) ' ', 32);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test7588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7588");
        int[] intArray8 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray8);
        segmentTree13.update((int) (byte) 1, (int) (short) -1);
        int int19 = segmentTree13.getSum((int) '4', (int) (short) 0);
        int int22 = segmentTree13.getSum((int) '4', (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = segmentTree13.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7589");
        int[] intArray5 = new int[] { 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree6 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray5);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray5);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray5);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray5);
        segmentTree9.update((int) '4', (int) (byte) 10);
        int int15 = segmentTree9.getSum((int) (short) 0, (int) (byte) -1);
        int int18 = segmentTree9.getSum((-1), 1);
        int int21 = segmentTree9.getSum((int) '4', 52);
        int int24 = segmentTree9.getSum((int) (short) 0, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test7590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7590");
        int[] intArray10 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray10);
        segmentTree11.update((int) (short) 100, 0);
        int int17 = segmentTree11.getSum((int) (short) 0, (int) (short) 0);
        int int20 = segmentTree11.getSum((int) '#', (int) (byte) 10);
        segmentTree11.update((int) (short) 0, 1);
        segmentTree11.update(10, 10);
        segmentTree11.update((int) (short) 10, 0);
        int[] intArray37 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray37);
        int int43 = segmentTree11.constructTree(intArray37, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree48 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray37);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 10, intArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test7591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7591");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        int int17 = segmentTree5.getSum((-1), 0);
        int int20 = segmentTree5.getSum((int) 'a', (int) '#');
        int int23 = segmentTree5.getSum((int) '#', 100);
        int int26 = segmentTree5.getSum(100, (int) (byte) 10);
        int int29 = segmentTree5.getSum((int) ' ', (int) '4');
        int int32 = segmentTree5.getSum((int) (short) 10, (int) (byte) 1);
        int int35 = segmentTree5.getSum((int) 'a', (int) (byte) 100);
        int int38 = segmentTree5.getSum((int) (byte) 0, (int) (byte) 100);
        segmentTree5.update((int) (byte) 10, (-1));
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (short) 1, 0);
        int int50 = segmentTree5.getSum((-1), 97);
        int[] intArray60 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree61 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray60);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree62 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray60);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree63 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray60);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree64 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray60);
        // The following exception was thrown during execution in test generation
        try {
            int int68 = segmentTree5.constructTree(intArray60, 35, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 0, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7592");
        int[] intArray9 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray9);
        int int15 = segmentTree12.getSum(0, (-1));
        int int18 = segmentTree12.getSum((int) (byte) 100, (int) (byte) 1);
        int[] intArray27 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree28 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray27);
        segmentTree28.update((int) ' ', (int) (byte) 10);
        int int34 = segmentTree28.getSum((int) (byte) 10, (int) (byte) -1);
        int int37 = segmentTree28.getSum((int) (byte) -1, (int) 'a');
        segmentTree28.update((int) (short) 100, 100);
        int[] intArray49 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree50 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray49);
        segmentTree50.update((int) (short) 100, 0);
        int int56 = segmentTree50.getSum((int) (short) 0, (int) (short) 0);
        int int59 = segmentTree50.getSum((int) '#', (int) (byte) 10);
        segmentTree50.update((int) (short) 0, 1);
        segmentTree50.update(10, 10);
        segmentTree50.update((int) (short) 10, 0);
        int[] intArray76 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree77 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray76);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree78 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray76);
        int int82 = segmentTree50.constructTree(intArray76, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree83 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray76);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree84 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray76);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree85 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray76);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree86 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray76);
        int int90 = segmentTree28.constructTree(intArray76, 0, (int) (short) 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree91 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray76);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree92 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray76);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree93 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray76);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree94 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray76);
        int int98 = segmentTree12.constructTree(intArray76, 0, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree99 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 0, intArray76);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
    }

    @Test
    public void test7593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7593");
        int[] intArray8 = new int[] { 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree(0, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100]");
    }

    @Test
    public void test7594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7594");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        segmentTree5.update((-1), (-1));
        segmentTree5.update((int) '4', (int) (byte) 10);
        segmentTree5.update((int) '4', (int) (byte) 1);
        segmentTree5.update((int) (byte) -1, (int) (byte) 10);
        int[] intArray37 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        segmentTree38.update((int) ' ', (int) (byte) 10);
        segmentTree38.update((int) (short) 100, (int) '#');
        segmentTree38.update((int) (byte) 1, (int) (short) -1);
        segmentTree38.update(10, (-1));
        int int53 = segmentTree38.getSum(0, (int) (short) 1);
        segmentTree38.update((int) '4', (int) (byte) 100);
        segmentTree38.update((int) 'a', 0);
        int[] intArray72 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree73 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray72);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree74 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray72);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree75 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray72);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree76 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray72);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree77 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray72);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree78 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray72);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree79 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray72);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree80 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray72);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree81 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray72);
        int int85 = segmentTree38.constructTree(intArray72, (int) (byte) 0, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int89 = segmentTree5.constructTree(intArray72, 1, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 100 + "'", int85 == 100);
    }

    @Test
    public void test7595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7595");
        int[] intArray11 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        int int22 = segmentTree19.getSum((int) (byte) 0, (int) '#');
        segmentTree19.update(52, (int) (short) 100);
        int int28 = segmentTree19.getSum((-1), (int) '4');
        segmentTree19.update((int) ' ', (int) '#');
        int int34 = segmentTree19.getSum(100, 100);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test7596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7596");
        int[] intArray16 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree20 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree21 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree22 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree23 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree24 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree25 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree26 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree27 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree28 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree29 = new com.thealgorithms.datastructures.trees.SegmentTree((-1), intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 52, 100]");
    }

    @Test
    public void test7597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7597");
        int[] intArray7 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray7);
        segmentTree8.update((int) (short) 100, 0);
        int int14 = segmentTree8.getSum((int) (short) 0, (int) (short) 0);
        int int17 = segmentTree8.getSum((int) '#', (int) (byte) 10);
        segmentTree8.update((int) (short) 0, 1);
        segmentTree8.update(10, 10);
        segmentTree8.update((int) (short) 10, 0);
        int[] intArray34 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray34);
        int int40 = segmentTree8.constructTree(intArray34, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray34);
        int int46 = segmentTree43.getSum(10, 52);
        segmentTree43.update((int) '#', (int) (byte) 0);
        segmentTree43.update(100, 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test7598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7598");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) 'a', (int) (short) 0);
        segmentTree5.update(100, 10);
        segmentTree5.update((int) (byte) 10, 0);
        int int20 = segmentTree5.getSum(10, (int) (byte) 1);
        int int23 = segmentTree5.getSum((int) ' ', (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test7599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7599");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((-1), (int) (byte) -1);
        segmentTree5.update(10, (int) ' ');
        segmentTree5.update((int) (short) 10, 100);
        segmentTree5.update(10, (int) (short) 100);
        int int23 = segmentTree5.getSum(0, (int) (byte) -1);
        segmentTree5.update(1, (int) ' ');
        java.lang.Class<?> wildcardClass27 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 32, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7600");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (short) 0, 1);
        segmentTree5.update(10, 10);
        segmentTree5.update((int) (short) 10, 0);
        int[] intArray31 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree32 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray31);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree33 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray31);
        int int37 = segmentTree5.constructTree(intArray31, (int) (short) 0, 0, (int) (byte) 0);
        segmentTree5.update(0, (int) (short) -1);
        int int43 = segmentTree5.getSum((int) (short) -1, (int) (short) 0);
        int int46 = segmentTree5.getSum((int) '#', (int) (byte) 100);
        segmentTree5.update((int) (short) 0, (-1));
        int int52 = segmentTree5.getSum(97, 52);
        int int55 = segmentTree5.getSum(100, 52);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test7601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7601");
        int[] intArray9 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray9);
        segmentTree10.update((int) ' ', (int) (byte) 10);
        segmentTree10.update((int) (short) 100, (int) '#');
        segmentTree10.update((int) (byte) 1, (int) (short) -1);
        int int22 = segmentTree10.getSum((-1), 0);
        int int25 = segmentTree10.getSum((int) 'a', (int) '#');
        int int28 = segmentTree10.getSum((int) '#', 100);
        segmentTree10.update((int) ' ', (int) (short) 1);
        segmentTree10.update((int) (short) 10, (int) '#');
        int int37 = segmentTree10.getSum((int) (short) 10, (int) '#');
        int[] intArray48 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray48);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree50 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray48);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree51 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray48);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree52 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray48);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree53 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray48);
        int int57 = segmentTree10.constructTree(intArray48, 0, 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree58 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray48);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree59 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray48);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree60 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray48);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree61 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray48);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree62 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 0, intArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test7602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7602");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, 1);
        int int26 = segmentTree5.getSum((int) (short) -1, 100);
        segmentTree5.update((int) (byte) 1, (int) ' ');
        int int32 = segmentTree5.getSum((int) (short) 1, 100);
        int int35 = segmentTree5.getSum(52, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 32, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test7603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7603");
        int[] intArray6 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        segmentTree7.update((int) ' ', (int) (byte) 10);
        int int13 = segmentTree7.getSum(0, (int) (short) 1);
        segmentTree7.update((int) (byte) 100, 0);
        int int19 = segmentTree7.getSum((int) (byte) 0, 0);
        int int22 = segmentTree7.getSum(100, (int) 'a');
        int int25 = segmentTree7.getSum(0, (int) (short) -1);
        int int28 = segmentTree7.getSum(1, (int) (short) 10);
        int int31 = segmentTree7.getSum((-1), (int) (short) 100);
        int[] intArray41 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray41);
        segmentTree42.update((int) (short) 100, 0);
        int int48 = segmentTree42.getSum((int) (short) 0, (int) (short) 0);
        int int51 = segmentTree42.getSum((int) '#', (int) (byte) 10);
        segmentTree42.update((int) (short) 0, 1);
        segmentTree42.update(10, 10);
        segmentTree42.update((int) (short) 10, 0);
        int[] intArray68 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree69 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray68);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree70 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray68);
        int int74 = segmentTree42.constructTree(intArray68, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree75 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray68);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree76 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray68);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree77 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray68);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree78 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray68);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree79 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray68);
        int int83 = segmentTree7.constructTree(intArray68, 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree84 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray68);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree85 = new com.thealgorithms.datastructures.trees.SegmentTree(10, intArray68);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test7604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7604");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum((int) '#', (int) (byte) 100);
        int int20 = segmentTree5.getSum((int) (short) 100, (int) (byte) 1);
        int[] intArray21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = segmentTree5.constructTree(intArray21, 35, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test7605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7605");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        segmentTree5.update((int) (byte) 0, (int) 'a');
        segmentTree5.update((int) 'a', (int) (short) -1);
        int int23 = segmentTree5.getSum((int) (byte) 100, 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test7606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7606");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        segmentTree5.update((-1), (-1));
        segmentTree5.update((int) '4', (int) (byte) 10);
        segmentTree5.update((int) ' ', (int) (short) 0);
        segmentTree5.update((int) (short) 100, (int) ' ');
        int int35 = segmentTree5.getSum((int) ' ', (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test7607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7607");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        int int14 = segmentTree5.getSum((int) (byte) -1, (int) 'a');
        segmentTree5.update((int) (byte) 100, (int) 'a');
        int int20 = segmentTree5.getSum((int) (short) 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7608");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (short) 0, 1);
        segmentTree5.update(10, 10);
        int int23 = segmentTree5.getSum((int) ' ', 10);
        segmentTree5.update((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (byte) 0, 1);
        segmentTree5.update(10, (int) (short) 10);
        segmentTree5.update((int) (byte) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass36 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test7609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7609");
        int[] intArray11 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        segmentTree12.update((int) ' ', (int) (byte) 10);
        segmentTree12.update((int) (short) 100, (int) '#');
        segmentTree12.update((int) (byte) 1, (int) (short) -1);
        int int24 = segmentTree12.getSum((-1), 0);
        int int27 = segmentTree12.getSum((int) 'a', (int) '#');
        int int30 = segmentTree12.getSum((int) '#', 100);
        segmentTree12.update((int) ' ', (int) (short) 1);
        segmentTree12.update((int) (short) 10, (int) '#');
        int int39 = segmentTree12.getSum((int) (short) 10, (int) '#');
        int[] intArray50 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree51 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray50);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree52 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray50);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree53 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray50);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree54 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray50);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree55 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray50);
        int int59 = segmentTree12.constructTree(intArray50, 0, 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree60 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray50);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree61 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray50);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree62 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray50);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree63 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray50);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree64 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray50);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree65 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray50);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree66 = new com.thealgorithms.datastructures.trees.SegmentTree((int) ' ', intArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test7610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7610");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        int int17 = segmentTree5.getSum((-1), 0);
        int int20 = segmentTree5.getSum((int) 'a', (int) '#');
        int int23 = segmentTree5.getSum((int) '#', 100);
        int int26 = segmentTree5.getSum(100, (int) (byte) 10);
        segmentTree5.update((int) ' ', 0);
        segmentTree5.update((int) (short) 10, (int) (short) 10);
        int[] intArray41 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray41);
        segmentTree42.update((int) ' ', (int) (byte) 10);
        segmentTree42.update((int) (short) 100, (int) '#');
        segmentTree42.update((int) (byte) 1, (int) (short) -1);
        int int54 = segmentTree42.getSum((-1), 0);
        int int57 = segmentTree42.getSum((int) 'a', (int) '#');
        int int60 = segmentTree42.getSum((int) '#', 100);
        segmentTree42.update((int) ' ', (int) (short) 1);
        segmentTree42.update((int) (short) 10, (int) '#');
        int int69 = segmentTree42.getSum((int) (short) 10, (int) '#');
        int[] intArray80 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree81 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray80);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree82 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray80);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree83 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray80);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree84 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray80);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree85 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray80);
        int int89 = segmentTree42.constructTree(intArray80, 0, 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree90 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray80);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree91 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray80);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree92 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray80);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree93 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray80);
        // The following exception was thrown during execution in test generation
        try {
            int int97 = segmentTree5.constructTree(intArray80, (-1), (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
    }

    @Test
    public void test7611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7611");
        int[] intArray8 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        segmentTree9.update((int) (short) 100, 0);
        int int15 = segmentTree9.getSum((int) (short) 0, (int) (short) 0);
        int int18 = segmentTree9.getSum((int) '#', (int) (byte) 10);
        segmentTree9.update((int) (short) 0, 1);
        segmentTree9.update(10, 10);
        segmentTree9.update((int) (short) 10, 0);
        int[] intArray35 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray35);
        int int41 = segmentTree9.constructTree(intArray35, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray35);
        int int48 = segmentTree45.getSum((int) '#', (int) (short) 10);
        segmentTree45.update((int) (short) 10, (int) (short) 0);
        segmentTree45.update((int) 'a', 0);
        java.lang.Class<?> wildcardClass55 = segmentTree45.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test7612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7612");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (short) 0, 1);
        segmentTree5.update((int) '#', (int) (byte) 0);
        int int23 = segmentTree5.getSum((int) (byte) 0, 1);
        int int26 = segmentTree5.getSum(0, (int) (short) -1);
        int int29 = segmentTree5.getSum(10, (int) (short) 0);
        int int32 = segmentTree5.getSum((int) 'a', (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7613");
        int[] intArray16 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree20 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree21 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree22 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree23 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree24 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree25 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree26 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree27 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree28 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree29 = new com.thealgorithms.datastructures.trees.SegmentTree((int) ' ', intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 52, 100]");
    }

    @Test
    public void test7614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7614");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        segmentTree5.update(100, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (byte) -1, (int) (short) 0);
        int int23 = segmentTree5.getSum((int) 'a', (int) ' ');
        int int26 = segmentTree5.getSum((int) '4', (int) '#');
        int int29 = segmentTree5.getSum((int) (byte) -1, 10);
        segmentTree5.update((int) (short) 1, (int) ' ');
        int int35 = segmentTree5.getSum((int) (short) 1, (int) (short) 0);
        int[] intArray37 = new int[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            int int41 = segmentTree5.constructTree(intArray37, (int) (byte) 0, 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 32, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[97]");
    }

    @Test
    public void test7615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7615");
        int[] intArray8 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        segmentTree9.update((int) ' ', (int) (byte) 10);
        segmentTree9.update((int) (short) 100, (int) '#');
        segmentTree9.update((int) (byte) 1, (int) (short) -1);
        int int21 = segmentTree9.getSum((-1), 0);
        int int24 = segmentTree9.getSum((int) 'a', (int) '#');
        int int27 = segmentTree9.getSum((int) '#', 100);
        segmentTree9.update((int) ' ', (int) (short) 1);
        segmentTree9.update((int) (short) 10, (int) '#');
        int int36 = segmentTree9.getSum((int) (short) 10, (int) '#');
        int[] intArray47 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree48 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray47);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray47);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree50 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray47);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree51 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray47);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree52 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray47);
        int int56 = segmentTree9.constructTree(intArray47, 0, 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree57 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray47);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree58 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray47);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree59 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray47);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree60 = new com.thealgorithms.datastructures.trees.SegmentTree(97, intArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test7616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7616");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        int int14 = segmentTree5.getSum((int) (short) 0, (int) (short) -1);
        int int17 = segmentTree5.getSum(10, (int) (short) 0);
        int int20 = segmentTree5.getSum((int) ' ', (int) (byte) 1);
        int int23 = segmentTree5.getSum((int) ' ', (int) (short) -1);
        java.lang.Class<?> wildcardClass24 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test7617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7617");
        int[] intArray6 = new int[] { 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        segmentTree11.update(100, (int) 'a');
        segmentTree11.update((int) '4', 100);
        java.lang.Class<?> wildcardClass18 = segmentTree11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7618");
        int[] intArray6 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        segmentTree7.update((int) (short) 100, 0);
        segmentTree7.update((int) 'a', (int) (short) 0);
        segmentTree7.update(100, 10);
        segmentTree7.update((int) (byte) 10, 0);
        segmentTree7.update(10, (int) (byte) 10);
        int[] intArray34 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray34);
        int int44 = segmentTree7.constructTree(intArray34, 0, (int) (short) 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 10, intArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 52, 100]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test7619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7619");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        int int17 = segmentTree5.getSum((-1), 0);
        int int20 = segmentTree5.getSum((int) 'a', (int) '#');
        int int23 = segmentTree5.getSum((int) '#', 100);
        int int26 = segmentTree5.getSum(100, (int) (byte) 10);
        segmentTree5.update((int) ' ', 0);
        segmentTree5.update((int) (short) 10, (int) (short) 10);
        segmentTree5.update((int) (short) -1, (int) ' ');
        int int38 = segmentTree5.getSum(52, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7620");
        int[] intArray5 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree6 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray5);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray5);
        int int10 = segmentTree7.getSum((int) (byte) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass11 = segmentTree7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7621");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((-1), (int) (byte) -1);
        segmentTree5.update(10, (int) ' ');
        segmentTree5.update((int) (short) 10, 100);
        segmentTree5.update(10, (int) (short) 100);
        int int23 = segmentTree5.getSum(0, (int) (byte) -1);
        segmentTree5.update(52, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test7622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7622");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) (short) -1, (int) (short) 100);
        segmentTree5.update((int) (byte) 1, 100);
        segmentTree5.update((int) (byte) -1, (int) ' ');
        segmentTree5.update((int) (short) -1, 32);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 100]");
    }

    @Test
    public void test7623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7623");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) 'a', (int) (short) 0);
        segmentTree5.update(100, 10);
        int int17 = segmentTree5.getSum((int) '4', (int) (byte) 100);
        segmentTree5.update((int) (short) 0, (int) 'a');
        int int23 = segmentTree5.getSum((int) (short) 10, (int) 'a');
        int int26 = segmentTree5.getSum(10, (int) '4');
        int int29 = segmentTree5.getSum((-1), (int) (byte) 10);
        int int32 = segmentTree5.getSum(0, (int) (byte) 1);
        int int35 = segmentTree5.getSum((int) 'a', (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 52, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test7624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7624");
        int[] intArray8 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        int int14 = segmentTree11.getSum((int) 'a', (int) (short) 0);
        segmentTree11.update((int) (short) 0, 10);
        int int20 = segmentTree11.getSum((-1), (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test7625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7625");
        int[] intArray7 = new int[] { 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray7);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray7);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray7);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray7);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree(97, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
    }

    @Test
    public void test7626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7626");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (byte) -1, (int) '#');
        segmentTree5.update(1, (int) (byte) 1);
        segmentTree5.update(0, (int) (byte) 100);
        int int26 = segmentTree5.getSum(0, (int) (byte) 10);
        int int29 = segmentTree5.getSum((int) (short) 10, 1);
        int int32 = segmentTree5.getSum((int) 'a', (int) 'a');
        int int35 = segmentTree5.getSum((int) (short) 100, (int) (byte) 100);
        int[] intArray42 = new int[] { 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray42);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray42);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray42);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray42);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray42);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = segmentTree5.constructTree(intArray42, (int) (byte) 100, 35, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100]");
    }

    @Test
    public void test7627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7627");
        int[] intArray12 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        segmentTree13.update((int) ' ', (int) (byte) 10);
        segmentTree13.update((int) (short) 100, (int) '#');
        segmentTree13.update((int) (byte) 1, (int) (short) -1);
        int int25 = segmentTree13.getSum((-1), 0);
        int int28 = segmentTree13.getSum((int) 'a', (int) '#');
        int int31 = segmentTree13.getSum((int) '#', 100);
        segmentTree13.update((int) ' ', (int) (short) 1);
        segmentTree13.update((int) (short) 10, (int) '#');
        int int40 = segmentTree13.getSum((int) (short) 10, (int) '#');
        int[] intArray51 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree52 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray51);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree53 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray51);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree54 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray51);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree55 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray51);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree56 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray51);
        int int60 = segmentTree13.constructTree(intArray51, 0, 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree61 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray51);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree62 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray51);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree63 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray51);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree64 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray51);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree65 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray51);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree66 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray51);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree67 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray51);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree68 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 100, intArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test7628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7628");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        segmentTree5.update((-1), (-1));
        int int26 = segmentTree5.getSum(100, (int) (short) 0);
        int int29 = segmentTree5.getSum((int) ' ', (int) (short) -1);
        segmentTree5.update((int) (byte) 1, (int) 'a');
        int int35 = segmentTree5.getSum((int) '4', (int) '#');
        segmentTree5.update(52, (int) ' ');
        segmentTree5.update((int) '4', 97);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 97, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test7629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7629");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (byte) 1, 0);
        int int11 = segmentTree5.getSum((int) (byte) 0, (int) ' ');
        int int14 = segmentTree5.getSum((int) (byte) 10, (int) (byte) 1);
        int int17 = segmentTree5.getSum((-1), (int) (short) 1);
        int int20 = segmentTree5.getSum((int) (short) 0, (int) '#');
        int[] intArray29 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree30 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray29);
        segmentTree30.update((int) (short) 100, 0);
        int int36 = segmentTree30.getSum((int) (short) 0, (int) (short) 0);
        int int39 = segmentTree30.getSum((int) '#', (int) (byte) 10);
        segmentTree30.update((int) (short) 0, 1);
        segmentTree30.update(10, 10);
        segmentTree30.update((int) (short) 10, 0);
        int[] intArray56 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree57 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray56);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree58 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray56);
        int int62 = segmentTree30.constructTree(intArray56, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree63 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray56);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree64 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray56);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree65 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray56);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree66 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray56);
        // The following exception was thrown during execution in test generation
        try {
            int int70 = segmentTree5.constructTree(intArray56, 10, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 0, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
    }

    @Test
    public void test7630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7630");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, 1);
        int int26 = segmentTree5.getSum((int) (short) -1, 100);
        segmentTree5.update((int) (byte) 1, (int) ' ');
        segmentTree5.update((int) 'a', (int) '#');
        int int35 = segmentTree5.getSum((int) (short) 1, 10);
        segmentTree5.update(10, 52);
        int[] intArray51 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree52 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray51);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree53 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray51);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree54 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray51);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree55 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray51);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree56 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray51);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree57 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray51);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree58 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray51);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree59 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray51);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree60 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray51);
        // The following exception was thrown during execution in test generation
        try {
            int int64 = segmentTree5.constructTree(intArray51, 0, 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 32, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[100, 52, 100]");
    }

    @Test
    public void test7631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7631");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (short) 10, 0);
        segmentTree5.update(0, (int) (byte) 0);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) '4');
        segmentTree5.update((int) (byte) -1, 0);
        segmentTree5.update((int) (byte) 0, (int) '4');
        int int26 = segmentTree5.getSum((int) (short) 10, (int) (short) 100);
        int int29 = segmentTree5.getSum((int) (short) 10, 32);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7632");
        int[] intArray9 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 0, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7633");
        int[] intArray6 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        segmentTree7.update((int) ' ', (int) (byte) 10);
        int int13 = segmentTree7.getSum((int) (short) 10, 0);
        int int16 = segmentTree7.getSum((int) (short) -1, 1);
        int int19 = segmentTree7.getSum((int) (short) 1, 10);
        segmentTree7.update((int) (byte) 1, (int) (byte) 1);
        int[] intArray31 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree32 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray31);
        segmentTree32.update((int) (short) 100, 0);
        int int38 = segmentTree32.getSum((int) (short) 0, (int) (short) 0);
        int int41 = segmentTree32.getSum((int) '#', (int) (byte) 10);
        segmentTree32.update((int) (short) 0, 1);
        segmentTree32.update(10, 10);
        segmentTree32.update((int) (short) 10, 0);
        int[] intArray58 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree59 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray58);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree60 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray58);
        int int64 = segmentTree32.constructTree(intArray58, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree65 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray58);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree66 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray58);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree67 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray58);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree68 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray58);
        int int72 = segmentTree7.constructTree(intArray58, (int) (short) 0, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree73 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray58);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree74 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray58);
        java.lang.Class<?> wildcardClass75 = segmentTree74.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, 100]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test7634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7634");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        segmentTree5.update(100, (-1));
        int int17 = segmentTree5.getSum((int) (short) -1, 10);
        segmentTree5.update(0, (int) (byte) -1);
        segmentTree5.update(35, 32);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test7635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7635");
        int[] intArray12 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree20 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree21 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) -1, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 52, 100]");
    }

    @Test
    public void test7636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7636");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum(100, (int) 'a');
        int int20 = segmentTree5.getSum((int) (short) 100, (int) (byte) 100);
        int int23 = segmentTree5.getSum((int) (byte) 0, (int) (short) 1);
        int int26 = segmentTree5.getSum((int) ' ', (int) (byte) 0);
        int int29 = segmentTree5.getSum(0, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test7637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7637");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        segmentTree5.update(100, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (byte) -1, (int) (short) 0);
        int int23 = segmentTree5.getSum((int) 'a', (int) ' ');
        int int26 = segmentTree5.getSum((int) '4', (int) '#');
        int int29 = segmentTree5.getSum((int) (byte) -1, 10);
        segmentTree5.update((int) (short) 1, (int) ' ');
        segmentTree5.update(1, (int) (short) 10);
        int int38 = segmentTree5.getSum(32, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7638");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (byte) 1, 0);
        segmentTree5.update(100, (int) (byte) 10);
        segmentTree5.update(32, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 0, 100]");
    }

    @Test
    public void test7639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7639");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        segmentTree5.update((int) (short) 1, (int) (short) -1);
        segmentTree5.update(0, 0);
        segmentTree5.update((int) (byte) -1, (int) 'a');
        segmentTree5.update(0, 100);
        segmentTree5.update((int) '#', (int) '#');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test7640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7640");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (short) 10, 0);
        segmentTree5.update(0, (int) (byte) 0);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) '4');
        segmentTree5.update((int) (byte) -1, 0);
        segmentTree5.update((int) ' ', 0);
        int[] intArray34 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        segmentTree35.update((int) (short) 100, 0);
        int int41 = segmentTree35.getSum((int) (short) 0, (int) (short) 0);
        int int44 = segmentTree35.getSum((int) '#', (int) (byte) 10);
        segmentTree35.update((int) (short) 0, 1);
        segmentTree35.update(10, 10);
        segmentTree35.update((int) (short) 10, 0);
        int[] intArray61 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree62 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree63 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray61);
        int int67 = segmentTree35.constructTree(intArray61, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree68 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree69 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree70 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree71 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree72 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree73 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        // The following exception was thrown during execution in test generation
        try {
            int int77 = segmentTree5.constructTree(intArray61, 97, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test7641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7641");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update(100, 100);
        int int17 = segmentTree5.getSum((int) '#', (int) (short) 10);
        segmentTree5.update((-1), (int) (byte) 10);
        segmentTree5.update((int) (byte) 0, (int) (short) 1);
        int int26 = segmentTree5.getSum((int) (short) -1, (int) (short) -1);
        int[] intArray32 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree33 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray32);
        segmentTree33.update((int) ' ', (int) (byte) 10);
        segmentTree33.update((int) (short) 100, (int) '#');
        segmentTree33.update((int) (byte) 1, (int) (short) -1);
        segmentTree33.update(100, (int) (byte) -1);
        int int48 = segmentTree33.getSum((int) (byte) -1, (int) (short) 0);
        int int51 = segmentTree33.getSum(0, (int) (byte) -1);
        int int54 = segmentTree33.getSum((int) 'a', (int) (short) -1);
        int int57 = segmentTree33.getSum((int) (short) -1, (int) (short) 1);
        int[] intArray66 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree67 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree68 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree69 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray66);
        int int73 = segmentTree33.constructTree(intArray66, 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree74 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray66);
        // The following exception was thrown during execution in test generation
        try {
            int int78 = segmentTree5.constructTree(intArray66, (int) (short) 1, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
    }

    @Test
    public void test7642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7642");
        int[] intArray11 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree(35, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7643");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        segmentTree5.update((-1), (-1));
        int int26 = segmentTree5.getSum(100, (int) (short) 0);
        int int29 = segmentTree5.getSum((int) ' ', (int) (short) -1);
        segmentTree5.update((int) (byte) 1, (int) 'a');
        int int35 = segmentTree5.getSum((int) '4', (int) '#');
        segmentTree5.update((int) (short) 1, 52);
        int int41 = segmentTree5.getSum((-1), (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test7644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7644");
        int[] intArray6 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        segmentTree7.update((int) (short) 100, 0);
        int int13 = segmentTree7.getSum((int) (short) 0, (int) (short) 0);
        int int16 = segmentTree7.getSum((int) '#', (int) (byte) 10);
        segmentTree7.update((int) (short) 0, 1);
        segmentTree7.update(10, 10);
        segmentTree7.update((int) (short) 10, 0);
        int[] intArray33 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree34 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray33);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray33);
        int int39 = segmentTree7.constructTree(intArray33, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray33);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 100, intArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test7645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7645");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        int int17 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((-1), 10);
        int int23 = segmentTree5.getSum((int) (short) 100, (int) (byte) 10);
        segmentTree5.update(100, 1);
        int int29 = segmentTree5.getSum((int) (short) 100, 1);
        segmentTree5.update(10, (int) (short) -1);
        int int35 = segmentTree5.getSum(1, 10);
        java.lang.Class<?> wildcardClass36 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test7646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7646");
        int[] intArray7 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray7);
        segmentTree8.update((int) ' ', (int) (byte) 10);
        int int14 = segmentTree8.getSum(0, (int) (short) 1);
        segmentTree8.update((int) (byte) 100, 0);
        int int20 = segmentTree8.getSum((int) (byte) 0, 0);
        int int23 = segmentTree8.getSum(100, (int) 'a');
        int int26 = segmentTree8.getSum(0, (int) (short) -1);
        int int29 = segmentTree8.getSum(1, (int) (short) 10);
        int int32 = segmentTree8.getSum((-1), (int) (short) 100);
        int[] intArray42 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray42);
        segmentTree43.update((int) (short) 100, 0);
        int int49 = segmentTree43.getSum((int) (short) 0, (int) (short) 0);
        int int52 = segmentTree43.getSum((int) '#', (int) (byte) 10);
        segmentTree43.update((int) (short) 0, 1);
        segmentTree43.update(10, 10);
        segmentTree43.update((int) (short) 10, 0);
        int[] intArray69 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree70 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray69);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree71 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray69);
        int int75 = segmentTree43.constructTree(intArray69, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree76 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray69);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree77 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray69);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree78 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray69);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree79 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray69);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree80 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray69);
        int int84 = segmentTree8.constructTree(intArray69, 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree85 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray69);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree86 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray69);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree87 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray69);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
    }

    @Test
    public void test7647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7647");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) ' ', (int) (byte) 0);
        segmentTree5.update((int) (short) 0, 1);
        int int20 = segmentTree5.getSum((int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test7648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7648");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update(10, 100);
        int int17 = segmentTree5.getSum((int) (byte) 100, (int) ' ');
        int int20 = segmentTree5.getSum((int) (byte) 1, (int) '4');
        int int23 = segmentTree5.getSum((int) (byte) 1, 100);
        segmentTree5.update((int) '#', (int) (byte) 100);
        int int29 = segmentTree5.getSum(10, 0);
        int int32 = segmentTree5.getSum((int) (byte) 10, (int) (byte) 10);
        int[] intArray42 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray42);
        segmentTree43.update((int) ' ', (int) (byte) 10);
        segmentTree43.update((int) (short) 100, (int) '#');
        segmentTree43.update((int) (byte) 1, (int) (short) -1);
        int int55 = segmentTree43.getSum((-1), 0);
        int int58 = segmentTree43.getSum((int) 'a', (int) '#');
        int int61 = segmentTree43.getSum((int) '#', 100);
        segmentTree43.update((int) ' ', (int) (short) 1);
        segmentTree43.update((int) (short) 10, (int) '#');
        int int70 = segmentTree43.getSum((int) (short) 10, (int) '#');
        int[] intArray81 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree82 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray81);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree83 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray81);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree84 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray81);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree85 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray81);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree86 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray81);
        int int90 = segmentTree43.constructTree(intArray81, 0, 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree91 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray81);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree92 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray81);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree93 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray81);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree94 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray81);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree95 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray81);
        // The following exception was thrown during execution in test generation
        try {
            int int99 = segmentTree5.constructTree(intArray81, (-1), 52, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
    }

    @Test
    public void test7649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7649");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        segmentTree5.update(100, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (byte) -1, (int) (short) 0);
        int int23 = segmentTree5.getSum(0, (int) (byte) -1);
        int int26 = segmentTree5.getSum((-1), (int) 'a');
        segmentTree5.update((int) (short) 10, 10);
        int int32 = segmentTree5.getSum(0, (int) (short) 0);
        segmentTree5.update(0, 10);
        segmentTree5.update(1, 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test7650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7650");
        int[] intArray13 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree20 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree21 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray13);
        int[] intArray27 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree28 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray27);
        segmentTree28.update((int) ' ', (int) (byte) 10);
        int int34 = segmentTree28.getSum((int) (short) 10, 0);
        int int37 = segmentTree28.getSum((int) (short) -1, 1);
        int int40 = segmentTree28.getSum((int) (short) 1, 10);
        segmentTree28.update((int) (byte) 1, (int) (byte) 1);
        int[] intArray52 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree53 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray52);
        segmentTree53.update((int) (short) 100, 0);
        int int59 = segmentTree53.getSum((int) (short) 0, (int) (short) 0);
        int int62 = segmentTree53.getSum((int) '#', (int) (byte) 10);
        segmentTree53.update((int) (short) 0, 1);
        segmentTree53.update(10, 10);
        segmentTree53.update((int) (short) 10, 0);
        int[] intArray79 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree80 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray79);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree81 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray79);
        int int85 = segmentTree53.constructTree(intArray79, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree86 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray79);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree87 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray79);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree88 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray79);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree89 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray79);
        int int93 = segmentTree28.constructTree(intArray79, (int) (short) 0, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree94 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray79);
        // The following exception was thrown during execution in test generation
        try {
            int int98 = segmentTree21.constructTree(intArray79, 0, 97, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 100]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test7651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7651");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (short) 0, 1);
        segmentTree5.update((int) (byte) 100, 10);
        segmentTree5.update((int) (byte) 0, 100);
        segmentTree5.update(1, 97);
        java.lang.Class<?> wildcardClass27 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 97, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7652");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update(100, (int) (byte) 100);
        int int20 = segmentTree5.getSum((int) (short) 10, 0);
        segmentTree5.update((int) (byte) 10, 0);
        segmentTree5.update(10, 0);
        int int29 = segmentTree5.getSum(32, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7653");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (short) 10, 0);
        segmentTree5.update(0, (int) (byte) 0);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) '4');
        int int20 = segmentTree5.getSum((int) (byte) 0, (int) (short) 1);
        int int23 = segmentTree5.getSum(52, 32);
        java.lang.Class<?> wildcardClass24 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test7654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7654");
        int[] intArray5 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree6 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray5);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray5);
        segmentTree7.update((int) (short) -1, 1);
        segmentTree7.update((int) (byte) 1, (-1));
        segmentTree7.update((int) '4', (int) 'a');
        segmentTree7.update((int) (byte) 100, (int) (short) -1);
        segmentTree7.update(32, (int) ' ');
        int[] intArray32 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree33 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray32);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree34 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray32);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray32);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray32);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = segmentTree7.constructTree(intArray32, 100, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 100]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7655");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum((int) '#', (int) (byte) 100);
        segmentTree5.update(10, 10);
        segmentTree5.update((int) (byte) 1, 10);
        int int26 = segmentTree5.getSum((int) (byte) 10, (int) (short) 100);
        segmentTree5.update((int) 'a', (int) (short) 100);
        segmentTree5.update(100, (int) 'a');
        segmentTree5.update((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7656");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, (int) '4');
        int int26 = segmentTree5.getSum((int) (byte) 10, (int) 'a');
        int int29 = segmentTree5.getSum((int) (short) -1, (int) (short) 0);
        segmentTree5.update((int) (short) 0, (int) (byte) 0);
        int int35 = segmentTree5.getSum((int) (byte) -1, 0);
        int int38 = segmentTree5.getSum((int) ' ', (int) '4');
        int int41 = segmentTree5.getSum((int) ' ', (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test7657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7657");
        int[] intArray16 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree20 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree21 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree22 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree23 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree24 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree25 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree26 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree27 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray16);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree28 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree29 = new com.thealgorithms.datastructures.trees.SegmentTree(35, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 52, 100]");
    }

    @Test
    public void test7658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7658");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        segmentTree5.update(10, (-1));
        int int20 = segmentTree5.getSum((int) (byte) 1, (int) (short) 100);
        segmentTree5.update((int) (short) 100, 0);
        int int26 = segmentTree5.getSum((int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7659");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (short) 0, 1);
        segmentTree5.update(10, 10);
        int int23 = segmentTree5.getSum((int) ' ', 10);
        segmentTree5.update((int) (byte) 10, (int) (byte) -1);
        int int29 = segmentTree5.getSum(10, (int) ' ');
        int int32 = segmentTree5.getSum(52, (int) (short) -1);
        segmentTree5.update((int) '4', 97);
        segmentTree5.update((int) (byte) 1, (int) (byte) 10);
        int[] intArray43 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray43);
        segmentTree44.update((int) (short) 100, 0);
        int int50 = segmentTree44.getSum((int) (short) 0, (int) (short) 0);
        int int53 = segmentTree44.getSum((int) '#', (int) (byte) 10);
        segmentTree44.update((int) (short) 0, 1);
        segmentTree44.update(10, 10);
        segmentTree44.update((int) (short) 10, 0);
        int[] intArray70 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree71 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray70);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree72 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray70);
        int int76 = segmentTree44.constructTree(intArray70, (int) (short) 0, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int80 = segmentTree5.constructTree(intArray70, (int) 'a', 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
    }

    @Test
    public void test7660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7660");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, 1);
        segmentTree5.update((int) (short) 100, 1);
        segmentTree5.update((int) (short) 0, (int) (short) 1);
        segmentTree5.update((int) (byte) 0, (int) ' ');
        segmentTree5.update((int) (byte) -1, 97);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test7661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7661");
        int[] intArray7 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray7);
        segmentTree8.update((int) (short) 100, 0);
        int int14 = segmentTree8.getSum((int) (short) 0, (int) (short) 0);
        int int17 = segmentTree8.getSum((int) '#', (int) (byte) 10);
        segmentTree8.update((int) (short) 0, 1);
        segmentTree8.update(10, 10);
        segmentTree8.update((int) (short) 10, 0);
        int[] intArray34 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray34);
        int int40 = segmentTree8.constructTree(intArray34, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray34);
        int int46 = segmentTree43.getSum((-1), (int) '4');
        segmentTree43.update((int) (byte) 100, (int) (short) -1);
        int int52 = segmentTree43.getSum((int) (byte) 1, (int) (byte) 10);
        segmentTree43.update(1, (int) '#');
        segmentTree43.update((int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 35, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test7662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7662");
        int[] intArray10 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray10);
        segmentTree11.update((int) (short) 100, 0);
        int int17 = segmentTree11.getSum((int) (short) 0, (int) (short) 0);
        int int20 = segmentTree11.getSum((int) '#', (int) (byte) 10);
        segmentTree11.update((int) (short) 0, 1);
        segmentTree11.update(10, 10);
        segmentTree11.update((int) (short) 10, 0);
        int[] intArray37 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray37);
        int int43 = segmentTree11.constructTree(intArray37, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree48 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray37);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree((int) '#', intArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test7663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7663");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        segmentTree5.update((-1), (-1));
        int int26 = segmentTree5.getSum(100, (int) (short) 0);
        int int29 = segmentTree5.getSum((int) ' ', (int) (short) -1);
        int int32 = segmentTree5.getSum(10, (int) (short) 10);
        segmentTree5.update(100, (int) (byte) 1);
        int int38 = segmentTree5.getSum(32, (int) '#');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7664");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        int int17 = segmentTree5.getSum((int) 'a', (int) '#');
        int[] intArray27 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree28 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray27);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree29 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray27);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree30 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray27);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree31 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray27);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = segmentTree5.constructTree(intArray27, 0, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7665");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        segmentTree5.update(100, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (byte) -1, (int) (short) 0);
        int int23 = segmentTree5.getSum((int) (byte) -1, (int) 'a');
        segmentTree5.update(1, (-1));
        int[] intArray39 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray39);
        segmentTree40.update((int) (short) 100, 0);
        int int46 = segmentTree40.getSum((int) (short) 0, (int) (short) 0);
        int int49 = segmentTree40.getSum((int) '#', (int) (byte) 10);
        segmentTree40.update((int) (short) 0, 1);
        segmentTree40.update(10, 10);
        segmentTree40.update((int) (short) 10, 0);
        int[] intArray66 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree67 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree68 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray66);
        int int72 = segmentTree40.constructTree(intArray66, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree73 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree74 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree75 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree76 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree77 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree78 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree79 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree80 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray66);
        // The following exception was thrown during execution in test generation
        try {
            int int84 = segmentTree5.constructTree(intArray66, 32, 35, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
    }

    @Test
    public void test7666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7666");
        int[] intArray11 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 100, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 52, 100]");
    }

    @Test
    public void test7667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7667");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        int int17 = segmentTree5.getSum((-1), 0);
        int int20 = segmentTree5.getSum((int) 'a', (int) '#');
        segmentTree5.update((int) (short) 100, (int) '4');
        int int26 = segmentTree5.getSum((int) (short) -1, (int) 'a');
        segmentTree5.update((int) (byte) 100, 1);
        int int32 = segmentTree5.getSum((int) (byte) 10, (int) ' ');
        int int35 = segmentTree5.getSum((int) (byte) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass36 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test7668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7668");
        int[] intArray9 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray9);
        segmentTree13.update(100, (int) (short) 10);
        segmentTree13.update((int) (short) 100, (int) (short) 10);
        int int22 = segmentTree13.getSum((int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test7669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7669");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        segmentTree5.update((-1), (-1));
        int int26 = segmentTree5.getSum(100, (int) (short) 0);
        segmentTree5.update(0, (int) (byte) 0);
        segmentTree5.update((int) 'a', 0);
        segmentTree5.update((-1), (int) '4');
        int int38 = segmentTree5.getSum((int) (byte) 1, (int) (short) 1);
        int int41 = segmentTree5.getSum(32, 32);
        int int44 = segmentTree5.getSum((int) (short) -1, (-1));
        segmentTree5.update((int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test7670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7670");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) '#');
        int int11 = segmentTree5.getSum((int) (byte) 0, 100);
        int int14 = segmentTree5.getSum((int) (short) 10, 10);
        int int17 = segmentTree5.getSum(32, 32);
        segmentTree5.update((int) (short) 100, (int) (byte) 1);
        segmentTree5.update((int) '#', 32);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test7671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7671");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) 'a', (int) (short) 0);
        segmentTree5.update(100, 10);
        int int17 = segmentTree5.getSum((int) (short) 10, 0);
        int int20 = segmentTree5.getSum(100, (int) ' ');
        int int23 = segmentTree5.getSum((-1), 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test7672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7672");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        segmentTree5.update((int) (byte) 0, (int) 'a');
        segmentTree5.update(0, 100);
        segmentTree5.update(100, (-1));
        int int26 = segmentTree5.getSum((int) (byte) 1, 100);
        segmentTree5.update((int) (byte) -1, 97);
        int[] intArray38 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray38);
        segmentTree39.update((int) (short) 100, 0);
        int int45 = segmentTree39.getSum((int) (short) 0, (int) (short) 0);
        int int48 = segmentTree39.getSum((int) '#', (int) (byte) 10);
        segmentTree39.update((int) (short) 0, 1);
        segmentTree39.update(10, 10);
        segmentTree39.update((int) (short) 10, 0);
        int[] intArray65 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree66 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray65);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree67 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray65);
        int int71 = segmentTree39.constructTree(intArray65, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree72 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray65);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree73 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray65);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree74 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray65);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree75 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray65);
        // The following exception was thrown during execution in test generation
        try {
            int int79 = segmentTree5.constructTree(intArray65, (int) '#', 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
    }

    @Test
    public void test7673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7673");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum(100, (int) 'a');
        int int20 = segmentTree5.getSum((int) (byte) 10, (int) '4');
        segmentTree5.update((int) (byte) 0, (int) (short) -1);
        segmentTree5.update((int) (byte) 0, (int) (byte) 0);
        int int29 = segmentTree5.getSum(1, 0);
        segmentTree5.update(32, 52);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7674");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, (int) '4');
        int int26 = segmentTree5.getSum((int) (byte) 10, (int) 'a');
        segmentTree5.update(0, 100);
        int[] intArray39 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray39);
        segmentTree40.update((int) (short) 100, 0);
        int int46 = segmentTree40.getSum((int) (short) 0, (int) (short) 0);
        int int49 = segmentTree40.getSum((int) '#', (int) (byte) 10);
        segmentTree40.update((int) (short) 0, 1);
        segmentTree40.update(10, 10);
        segmentTree40.update((int) (short) 10, 0);
        int[] intArray66 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree67 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree68 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray66);
        int int72 = segmentTree40.constructTree(intArray66, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree73 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree74 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree75 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree76 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree77 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray66);
        // The following exception was thrown during execution in test generation
        try {
            int int81 = segmentTree5.constructTree(intArray66, 97, 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
    }

    @Test
    public void test7675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7675");
        int[] intArray12 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree20 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree21 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        segmentTree21.update(52, (int) (byte) 1);
        segmentTree21.update(0, 0);
        segmentTree21.update(52, (int) '4');
        segmentTree21.update((int) (byte) -1, 97);
        int int36 = segmentTree21.getSum((int) (byte) 100, (int) (byte) 100);
        int int39 = segmentTree21.getSum(100, (-1));
        java.lang.Class<?> wildcardClass40 = segmentTree21.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test7676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7676");
        int[] intArray8 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        segmentTree13.update(0, (int) '#');
        int int19 = segmentTree13.getSum((int) (short) 0, (int) (short) 10);
        segmentTree13.update((int) (byte) 10, (int) 'a');
        segmentTree13.update(100, 1);
        int int28 = segmentTree13.getSum((int) (byte) 1, 32);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, 52, 100]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test7677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7677");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        segmentTree5.update((int) (short) 1, (int) (short) -1);
        segmentTree5.update(0, 0);
        segmentTree5.update((int) (byte) -1, (int) 'a');
        int int29 = segmentTree5.getSum((int) (short) 1, (int) '#');
        segmentTree5.update((int) '#', 52);
        java.lang.Class<?> wildcardClass33 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7678");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        segmentTree5.update((-1), (-1));
        int int26 = segmentTree5.getSum(100, (int) (short) 0);
        int int29 = segmentTree5.getSum((int) ' ', (int) (short) -1);
        int int32 = segmentTree5.getSum(10, (int) (short) 10);
        int int35 = segmentTree5.getSum((int) (short) -1, (int) 'a');
        int int38 = segmentTree5.getSum((int) (byte) 1, 10);
        segmentTree5.update(10, (int) (short) 10);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int47 = segmentTree5.getSum(0, (int) (short) 0);
        segmentTree5.update((int) (byte) 1, (int) '4');
        int int53 = segmentTree5.getSum((int) (short) 0, 10);
        segmentTree5.update((-1), (int) (short) 0);
        segmentTree5.update(0, 0);
        int int62 = segmentTree5.getSum(52, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test7679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7679");
        int[] intArray6 = new int[] { 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        segmentTree11.update((int) (short) 100, 0);
        java.lang.Class<?> wildcardClass15 = segmentTree11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7680");
        int[] intArray5 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree6 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray5);
        segmentTree6.update((int) ' ', (int) (byte) 10);
        int int12 = segmentTree6.getSum((int) (byte) 10, (int) (byte) -1);
        int int15 = segmentTree6.getSum((int) (byte) -1, (int) 'a');
        segmentTree6.update((int) (short) 100, 100);
        int[] intArray27 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree28 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray27);
        segmentTree28.update((int) (short) 100, 0);
        int int34 = segmentTree28.getSum((int) (short) 0, (int) (short) 0);
        int int37 = segmentTree28.getSum((int) '#', (int) (byte) 10);
        segmentTree28.update((int) (short) 0, 1);
        segmentTree28.update(10, 10);
        segmentTree28.update((int) (short) 10, 0);
        int[] intArray54 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree55 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree56 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray54);
        int int60 = segmentTree28.constructTree(intArray54, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree61 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree62 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree63 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree64 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray54);
        int int68 = segmentTree6.constructTree(intArray54, 0, (int) (short) 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree69 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray54);
        int int72 = segmentTree69.getSum((int) (byte) 100, (int) '#');
        int int75 = segmentTree69.getSum((int) '#', (int) ' ');
        segmentTree69.update((int) (short) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass79 = segmentTree69.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1, 100, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test7681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7681");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        segmentTree5.update(10, (-1));
        segmentTree5.update(0, (int) (byte) -1);
        int int23 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 10, (int) (byte) -1);
        int int29 = segmentTree5.getSum(52, (int) ' ');
        int int32 = segmentTree5.getSum((int) (byte) 0, (int) '#');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 100]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7682");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update(100, (int) (byte) 100);
        int int20 = segmentTree5.getSum((int) (short) 10, 0);
        segmentTree5.update((int) ' ', (int) (byte) 1);
        int int26 = segmentTree5.getSum((int) '#', (int) (short) -1);
        int int29 = segmentTree5.getSum(97, 100);
        int int32 = segmentTree5.getSum((int) '4', (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7683");
        int[] intArray5 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree6 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray5);
        segmentTree6.update((int) ' ', (int) (byte) 10);
        int int12 = segmentTree6.getSum(0, (int) (short) 1);
        segmentTree6.update((int) (byte) 100, 0);
        int int18 = segmentTree6.getSum((int) (byte) 0, 0);
        int int21 = segmentTree6.getSum(100, (int) 'a');
        int int24 = segmentTree6.getSum(0, (int) (short) -1);
        int int27 = segmentTree6.getSum(1, (int) (short) 10);
        int int30 = segmentTree6.getSum((-1), (int) (short) 100);
        int[] intArray40 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray40);
        segmentTree41.update((int) (short) 100, 0);
        int int47 = segmentTree41.getSum((int) (short) 0, (int) (short) 0);
        int int50 = segmentTree41.getSum((int) '#', (int) (byte) 10);
        segmentTree41.update((int) (short) 0, 1);
        segmentTree41.update(10, 10);
        segmentTree41.update((int) (short) 10, 0);
        int[] intArray67 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree68 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray67);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree69 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray67);
        int int73 = segmentTree41.constructTree(intArray67, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree74 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray67);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree75 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray67);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree76 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray67);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree77 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray67);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree78 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray67);
        int int82 = segmentTree6.constructTree(intArray67, 0, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree83 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 10, intArray67);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
    }

    @Test
    public void test7684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7684");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update(10, 100);
        int int17 = segmentTree5.getSum((int) (byte) 100, (int) ' ');
        int int20 = segmentTree5.getSum((int) (byte) 1, (int) '4');
        int int23 = segmentTree5.getSum((int) (byte) 1, 100);
        segmentTree5.update((int) '#', (int) (byte) 100);
        int int29 = segmentTree5.getSum(10, 0);
        int int32 = segmentTree5.getSum((int) ' ', (int) (byte) 10);
        segmentTree5.update(100, (int) (byte) 0);
        int int38 = segmentTree5.getSum((int) (byte) 0, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7685");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) 'a', (int) (short) 0);
        int int14 = segmentTree5.getSum((int) (short) 0, (int) (byte) 0);
        int int17 = segmentTree5.getSum(0, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) 10, (int) (byte) 1);
        segmentTree5.update(52, 1);
        segmentTree5.update(0, (int) (byte) 10);
        int[] intArray32 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree33 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray32);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree34 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray32);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = segmentTree5.constructTree(intArray32, (int) (short) 0, 52, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 100]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 52, 100]");
    }

    @Test
    public void test7686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7686");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (byte) -1, (int) '#');
        segmentTree5.update(1, (int) (byte) 1);
        segmentTree5.update(0, (int) (byte) 100);
        int int26 = segmentTree5.getSum(0, (int) (byte) 10);
        int int29 = segmentTree5.getSum((int) (short) 10, 1);
        int int32 = segmentTree5.getSum((int) 'a', (int) 'a');
        int int35 = segmentTree5.getSum((int) (short) 100, (int) (byte) 100);
        int int38 = segmentTree5.getSum((int) '4', (int) (short) 1);
        int int41 = segmentTree5.getSum((int) '4', (int) (byte) 0);
        int[] intArray49 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree50 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray49);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree51 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray49);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree52 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray49);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree53 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray49);
        // The following exception was thrown during execution in test generation
        try {
            int int57 = segmentTree5.constructTree(intArray49, (int) ' ', (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[100, 52, 100]");
    }

    @Test
    public void test7687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7687");
        int[] intArray8 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray8);
        segmentTree13.update((int) (byte) 1, (int) (short) -1);
        segmentTree13.update((int) (short) 10, (int) (short) 10);
        segmentTree13.update((int) '4', 97);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, 100]");
    }

    @Test
    public void test7688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7688");
        int[] intArray11 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        int int22 = segmentTree19.getSum(10, (int) '4');
        java.lang.Class<?> wildcardClass23 = segmentTree19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7689");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        segmentTree5.update((-1), (-1));
        int int26 = segmentTree5.getSum(100, (int) (short) 0);
        int int29 = segmentTree5.getSum((int) ' ', (int) (short) -1);
        int int32 = segmentTree5.getSum(10, (int) (short) 10);
        int int35 = segmentTree5.getSum((int) (short) -1, (int) 'a');
        int int38 = segmentTree5.getSum((int) (byte) 1, 10);
        int int41 = segmentTree5.getSum(10, (int) (byte) 100);
        segmentTree5.update((int) (short) 1, (int) ' ');
        segmentTree5.update((int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 32, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test7690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7690");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (short) 0, 1);
        segmentTree5.update((int) '#', (int) (byte) 0);
        int int23 = segmentTree5.getSum((int) (byte) 0, 1);
        segmentTree5.update((int) (short) 1, (int) '4');
        int int29 = segmentTree5.getSum((int) (short) 1, 100);
        int int32 = segmentTree5.getSum((int) (short) 0, 100);
        int int35 = segmentTree5.getSum((int) (byte) 100, 10);
        segmentTree5.update(0, (int) 'a');
        java.lang.Class<?> wildcardClass39 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test7691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7691");
        int[] intArray7 = new int[] { 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray7);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray7);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray7);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray7);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray7);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray7);
        segmentTree13.update((int) (byte) 100, (int) (byte) 100);
        int[] intArray31 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree32 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray31);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree33 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray31);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree34 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray31);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray31);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray31);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray31);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray31);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray31);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray31);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = segmentTree13.constructTree(intArray31, 32, 35, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7692");
        int[] intArray12 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        segmentTree13.update((int) ' ', (int) (byte) 10);
        int int19 = segmentTree13.getSum((int) (byte) 10, (int) (byte) -1);
        int int22 = segmentTree13.getSum((int) (byte) -1, (int) 'a');
        segmentTree13.update((int) (short) 100, 100);
        int[] intArray34 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        segmentTree35.update((int) (short) 100, 0);
        int int41 = segmentTree35.getSum((int) (short) 0, (int) (short) 0);
        int int44 = segmentTree35.getSum((int) '#', (int) (byte) 10);
        segmentTree35.update((int) (short) 0, 1);
        segmentTree35.update(10, 10);
        segmentTree35.update((int) (short) 10, 0);
        int[] intArray61 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree62 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree63 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray61);
        int int67 = segmentTree35.constructTree(intArray61, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree68 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree69 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree70 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree71 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray61);
        int int75 = segmentTree13.constructTree(intArray61, 0, (int) (short) 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree76 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree77 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree78 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree79 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree80 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree81 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree82 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray61);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree83 = new com.thealgorithms.datastructures.trees.SegmentTree(35, intArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test7693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7693");
        int[] intArray6 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        segmentTree9.update((int) (byte) -1, 1);
        segmentTree9.update(0, (int) (byte) 10);
        int int18 = segmentTree9.getSum((int) (byte) -1, (int) ' ');
        int int21 = segmentTree9.getSum((int) (byte) 10, (int) '4');
        segmentTree9.update(0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test7694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7694");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (short) 100, 0);
        int int20 = segmentTree5.getSum((int) (short) 100, (int) '4');
        int int23 = segmentTree5.getSum(35, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test7695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7695");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (byte) -1, (int) '#');
        segmentTree5.update(1, (int) (byte) 1);
        segmentTree5.update(0, (int) (byte) 100);
        int int26 = segmentTree5.getSum(0, (int) (byte) 10);
        int int29 = segmentTree5.getSum((int) (short) 10, 1);
        int int32 = segmentTree5.getSum((int) 'a', (int) 'a');
        int int35 = segmentTree5.getSum((int) (short) 100, (int) (byte) 100);
        int int38 = segmentTree5.getSum((int) '4', (int) (short) 1);
        segmentTree5.update(0, 100);
        java.lang.Class<?> wildcardClass42 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test7696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7696");
        int[] intArray10 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray10);
        segmentTree11.update((int) ' ', (int) (byte) 10);
        int int17 = segmentTree11.getSum((int) (byte) 10, (int) (byte) -1);
        int int20 = segmentTree11.getSum((int) (byte) -1, (int) 'a');
        segmentTree11.update((int) (short) 100, 100);
        int[] intArray32 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree33 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray32);
        segmentTree33.update((int) (short) 100, 0);
        int int39 = segmentTree33.getSum((int) (short) 0, (int) (short) 0);
        int int42 = segmentTree33.getSum((int) '#', (int) (byte) 10);
        segmentTree33.update((int) (short) 0, 1);
        segmentTree33.update(10, 10);
        segmentTree33.update((int) (short) 10, 0);
        int[] intArray59 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree60 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray59);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree61 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray59);
        int int65 = segmentTree33.constructTree(intArray59, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree66 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray59);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree67 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray59);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree68 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray59);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree69 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray59);
        int int73 = segmentTree11.constructTree(intArray59, 0, (int) (short) 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree74 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray59);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree75 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray59);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree76 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray59);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree77 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray59);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree78 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray59);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree79 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray59);
        java.lang.Class<?> wildcardClass80 = intArray59.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test7697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7697");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (short) 10, 0);
        int int14 = segmentTree5.getSum((int) (short) -1, 1);
        segmentTree5.update(32, 32);
        int[] intArray25 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree26 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray25);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree27 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray25);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree28 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray25);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree29 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray25);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = segmentTree5.constructTree(intArray25, 10, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 52, 100]");
    }

    @Test
    public void test7698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7698");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (byte) -1, (int) '#');
        segmentTree5.update(1, (int) (byte) 1);
        segmentTree5.update(0, (int) (byte) 100);
        int int26 = segmentTree5.getSum(0, (int) (byte) 10);
        int int29 = segmentTree5.getSum((int) (short) 0, (int) (byte) 10);
        int int32 = segmentTree5.getSum((int) (short) 10, (int) (byte) 10);
        int int35 = segmentTree5.getSum((int) '4', (int) 'a');
        int int38 = segmentTree5.getSum(100, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7699");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, (int) '4');
        int int26 = segmentTree5.getSum((int) (byte) 10, (int) 'a');
        int int29 = segmentTree5.getSum((int) (short) -1, (int) (short) 0);
        segmentTree5.update(100, 0);
        int int35 = segmentTree5.getSum((int) (byte) 100, (int) (short) 1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int41 = segmentTree5.getSum(0, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
    }

    @Test
    public void test7700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7700");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        int int17 = segmentTree5.getSum((-1), 0);
        int int20 = segmentTree5.getSum((int) 'a', (int) '#');
        int int23 = segmentTree5.getSum((int) '#', 100);
        int int26 = segmentTree5.getSum(100, (int) (byte) 10);
        int int29 = segmentTree5.getSum((int) ' ', (int) '4');
        int int32 = segmentTree5.getSum((int) (short) 10, (int) (byte) 1);
        int int35 = segmentTree5.getSum((int) 'a', (int) (byte) 100);
        int int38 = segmentTree5.getSum((int) (byte) 0, (int) (byte) 100);
        segmentTree5.update((int) (byte) 10, (-1));
        int int44 = segmentTree5.getSum((int) (byte) 10, (int) (short) 100);
        segmentTree5.update((int) ' ', (int) (byte) 1);
        segmentTree5.update((int) (short) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass51 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test7701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7701");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (short) 10, 0);
        int int14 = segmentTree5.getSum((int) (short) -1, 1);
        int int17 = segmentTree5.getSum((int) (short) 1, 10);
        segmentTree5.update((-1), (int) (short) -1);
        segmentTree5.update((int) '4', 0);
        segmentTree5.update((int) '4', (int) (short) 10);
        int int29 = segmentTree5.getSum(0, (int) (short) 0);
        segmentTree5.update((int) (short) -1, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test7702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7702");
        int[] intArray7 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray7);
        segmentTree8.update((int) (short) 100, 0);
        int int14 = segmentTree8.getSum((int) (short) 0, (int) (short) 0);
        int int17 = segmentTree8.getSum((int) '#', (int) (byte) 10);
        segmentTree8.update((int) (short) 0, 1);
        segmentTree8.update(10, 10);
        segmentTree8.update((int) (short) 10, 0);
        int[] intArray34 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray34);
        int int40 = segmentTree8.constructTree(intArray34, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 10, intArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test7703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7703");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        int int14 = segmentTree5.getSum((int) (short) 0, (int) (short) -1);
        segmentTree5.update((int) 'a', (int) 'a');
        segmentTree5.update((int) (byte) 0, (int) (byte) 1);
        int int23 = segmentTree5.getSum((int) (short) -1, 10);
        segmentTree5.update((int) ' ', 10);
        segmentTree5.update(1, (int) 'a');
        segmentTree5.update((int) (byte) 100, 32);
        java.lang.Class<?> wildcardClass33 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7704");
        int[] intArray9 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray9);
        segmentTree13.update((int) (byte) 0, 10);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, -1, 1, 0]");
    }

    @Test
    public void test7705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7705");
        int[] intArray11 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree(97, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7706");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum(100, (int) 'a');
        int int20 = segmentTree5.getSum(1, (int) (short) 0);
        segmentTree5.update(100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test7707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7707");
        int[] intArray7 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray7);
        segmentTree8.update((int) (short) 100, 0);
        int int14 = segmentTree8.getSum((int) (short) 0, (int) (short) 0);
        int int17 = segmentTree8.getSum((int) '#', (int) (byte) 10);
        segmentTree8.update((int) (short) 0, 1);
        segmentTree8.update(10, 10);
        segmentTree8.update((int) (short) 10, 0);
        int[] intArray34 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray34);
        int int40 = segmentTree8.constructTree(intArray34, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree(100, intArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test7708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7708");
        int[] intArray13 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree20 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree21 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree22 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree23 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray13);
        java.lang.Class<?> wildcardClass24 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 52, 100]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test7709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7709");
        int[] intArray7 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray7);
        segmentTree8.update((int) (short) 100, 0);
        int int14 = segmentTree8.getSum((int) (short) 0, (int) (short) 0);
        int int17 = segmentTree8.getSum((int) '#', (int) (byte) 10);
        segmentTree8.update((int) (short) 0, 1);
        segmentTree8.update(10, 10);
        segmentTree8.update((int) (short) 10, 0);
        int[] intArray34 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray34);
        int int40 = segmentTree8.constructTree(intArray34, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        int int46 = segmentTree43.getSum((int) ' ', (int) (short) 100);
        segmentTree43.update((int) (byte) 100, (int) '#');
        int[] intArray63 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree64 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray63);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree65 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray63);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree66 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray63);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree67 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray63);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree68 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray63);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree69 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray63);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree70 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray63);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree71 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray63);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree72 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray63);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree73 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray63);
        // The following exception was thrown during execution in test generation
        try {
            int int77 = segmentTree43.constructTree(intArray63, (int) (short) 100, (int) (short) 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[100, 52, 100]");
    }

    @Test
    public void test7710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7710");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum(100, (int) 'a');
        int int20 = segmentTree5.getSum(1, (int) (short) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, (int) (byte) 0);
        segmentTree5.update(10, (int) (byte) -1);
        int int29 = segmentTree5.getSum((int) (short) 100, (int) (short) -1);
        segmentTree5.update(100, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass36 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test7711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7711");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        segmentTree5.update(100, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (byte) -1, (int) (short) 0);
        int int23 = segmentTree5.getSum(0, (int) (byte) -1);
        int int26 = segmentTree5.getSum((-1), (int) 'a');
        segmentTree5.update((int) 'a', 52);
        int int32 = segmentTree5.getSum((int) (short) 1, (int) (short) 0);
        segmentTree5.update((int) (byte) 0, (int) '4');
        int int38 = segmentTree5.getSum((-1), (int) ' ');
        segmentTree5.update((int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, -1, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7712");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) 'a', (int) (short) 0);
        segmentTree5.update(100, 10);
        segmentTree5.update((int) (byte) 10, 0);
        segmentTree5.update(10, (int) (byte) 10);
        segmentTree5.update((int) (short) 10, (int) (short) -1);
        int int26 = segmentTree5.getSum((int) '4', 10);
        int int29 = segmentTree5.getSum((int) (byte) 10, (int) (short) 0);
        int int32 = segmentTree5.getSum((int) (byte) 1, 52);
        segmentTree5.update(100, (int) '#');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7713");
        int[] intArray7 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray7);
        segmentTree8.update((int) ' ', (int) (byte) 10);
        int int14 = segmentTree8.getSum(0, (int) (short) 1);
        segmentTree8.update((int) (byte) 100, 0);
        int int20 = segmentTree8.getSum((int) (byte) 0, 0);
        int int23 = segmentTree8.getSum(100, (int) 'a');
        int int26 = segmentTree8.getSum(0, (int) (short) -1);
        int int29 = segmentTree8.getSum(1, (int) (short) 10);
        int int32 = segmentTree8.getSum((-1), (int) (short) 100);
        int[] intArray42 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray42);
        segmentTree43.update((int) (short) 100, 0);
        int int49 = segmentTree43.getSum((int) (short) 0, (int) (short) 0);
        int int52 = segmentTree43.getSum((int) '#', (int) (byte) 10);
        segmentTree43.update((int) (short) 0, 1);
        segmentTree43.update(10, 10);
        segmentTree43.update((int) (short) 10, 0);
        int[] intArray69 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree70 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray69);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree71 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray69);
        int int75 = segmentTree43.constructTree(intArray69, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree76 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray69);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree77 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray69);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree78 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray69);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree79 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray69);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree80 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray69);
        int int84 = segmentTree8.constructTree(intArray69, 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree85 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray69);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree86 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray69);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree87 = new com.thealgorithms.datastructures.trees.SegmentTree(52, intArray69);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
    }

    @Test
    public void test7714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7714");
        int[] intArray7 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray7);
        segmentTree8.update((int) (short) 100, 0);
        int int14 = segmentTree8.getSum((int) (short) 0, (int) (short) 0);
        int int17 = segmentTree8.getSum((int) '#', (int) (byte) 10);
        segmentTree8.update((int) (short) 0, 1);
        segmentTree8.update(10, 10);
        segmentTree8.update((int) (short) 10, 0);
        int[] intArray34 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray34);
        int int40 = segmentTree8.constructTree(intArray34, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray34);
        int int46 = segmentTree43.getSum((-1), (int) '4');
        segmentTree43.update((int) (byte) 100, (int) (short) -1);
        int int52 = segmentTree43.getSum((int) (byte) 1, (int) (byte) 10);
        segmentTree43.update(1, (int) '#');
        int int58 = segmentTree43.getSum((int) '4', 97);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 35, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test7715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7715");
        int[] intArray12 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree20 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree21 = new com.thealgorithms.datastructures.trees.SegmentTree(97, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 52, 100]");
    }

    @Test
    public void test7716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7716");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) (short) -1, (int) (short) 100);
        int int14 = segmentTree5.getSum((int) 'a', (int) '#');
        segmentTree5.update(10, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test7717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7717");
        int[] intArray5 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree6 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray5);
        segmentTree6.update((int) (short) 100, 0);
        int int12 = segmentTree6.getSum((int) (short) 0, (int) (short) 0);
        int int15 = segmentTree6.getSum((int) '#', (int) (byte) 10);
        segmentTree6.update((int) (short) 0, 1);
        segmentTree6.update(10, 10);
        segmentTree6.update((int) (short) 10, 0);
        int[] intArray32 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree33 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray32);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree34 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray32);
        int int38 = segmentTree6.constructTree(intArray32, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray32);
        int int42 = segmentTree39.getSum((int) (byte) -1, (int) (byte) 1);
        int int45 = segmentTree39.getSum((int) (byte) 1, 1);
        int int48 = segmentTree39.getSum((int) (short) 1, (int) (byte) 100);
        int int51 = segmentTree39.getSum((int) (short) 10, 97);
        segmentTree39.update((-1), (int) (byte) 10);
        int int57 = segmentTree39.getSum(0, (int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test7718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7718");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum((int) '#', (int) (byte) 100);
        segmentTree5.update(10, 10);
        segmentTree5.update((int) (byte) 1, 10);
        int int26 = segmentTree5.getSum((int) (short) 0, (int) (byte) 0);
        segmentTree5.update((int) '4', (int) (byte) 100);
        int int32 = segmentTree5.getSum((int) (short) 10, (int) '#');
        int[] intArray37 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        segmentTree38.update((int) ' ', (int) (byte) 10);
        int int44 = segmentTree38.getSum(0, (int) (short) 1);
        segmentTree38.update((int) (byte) 100, 0);
        int int50 = segmentTree38.getSum((int) (byte) 0, 0);
        int int53 = segmentTree38.getSum(100, (int) 'a');
        int int56 = segmentTree38.getSum(0, (int) (short) -1);
        int int59 = segmentTree38.getSum(1, (int) (short) 10);
        int int62 = segmentTree38.getSum((-1), (int) (short) 100);
        int int65 = segmentTree38.getSum((int) (short) -1, (int) (short) 100);
        int[] intArray76 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree77 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray76);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree78 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray76);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree79 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray76);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree80 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray76);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree81 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray76);
        int int85 = segmentTree38.constructTree(intArray76, (int) (short) 0, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int89 = segmentTree5.constructTree(intArray76, (int) (short) -1, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test7719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7719");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        segmentTree5.update((int) (short) 1, (int) (short) -1);
        segmentTree5.update(0, 0);
        segmentTree5.update((-1), 0);
        int int29 = segmentTree5.getSum((int) (byte) 1, 0);
        segmentTree5.update(100, (int) 'a');
        int int35 = segmentTree5.getSum(52, (int) 'a');
        int[] intArray50 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree51 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray50);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree52 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray50);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree53 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray50);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree54 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray50);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree55 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray50);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree56 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray50);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree57 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray50);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree58 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray50);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree59 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray50);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree60 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray50);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree61 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray50);
        // The following exception was thrown during execution in test generation
        try {
            int int65 = segmentTree5.constructTree(intArray50, (int) (byte) 1, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, 52, 100]");
    }

    @Test
    public void test7720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7720");
        int[] intArray6 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        java.lang.Class<?> wildcardClass10 = segmentTree9.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 52, 100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7721");
        int[] intArray6 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        segmentTree7.update((int) (short) 100, 0);
        int int13 = segmentTree7.getSum((int) (short) 0, (int) (short) 0);
        int int16 = segmentTree7.getSum((int) '#', (int) (byte) 10);
        segmentTree7.update((int) (short) 0, 1);
        segmentTree7.update(10, 10);
        segmentTree7.update((int) (short) 10, 0);
        int[] intArray33 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree34 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray33);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray33);
        int int39 = segmentTree7.constructTree(intArray33, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray33);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray33);
        segmentTree41.update(0, (int) (byte) 10);
        int int47 = segmentTree41.getSum((int) '#', (int) (short) -1);
        int int50 = segmentTree41.getSum((int) (byte) 10, (int) (byte) 10);
        segmentTree41.update(0, (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test7722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7722");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (byte) -1, (int) '#');
        segmentTree5.update((int) (byte) -1, 0);
        int int23 = segmentTree5.getSum(10, (int) (short) 100);
        int[] intArray30 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree31 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray30);
        segmentTree31.update((int) (short) 100, 0);
        int int37 = segmentTree31.getSum((int) (short) 0, (int) (short) 0);
        int int40 = segmentTree31.getSum((int) '#', (int) (byte) 10);
        segmentTree31.update((int) (short) 0, 1);
        segmentTree31.update(10, 10);
        segmentTree31.update((int) (short) 10, 0);
        int[] intArray57 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree58 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray57);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree59 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray57);
        int int63 = segmentTree31.constructTree(intArray57, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree64 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray57);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree65 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray57);
        // The following exception was thrown during execution in test generation
        try {
            int int69 = segmentTree5.constructTree(intArray57, (int) (byte) 0, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
    }

    @Test
    public void test7723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7723");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) 'a', (int) (short) 0);
        segmentTree5.update(100, 10);
        int int17 = segmentTree5.getSum((int) '4', (int) (byte) 100);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update(0, 0);
        segmentTree5.update(0, 0);
        segmentTree5.update(35, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test7724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7724");
        int[] intArray8 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        int int14 = segmentTree11.getSum((int) '4', (int) (byte) 0);
        segmentTree11.update((int) (byte) 100, (int) 'a');
        segmentTree11.update(100, (int) '#');
        int int23 = segmentTree11.getSum((int) (short) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass24 = segmentTree11.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test7725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7725");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        int int14 = segmentTree5.getSum((int) (short) 0, (int) (short) -1);
        segmentTree5.update((int) 'a', (int) 'a');
        segmentTree5.update((int) (byte) 0, (int) (byte) 1);
        int int23 = segmentTree5.getSum((int) (short) -1, 10);
        segmentTree5.update((int) ' ', 10);
        segmentTree5.update((int) (short) 1, 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test7726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7726");
        int[] intArray9 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray9);
        segmentTree15.update((int) ' ', 52);
        int int21 = segmentTree15.getSum((int) (short) -1, 0);
        segmentTree15.update((int) (short) 10, (int) '#');
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test7727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7727");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        int int17 = segmentTree5.getSum((int) (byte) 0, 0);
        segmentTree5.update((int) ' ', (int) (short) -1);
        int int23 = segmentTree5.getSum((int) (short) 1, (int) (short) 0);
        segmentTree5.update((int) ' ', (int) (short) 100);
        segmentTree5.update((-1), (int) (byte) -1);
        int int32 = segmentTree5.getSum((int) (byte) 10, (int) (short) -1);
        int int35 = segmentTree5.getSum(35, (-1));
        segmentTree5.update((int) ' ', (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test7728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7728");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (short) 10, 0);
        segmentTree5.update((int) 'a', (int) (byte) 0);
        segmentTree5.update((int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7729");
        int[] intArray11 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        segmentTree12.update((int) (short) 100, 0);
        int int18 = segmentTree12.getSum((int) (short) 0, (int) (short) 0);
        int int21 = segmentTree12.getSum((int) '#', (int) (byte) 10);
        segmentTree12.update((int) (short) 0, 1);
        segmentTree12.update(10, 10);
        segmentTree12.update((int) (short) 10, 0);
        int[] intArray38 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray38);
        int int44 = segmentTree12.constructTree(intArray38, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree48 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree50 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray38);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree51 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) -1, intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test7730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7730");
        int[] intArray6 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        segmentTree7.update((int) (short) 100, 0);
        int int13 = segmentTree7.getSum((int) (short) 0, (int) (short) 0);
        int int16 = segmentTree7.getSum((int) '#', (int) (byte) 10);
        segmentTree7.update((int) (short) 0, 1);
        segmentTree7.update(10, 10);
        segmentTree7.update((int) (short) 10, 0);
        int[] intArray33 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree34 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray33);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray33);
        int int39 = segmentTree7.constructTree(intArray33, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray33);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray33);
        segmentTree41.update(0, (int) (byte) 10);
        int int47 = segmentTree41.getSum((int) '#', (int) (short) -1);
        segmentTree41.update((int) (byte) 1, (int) (short) 0);
        segmentTree41.update((int) (byte) -1, 32);
        segmentTree41.update((int) (byte) 10, (int) (short) 1);
        int int59 = segmentTree41.getSum((int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[10, 0, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
    }

    @Test
    public void test7731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7731");
        int[] intArray12 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree20 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree21 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        segmentTree21.update(52, (int) (byte) 1);
        segmentTree21.update(0, 0);
        segmentTree21.update(52, (int) '4');
        int[] intArray37 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        segmentTree38.update((int) ' ', (int) (byte) 10);
        int int44 = segmentTree38.getSum(0, (int) (short) 1);
        segmentTree38.update((int) (byte) 100, 0);
        int int50 = segmentTree38.getSum((int) (byte) 0, 0);
        int int53 = segmentTree38.getSum(100, (int) 'a');
        int int56 = segmentTree38.getSum(0, (int) (short) -1);
        int int59 = segmentTree38.getSum(1, (int) (short) 10);
        int int62 = segmentTree38.getSum((-1), (int) (short) 100);
        int int65 = segmentTree38.getSum((int) (short) -1, (int) (short) 100);
        int[] intArray76 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree77 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray76);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree78 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray76);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree79 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray76);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree80 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray76);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree81 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray76);
        int int85 = segmentTree38.constructTree(intArray76, (int) (short) 0, (int) (short) 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree86 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray76);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree87 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray76);
        // The following exception was thrown during execution in test generation
        try {
            int int91 = segmentTree21.constructTree(intArray76, (int) (short) 1, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 52, 100]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test7732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7732");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        segmentTree5.update(100, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (byte) -1, (int) (short) 0);
        int int23 = segmentTree5.getSum((int) (byte) -1, (int) 'a');
        int int26 = segmentTree5.getSum((-1), (int) 'a');
        int int29 = segmentTree5.getSum((int) (byte) 100, 0);
        int int32 = segmentTree5.getSum(10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass33 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7733");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        int int14 = segmentTree5.getSum((int) (byte) -1, (int) 'a');
        int int17 = segmentTree5.getSum((int) (byte) 10, (int) (byte) 1);
        int int20 = segmentTree5.getSum(10, (int) 'a');
        segmentTree5.update(52, 97);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test7734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7734");
        int[] intArray7 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray7);
        segmentTree8.update((int) ' ', (int) (byte) 10);
        segmentTree8.update((int) (short) 100, (int) '#');
        segmentTree8.update((int) (byte) 1, (int) (short) -1);
        int int20 = segmentTree8.getSum((-1), 0);
        int int23 = segmentTree8.getSum((int) 'a', (int) '#');
        int int26 = segmentTree8.getSum((int) '#', 100);
        segmentTree8.update((int) ' ', (int) (short) 1);
        segmentTree8.update((int) (short) 10, (int) '#');
        int int35 = segmentTree8.getSum((int) (short) 10, (int) '#');
        int[] intArray46 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree48 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree50 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree51 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray46);
        int int55 = segmentTree8.constructTree(intArray46, 0, 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree56 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree57 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray46);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree58 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 0, intArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test7735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7735");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (short) 10, 0);
        int int14 = segmentTree5.getSum((int) (short) -1, 1);
        int int17 = segmentTree5.getSum((int) (short) 1, 10);
        segmentTree5.update((int) (byte) 1, (int) (byte) 1);
        int int23 = segmentTree5.getSum((int) (byte) 100, (int) (short) 100);
        int int26 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        int int29 = segmentTree5.getSum((int) (short) 10, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7736");
        int[] intArray13 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree20 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree21 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) -1, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7737");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (byte) -1, (int) '#');
        segmentTree5.update(1, (int) (byte) 1);
        segmentTree5.update((int) (byte) 1, 0);
        segmentTree5.update((int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 0, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test7738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7738");
        int[] intArray5 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree6 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray5);
        segmentTree6.update((int) ' ', (int) (byte) 10);
        int int12 = segmentTree6.getSum((int) (byte) 10, (int) (byte) -1);
        int int15 = segmentTree6.getSum((int) (byte) -1, (int) 'a');
        segmentTree6.update((int) (short) 100, 100);
        int[] intArray27 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree28 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray27);
        segmentTree28.update((int) (short) 100, 0);
        int int34 = segmentTree28.getSum((int) (short) 0, (int) (short) 0);
        int int37 = segmentTree28.getSum((int) '#', (int) (byte) 10);
        segmentTree28.update((int) (short) 0, 1);
        segmentTree28.update(10, 10);
        segmentTree28.update((int) (short) 10, 0);
        int[] intArray54 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree55 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree56 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray54);
        int int60 = segmentTree28.constructTree(intArray54, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree61 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree62 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree63 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree64 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray54);
        int int68 = segmentTree6.constructTree(intArray54, 0, (int) (short) 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree69 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray54);
        segmentTree69.update(10, (int) (short) 100);
        segmentTree69.update(10, (int) (short) 100);
        segmentTree69.update(97, (int) (byte) 0);
        int int81 = segmentTree69.getSum((int) (byte) 10, (int) '4');
        segmentTree69.update(10, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test7739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7739");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update(100, 100);
        int int17 = segmentTree5.getSum((int) '#', (int) (short) 10);
        segmentTree5.update((-1), (int) (byte) 10);
        segmentTree5.update((int) (byte) 10, (-1));
        int int26 = segmentTree5.getSum((int) (short) 0, (int) '4');
        int int29 = segmentTree5.getSum((int) (short) 10, 1);
        int[] intArray30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int34 = segmentTree5.constructTree(intArray30, (int) (byte) 100, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7740");
        int[] intArray5 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree6 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray5);
        segmentTree6.update((int) (short) 100, 0);
        int int12 = segmentTree6.getSum((int) (short) 0, (int) (short) 0);
        int int15 = segmentTree6.getSum((int) '#', (int) (byte) 10);
        segmentTree6.update((int) (short) 0, 1);
        segmentTree6.update(10, 10);
        segmentTree6.update((int) (short) 10, 0);
        int[] intArray32 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree33 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray32);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree34 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray32);
        int int38 = segmentTree6.constructTree(intArray32, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray32);
        int int42 = segmentTree39.getSum((int) (byte) -1, (int) (byte) 1);
        int int45 = segmentTree39.getSum((int) (byte) 1, 1);
        int int48 = segmentTree39.getSum((int) (short) 0, 97);
        segmentTree39.update((int) '#', 0);
        java.lang.Class<?> wildcardClass52 = segmentTree39.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test7741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7741");
        int[] intArray8 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        segmentTree9.update((int) (short) 100, 0);
        int int15 = segmentTree9.getSum((int) (short) 0, (int) (short) 0);
        int int18 = segmentTree9.getSum((int) '#', (int) (byte) 10);
        segmentTree9.update((int) (short) 0, 1);
        segmentTree9.update(10, 10);
        segmentTree9.update((int) (short) 10, 0);
        int[] intArray35 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray35);
        int int41 = segmentTree9.constructTree(intArray35, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 100, intArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test7742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7742");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (byte) -1, (int) '#');
        segmentTree5.update(1, (int) (byte) 1);
        segmentTree5.update(0, (int) (byte) 100);
        int int26 = segmentTree5.getSum(0, (int) (byte) 10);
        segmentTree5.update((-1), (int) (short) 100);
        segmentTree5.update((int) '#', 10);
        int int35 = segmentTree5.getSum((int) 'a', 100);
        int int38 = segmentTree5.getSum(32, 1);
        segmentTree5.update((int) (byte) -1, (int) '4');
        segmentTree5.update((int) (byte) 100, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7743");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) 'a', (int) (short) 0);
        segmentTree5.update(100, 10);
        segmentTree5.update((int) (byte) 10, 0);
        segmentTree5.update(10, (int) (byte) 10);
        int int23 = segmentTree5.getSum((int) '4', (int) (short) 0);
        segmentTree5.update(10, (int) 'a');
        int[] intArray34 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray34);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = segmentTree5.constructTree(intArray34, (int) (byte) 10, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 52, 100]");
    }

    @Test
    public void test7744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7744");
        int[] intArray9 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray9);
        segmentTree13.update(100, (int) (short) 10);
        int[] intArray25 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree26 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray25);
        segmentTree26.update((int) (short) 100, 0);
        int int32 = segmentTree26.getSum((int) (short) 0, (int) (short) 0);
        int int35 = segmentTree26.getSum((int) '#', (int) (byte) 10);
        segmentTree26.update((int) (short) 0, 1);
        segmentTree26.update(10, 10);
        segmentTree26.update((int) (short) 10, 0);
        int[] intArray52 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree53 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray52);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree54 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray52);
        int int58 = segmentTree26.constructTree(intArray52, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree59 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray52);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree60 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray52);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree61 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray52);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree62 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray52);
        // The following exception was thrown during execution in test generation
        try {
            int int66 = segmentTree13.constructTree(intArray52, 32, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test7745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7745");
        int[] intArray6 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        segmentTree7.update((int) (short) 100, 0);
        int int13 = segmentTree7.getSum((int) (short) 0, (int) (short) 0);
        int int16 = segmentTree7.getSum((int) '#', (int) (byte) 10);
        segmentTree7.update((int) (short) 0, 1);
        segmentTree7.update(10, 10);
        segmentTree7.update((int) (short) 10, 0);
        int[] intArray33 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree34 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray33);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray33);
        int int39 = segmentTree7.constructTree(intArray33, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray33);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray33);
        segmentTree41.update(0, (int) (byte) 10);
        int int47 = segmentTree41.getSum((int) '#', (int) (short) -1);
        segmentTree41.update((int) (byte) 1, (int) (short) 0);
        segmentTree41.update((int) (short) 1, 0);
        int[] intArray66 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree67 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree68 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree69 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree70 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree71 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree72 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree73 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree74 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree75 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray66);
        // The following exception was thrown during execution in test generation
        try {
            int int79 = segmentTree41.constructTree(intArray66, 100, 35, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[10, 0, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[100, 52, 100]");
    }

    @Test
    public void test7746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7746");
        int[] intArray13 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray13);
        segmentTree14.update((int) ' ', (int) (byte) 10);
        int int20 = segmentTree14.getSum((int) (byte) 10, (int) (byte) -1);
        int int23 = segmentTree14.getSum((int) (byte) -1, (int) 'a');
        segmentTree14.update((int) (short) 100, 100);
        int[] intArray35 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray35);
        segmentTree36.update((int) (short) 100, 0);
        int int42 = segmentTree36.getSum((int) (short) 0, (int) (short) 0);
        int int45 = segmentTree36.getSum((int) '#', (int) (byte) 10);
        segmentTree36.update((int) (short) 0, 1);
        segmentTree36.update(10, 10);
        segmentTree36.update((int) (short) 10, 0);
        int[] intArray62 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree63 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray62);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree64 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray62);
        int int68 = segmentTree36.constructTree(intArray62, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree69 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray62);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree70 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray62);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree71 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray62);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree72 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray62);
        int int76 = segmentTree14.constructTree(intArray62, 0, (int) (short) 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree77 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray62);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree78 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray62);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree79 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray62);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree80 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray62);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree81 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray62);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree82 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray62);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree83 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray62);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree84 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray62);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree85 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 100, intArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
    }

    @Test
    public void test7747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7747");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((-1), (int) (byte) -1);
        segmentTree5.update((int) (byte) 10, (int) '4');
        int int17 = segmentTree5.getSum((int) ' ', (int) (byte) 1);
        segmentTree5.update(1, (int) (byte) 10);
        int int23 = segmentTree5.getSum((int) (short) -1, (int) '#');
        segmentTree5.update((int) 'a', 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test7748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7748");
        int[] intArray9 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray9);
        segmentTree10.update((int) (short) 100, 0);
        int int16 = segmentTree10.getSum((int) (short) 0, (int) (short) 0);
        int int19 = segmentTree10.getSum((int) '#', (int) (byte) 10);
        segmentTree10.update((int) (short) 0, 1);
        segmentTree10.update(10, 10);
        segmentTree10.update((int) (short) 10, 0);
        int[] intArray36 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray36);
        int int42 = segmentTree10.constructTree(intArray36, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray36);
        java.lang.Class<?> wildcardClass48 = segmentTree47.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test7749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7749");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (short) 0, 1);
        segmentTree5.update(10, 10);
        segmentTree5.update((int) (short) 10, 0);
        int[] intArray31 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree32 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray31);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree33 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray31);
        int int37 = segmentTree5.constructTree(intArray31, (int) (short) 0, 0, (int) (byte) 0);
        int int40 = segmentTree5.getSum((int) (byte) 10, 100);
        int[] intArray54 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree55 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree56 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree57 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree58 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree59 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree60 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree61 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree62 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree63 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree64 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray54);
        // The following exception was thrown during execution in test generation
        try {
            int int68 = segmentTree5.constructTree(intArray54, (int) (byte) 10, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[100, 52, 100]");
    }

    @Test
    public void test7750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7750");
        int[] intArray11 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        segmentTree12.update((int) ' ', (int) (byte) 10);
        int int18 = segmentTree12.getSum((int) (byte) 10, (int) (byte) -1);
        int int21 = segmentTree12.getSum((int) (byte) -1, (int) 'a');
        segmentTree12.update((int) (short) 100, 100);
        int[] intArray33 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree34 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray33);
        segmentTree34.update((int) (short) 100, 0);
        int int40 = segmentTree34.getSum((int) (short) 0, (int) (short) 0);
        int int43 = segmentTree34.getSum((int) '#', (int) (byte) 10);
        segmentTree34.update((int) (short) 0, 1);
        segmentTree34.update(10, 10);
        segmentTree34.update((int) (short) 10, 0);
        int[] intArray60 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree61 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray60);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree62 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray60);
        int int66 = segmentTree34.constructTree(intArray60, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree67 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray60);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree68 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray60);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree69 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray60);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree70 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray60);
        int int74 = segmentTree12.constructTree(intArray60, 0, (int) (short) 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree75 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray60);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree76 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray60);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree77 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray60);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree78 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray60);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree79 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray60);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree80 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray60);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree81 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray60);
        int int84 = segmentTree81.getSum((int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test7751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7751");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        int int17 = segmentTree5.getSum((-1), 0);
        int int20 = segmentTree5.getSum((int) 'a', (int) '#');
        int int23 = segmentTree5.getSum((int) '#', 100);
        int int26 = segmentTree5.getSum(100, (int) (byte) 10);
        int int29 = segmentTree5.getSum((int) ' ', (int) '4');
        int int32 = segmentTree5.getSum((int) (short) 10, (int) (byte) 1);
        int int35 = segmentTree5.getSum((int) (byte) -1, (int) (short) 1);
        segmentTree5.update((int) '#', 52);
        java.lang.Class<?> wildcardClass39 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test7752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7752");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (byte) -1, (int) '#');
        segmentTree5.update(1, (int) (byte) 1);
        segmentTree5.update(0, (int) (byte) 100);
        int int26 = segmentTree5.getSum(0, (int) (byte) 10);
        int int29 = segmentTree5.getSum(100, 0);
        java.lang.Class<?> wildcardClass30 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test7753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7753");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        segmentTree5.update(100, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (byte) -1, (int) (short) 0);
        int int23 = segmentTree5.getSum(0, (int) (byte) -1);
        int int26 = segmentTree5.getSum((int) 'a', (int) (short) -1);
        int int29 = segmentTree5.getSum((int) (byte) 0, (int) (byte) 100);
        int int32 = segmentTree5.getSum(1, (int) (byte) 1);
        segmentTree5.update((int) '#', 0);
        java.lang.Class<?> wildcardClass36 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test7754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7754");
        int[] intArray6 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        segmentTree7.update((int) (short) 100, 0);
        int int13 = segmentTree7.getSum((int) (short) 0, (int) (short) 0);
        int int16 = segmentTree7.getSum((int) '#', (int) (byte) 10);
        segmentTree7.update((int) (short) 0, 1);
        segmentTree7.update(10, 10);
        segmentTree7.update((int) (short) 10, 0);
        int[] intArray33 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree34 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray33);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray33);
        int int39 = segmentTree7.constructTree(intArray33, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray33);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray33);
        segmentTree41.update((-1), (int) (short) 0);
        int int47 = segmentTree41.getSum(97, (int) (short) 0);
        java.lang.Class<?> wildcardClass48 = segmentTree41.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test7755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7755");
        int[] intArray10 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 10, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 52, 100]");
    }

    @Test
    public void test7756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7756");
        int[] intArray12 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree20 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree21 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray12);
        int[] intArray34 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray34);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = segmentTree21.constructTree(intArray34, (int) (short) 100, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 52, 100]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7757");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) 'a', (int) (short) 0);
        int int14 = segmentTree5.getSum((int) (short) 0, (int) (byte) 0);
        segmentTree5.update(35, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test7758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7758");
        int[] intArray13 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree20 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree21 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 100, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7759");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (byte) -1, (int) '#');
        segmentTree5.update(1, (int) (byte) 1);
        segmentTree5.update(0, (int) (byte) 100);
        int int26 = segmentTree5.getSum(0, (int) (byte) 10);
        int int29 = segmentTree5.getSum((int) (short) 10, 1);
        int int32 = segmentTree5.getSum((int) 'a', (int) 'a');
        int int35 = segmentTree5.getSum((int) (byte) 0, (int) '#');
        segmentTree5.update((int) (short) 100, 32);
        int int41 = segmentTree5.getSum(0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test7760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7760");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (short) 0, 1);
        segmentTree5.update(10, 10);
        int int23 = segmentTree5.getSum((int) ' ', 10);
        segmentTree5.update((int) (byte) 10, (int) (byte) -1);
        int int29 = segmentTree5.getSum(10, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7761");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        segmentTree5.update((int) (byte) 0, (int) 'a');
        segmentTree5.update(100, (int) (short) 1);
        int int23 = segmentTree5.getSum((int) (byte) -1, (int) (byte) 10);
        segmentTree5.update((int) (byte) 0, (int) (short) 10);
        segmentTree5.update((int) (byte) 10, 52);
        int int32 = segmentTree5.getSum(1, 1);
        segmentTree5.update((int) '4', (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7762");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (short) 0, 1);
        segmentTree5.update((int) '#', (int) (byte) 0);
        int int23 = segmentTree5.getSum((int) (byte) 0, 1);
        segmentTree5.update((int) (short) 1, (int) '4');
        int int29 = segmentTree5.getSum((int) (short) 1, 100);
        int int32 = segmentTree5.getSum((int) (short) 0, 100);
        segmentTree5.update(0, 10);
        int[] intArray43 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray43);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray43);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray43);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray43);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = segmentTree5.constructTree(intArray43, (int) (short) 0, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[100, 52, 100]");
    }

    @Test
    public void test7763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7763");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        segmentTree5.update((-1), (-1));
        segmentTree5.update((int) '4', (int) (byte) 10);
        segmentTree5.update((int) '4', (int) (byte) 1);
        segmentTree5.update((int) (byte) -1, (int) (byte) 10);
        int int35 = segmentTree5.getSum((int) (short) 0, (int) (byte) 10);
        int[] intArray36 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int40 = segmentTree5.constructTree(intArray36, (int) (short) 0, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test7764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7764");
        int[] intArray5 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree6 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray5);
        segmentTree6.update((int) ' ', (int) (byte) 10);
        int int12 = segmentTree6.getSum((int) (byte) 10, (int) (byte) -1);
        int int15 = segmentTree6.getSum((int) (byte) -1, (int) 'a');
        segmentTree6.update((int) (short) 100, 100);
        int[] intArray27 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree28 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray27);
        segmentTree28.update((int) (short) 100, 0);
        int int34 = segmentTree28.getSum((int) (short) 0, (int) (short) 0);
        int int37 = segmentTree28.getSum((int) '#', (int) (byte) 10);
        segmentTree28.update((int) (short) 0, 1);
        segmentTree28.update(10, 10);
        segmentTree28.update((int) (short) 10, 0);
        int[] intArray54 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree55 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree56 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray54);
        int int60 = segmentTree28.constructTree(intArray54, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree61 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree62 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree63 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree64 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray54);
        int int68 = segmentTree6.constructTree(intArray54, 0, (int) (short) 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree69 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray54);
        segmentTree69.update(10, (int) (short) 100);
        segmentTree69.update(10, (int) (short) 100);
        segmentTree69.update((int) (byte) 1, (int) '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1, 35, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
    }

    @Test
    public void test7765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7765");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((-1), (int) (byte) -1);
        segmentTree5.update((int) (byte) 10, (int) '4');
        int int17 = segmentTree5.getSum(0, (int) (short) 1);
        int int20 = segmentTree5.getSum((int) (byte) 0, (int) '#');
        segmentTree5.update((int) (byte) 10, (-1));
        int int26 = segmentTree5.getSum(32, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7766");
        int[] intArray8 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) ' ', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7767");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        int int14 = segmentTree5.getSum((int) (short) 0, (int) (short) -1);
        int int17 = segmentTree5.getSum(10, (int) (short) 0);
        int int20 = segmentTree5.getSum((int) '#', (-1));
        segmentTree5.update(100, (int) (byte) -1);
        int int26 = segmentTree5.getSum((int) '#', (int) '#');
        int int29 = segmentTree5.getSum((int) (byte) 100, (int) (short) 10);
        segmentTree5.update(97, 97);
        int[] intArray37 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        segmentTree38.update((int) ' ', (int) (byte) 10);
        int int44 = segmentTree38.getSum(0, (int) (short) 1);
        segmentTree38.update(100, 100);
        int int50 = segmentTree38.getSum((int) '#', (int) (short) 10);
        segmentTree38.update((-1), (int) (byte) 10);
        segmentTree38.update((int) (byte) 0, (int) (short) 1);
        segmentTree38.update((int) (short) 0, (int) (byte) 100);
        int[] intArray67 = new int[] { 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree68 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray67);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree69 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray67);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree70 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray67);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree71 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray67);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree72 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray67);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree73 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray67);
        int int77 = segmentTree38.constructTree(intArray67, 0, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int81 = segmentTree5.constructTree(intArray67, (int) (short) 100, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[100]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 100 + "'", int77 == 100);
    }

    @Test
    public void test7768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7768");
        int[] intArray9 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray9);
        segmentTree10.update((int) ' ', (int) (byte) 10);
        segmentTree10.update((int) (short) 100, (int) '#');
        segmentTree10.update((int) (byte) 1, (int) (short) -1);
        int int22 = segmentTree10.getSum((-1), 0);
        int int25 = segmentTree10.getSum((int) 'a', (int) '#');
        int int28 = segmentTree10.getSum((int) '#', 100);
        segmentTree10.update((int) ' ', (int) (short) 1);
        segmentTree10.update((int) (short) 10, (int) '#');
        int int37 = segmentTree10.getSum((int) (short) 10, (int) '#');
        int[] intArray48 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray48);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree50 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray48);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree51 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray48);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree52 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray48);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree53 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray48);
        int int57 = segmentTree10.constructTree(intArray48, 0, 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree58 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray48);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree59 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray48);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree60 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray48);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree61 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray48);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree62 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 100, intArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test7769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7769");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, (int) '4');
        int int26 = segmentTree5.getSum((int) (byte) 10, (int) 'a');
        int int29 = segmentTree5.getSum((int) (short) -1, (int) (short) 0);
        int int32 = segmentTree5.getSum(0, (int) (short) -1);
        segmentTree5.update((int) (short) 100, (int) (short) 0);
        int int38 = segmentTree5.getSum((int) '4', (int) (short) 1);
        int int41 = segmentTree5.getSum(52, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test7770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7770");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((-1), (int) (byte) -1);
        segmentTree5.update((int) (short) 0, 0);
        segmentTree5.update((int) (short) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 0, 0);
        segmentTree5.update(0, (int) (short) 10);
        segmentTree5.update((int) ' ', 0);
        int[] intArray38 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray38);
        int int50 = segmentTree5.constructTree(intArray38, 0, (int) (short) 0, 0);
        int int53 = segmentTree5.getSum(97, 97);
        segmentTree5.update(100, 32);
        int int59 = segmentTree5.getSum((int) (byte) -1, (int) (short) 100);
        int[] intArray72 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree73 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray72);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree74 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray72);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree75 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray72);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree76 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray72);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree77 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray72);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree78 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray72);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree79 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray72);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree80 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray72);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree81 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray72);
        // The following exception was thrown during execution in test generation
        try {
            int int85 = segmentTree5.constructTree(intArray72, 1, 32, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[100, 52, 100]");
    }

    @Test
    public void test7771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7771");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        segmentTree5.update((-1), (-1));
        int int26 = segmentTree5.getSum(100, (int) (short) 0);
        segmentTree5.update(0, (int) (byte) 0);
        segmentTree5.update((int) 'a', 0);
        int int35 = segmentTree5.getSum((int) (short) 1, 0);
        int int38 = segmentTree5.getSum((int) (byte) 10, 35);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7772");
        int[] intArray5 = new int[] { 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree6 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray5);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray5);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray5);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 0, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
    }

    @Test
    public void test7773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7773");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update(10, 100);
        int int17 = segmentTree5.getSum((int) (byte) 100, (int) ' ');
        int int20 = segmentTree5.getSum((int) (byte) 1, (int) '4');
        segmentTree5.update((int) (short) 1, (int) (byte) 10);
        segmentTree5.update(10, 0);
        segmentTree5.update((-1), (int) 'a');
        segmentTree5.update(1, (int) 'a');
        int int35 = segmentTree5.getSum(52, (int) (byte) 0);
        int int38 = segmentTree5.getSum((int) (byte) 100, 100);
        int[] intArray41 = new int[] { 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray41);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = segmentTree5.constructTree(intArray41, (int) (byte) 10, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 97, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100]");
    }

    @Test
    public void test7774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7774");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        segmentTree5.update((-1), (-1));
        int int26 = segmentTree5.getSum(100, (int) (short) 0);
        int int29 = segmentTree5.getSum((int) ' ', (int) (short) -1);
        int int32 = segmentTree5.getSum(0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass33 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7775");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum(100, (int) 'a');
        int int20 = segmentTree5.getSum((int) (short) 100, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test7776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7776");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (short) 10, 0);
        segmentTree5.update(0, (int) (byte) 0);
        int int17 = segmentTree5.getSum((int) (byte) 1, 1);
        segmentTree5.update(52, 10);
        int[] intArray30 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree31 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray30);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree32 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray30);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree33 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray30);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree34 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray30);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = segmentTree5.constructTree(intArray30, (int) (byte) 1, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7777");
        int[] intArray5 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree6 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray5);
        segmentTree6.update((int) ' ', (int) (byte) 10);
        segmentTree6.update((int) (short) 100, (int) '#');
        segmentTree6.update((int) (byte) 1, (int) (short) -1);
        segmentTree6.update(100, (int) (byte) -1);
        int int21 = segmentTree6.getSum((int) (byte) -1, (int) (short) 0);
        int int24 = segmentTree6.getSum(0, (int) (byte) -1);
        int int27 = segmentTree6.getSum((int) 'a', (int) (short) -1);
        int int30 = segmentTree6.getSum((int) (short) -1, (int) (short) 1);
        int[] intArray39 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray39);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray39);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray39);
        int int46 = segmentTree6.constructTree(intArray39, 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray39);
        segmentTree47.update(52, 97);
        java.lang.Class<?> wildcardClass51 = segmentTree47.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test7778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7778");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        int int14 = segmentTree5.getSum((int) (byte) -1, (int) 'a');
        int int17 = segmentTree5.getSum((int) (short) 10, 0);
        int int20 = segmentTree5.getSum((-1), (int) '#');
        int int23 = segmentTree5.getSum(100, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test7779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7779");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (byte) -1, (int) '#');
        segmentTree5.update((int) ' ', (int) (short) -1);
        segmentTree5.update((-1), 0);
        segmentTree5.update((int) (byte) 0, (int) (byte) 0);
        segmentTree5.update(10, (int) '#');
        int int32 = segmentTree5.getSum(0, (int) (short) 10);
        int[] intArray46 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree48 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree50 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree51 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree52 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree53 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree54 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray46);
        // The following exception was thrown during execution in test generation
        try {
            int int58 = segmentTree5.constructTree(intArray46, (int) (short) 10, 52, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7780");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, 1);
        int int26 = segmentTree5.getSum((int) (short) -1, 100);
        segmentTree5.update((int) (byte) 1, (int) ' ');
        int int32 = segmentTree5.getSum(10, 0);
        int int35 = segmentTree5.getSum(10, 10);
        int int38 = segmentTree5.getSum(10, (int) '4');
        segmentTree5.update((-1), (int) (byte) 10);
        int[] intArray48 = new int[] { 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray48);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree50 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray48);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree51 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray48);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree52 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray48);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree53 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray48);
        // The following exception was thrown during execution in test generation
        try {
            int int57 = segmentTree5.constructTree(intArray48, (int) (byte) 10, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 32, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100]");
    }

    @Test
    public void test7781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7781");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        segmentTree5.update(100, (-1));
        int int17 = segmentTree5.getSum((int) (short) -1, 10);
        segmentTree5.update(0, (int) (byte) -1);
        int int23 = segmentTree5.getSum((int) (short) -1, 1);
        segmentTree5.update(100, 0);
        int int29 = segmentTree5.getSum(1, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7782");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        segmentTree5.update(100, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (byte) -1, (int) (short) 0);
        int int23 = segmentTree5.getSum((int) 'a', (int) ' ');
        int int26 = segmentTree5.getSum((int) '4', (int) '#');
        int int29 = segmentTree5.getSum((int) (byte) -1, 10);
        segmentTree5.update((int) (short) 1, (int) ' ');
        segmentTree5.update((int) (short) 10, (int) '4');
        int int38 = segmentTree5.getSum((int) ' ', 10);
        segmentTree5.update((int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 32, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7783");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (byte) -1, (int) '#');
        segmentTree5.update(10, (int) (byte) 10);
        segmentTree5.update((-1), (int) (byte) -1);
        int[] intArray30 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree31 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray30);
        segmentTree31.update((int) ' ', (int) (byte) 10);
        segmentTree31.update((int) (short) 100, (int) '#');
        segmentTree31.update((int) (byte) 1, (int) (short) -1);
        int int43 = segmentTree31.getSum((-1), 0);
        int int46 = segmentTree31.getSum((int) 'a', (int) '#');
        int int49 = segmentTree31.getSum((int) '#', 100);
        segmentTree31.update((int) ' ', (int) (short) 1);
        segmentTree31.update((int) (short) 10, (int) '#');
        int int58 = segmentTree31.getSum((int) (short) 10, (int) '#');
        int[] intArray69 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree70 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray69);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree71 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray69);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree72 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray69);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree73 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray69);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree74 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray69);
        int int78 = segmentTree31.constructTree(intArray69, 0, 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree79 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray69);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree80 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray69);
        // The following exception was thrown during execution in test generation
        try {
            int int84 = segmentTree5.constructTree(intArray69, 35, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test7784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7784");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        segmentTree5.update(100, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (byte) -1, (int) (short) 0);
        int int23 = segmentTree5.getSum((int) 'a', (int) ' ');
        int int26 = segmentTree5.getSum((int) '4', (int) '#');
        int int29 = segmentTree5.getSum((int) (byte) -1, 10);
        segmentTree5.update((int) (short) 1, (int) ' ');
        int int35 = segmentTree5.getSum((int) ' ', (int) (byte) 0);
        int int38 = segmentTree5.getSum(0, (int) (short) -1);
        java.lang.Class<?> wildcardClass39 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 32, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test7785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7785");
        int[] intArray6 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        int int12 = segmentTree9.getSum((int) (short) 100, 0);
        segmentTree9.update((int) ' ', (int) (short) 10);
        segmentTree9.update((int) (byte) 1, (int) (byte) 100);
        int int21 = segmentTree9.getSum((int) (byte) 100, 97);
        int[] intArray31 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree32 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray31);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree33 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray31);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree34 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray31);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray31);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = segmentTree9.constructTree(intArray31, (int) (byte) 100, 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7786");
        int[] intArray13 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree20 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree21 = new com.thealgorithms.datastructures.trees.SegmentTree((-1), intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7787");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        segmentTree5.update(100, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (byte) -1, (int) (short) 0);
        int int23 = segmentTree5.getSum(0, (int) (byte) -1);
        int int26 = segmentTree5.getSum((-1), (int) 'a');
        segmentTree5.update((int) (short) 10, 10);
        int int32 = segmentTree5.getSum(0, (int) (short) 0);
        segmentTree5.update(0, 10);
        int int38 = segmentTree5.getSum((int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7788");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        segmentTree5.update((-1), (-1));
        int int26 = segmentTree5.getSum(100, (int) (short) 0);
        int int29 = segmentTree5.getSum((int) ' ', (int) (short) -1);
        segmentTree5.update((int) (byte) 1, (int) 'a');
        int[] intArray39 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray39);
        segmentTree40.update((int) (short) 100, 0);
        int int46 = segmentTree40.getSum((int) (short) 0, (int) (short) 0);
        int int49 = segmentTree40.getSum((int) '#', (int) (byte) 10);
        segmentTree40.update((int) (short) 0, 1);
        segmentTree40.update(10, 10);
        segmentTree40.update((int) (short) 10, 0);
        int[] intArray66 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree67 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree68 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray66);
        int int72 = segmentTree40.constructTree(intArray66, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree73 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray66);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree74 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray66);
        // The following exception was thrown during execution in test generation
        try {
            int int78 = segmentTree5.constructTree(intArray66, (int) (byte) 10, 97, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 97, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
    }

    @Test
    public void test7789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7789");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update(100, 100);
        segmentTree5.update((int) (byte) 0, (int) (short) 10);
        int int20 = segmentTree5.getSum((int) '#', (int) (byte) 100);
        segmentTree5.update((int) (byte) -1, (int) '4');
        int int26 = segmentTree5.getSum((int) 'a', (int) (byte) 1);
        segmentTree5.update((int) (short) 100, (int) '4');
        java.lang.Class<?> wildcardClass30 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test7790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7790");
        int[] intArray9 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray9);
        segmentTree15.update((int) ' ', 52);
        int int21 = segmentTree15.getSum((int) (short) -1, 0);
        java.lang.Class<?> wildcardClass22 = segmentTree15.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7791");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update(10, 100);
        int int17 = segmentTree5.getSum((int) (byte) 1, (int) (byte) 0);
        int int20 = segmentTree5.getSum((int) '4', (int) ' ');
        int int23 = segmentTree5.getSum((int) (byte) -1, (int) (short) 1);
        int int26 = segmentTree5.getSum((int) (short) 1, (int) (short) 1);
        int int29 = segmentTree5.getSum(10, (int) '4');
        java.lang.Class<?> wildcardClass30 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test7792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7792");
        int[] intArray12 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        int int22 = segmentTree19.getSum((int) (byte) 1, 0);
        int[] intArray35 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray35);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = segmentTree19.constructTree(intArray35, (int) (short) 10, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7793");
        int[] intArray9 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray9);
        segmentTree10.update((int) (short) 100, 0);
        int int16 = segmentTree10.getSum((int) (short) 0, (int) (short) 0);
        int int19 = segmentTree10.getSum((int) '#', (int) (byte) 10);
        segmentTree10.update((int) (short) 0, 1);
        segmentTree10.update(10, 10);
        segmentTree10.update((int) (short) 10, 0);
        int[] intArray36 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray36);
        int int42 = segmentTree10.constructTree(intArray36, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray36);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree(52, intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test7794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7794");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        int int17 = segmentTree5.getSum((int) 'a', (int) '#');
        int int20 = segmentTree5.getSum((int) '4', 52);
        int int23 = segmentTree5.getSum(100, (int) (byte) 100);
        int int26 = segmentTree5.getSum((int) (byte) 10, (int) '4');
        int int29 = segmentTree5.getSum((int) (byte) 100, (int) (byte) 100);
        segmentTree5.update(52, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7795");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        int int14 = segmentTree5.getSum((int) (short) 0, (int) (short) -1);
        int int17 = segmentTree5.getSum(10, (int) (short) 0);
        int int20 = segmentTree5.getSum((int) '#', (-1));
        int int23 = segmentTree5.getSum((int) (short) 100, 0);
        segmentTree5.update((int) '4', (int) (short) 1);
        int int29 = segmentTree5.getSum((int) (short) 1, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7796");
        int[] intArray5 = new int[] { 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree6 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray5);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray5);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray5);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray5);
        segmentTree9.update((int) (short) 100, 32);
        segmentTree9.update((int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
    }

    @Test
    public void test7797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7797");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, 1);
        int int26 = segmentTree5.getSum((int) (short) -1, 100);
        int int29 = segmentTree5.getSum((int) (byte) 0, (int) (short) -1);
        segmentTree5.update((int) '#', 0);
        int int35 = segmentTree5.getSum((-1), 52);
        segmentTree5.update((int) (short) 10, 52);
        int int41 = segmentTree5.getSum((int) (short) 0, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
    }

    @Test
    public void test7798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7798");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) (short) -1, (int) (short) 100);
        segmentTree5.update((int) 'a', (int) (short) 10);
        int int17 = segmentTree5.getSum(0, (int) '4');
        segmentTree5.update(1, (int) (byte) 1);
        segmentTree5.update((int) (short) 0, 100);
        int int26 = segmentTree5.getSum(97, 52);
        segmentTree5.update((int) (short) 100, (int) (short) 100);
        int[] intArray36 = new int[] { 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray36);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = segmentTree5.constructTree(intArray36, (-1), (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100]");
    }

    @Test
    public void test7799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7799");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (byte) -1, (int) '#');
        segmentTree5.update(1, (int) (byte) 1);
        segmentTree5.update(0, (int) (byte) 100);
        int int26 = segmentTree5.getSum(0, (int) (byte) 10);
        int int29 = segmentTree5.getSum((int) (short) 0, (int) (byte) 10);
        int int32 = segmentTree5.getSum((int) (short) 10, (int) (byte) 10);
        int int35 = segmentTree5.getSum((int) '4', (int) 'a');
        segmentTree5.update((int) (byte) 10, 1);
        int int41 = segmentTree5.getSum((int) (byte) -1, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test7800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7800");
        int[] intArray9 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray9);
        int int18 = segmentTree15.getSum((int) (short) 10, 32);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test7801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7801");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (short) 10, 0);
        segmentTree5.update(0, (int) (byte) 0);
        segmentTree5.update((int) 'a', 0);
        int int20 = segmentTree5.getSum((int) '4', 10);
        java.lang.Class<?> wildcardClass21 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7802");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (short) 0, 1);
        segmentTree5.update((int) (byte) 100, 10);
        segmentTree5.update((int) (byte) 0, 100);
        int int26 = segmentTree5.getSum(52, (int) '4');
        int int29 = segmentTree5.getSum(0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7803");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (byte) -1, (int) '#');
        segmentTree5.update((int) ' ', (int) (short) -1);
        segmentTree5.update((-1), 0);
        segmentTree5.update((int) (byte) 0, (int) (byte) 0);
        segmentTree5.update(10, (int) '#');
        segmentTree5.update((int) (short) 0, (int) (byte) 0);
        int[] intArray44 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray44);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray44);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray44);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree48 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray44);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray44);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree50 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray44);
        // The following exception was thrown during execution in test generation
        try {
            int int54 = segmentTree5.constructTree(intArray44, (int) (byte) 10, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7804");
        int[] intArray9 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray9);
        segmentTree10.update((int) (short) 100, 0);
        int int16 = segmentTree10.getSum((int) (short) 0, (int) (short) 0);
        int int19 = segmentTree10.getSum((int) '#', (int) (byte) 10);
        segmentTree10.update((int) (short) 0, 1);
        segmentTree10.update(10, 10);
        segmentTree10.update((int) (short) 10, 0);
        int[] intArray36 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray36);
        int int42 = segmentTree10.constructTree(intArray36, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray36);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree((-1), intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test7805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7805");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update(100, (int) (byte) 100);
        int int20 = segmentTree5.getSum((int) (short) 10, 0);
        segmentTree5.update((int) '#', (int) (byte) 1);
        int int26 = segmentTree5.getSum(100, (int) (byte) 100);
        int int29 = segmentTree5.getSum((int) ' ', (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7806");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update(0, (int) (short) 1);
        segmentTree5.update((int) (short) 100, 1);
        int int23 = segmentTree5.getSum((int) (byte) 1, (int) (short) 100);
        segmentTree5.update(52, (int) (byte) 1);
        segmentTree5.update((int) (short) 0, 0);
        int int32 = segmentTree5.getSum((int) (short) 10, 1);
        segmentTree5.update((int) (short) 0, (int) (short) 0);
        int int38 = segmentTree5.getSum((int) '#', (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7807");
        int[] intArray4 = new int[] { 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray4);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree6 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray4);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        int int10 = segmentTree7.getSum(0, 52);
        int[] intArray17 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray17);
        segmentTree18.update((int) (short) 100, 0);
        int int24 = segmentTree18.getSum((int) (short) 0, (int) (short) 0);
        int int27 = segmentTree18.getSum((int) '#', (int) (byte) 10);
        segmentTree18.update((int) (short) 0, 1);
        segmentTree18.update(10, 10);
        segmentTree18.update((int) (short) 10, 0);
        int[] intArray44 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray44);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray44);
        int int50 = segmentTree18.constructTree(intArray44, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree51 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray44);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree52 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray44);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = segmentTree7.constructTree(intArray44, (int) 'a', 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test7808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7808");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        segmentTree5.update(100, (int) (byte) -1);
        int[] intArray23 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree24 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray23);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree25 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray23);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = segmentTree5.constructTree(intArray23, (int) ' ', (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 52, 100]");
    }

    @Test
    public void test7809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7809");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, 1);
        int int26 = segmentTree5.getSum((int) (short) -1, 100);
        int int29 = segmentTree5.getSum((int) (byte) 0, (int) (short) -1);
        int int32 = segmentTree5.getSum((int) (byte) 1, (int) (byte) 10);
        int int35 = segmentTree5.getSum((int) ' ', (int) ' ');
        segmentTree5.update((int) (byte) 10, (int) '#');
        int[] intArray39 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int43 = segmentTree5.constructTree(intArray39, (int) (byte) 100, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test7810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7810");
        int[] intArray7 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray7);
        segmentTree8.update((int) (short) 100, 0);
        int int14 = segmentTree8.getSum((int) (short) 0, (int) (short) 0);
        int int17 = segmentTree8.getSum((int) '#', (int) (byte) 10);
        segmentTree8.update((int) (short) 0, 1);
        segmentTree8.update(10, 10);
        segmentTree8.update((int) (short) 10, 0);
        int[] intArray34 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray34);
        int int40 = segmentTree8.constructTree(intArray34, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        segmentTree42.update(0, (int) (byte) 10);
        int int48 = segmentTree42.getSum((int) '#', (int) (short) -1);
        segmentTree42.update((int) (byte) 1, (int) (short) 0);
        segmentTree42.update((int) (byte) -1, 32);
        segmentTree42.update((int) (byte) 10, (int) (short) 1);
        int[] intArray71 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree72 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray71);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree73 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray71);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree74 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray71);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree75 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray71);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree76 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray71);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree77 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray71);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree78 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray71);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree79 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray71);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree80 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray71);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree81 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray71);
        int int85 = segmentTree42.constructTree(intArray71, (int) (byte) 0, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree86 = new com.thealgorithms.datastructures.trees.SegmentTree((int) '#', intArray71);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[10, 0, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 100 + "'", int85 == 100);
    }

    @Test
    public void test7811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7811");
        int[] intArray6 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        segmentTree9.update((int) (byte) -1, 1);
        segmentTree9.update(0, (int) (byte) 10);
        int int18 = segmentTree9.getSum((int) (byte) -1, (int) ' ');
        int int21 = segmentTree9.getSum(10, (int) (byte) 0);
        int[] intArray34 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        segmentTree35.update((int) (short) 100, 0);
        int int41 = segmentTree35.getSum((int) (short) 0, (int) (short) 0);
        int int44 = segmentTree35.getSum((int) '#', (int) (byte) 10);
        segmentTree35.update((int) (short) 0, 1);
        segmentTree35.update(10, 10);
        segmentTree35.update((int) (short) 10, 0);
        int[] intArray61 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree62 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree63 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray61);
        int int67 = segmentTree35.constructTree(intArray61, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree68 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree69 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree70 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree71 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree72 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree73 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree74 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree75 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray61);
        // The following exception was thrown during execution in test generation
        try {
            int int79 = segmentTree9.constructTree(intArray61, (int) '4', 35, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 52, 100]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test7812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7812");
        int[] intArray12 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        segmentTree13.update((int) ' ', (int) (byte) 10);
        int int19 = segmentTree13.getSum((int) (byte) 10, (int) (byte) -1);
        int int22 = segmentTree13.getSum((int) (byte) -1, (int) 'a');
        segmentTree13.update((int) (short) 100, 100);
        int[] intArray34 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        segmentTree35.update((int) (short) 100, 0);
        int int41 = segmentTree35.getSum((int) (short) 0, (int) (short) 0);
        int int44 = segmentTree35.getSum((int) '#', (int) (byte) 10);
        segmentTree35.update((int) (short) 0, 1);
        segmentTree35.update(10, 10);
        segmentTree35.update((int) (short) 10, 0);
        int[] intArray61 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree62 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree63 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray61);
        int int67 = segmentTree35.constructTree(intArray61, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree68 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree69 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree70 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree71 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray61);
        int int75 = segmentTree13.constructTree(intArray61, 0, (int) (short) 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree76 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree77 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree78 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree79 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree80 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree81 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree82 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree83 = new com.thealgorithms.datastructures.trees.SegmentTree(10, intArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test7813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7813");
        int[] intArray8 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        segmentTree11.update((int) (byte) 1, (int) '4');
        segmentTree11.update((int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass18 = segmentTree11.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 52, -1, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7814");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        int int17 = segmentTree5.getSum((-1), 0);
        int int20 = segmentTree5.getSum((int) 'a', (int) '#');
        int int23 = segmentTree5.getSum((int) '#', 100);
        int int26 = segmentTree5.getSum(100, (int) (byte) 10);
        int int29 = segmentTree5.getSum((int) ' ', (int) '4');
        int int32 = segmentTree5.getSum((int) (short) 10, (int) (byte) 1);
        int int35 = segmentTree5.getSum((int) 'a', (int) (byte) 100);
        int int38 = segmentTree5.getSum((int) (byte) 10, (int) (byte) 100);
        int int41 = segmentTree5.getSum(1, (int) (short) 100);
        java.lang.Class<?> wildcardClass42 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test7815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7815");
        int[] intArray6 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        int int10 = segmentTree7.getSum(1, (int) (byte) 10);
        int int13 = segmentTree7.getSum((int) ' ', (int) (byte) 0);
        segmentTree7.update(97, (int) ' ');
        int[] intArray29 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree30 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray29);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree31 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray29);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree32 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray29);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree33 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray29);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree34 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray29);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray29);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray29);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray29);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray29);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = segmentTree7.constructTree(intArray29, (int) ' ', 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 52, 100]");
    }

    @Test
    public void test7816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7816");
        int[] intArray10 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray10);
        segmentTree17.update(1, (int) (short) 100);
        java.lang.Class<?> wildcardClass21 = segmentTree17.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7817");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((-1), (int) (byte) -1);
        segmentTree5.update((int) (byte) 10, (int) '4');
        int int17 = segmentTree5.getSum(100, (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) (short) -1);
        segmentTree5.update((int) (byte) 1, 1);
        segmentTree5.update((int) (short) -1, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test7818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7818");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (short) 10, 0);
        int int14 = segmentTree5.getSum((int) (short) -1, 1);
        segmentTree5.update((int) 'a', 100);
        int int20 = segmentTree5.getSum((int) ' ', (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test7819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7819");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        int int14 = segmentTree5.getSum((int) (short) 0, (int) (short) -1);
        int int17 = segmentTree5.getSum(10, (int) (short) 0);
        int int20 = segmentTree5.getSum((int) '#', (-1));
        segmentTree5.update(100, (int) (byte) -1);
        int int26 = segmentTree5.getSum((int) 'a', 10);
        int[] intArray27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = segmentTree5.constructTree(intArray27, 35, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7820");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        segmentTree5.update((int) (byte) 100, (int) (short) 1);
        segmentTree5.update((int) ' ', (int) (short) 1);
        int int20 = segmentTree5.getSum((int) '4', (int) '4');
        segmentTree5.update(0, (int) '4');
        segmentTree5.update((int) (short) 10, (int) (byte) 1);
        int int29 = segmentTree5.getSum(100, 0);
        int[] intArray41 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray41);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray41);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray41);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray41);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray41);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray41);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = segmentTree5.constructTree(intArray41, 35, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7821");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        segmentTree5.update((-1), (-1));
        int int26 = segmentTree5.getSum(100, (int) (short) 0);
        int int29 = segmentTree5.getSum((int) ' ', (int) (short) -1);
        int int32 = segmentTree5.getSum(10, (int) (short) 10);
        int int35 = segmentTree5.getSum((int) (short) -1, (int) 'a');
        int int38 = segmentTree5.getSum((int) (byte) 1, 10);
        segmentTree5.update(10, (int) (short) 10);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        segmentTree5.update((int) (short) -1, (int) (byte) 1);
        segmentTree5.update((int) (byte) 100, (int) (short) 0);
        int int53 = segmentTree5.getSum((int) (short) 0, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test7822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7822");
        int[] intArray11 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree((int) 'a', intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 52, 100]");
    }

    @Test
    public void test7823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7823");
        int[] intArray5 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree6 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray5);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray5);
        int int10 = segmentTree7.getSum((int) (byte) 10, (int) (byte) 10);
        int int13 = segmentTree7.getSum((int) (byte) 10, (int) (short) 0);
        int int16 = segmentTree7.getSum((int) (short) 100, 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test7824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7824");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        segmentTree5.update((int) (short) 1, (int) (short) -1);
        int int23 = segmentTree5.getSum((int) (byte) 100, (int) '#');
        int int26 = segmentTree5.getSum((int) (byte) 1, 100);
        int int29 = segmentTree5.getSum((int) 'a', (int) (short) 1);
        int int32 = segmentTree5.getSum((int) (byte) 0, (int) (short) 10);
        int int35 = segmentTree5.getSum((int) (short) -1, (int) (byte) 100);
        int[] intArray46 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree48 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree50 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree51 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray46);
        // The following exception was thrown during execution in test generation
        try {
            int int55 = segmentTree5.constructTree(intArray46, 32, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7825");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        segmentTree5.update((int) (byte) 0, (int) 'a');
        segmentTree5.update((int) (byte) -1, 10);
        segmentTree5.update((int) '4', 1);
        int[] intArray24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = segmentTree5.constructTree(intArray24, (int) (byte) 100, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test7826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7826");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((-1), (int) (byte) -1);
        segmentTree5.update((int) (short) 0, 0);
        int int17 = segmentTree5.getSum((int) (byte) 100, (int) (short) 10);
        int int20 = segmentTree5.getSum((int) (short) 0, (int) (byte) 10);
        segmentTree5.update((int) ' ', 0);
        segmentTree5.update(52, (int) (short) -1);
        int int29 = segmentTree5.getSum(100, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7827");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (byte) -1, (int) '#');
        segmentTree5.update((int) ' ', (int) (short) -1);
        int int23 = segmentTree5.getSum(0, (int) (short) 10);
        int[] intArray31 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree32 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray31);
        segmentTree32.update((int) (short) 100, 0);
        int int38 = segmentTree32.getSum((int) (short) 0, (int) (short) 0);
        int int41 = segmentTree32.getSum((int) '#', (int) (byte) 10);
        segmentTree32.update((int) (short) 0, 1);
        segmentTree32.update(10, 10);
        segmentTree32.update((int) (short) 10, 0);
        int[] intArray58 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree59 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray58);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree60 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray58);
        int int64 = segmentTree32.constructTree(intArray58, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree65 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray58);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree66 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray58);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree67 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray58);
        // The following exception was thrown during execution in test generation
        try {
            int int71 = segmentTree5.constructTree(intArray58, 100, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test7828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7828");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (short) 0, 1);
        segmentTree5.update((int) '#', (int) (byte) 0);
        int int23 = segmentTree5.getSum((int) (byte) 0, 1);
        segmentTree5.update((int) (short) 1, (int) '4');
        int int29 = segmentTree5.getSum((int) (short) 1, 100);
        int int32 = segmentTree5.getSum((int) (short) 0, 100);
        int int35 = segmentTree5.getSum((int) (byte) 100, 0);
        int[] intArray36 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int40 = segmentTree5.constructTree(intArray36, (int) '4', 52, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test7829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7829");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        int int14 = segmentTree5.getSum((int) (short) 0, (int) (short) -1);
        segmentTree5.update((int) 'a', (int) 'a');
        segmentTree5.update((int) (byte) 0, (int) (byte) 1);
        int int23 = segmentTree5.getSum((int) '#', (int) (short) 10);
        int[] intArray28 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree29 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray28);
        segmentTree29.update((int) ' ', (int) (byte) 10);
        int int35 = segmentTree29.getSum(0, (int) (short) 1);
        segmentTree29.update(100, 100);
        int int41 = segmentTree29.getSum((int) '#', (int) (short) 10);
        segmentTree29.update((-1), (int) (byte) 10);
        segmentTree29.update((int) (byte) 0, (int) (short) 1);
        segmentTree29.update((int) (short) 0, (int) (byte) 100);
        int[] intArray58 = new int[] { 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree59 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray58);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree60 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray58);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree61 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray58);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree62 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray58);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree63 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray58);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree64 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray58);
        int int68 = segmentTree29.constructTree(intArray58, 0, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int72 = segmentTree5.constructTree(intArray58, 1, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[100]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 100 + "'", int68 == 100);
    }

    @Test
    public void test7830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7830");
        int[] intArray10 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray10);
        segmentTree17.update((int) ' ', (int) (short) -1);
        segmentTree17.update(32, 32);
        segmentTree17.update((int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 52, 100]");
    }

    @Test
    public void test7831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7831");
        int[] intArray6 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        segmentTree7.update((int) ' ', (int) (byte) 10);
        int int13 = segmentTree7.getSum((int) (short) 10, 0);
        int int16 = segmentTree7.getSum((int) (short) -1, 1);
        int int19 = segmentTree7.getSum((int) (short) 1, 10);
        segmentTree7.update((int) (byte) 1, (int) (byte) 1);
        int[] intArray31 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree32 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray31);
        segmentTree32.update((int) (short) 100, 0);
        int int38 = segmentTree32.getSum((int) (short) 0, (int) (short) 0);
        int int41 = segmentTree32.getSum((int) '#', (int) (byte) 10);
        segmentTree32.update((int) (short) 0, 1);
        segmentTree32.update(10, 10);
        segmentTree32.update((int) (short) 10, 0);
        int[] intArray58 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree59 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray58);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree60 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray58);
        int int64 = segmentTree32.constructTree(intArray58, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree65 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray58);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree66 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray58);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree67 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray58);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree68 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray58);
        int int72 = segmentTree7.constructTree(intArray58, (int) (short) 0, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree73 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray58);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree74 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) -1, intArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, 100]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
    }

    @Test
    public void test7832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7832");
        int[] intArray6 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        int int12 = segmentTree9.getSum((int) (short) 100, 0);
        segmentTree9.update((int) ' ', (int) (short) 10);
        segmentTree9.update((int) (byte) 1, (int) (byte) 100);
        int int21 = segmentTree9.getSum((int) (byte) 100, 97);
        int int24 = segmentTree9.getSum(52, 52);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test7833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7833");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        int int14 = segmentTree5.getSum((int) (short) 0, (int) (short) -1);
        segmentTree5.update((int) 'a', (int) 'a');
        segmentTree5.update((int) (byte) 0, (int) (byte) 1);
        int int23 = segmentTree5.getSum((int) (short) -1, 10);
        segmentTree5.update((int) ' ', 10);
        segmentTree5.update(1, (int) 'a');
        segmentTree5.update(100, (int) (short) 100);
        segmentTree5.update(32, (int) (byte) 10);
        java.lang.Class<?> wildcardClass36 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test7834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7834");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (short) 10, 0);
        segmentTree5.update(0, (int) (byte) 0);
        segmentTree5.update((int) 'a', 0);
        segmentTree5.update((int) '#', 0);
        int int23 = segmentTree5.getSum((int) ' ', 97);
        segmentTree5.update(0, (int) (short) 10);
        java.lang.Class<?> wildcardClass27 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7835");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        segmentTree5.update((-1), (-1));
        segmentTree5.update((int) '4', (int) (byte) 10);
        segmentTree5.update((int) '4', (int) (byte) 1);
        segmentTree5.update((int) (byte) -1, (int) (byte) 10);
        int int35 = segmentTree5.getSum(100, 0);
        int int38 = segmentTree5.getSum((int) 'a', (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7836");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update(0, (int) (short) 1);
        int int20 = segmentTree5.getSum(100, (int) (short) -1);
        segmentTree5.update((int) '#', (int) (short) 0);
        int int26 = segmentTree5.getSum((int) (short) 0, 1);
        segmentTree5.update((int) (byte) -1, 0);
        segmentTree5.update((int) (byte) 1, (int) (short) 0);
        int[] intArray47 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree48 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray47);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray47);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree50 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray47);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree51 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray47);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree52 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray47);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree53 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray47);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree54 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray47);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree55 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray47);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree56 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray47);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree57 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray47);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree58 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray47);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = segmentTree5.constructTree(intArray47, 0, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100, 52, 100]");
    }

    @Test
    public void test7837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7837");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        int int14 = segmentTree5.getSum((int) (byte) -1, (int) 'a');
        int int17 = segmentTree5.getSum((int) ' ', (int) (short) 0);
        int[] intArray27 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree28 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray27);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree29 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray27);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree30 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray27);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree31 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray27);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = segmentTree5.constructTree(intArray27, 35, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7838");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum(100, (int) 'a');
        int int20 = segmentTree5.getSum((int) (short) 100, (int) (byte) 100);
        int int23 = segmentTree5.getSum(10, 10);
        int int26 = segmentTree5.getSum(0, (int) (byte) 1);
        segmentTree5.update((-1), (int) (byte) -1);
        int int32 = segmentTree5.getSum(52, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7839");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((-1), (int) (byte) -1);
        segmentTree5.update((int) (byte) 10, (int) '4');
        int int17 = segmentTree5.getSum((int) ' ', (int) (byte) 1);
        segmentTree5.update(1, (int) (byte) 10);
        int int23 = segmentTree5.getSum(0, 10);
        int int26 = segmentTree5.getSum((int) (short) 10, 100);
        int int29 = segmentTree5.getSum(10, (int) (short) -1);
        segmentTree5.update(35, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7840");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (byte) -1, (int) '#');
        segmentTree5.update((int) ' ', (int) (short) -1);
        int int23 = segmentTree5.getSum((int) 'a', (int) (byte) 10);
        segmentTree5.update(10, 100);
        int int29 = segmentTree5.getSum((int) (byte) 0, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test7841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7841");
        int[] intArray8 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray8);
        int int14 = segmentTree11.getSum((int) 'a', 100);
        int int17 = segmentTree11.getSum((-1), 10);
        int int20 = segmentTree11.getSum((int) (byte) 10, 100);
        int int23 = segmentTree11.getSum((int) (byte) -1, 1);
        int int26 = segmentTree11.getSum(0, 10);
        java.lang.Class<?> wildcardClass27 = segmentTree11.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7842");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (short) 0, 1);
        segmentTree5.update(10, 10);
        int int23 = segmentTree5.getSum((-1), (int) (byte) 100);
        int int26 = segmentTree5.getSum((int) (byte) -1, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7843");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        int int17 = segmentTree5.getSum((-1), 0);
        int int20 = segmentTree5.getSum((int) 'a', (int) '#');
        int int23 = segmentTree5.getSum((int) '#', 100);
        segmentTree5.update((int) ' ', (int) (short) 1);
        segmentTree5.update((int) (short) 10, (int) '#');
        int int32 = segmentTree5.getSum((int) (short) 10, (int) '#');
        int int35 = segmentTree5.getSum(97, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test7844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7844");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (short) 0, 1);
        segmentTree5.update(10, 10);
        int int23 = segmentTree5.getSum((int) ' ', 10);
        segmentTree5.update((int) '#', (int) (byte) 10);
        segmentTree5.update((int) ' ', (int) (short) 100);
        segmentTree5.update(10, (int) ' ');
        segmentTree5.update((int) (short) 10, 0);
        int int38 = segmentTree5.getSum(100, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7845");
        int[] intArray5 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree6 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray5);
        segmentTree6.update((int) (short) 100, 0);
        segmentTree6.update((int) 'a', (int) (short) 0);
        segmentTree6.update(100, 10);
        segmentTree6.update((int) (byte) 10, 0);
        segmentTree6.update(10, (int) (byte) 10);
        int[] intArray33 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree34 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray33);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray33);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray33);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray33);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray33);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray33);
        int int43 = segmentTree6.constructTree(intArray33, 0, (int) (short) 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray33);
        segmentTree44.update(35, 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 52, 100]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test7846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7846");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) 'a', (int) (short) 0);
        int int14 = segmentTree5.getSum((int) (short) 0, (int) (byte) 0);
        int int17 = segmentTree5.getSum(0, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) 10, (int) (byte) 1);
        segmentTree5.update(52, 1);
        segmentTree5.update(0, (int) (byte) 10);
        int[] intArray37 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray37);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = segmentTree5.constructTree(intArray37, (int) (byte) 1, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 100]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7847");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (byte) -1, (int) '#');
        segmentTree5.update((int) '#', (int) (short) 0);
        segmentTree5.update((int) 'a', (int) (short) 10);
        segmentTree5.update((int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test7848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7848");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum(100, (int) 'a');
        int int20 = segmentTree5.getSum(1, (int) (short) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, (int) (byte) 0);
        segmentTree5.update(10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 0);
        segmentTree5.update((int) ' ', 35);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test7849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7849");
        int[] intArray6 = new int[] { 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        segmentTree11.update(100, (int) 'a');
        segmentTree11.update((int) '4', 100);
        int int20 = segmentTree11.getSum(97, (int) 'a');
        int int23 = segmentTree11.getSum((int) (byte) 100, (int) (short) 1);
        int int26 = segmentTree11.getSum(97, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7850");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (byte) -1, (int) '#');
        segmentTree5.update((int) ' ', (int) (short) -1);
        segmentTree5.update((-1), 0);
        segmentTree5.update((int) (byte) 0, (int) (byte) 0);
        segmentTree5.update(10, (int) '#');
        segmentTree5.update((int) '4', 0);
        int[] intArray44 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray44);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray44);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray44);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree48 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray44);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray44);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree50 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray44);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree51 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray44);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree52 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray44);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = segmentTree5.constructTree(intArray44, 0, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[100, 52, 100]");
    }

    @Test
    public void test7851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7851");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, (int) '4');
        int int26 = segmentTree5.getSum((int) (byte) 10, (int) 'a');
        int int29 = segmentTree5.getSum((int) (short) -1, (int) (short) 0);
        int int32 = segmentTree5.getSum(0, (int) (short) -1);
        segmentTree5.update((int) (short) 100, (int) (short) -1);
        segmentTree5.update((int) (short) 1, 0);
        int int41 = segmentTree5.getSum((int) (short) 0, 0);
        segmentTree5.update(97, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 0, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
    }

    @Test
    public void test7852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7852");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        segmentTree5.update((int) (short) 1, (int) (short) -1);
        segmentTree5.update((int) 'a', 1);
        segmentTree5.update(0, 97);
        int int29 = segmentTree5.getSum((int) (short) 1, (int) '#');
        segmentTree5.update(10, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7853");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update(100, 100);
        int int17 = segmentTree5.getSum((int) '#', (int) (short) 10);
        segmentTree5.update((-1), (int) (byte) 10);
        segmentTree5.update((int) (byte) 0, (int) (short) 1);
        segmentTree5.update((int) (byte) 1, (int) (short) 1);
        int int29 = segmentTree5.getSum((-1), (int) '#');
        int[] intArray40 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray40);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray40);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray40);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray40);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray40);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray40);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray40);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = segmentTree5.constructTree(intArray40, 97, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, 52, 100]");
    }

    @Test
    public void test7854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7854");
        int[] intArray8 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        segmentTree9.update((int) ' ', (int) (byte) 10);
        int int15 = segmentTree9.getSum(0, (int) (short) 1);
        segmentTree9.update((int) (byte) 100, 0);
        int int21 = segmentTree9.getSum((int) (byte) 0, 0);
        int int24 = segmentTree9.getSum(100, (int) 'a');
        int int27 = segmentTree9.getSum(0, (int) (short) -1);
        int int30 = segmentTree9.getSum(1, (int) (short) 10);
        int int33 = segmentTree9.getSum((-1), (int) (short) 100);
        int[] intArray43 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray43);
        segmentTree44.update((int) (short) 100, 0);
        int int50 = segmentTree44.getSum((int) (short) 0, (int) (short) 0);
        int int53 = segmentTree44.getSum((int) '#', (int) (byte) 10);
        segmentTree44.update((int) (short) 0, 1);
        segmentTree44.update(10, 10);
        segmentTree44.update((int) (short) 10, 0);
        int[] intArray70 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree71 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray70);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree72 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray70);
        int int76 = segmentTree44.constructTree(intArray70, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree77 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray70);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree78 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray70);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree79 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray70);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree80 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray70);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree81 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray70);
        int int85 = segmentTree9.constructTree(intArray70, 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree86 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray70);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree87 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray70);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree88 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray70);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree89 = new com.thealgorithms.datastructures.trees.SegmentTree(0, intArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test7855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7855");
        int[] intArray8 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        segmentTree9.update((int) (short) 100, 0);
        int int15 = segmentTree9.getSum((int) (short) 0, (int) (short) 0);
        int int18 = segmentTree9.getSum((int) '#', (int) (byte) 10);
        segmentTree9.update((int) (short) 0, 1);
        segmentTree9.update(10, 10);
        segmentTree9.update((int) (short) 10, 0);
        int[] intArray35 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray35);
        int int41 = segmentTree9.constructTree(intArray35, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((-1), intArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test7856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7856");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        int int14 = segmentTree5.getSum((int) (byte) -1, (int) 'a');
        segmentTree5.update((int) (short) 100, 100);
        int int20 = segmentTree5.getSum(0, (int) '#');
        segmentTree5.update(97, (int) (byte) -1);
        int int26 = segmentTree5.getSum(0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass27 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7857");
        int[] intArray10 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray10);
        segmentTree11.update((int) (short) 100, 0);
        int int17 = segmentTree11.getSum((int) (short) 0, (int) (short) 0);
        int int20 = segmentTree11.getSum((int) '#', (int) (byte) 10);
        segmentTree11.update((int) (short) 0, 1);
        segmentTree11.update(10, 10);
        segmentTree11.update((int) (short) 10, 0);
        int[] intArray37 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray37);
        int int43 = segmentTree11.constructTree(intArray37, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree48 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) -1, intArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test7858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7858");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) ' ', (int) (byte) -1);
        int int17 = segmentTree5.getSum((int) (short) 10, 1);
        int int20 = segmentTree5.getSum(0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test7859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7859");
        int[] intArray9 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray9);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7860");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((-1), (int) (byte) -1);
        segmentTree5.update((int) (short) 0, 0);
        segmentTree5.update((int) (short) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 0, 0);
        segmentTree5.update(10, 1);
        int int26 = segmentTree5.getSum((int) (short) 0, (int) '4');
        segmentTree5.update((int) (short) -1, (int) (short) 0);
        segmentTree5.update((int) (short) 100, (int) (short) 100);
        segmentTree5.update((int) (byte) -1, 97);
        segmentTree5.update((int) '#', (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7861");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) 'a', (int) (short) 0);
        segmentTree5.update(100, 10);
        segmentTree5.update((int) (byte) 1, 10);
        int int20 = segmentTree5.getSum(52, (int) '4');
        int int23 = segmentTree5.getSum((int) (short) -1, 97);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test7862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7862");
        int[] intArray10 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray10);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray10);
        segmentTree17.update((int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100, 100]");
    }

    @Test
    public void test7863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7863");
        int[] intArray6 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        int int12 = segmentTree9.getSum((int) '4', (int) '#');
        int int15 = segmentTree9.getSum((int) (byte) 10, (int) (short) 0);
        int int18 = segmentTree9.getSum((int) (byte) 1, 100);
        int int21 = segmentTree9.getSum((int) ' ', (int) '4');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test7864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7864");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (short) 0, 35);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test7865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7865");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum(100, (int) 'a');
        int int20 = segmentTree5.getSum(1, (int) (short) 0);
        int int23 = segmentTree5.getSum((int) '4', (int) (short) 0);
        int int26 = segmentTree5.getSum((int) ' ', (-1));
        int int29 = segmentTree5.getSum((int) (byte) 100, (int) (byte) 10);
        int int32 = segmentTree5.getSum((int) (byte) 1, (-1));
        int int35 = segmentTree5.getSum((int) (short) 10, (-1));
        int int38 = segmentTree5.getSum(0, (int) (short) -1);
        segmentTree5.update((int) '4', (-1));
        int[] intArray51 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree52 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray51);
        segmentTree52.update((int) (short) 100, 0);
        int int58 = segmentTree52.getSum((int) (short) 0, (int) (short) 0);
        int int61 = segmentTree52.getSum((int) '#', (int) (byte) 10);
        segmentTree52.update((int) (short) 0, 1);
        segmentTree52.update(10, 10);
        segmentTree52.update((int) (short) 10, 0);
        int[] intArray78 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree79 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray78);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree80 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray78);
        int int84 = segmentTree52.constructTree(intArray78, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree85 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray78);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree86 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray78);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree87 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray78);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree88 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray78);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree89 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray78);
        // The following exception was thrown during execution in test generation
        try {
            int int93 = segmentTree5.constructTree(intArray78, 0, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
    }

    @Test
    public void test7866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7866");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (short) 0, 1);
        segmentTree5.update(10, 10);
        int int23 = segmentTree5.getSum((int) ' ', 10);
        segmentTree5.update((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (byte) -1, (int) (byte) 100);
        int int32 = segmentTree5.getSum((int) '#', (int) (byte) 1);
        segmentTree5.update((-1), (int) (byte) 0);
        int int38 = segmentTree5.getSum((int) (short) 10, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7867");
        int[] intArray13 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree20 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree21 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray13);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree22 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree23 = new com.thealgorithms.datastructures.trees.SegmentTree((int) '#', intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 52, 100]");
    }

    @Test
    public void test7868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7868");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, 1);
        int int26 = segmentTree5.getSum((int) (short) -1, 100);
        segmentTree5.update(1, (int) (byte) 0);
        int int32 = segmentTree5.getSum((int) (byte) -1, (int) (short) 0);
        segmentTree5.update(0, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7869");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        int int14 = segmentTree5.getSum((int) (short) 0, (int) (short) -1);
        int int17 = segmentTree5.getSum(10, (int) (short) 0);
        int int20 = segmentTree5.getSum((int) ' ', (int) (byte) 1);
        segmentTree5.update((int) '#', (int) (short) -1);
        int int26 = segmentTree5.getSum((int) (byte) 1, (int) (byte) 10);
        int int29 = segmentTree5.getSum(1, 100);
        java.lang.Class<?> wildcardClass30 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test7870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7870");
        int[] intArray7 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray7);
        segmentTree8.update((int) (short) 100, 0);
        int int14 = segmentTree8.getSum((int) (short) 0, (int) (short) 0);
        int int17 = segmentTree8.getSum((int) '#', (int) (byte) 10);
        segmentTree8.update((int) (short) 0, 1);
        segmentTree8.update(10, 10);
        segmentTree8.update((int) (short) 10, 0);
        int[] intArray34 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray34);
        int int40 = segmentTree8.constructTree(intArray34, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray34);
        segmentTree43.update((int) (byte) 10, 100);
        int int49 = segmentTree43.getSum(0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test7871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7871");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update(0, (int) (short) 1);
        segmentTree5.update((int) (short) 100, 1);
        segmentTree5.update(0, 0);
        int[] intArray30 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree31 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray30);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree32 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray30);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree33 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray30);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = segmentTree5.constructTree(intArray30, 100, (-1), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 52, 100]");
    }

    @Test
    public void test7872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7872");
        int[] intArray12 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        segmentTree13.update((int) ' ', (int) (byte) 10);
        int int19 = segmentTree13.getSum((int) (byte) 10, (int) (byte) -1);
        int int22 = segmentTree13.getSum((int) (byte) -1, (int) 'a');
        segmentTree13.update((int) (short) 100, 100);
        int[] intArray34 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        segmentTree35.update((int) (short) 100, 0);
        int int41 = segmentTree35.getSum((int) (short) 0, (int) (short) 0);
        int int44 = segmentTree35.getSum((int) '#', (int) (byte) 10);
        segmentTree35.update((int) (short) 0, 1);
        segmentTree35.update(10, 10);
        segmentTree35.update((int) (short) 10, 0);
        int[] intArray61 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree62 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree63 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray61);
        int int67 = segmentTree35.constructTree(intArray61, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree68 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree69 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree70 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree71 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray61);
        int int75 = segmentTree13.constructTree(intArray61, 0, (int) (short) 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree76 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree77 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree78 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree79 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree80 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree81 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray61);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree82 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray61);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree83 = new com.thealgorithms.datastructures.trees.SegmentTree(32, intArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test7873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7873");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum((int) '#', (int) (byte) 100);
        int int20 = segmentTree5.getSum((int) (short) 100, (int) (byte) 1);
        segmentTree5.update((int) '4', (int) (byte) 10);
        int int26 = segmentTree5.getSum((int) (byte) 100, 52);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7874");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) 'a', (int) (short) 0);
        segmentTree5.update(100, 10);
        int int17 = segmentTree5.getSum((int) '4', (int) (byte) 100);
        segmentTree5.update((int) (short) 0, (int) 'a');
        int int23 = segmentTree5.getSum((int) (short) 10, (int) 'a');
        int int26 = segmentTree5.getSum(97, (int) (byte) 0);
        segmentTree5.update((int) 'a', (int) ' ');
        int int32 = segmentTree5.getSum(32, (int) 'a');
        int[] intArray46 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree48 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree50 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree51 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree52 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree53 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree54 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray46);
        // The following exception was thrown during execution in test generation
        try {
            int int58 = segmentTree5.constructTree(intArray46, (int) '#', 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 52, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7875");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) 'a', (int) (short) 0);
        segmentTree5.update(100, 10);
        segmentTree5.update((int) (byte) 10, 0);
        segmentTree5.update(10, (int) (byte) 10);
        segmentTree5.update((int) (byte) 10, (-1));
        int int26 = segmentTree5.getSum((int) (byte) 1, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7876");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 1);
        int int23 = segmentTree5.getSum(0, 100);
        segmentTree5.update((int) '#', 10);
        int int29 = segmentTree5.getSum(0, 100);
        int int32 = segmentTree5.getSum(10, (-1));
        int int35 = segmentTree5.getSum((int) 'a', (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test7877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7877");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (short) 0, 1);
        segmentTree5.update(10, 10);
        segmentTree5.update((int) (short) 10, 0);
        int[] intArray31 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree32 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray31);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree33 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray31);
        int int37 = segmentTree5.constructTree(intArray31, (int) (short) 0, 0, (int) (byte) 0);
        int int40 = segmentTree5.getSum((int) 'a', (int) '#');
        segmentTree5.update((int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test7878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7878");
        int[] intArray9 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray9);
        segmentTree10.update((int) (short) 100, 0);
        int int16 = segmentTree10.getSum((int) (short) 0, (int) (short) 0);
        int int19 = segmentTree10.getSum((int) '#', (int) (byte) 10);
        segmentTree10.update((int) (short) 0, 1);
        segmentTree10.update(10, 10);
        segmentTree10.update((int) (short) 10, 0);
        int[] intArray36 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray36);
        int int42 = segmentTree10.constructTree(intArray36, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray36);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray36);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) -1, intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test7879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7879");
        int[] intArray6 = new int[] { 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray6);
        segmentTree11.update((int) 'a', (int) ' ');
        segmentTree11.update(97, (int) '4');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
    }

    @Test
    public void test7880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7880");
        int[] intArray12 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray12);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray12);
        int int22 = segmentTree19.getSum((int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test7881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7881");
        int[] intArray8 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        segmentTree9.update((int) (short) 100, 0);
        int int15 = segmentTree9.getSum((int) (short) 0, (int) (short) 0);
        int int18 = segmentTree9.getSum((int) '#', (int) (byte) 10);
        segmentTree9.update((int) (short) 0, 1);
        segmentTree9.update(10, 10);
        segmentTree9.update((int) (short) 10, 0);
        int[] intArray35 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray35);
        int int41 = segmentTree9.constructTree(intArray35, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray35);
        segmentTree45.update((int) '#', (int) (short) 10);
        segmentTree45.update((int) 'a', (int) (byte) -1);
        segmentTree45.update(0, (int) (byte) 10);
        segmentTree45.update((int) (short) 10, 97);
        segmentTree45.update(0, (int) (byte) 100);
        segmentTree45.update((int) (byte) -1, (int) (short) 1);
        segmentTree45.update((int) '4', 1);
        java.lang.Class<?> wildcardClass67 = segmentTree45.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test7882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7882");
        int[] intArray8 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray8);
        int int14 = segmentTree11.getSum((int) 'a', 100);
        int int17 = segmentTree11.getSum((-1), 10);
        int int20 = segmentTree11.getSum((int) (byte) 10, 100);
        int int23 = segmentTree11.getSum(0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test7883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7883");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) '#');
        int int11 = segmentTree5.getSum((int) (short) 1, 1);
        int int14 = segmentTree5.getSum((int) 'a', 100);
        int int17 = segmentTree5.getSum(10, (int) (byte) 0);
        int[] intArray23 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree24 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray23);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree25 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray23);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = segmentTree5.constructTree(intArray23, (int) (byte) -1, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 52, 100]");
    }

    @Test
    public void test7884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7884");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        segmentTree5.update(100, (-1));
        int int17 = segmentTree5.getSum((int) (short) -1, 10);
        segmentTree5.update(0, (int) (byte) -1);
        int int23 = segmentTree5.getSum(10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test7885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7885");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update(100, (int) (byte) 100);
        int int20 = segmentTree5.getSum((int) (byte) 1, 10);
        segmentTree5.update(0, 10);
        int int26 = segmentTree5.getSum(0, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test7886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7886");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update(10, 100);
        int int17 = segmentTree5.getSum((int) (byte) 1, (int) (byte) 0);
        int int20 = segmentTree5.getSum((int) '4', (int) ' ');
        segmentTree5.update(0, (int) (short) 0);
        segmentTree5.update(0, (int) (byte) 0);
        int int29 = segmentTree5.getSum(52, (int) '#');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7887");
        int[] intArray6 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        segmentTree9.update((int) (byte) -1, 1);
        segmentTree9.update(0, (int) (byte) 10);
        int int18 = segmentTree9.getSum((int) (byte) -1, (int) ' ');
        int int21 = segmentTree9.getSum(10, (int) (byte) 0);
        segmentTree9.update((int) (byte) 10, (int) (short) 10);
        segmentTree9.update((int) (short) -1, (int) (byte) 100);
        segmentTree9.update((int) 'a', (int) (short) 0);
        int[] intArray41 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray41);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray41);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray41);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray41);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray41);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = segmentTree9.constructTree(intArray41, (int) '#', (int) (short) 10, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 52, 100]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7888");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        int int14 = segmentTree5.getSum((int) '#', (int) (short) 100);
        int int17 = segmentTree5.getSum((int) '4', (int) (short) 10);
        segmentTree5.update(0, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test7889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7889");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (short) -1, (int) (byte) -1);
        int[] intArray30 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree31 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray30);
        segmentTree31.update((int) (short) 100, 0);
        int int37 = segmentTree31.getSum((int) (short) 0, (int) (short) 0);
        int int40 = segmentTree31.getSum((int) '#', (int) (byte) 10);
        segmentTree31.update((int) (short) 0, 1);
        segmentTree31.update(10, 10);
        segmentTree31.update((int) (short) 10, 0);
        int[] intArray57 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree58 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray57);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree59 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray57);
        int int63 = segmentTree31.constructTree(intArray57, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree64 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray57);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree65 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray57);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree66 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray57);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree67 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray57);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree68 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray57);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree69 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray57);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree70 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray57);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree71 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray57);
        // The following exception was thrown during execution in test generation
        try {
            int int75 = segmentTree5.constructTree(intArray57, 100, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
    }

    @Test
    public void test7890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7890");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        int int14 = segmentTree5.getSum((int) (byte) -1, (int) 'a');
        segmentTree5.update((int) (byte) 100, (int) 'a');
        int int20 = segmentTree5.getSum((int) '#', (int) (short) -1);
        segmentTree5.update((int) (byte) 10, (int) (byte) 1);
        int[] intArray36 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray36);
        segmentTree37.update((int) (short) 100, 0);
        int int43 = segmentTree37.getSum((int) (short) 0, (int) (short) 0);
        int int46 = segmentTree37.getSum((int) '#', (int) (byte) 10);
        segmentTree37.update((int) (short) 0, 1);
        segmentTree37.update(10, 10);
        segmentTree37.update((int) (short) 10, 0);
        int[] intArray63 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree64 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray63);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree65 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray63);
        int int69 = segmentTree37.constructTree(intArray63, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree70 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray63);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree71 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray63);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree72 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray63);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree73 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray63);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree74 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray63);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree75 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray63);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree76 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray63);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree77 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray63);
        // The following exception was thrown during execution in test generation
        try {
            int int81 = segmentTree5.constructTree(intArray63, 52, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test7891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7891");
        int[] intArray8 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree(35, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 52, 100]");
    }

    @Test
    public void test7892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7892");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (short) 10, 0);
        segmentTree5.update(0, (int) (byte) 0);
        segmentTree5.update((int) 'a', 0);
        segmentTree5.update((int) (byte) 10, (int) (short) -1);
        int int23 = segmentTree5.getSum((-1), (-1));
        segmentTree5.update((int) (short) 0, 35);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test7893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7893");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum(100, (int) 'a');
        int int20 = segmentTree5.getSum(1, (int) (short) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, (int) (byte) 0);
        segmentTree5.update((int) '#', (int) (byte) 10);
        segmentTree5.update(0, (int) (byte) 0);
        int int32 = segmentTree5.getSum(52, (int) (short) 0);
        segmentTree5.update((int) (byte) 1, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7894");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        segmentTree5.update(100, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (byte) -1, (int) (short) 0);
        int[] intArray25 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree26 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray25);
        segmentTree26.update((int) ' ', (int) (byte) 10);
        segmentTree26.update((int) (short) 100, (int) '#');
        segmentTree26.update((int) (byte) 1, (int) (short) -1);
        segmentTree26.update(100, (int) (byte) -1);
        int int41 = segmentTree26.getSum((int) (byte) -1, (int) (short) 0);
        int int44 = segmentTree26.getSum(0, (int) (byte) -1);
        int int47 = segmentTree26.getSum((int) 'a', (int) (short) -1);
        int int50 = segmentTree26.getSum((int) (short) -1, (int) (short) 1);
        int[] intArray59 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree60 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray59);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree61 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray59);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree62 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray59);
        int int66 = segmentTree26.constructTree(intArray59, 0, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int70 = segmentTree5.constructTree(intArray59, (int) (short) 10, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test7895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7895");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (byte) 1, 0);
        int int11 = segmentTree5.getSum((int) 'a', (int) (byte) 10);
        int int14 = segmentTree5.getSum((int) 'a', (int) (byte) -1);
        int int17 = segmentTree5.getSum(10, (int) (short) 100);
        int int20 = segmentTree5.getSum((int) (byte) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 0, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7896");
        int[] intArray8 = new int[] { 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100]");
    }

    @Test
    public void test7897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7897");
        int[] intArray8 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        segmentTree13.update(1, (int) (short) -1);
        segmentTree13.update((int) ' ', (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = segmentTree13.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7898");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (byte) 1, (int) (byte) 1);
        segmentTree5.update((int) (short) 0, (int) (short) 10);
        segmentTree5.update((int) (byte) 100, (int) (byte) 1);
        int int26 = segmentTree5.getSum((int) 'a', (int) (byte) -1);
        int int29 = segmentTree5.getSum((int) (short) 10, (-1));
        int[] intArray38 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray38);
        segmentTree39.update((int) (short) 100, 0);
        int int45 = segmentTree39.getSum((int) (short) 0, (int) (short) 0);
        int int48 = segmentTree39.getSum((int) '#', (int) (byte) 10);
        segmentTree39.update((int) (short) 0, 1);
        segmentTree39.update(10, 10);
        segmentTree39.update((int) (short) 10, 0);
        int[] intArray65 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree66 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray65);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree67 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray65);
        int int71 = segmentTree39.constructTree(intArray65, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree72 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray65);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree73 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray65);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree74 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray65);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree75 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray65);
        // The following exception was thrown during execution in test generation
        try {
            int int79 = segmentTree5.constructTree(intArray65, (int) (byte) 0, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
    }

    @Test
    public void test7899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7899");
        int[] intArray11 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7900");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        segmentTree5.update(100, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (byte) -1, (int) (short) 0);
        segmentTree5.update((int) ' ', (-1));
        segmentTree5.update((int) 'a', 97);
        segmentTree5.update((int) '#', (int) (byte) 1);
        int[] intArray34 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        segmentTree35.update((int) ' ', (int) (byte) 10);
        int int41 = segmentTree35.getSum(0, (int) (short) 1);
        segmentTree35.update((int) (byte) 100, 0);
        int int47 = segmentTree35.getSum((int) (byte) 0, 0);
        int int50 = segmentTree35.getSum(100, (int) 'a');
        int int53 = segmentTree35.getSum(0, (int) (short) -1);
        int int56 = segmentTree35.getSum(1, (int) (short) 10);
        int int59 = segmentTree35.getSum((-1), (int) (short) 100);
        int int62 = segmentTree35.getSum((int) (short) -1, (int) (short) 100);
        int[] intArray73 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree74 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray73);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree75 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray73);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree76 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray73);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree77 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray73);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree78 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray73);
        int int82 = segmentTree35.constructTree(intArray73, (int) (short) 0, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int86 = segmentTree5.constructTree(intArray73, (int) '#', 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
    }

    @Test
    public void test7901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7901");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        int int14 = segmentTree5.getSum((int) (byte) -1, (int) 'a');
        segmentTree5.update((int) (byte) 100, (int) 'a');
        int int20 = segmentTree5.getSum((int) '#', (int) (short) -1);
        int int23 = segmentTree5.getSum((int) (short) 1, 1);
        int[] intArray34 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = segmentTree5.constructTree(intArray34, (-1), 32, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 52, 100]");
    }

    @Test
    public void test7902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7902");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        segmentTree5.update((int) (byte) 100, (int) (short) 1);
        int int17 = segmentTree5.getSum(0, 1);
        segmentTree5.update((int) (byte) -1, (-1));
        int int23 = segmentTree5.getSum(0, (int) (short) 100);
        segmentTree5.update((int) (short) 1, (int) (short) -1);
        segmentTree5.update(0, (int) (short) 100);
        int int32 = segmentTree5.getSum((int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7903");
        int[] intArray8 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree10 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray8);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        segmentTree11.update((int) ' ', 0);
        int int17 = segmentTree11.getSum((int) (byte) 100, (int) (short) 10);
        int int20 = segmentTree11.getSum(97, (int) ' ');
        segmentTree11.update(97, 52);
        segmentTree11.update((int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test7904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7904");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) 10);
        segmentTree5.update((int) (short) 0, (-1));
        int int23 = segmentTree5.getSum((int) (byte) -1, (int) (short) -1);
        int int26 = segmentTree5.getSum((-1), (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7905");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update(0, (int) (short) 1);
        int int20 = segmentTree5.getSum((int) (byte) 0, 52);
        segmentTree5.update((int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test7906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7906");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        int int17 = segmentTree5.getSum((-1), 0);
        int int20 = segmentTree5.getSum((int) (short) 100, (int) (short) -1);
        segmentTree5.update(0, (int) '4');
        int int26 = segmentTree5.getSum((int) (short) -1, (int) (short) -1);
        int int29 = segmentTree5.getSum(35, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, -1, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7907");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) 'a', (int) (short) 0);
        segmentTree5.update(100, 10);
        segmentTree5.update((int) (byte) 10, 0);
        segmentTree5.update(10, (int) (byte) 10);
        segmentTree5.update((int) '#', (int) (short) -1);
        segmentTree5.update((int) (byte) 0, (int) (short) 1);
        int int29 = segmentTree5.getSum((int) (byte) -1, (int) (byte) 10);
        int int32 = segmentTree5.getSum((-1), 0);
        segmentTree5.update((int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 100]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test7908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7908");
        int[] intArray10 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray10);
        segmentTree11.update((int) (short) 100, 0);
        int int17 = segmentTree11.getSum((int) (short) 0, (int) (short) 0);
        int int20 = segmentTree11.getSum((int) '#', (int) (byte) 10);
        segmentTree11.update((int) (short) 0, 1);
        segmentTree11.update(10, 10);
        segmentTree11.update((int) (short) 10, 0);
        int[] intArray37 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray37);
        int int43 = segmentTree11.constructTree(intArray37, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree48 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        segmentTree49.update((int) (short) 10, (int) (short) 10);
        segmentTree49.update(52, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test7909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7909");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) (short) -1, (int) (short) 100);
        segmentTree5.update((int) (short) 1, (int) (short) 0);
        segmentTree5.update(0, (int) (byte) 100);
        int int20 = segmentTree5.getSum(0, (int) (short) 0);
        segmentTree5.update((int) '#', (int) (byte) 10);
        int[] intArray34 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree35 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray34);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray34);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = segmentTree5.constructTree(intArray34, (int) (byte) 1, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 0, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7910");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update(10, 100);
        int int17 = segmentTree5.getSum((int) (byte) 100, (int) ' ');
        segmentTree5.update((-1), (-1));
        int int23 = segmentTree5.getSum(0, (int) (short) 1);
        int int26 = segmentTree5.getSum((int) (byte) 1, (int) (byte) 10);
        segmentTree5.update(10, (int) (short) 0);
        segmentTree5.update((int) (byte) 100, 52);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7911");
        int[] intArray6 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        segmentTree7.update((int) ' ', (int) (byte) 10);
        int int13 = segmentTree7.getSum((int) (byte) 10, (int) (byte) -1);
        int int16 = segmentTree7.getSum((int) (byte) -1, (int) 'a');
        segmentTree7.update((int) (short) 100, 100);
        int[] intArray28 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree29 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray28);
        segmentTree29.update((int) (short) 100, 0);
        int int35 = segmentTree29.getSum((int) (short) 0, (int) (short) 0);
        int int38 = segmentTree29.getSum((int) '#', (int) (byte) 10);
        segmentTree29.update((int) (short) 0, 1);
        segmentTree29.update(10, 10);
        segmentTree29.update((int) (short) 10, 0);
        int[] intArray55 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree56 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray55);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree57 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray55);
        int int61 = segmentTree29.constructTree(intArray55, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree62 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray55);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree63 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray55);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree64 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray55);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree65 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray55);
        int int69 = segmentTree7.constructTree(intArray55, 0, (int) (short) 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree70 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray55);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree71 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray55);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test7912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7912");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        int int14 = segmentTree5.getSum((int) (byte) -1, (int) 'a');
        segmentTree5.update((int) (short) 100, 100);
        int int20 = segmentTree5.getSum(10, (int) (byte) -1);
        segmentTree5.update((int) '4', (int) ' ');
        segmentTree5.update((-1), (-1));
        int[] intArray37 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        segmentTree38.update((int) (short) 100, 0);
        int int44 = segmentTree38.getSum((int) (short) 0, (int) (short) 0);
        int int47 = segmentTree38.getSum((int) '#', (int) (byte) 10);
        segmentTree38.update((int) (short) 0, 1);
        segmentTree38.update(10, 10);
        segmentTree38.update((int) (short) 10, 0);
        int[] intArray64 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree65 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray64);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree66 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray64);
        int int70 = segmentTree38.constructTree(intArray64, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree71 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray64);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree72 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray64);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree73 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray64);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree74 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray64);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree75 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray64);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree76 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray64);
        // The following exception was thrown during execution in test generation
        try {
            int int80 = segmentTree5.constructTree(intArray64, 32, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
    }

    @Test
    public void test7913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7913");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update(100, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7914");
        int[] intArray11 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7915");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update(0, (int) (short) 1);
        int int20 = segmentTree5.getSum(100, (int) (short) -1);
        segmentTree5.update((int) '#', (int) (short) 0);
        int int26 = segmentTree5.getSum((int) (byte) -1, 1);
        int[] intArray36 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray36);
        segmentTree37.update((int) (short) 100, 0);
        int int43 = segmentTree37.getSum((int) (short) 0, (int) (short) 0);
        int int46 = segmentTree37.getSum((int) '#', (int) (byte) 10);
        segmentTree37.update((int) (short) 0, 1);
        segmentTree37.update(10, 10);
        segmentTree37.update((int) (short) 10, 0);
        int[] intArray63 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree64 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray63);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree65 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray63);
        int int69 = segmentTree37.constructTree(intArray63, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree70 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray63);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree71 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray63);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree72 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray63);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree73 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray63);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree74 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray63);
        // The following exception was thrown during execution in test generation
        try {
            int int78 = segmentTree5.constructTree(intArray63, (int) 'a', (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test7916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7916");
        int[] intArray10 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree11 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray10);
        segmentTree11.update((int) (short) 100, 0);
        int int17 = segmentTree11.getSum((int) (short) 0, (int) (short) 0);
        int int20 = segmentTree11.getSum((int) '#', (int) (byte) 10);
        segmentTree11.update((int) (short) 0, 1);
        segmentTree11.update(10, 10);
        segmentTree11.update((int) (short) 10, 0);
        int[] intArray37 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray37);
        int int43 = segmentTree11.constructTree(intArray37, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree48 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        java.lang.Class<?> wildcardClass50 = intArray37.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test7917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7917");
        int[] intArray11 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree13 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree14 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray11);
        int int20 = segmentTree17.getSum((int) (byte) 1, (int) '#');
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test7918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7918");
        int[] intArray8 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray8);
        segmentTree9.update((int) (short) 100, 0);
        int int15 = segmentTree9.getSum((int) (short) 0, (int) (short) 0);
        int int18 = segmentTree9.getSum((int) '#', (int) (byte) 10);
        segmentTree9.update((int) (short) 0, 1);
        segmentTree9.update(10, 10);
        segmentTree9.update((int) (short) 10, 0);
        int[] intArray35 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree36 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree37 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray35);
        int int41 = segmentTree9.constructTree(intArray35, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray35);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray35);
        int int48 = segmentTree45.getSum((int) (byte) 1, 52);
        int int51 = segmentTree45.getSum((int) (byte) 1, 100);
        int int54 = segmentTree45.getSum((int) (byte) -1, 100);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test7919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7919");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        int int17 = segmentTree5.getSum((-1), 0);
        int int20 = segmentTree5.getSum((int) (short) 100, (int) (short) -1);
        segmentTree5.update(0, (int) '4');
        int int26 = segmentTree5.getSum((int) (short) -1, (int) (short) -1);
        int int29 = segmentTree5.getSum(0, (int) 'a');
        int[] intArray37 = new int[] { 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree38 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray37);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray37);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = segmentTree5.constructTree(intArray37, 35, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, -1, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100]");
    }

    @Test
    public void test7920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7920");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (short) 0, 1);
        segmentTree5.update(10, 10);
        int int23 = segmentTree5.getSum((int) ' ', 10);
        segmentTree5.update((int) '#', (int) (byte) 10);
        segmentTree5.update((int) ' ', (int) (short) 100);
        segmentTree5.update(10, (int) ' ');
        segmentTree5.update(100, (int) (short) -1);
        int int38 = segmentTree5.getSum((int) 'a', 97);
        segmentTree5.update(0, (int) (short) 100);
        int int44 = segmentTree5.getSum((int) '4', (int) (byte) -1);
        int int47 = segmentTree5.getSum((int) ' ', (int) (byte) 10);
        int[] intArray55 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree56 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray55);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree57 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray55);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree58 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray55);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree59 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray55);
        // The following exception was thrown during execution in test generation
        try {
            int int63 = segmentTree5.constructTree(intArray55, 52, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[100, 52, 100]");
    }

    @Test
    public void test7921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7921");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum(100, (int) 'a');
        int int20 = segmentTree5.getSum(1, (int) (short) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, (int) (byte) 0);
        segmentTree5.update(10, (int) (byte) -1);
        int int29 = segmentTree5.getSum((int) (short) 10, 10);
        segmentTree5.update((int) (byte) 1, 1);
        int int35 = segmentTree5.getSum((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test7922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7922");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        segmentTree5.update((-1), (-1));
        int int26 = segmentTree5.getSum(100, (int) (short) 0);
        int int29 = segmentTree5.getSum((int) ' ', (int) (short) -1);
        int int32 = segmentTree5.getSum(10, (int) (short) 10);
        int int35 = segmentTree5.getSum((int) (short) -1, (int) 'a');
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int41 = segmentTree5.getSum(10, (-1));
        int int44 = segmentTree5.getSum((int) (short) 0, 1);
        segmentTree5.update((int) (byte) 10, (int) (short) 1);
        segmentTree5.update((int) (byte) 1, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
    }

    @Test
    public void test7923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7923");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((-1), (int) (byte) -1);
        segmentTree5.update((-1), (int) (short) 1);
        segmentTree5.update((int) (short) 0, (int) (byte) 0);
        int int20 = segmentTree5.getSum((int) (byte) 100, (int) (byte) 0);
        segmentTree5.update(32, (int) (short) 1);
        int int26 = segmentTree5.getSum((int) (short) 0, 0);
        segmentTree5.update((int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass30 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test7924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7924");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (byte) -1, (int) '#');
        segmentTree5.update((int) ' ', (int) (short) -1);
        int int23 = segmentTree5.getSum((int) 'a', (int) (byte) 10);
        int int26 = segmentTree5.getSum((int) (short) 1, (int) '4');
        segmentTree5.update(10, (int) '#');
        int int32 = segmentTree5.getSum((int) (byte) 10, 0);
        int[] intArray43 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray43);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray43);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray43);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray43);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree48 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray43);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = segmentTree5.constructTree(intArray43, (int) '#', 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7925");
        int[] intArray7 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray7);
        segmentTree8.update((int) ' ', (int) (byte) 10);
        segmentTree8.update((int) (short) 100, (int) '#');
        segmentTree8.update((int) (byte) 1, (int) (short) -1);
        int int20 = segmentTree8.getSum((-1), 0);
        int int23 = segmentTree8.getSum((int) 'a', (int) '#');
        int int26 = segmentTree8.getSum((int) '#', 100);
        segmentTree8.update((int) ' ', (int) (short) 1);
        segmentTree8.update((int) (short) 10, (int) '#');
        int int35 = segmentTree8.getSum((int) (short) 10, (int) '#');
        int[] intArray46 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree48 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree50 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree51 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray46);
        int int55 = segmentTree8.constructTree(intArray46, 0, 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree56 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree57 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray46);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree58 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray46);
        segmentTree58.update(32, (int) ' ');
        int int64 = segmentTree58.getSum((int) (short) 100, 100);
        segmentTree58.update(0, (int) '#');
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[35, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test7926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7926");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (short) 0, 1);
        segmentTree5.update(10, 10);
        int int23 = segmentTree5.getSum((int) ' ', 10);
        segmentTree5.update((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (byte) 0, 1);
        int int32 = segmentTree5.getSum((int) (byte) 0, (int) (short) 1);
        int int35 = segmentTree5.getSum((int) ' ', (int) 'a');
        segmentTree5.update(52, 97);
        int int41 = segmentTree5.getSum((int) (short) 10, (int) (short) 100);
        int int44 = segmentTree5.getSum((int) (short) 1, (int) (byte) 100);
        segmentTree5.update(10, 35);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test7927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7927");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, (int) '4');
        int int26 = segmentTree5.getSum((int) (byte) 10, (int) 'a');
        int int29 = segmentTree5.getSum((int) (short) -1, (int) (short) 0);
        int int32 = segmentTree5.getSum(0, 100);
        java.lang.Class<?> wildcardClass33 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7928");
        int[] intArray14 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree15 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray14);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree16 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray14);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree17 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray14);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree18 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray14);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree19 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray14);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree20 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray14);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree21 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray14);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree22 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree23 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 10, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 97, -1, 1, 0]");
    }

    @Test
    public void test7929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7929");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (short) 10, 0);
        int int14 = segmentTree5.getSum((int) (short) -1, 1);
        segmentTree5.update((int) 'a', 100);
        java.lang.Class<?> wildcardClass18 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7930");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update(10, 100);
        int int17 = segmentTree5.getSum((int) (byte) 100, (int) ' ');
        int int20 = segmentTree5.getSum((int) (byte) 1, (int) '4');
        int int23 = segmentTree5.getSum((int) (short) -1, 1);
        segmentTree5.update((int) 'a', (int) (byte) 1);
        int int29 = segmentTree5.getSum((int) (byte) 1, (int) (byte) 100);
        int int32 = segmentTree5.getSum((int) (short) 10, (int) (byte) 0);
        int[] intArray39 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray39);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree41 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray39);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray39);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = segmentTree5.constructTree(intArray39, (int) (byte) -1, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 52, 100]");
    }

    @Test
    public void test7931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7931");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update(97, (int) (byte) 1);
        segmentTree5.update((int) (short) 10, (int) (short) 1);
        segmentTree5.update((int) (short) 10, (int) (byte) 10);
        int[] intArray26 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree27 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray26);
        segmentTree27.update((int) (short) 100, 0);
        segmentTree27.update((int) 'a', (int) (short) 0);
        segmentTree27.update(100, 10);
        segmentTree27.update((int) (byte) 10, 0);
        segmentTree27.update(10, (int) (byte) 10);
        int[] intArray54 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree55 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree56 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree57 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree58 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree59 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray54);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree60 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray54);
        int int64 = segmentTree27.constructTree(intArray54, 0, (int) (short) 0, 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree65 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray54);
        // The following exception was thrown during execution in test generation
        try {
            int int69 = segmentTree5.constructTree(intArray54, (int) (byte) 100, 32, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 52, 100]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test7932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7932");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum(0, (int) (short) 1);
        segmentTree5.update((int) (byte) 100, 0);
        segmentTree5.update((int) (byte) -1, (int) '#');
        segmentTree5.update((int) ' ', (int) (short) -1);
        int int23 = segmentTree5.getSum((int) 'a', (int) (byte) 10);
        segmentTree5.update(10, 100);
        segmentTree5.update(35, 32);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test7933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7933");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update(1, 10);
        int int20 = segmentTree5.getSum((int) (short) 10, (int) (short) -1);
        int int23 = segmentTree5.getSum((int) (short) 100, (-1));
        int int26 = segmentTree5.getSum((int) (short) 100, (int) ' ');
        segmentTree5.update(97, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7934");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (byte) 1, (int) (byte) 100);
        int int17 = segmentTree5.getSum(100, (int) 'a');
        int int20 = segmentTree5.getSum(1, (int) (short) 0);
        int int23 = segmentTree5.getSum((int) (byte) 100, (int) (byte) 0);
        segmentTree5.update((int) '#', (int) (byte) 10);
        int int29 = segmentTree5.getSum((int) '#', (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7935");
        int[] intArray6 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree7 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray6);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree9 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray6);
        int int12 = segmentTree9.getSum((int) ' ', (int) (short) 0);
        int int15 = segmentTree9.getSum((int) (short) 100, (int) '4');
        int int18 = segmentTree9.getSum((int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test7936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7936");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update(10, 100);
        int int17 = segmentTree5.getSum((int) (byte) 100, (int) ' ');
        int int20 = segmentTree5.getSum((int) (byte) 1, (int) '4');
        segmentTree5.update((int) (short) 1, (int) (byte) 10);
        segmentTree5.update(0, (int) (byte) 0);
        segmentTree5.update((int) (byte) 100, (int) '#');
        int int32 = segmentTree5.getSum(100, (int) (byte) -1);
        segmentTree5.update(0, (-1));
        int[] intArray42 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray42);
        segmentTree43.update((int) ' ', (int) (byte) 10);
        segmentTree43.update((int) (short) 100, (int) '#');
        segmentTree43.update((int) (byte) 1, (int) (short) -1);
        segmentTree43.update(10, (-1));
        int int58 = segmentTree43.getSum(0, (int) (short) 1);
        segmentTree43.update((int) '4', (int) (byte) 100);
        segmentTree43.update((int) 'a', 0);
        int[] intArray77 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree78 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray77);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree79 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray77);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree80 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray77);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree81 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray77);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree82 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray77);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree83 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray77);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree84 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray77);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree85 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray77);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree86 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray77);
        int int90 = segmentTree43.constructTree(intArray77, (int) (byte) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree91 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray77);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree92 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray77);
        // The following exception was thrown during execution in test generation
        try {
            int int96 = segmentTree5.constructTree(intArray77, 0, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[100, 52, 100]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 100 + "'", int90 == 100);
    }

    @Test
    public void test7937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7937");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        segmentTree5.update((int) (short) 10, 1);
        int int17 = segmentTree5.getSum((int) (short) -1, (int) (byte) -1);
        int int20 = segmentTree5.getSum((int) (short) -1, (int) (byte) 0);
        segmentTree5.update((-1), (-1));
        int int26 = segmentTree5.getSum(100, (int) (short) 0);
        int int29 = segmentTree5.getSum((int) ' ', (int) (short) -1);
        int int32 = segmentTree5.getSum(10, (int) (short) 10);
        int int35 = segmentTree5.getSum((int) (short) -1, (int) 'a');
        int int38 = segmentTree5.getSum((int) (byte) 1, 10);
        segmentTree5.update((int) (byte) 0, 52);
        int int44 = segmentTree5.getSum((int) (byte) 1, 0);
        segmentTree5.update((-1), 0);
        int int50 = segmentTree5.getSum(10, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test7938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7938");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        int int11 = segmentTree5.getSum((int) (byte) 10, (int) (byte) -1);
        int int14 = segmentTree5.getSum((int) (byte) -1, (int) 'a');
        segmentTree5.update((int) (short) 100, 100);
        int int20 = segmentTree5.getSum(10, (int) (byte) -1);
        segmentTree5.update(0, (int) (byte) 10);
        segmentTree5.update((int) '4', (int) (short) 1);
        segmentTree5.update((int) (byte) 1, 32);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 32, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test7939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7939");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        segmentTree5.update((int) 'a', (int) (short) 0);
        segmentTree5.update(100, 10);
        segmentTree5.update((int) (byte) 1, 10);
        segmentTree5.update((int) (byte) -1, 100);
        segmentTree5.update(0, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 10, 100]");
    }

    @Test
    public void test7940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7940");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (short) 0, 1);
        segmentTree5.update(10, 10);
        int int23 = segmentTree5.getSum((int) ' ', 10);
        segmentTree5.update((int) '#', (int) (byte) 10);
        int int29 = segmentTree5.getSum((int) (short) 10, (int) ' ');
        segmentTree5.update((int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7941");
        int[] intArray11 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree12 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray11);
        segmentTree12.update((int) (short) 100, 0);
        int int18 = segmentTree12.getSum((int) (short) 0, (int) (short) 0);
        int int21 = segmentTree12.getSum((int) '#', (int) (byte) 10);
        segmentTree12.update((int) (short) 0, 1);
        segmentTree12.update(10, 10);
        segmentTree12.update((int) (short) 10, 0);
        int[] intArray38 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree39 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree40 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray38);
        int int44 = segmentTree12.constructTree(intArray38, (int) (short) 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree45 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree46 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree47 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree48 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree50 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray38);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree51 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray38);
        java.lang.Class<?> wildcardClass52 = intArray38.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test7942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7942");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) (short) 100, 0);
        int int11 = segmentTree5.getSum((int) (short) 0, (int) (short) 0);
        int int14 = segmentTree5.getSum((int) '#', (int) (byte) 10);
        segmentTree5.update((int) (short) 0, 1);
        segmentTree5.update((int) '#', (int) (byte) 0);
        int int23 = segmentTree5.getSum((int) (byte) 0, 1);
        int int26 = segmentTree5.getSum(100, 0);
        int int29 = segmentTree5.getSum(0, 0);
        segmentTree5.update((int) (short) 10, (int) ' ');
        java.lang.Class<?> wildcardClass33 = segmentTree5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7943");
        int[] intArray4 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree5 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray4);
        segmentTree5.update((int) ' ', (int) (byte) 10);
        segmentTree5.update((int) (short) 100, (int) '#');
        segmentTree5.update((int) (byte) 1, (int) (short) -1);
        segmentTree5.update(10, (-1));
        int int20 = segmentTree5.getSum((int) (byte) 1, (int) (short) 100);
        segmentTree5.update((int) (short) 100, 0);
        int int26 = segmentTree5.getSum((-1), (int) ' ');
        segmentTree5.update((int) 'a', (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7944");
        int[] intArray7 = new int[] { (byte) 100, '4', 100 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree8 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray7);
        segmentTree8.update((int) ' ', (int) (byte) 10);
        segmentTree8.update((int) (short) 100, (int) '#');
        segmentTree8.update((int) (byte) 1, (int) (short) -1);
        segmentTree8.update(100, (int) (byte) -1);
        int int23 = segmentTree8.getSum((int) (byte) -1, (int) (short) 0);
        int int26 = segmentTree8.getSum(0, (int) (byte) -1);
        int int29 = segmentTree8.getSum((int) 'a', (int) (short) -1);
        int int32 = segmentTree8.getSum((int) (short) -1, (int) (short) 1);
        int[] intArray41 = new int[] { (short) -1, 'a', (byte) -1, (short) 1, 0 };
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree42 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (byte) 1, intArray41);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree43 = new com.thealgorithms.datastructures.trees.SegmentTree((int) (short) 1, intArray41);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree44 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray41);
        int int48 = segmentTree8.constructTree(intArray41, 0, 0, (int) (byte) 0);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree49 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray41);
        com.thealgorithms.datastructures.trees.SegmentTree segmentTree50 = new com.thealgorithms.datastructures.trees.SegmentTree(1, intArray41);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.trees.SegmentTree segmentTree51 = new com.thealgorithms.datastructures.trees.SegmentTree(35, intArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, -1, 100]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[-1, 97, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }
}

