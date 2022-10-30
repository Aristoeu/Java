package a5;

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
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) ' ');
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.get((int) (byte) 100);
        boolean boolean14 = lFSR6.get((int) (byte) 100);
        java.lang.String str15 = lFSR6.toString();
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.getLastBit();
        boolean boolean19 = lFSR6.get((int) (byte) 10);
        boolean boolean21 = lFSR6.get((int) '#');
        java.util.BitSet bitSet22 = null;
        java.util.BitSet bitSet23 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR6.initialize(bitSet22, bitSet23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray11);
        boolean boolean16 = lFSR15.getLastBit();
        boolean boolean17 = lFSR15.getLastBit();
        java.lang.String str18 = lFSR15.toString();
        boolean boolean19 = lFSR15.clock();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        int[] intArray5 = new int[] { (short) 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray5);
        com.thealgorithms.ciphers.a5.LFSR lFSR7 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (byte) 100, intArray19);
        boolean boolean29 = lFSR27.get((int) (byte) 100);
        boolean boolean30 = lFSR27.getLastBit();
        boolean boolean32 = lFSR27.get((int) (byte) 1);
        boolean boolean33 = lFSR27.getLastBit();
        boolean boolean34 = lFSR27.getLastBit();
        java.lang.String str35 = lFSR27.toString();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "{}" + "'", str35, "{}");
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        java.lang.String str13 = lFSR9.toString();
        boolean boolean15 = lFSR9.get(10);
        boolean boolean16 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.getClockBit();
        java.lang.Class<?> wildcardClass12 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.getLastBit();
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.get((int) (byte) 1);
        java.lang.String str16 = lFSR6.toString();
        boolean boolean18 = lFSR6.get((int) '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) '#', intArray2);
        boolean boolean5 = lFSR3.get(0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        int[] intArray13 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 10, intArray13);
        boolean boolean19 = lFSR18.clock();
        boolean boolean20 = lFSR18.getClockBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 52, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean13 = lFSR6.get((int) '#');
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.get(10);
        boolean boolean18 = lFSR6.get(0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) ' ', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) '4', intArray23);
        java.lang.String str34 = lFSR33.toString();
        boolean boolean35 = lFSR33.clock();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 10, intArray11);
        boolean boolean17 = lFSR15.get(10);
        java.lang.String str18 = lFSR15.toString();
        java.util.BitSet bitSet19 = null;
        java.util.BitSet bitSet20 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR15.initialize(bitSet19, bitSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        int[] intArray7 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 1, intArray7);
        boolean boolean11 = lFSR9.get(0);
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean14 = lFSR9.get((int) 'a');
        java.lang.String str15 = lFSR9.toString();
        boolean boolean16 = lFSR9.clock();
        boolean boolean17 = lFSR9.getClockBit();
        boolean boolean18 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[22, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        int[] intArray3 = new int[] { (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR4 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) 100, intArray3);
        boolean boolean5 = lFSR4.getLastBit();
        boolean boolean6 = lFSR4.getLastBit();
        java.lang.String str7 = lFSR4.toString();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (short) 10, intArray13);
        boolean boolean19 = lFSR18.getClockBit();
        java.lang.String str20 = lFSR18.toString();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) ' ');
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(1);
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.get(100);
        boolean boolean17 = lFSR6.get((int) (byte) 100);
        boolean boolean18 = lFSR6.getLastBit();
        boolean boolean19 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) (short) 0);
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.get((int) (byte) 10);
        boolean boolean17 = lFSR6.clock();
        boolean boolean18 = lFSR6.getLastBit();
        boolean boolean19 = lFSR6.getClockBit();
        boolean boolean20 = lFSR6.clock();
        boolean boolean21 = lFSR6.getLastBit();
        boolean boolean22 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (byte) -1, intArray21);
        boolean boolean31 = lFSR30.clock();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (-1), intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(10, (-1), intArray15);
        java.lang.Class<?> wildcardClass22 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(0);
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.getClockBit();
        boolean boolean17 = lFSR6.get((int) (short) 10);
        boolean boolean19 = lFSR6.get(0);
        boolean boolean20 = lFSR6.clock();
        boolean boolean21 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray21);
        boolean boolean31 = lFSR30.getLastBit();
        boolean boolean33 = lFSR30.get((int) (byte) 0);
        boolean boolean34 = lFSR30.getClockBit();
        boolean boolean35 = lFSR30.getClockBit();
        java.lang.String str36 = lFSR30.toString();
        boolean boolean37 = lFSR30.getClockBit();
        java.lang.Class<?> wildcardClass38 = lFSR30.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "{}" + "'", str36, "{}");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        int[] intArray13 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(1, (-1), intArray13);
        boolean boolean19 = lFSR18.clock();
        boolean boolean20 = lFSR18.clock();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        int[] intArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) -1, (int) (byte) 1, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        int[] intArray7 = new int[] { (short) 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) -1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 10, intArray7);
        boolean boolean12 = lFSR10.get(100);
        boolean boolean13 = lFSR10.getLastBit();
        java.lang.String str14 = lFSR10.toString();
        boolean boolean15 = lFSR10.getLastBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getClockBit();
        java.lang.String str15 = lFSR6.toString();
        boolean boolean16 = lFSR6.clock();
        boolean boolean17 = lFSR6.getLastBit();
        boolean boolean18 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.get(0);
        boolean boolean14 = lFSR6.getClockBit();
        boolean boolean16 = lFSR6.get((int) (short) 10);
        boolean boolean18 = lFSR6.get((int) (short) 0);
        boolean boolean20 = lFSR6.get((int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        int[] intArray25 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) -1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 100, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) '#', intArray25);
        java.lang.String str37 = lFSR36.toString();
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "{}" + "'", str37, "{}");
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.clock();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get(100);
        boolean boolean14 = lFSR6.get((int) (short) 10);
        boolean boolean15 = lFSR6.getClockBit();
        boolean boolean17 = lFSR6.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        int[] intArray25 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) -1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 100, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 10, intArray25);
        boolean boolean38 = lFSR36.get((int) (byte) 100);
        boolean boolean40 = lFSR36.get((int) ' ');
        boolean boolean41 = lFSR36.clock();
        boolean boolean43 = lFSR36.get(100);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(0);
        boolean boolean13 = lFSR6.clock();
        java.lang.String str14 = lFSR6.toString();
        boolean boolean15 = lFSR6.clock();
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.clock();
        java.lang.String str18 = lFSR6.toString();
        java.lang.String str19 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '4', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (-1), intArray21);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.clock();
        boolean boolean14 = lFSR6.get((int) '4');
        boolean boolean15 = lFSR6.clock();
        java.lang.String str16 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) ' ', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (byte) -1, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = lFSR21.getClockBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(64, 64, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) '4', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 10, intArray23);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) ' ');
        boolean boolean10 = lFSR6.clock();
        boolean boolean11 = lFSR6.clock();
        boolean boolean12 = lFSR6.clock();
        boolean boolean13 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray17);
        boolean boolean25 = lFSR24.getClockBit();
        boolean boolean26 = lFSR24.getClockBit();
        boolean boolean27 = lFSR24.clock();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray21);
        boolean boolean31 = lFSR30.getLastBit();
        boolean boolean32 = lFSR30.clock();
        boolean boolean33 = lFSR30.clock();
        boolean boolean35 = lFSR30.get((int) (byte) 0);
        java.util.BitSet bitSet36 = null;
        java.util.BitSet bitSet37 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR30.initialize(bitSet36, bitSet37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) 'a', intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        int[] intArray9 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray9);
        boolean boolean13 = lFSR12.clock();
        boolean boolean14 = lFSR12.clock();
        boolean boolean15 = lFSR12.clock();
        java.util.BitSet bitSet16 = null;
        java.util.BitSet bitSet17 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR12.initialize(bitSet16, bitSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray17);
        boolean boolean25 = lFSR24.clock();
        java.lang.String str26 = lFSR24.toString();
        boolean boolean27 = lFSR24.getClockBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = lFSR24.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray11);
        boolean boolean17 = lFSR15.get((int) (byte) 10);
        boolean boolean19 = lFSR15.get((int) ' ');
        boolean boolean20 = lFSR15.getLastBit();
        boolean boolean21 = lFSR15.getClockBit();
        boolean boolean22 = lFSR15.getClockBit();
        java.util.BitSet bitSet23 = null;
        java.util.BitSet bitSet24 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR15.initialize(bitSet23, bitSet24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        int[] intArray31 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR37 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR40 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) -1, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR41 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 100, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR42 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) '#', intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR43 = new com.thealgorithms.ciphers.a5.LFSR(22, 0, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR44 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (byte) 1, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR45 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) 100, intArray31);
        boolean boolean46 = lFSR45.getClockBit();
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) '#', intArray15);
        boolean boolean22 = lFSR21.getClockBit();
        java.lang.String str23 = lFSR21.toString();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) '#');
        boolean boolean15 = lFSR9.getLastBit();
        java.lang.String str16 = lFSR9.toString();
        boolean boolean18 = lFSR9.get((int) (byte) 100);
        java.lang.String str19 = lFSR9.toString();
        boolean boolean20 = lFSR9.getLastBit();
        boolean boolean21 = lFSR9.clock();
        boolean boolean22 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray21);
        boolean boolean31 = lFSR30.getLastBit();
        java.lang.String str32 = lFSR30.toString();
        boolean boolean33 = lFSR30.getClockBit();
        boolean boolean34 = lFSR30.getLastBit();
        boolean boolean35 = lFSR30.getClockBit();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "{}" + "'", str32, "{}");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        int[] intArray9 = new int[] { 10, 22, 10 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(1, 64, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        boolean boolean14 = lFSR12.clock();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 22, 10]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        boolean boolean10 = lFSR6.clock();
        boolean boolean11 = lFSR6.getClockBit();
        java.lang.String str12 = lFSR6.toString();
        boolean boolean13 = lFSR6.getClockBit();
        boolean boolean14 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.get((int) ' ');
        boolean boolean13 = lFSR9.getClockBit();
        boolean boolean14 = lFSR9.getClockBit();
        java.lang.String str15 = lFSR9.toString();
        boolean boolean16 = lFSR9.getLastBit();
        boolean boolean17 = lFSR9.clock();
        java.lang.Class<?> wildcardClass18 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 100, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) 'a', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 64, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) 10, intArray23);
        boolean boolean35 = lFSR33.get((int) ' ');
        boolean boolean36 = lFSR33.getClockBit();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray11);
        boolean boolean17 = lFSR15.get((int) (byte) 10);
        boolean boolean19 = lFSR15.get((int) ' ');
        boolean boolean20 = lFSR15.getLastBit();
        boolean boolean21 = lFSR15.getLastBit();
        boolean boolean22 = lFSR15.clock();
        java.util.BitSet bitSet23 = null;
        java.util.BitSet bitSet24 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR15.initialize(bitSet23, bitSet24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.clock();
        java.lang.String str12 = lFSR6.toString();
        boolean boolean14 = lFSR6.get((int) (byte) 100);
        boolean boolean15 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        int[] intArray29 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR37 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 0, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) ' ', intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) '4', intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR40 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 100, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR41 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray29);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR42 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) -1, (int) (byte) 1, intArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 1, 1]");
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        int[] intArray25 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (byte) 100, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (byte) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray25);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) -1, (int) (short) 100, intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 64, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        int[] intArray25 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR(1, 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) -1, intArray25);
        java.util.BitSet bitSet37 = null;
        java.util.BitSet bitSet38 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR36.initialize(bitSet37, bitSet38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 100, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean15 = lFSR12.get((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = lFSR12.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        java.lang.String str14 = lFSR12.toString();
        java.lang.String str15 = lFSR12.toString();
        boolean boolean16 = lFSR12.clock();
        boolean boolean17 = lFSR12.getClockBit();
        boolean boolean18 = lFSR12.getClockBit();
        boolean boolean20 = lFSR12.get(0);
        java.lang.Class<?> wildcardClass21 = lFSR12.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        int[] intArray13 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray13);
        java.lang.String str19 = lFSR18.toString();
        java.util.BitSet bitSet20 = null;
        java.util.BitSet bitSet21 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR18.initialize(bitSet20, bitSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        java.lang.String str17 = lFSR15.toString();
        boolean boolean18 = lFSR15.getLastBit();
        java.lang.Class<?> wildcardClass19 = lFSR15.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.clock();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean10 = lFSR6.get((int) (short) 100);
        boolean boolean11 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean11 = lFSR6.getClockBit();
        java.lang.String str12 = lFSR6.toString();
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.get((int) (byte) 100);
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.getLastBit();
        boolean boolean19 = lFSR6.get((int) (short) 10);
        boolean boolean20 = lFSR6.clock();
        java.lang.String str21 = lFSR6.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = lFSR6.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean11 = lFSR6.get(64);
        boolean boolean12 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.getLastBit();
        java.lang.String str14 = lFSR6.toString();
        boolean boolean15 = lFSR6.clock();
        boolean boolean16 = lFSR6.clock();
        boolean boolean18 = lFSR6.get(0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (-1), intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, 100, intArray13);
        boolean boolean20 = lFSR18.get((int) '#');
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        int[] intArray25 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 64, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) '#', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR(0, 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (-1), intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) '#', intArray25);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        int[] intArray27 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR37 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) ' ', intArray27);
        boolean boolean40 = lFSR39.clock();
        java.lang.String str41 = lFSR39.toString();
        boolean boolean42 = lFSR39.getLastBit();
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "{}" + "'", str41, "{}");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 22, intArray15);
        boolean boolean23 = lFSR21.get((int) (byte) 1);
        boolean boolean24 = lFSR21.getClockBit();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) ' ', intArray2);
        boolean boolean5 = lFSR3.get(0);
        java.lang.Class<?> wildcardClass6 = lFSR3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray9);
        boolean boolean14 = lFSR12.get((int) ' ');
        boolean boolean16 = lFSR12.get((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = lFSR12.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(100, 0, intArray23);
        java.lang.String str34 = lFSR33.toString();
        boolean boolean36 = lFSR33.get(0);
        boolean boolean37 = lFSR33.getLastBit();
        boolean boolean38 = lFSR33.getLastBit();
        boolean boolean39 = lFSR33.getLastBit();
        boolean boolean40 = lFSR33.getLastBit();
        boolean boolean41 = lFSR33.getLastBit();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 64, intArray13);
        boolean boolean19 = lFSR18.getClockBit();
        boolean boolean20 = lFSR18.clock();
        java.util.BitSet bitSet21 = null;
        java.util.BitSet bitSet22 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR18.initialize(bitSet21, bitSet22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(64, 0, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        java.lang.String str12 = lFSR9.toString();
        java.lang.String str13 = lFSR9.toString();
        boolean boolean14 = lFSR9.getLastBit();
        boolean boolean15 = lFSR9.clock();
        boolean boolean17 = lFSR9.get((int) ' ');
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 1, intArray19);
        boolean boolean28 = lFSR27.getLastBit();
        boolean boolean29 = lFSR27.getLastBit();
        java.lang.String str30 = lFSR27.toString();
        boolean boolean31 = lFSR27.clock();
        boolean boolean32 = lFSR27.getClockBit();
        boolean boolean34 = lFSR27.get(100);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{}" + "'", str30, "{}");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.get(0);
        java.lang.Class<?> wildcardClass13 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(10, 64, intArray19);
        java.lang.String str28 = lFSR27.toString();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{}" + "'", str28, "{}");
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) ' ');
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.get((int) (byte) 100);
        boolean boolean14 = lFSR6.get((int) (byte) 100);
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.getClockBit();
        boolean boolean17 = lFSR6.getClockBit();
        java.lang.String str18 = lFSR6.toString();
        boolean boolean19 = lFSR6.getClockBit();
        boolean boolean20 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        int[] intArray11 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) ' ', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) ' ', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) '4', intArray11);
        boolean boolean16 = lFSR15.getLastBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[22, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.getLastBit();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean9 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.get(0);
        boolean boolean12 = lFSR6.clock();
        java.lang.String str13 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 1, intArray21);
        boolean boolean31 = lFSR30.getClockBit();
        java.lang.String str32 = lFSR30.toString();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "{}" + "'", str32, "{}");
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (byte) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 100, intArray21);
        java.lang.String str31 = lFSR30.toString();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "{}" + "'", str31, "{}");
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        int[] intArray13 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (short) 10, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray13);
        java.util.BitSet bitSet19 = null;
        java.util.BitSet bitSet20 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR18.initialize(bitSet19, bitSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 0, 100]");
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 22, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 100, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 1, intArray23);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray11);
        boolean boolean16 = lFSR15.clock();
        java.lang.Class<?> wildcardClass17 = lFSR15.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean13 = lFSR9.getClockBit();
        boolean boolean14 = lFSR9.clock();
        boolean boolean16 = lFSR9.get(10);
        java.lang.String str17 = lFSR9.toString();
        boolean boolean18 = lFSR9.getLastBit();
        boolean boolean19 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray15);
        boolean boolean23 = lFSR21.get(100);
        boolean boolean25 = lFSR21.get((int) (short) 0);
        java.lang.String str26 = lFSR21.toString();
        boolean boolean28 = lFSR21.get((int) (short) 10);
        java.lang.Class<?> wildcardClass29 = lFSR21.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) ' ');
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(1);
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.get(100);
        boolean boolean17 = lFSR6.get((int) (byte) 100);
        boolean boolean18 = lFSR6.clock();
        boolean boolean19 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(1, 22, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) '#');
        boolean boolean15 = lFSR9.getLastBit();
        java.lang.String str16 = lFSR9.toString();
        boolean boolean18 = lFSR9.get((int) (byte) 100);
        boolean boolean19 = lFSR9.getClockBit();
        boolean boolean20 = lFSR9.clock();
        boolean boolean21 = lFSR9.clock();
        boolean boolean22 = lFSR9.getLastBit();
        java.lang.String str23 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(22, 22, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        int[] intArray11 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) 10, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 64, intArray11);
        boolean boolean16 = lFSR15.clock();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(10, 10, intArray15);
        boolean boolean22 = lFSR21.getLastBit();
        java.lang.String str23 = lFSR21.toString();
        java.lang.String str24 = lFSR21.toString();
        boolean boolean25 = lFSR21.getClockBit();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{}" + "'", str24, "{}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray2);
        java.lang.Class<?> wildcardClass4 = lFSR3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getClockBit();
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.get(1);
        boolean boolean18 = lFSR6.getClockBit();
        boolean boolean19 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) (short) 0);
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.get(100);
        boolean boolean17 = lFSR6.clock();
        java.lang.String str18 = lFSR6.toString();
        boolean boolean19 = lFSR6.getLastBit();
        boolean boolean20 = lFSR6.clock();
        java.lang.String str21 = lFSR6.toString();
        boolean boolean22 = lFSR6.clock();
        boolean boolean23 = lFSR6.getClockBit();
        boolean boolean24 = lFSR6.getClockBit();
        java.util.BitSet bitSet25 = null;
        java.util.BitSet bitSet26 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR6.initialize(bitSet25, bitSet26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray11);
        boolean boolean16 = lFSR15.clock();
        java.lang.Class<?> wildcardClass17 = lFSR15.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) 'a', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 100, intArray13);
        java.util.BitSet bitSet19 = null;
        java.util.BitSet bitSet20 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR18.initialize(bitSet19, bitSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.clock();
        boolean boolean13 = lFSR9.getClockBit();
        java.util.BitSet bitSet14 = null;
        java.util.BitSet bitSet15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR9.initialize(bitSet14, bitSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.get((int) (byte) 0);
        boolean boolean14 = lFSR6.clock();
        boolean boolean15 = lFSR6.getClockBit();
        boolean boolean16 = lFSR6.getClockBit();
        boolean boolean18 = lFSR6.get((int) (byte) 10);
        boolean boolean19 = lFSR6.getClockBit();
        java.lang.String str20 = lFSR6.toString();
        java.lang.String str21 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.clock();
        java.lang.String str14 = lFSR9.toString();
        boolean boolean15 = lFSR9.getClockBit();
        boolean boolean16 = lFSR9.getClockBit();
        boolean boolean17 = lFSR9.getClockBit();
        boolean boolean18 = lFSR9.getLastBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        int[] intArray7 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        java.lang.Class<?> wildcardClass10 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.get(1);
        boolean boolean13 = lFSR9.getClockBit();
        java.lang.String str14 = lFSR9.toString();
        boolean boolean15 = lFSR9.getClockBit();
        boolean boolean17 = lFSR9.get(0);
        boolean boolean19 = lFSR9.get((int) ' ');
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 10, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        java.util.BitSet bitSet13 = null;
        java.util.BitSet bitSet14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR12.initialize(bitSet13, bitSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(0, 100, intArray11);
        java.lang.String str16 = lFSR15.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = lFSR15.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        int[] intArray13 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (short) 10, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, 10, intArray13);
        boolean boolean20 = lFSR18.get((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        int[] intArray5 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray5);
        java.lang.String str7 = lFSR6.toString();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean9 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 52, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.get(22);
        boolean boolean19 = lFSR6.get((int) (short) 10);
        boolean boolean20 = lFSR6.getLastBit();
        java.lang.String str21 = lFSR6.toString();
        boolean boolean22 = lFSR6.getClockBit();
        java.lang.String str23 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) 'a', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 0, intArray11);
        boolean boolean17 = lFSR15.get((int) (short) 0);
        boolean boolean18 = lFSR15.clock();
        java.lang.String str19 = lFSR15.toString();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray15);
        boolean boolean23 = lFSR21.get(100);
        boolean boolean25 = lFSR21.get((int) (short) 0);
        java.lang.String str26 = lFSR21.toString();
        boolean boolean28 = lFSR21.get((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = lFSR21.getClockBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        int[] intArray5 = new int[] { (short) 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray5);
        com.thealgorithms.ciphers.a5.LFSR lFSR7 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) -1, intArray5);
        java.util.BitSet bitSet8 = null;
        java.util.BitSet bitSet9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR7.initialize(bitSet8, bitSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) 'a', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) '#', intArray13);
        java.lang.Class<?> wildcardClass19 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) '#', intArray19);
        java.lang.String str28 = lFSR27.toString();
        boolean boolean29 = lFSR27.getLastBit();
        java.lang.Class<?> wildcardClass30 = lFSR27.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{}" + "'", str28, "{}");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) 'a', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 0, intArray11);
        boolean boolean16 = lFSR15.clock();
        boolean boolean17 = lFSR15.clock();
        java.util.BitSet bitSet18 = null;
        java.util.BitSet bitSet19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR15.initialize(bitSet18, bitSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(100, 100, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.get((int) (short) 100);
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get((int) (short) 1);
        boolean boolean14 = lFSR6.get((int) '4');
        java.util.BitSet bitSet15 = null;
        java.util.BitSet bitSet16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR6.initialize(bitSet15, bitSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        int[] intArray5 = new int[] { (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) 100, intArray5);
        com.thealgorithms.ciphers.a5.LFSR lFSR7 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray5);
        boolean boolean8 = lFSR7.getClockBit();
        boolean boolean10 = lFSR7.get((int) '#');
        boolean boolean11 = lFSR7.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) ' ');
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.get((int) (byte) 100);
        boolean boolean14 = lFSR6.get((int) (byte) 100);
        boolean boolean15 = lFSR6.getLastBit();
        java.lang.String str16 = lFSR6.toString();
        boolean boolean18 = lFSR6.get((int) (byte) 100);
        boolean boolean19 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(1, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        int[] intArray7 = new int[] { (short) 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) -1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 10, intArray7);
        boolean boolean12 = lFSR10.get(100);
        java.lang.String str13 = lFSR10.toString();
        java.lang.String str14 = lFSR10.toString();
        boolean boolean15 = lFSR10.clock();
        boolean boolean17 = lFSR10.get(1);
        java.util.BitSet bitSet18 = null;
        java.util.BitSet bitSet19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR10.initialize(bitSet18, bitSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        boolean boolean22 = lFSR21.getClockBit();
        boolean boolean23 = lFSR21.getClockBit();
        java.util.BitSet bitSet24 = null;
        java.util.BitSet bitSet25 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR21.initialize(bitSet24, bitSet25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.clock();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean9 = lFSR6.getClockBit();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) ' ', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 100, intArray11);
        boolean boolean16 = lFSR15.getLastBit();
        java.lang.String str17 = lFSR15.toString();
        boolean boolean18 = lFSR15.clock();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) '#');
        boolean boolean16 = lFSR9.get((int) 'a');
        boolean boolean18 = lFSR9.get((int) '#');
        boolean boolean19 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (byte) 100, intArray19);
        boolean boolean29 = lFSR27.get((int) (byte) 100);
        boolean boolean30 = lFSR27.getLastBit();
        boolean boolean32 = lFSR27.get((int) (byte) 1);
        boolean boolean33 = lFSR27.getLastBit();
        java.lang.Class<?> wildcardClass34 = lFSR27.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(1, 64, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 100, intArray11);
        java.lang.Class<?> wildcardClass16 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray11);
        boolean boolean16 = lFSR15.getLastBit();
        boolean boolean18 = lFSR15.get(0);
        java.lang.String str19 = lFSR15.toString();
        java.util.BitSet bitSet20 = null;
        java.util.BitSet bitSet21 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR15.initialize(bitSet20, bitSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(100, 64, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) 'a', intArray23);
        boolean boolean34 = lFSR33.getLastBit();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, 0, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = lFSR21.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        boolean boolean17 = lFSR15.clock();
        boolean boolean18 = lFSR15.getLastBit();
        java.lang.Class<?> wildcardClass19 = lFSR15.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.clock();
        java.lang.String str14 = lFSR9.toString();
        boolean boolean15 = lFSR9.getClockBit();
        java.lang.String str16 = lFSR9.toString();
        boolean boolean17 = lFSR9.getLastBit();
        boolean boolean18 = lFSR9.clock();
        java.lang.Class<?> wildcardClass19 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean8 = lFSR6.get((int) '4');
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
        java.lang.String str12 = lFSR6.toString();
        boolean boolean14 = lFSR6.get(22);
        java.lang.String str15 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(100, 64, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean15 = lFSR12.get((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) (short) 0);
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.get(1);
        java.lang.String str18 = lFSR6.toString();
        boolean boolean20 = lFSR6.get(0);
        boolean boolean21 = lFSR6.getClockBit();
        java.lang.String str22 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) (byte) 10);
        boolean boolean13 = lFSR6.clock();
        boolean boolean15 = lFSR6.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.clock();
        boolean boolean14 = lFSR12.getClockBit();
        boolean boolean15 = lFSR12.getClockBit();
        java.lang.String str16 = lFSR12.toString();
        boolean boolean17 = lFSR12.getLastBit();
        boolean boolean18 = lFSR12.getClockBit();
        java.lang.String str19 = lFSR12.toString();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        java.lang.String str10 = lFSR9.toString();
        boolean boolean11 = lFSR9.getLastBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        int[] intArray13 = new int[] { 10, 22, 10 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((-1), 0, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 22, 10]");
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) ' ', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 22, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) '#', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (short) 100, intArray19);
        boolean boolean28 = lFSR27.getLastBit();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 100, intArray17);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) -1, (int) '#', intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) ' ');
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.get((int) (byte) 100);
        boolean boolean14 = lFSR6.get((int) (byte) 100);
        boolean boolean16 = lFSR6.get(1);
        boolean boolean17 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) (byte) 10);
        boolean boolean13 = lFSR6.getClockBit();
        boolean boolean15 = lFSR6.get((int) (short) 1);
        boolean boolean16 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 0, intArray23);
        boolean boolean35 = lFSR33.get((int) (short) 1);
        boolean boolean37 = lFSR33.get((int) (short) 1);
        boolean boolean38 = lFSR33.getLastBit();
        boolean boolean39 = lFSR33.getClockBit();
        boolean boolean40 = lFSR33.clock();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        java.lang.String str10 = lFSR9.toString();
        boolean boolean11 = lFSR9.clock();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) (short) 0);
        boolean boolean15 = lFSR9.getClockBit();
        boolean boolean17 = lFSR9.get((int) (short) 100);
        java.lang.String str18 = lFSR9.toString();
        boolean boolean19 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        int[] intArray10 = new int[] { 100, 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) 100, intArray10);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) '4', intArray10);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(0, 1, intArray10);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (byte) 100, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0]");
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 22, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) '#', intArray17);
        boolean boolean25 = lFSR24.getLastBit();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        int[] intArray7 = new int[] { 10, 22, 10 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray7);
        boolean boolean11 = lFSR9.get((int) 'a');
        java.lang.String str12 = lFSR9.toString();
        boolean boolean13 = lFSR9.getLastBit();
        boolean boolean14 = lFSR9.getLastBit();
        java.lang.String str15 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 22, 10]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) 'a', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray13);
        boolean boolean20 = lFSR18.get((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = lFSR18.getClockBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean8 = lFSR6.get((int) '4');
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
        java.lang.String str12 = lFSR6.toString();
        boolean boolean14 = lFSR6.get(22);
        boolean boolean15 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (short) 100, intArray7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 0, intArray17);
        boolean boolean26 = lFSR24.get(22);
        java.lang.String str27 = lFSR24.toString();
        java.util.BitSet bitSet28 = null;
        java.util.BitSet bitSet29 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR24.initialize(bitSet28, bitSet29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{}" + "'", str27, "{}");
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (byte) 100, intArray2);
        java.lang.String str4 = lFSR3.toString();
        java.util.BitSet bitSet5 = null;
        java.util.BitSet bitSet6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR3.initialize(bitSet5, bitSet6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (byte) 100, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (byte) -1, intArray23);
        java.util.BitSet bitSet34 = null;
        java.util.BitSet bitSet35 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR33.initialize(bitSet34, bitSet35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 64, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) '4', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(100, 0, intArray19);
        java.lang.String str28 = lFSR27.toString();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{}" + "'", str28, "{}");
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.getLastBit();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean9 = lFSR6.getLastBit();
        boolean boolean10 = lFSR6.getLastBit();
        java.lang.Class<?> wildcardClass11 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean13 = lFSR9.getLastBit();
        java.lang.String str14 = lFSR9.toString();
        boolean boolean15 = lFSR9.getLastBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.get(1);
        boolean boolean13 = lFSR9.getClockBit();
        java.lang.String str14 = lFSR9.toString();
        java.lang.String str15 = lFSR9.toString();
        boolean boolean17 = lFSR9.get(100);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.get((int) ' ');
        boolean boolean13 = lFSR9.getClockBit();
        boolean boolean14 = lFSR9.getClockBit();
        java.lang.String str15 = lFSR9.toString();
        boolean boolean16 = lFSR9.getLastBit();
        boolean boolean17 = lFSR9.clock();
        java.lang.String str18 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) '4', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) '4', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray21);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) '#');
        boolean boolean15 = lFSR9.getLastBit();
        boolean boolean16 = lFSR9.getClockBit();
        java.lang.String str17 = lFSR9.toString();
        boolean boolean18 = lFSR9.clock();
        java.lang.String str19 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 1, intArray17);
        java.lang.String str25 = lFSR24.toString();
        boolean boolean26 = lFSR24.getClockBit();
        boolean boolean27 = lFSR24.getClockBit();
        boolean boolean29 = lFSR24.get((int) '4');
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) ' ');
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.get((int) (byte) 100);
        boolean boolean14 = lFSR6.get((int) (byte) 100);
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.getClockBit();
        boolean boolean17 = lFSR6.clock();
        boolean boolean19 = lFSR6.get(0);
        boolean boolean20 = lFSR6.getLastBit();
        boolean boolean21 = lFSR6.getClockBit();
        boolean boolean22 = lFSR6.clock();
        boolean boolean23 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean14 = lFSR12.getLastBit();
        boolean boolean15 = lFSR12.clock();
        boolean boolean16 = lFSR12.getClockBit();
        java.lang.String str17 = lFSR12.toString();
        java.lang.String str18 = lFSR12.toString();
        boolean boolean19 = lFSR12.getLastBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        int[] intArray33 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR37 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR40 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR41 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR42 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR43 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 0, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR44 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR45 = new com.thealgorithms.ciphers.a5.LFSR(0, 100, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR46 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (short) -1, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR47 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 1, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR48 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (short) 10, intArray33);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 1, 1]");
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, 1, intArray15);
        boolean boolean22 = lFSR21.getClockBit();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean15 = lFSR12.get((int) (short) 1);
        java.lang.String str16 = lFSR12.toString();
        java.util.BitSet bitSet17 = null;
        java.util.BitSet bitSet18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR12.initialize(bitSet17, bitSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        java.lang.String str17 = lFSR15.toString();
        boolean boolean19 = lFSR15.get((int) ' ');
        boolean boolean21 = lFSR15.get((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) '#');
        boolean boolean15 = lFSR9.getLastBit();
        java.lang.String str16 = lFSR9.toString();
        boolean boolean18 = lFSR9.get((int) '4');
        boolean boolean19 = lFSR9.getClockBit();
        java.lang.String str20 = lFSR9.toString();
        boolean boolean21 = lFSR9.getLastBit();
        boolean boolean23 = lFSR9.get((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean12 = lFSR6.clock();
        boolean boolean13 = lFSR6.getLastBit();
        java.util.BitSet bitSet14 = null;
        java.util.BitSet bitSet15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR6.initialize(bitSet14, bitSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 100, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) 'a', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 64, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 100, intArray23);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray11);
        boolean boolean16 = lFSR15.clock();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = lFSR15.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (byte) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (-1), intArray17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = lFSR24.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getClockBit();
        boolean boolean10 = lFSR6.get(22);
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.getClockBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = lFSR6.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) '#');
        java.lang.String str15 = lFSR9.toString();
        boolean boolean16 = lFSR9.clock();
        boolean boolean17 = lFSR9.getLastBit();
        boolean boolean19 = lFSR9.get((int) (byte) 100);
        boolean boolean20 = lFSR9.clock();
        boolean boolean21 = lFSR9.clock();
        boolean boolean22 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, 100, intArray17);
        boolean boolean25 = lFSR24.getClockBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = lFSR24.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.clock();
        boolean boolean9 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.get((int) (short) 10);
        boolean boolean12 = lFSR6.clock();
        java.lang.String str13 = lFSR6.toString();
        boolean boolean15 = lFSR6.get((int) 'a');
        boolean boolean17 = lFSR6.get((int) (short) 100);
        boolean boolean18 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray19);
        boolean boolean28 = lFSR27.clock();
        java.lang.String str29 = lFSR27.toString();
        boolean boolean30 = lFSR27.clock();
        java.util.BitSet bitSet31 = null;
        java.util.BitSet bitSet32 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR27.initialize(bitSet31, bitSet32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "{}" + "'", str29, "{}");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 1, intArray19);
        boolean boolean28 = lFSR27.getLastBit();
        java.lang.String str29 = lFSR27.toString();
        java.lang.String str30 = lFSR27.toString();
        boolean boolean31 = lFSR27.getLastBit();
        java.util.BitSet bitSet32 = null;
        java.util.BitSet bitSet33 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR27.initialize(bitSet32, bitSet33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "{}" + "'", str29, "{}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{}" + "'", str30, "{}");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        int[] intArray5 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.getLastBit();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.get((int) ' ');
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.get((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 52, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.get(22);
        boolean boolean15 = lFSR6.getClockBit();
        boolean boolean17 = lFSR6.get(0);
        boolean boolean18 = lFSR6.clock();
        boolean boolean20 = lFSR6.get((int) (short) 1);
        boolean boolean21 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 10, intArray13);
        boolean boolean19 = lFSR18.getClockBit();
        java.lang.String str20 = lFSR18.toString();
        java.lang.String str21 = lFSR18.toString();
        boolean boolean23 = lFSR18.get((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (short) -1, intArray17);
        java.lang.Class<?> wildcardClass25 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get(10);
        java.lang.String str13 = lFSR6.toString();
        boolean boolean14 = lFSR6.getClockBit();
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.getLastBit();
        java.util.BitSet bitSet18 = null;
        java.util.BitSet bitSet19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR6.initialize(bitSet18, bitSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 100, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(0, 64, intArray11);
        boolean boolean17 = lFSR15.get((int) (byte) 1);
        java.lang.String str18 = lFSR15.toString();
        boolean boolean19 = lFSR15.getClockBit();
        boolean boolean21 = lFSR15.get(0);
        boolean boolean22 = lFSR15.getClockBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean14 = lFSR12.getLastBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(0);
        boolean boolean14 = lFSR6.get(100);
        java.lang.Class<?> wildcardClass15 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        int[] intArray9 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) ' ', intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 52, 1]");
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray17);
        boolean boolean25 = lFSR24.clock();
        java.lang.String str26 = lFSR24.toString();
        boolean boolean27 = lFSR24.getLastBit();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean8 = lFSR6.clock();
        boolean boolean10 = lFSR6.get((int) (byte) 100);
        boolean boolean11 = lFSR6.getLastBit();
        boolean boolean13 = lFSR6.get((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray9);
        boolean boolean14 = lFSR12.get(64);
        java.lang.String str15 = lFSR12.toString();
        boolean boolean16 = lFSR12.getLastBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        boolean boolean12 = lFSR9.getClockBit();
        boolean boolean13 = lFSR9.getLastBit();
        boolean boolean14 = lFSR9.clock();
        boolean boolean15 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        int[] intArray25 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) -1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 100, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (-1), intArray25);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 22, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) ' ', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) -1, intArray19);
        java.lang.String str28 = lFSR27.toString();
        java.util.BitSet bitSet29 = null;
        java.util.BitSet bitSet30 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR27.initialize(bitSet29, bitSet30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{}" + "'", str28, "{}");
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 64, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 10, intArray17);
        java.lang.String str25 = lFSR24.toString();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.get(22);
        boolean boolean18 = lFSR6.getClockBit();
        boolean boolean20 = lFSR6.get((int) (short) 100);
        boolean boolean22 = lFSR6.get(100);
        java.lang.String str23 = lFSR6.toString();
        boolean boolean24 = lFSR6.getClockBit();
        boolean boolean25 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        int[] intArray11 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 64, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 0, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 0, 100]");
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 0, intArray11);
        boolean boolean16 = lFSR15.getLastBit();
        boolean boolean17 = lFSR15.getLastBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) '#', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray23);
        java.util.BitSet bitSet34 = null;
        java.util.BitSet bitSet35 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR33.initialize(bitSet34, bitSet35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean11 = lFSR6.get((int) ' ');
        boolean boolean13 = lFSR6.get(100);
        boolean boolean14 = lFSR6.getClockBit();
        java.lang.String str15 = lFSR6.toString();
        java.lang.Class<?> wildcardClass16 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean11 = lFSR6.get(10);
        boolean boolean12 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get(10);
        java.lang.String str13 = lFSR6.toString();
        boolean boolean15 = lFSR6.get((int) '4');
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.clock();
        boolean boolean19 = lFSR6.get(22);
        boolean boolean20 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.getClockBit();
        java.util.BitSet bitSet14 = null;
        java.util.BitSet bitSet15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR9.initialize(bitSet14, bitSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.get(22);
        boolean boolean14 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) (short) 0);
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.getLastBit();
        java.lang.String str15 = lFSR6.toString();
        boolean boolean17 = lFSR6.get((int) (short) 1);
        boolean boolean18 = lFSR6.getLastBit();
        boolean boolean19 = lFSR6.getClockBit();
        boolean boolean20 = lFSR6.clock();
        boolean boolean22 = lFSR6.get((int) (byte) 10);
        boolean boolean24 = lFSR6.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) ' ', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) -1, intArray13);
        java.lang.String str19 = lFSR18.toString();
        java.util.BitSet bitSet20 = null;
        java.util.BitSet bitSet21 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR18.initialize(bitSet20, bitSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get(10);
        boolean boolean13 = lFSR6.getLastBit();
        java.lang.String str14 = lFSR6.toString();
        boolean boolean16 = lFSR6.get((int) ' ');
        boolean boolean17 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, 1, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = lFSR15.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getLastBit();
        boolean boolean15 = lFSR12.get((int) ' ');
        boolean boolean16 = lFSR12.getClockBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray9);
        boolean boolean13 = lFSR12.getLastBit();
        boolean boolean14 = lFSR12.getLastBit();
        boolean boolean16 = lFSR12.get((int) '4');
        boolean boolean17 = lFSR12.clock();
        boolean boolean19 = lFSR12.get((int) (byte) 100);
        java.lang.String str20 = lFSR12.toString();
        boolean boolean21 = lFSR12.clock();
        boolean boolean23 = lFSR12.get((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, 100, intArray15);
        boolean boolean22 = lFSR21.getClockBit();
        boolean boolean23 = lFSR21.getClockBit();
        boolean boolean24 = lFSR21.getLastBit();
        boolean boolean26 = lFSR21.get((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) 'a', intArray17);
        boolean boolean25 = lFSR24.clock();
        java.lang.String str26 = lFSR24.toString();
        boolean boolean28 = lFSR24.get((int) '4');
        boolean boolean29 = lFSR24.getLastBit();
        boolean boolean30 = lFSR24.clock();
        boolean boolean32 = lFSR24.get(22);
        boolean boolean34 = lFSR24.get(0);
        java.lang.String str35 = lFSR24.toString();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "{}" + "'", str35, "{}");
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.get(1);
        boolean boolean14 = lFSR9.get((int) (byte) 10);
        boolean boolean15 = lFSR9.getClockBit();
        boolean boolean16 = lFSR9.getClockBit();
        boolean boolean17 = lFSR9.clock();
        java.lang.String str18 = lFSR9.toString();
        java.lang.String str19 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getLastBit();
        boolean boolean10 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 22, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) 100, intArray21);
        java.lang.String str31 = lFSR30.toString();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "{}" + "'", str31, "{}");
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(1, 22, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) 1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 10, intArray15);
        java.lang.Class<?> wildcardClass22 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean11 = lFSR6.get((int) ' ');
        boolean boolean12 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get((int) (byte) 0);
        boolean boolean13 = lFSR6.getClockBit();
        boolean boolean15 = lFSR6.get((int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.getClockBit();
        java.lang.String str15 = lFSR6.toString();
        boolean boolean16 = lFSR6.getClockBit();
        boolean boolean17 = lFSR6.getLastBit();
        boolean boolean18 = lFSR6.getClockBit();
        java.lang.String str19 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        int[] intArray27 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) -1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR37 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 100, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 100, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR(1, 0, intArray27);
        java.lang.String str40 = lFSR39.toString();
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "{}" + "'", str40, "{}");
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) '4', intArray19);
        java.lang.String str28 = lFSR27.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = lFSR27.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{}" + "'", str28, "{}");
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) ' ', intArray9);
        boolean boolean13 = lFSR12.clock();
        boolean boolean14 = lFSR12.getClockBit();
        java.lang.String str15 = lFSR12.toString();
        java.lang.String str16 = lFSR12.toString();
        boolean boolean17 = lFSR12.getLastBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get(10);
        boolean boolean13 = lFSR6.getLastBit();
        java.lang.String str14 = lFSR6.toString();
        boolean boolean15 = lFSR6.clock();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = lFSR6.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean14 = lFSR12.getLastBit();
        java.lang.Class<?> wildcardClass15 = lFSR12.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (byte) 10, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) '#', intArray2);
        boolean boolean4 = lFSR3.getClockBit();
        java.lang.Class<?> wildcardClass5 = lFSR3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(1, 64, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) '#', intArray11);
        java.lang.Class<?> wildcardClass16 = lFSR15.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (byte) 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(0, (-1), intArray21);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(10, 10, intArray15);
        boolean boolean22 = lFSR21.getLastBit();
        java.lang.String str23 = lFSR21.toString();
        java.lang.String str24 = lFSR21.toString();
        java.lang.Class<?> wildcardClass25 = lFSR21.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{}" + "'", str24, "{}");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(22, 22, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = lFSR18.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 22, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 64, intArray17);
        java.util.BitSet bitSet25 = null;
        java.util.BitSet bitSet26 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR24.initialize(bitSet25, bitSet26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 100, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) '4', intArray15);
        boolean boolean22 = lFSR21.clock();
        java.lang.String str23 = lFSR21.toString();
        boolean boolean24 = lFSR21.getLastBit();
        boolean boolean25 = lFSR21.clock();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (short) 100, intArray19);
        boolean boolean28 = lFSR27.getLastBit();
        java.lang.String str29 = lFSR27.toString();
        boolean boolean30 = lFSR27.getClockBit();
        java.lang.Class<?> wildcardClass31 = lFSR27.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "{}" + "'", str29, "{}");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        int[] intArray11 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) 10, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) '#', intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 0, 100]");
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 22, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(22, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, 100, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.clock();
        boolean boolean13 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        int[] intArray9 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        java.lang.String str14 = lFSR12.toString();
        boolean boolean15 = lFSR12.getLastBit();
        java.lang.String str16 = lFSR12.toString();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 52, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        int[] intArray3 = new int[] { (short) 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR4 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray3);
        boolean boolean5 = lFSR4.clock();
        boolean boolean6 = lFSR4.clock();
        java.lang.String str7 = lFSR4.toString();
        java.lang.String str8 = lFSR4.toString();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 100, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        int[] intArray11 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray11);
        boolean boolean16 = lFSR15.getLastBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[22, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        int[] intArray15 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (-1), intArray15);
        boolean boolean22 = lFSR21.getLastBit();
        java.lang.String str23 = lFSR21.toString();
        boolean boolean25 = lFSR21.get((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = lFSR21.getClockBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[52, 52, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray11);
        boolean boolean16 = lFSR15.clock();
        boolean boolean17 = lFSR15.getLastBit();
        boolean boolean18 = lFSR15.getLastBit();
        boolean boolean20 = lFSR15.get((int) (short) 1);
        boolean boolean21 = lFSR15.getLastBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, 0, intArray2);
        java.lang.String str4 = lFSR3.toString();
        java.lang.String str5 = lFSR3.toString();
        java.lang.Class<?> wildcardClass6 = lFSR3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{}" + "'", str5, "{}");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) '#');
        boolean boolean16 = lFSR9.get((int) 'a');
        java.lang.String str17 = lFSR9.toString();
        boolean boolean18 = lFSR9.getLastBit();
        boolean boolean20 = lFSR9.get((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        boolean boolean18 = lFSR15.get((int) (short) 100);
        boolean boolean19 = lFSR15.getClockBit();
        java.lang.String str20 = lFSR15.toString();
        java.lang.String str21 = lFSR15.toString();
        java.util.BitSet bitSet22 = null;
        java.util.BitSet bitSet23 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR15.initialize(bitSet22, bitSet23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(0);
        boolean boolean13 = lFSR6.clock();
        boolean boolean15 = lFSR6.get((int) '#');
        java.lang.String str16 = lFSR6.toString();
        boolean boolean17 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        java.lang.String str12 = lFSR9.toString();
        java.util.BitSet bitSet13 = null;
        java.util.BitSet bitSet14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR9.initialize(bitSet13, bitSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean14 = lFSR12.getLastBit();
        java.lang.String str15 = lFSR12.toString();
        java.lang.String str16 = lFSR12.toString();
        boolean boolean17 = lFSR12.getClockBit();
        boolean boolean18 = lFSR12.getClockBit();
        boolean boolean19 = lFSR12.getClockBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) 'a');
        java.lang.String str10 = lFSR6.toString();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) 'a', intArray15);
        boolean boolean23 = lFSR21.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray9);
        boolean boolean13 = lFSR12.clock();
        boolean boolean14 = lFSR12.getLastBit();
        java.lang.String str15 = lFSR12.toString();
        boolean boolean17 = lFSR12.get(10);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        int[] intArray27 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 64, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) '#', intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR(0, 1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR37 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (-1), intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 100, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) 1, intArray27);
        boolean boolean40 = lFSR39.getLastBit();
        boolean boolean42 = lFSR39.get(0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        int[] intArray29 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR37 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 0, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR40 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR41 = new com.thealgorithms.ciphers.a5.LFSR(0, 100, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR42 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (short) -1, intArray29);
        java.lang.String str43 = lFSR42.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = lFSR42.getClockBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "{}" + "'", str43, "{}");
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) '4', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 100, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getClockBit();
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.getClockBit();
        boolean boolean18 = lFSR6.getClockBit();
        java.lang.Class<?> wildcardClass19 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        int[] intArray29 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR37 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 0, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR40 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR41 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) '4', intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR42 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 10, intArray29);
        java.lang.String str43 = lFSR42.toString();
        java.lang.String str44 = lFSR42.toString();
        boolean boolean45 = lFSR42.getClockBit();
        boolean boolean46 = lFSR42.getClockBit();
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "{}" + "'", str43, "{}");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "{}" + "'", str44, "{}");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray23);
        boolean boolean35 = lFSR33.get((int) '4');
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(1, 64, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) '#', intArray11);
        java.lang.String str16 = lFSR15.toString();
        java.lang.String str17 = lFSR15.toString();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR(64, 100, intArray2);
        boolean boolean4 = lFSR3.getLastBit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 0, intArray23);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 1, intArray19);
        boolean boolean28 = lFSR27.getLastBit();
        boolean boolean29 = lFSR27.getClockBit();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) '#');
        boolean boolean15 = lFSR9.getLastBit();
        java.lang.String str16 = lFSR9.toString();
        boolean boolean17 = lFSR9.clock();
        boolean boolean18 = lFSR9.getLastBit();
        boolean boolean19 = lFSR9.getLastBit();
        java.lang.String str20 = lFSR9.toString();
        boolean boolean21 = lFSR9.getLastBit();
        boolean boolean22 = lFSR9.getLastBit();
        java.lang.Class<?> wildcardClass23 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getClockBit();
        boolean boolean12 = lFSR9.get(1);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray2);
        boolean boolean5 = lFSR3.get(64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray17);
        boolean boolean25 = lFSR24.getClockBit();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.clock();
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.clock();
        boolean boolean18 = lFSR6.get((int) (short) 10);
        boolean boolean19 = lFSR6.getClockBit();
        java.lang.String str20 = lFSR6.toString();
        java.lang.String str21 = lFSR6.toString();
        java.util.BitSet bitSet22 = null;
        java.util.BitSet bitSet23 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR6.initialize(bitSet22, bitSet23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        int[] intArray17 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[22, 10, 100]");
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 64, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (short) -1, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean8 = lFSR6.get((int) '4');
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
        java.lang.String str12 = lFSR6.toString();
        boolean boolean14 = lFSR6.get(0);
        boolean boolean16 = lFSR6.get((int) (byte) 0);
        java.lang.String str17 = lFSR6.toString();
        java.lang.String str18 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        int[] intArray25 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (byte) -1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 100, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR(1, 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) -1, intArray25);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        int[] intArray27 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 100, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) 'a', intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 10, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 64, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR37 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) 10, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 100, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (byte) 10, intArray27);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray11);
        boolean boolean17 = lFSR15.get(1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) '4', intArray15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = lFSR21.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray13);
        boolean boolean19 = lFSR18.getClockBit();
        boolean boolean21 = lFSR18.get((int) (short) 10);
        java.util.BitSet bitSet22 = null;
        java.util.BitSet bitSet23 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR18.initialize(bitSet22, bitSet23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray15);
        boolean boolean22 = lFSR21.clock();
        java.lang.String str23 = lFSR21.toString();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        int[] intArray11 = new int[] { 10, 22, 10 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 22, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.clock();
        java.lang.String str14 = lFSR12.toString();
        boolean boolean15 = lFSR12.clock();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (byte) 100, intArray15);
        boolean boolean22 = lFSR21.clock();
        boolean boolean24 = lFSR21.get(1);
        boolean boolean26 = lFSR21.get((int) (short) 0);
        boolean boolean27 = lFSR21.clock();
        java.util.BitSet bitSet28 = null;
        java.util.BitSet bitSet29 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR21.initialize(bitSet28, bitSet29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        int[] intArray7 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        boolean boolean12 = lFSR9.getLastBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, 52, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) -1, intArray15);
        java.util.BitSet bitSet22 = null;
        java.util.BitSet bitSet23 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR21.initialize(bitSet22, bitSet23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray13);
        boolean boolean19 = lFSR18.getLastBit();
        boolean boolean20 = lFSR18.getLastBit();
        boolean boolean21 = lFSR18.clock();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getClockBit();
        boolean boolean15 = lFSR6.clock();
        java.lang.String str16 = lFSR6.toString();
        boolean boolean18 = lFSR6.get(10);
        boolean boolean20 = lFSR6.get(100);
        boolean boolean21 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.get((int) (byte) 0);
        boolean boolean14 = lFSR6.clock();
        boolean boolean15 = lFSR6.getClockBit();
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean18 = lFSR6.get((int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        int[] intArray15 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 0, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) -1, (-1), intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[52, 52, 1]");
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray11);
        boolean boolean16 = lFSR15.getLastBit();
        boolean boolean17 = lFSR15.getLastBit();
        java.lang.String str18 = lFSR15.toString();
        java.lang.String str19 = lFSR15.toString();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.clock();
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean18 = lFSR6.get(22);
        java.lang.Class<?> wildcardClass19 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (short) 100, intArray17);
        boolean boolean26 = lFSR24.get((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.clock();
        java.lang.String str8 = lFSR6.toString();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.getClockBit();
        java.util.BitSet bitSet13 = null;
        java.util.BitSet bitSet14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR6.initialize(bitSet13, bitSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(10, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(1, 1, intArray17);
        boolean boolean26 = lFSR24.get((int) (short) 100);
        java.lang.Class<?> wildcardClass27 = lFSR24.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.get((int) (byte) 0);
        boolean boolean14 = lFSR6.clock();
        boolean boolean15 = lFSR6.getClockBit();
        boolean boolean16 = lFSR6.getClockBit();
        boolean boolean18 = lFSR6.get((int) (byte) 10);
        boolean boolean19 = lFSR6.getLastBit();
        boolean boolean20 = lFSR6.getLastBit();
        boolean boolean21 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(100, 0, intArray23);
        java.lang.String str34 = lFSR33.toString();
        boolean boolean35 = lFSR33.getClockBit();
        boolean boolean37 = lFSR33.get((int) (byte) 10);
        boolean boolean39 = lFSR33.get((int) ' ');
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray15);
        boolean boolean22 = lFSR21.getLastBit();
        boolean boolean23 = lFSR21.getClockBit();
        boolean boolean24 = lFSR21.getClockBit();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        java.lang.String str17 = lFSR15.toString();
        boolean boolean18 = lFSR15.getClockBit();
        java.lang.String str19 = lFSR15.toString();
        boolean boolean20 = lFSR15.getClockBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) (short) 0);
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.getLastBit();
        java.lang.String str15 = lFSR6.toString();
        boolean boolean17 = lFSR6.get((int) (short) 1);
        boolean boolean18 = lFSR6.getClockBit();
        boolean boolean19 = lFSR6.getClockBit();
        boolean boolean20 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 10, intArray11);
        boolean boolean17 = lFSR15.get(10);
        boolean boolean19 = lFSR15.get((int) '#');
        java.util.BitSet bitSet20 = null;
        java.util.BitSet bitSet21 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR15.initialize(bitSet20, bitSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) 0, intArray13);
        boolean boolean20 = lFSR18.get(64);
        java.lang.String str21 = lFSR18.toString();
        boolean boolean22 = lFSR18.getLastBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean14 = lFSR12.getLastBit();
        boolean boolean15 = lFSR12.getClockBit();
        boolean boolean16 = lFSR12.clock();
        java.lang.String str17 = lFSR12.toString();
        boolean boolean19 = lFSR12.get(100);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = lFSR15.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 10, intArray17);
        boolean boolean25 = lFSR24.getClockBit();
        boolean boolean26 = lFSR24.clock();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) ' ', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) -1, intArray17);
        boolean boolean26 = lFSR24.get((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        int[] intArray13 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray13);
        java.lang.String str19 = lFSR18.toString();
        java.lang.Class<?> wildcardClass20 = lFSR18.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.get((int) ' ');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        int[] intArray7 = new int[] { (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) 100, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 100, intArray7);
        java.lang.String str11 = lFSR10.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = lFSR10.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        java.lang.String str11 = lFSR6.toString();
        java.lang.Class<?> wildcardClass12 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(0);
        boolean boolean14 = lFSR6.get(1);
        boolean boolean16 = lFSR6.get(0);
        boolean boolean17 = lFSR6.getLastBit();
        boolean boolean18 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray19);
        boolean boolean28 = lFSR27.getLastBit();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.get((int) ' ');
        boolean boolean13 = lFSR9.getClockBit();
        boolean boolean14 = lFSR9.getClockBit();
        boolean boolean16 = lFSR9.get(0);
        java.lang.String str17 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get(100);
        boolean boolean13 = lFSR6.clock();
        boolean boolean15 = lFSR6.get(0);
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean18 = lFSR6.get((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        int[] intArray9 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray9);
        java.util.BitSet bitSet13 = null;
        java.util.BitSet bitSet14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR12.initialize(bitSet13, bitSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 52, 1]");
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        java.lang.String str8 = lFSR6.toString();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.clock();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean9 = lFSR6.getClockBit();
        boolean boolean10 = lFSR6.clock();
        boolean boolean11 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 100, intArray21);
        java.lang.String str31 = lFSR30.toString();
        boolean boolean32 = lFSR30.getLastBit();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "{}" + "'", str31, "{}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        int[] intArray27 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) '#', intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR37 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) '4', intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 0, intArray27);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) (short) 0);
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.get(100);
        boolean boolean17 = lFSR6.getClockBit();
        boolean boolean18 = lFSR6.clock();
        java.lang.String str19 = lFSR6.toString();
        boolean boolean20 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 100, intArray2);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) 100, intArray13);
        java.util.BitSet bitSet19 = null;
        java.util.BitSet bitSet20 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR18.initialize(bitSet19, bitSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 64, intArray17);
        boolean boolean25 = lFSR24.clock();
        boolean boolean26 = lFSR24.clock();
        java.lang.Class<?> wildcardClass27 = lFSR24.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, 100, intArray11);
        boolean boolean16 = lFSR15.clock();
        boolean boolean18 = lFSR15.get((int) '4');
        boolean boolean19 = lFSR15.getLastBit();
        boolean boolean20 = lFSR15.getClockBit();
        java.lang.String str21 = lFSR15.toString();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray17);
        boolean boolean25 = lFSR24.clock();
        boolean boolean26 = lFSR24.getLastBit();
        java.lang.String str27 = lFSR24.toString();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{}" + "'", str27, "{}");
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        int[] intArray13 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(22, 1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) -1, 22, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[22, 10, 100]");
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) ' ');
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.get((int) (byte) 100);
        boolean boolean14 = lFSR6.get((int) (byte) 100);
        boolean boolean15 = lFSR6.getLastBit();
        java.lang.String str16 = lFSR6.toString();
        boolean boolean17 = lFSR6.getLastBit();
        boolean boolean19 = lFSR6.get(0);
        boolean boolean20 = lFSR6.getClockBit();
        java.lang.Class<?> wildcardClass21 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 22, intArray15);
        boolean boolean22 = lFSR21.getClockBit();
        boolean boolean24 = lFSR21.get((int) '4');
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray17);
        java.lang.String str25 = lFSR24.toString();
        java.lang.String str26 = lFSR24.toString();
        boolean boolean27 = lFSR24.clock();
        boolean boolean29 = lFSR24.get((int) ' ');
        boolean boolean30 = lFSR24.getLastBit();
        boolean boolean31 = lFSR24.clock();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.get(0);
        boolean boolean14 = lFSR6.getClockBit();
        java.lang.String str15 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) ' ');
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(1);
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getClockBit();
        boolean boolean15 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (byte) 100, intArray15);
        boolean boolean22 = lFSR21.getLastBit();
        boolean boolean23 = lFSR21.getLastBit();
        java.lang.String str24 = lFSR21.toString();
        boolean boolean25 = lFSR21.getClockBit();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{}" + "'", str24, "{}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 64, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) '4', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 10, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((-1), (int) ' ', intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, 0, intArray21);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray13);
        boolean boolean19 = lFSR18.getLastBit();
        java.lang.String str20 = lFSR18.toString();
        boolean boolean21 = lFSR18.getClockBit();
        boolean boolean22 = lFSR18.clock();
        boolean boolean23 = lFSR18.getClockBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getLastBit();
        boolean boolean14 = lFSR12.getLastBit();
        java.lang.String str15 = lFSR12.toString();
        java.util.BitSet bitSet16 = null;
        java.util.BitSet bitSet17 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR12.initialize(bitSet16, bitSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        int[] intArray13 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) 10, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 0, 100]");
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.get(22);
        boolean boolean15 = lFSR6.getClockBit();
        boolean boolean16 = lFSR6.clock();
        boolean boolean18 = lFSR6.get(0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        java.lang.String str13 = lFSR9.toString();
        boolean boolean14 = lFSR9.getLastBit();
        boolean boolean16 = lFSR9.get(0);
        boolean boolean18 = lFSR9.get((int) (short) 1);
        boolean boolean19 = lFSR9.getLastBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) '4', intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) '#', intArray21);
        java.lang.String str31 = lFSR30.toString();
        java.util.BitSet bitSet32 = null;
        java.util.BitSet bitSet33 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR30.initialize(bitSet32, bitSet33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "{}" + "'", str31, "{}");
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 100, intArray23);
        java.lang.String str34 = lFSR33.toString();
        boolean boolean35 = lFSR33.getLastBit();
        boolean boolean36 = lFSR33.getLastBit();
        boolean boolean37 = lFSR33.getClockBit();
        java.lang.String str38 = lFSR33.toString();
        boolean boolean40 = lFSR33.get(0);
        boolean boolean42 = lFSR33.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{}" + "'", str38, "{}");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(10, 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(100, 100, intArray23);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean11 = lFSR6.getClockBit();
        java.lang.String str12 = lFSR6.toString();
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.get((int) (byte) 100);
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.getLastBit();
        boolean boolean19 = lFSR6.get((int) (short) 10);
        boolean boolean20 = lFSR6.getClockBit();
        boolean boolean21 = lFSR6.clock();
        java.lang.String str22 = lFSR6.toString();
        boolean boolean23 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray13);
        boolean boolean19 = lFSR18.clock();
        java.lang.String str20 = lFSR18.toString();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.clock();
        java.lang.String str14 = lFSR9.toString();
        java.lang.String str15 = lFSR9.toString();
        java.lang.String str16 = lFSR9.toString();
        boolean boolean17 = lFSR9.getClockBit();
        boolean boolean18 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.get((int) (short) 1);
        boolean boolean15 = lFSR6.get((int) 'a');
        boolean boolean17 = lFSR6.get(1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.getLastBit();
        boolean boolean13 = lFSR6.getClockBit();
        java.util.BitSet bitSet14 = null;
        java.util.BitSet bitSet15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR6.initialize(bitSet14, bitSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) ' ', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) '4', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) -1, intArray19);
        java.lang.Class<?> wildcardClass28 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray9);
        boolean boolean14 = lFSR12.get(64);
        boolean boolean15 = lFSR12.getClockBit();
        java.lang.String str16 = lFSR12.toString();
        boolean boolean17 = lFSR12.getClockBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = lFSR12.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.clock();
        boolean boolean12 = lFSR6.getLastBit();
        boolean boolean13 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray15);
        boolean boolean23 = lFSR21.get((int) (byte) 1);
        boolean boolean24 = lFSR21.getLastBit();
        java.lang.String str25 = lFSR21.toString();
        java.util.BitSet bitSet26 = null;
        java.util.BitSet bitSet27 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR21.initialize(bitSet26, bitSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean13 = lFSR9.get((int) (short) 0);
        boolean boolean14 = lFSR9.clock();
        boolean boolean15 = lFSR9.clock();
        java.util.BitSet bitSet16 = null;
        java.util.BitSet bitSet17 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR9.initialize(bitSet16, bitSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean4 = lFSR3.getLastBit();
        boolean boolean6 = lFSR3.get((int) '4');
        boolean boolean7 = lFSR3.getLastBit();
        boolean boolean8 = lFSR3.getClockBit();
        boolean boolean10 = lFSR3.get((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.clock();
        boolean boolean15 = lFSR6.clock();
        boolean boolean16 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.get(22);
        java.lang.String str15 = lFSR6.toString();
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        java.lang.String str14 = lFSR12.toString();
        java.lang.String str15 = lFSR12.toString();
        boolean boolean16 = lFSR12.clock();
        boolean boolean17 = lFSR12.getLastBit();
        boolean boolean18 = lFSR12.clock();
        boolean boolean20 = lFSR12.get((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(100, 64, intArray17);
        boolean boolean25 = lFSR24.clock();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        int[] intArray11 = new int[] { (short) 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 10, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 100, intArray11);
        boolean boolean17 = lFSR16.getClockBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        boolean boolean10 = lFSR6.clock();
        boolean boolean11 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        boolean boolean11 = lFSR9.get(100);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) ' ', intArray13);
        boolean boolean19 = lFSR18.clock();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 10, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(100, 0, intArray23);
        java.lang.String str34 = lFSR33.toString();
        boolean boolean36 = lFSR33.get(0);
        boolean boolean37 = lFSR33.getClockBit();
        boolean boolean38 = lFSR33.getLastBit();
        boolean boolean39 = lFSR33.getLastBit();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) '#');
        boolean boolean16 = lFSR9.get((int) 'a');
        java.lang.String str17 = lFSR9.toString();
        boolean boolean18 = lFSR9.getClockBit();
        boolean boolean19 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        int[] intArray11 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) 'a', intArray11);
        java.util.BitSet bitSet16 = null;
        java.util.BitSet bitSet17 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR15.initialize(bitSet16, bitSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 0, 100]");
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) '#', intArray13);
        boolean boolean19 = lFSR18.clock();
        java.lang.String str20 = lFSR18.toString();
        boolean boolean21 = lFSR18.getLastBit();
        boolean boolean23 = lFSR18.get(100);
        boolean boolean24 = lFSR18.getLastBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        int[] intArray25 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) '#', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (short) 1, intArray25);
        boolean boolean37 = lFSR36.getLastBit();
        java.lang.String str38 = lFSR36.toString();
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{}" + "'", str38, "{}");
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) '#');
        boolean boolean16 = lFSR9.get((int) 'a');
        java.lang.String str17 = lFSR9.toString();
        boolean boolean18 = lFSR9.getLastBit();
        boolean boolean19 = lFSR9.getLastBit();
        boolean boolean20 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.get((int) (short) 10);
        boolean boolean15 = lFSR9.get((int) ' ');
        boolean boolean17 = lFSR9.get(100);
        boolean boolean18 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(100, 0, intArray23);
        java.lang.String str34 = lFSR33.toString();
        boolean boolean35 = lFSR33.getClockBit();
        boolean boolean37 = lFSR33.get((int) (byte) 10);
        boolean boolean39 = lFSR33.get(10);
        boolean boolean40 = lFSR33.clock();
        boolean boolean41 = lFSR33.getLastBit();
        boolean boolean42 = lFSR33.getLastBit();
        boolean boolean43 = lFSR33.getClockBit();
        java.util.BitSet bitSet44 = null;
        java.util.BitSet bitSet45 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR33.initialize(bitSet44, bitSet45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.get(22);
        java.lang.String str13 = lFSR6.toString();
        boolean boolean15 = lFSR6.get((int) (short) 100);
        java.lang.String str16 = lFSR6.toString();
        java.lang.String str17 = lFSR6.toString();
        java.lang.String str18 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (byte) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = lFSR27.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        java.lang.String str12 = lFSR9.toString();
        java.lang.String str13 = lFSR9.toString();
        boolean boolean14 = lFSR9.getLastBit();
        boolean boolean16 = lFSR9.get((int) (short) 0);
        boolean boolean17 = lFSR9.getLastBit();
        boolean boolean18 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 22, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        boolean boolean11 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.clock();
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.clock();
        boolean boolean18 = lFSR6.get((int) (short) 10);
        boolean boolean19 = lFSR6.getClockBit();
        boolean boolean20 = lFSR6.getClockBit();
        boolean boolean21 = lFSR6.clock();
        java.lang.String str22 = lFSR6.toString();
        boolean boolean23 = lFSR6.getClockBit();
        java.lang.String str24 = lFSR6.toString();
        boolean boolean26 = lFSR6.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{}" + "'", str24, "{}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean8 = lFSR6.get((int) '4');
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
        java.lang.Class<?> wildcardClass12 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.clock();
        java.lang.String str11 = lFSR6.toString();
        java.lang.String str12 = lFSR6.toString();
        java.lang.Class<?> wildcardClass13 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (short) 100, intArray11);
        boolean boolean16 = lFSR15.getLastBit();
        boolean boolean17 = lFSR15.getLastBit();
        boolean boolean18 = lFSR15.getClockBit();
        boolean boolean19 = lFSR15.getClockBit();
        boolean boolean20 = lFSR15.getClockBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 0, intArray23);
        boolean boolean35 = lFSR33.get((int) (short) 1);
        boolean boolean36 = lFSR33.getClockBit();
        boolean boolean38 = lFSR33.get((int) (byte) 100);
        boolean boolean40 = lFSR33.get((int) (byte) 100);
        java.lang.String str41 = lFSR33.toString();
        boolean boolean42 = lFSR33.getLastBit();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "{}" + "'", str41, "{}");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.clock();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean9 = lFSR6.getClockBit();
        boolean boolean10 = lFSR6.clock();
        boolean boolean11 = lFSR6.clock();
        boolean boolean12 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean8 = lFSR6.get((int) '4');
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.get(64);
        java.lang.Class<?> wildcardClass13 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        boolean boolean17 = lFSR15.getClockBit();
        boolean boolean18 = lFSR15.getLastBit();
        java.util.BitSet bitSet19 = null;
        java.util.BitSet bitSet20 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR15.initialize(bitSet19, bitSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) (short) 0);
        java.lang.String str13 = lFSR6.toString();
        boolean boolean14 = lFSR6.getLastBit();
        java.lang.String str15 = lFSR6.toString();
        java.lang.String str16 = lFSR6.toString();
        boolean boolean17 = lFSR6.getClockBit();
        java.lang.String str18 = lFSR6.toString();
        boolean boolean19 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.clock();
        boolean boolean15 = lFSR6.getClockBit();
        java.lang.String str16 = lFSR6.toString();
        boolean boolean18 = lFSR6.get(1);
        boolean boolean19 = lFSR6.getLastBit();
        java.lang.String str20 = lFSR6.toString();
        boolean boolean22 = lFSR6.get((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.clock();
        boolean boolean14 = lFSR9.get((int) '4');
        boolean boolean16 = lFSR9.get((int) (short) 1);
        boolean boolean17 = lFSR9.getClockBit();
        boolean boolean18 = lFSR9.getClockBit();
        boolean boolean19 = lFSR9.clock();
        boolean boolean20 = lFSR9.getLastBit();
        boolean boolean22 = lFSR9.get((int) (short) 1);
        boolean boolean24 = lFSR9.get(1);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        boolean boolean12 = lFSR9.getLastBit();
        java.lang.String str13 = lFSR9.toString();
        boolean boolean14 = lFSR9.getClockBit();
        boolean boolean15 = lFSR9.getClockBit();
        boolean boolean17 = lFSR9.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(10, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 1, intArray17);
        boolean boolean25 = lFSR24.getLastBit();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        int[] intArray27 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) -1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR37 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 100, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) '#', intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR(22, 0, intArray27);
        java.util.BitSet bitSet40 = null;
        java.util.BitSet bitSet41 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR39.initialize(bitSet40, bitSet41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 64, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) '#', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) 'a', intArray23);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) -1, 10, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        boolean boolean12 = lFSR9.clock();
        boolean boolean13 = lFSR9.clock();
        boolean boolean14 = lFSR9.getLastBit();
        boolean boolean16 = lFSR9.get((int) (short) 1);
        boolean boolean17 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.clock();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        boolean boolean10 = lFSR6.getLastBit();
        java.lang.Class<?> wildcardClass11 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean4 = lFSR3.getLastBit();
        boolean boolean6 = lFSR3.get((int) '4');
        boolean boolean7 = lFSR3.getLastBit();
        boolean boolean9 = lFSR3.get(100);
        boolean boolean11 = lFSR3.get((int) (byte) 0);
        boolean boolean12 = lFSR3.getLastBit();
        java.util.BitSet bitSet13 = null;
        java.util.BitSet bitSet14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR3.initialize(bitSet13, bitSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        int[] intArray11 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 64, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray11);
        boolean boolean17 = lFSR15.get(64);
        java.util.BitSet bitSet18 = null;
        java.util.BitSet bitSet19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR15.initialize(bitSet18, bitSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        int[] intArray25 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) -1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 100, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) '#', intArray25);
        java.util.BitSet bitSet37 = null;
        java.util.BitSet bitSet38 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR36.initialize(bitSet37, bitSet38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR(1, 0, intArray2);
        java.lang.String str4 = lFSR3.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = lFSR3.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) -1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = lFSR18.getClockBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        int[] intArray9 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray9);
        boolean boolean13 = lFSR12.getLastBit();
        boolean boolean15 = lFSR12.get(10);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (byte) 10, intArray13);
        boolean boolean20 = lFSR18.get((int) ' ');
        boolean boolean22 = lFSR18.get(1);
        boolean boolean23 = lFSR18.getLastBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(10, 10, intArray15);
        boolean boolean22 = lFSR21.getClockBit();
        boolean boolean23 = lFSR21.getLastBit();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.get(22);
        boolean boolean15 = lFSR6.getClockBit();
        boolean boolean17 = lFSR6.get(0);
        boolean boolean18 = lFSR6.clock();
        boolean boolean19 = lFSR6.getLastBit();
        boolean boolean20 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(64, 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 0, intArray17);
        java.util.BitSet bitSet25 = null;
        java.util.BitSet bitSet26 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR24.initialize(bitSet25, bitSet26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        boolean boolean11 = lFSR9.get((int) (short) 1);
        boolean boolean12 = lFSR9.clock();
        boolean boolean13 = lFSR9.getLastBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (byte) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) '4', intArray21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = lFSR30.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(22, 22, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, 22, intArray13);
        java.lang.Class<?> wildcardClass19 = lFSR18.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean8 = lFSR6.get(1);
        java.lang.String str9 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) '4', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 1, intArray21);
        java.lang.Class<?> wildcardClass31 = lFSR30.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.get((int) (short) 100);
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.get((int) 'a');
        java.lang.Class<?> wildcardClass14 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        java.lang.String str10 = lFSR9.toString();
        boolean boolean11 = lFSR9.clock();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) (short) 0);
        boolean boolean15 = lFSR9.getClockBit();
        boolean boolean16 = lFSR9.clock();
        java.util.BitSet bitSet17 = null;
        java.util.BitSet bitSet18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR9.initialize(bitSet17, bitSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '4', intArray17);
        boolean boolean25 = lFSR24.getClockBit();
        boolean boolean27 = lFSR24.get((int) (short) 100);
        boolean boolean28 = lFSR24.clock();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        int[] intArray27 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) -1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR37 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 100, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 10, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) 'a', intArray27);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) 'a');
        java.lang.String str10 = lFSR6.toString();
        boolean boolean11 = lFSR6.clock();
        boolean boolean12 = lFSR6.clock();
        java.util.BitSet bitSet13 = null;
        java.util.BitSet bitSet14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR6.initialize(bitSet13, bitSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 64, intArray17);
        boolean boolean25 = lFSR24.clock();
        boolean boolean26 = lFSR24.clock();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray13);
        boolean boolean19 = lFSR18.getClockBit();
        boolean boolean20 = lFSR18.getLastBit();
        boolean boolean21 = lFSR18.getLastBit();
        java.util.BitSet bitSet22 = null;
        java.util.BitSet bitSet23 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR18.initialize(bitSet22, bitSet23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        boolean boolean12 = lFSR9.getLastBit();
        java.util.BitSet bitSet13 = null;
        java.util.BitSet bitSet14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR9.initialize(bitSet13, bitSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(100, 0, intArray23);
        java.lang.String str34 = lFSR33.toString();
        boolean boolean35 = lFSR33.clock();
        java.lang.String str36 = lFSR33.toString();
        boolean boolean37 = lFSR33.getLastBit();
        boolean boolean38 = lFSR33.getLastBit();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "{}" + "'", str36, "{}");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        java.lang.String str13 = lFSR6.toString();
        java.lang.String str14 = lFSR6.toString();
        boolean boolean16 = lFSR6.get((int) (short) 0);
        boolean boolean17 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        java.lang.String str4 = lFSR3.toString();
        boolean boolean5 = lFSR3.getClockBit();
        boolean boolean6 = lFSR3.getClockBit();
        boolean boolean7 = lFSR3.getClockBit();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        boolean boolean14 = lFSR12.getClockBit();
        java.lang.String str15 = lFSR12.toString();
        boolean boolean17 = lFSR12.get((int) 'a');
        boolean boolean18 = lFSR12.getClockBit();
        java.util.BitSet bitSet19 = null;
        java.util.BitSet bitSet20 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR12.initialize(bitSet19, bitSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray7);
        boolean boolean11 = lFSR9.get((int) (byte) 1);
        boolean boolean12 = lFSR9.clock();
        boolean boolean13 = lFSR9.clock();
        boolean boolean15 = lFSR9.get(100);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) 0, intArray13);
        boolean boolean20 = lFSR18.get(64);
        java.lang.String str21 = lFSR18.toString();
        boolean boolean22 = lFSR18.clock();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(100, 0, intArray23);
        java.lang.String str34 = lFSR33.toString();
        boolean boolean35 = lFSR33.getClockBit();
        boolean boolean37 = lFSR33.get((int) (byte) 10);
        boolean boolean39 = lFSR33.get(10);
        boolean boolean40 = lFSR33.clock();
        boolean boolean41 = lFSR33.getLastBit();
        boolean boolean43 = lFSR33.get(0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 22, intArray17);
        boolean boolean25 = lFSR24.getClockBit();
        boolean boolean26 = lFSR24.clock();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray11);
        boolean boolean16 = lFSR15.clock();
        boolean boolean17 = lFSR15.clock();
        boolean boolean18 = lFSR15.getClockBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray9);
        boolean boolean14 = lFSR12.get(64);
        boolean boolean15 = lFSR12.getClockBit();
        java.lang.String str16 = lFSR12.toString();
        boolean boolean17 = lFSR12.getLastBit();
        boolean boolean18 = lFSR12.getClockBit();
        boolean boolean19 = lFSR12.getLastBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        boolean boolean14 = lFSR12.clock();
        boolean boolean15 = lFSR12.getClockBit();
        java.lang.String str16 = lFSR12.toString();
        java.lang.String str17 = lFSR12.toString();
        boolean boolean18 = lFSR12.getClockBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (byte) 100, intArray15);
        boolean boolean22 = lFSR21.clock();
        boolean boolean23 = lFSR21.clock();
        boolean boolean24 = lFSR21.getLastBit();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) 0, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean14 = lFSR12.getLastBit();
        java.lang.String str15 = lFSR12.toString();
        java.lang.String str16 = lFSR12.toString();
        boolean boolean17 = lFSR12.getLastBit();
        boolean boolean18 = lFSR12.clock();
        boolean boolean19 = lFSR12.getClockBit();
        boolean boolean20 = lFSR12.clock();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(0);
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.getClockBit();
        java.lang.String str16 = lFSR6.toString();
        boolean boolean17 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        java.lang.String str4 = lFSR3.toString();
        boolean boolean6 = lFSR3.get((int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.clock();
        boolean boolean11 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) 0, intArray7);
        java.lang.String str10 = lFSR9.toString();
        boolean boolean12 = lFSR9.get((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) 'a', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) '#', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 0, intArray21);
        java.lang.Class<?> wildcardClass31 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        int[] intArray27 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 64, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) '#', intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR(0, 1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR37 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR(10, (-1), intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 10, intArray27);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 22, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 10, intArray15);
        java.lang.String str22 = lFSR21.toString();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray11);
        boolean boolean17 = lFSR15.get((int) (byte) 10);
        boolean boolean19 = lFSR15.get((int) ' ');
        boolean boolean20 = lFSR15.getLastBit();
        boolean boolean21 = lFSR15.getClockBit();
        boolean boolean22 = lFSR15.getClockBit();
        java.lang.String str23 = lFSR15.toString();
        boolean boolean25 = lFSR15.get(0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.get(0);
        java.lang.String str14 = lFSR6.toString();
        boolean boolean16 = lFSR6.get((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean11 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.getLastBit();
        boolean boolean13 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.getLastBit();
        java.lang.String str12 = lFSR6.toString();
        boolean boolean13 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        java.lang.String str17 = lFSR15.toString();
        boolean boolean19 = lFSR15.get((int) ' ');
        java.lang.String str20 = lFSR15.toString();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.clock();
        boolean boolean11 = lFSR9.clock();
        boolean boolean12 = lFSR9.getClockBit();
        boolean boolean13 = lFSR9.getClockBit();
        boolean boolean14 = lFSR9.clock();
        boolean boolean16 = lFSR9.get((int) '4');
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.get((int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) (short) 0);
        java.lang.String str13 = lFSR6.toString();
        boolean boolean14 = lFSR6.getLastBit();
        java.lang.String str15 = lFSR6.toString();
        java.lang.String str16 = lFSR6.toString();
        boolean boolean17 = lFSR6.getClockBit();
        java.lang.String str18 = lFSR6.toString();
        boolean boolean20 = lFSR6.get((int) (byte) 10);
        boolean boolean21 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (byte) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray17);
        boolean boolean25 = lFSR24.getClockBit();
        boolean boolean26 = lFSR24.getLastBit();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        int[] intArray15 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) ' ', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) '4', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray15);
        java.util.BitSet bitSet22 = null;
        java.util.BitSet bitSet23 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR21.initialize(bitSet22, bitSet23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[52, 0, 100]");
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) '#');
        boolean boolean15 = lFSR9.getLastBit();
        java.lang.String str16 = lFSR9.toString();
        boolean boolean17 = lFSR9.getLastBit();
        boolean boolean18 = lFSR9.getLastBit();
        java.lang.String str19 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 64, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        int[] intArray9 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 1, intArray9);
        boolean boolean14 = lFSR12.get((int) '#');
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 52, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        java.lang.String str10 = lFSR9.toString();
        boolean boolean11 = lFSR9.clock();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean13 = lFSR9.getLastBit();
        boolean boolean14 = lFSR9.getLastBit();
        java.lang.String str15 = lFSR9.toString();
        boolean boolean17 = lFSR9.get(10);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean4 = lFSR3.getLastBit();
        boolean boolean6 = lFSR3.get((int) '4');
        boolean boolean7 = lFSR3.getLastBit();
        boolean boolean9 = lFSR3.get(100);
        boolean boolean10 = lFSR3.getLastBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = lFSR3.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray17);
        boolean boolean25 = lFSR24.clock();
        boolean boolean26 = lFSR24.clock();
        boolean boolean27 = lFSR24.clock();
        boolean boolean28 = lFSR24.getLastBit();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (short) 100, intArray15);
        boolean boolean22 = lFSR21.getClockBit();
        boolean boolean24 = lFSR21.get(100);
        java.lang.Class<?> wildcardClass25 = lFSR21.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(100, 0, intArray23);
        java.lang.String str34 = lFSR33.toString();
        boolean boolean35 = lFSR33.getClockBit();
        boolean boolean37 = lFSR33.get((int) (byte) 10);
        boolean boolean39 = lFSR33.get(10);
        boolean boolean40 = lFSR33.getClockBit();
        boolean boolean41 = lFSR33.getLastBit();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        int[] intArray15 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 100, intArray15);
        boolean boolean22 = lFSR21.getClockBit();
        boolean boolean24 = lFSR21.get(22);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.clock();
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.clock();
        java.util.BitSet bitSet17 = null;
        java.util.BitSet bitSet18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR6.initialize(bitSet17, bitSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray13);
        boolean boolean20 = lFSR18.get((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = lFSR18.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean4 = lFSR3.getClockBit();
        boolean boolean6 = lFSR3.get((int) (byte) 100);
        boolean boolean7 = lFSR3.getLastBit();
        boolean boolean8 = lFSR3.getClockBit();
        boolean boolean9 = lFSR3.getLastBit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        int[] intArray25 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 64, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) '#', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR(0, 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR(10, 0, intArray25);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) ' ', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(100, 0, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(10, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 1, intArray17);
        boolean boolean25 = lFSR24.getClockBit();
        boolean boolean26 = lFSR24.clock();
        boolean boolean27 = lFSR24.getLastBit();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean11 = lFSR6.get((int) ' ');
        boolean boolean12 = lFSR6.getClockBit();
        java.util.BitSet bitSet13 = null;
        java.util.BitSet bitSet14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR6.initialize(bitSet13, bitSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        java.lang.String str14 = lFSR12.toString();
        java.util.BitSet bitSet15 = null;
        java.util.BitSet bitSet16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR12.initialize(bitSet15, bitSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (byte) -1, intArray17);
        java.lang.String str25 = lFSR24.toString();
        boolean boolean27 = lFSR24.get((int) (short) 1);
        java.lang.String str28 = lFSR24.toString();
        boolean boolean29 = lFSR24.clock();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{}" + "'", str28, "{}");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        int[] intArray27 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) '#', intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR37 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (short) -1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) ' ', intArray27);
        java.lang.Class<?> wildcardClass40 = lFSR39.getClass();
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.clock();
        boolean boolean9 = lFSR6.getClockBit();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.get((int) (byte) 1);
        boolean boolean13 = lFSR6.getClockBit();
        boolean boolean15 = lFSR6.get((int) (short) 10);
        boolean boolean17 = lFSR6.get((int) '#');
        java.lang.Class<?> wildcardClass18 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        int[] intArray25 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) -1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 100, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 10, intArray25);
        boolean boolean38 = lFSR36.get((int) (byte) 100);
        boolean boolean40 = lFSR36.get((int) ' ');
        boolean boolean41 = lFSR36.clock();
        java.lang.String str42 = lFSR36.toString();
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "{}" + "'", str42, "{}");
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        int[] intArray7 = new int[] { (short) 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) ' ', intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (byte) 100, intArray7);
        boolean boolean11 = lFSR10.getClockBit();
        boolean boolean12 = lFSR10.clock();
        boolean boolean13 = lFSR10.getLastBit();
        java.util.BitSet bitSet14 = null;
        java.util.BitSet bitSet15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR10.initialize(bitSet14, bitSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        int[] intArray27 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 64, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) '#', intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) -1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR37 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (byte) 1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 0, intArray27);
        boolean boolean41 = lFSR39.get(64);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.get((int) '4');
        boolean boolean14 = lFSR6.clock();
        boolean boolean15 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        int[] intArray31 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR37 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR40 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR41 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 0, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR42 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) '4', intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR43 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 10, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR44 = new com.thealgorithms.ciphers.a5.LFSR(0, 10, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR45 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray31);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = lFSR45.getClockBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 1, 1]");
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(0);
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.getClockBit();
        boolean boolean16 = lFSR6.getClockBit();
        java.lang.String str17 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray15);
        boolean boolean22 = lFSR21.clock();
        java.lang.String str23 = lFSR21.toString();
        boolean boolean24 = lFSR21.clock();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        int[] intArray7 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 64, intArray7);
        java.util.BitSet bitSet10 = null;
        java.util.BitSet bitSet11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR9.initialize(bitSet10, bitSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, 52, 1]");
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 100, intArray23);
        boolean boolean34 = lFSR33.clock();
        java.util.BitSet bitSet35 = null;
        java.util.BitSet bitSet36 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR33.initialize(bitSet35, bitSet36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray13);
        boolean boolean20 = lFSR18.get((int) 'a');
        boolean boolean21 = lFSR18.getClockBit();
        boolean boolean22 = lFSR18.getClockBit();
        boolean boolean23 = lFSR18.getClockBit();
        boolean boolean24 = lFSR18.getClockBit();
        java.lang.String str25 = lFSR18.toString();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.clock();
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.clock();
        boolean boolean18 = lFSR6.get((int) (short) 10);
        boolean boolean19 = lFSR6.getClockBit();
        boolean boolean20 = lFSR6.getLastBit();
        boolean boolean21 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean4 = lFSR3.getLastBit();
        boolean boolean6 = lFSR3.get((int) '4');
        boolean boolean7 = lFSR3.getLastBit();
        boolean boolean9 = lFSR3.get((int) (byte) 100);
        boolean boolean10 = lFSR3.getClockBit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) 'a', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 0, intArray11);
        boolean boolean17 = lFSR15.get((int) (short) 0);
        java.lang.String str18 = lFSR15.toString();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 22, intArray17);
        boolean boolean26 = lFSR24.get(1);
        java.util.BitSet bitSet27 = null;
        java.util.BitSet bitSet28 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR24.initialize(bitSet27, bitSet28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        int[] intArray25 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (byte) 100, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (byte) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 10, intArray25);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean4 = lFSR3.getClockBit();
        boolean boolean5 = lFSR3.getClockBit();
        boolean boolean6 = lFSR3.getClockBit();
        java.lang.Class<?> wildcardClass7 = lFSR3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 0, intArray23);
        boolean boolean34 = lFSR33.getLastBit();
        java.lang.String str35 = lFSR33.toString();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "{}" + "'", str35, "{}");
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        int[] intArray25 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (byte) 0, intArray25);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.get((int) 'a');
        boolean boolean11 = lFSR6.get((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (byte) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, 64, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) ' ', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) -1, intArray11);
        java.lang.String str16 = lFSR15.toString();
        boolean boolean17 = lFSR15.getLastBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) '#', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (byte) 1, intArray23);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) (short) 0);
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.getLastBit();
        java.lang.String str15 = lFSR6.toString();
        boolean boolean17 = lFSR6.get((int) (short) 1);
        boolean boolean18 = lFSR6.getLastBit();
        boolean boolean20 = lFSR6.get((int) (byte) 0);
        java.lang.String str21 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.get(22);
        boolean boolean19 = lFSR6.get((int) (short) 10);
        boolean boolean20 = lFSR6.clock();
        java.lang.String str21 = lFSR6.toString();
        boolean boolean22 = lFSR6.getClockBit();
        java.lang.Class<?> wildcardClass23 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(0, 64, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (-1), intArray13);
        boolean boolean20 = lFSR18.get((int) 'a');
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean11 = lFSR6.getClockBit();
        java.lang.String str12 = lFSR6.toString();
        java.lang.String str13 = lFSR6.toString();
        boolean boolean15 = lFSR6.get(1);
        java.lang.String str16 = lFSR6.toString();
        boolean boolean17 = lFSR6.getClockBit();
        boolean boolean18 = lFSR6.getClockBit();
        boolean boolean19 = lFSR6.getClockBit();
        java.util.BitSet bitSet20 = null;
        java.util.BitSet bitSet21 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR6.initialize(bitSet20, bitSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 64, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) '#', intArray15);
        boolean boolean23 = lFSR21.get(64);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(0);
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getClockBit();
        boolean boolean15 = lFSR6.getClockBit();
        java.lang.String str16 = lFSR6.toString();
        boolean boolean17 = lFSR6.clock();
        java.lang.String str18 = lFSR6.toString();
        java.lang.String str19 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.clock();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean9 = lFSR6.getClockBit();
        boolean boolean10 = lFSR6.clock();
        boolean boolean11 = lFSR6.clock();
        boolean boolean12 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.clock();
        boolean boolean11 = lFSR9.getClockBit();
        boolean boolean13 = lFSR9.get((int) '#');
        boolean boolean14 = lFSR9.getClockBit();
        boolean boolean16 = lFSR9.get((int) ' ');
        java.lang.String str17 = lFSR9.toString();
        boolean boolean18 = lFSR9.clock();
        java.lang.String str19 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) '#');
        java.lang.String str15 = lFSR9.toString();
        boolean boolean16 = lFSR9.clock();
        boolean boolean17 = lFSR9.getLastBit();
        boolean boolean19 = lFSR9.get((int) (short) 10);
        boolean boolean20 = lFSR9.clock();
        boolean boolean21 = lFSR9.clock();
        boolean boolean23 = lFSR9.get((int) (short) 10);
        java.lang.String str24 = lFSR9.toString();
        boolean boolean25 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{}" + "'", str24, "{}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        boolean boolean12 = lFSR9.clock();
        boolean boolean13 = lFSR9.clock();
        java.lang.String str14 = lFSR9.toString();
        boolean boolean15 = lFSR9.getLastBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) ' ', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) '4', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) 'a', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) 10, intArray21);
        boolean boolean32 = lFSR30.get((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }
}

