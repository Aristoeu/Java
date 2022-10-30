package MinimumPathSum;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass2 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        java.lang.Class<?> wildcardClass1 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass2 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass2 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass3 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"grid\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass3 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass4 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass3 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int[] intArray5 = new int[] { '4', '4', '4', 1, ' ' };
        int[] intArray11 = new int[] { '4', '4', '4', 1, ' ' };
        int[] intArray17 = new int[] { '4', '4', '4', 1, ' ' };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int19 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray18);
        java.lang.Class<?> wildcardClass20 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 52, 52, 1, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 52, 52, 1, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 52, 52, 1, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 191 + "'", int19 == 191);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass4 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        int int7 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        java.lang.Class<?> wildcardClass8 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass2 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass4 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass4 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        int[] intArray5 = new int[] { (short) 10, (-1), '#', 10, 356 };
        int[] intArray11 = new int[] { (short) 10, (-1), '#', 10, 356 };
        int[] intArray17 = new int[] { (short) 10, (-1), '#', 10, 356 };
        int[] intArray23 = new int[] { (short) 10, (-1), '#', 10, 356 };
        int[] intArray29 = new int[] { (short) 10, (-1), '#', 10, 356 };
        int[] intArray35 = new int[] { (short) 10, (-1), '#', 10, 356 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        int int37 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        java.lang.Class<?> wildcardClass38 = intArray36.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 35, 10, 356]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, -1, 35, 10, 356]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, -1, 35, 10, 356]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, -1, 35, 10, 356]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, -1, 35, 10, 356]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[10, -1, 35, 10, 356]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 405 + "'", int37 == 405);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        int[] intArray4 = new int[] { 'a', (byte) 1, (short) -1, 191 };
        int[] intArray9 = new int[] { 'a', (byte) 1, (short) -1, 191 };
        int[] intArray14 = new int[] { 'a', (byte) 1, (short) -1, 191 };
        int[] intArray19 = new int[] { 'a', (byte) 1, (short) -1, 191 };
        int[] intArray24 = new int[] { 'a', (byte) 1, (short) -1, 191 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        int int26 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray25);
        java.lang.Class<?> wildcardClass27 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 1, -1, 191]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 1, -1, 191]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 1, -1, 191]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 1, -1, 191]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 1, -1, 191]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 284 + "'", int26 == 284);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass4 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        int int7 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        java.lang.Class<?> wildcardClass10 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        int[] intArray3 = new int[] { (byte) 100, '4', 100 };
        int[] intArray7 = new int[] { (byte) 100, '4', 100 };
        int[] intArray11 = new int[] { (byte) 100, '4', 100 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        int int13 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray12);
        java.lang.Class<?> wildcardClass14 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 52, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 52, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 356 + "'", int13 == 356);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass3 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass3 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass4 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        int[] intArray3 = new int[] { (byte) 100, '4', 100 };
        int[] intArray7 = new int[] { (byte) 100, '4', 100 };
        int[] intArray11 = new int[] { (byte) 100, '4', 100 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        int int13 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray12);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray12);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray12);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray12);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 52, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 52, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 356 + "'", int13 == 356);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 356 + "'", int14 == 356);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 356 + "'", int15 == 356);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 356 + "'", int16 == 356);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        int int7 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        java.lang.Class<?> wildcardClass12 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass3 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass14 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass4 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass4 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass3 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass4 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        int[] intArray5 = new int[] { (short) 10, (-1), '#', 10, 356 };
        int[] intArray11 = new int[] { (short) 10, (-1), '#', 10, 356 };
        int[] intArray17 = new int[] { (short) 10, (-1), '#', 10, 356 };
        int[] intArray23 = new int[] { (short) 10, (-1), '#', 10, 356 };
        int[] intArray29 = new int[] { (short) 10, (-1), '#', 10, 356 };
        int[] intArray35 = new int[] { (short) 10, (-1), '#', 10, 356 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        int int37 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int38 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int39 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int40 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int41 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        java.lang.Class<?> wildcardClass42 = intArray36.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 35, 10, 356]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, -1, 35, 10, 356]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, -1, 35, 10, 356]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, -1, 35, 10, 356]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, -1, 35, 10, 356]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[10, -1, 35, 10, 356]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 405 + "'", int37 == 405);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 405 + "'", int38 == 405);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 405 + "'", int39 == 405);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 405 + "'", int40 == 405);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 405 + "'", int41 == 405);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        int[] intArray5 = new int[] { (short) 10, (short) 1, (short) -1, 10, (short) 0 };
        int[] intArray11 = new int[] { (short) 10, (short) 1, (short) -1, 10, (short) 0 };
        int[] intArray17 = new int[] { (short) 10, (short) 1, (short) -1, 10, (short) 0 };
        int[] intArray23 = new int[] { (short) 10, (short) 1, (short) -1, 10, (short) 0 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        int int25 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray24);
        java.lang.Class<?> wildcardClass26 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 1, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 1, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 1, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 17 + "'", int25 == 17);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        int[] intArray5 = new int[] { '4', '4', '4', 1, ' ' };
        int[] intArray11 = new int[] { '4', '4', '4', 1, ' ' };
        int[] intArray17 = new int[] { '4', '4', '4', 1, ' ' };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int19 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray18);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray18);
        int int21 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray18);
        int int22 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray18);
        int int23 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray18);
        int int24 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray18);
        java.lang.Class<?> wildcardClass25 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 52, 52, 1, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 52, 52, 1, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 52, 52, 1, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 191 + "'", int19 == 191);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 191 + "'", int20 == 191);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 191 + "'", int21 == 191);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 191 + "'", int22 == 191);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 191 + "'", int23 == 191);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 191 + "'", int24 == 191);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        int[] intArray2 = new int[] { (short) 0, 356 };
        int[] intArray5 = new int[] { (short) 0, 356 };
        int[] intArray8 = new int[] { (short) 0, 356 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        int int10 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray9);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray9);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray9);
        java.lang.Class<?> wildcardClass13 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 356]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 356]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 356]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 356 + "'", int10 == 356);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 356 + "'", int11 == 356);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 356 + "'", int12 == 356);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass4 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        int int7 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        int int7 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass4 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass15 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass14 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass4 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass17 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass4 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        int[] intArray3 = new int[] { (byte) 100, '4', 100 };
        int[] intArray7 = new int[] { (byte) 100, '4', 100 };
        int[] intArray11 = new int[] { (byte) 100, '4', 100 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        int int13 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray12);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray12);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 52, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 52, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 356 + "'", int13 == 356);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 356 + "'", int14 == 356);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass15 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        int[] intArray2 = new int[] { (short) 0, 356 };
        int[] intArray5 = new int[] { (short) 0, 356 };
        int[] intArray8 = new int[] { (short) 0, 356 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        int int10 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray9);
        java.lang.Class<?> wildcardClass11 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 356]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 356]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 356]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 356 + "'", int10 == 356);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass14 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass14 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        int[] intArray5 = new int[] { '4', '4', '4', 1, ' ' };
        int[] intArray11 = new int[] { '4', '4', '4', 1, ' ' };
        int[] intArray17 = new int[] { '4', '4', '4', 1, ' ' };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int19 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray18);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray18);
        int int21 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray18);
        int int22 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray18);
        int int23 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray18);
        java.lang.Class<?> wildcardClass24 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 52, 52, 1, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 52, 52, 1, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 52, 52, 1, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 191 + "'", int19 == 191);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 191 + "'", int20 == 191);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 191 + "'", int21 == 191);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 191 + "'", int22 == 191);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 191 + "'", int23 == 191);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        int[] intArray5 = new int[] { (short) 10, (-1), '#', 10, 356 };
        int[] intArray11 = new int[] { (short) 10, (-1), '#', 10, 356 };
        int[] intArray17 = new int[] { (short) 10, (-1), '#', 10, 356 };
        int[] intArray23 = new int[] { (short) 10, (-1), '#', 10, 356 };
        int[] intArray29 = new int[] { (short) 10, (-1), '#', 10, 356 };
        int[] intArray35 = new int[] { (short) 10, (-1), '#', 10, 356 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        int int37 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int38 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int39 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int40 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int41 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int42 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int43 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int44 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int45 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int46 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int47 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int48 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int49 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int50 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int51 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        java.lang.Class<?> wildcardClass52 = intArray36.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 35, 10, 356]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, -1, 35, 10, 356]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, -1, 35, 10, 356]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, -1, 35, 10, 356]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, -1, 35, 10, 356]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[10, -1, 35, 10, 356]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 405 + "'", int37 == 405);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 405 + "'", int38 == 405);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 405 + "'", int39 == 405);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 405 + "'", int40 == 405);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 405 + "'", int41 == 405);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 405 + "'", int42 == 405);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 405 + "'", int43 == 405);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 405 + "'", int44 == 405);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 405 + "'", int45 == 405);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 405 + "'", int46 == 405);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 405 + "'", int47 == 405);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 405 + "'", int48 == 405);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 405 + "'", int49 == 405);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 405 + "'", int50 == 405);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 405 + "'", int51 == 405);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass14 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass14 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        int[] intArray5 = new int[] { (short) 10, (-1), '#', 10, 356 };
        int[] intArray11 = new int[] { (short) 10, (-1), '#', 10, 356 };
        int[] intArray17 = new int[] { (short) 10, (-1), '#', 10, 356 };
        int[] intArray23 = new int[] { (short) 10, (-1), '#', 10, 356 };
        int[] intArray29 = new int[] { (short) 10, (-1), '#', 10, 356 };
        int[] intArray35 = new int[] { (short) 10, (-1), '#', 10, 356 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        int int37 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int38 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int39 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int40 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int41 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int42 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int43 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        int int44 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray36);
        java.lang.Class<?> wildcardClass45 = intArray36.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 35, 10, 356]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, -1, 35, 10, 356]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, -1, 35, 10, 356]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, -1, 35, 10, 356]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, -1, 35, 10, 356]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[10, -1, 35, 10, 356]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 405 + "'", int37 == 405);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 405 + "'", int38 == 405);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 405 + "'", int39 == 405);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 405 + "'", int40 == 405);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 405 + "'", int41 == 405);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 405 + "'", int42 == 405);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 405 + "'", int43 == 405);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 405 + "'", int44 == 405);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass4 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        int int7 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int19 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int21 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int22 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int23 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int24 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int25 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int26 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        java.lang.Class<?> wildcardClass27 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass4 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass15 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass16 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        int int7 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray6);
        java.lang.Class<?> wildcardClass14 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass14 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        int[] intArray4 = new int[] { 'a', (byte) 1, (short) -1, 191 };
        int[] intArray9 = new int[] { 'a', (byte) 1, (short) -1, 191 };
        int[] intArray14 = new int[] { 'a', (byte) 1, (short) -1, 191 };
        int[] intArray19 = new int[] { 'a', (byte) 1, (short) -1, 191 };
        int[] intArray24 = new int[] { 'a', (byte) 1, (short) -1, 191 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        int int26 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray25);
        int int27 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray25);
        int int28 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray25);
        int int29 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray25);
        int int30 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray25);
        java.lang.Class<?> wildcardClass31 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 1, -1, 191]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 1, -1, 191]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 1, -1, 191]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 1, -1, 191]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 1, -1, 191]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 284 + "'", int26 == 284);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 284 + "'", int27 == 284);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 284 + "'", int28 == 284);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 284 + "'", int29 == 284);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 284 + "'", int30 == 284);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass14 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass14 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 1 };
        int[] intArray7 = new int[] { '4', (short) 0, (short) 1 };
        int[] intArray11 = new int[] { '4', (short) 0, (short) 1 };
        int[] intArray15 = new int[] { '4', (short) 0, (short) 1 };
        int[] intArray19 = new int[] { '4', (short) 0, (short) 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        int int21 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray20);
        int int22 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray20);
        int int23 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray20);
        int int24 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray20);
        int int25 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray20);
        java.lang.Class<?> wildcardClass26 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 0, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, 0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 0, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[52, 0, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[52, 0, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 53 + "'", int21 == 53);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 53 + "'", int22 == 53);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 53 + "'", int23 == 53);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53 + "'", int24 == 53);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 53 + "'", int25 == 53);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        int[] intArray2 = new int[] { (short) 0, 356 };
        int[] intArray5 = new int[] { (short) 0, 356 };
        int[] intArray8 = new int[] { (short) 0, 356 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        int int10 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray9);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray9);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray9);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray9);
        java.lang.Class<?> wildcardClass14 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 356]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 356]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 356]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 356 + "'", int10 == 356);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 356 + "'", int11 == 356);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 356 + "'", int12 == 356);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 356 + "'", int13 == 356);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass15 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass14 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass14 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass14 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass14 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        int[] intArray3 = new int[] { (byte) 100, '4', 100 };
        int[] intArray7 = new int[] { (byte) 100, '4', 100 };
        int[] intArray11 = new int[] { (byte) 100, '4', 100 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        int int13 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray12);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray12);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray12);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray12);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray12);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray12);
        int int19 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray12);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray12);
        java.lang.Class<?> wildcardClass22 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 52, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 52, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 356 + "'", int13 == 356);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 356 + "'", int14 == 356);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 356 + "'", int15 == 356);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 356 + "'", int16 == 356);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 356 + "'", int17 == 356);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 356 + "'", int18 == 356);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 356 + "'", int19 == 356);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 356 + "'", int20 == 356);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 356 + "'", int21 == 356);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        int[] intArray4 = new int[] { 'a', (byte) 1, (short) -1, 191 };
        int[] intArray9 = new int[] { 'a', (byte) 1, (short) -1, 191 };
        int[] intArray14 = new int[] { 'a', (byte) 1, (short) -1, 191 };
        int[] intArray19 = new int[] { 'a', (byte) 1, (short) -1, 191 };
        int[] intArray24 = new int[] { 'a', (byte) 1, (short) -1, 191 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        int int26 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray25);
        int int27 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray25);
        int int28 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray25);
        int int29 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray25);
        int int30 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray25);
        int int31 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray25);
        int int32 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray25);
        int int33 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray25);
        int int34 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray25);
        java.lang.Class<?> wildcardClass35 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 1, -1, 191]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 1, -1, 191]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 1, -1, 191]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 1, -1, 191]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 1, -1, 191]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 284 + "'", int26 == 284);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 284 + "'", int27 == 284);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 284 + "'", int28 == 284);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 284 + "'", int29 == 284);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 284 + "'", int30 == 284);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 284 + "'", int31 == 284);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 284 + "'", int32 == 284);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 284 + "'", int33 == 284);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 284 + "'", int34 == 284);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass15 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass14 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass4 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass15 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass14 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass4 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        int[] intArray5 = new int[] { '4', '4', '4', 1, ' ' };
        int[] intArray11 = new int[] { '4', '4', '4', 1, ' ' };
        int[] intArray17 = new int[] { '4', '4', '4', 1, ' ' };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int19 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray18);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray18);
        int int21 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray18);
        int int22 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray18);
        int int23 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray18);
        int int24 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray18);
        int int25 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray18);
        int int26 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray18);
        int int27 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray18);
        int int28 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray18);
        int int29 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray18);
        java.lang.Class<?> wildcardClass30 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 52, 52, 1, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 52, 52, 1, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 52, 52, 1, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 191 + "'", int19 == 191);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 191 + "'", int20 == 191);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 191 + "'", int21 == 191);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 191 + "'", int22 == 191);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 191 + "'", int23 == 191);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 191 + "'", int24 == 191);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 191 + "'", int25 == 191);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 191 + "'", int26 == 191);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 191 + "'", int27 == 191);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 191 + "'", int28 == 191);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 191 + "'", int29 == 191);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass5 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass14 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass14 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass6 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass17 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass9 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass10 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass12 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        int[] intArray5 = new int[] { (short) 10, (short) 1, (short) -1, 10, (short) 0 };
        int[] intArray11 = new int[] { (short) 10, (short) 1, (short) -1, 10, (short) 0 };
        int[] intArray17 = new int[] { (short) 10, (short) 1, (short) -1, 10, (short) 0 };
        int[] intArray23 = new int[] { (short) 10, (short) 1, (short) -1, 10, (short) 0 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        int int25 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray24);
        int int26 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray24);
        int int27 = com.thealgorithms.dynamicprogramming.MinimumPathSum.minimumPathSum(intArray24);
        java.lang.Class<?> wildcardClass28 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 1, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 1, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 1, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 17 + "'", int25 == 17);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 17 + "'", int26 == 17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 17 + "'", int27 == 17);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass8 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass7 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        java.lang.Class<?> wildcardClass11 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessColumns();
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        minimumPathSum0.testLessColumns();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessColumns();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testOneRowOneColumn();
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.thealgorithms.dynamicprogramming.MinimumPathSum minimumPathSum0 = new com.thealgorithms.dynamicprogramming.MinimumPathSum();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testRegular();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testOneRowOneColumn();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testLessRows();
        minimumPathSum0.testRegular();
        java.lang.Class<?> wildcardClass13 = minimumPathSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

