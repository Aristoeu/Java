package LinkList_Sort;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean31 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) -1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 1);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 1);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 10);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass30 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) '4');
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean31 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean33 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        java.lang.Class<?> wildcardClass26 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 10);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) '#');
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) -1);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) -1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 10);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean31 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean33 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean35 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean37 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        java.lang.Class<?> wildcardClass38 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) '#');
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 0);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) ' ');
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        java.lang.Class<?> wildcardClass24 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 1);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 10);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 1);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 1);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        java.lang.Class<?> wildcardClass26 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 10);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) 'a');
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) 'a');
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        java.lang.Class<?> wildcardClass28 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean31 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean33 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean35 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        java.lang.Class<?> wildcardClass36 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass29 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) -1);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) '4');
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 0);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean31 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean33 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean35 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean37 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean39 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        int[] intArray2 = new int[] { (byte) 1, '4' };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 1);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) ' ');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 52]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        java.lang.Class<?> wildcardClass28 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 10);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 100);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 0);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) -1);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (-1));
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 10);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 0);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 0);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 100);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean32 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass33 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        int[] intArray1 = new int[] { (short) 10 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 0);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (-1));
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) '#');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass29 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        java.lang.Class<?> wildcardClass26 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean32 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean31 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean33 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean35 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean37 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 0);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 1);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 1);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (-1));
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) -1);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 100);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 1);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 10);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 10);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 0);
        java.lang.Class<?> wildcardClass10 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 1);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 10);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) -1);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) -1);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 1);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) 'a');
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 100);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean31 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean33 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean35 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass36 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 10);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) '#');
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) -1);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean31 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean33 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean35 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean37 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean39 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean41 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass42 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass26 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) '#');
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) 'a');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 10);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 100);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) '#');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 0);
        java.lang.Class<?> wildcardClass20 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        java.lang.Class<?> wildcardClass30 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean31 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean33 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean35 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 10);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) -1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 1);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 1);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        java.lang.Class<?> wildcardClass30 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 10);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 100);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 0);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) -1);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 0);
        java.lang.Class<?> wildcardClass18 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean32 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 10);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 100);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 10);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) ' ');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass29 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        int[] intArray6 = new int[] { (byte) 100, (byte) 10, (short) 100, 1, (byte) 0, (short) 0 };
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray6, (int) '#');
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray6, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray6, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray6, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, 100, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean31 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        java.lang.Class<?> wildcardClass28 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        java.lang.Class<?> wildcardClass27 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean32 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean34 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean36 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass27 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        java.lang.Class<?> wildcardClass26 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 100);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) -1);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 100);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) '4');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass28 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean32 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean34 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 10);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) 'a');
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (-1));
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        int[] intArray2 = new int[] { 1, (short) 100 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) -1);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean32 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean34 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) -1);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) '4');
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        int[] intArray2 = new int[] { (short) 1, (short) 100 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) '4');
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) ' ');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) ' ');
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) '4');
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        java.lang.Class<?> wildcardClass27 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean31 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        java.lang.Class<?> wildcardClass32 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) -1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) -1);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 10);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 100);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) ' ');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass24 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) -1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) -1);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 100);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        java.lang.Class<?> wildcardClass26 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean31 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        java.lang.Class<?> wildcardClass27 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        int[] intArray1 = new int[] { (short) 10 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 0);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 100);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) '4');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        java.lang.Class<?> wildcardClass26 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass29 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        java.lang.Class<?> wildcardClass26 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        int[] intArray2 = new int[] { 1, (short) 100 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 10);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 100);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 0);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean31 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean33 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 10);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 100);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 0);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) -1);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (-1));
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 10);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 0);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 100);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        java.lang.Class<?> wildcardClass26 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean32 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) -1);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) '4');
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        java.lang.Class<?> wildcardClass29 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        int[] intArray2 = new int[] { 1, (short) 100 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 10);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) '4');
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 10);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) 'a');
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (-1));
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean32 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 0);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (-1));
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) '#');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        java.lang.Class<?> wildcardClass26 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 10);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) '#');
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        java.lang.Class<?> wildcardClass28 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) -1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 1);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 1);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 100);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 1);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean32 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass33 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean32 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean31 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean33 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean31 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean33 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        java.lang.Class<?> wildcardClass29 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean32 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        java.lang.Class<?> wildcardClass33 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean31 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean32 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean31 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) -1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 10);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (-1));
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) ' ');
        java.lang.Class<?> wildcardClass12 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 10);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) '#');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean32 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean34 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        java.lang.Class<?> wildcardClass26 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        java.lang.Class<?> wildcardClass26 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 1);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 10);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 1);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 10);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (-1));
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        java.lang.Class<?> wildcardClass27 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        java.lang.Class<?> wildcardClass28 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean31 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) -1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 1);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 1);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) -1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) ' ');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean31 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean32 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean34 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 0);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 1);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) '4');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass24 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 1);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 10);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) -1);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        int[] intArray2 = new int[] { 1, (short) 100 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 10);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 100);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass27 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 1);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) -1);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) 'a');
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 1);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (-1));
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) -1);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) '4');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean31 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean33 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 10);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 100);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 10);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean32 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean34 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean36 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 0);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 100);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 0);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 100);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 100);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 0);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 10);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 100);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 0);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) -1);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (-1));
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 10);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 0);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 0);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 100);
        java.lang.Class<?> wildcardClass26 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 100);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) -1);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) '4');
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) '#');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 10);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) '4');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        java.lang.Class<?> wildcardClass26 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        java.lang.Class<?> wildcardClass28 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        int[] intArray2 = new int[] { 1, (short) 100 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 10);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) '4');
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) -1);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean32 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        java.lang.Class<?> wildcardClass33 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 10);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 10);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) ' ');
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) -1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean32 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 10);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 100);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 0);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) -1);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) 'a');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 10);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        int[] intArray0 = new int[] {};
        boolean boolean2 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray0, (int) '#');
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        java.lang.Class<?> wildcardClass31 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        java.lang.Class<?> wildcardClass26 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) -1);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) 'a');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '4');
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean29 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean31 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean33 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 1);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) -1);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) 'a');
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) ' ');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) ' ');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) '#');
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) 'a');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 1);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 0);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 0);
        java.lang.Class<?> wildcardClass20 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        int[] intArray2 = new int[] { 1, (short) 100 };
        boolean boolean4 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 100);
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 10);
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 100);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (short) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, 100);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        java.lang.Class<?> wildcardClass26 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 100);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) '#');
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) 'a');
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 10);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 100);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) '#');
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) 'a');
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 100);
        java.lang.Class<?> wildcardClass22 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean32 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 10);
        boolean boolean34 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean36 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, 10);
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (short) 1);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) 'a');
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) -1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) -1);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 100);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (-1));
        boolean boolean30 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean32 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass33 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 10);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) '#');
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean10 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 0);
        boolean boolean12 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean18 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, 1);
        boolean boolean20 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 100);
        boolean boolean22 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (short) 10);
        boolean boolean24 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 0);
        boolean boolean26 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) (byte) 100);
        boolean boolean28 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray4, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean7 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, 0);
        boolean boolean15 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) -1);
        boolean boolean19 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 100);
        boolean boolean21 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 0);
        boolean boolean23 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) 1);
        boolean boolean25 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (byte) -1);
        boolean boolean27 = com.thealgorithms.sorts.LinkList_Sort.isSorted(intArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }
}

