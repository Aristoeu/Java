package Sum_Of_Subset;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7001");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, 100);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', (int) (byte) -1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 100, 0);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) 'a', (int) (short) 0);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        int[] intArray3 = new int[] { ' ', (-1), 1 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) -1);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 1, (int) '4');
        boolean boolean12 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) -1, (int) (byte) -1);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 1, (-1));
        boolean boolean18 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 1, (int) (byte) 0);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) '#', (int) (short) 0);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 0, 1);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 1, 0);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 1, (int) (byte) 10);
        boolean boolean33 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (-1), (int) (short) 1);
        boolean boolean36 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 1, (int) ' ');
        java.lang.Class<?> wildcardClass37 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) 'a');
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) (byte) 10);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) ' ');
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) 'a', (int) (byte) 0);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', (-1));
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, 10);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) 'a');
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) 'a');
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, 0);
        boolean boolean38 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) '4');
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), 10);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) (byte) 10);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) '#');
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) '4');
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) (short) 10);
        boolean boolean38 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, (int) (short) 1);
        boolean boolean41 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '4', (int) (short) 0);
        boolean boolean44 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 1, (int) (byte) -1);
        boolean boolean47 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 100, 0);
        java.lang.Class<?> wildcardClass48 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) ' ', (int) (byte) -1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 0, (int) (byte) 1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) (byte) -1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 100, 0);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, 100);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, 0);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) ' ', 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        int[] intArray3 = new int[] { ' ', (-1), 1 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) -1);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 1, (int) (byte) 1);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 100, (-1));
        boolean boolean15 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 1, (int) (short) 1);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 10, (int) (byte) -1);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 1, (int) (short) -1);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) -1, (int) (byte) 0);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 1, (int) (short) 100);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 10, (int) (short) 0);
        boolean boolean33 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 1, (-1));
        java.lang.Class<?> wildcardClass34 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 100);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (-1));
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) (short) 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 100, 0);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, 0);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (int) (short) 0);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) -1);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 100, (int) (short) 0);
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) ' ');
        boolean boolean38 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (int) (byte) -1);
        boolean boolean41 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (short) 0);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', (int) (byte) 0);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) '4');
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, 0);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) 'a', (int) (byte) 0);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '4', 0);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) ' ', (int) (short) -1);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) ' ', (int) (byte) -1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, 0);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, 0);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 0, (int) (byte) 1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '4', (int) (byte) -1);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 100, 0);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) (byte) 100);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 1, (int) (short) -1);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', 0);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 1);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) (byte) 100);
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) ' ', (int) (byte) 0);
        boolean boolean38 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) '4');
        boolean boolean41 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) ' ');
        boolean boolean44 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, 0);
        boolean boolean47 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        int[] intArray3 = new int[] { ' ', (-1), 1 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) -1);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 1, (int) (byte) 1);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 100, (-1));
        boolean boolean15 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 1, (int) (short) 1);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        int[] intArray6 = new int[] { ' ', (short) 1, (-1), (short) 0, (byte) -1, (byte) -1 };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray6, (int) (byte) 1, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray6, 0, (int) 'a');
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 1, -1, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) ' ', (int) (byte) -1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) (byte) -1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) 'a', (int) (byte) 0);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) '4');
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) (short) 10);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) 'a', (int) (byte) 0);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', (-1));
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, 10);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 0, 100);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 1, (int) 'a');
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', (int) (byte) 0);
        boolean boolean38 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 100, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, 100);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 100, (int) (byte) 0);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 100, (int) (byte) 0);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, 0);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, 10);
        java.lang.Class<?> wildcardClass30 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 100);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 1, (int) (short) 0);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (short) 0);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, 100);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 10, (int) (short) -1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, 0);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (-1));
        java.lang.Class<?> wildcardClass24 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (short) 0);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', (int) (byte) 0);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) '4');
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, 0);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass30 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) ' ', (int) (byte) -1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 0, (int) (byte) 1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) (byte) -1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 0, 100);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '4', (int) (short) 0);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, (int) (short) 10);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, 0);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        int[] intArray3 = new int[] { ' ', (-1), 1 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) -1);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 1, (int) '4');
        boolean boolean12 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 0, 100);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 1, (int) ' ');
        boolean boolean18 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 1, (int) 'a');
        boolean boolean21 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 1, (int) (byte) 0);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 100, (int) (short) 0);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) -1, 0);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 0, 0);
        boolean boolean33 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) '4', (int) (byte) 0);
        boolean boolean36 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 1, (int) (short) 1);
        boolean boolean39 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 100, (int) (short) -1);
        boolean boolean42 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 1, (int) '4');
        boolean boolean45 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) -1, (int) ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) 'a');
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 1, (int) (short) -1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (short) 0);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 1, 0);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 10);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 10, (int) (short) -1);
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 1, (int) ' ');
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) 'a', 0);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 100);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (-1));
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (short) 100);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) 'a');
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 0, (int) (short) 1);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 10, (int) (short) 0);
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (-1));
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (-1));
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (short) 100);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
        int[] intArray3 = new int[] { ' ', (-1), 1 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) -1);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 1, (int) (byte) 1);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 1, 0);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 10, (int) (byte) 0);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
        int[] intArray0 = null;
        boolean boolean3 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray0, (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) 'a', (int) (byte) 0);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) '4');
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (byte) 1);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, 1);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) (short) 10);
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 0, (int) (short) 1);
        boolean boolean38 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) 'a');
        boolean boolean41 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 100, (int) (byte) 0);
        boolean boolean44 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) ' ');
        boolean boolean47 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 100);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (-1));
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) (short) 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (byte) 10);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) ' ');
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, (int) ' ');
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) 'a');
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        int[] intArray3 = new int[] { ' ', (-1), 1 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) -1);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 1, (int) (byte) 1);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 100, (-1));
        boolean boolean15 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 1, (int) (short) 1);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 10, (int) (byte) -1);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 1, 0);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) '4');
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, 0);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) 'a', (int) (short) 0);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 100, 0);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 10, (int) (short) -1);
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 100);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (-1));
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) (short) 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 100, 0);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, 0);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (int) (short) 0);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '4', (int) (byte) 0);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 10);
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) '4');
        boolean boolean38 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', (int) (short) -1);
        boolean boolean41 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, 10);
        boolean boolean44 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) '#');
        boolean boolean47 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '4', 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, 100);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 0, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, (int) (short) 0);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 0, (int) (short) 10);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 0, 100);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 1, (-1));
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 0, (int) (byte) 0);
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        int[] intArray3 = new int[] { ' ', (-1), 1 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) -1);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 1, (int) (byte) 1);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (-1), (int) (byte) 0);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 0, (int) (short) 1);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
        int[] intArray3 = new int[] { ' ', (-1), 1 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) -1);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 1, (int) '4');
        boolean boolean12 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) -1, (int) (short) 1);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 0, (int) (byte) 10);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) -1, (int) (byte) -1);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) 'a', (int) (byte) -1);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) -1);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 100, 0);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) 1);
        boolean boolean33 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 1, (int) (byte) 0);
        boolean boolean36 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 10, (-1));
        java.lang.Class<?> wildcardClass37 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) 'a', (int) (byte) 0);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) '4');
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, 100);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', (int) (byte) -1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, 0);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (byte) 1);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) '4');
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) (byte) 10);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 100);
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (int) (short) -1);
        boolean boolean38 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 1, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        int[] intArray3 = new int[] { ' ', (-1), 1 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) -1);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (-1));
        boolean boolean12 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, 100);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', (int) (byte) -1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, 0);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (short) -1);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 100);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 1, (-1));
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) (byte) 0);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, (int) (short) 1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, 1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        int[] intArray3 = new int[] { ' ', (-1), 1 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) -1);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 1, (int) (byte) 1);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 100, (-1));
        boolean boolean15 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 1, (int) (short) 1);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 10, (int) (byte) -1);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 0, (-1));
        boolean boolean24 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 1, (-1));
        boolean boolean27 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        int[] intArray3 = new int[] { ' ', (-1), 1 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) -1);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 1, (int) '4');
        boolean boolean12 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 0, 100);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 1, (int) ' ');
        boolean boolean18 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 1, (int) (byte) 100);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 100, 0);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 100, (int) (short) 0);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass28 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) ' ', (int) (byte) -1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) (byte) -1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, (int) (byte) 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) 'a');
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) 'a', (int) (byte) 0);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '4', 0);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (byte) 10);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, 0);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 1, 0);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (byte) 100);
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass36 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) 'a', (int) (byte) 0);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '4', 0);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) ' ', (int) (short) -1);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (byte) 10);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 0);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) 'a');
        java.lang.Class<?> wildcardClass33 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
        int[] intArray3 = new int[] { ' ', (-1), 1 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) -1);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 1, (int) '4');
        boolean boolean12 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) -1, (int) (short) 1);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 0, (int) (byte) 10);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) -1, (int) (byte) -1);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) 'a', (int) (byte) -1);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 0, (int) (byte) 1);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 0, (int) (byte) 10);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) 'a', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) ' ', (int) (byte) -1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 0, (int) (byte) 1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 0, 10);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) '#');
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) ' ', (int) (byte) -1);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 10, (-1));
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 0, (int) (short) 100);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) ' ');
        java.lang.Class<?> wildcardClass33 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 100);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (-1));
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) (short) 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (byte) 10);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) (byte) 0);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) ' ', 0);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass30 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) '4');
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) ' ');
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass27 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) 'a', (int) (byte) 0);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) '4');
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (byte) 1);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, 1);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) 'a');
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 100, (int) (short) 0);
        boolean boolean38 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, 10);
        boolean boolean41 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 100);
        boolean boolean44 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (short) 0);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', (int) (byte) 0);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (int) (byte) -1);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, 0);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 100, 0);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) ' ');
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) 'a', (-1));
        boolean boolean38 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (-1));
        boolean boolean41 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, 0);
        boolean boolean44 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) ' ', 0);
        java.lang.Class<?> wildcardClass45 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 100);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (-1));
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) (byte) 1);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
        int[] intArray3 = new int[] { ' ', (-1), 1 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) -1);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 1, (int) '4');
        boolean boolean12 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 0, 100);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 1, (int) '4');
        boolean boolean18 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) '4');
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, 1);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, (int) (short) 10);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) (byte) 0);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) '4');
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) (short) 1);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, 10);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, (int) (short) 0);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 0, (int) (short) 100);
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', (int) (byte) -1);
        boolean boolean38 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass39 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
        int[] intArray0 = new int[] {};
        boolean boolean3 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray0, 100, 0);
        boolean boolean6 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray0, (-1), (int) '4');
        boolean boolean9 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray0, (int) (byte) 100, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray0, (int) (byte) 100, (int) (short) -1);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray0, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) ' ', (int) (byte) -1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 0, (int) (byte) 1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 0, 10);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) (byte) 1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (int) (short) 0);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '4', (int) (byte) -1);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 0);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
        int[] intArray1 = new int[] { (byte) 10 };
        boolean boolean4 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray1, (int) (byte) 0, (int) (short) 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray1, 0, (-1));
        boolean boolean10 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray1, 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray1, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 100);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (-1));
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) (short) 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 100, 0);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, 0);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, 0);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (-1));
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 100, (-1));
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 10, 0);
        boolean boolean38 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 1, 0);
        boolean boolean41 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, 10);
        boolean boolean44 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 0);
        boolean boolean47 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) '4');
        boolean boolean50 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), 0);
        boolean boolean53 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 100, (-1));
        java.lang.Class<?> wildcardClass54 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
        int[] intArray3 = new int[] { ' ', (-1), 1 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) -1);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 1, (int) (byte) 1);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 1, 100);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 1, 1);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 0, (int) (byte) 0);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 1, (int) (byte) 10);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 1, (int) (byte) 1);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (-1), 1);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (-1));
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) '4');
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) 'a', (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (-1));
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 10, (-1));
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 10, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) '4');
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) '#');
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) (byte) 1);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', 0);
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 0);
        boolean boolean38 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, (-1));
        boolean boolean41 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 1, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) 'a', (int) (byte) 0);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) '4');
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (byte) 1);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, 1);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) '4');
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 100, (int) (byte) 0);
        boolean boolean38 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) ' ', (int) (byte) -1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 0, (int) (byte) 1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 0, 10);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) (byte) 1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (int) (short) 0);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '4', (int) (byte) -1);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', (-1));
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 10, (int) (short) 0);
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) '4');
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), 10);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) (byte) 10);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) '#');
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) '4');
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) (short) 10);
        boolean boolean38 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, (int) (short) 1);
        boolean boolean41 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '4', (int) (short) 0);
        boolean boolean44 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 1, (int) (byte) -1);
        boolean boolean47 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) 'a', 0);
        boolean boolean50 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
        int[] intArray3 = new int[] { ' ', (-1), 1 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) -1);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 1, (int) (byte) 1);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 100, (-1));
        boolean boolean15 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 1, (int) (short) 1);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 10, (int) (byte) -1);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 1, (int) (short) -1);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 0, (int) (short) 0);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 1, 100);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
        int[] intArray3 = new int[] { ' ', (-1), 1 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) -1);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 1, (int) '4');
        boolean boolean12 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) -1, (int) (byte) -1);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 1, (-1));
        boolean boolean18 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 1, (int) (byte) 0);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 0, (int) '#');
        boolean boolean24 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        int[] intArray3 = new int[] { ' ', (-1), 1 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) -1);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 1, (int) '4');
        boolean boolean12 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 0, 100);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 1, (int) ' ');
        boolean boolean18 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 1, (int) 'a');
        boolean boolean21 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 1, (int) (byte) 0);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 100, (int) (short) 0);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) -1, 0);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 0, 0);
        boolean boolean33 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) '4', (int) (byte) 0);
        boolean boolean36 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 1, (int) (short) 1);
        boolean boolean39 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 100);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (-1));
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) (short) 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (byte) 10);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) (byte) 0);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 100);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 10, 0);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 10, (int) (byte) -1);
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 100, (int) (byte) 0);
        boolean boolean38 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) 'a', (int) (byte) 0);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) '4');
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (byte) 1);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, 1);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) '4');
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, 1);
        boolean boolean38 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) ' ', (int) (byte) -1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) (byte) -1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, (int) (byte) 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '4', 0);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) ' ', (int) (byte) -1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, 0);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) '4');
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 100, (-1));
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, 10);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (byte) 100);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
        int[] intArray0 = new int[] {};
        boolean boolean3 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray0, 100, 0);
        boolean boolean6 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray0, (int) '4', (int) (short) -1);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray0, (int) '#', 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray0, 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray0, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 100);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (-1));
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) (short) 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (byte) 10);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) (byte) 0);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 1, (int) (byte) 1);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', (int) (byte) 0);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 100);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (-1));
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) (short) 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (byte) 10);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, 100);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) (byte) -1);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) ' ', (int) (byte) -1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) (byte) -1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) '#');
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 1, (int) (byte) 10);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) 'a');
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (short) 0);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) (byte) 10);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, 100);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 100);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (-1));
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', (int) (short) -1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (short) 10);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, 10);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', 0);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '4', (int) (short) 0);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) '4');
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, 0);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) (short) 0);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) 'a');
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 1, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) 'a');
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 1, (int) (short) -1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (short) 0);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 1, 0);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 10);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 10, (int) (short) -1);
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) 'a', 0);
        boolean boolean38 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 100, (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (-1));
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 10, (-1));
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 10, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 10);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) (byte) 10);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (-1));
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 10, (-1));
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 10, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, 100);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 1);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, 0);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, 100);
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (int) (byte) -1);
        boolean boolean38 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 1, (int) (short) 0);
        boolean boolean41 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass42 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        int[] intArray3 = new int[] { ' ', (-1), 1 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) -1);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 1, (int) (byte) 1);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 100, (-1));
        boolean boolean15 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (-1), (int) (short) 1);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) -1);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) 'a', (int) (byte) 0);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 0, (-1));
        boolean boolean27 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, 100);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 100, (int) (byte) 0);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) (short) 10);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) ' ');
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass30 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 0, 100);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '4', (int) (byte) -1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
        int[] intArray3 = new int[] { ' ', (-1), 1 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) -1);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 1, (int) '4');
        boolean boolean12 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) -1, (int) (byte) -1);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 1, (-1));
        boolean boolean18 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 0, (int) (byte) -1);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        int[] intArray3 = new int[] { ' ', (-1), 1 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) -1);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 1, (int) (byte) 1);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 100, (-1));
        boolean boolean15 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (-1), (int) (short) 1);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) 0);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, 0, 0);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 1, 0);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (-1), (int) (short) 100);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, 100);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 100, (int) (byte) 0);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) (short) 10);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 10);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) (byte) 10);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        int[] intArray3 = new int[] { ' ', (-1), 1 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, (int) (short) -1);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 1, 100);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 100, (int) (short) -1);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 10, (-1));
        boolean boolean18 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) 0, 1);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (byte) -1, (int) '4');
        boolean boolean24 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) 'a', (int) (short) 0);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) '#', (int) (byte) -1);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) 0, (int) (short) -1);
        boolean boolean33 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray3, (int) (short) -1, 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 100);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (-1));
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) ' ', (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) 'a');
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 1, 10);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) '4');
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) (byte) 100);
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (-1));
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 10, (-1));
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 10, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) '4');
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 1, (int) '#');
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) (byte) 1);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', 0);
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) (byte) 0);
        boolean boolean38 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) (short) -1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (-1));
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, 0);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 100, 0);
        java.lang.Class<?> wildcardClass30 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, 10, (byte) 100, 0 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) ' ');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 0, (int) (short) 100);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (-1));
        boolean boolean17 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (-1), (int) (short) 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) 100, 0);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, 0);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, 0);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 10, (-1));
        boolean boolean32 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, 0);
        boolean boolean35 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 0, (int) 'a');
        boolean boolean38 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) '#', (int) (byte) 0);
        boolean boolean41 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, 1, 10);
        boolean boolean44 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) 0, (int) (byte) 1);
        boolean boolean47 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (short) -1, (int) (byte) 1);
        boolean boolean50 = com.thealgorithms.dynamicprogramming.Sum_Of_Subset.subsetSum(intArray5, (int) (byte) -1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass51 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }
}

