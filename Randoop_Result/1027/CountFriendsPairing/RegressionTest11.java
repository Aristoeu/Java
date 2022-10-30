package CountFriendsPairing;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        int[] intArray19 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray19);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray19);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray19);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray19);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray19);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray19);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray19);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray19);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray19);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray19);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray19);
        boolean boolean31 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray19);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        int[] intArray19 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray19);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray19);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray19);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray19);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray19);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray19);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray19);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray19);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray19);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray19);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray19);
        boolean boolean31 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray19);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray19);
        java.lang.Class<?> wildcardClass33 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        int[] intArray13 = new int[] { '#', (-1), '4' };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray13);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray13);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray13);
        java.lang.Class<?> wildcardClass24 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        java.lang.Class<?> wildcardClass27 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        int[] intArray17 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray17);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray17);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray17);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray17);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray17);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray17);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray17);
        java.lang.Class<?> wildcardClass29 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        int[] intArray22 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray22);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray22);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray22);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray22);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray22);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray22);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray22);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray22);
        boolean boolean31 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray22);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray22);
        boolean boolean33 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray22);
        boolean boolean34 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray22);
        boolean boolean35 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray22);
        boolean boolean36 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray22);
        boolean boolean37 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray22);
        boolean boolean38 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray22);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        int[] intArray18 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray18);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray18);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray18);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray18);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray18);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray18);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray18);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray18);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray18);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray18);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        int[] intArray13 = new int[] { '#', (-1), '4' };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray13);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray13);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        int[] intArray15 = new int[] { '#', (-1), '4' };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray15);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray15);
        java.lang.Class<?> wildcardClass28 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        int[] intArray6 = new int[] { '#', (-1), '4' };
        boolean boolean7 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray6);
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray6);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray6);
        java.lang.Class<?> wildcardClass10 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        int[] intArray20 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray20);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray20);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray20);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray20);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray20);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray20);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray20);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray20);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray20);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray20);
        boolean boolean31 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray20);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray20);
        boolean boolean33 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray20);
        boolean boolean34 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray20);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        int[] intArray19 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray19);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray19);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray19);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray19);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray19);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray19);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray19);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray19);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray19);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray19);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray19);
        boolean boolean31 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray19);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        int[] intArray20 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray20);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray20);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray20);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray20);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray20);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray20);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray20);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray20);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray20);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray20);
        boolean boolean31 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray20);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray20);
        boolean boolean33 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray20);
        boolean boolean34 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray20);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        int[] intArray20 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray20);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray20);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray20);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray20);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray20);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray20);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray20);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray20);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray20);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray20);
        boolean boolean31 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray20);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray20);
        boolean boolean33 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray20);
        boolean boolean34 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray20);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        int[] intArray19 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray19);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray19);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray19);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray19);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray19);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray19);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray19);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray19);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray19);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray19);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray19);
        boolean boolean31 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray19);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        int[] intArray14 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray14);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        java.lang.Class<?> wildcardClass25 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        int[] intArray17 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray17);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray17);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray17);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray17);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray17);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray17);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray17);
        java.lang.Class<?> wildcardClass29 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        int[] intArray10 = new int[] { '#', (-1), '4' };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        int[] intArray17 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray17);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray17);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray17);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray17);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray17);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray17);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        int[] intArray8 = new int[] { '#', (-1), '4' };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray8);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray8);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray8);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        int[] intArray17 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray17);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray17);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray17);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray17);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray17);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray17);
        java.lang.Class<?> wildcardClass29 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        int[] intArray17 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray17);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray17);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray17);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray17);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray17);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray17);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray17);
        java.lang.Class<?> wildcardClass29 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        int[] intArray17 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray17);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray17);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray17);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray17);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray17);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        java.lang.Class<?> wildcardClass29 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        int[] intArray13 = new int[] { '#', (-1), '4' };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray13);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        int[] intArray14 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        int[] intArray12 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray12);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        int[] intArray9 = new int[] { 'a', (byte) 1 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray9);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray9);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        java.lang.Class<?> wildcardClass17 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        int[] intArray9 = new int[] { '#', (-1), '4' };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray9);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        int[] intArray17 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray17);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray17);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray17);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray17);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray17);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray17);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray17);
        java.lang.Class<?> wildcardClass29 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        int[] intArray9 = new int[] { '#', (-1), '4' };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray9);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        int[] intArray18 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray18);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray18);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray18);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray18);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray18);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray18);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray18);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        int[] intArray14 = new int[] { '#', (-1), '4' };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray14);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray14);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        int[] intArray13 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray13);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        java.lang.Class<?> wildcardClass23 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        int[] intArray22 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray22);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray22);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray22);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray22);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray22);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray22);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray22);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray22);
        boolean boolean31 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray22);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray22);
        boolean boolean33 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray22);
        boolean boolean34 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray22);
        boolean boolean35 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray22);
        boolean boolean36 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray22);
        boolean boolean37 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray22);
        boolean boolean38 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray22);
        java.lang.Class<?> wildcardClass39 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        int[] intArray15 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray15);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        int[] intArray18 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray18);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray18);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray18);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray18);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray18);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray18);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        int[] intArray17 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray17);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray17);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray17);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray17);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray17);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        int[] intArray11 = new int[] { '#', (-1), '4' };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray11);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        java.lang.Class<?> wildcardClass20 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        int[] intArray13 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        java.lang.Class<?> wildcardClass23 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        int[] intArray21 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray21);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray21);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray21);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray21);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray21);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray21);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray21);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray21);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray21);
        boolean boolean31 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray21);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray21);
        boolean boolean33 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray21);
        boolean boolean34 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray21);
        boolean boolean35 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray21);
        boolean boolean36 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray21);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        int[] intArray16 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray16);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray16);
        java.lang.Class<?> wildcardClass27 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        int[] intArray14 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        int[] intArray12 = new int[] { '#', (-1), '4' };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray12);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray12);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray12);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        int[] intArray12 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray12);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        java.lang.Class<?> wildcardClass21 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        int[] intArray17 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray17);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray17);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray17);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray17);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray17);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray17);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray17);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        int[] intArray9 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        int[] intArray19 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray19);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray19);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray19);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray19);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray19);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray19);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray19);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray19);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray19);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray19);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray19);
        boolean boolean31 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray19);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        int[] intArray16 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        int[] intArray18 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray18);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray18);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray18);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray18);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray18);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray18);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray18);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        int[] intArray14 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray14);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray14);
        java.lang.Class<?> wildcardClass25 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        int[] intArray16 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        int[] intArray18 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray18);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray18);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray18);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray18);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray18);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray18);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        int[] intArray18 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray18);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray18);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray18);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray18);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray18);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray18);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray18);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray18);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray18);
        java.lang.Class<?> wildcardClass31 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        int[] intArray12 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray12);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        int[] intArray12 = new int[] { '#', (-1), '4' };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray12);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray12);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        int[] intArray18 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray18);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray18);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray18);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray18);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray18);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray18);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray18);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray18);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray18);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray16);
        java.lang.Class<?> wildcardClass27 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        int[] intArray19 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray19);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray19);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray19);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray19);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray19);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray19);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray19);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray19);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray19);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray19);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray19);
        boolean boolean31 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray19);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray19);
        java.lang.Class<?> wildcardClass33 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        int[] intArray18 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray18);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray18);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray18);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray18);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray18);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray18);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray18);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray18);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        int[] intArray5 = new int[] { '#', (-1), '4' };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray5);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        int[] intArray8 = new int[] { '#', (-1), '4' };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray8);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray8);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray8);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray8);
        java.lang.Class<?> wildcardClass14 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        int[] intArray17 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray17);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray17);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray17);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray17);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray17);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray17);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        int[] intArray14 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        int[] intArray12 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray12);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        int[] intArray13 = new int[] { '#', (-1), '4' };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray13);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray13);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        int[] intArray13 = new int[] { '#', (-1), '4' };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray13);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray16);
        java.lang.Class<?> wildcardClass27 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        int[] intArray7 = new int[] { 'a', (byte) 1 };
        boolean boolean8 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray7);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray7);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray7);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray7);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        int[] intArray19 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray19);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray19);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray19);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray19);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray19);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray19);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray19);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray19);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray19);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray19);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray19);
        boolean boolean31 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray19);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        int[] intArray13 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray13);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        int[] intArray14 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        int[] intArray16 = new int[] { '#', (-1), '4' };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray16);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray10);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        int[] intArray20 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray20);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray20);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray20);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray20);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray20);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray20);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray20);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray20);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray20);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray20);
        boolean boolean31 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray20);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray20);
        boolean boolean33 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray20);
        boolean boolean34 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray20);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        int[] intArray15 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray15);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        int[] intArray22 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray22);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray22);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray22);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray22);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray22);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray22);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray22);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray22);
        boolean boolean31 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray22);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray22);
        boolean boolean33 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray22);
        boolean boolean34 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray22);
        boolean boolean35 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray22);
        boolean boolean36 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray22);
        boolean boolean37 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray22);
        boolean boolean38 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray22);
        java.lang.Class<?> wildcardClass39 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        int[] intArray14 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        java.lang.Class<?> wildcardClass25 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray16);
        java.lang.Class<?> wildcardClass27 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        int[] intArray10 = new int[] { '#', (-1), '4' };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        java.lang.Class<?> wildcardClass18 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        int[] intArray18 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray18);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray18);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray18);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray18);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray18);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray18);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray18);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray18);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray18);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        int[] intArray12 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray12);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        int[] intArray18 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray18);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray18);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray18);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray18);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray18);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray18);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray18);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray18);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray18);
        java.lang.Class<?> wildcardClass31 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        int[] intArray11 = new int[] { '#', (-1), '4' };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        int[] intArray13 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray13);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        java.lang.Class<?> wildcardClass23 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        java.lang.Class<?> wildcardClass27 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        int[] intArray11 = new int[] { '#', (-1), '4' };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray11);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        int[] intArray12 = new int[] { '#', (-1), '4' };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray12);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray12);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        java.lang.Class<?> wildcardClass22 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        int[] intArray15 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        java.lang.Class<?> wildcardClass27 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        int[] intArray17 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray17);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray17);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray17);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray17);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray17);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray17);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        int[] intArray18 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray18);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray18);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray18);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray18);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray18);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray18);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray18);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray18);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        int[] intArray12 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        java.lang.Class<?> wildcardClass21 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        int[] intArray10 = new int[] { '#', (-1), '4' };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray10);
        java.lang.Class<?> wildcardClass18 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        int[] intArray11 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray11);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray11);
        java.lang.Class<?> wildcardClass19 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray16);
        java.lang.Class<?> wildcardClass27 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        int[] intArray20 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray20);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray20);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray20);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray20);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray20);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray20);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray20);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray20);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray20);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray20);
        boolean boolean31 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray20);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray20);
        boolean boolean33 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray20);
        boolean boolean34 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray20);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        int[] intArray17 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray17);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray17);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray17);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray17);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray17);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray17);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray17);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray17);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray17);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        int[] intArray16 = new int[] { '#', (-1), '4' };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray16);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray16);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        int[] intArray17 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray17);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray17);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray17);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray17);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray17);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray17);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray17);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray17);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        int[] intArray9 = new int[] { '#', (-1), '4' };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        int[] intArray10 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray10);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        int[] intArray17 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray17);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray17);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray17);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray17);
        java.lang.Class<?> wildcardClass29 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        int[] intArray17 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray17);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray17);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray17);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray17);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray17);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray17);
        java.lang.Class<?> wildcardClass29 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        int[] intArray14 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray16);
        java.lang.Class<?> wildcardClass27 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        int[] intArray13 = new int[] { '#', (-1), '4' };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        int[] intArray17 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray17);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray17);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray17);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray17);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray17);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray17);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray17);
        java.lang.Class<?> wildcardClass29 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        int[] intArray19 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray19);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray19);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray19);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray19);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray19);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray19);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray19);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray19);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray19);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray19);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray19);
        boolean boolean31 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray19);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        int[] intArray13 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray13);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray13);
        java.lang.Class<?> wildcardClass23 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        int[] intArray17 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray17);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray17);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray17);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray17);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray17);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray17);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray17);
        java.lang.Class<?> wildcardClass29 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        int[] intArray12 = new int[] { '#', (-1), '4' };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray12);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray12);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        int[] intArray8 = new int[] { 'a', (byte) 1 };
        boolean boolean9 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray8);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray8);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray8);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray8);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray8);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray8);
        java.lang.Class<?> wildcardClass15 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        int[] intArray15 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray15);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        java.lang.Class<?> wildcardClass27 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((-1), intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        int[] intArray19 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray19);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray19);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray19);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray19);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray19);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray19);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray19);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray19);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray19);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray19);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray19);
        boolean boolean31 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray19);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray19);
        java.lang.Class<?> wildcardClass33 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        int[] intArray17 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray17);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray17);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray17);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray17);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray17);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray17);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray17);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray17);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        int[] intArray18 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray18);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray18);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray18);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray18);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray18);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray18);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray18);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray18);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray18);
        java.lang.Class<?> wildcardClass31 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        int[] intArray11 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray11);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        int[] intArray20 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray20);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray20);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray20);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray20);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray20);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray20);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray20);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray20);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray20);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray20);
        boolean boolean31 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray20);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray20);
        boolean boolean33 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray20);
        boolean boolean34 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray20);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        int[] intArray13 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray13);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) -1, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) -1, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        int[] intArray17 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray17);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray17);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray17);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray17);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray17);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray17);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray17);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        int[] intArray13 = new int[] { '#', (-1), '4' };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray13);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        int[] intArray16 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        int[] intArray12 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray12);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        int[] intArray10 = new int[] { '#', (-1), '4' };
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray10);
        java.lang.Class<?> wildcardClass18 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        int[] intArray11 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray11);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray11);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        int[] intArray19 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray19);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray19);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray19);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray19);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray19);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray19);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray19);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray19);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray19);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray19);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray19);
        boolean boolean31 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray19);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray19);
        java.lang.Class<?> wildcardClass33 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        int[] intArray9 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        int[] intArray17 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray17);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray17);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray17);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray17);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray17);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray17);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray17);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray17);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray17);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        int[] intArray14 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray14);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray14);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray14);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray14);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray14);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        int[] intArray18 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray18);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray18);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray18);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray18);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray18);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray18);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray18);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray18);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray18);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        int[] intArray13 = new int[] { '#', (-1), '4' };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray13);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        java.lang.Class<?> wildcardClass24 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        int[] intArray9 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        int[] intArray23 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray23);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray23);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray23);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray23);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray23);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray23);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray23);
        boolean boolean31 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray23);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray23);
        boolean boolean33 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray23);
        boolean boolean34 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray23);
        boolean boolean35 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray23);
        boolean boolean36 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray23);
        boolean boolean37 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray23);
        boolean boolean38 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray23);
        boolean boolean39 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray23);
        boolean boolean40 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray23);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        int[] intArray9 = new int[] { '#', (-1), '4' };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray9);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        int[] intArray13 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray13);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray13);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray13);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray13);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray13);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(10, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        int[] intArray18 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray18);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray18);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray18);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray18);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray18);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray18);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray18);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray18);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray18);
        java.lang.Class<?> wildcardClass31 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(1, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        int[] intArray19 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray19);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray19);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray19);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray19);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray19);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray19);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray19);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray19);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray19);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 10, intArray19);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray19);
        boolean boolean31 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray19);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        int[] intArray15 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray15);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(100, intArray15);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray15);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray15);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray15);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        int[] intArray12 = new int[] { 'a', (byte) 10, '#', 'a', (byte) -1, 100 };
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray12);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray12);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray12);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray12);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray12);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 35, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        int[] intArray16 = new int[] { (byte) 100, 0, (short) -1, (short) 1 };
        boolean boolean17 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 1, intArray16);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 0, intArray16);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 100, intArray16);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray16);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray16);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray16);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 10, intArray16);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '#', intArray16);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) ' ', intArray16);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray16);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 1, intArray16);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) '4', intArray16);
        java.lang.Class<?> wildcardClass29 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 0, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        int[] intArray9 = new int[] { '#', (-1), '4' };
        boolean boolean10 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) 'a', intArray9);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing(0, intArray9);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (short) 0, intArray9);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.CountFriendsPairing.countFriendsPairing((int) (byte) 100, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }
}

