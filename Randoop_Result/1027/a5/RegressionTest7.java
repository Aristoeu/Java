package a5;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
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
        boolean boolean21 = lFSR9.getClockBit();
        java.lang.String str22 = lFSR9.toString();
        java.lang.String str23 = lFSR9.toString();
        boolean boolean24 = lFSR9.getClockBit();
        boolean boolean25 = lFSR9.getLastBit();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR(64, 100, intArray2);
        boolean boolean5 = lFSR3.get((int) (short) 1);
        boolean boolean6 = lFSR3.getClockBit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) -1, intArray27);
        java.lang.String str40 = lFSR39.toString();
        java.lang.String str41 = lFSR39.toString();
        boolean boolean43 = lFSR39.get((int) 'a');
        boolean boolean45 = lFSR39.get((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "{}" + "'", str40, "{}");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "{}" + "'", str41, "{}");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
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
        boolean boolean21 = lFSR6.clock();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.clock();
        boolean boolean13 = lFSR6.getClockBit();
        boolean boolean15 = lFSR6.get((int) (byte) 1);
        java.lang.String str16 = lFSR6.toString();
        boolean boolean17 = lFSR6.getLastBit();
        boolean boolean18 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 100, intArray19);
        boolean boolean28 = lFSR27.getLastBit();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (short) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) -1, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        java.lang.Class<?> wildcardClass20 = lFSR9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.clock();
        boolean boolean11 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.getLastBit();
        java.lang.String str13 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.clock();
        boolean boolean15 = lFSR12.get(0);
        boolean boolean16 = lFSR12.clock();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean5 = lFSR3.get((int) (byte) 100);
        boolean boolean6 = lFSR3.getClockBit();
        java.util.BitSet bitSet7 = null;
        java.util.BitSet bitSet8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR3.initialize(bitSet7, bitSet8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) 1, intArray13);
        boolean boolean19 = lFSR18.getLastBit();
        java.lang.String str20 = lFSR18.toString();
        java.lang.String str21 = lFSR18.toString();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.clock();
        boolean boolean14 = lFSR9.get((int) '4');
        boolean boolean16 = lFSR9.get((int) (short) 1);
        boolean boolean17 = lFSR9.getLastBit();
        boolean boolean18 = lFSR9.getClockBit();
        boolean boolean20 = lFSR9.get(22);
        boolean boolean21 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray13);
        boolean boolean20 = lFSR18.get((int) (byte) 10);
        boolean boolean22 = lFSR18.get((int) 'a');
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) '4', intArray25);
        java.lang.String str37 = lFSR36.toString();
        java.lang.String str38 = lFSR36.toString();
        boolean boolean39 = lFSR36.getClockBit();
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "{}" + "'", str37, "{}");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{}" + "'", str38, "{}");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (short) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(64, 64, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
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
        boolean boolean31 = lFSR24.get((int) (byte) 100);
        java.lang.String str32 = lFSR24.toString();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "{}" + "'", str32, "{}");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
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
        boolean boolean19 = lFSR6.getClockBit();
        java.lang.String str20 = lFSR6.toString();
        boolean boolean21 = lFSR6.clock();
        boolean boolean23 = lFSR6.get((int) '#');
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        int[] intArray7 = new int[] { (short) 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) -1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 10, intArray7);
        boolean boolean12 = lFSR10.get(100);
        boolean boolean13 = lFSR10.getLastBit();
        java.lang.String str14 = lFSR10.toString();
        java.util.BitSet bitSet15 = null;
        java.util.BitSet bitSet16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR10.initialize(bitSet15, bitSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 0, intArray11);
        java.lang.String str16 = lFSR15.toString();
        boolean boolean18 = lFSR15.get((int) '4');
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) -1, intArray9);
        boolean boolean13 = lFSR12.clock();
        boolean boolean15 = lFSR12.get((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) -1, intArray21);
        boolean boolean31 = lFSR30.clock();
        boolean boolean32 = lFSR30.getLastBit();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 64, intArray15);
        boolean boolean23 = lFSR21.get(10);
        boolean boolean25 = lFSR21.get((int) (short) 0);
        java.lang.String str26 = lFSR21.toString();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(0, 100, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = lFSR15.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.get(22);
        java.lang.String str13 = lFSR6.toString();
        boolean boolean15 = lFSR6.get((int) (short) 100);
        boolean boolean16 = lFSR6.getClockBit();
        java.lang.String str17 = lFSR6.toString();
        boolean boolean18 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 22, intArray15);
        boolean boolean23 = lFSR21.get(64);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean8 = lFSR6.get((int) '4');
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.get((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = lFSR6.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) ' ', intArray9);
        boolean boolean13 = lFSR12.clock();
        boolean boolean14 = lFSR12.getClockBit();
        boolean boolean15 = lFSR12.clock();
        boolean boolean16 = lFSR12.getLastBit();
        java.lang.String str17 = lFSR12.toString();
        java.lang.String str18 = lFSR12.toString();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        int[] intArray13 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray13);
        boolean boolean19 = lFSR18.clock();
        boolean boolean20 = lFSR18.getClockBit();
        boolean boolean21 = lFSR18.getLastBit();
        boolean boolean22 = lFSR18.clock();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(0);
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.getClockBit();
        boolean boolean17 = lFSR6.get((int) (short) 1);
        boolean boolean19 = lFSR6.get((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean13 = lFSR6.get((int) '#');
        boolean boolean15 = lFSR6.get((int) '4');
        boolean boolean16 = lFSR6.clock();
        boolean boolean18 = lFSR6.get(10);
        java.lang.String str19 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) -1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        java.lang.String str14 = lFSR12.toString();
        boolean boolean15 = lFSR12.getLastBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) (short) 0);
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.clock();
        boolean boolean19 = lFSR6.get((int) (short) 1);
        java.lang.String str20 = lFSR6.toString();
        boolean boolean21 = lFSR6.getLastBit();
        boolean boolean22 = lFSR6.clock();
        java.util.BitSet bitSet23 = null;
        java.util.BitSet bitSet24 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR6.initialize(bitSet23, bitSet24);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        int[] intArray11 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) 10, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 1, intArray11);
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
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 0, intArray13);
        boolean boolean19 = lFSR18.clock();
        boolean boolean21 = lFSR18.get(0);
        boolean boolean22 = lFSR18.getLastBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getLastBit();
        java.lang.String str15 = lFSR6.toString();
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean18 = lFSR6.get((int) 'a');
        boolean boolean20 = lFSR6.get(22);
        boolean boolean21 = lFSR6.getLastBit();
        boolean boolean22 = lFSR6.clock();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) '#');
        boolean boolean16 = lFSR9.get((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = lFSR12.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        boolean boolean17 = lFSR15.clock();
        boolean boolean18 = lFSR15.getLastBit();
        boolean boolean19 = lFSR15.getLastBit();
        java.lang.String str20 = lFSR15.toString();
        boolean boolean21 = lFSR15.getClockBit();
        boolean boolean22 = lFSR15.getClockBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.clock();
        boolean boolean13 = lFSR9.clock();
        boolean boolean15 = lFSR9.get(64);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean12 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.getClockBit();
        boolean boolean14 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.getLastBit();
        java.lang.String str12 = lFSR6.toString();
        boolean boolean13 = lFSR6.getClockBit();
        boolean boolean14 = lFSR6.clock();
        boolean boolean15 = lFSR6.clock();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) '4', intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 10, intArray27);
        boolean boolean40 = lFSR39.getClockBit();
        java.lang.String str41 = lFSR39.toString();
        boolean boolean42 = lFSR39.clock();
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "{}" + "'", str41, "{}");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
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
        boolean boolean16 = lFSR6.clock();
        boolean boolean17 = lFSR6.getClockBit();
        boolean boolean19 = lFSR6.get((int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        boolean boolean35 = lFSR33.getClockBit();
        java.lang.Class<?> wildcardClass36 = lFSR33.getClass();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 0, intArray11);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean5 = lFSR3.get(0);
        boolean boolean6 = lFSR3.getLastBit();
        boolean boolean7 = lFSR3.getClockBit();
        boolean boolean8 = lFSR3.getClockBit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
        java.lang.String str25 = lFSR21.toString();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.clock();
        java.lang.String str11 = lFSR6.toString();
        java.lang.String str12 = lFSR6.toString();
        boolean boolean13 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray11);
        boolean boolean16 = lFSR15.getLastBit();
        boolean boolean17 = lFSR15.getLastBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getLastBit();
        java.lang.String str15 = lFSR6.toString();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray17);
        boolean boolean25 = lFSR24.getClockBit();
        boolean boolean26 = lFSR24.clock();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = lFSR24.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{}" + "'", str27, "{}");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (byte) -1, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
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
        java.lang.Class<?> wildcardClass18 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) 0, intArray13);
        boolean boolean19 = lFSR18.clock();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.get(22);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) '4', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) 'a', intArray23);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (short) 100, intArray21);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) -1, 1, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (short) 1, intArray13);
        boolean boolean19 = lFSR18.getLastBit();
        boolean boolean21 = lFSR18.get((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        boolean boolean14 = lFSR12.clock();
        boolean boolean15 = lFSR12.getClockBit();
        java.lang.String str16 = lFSR12.toString();
        java.lang.String str17 = lFSR12.toString();
        java.lang.Class<?> wildcardClass18 = lFSR12.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean11 = lFSR6.getClockBit();
        java.lang.String str12 = lFSR6.toString();
        boolean boolean13 = lFSR6.getLastBit();
        java.lang.String str14 = lFSR6.toString();
        boolean boolean15 = lFSR6.getClockBit();
        java.lang.String str16 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (byte) 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (byte) 0, intArray21);
        java.lang.Class<?> wildcardClass31 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.clock();
        java.lang.String str8 = lFSR6.toString();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean11 = lFSR6.get((int) (short) 1);
        java.lang.String str12 = lFSR6.toString();
        java.lang.String str13 = lFSR6.toString();
        boolean boolean14 = lFSR6.getClockBit();
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.get((int) (byte) 10);
        boolean boolean18 = lFSR6.clock();
        boolean boolean20 = lFSR6.get((int) (short) 10);
        java.util.BitSet bitSet21 = null;
        java.util.BitSet bitSet22 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR6.initialize(bitSet21, bitSet22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        java.lang.String str13 = lFSR6.toString();
        boolean boolean14 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
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
        boolean boolean17 = lFSR6.get((int) '4');
        boolean boolean18 = lFSR6.clock();
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
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 64, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) '#', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) -1, intArray21);
        java.lang.String str31 = lFSR30.toString();
        boolean boolean32 = lFSR30.getLastBit();
        java.lang.Class<?> wildcardClass33 = lFSR30.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "{}" + "'", str31, "{}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
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
        java.lang.String str16 = lFSR6.toString();
        java.lang.String str17 = lFSR6.toString();
        boolean boolean18 = lFSR6.clock();
        java.lang.String str19 = lFSR6.toString();
        boolean boolean20 = lFSR6.getLastBit();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray19);
        java.lang.String str28 = lFSR27.toString();
        boolean boolean29 = lFSR27.getClockBit();
        java.util.BitSet bitSet30 = null;
        java.util.BitSet bitSet31 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR27.initialize(bitSet30, bitSet31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{}" + "'", str28, "{}");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
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
        boolean boolean18 = lFSR6.getLastBit();
        boolean boolean19 = lFSR6.clock();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray9);
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
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(100, 1, intArray11);
        boolean boolean16 = lFSR15.clock();
        java.lang.String str17 = lFSR15.toString();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) 'a', intArray17);
        java.lang.String str25 = lFSR24.toString();
        boolean boolean27 = lFSR24.get((int) (byte) 100);
        boolean boolean28 = lFSR24.getLastBit();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray17);
        java.lang.String str25 = lFSR24.toString();
        boolean boolean26 = lFSR24.getClockBit();
        boolean boolean27 = lFSR24.getLastBit();
        boolean boolean28 = lFSR24.getClockBit();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray17);
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
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        int[] intArray9 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (short) -1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (short) 0, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[22, 10, 100]");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 0, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
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
        java.lang.String str38 = lFSR33.toString();
        java.util.BitSet bitSet39 = null;
        java.util.BitSet bitSet40 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR33.initialize(bitSet39, bitSet40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{}" + "'", str38, "{}");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 10, intArray13);
        boolean boolean19 = lFSR18.clock();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(100, 64, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray21);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        int[] intArray7 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 1, intArray7);
        boolean boolean11 = lFSR9.get(0);
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean14 = lFSR9.get((int) 'a');
        java.lang.String str15 = lFSR9.toString();
        java.lang.String str16 = lFSR9.toString();
        boolean boolean17 = lFSR9.getClockBit();
        java.lang.Class<?> wildcardClass18 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[22, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
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
        java.lang.String str19 = lFSR6.toString();
        boolean boolean20 = lFSR6.clock();
        boolean boolean21 = lFSR6.getLastBit();
        boolean boolean22 = lFSR6.clock();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        java.lang.String str13 = lFSR6.toString();
        java.lang.String str14 = lFSR6.toString();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) '4', intArray15);
        java.lang.String str22 = lFSR21.toString();
        java.util.BitSet bitSet23 = null;
        java.util.BitSet bitSet24 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR21.initialize(bitSet23, bitSet24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray2);
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
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) -1, intArray27);
        java.lang.String str40 = lFSR39.toString();
        boolean boolean41 = lFSR39.clock();
        java.util.BitSet bitSet42 = null;
        java.util.BitSet bitSet43 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR39.initialize(bitSet42, bitSet43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "{}" + "'", str40, "{}");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.clock();
        boolean boolean14 = lFSR9.get((int) '4');
        boolean boolean16 = lFSR9.get((int) (short) 1);
        boolean boolean17 = lFSR9.getClockBit();
        java.lang.String str18 = lFSR9.toString();
        boolean boolean19 = lFSR9.clock();
        java.lang.Class<?> wildcardClass20 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
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
        boolean boolean20 = lFSR9.getLastBit();
        boolean boolean21 = lFSR9.getLastBit();
        boolean boolean22 = lFSR9.getLastBit();
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
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(0);
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getClockBit();
        boolean boolean15 = lFSR6.clock();
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
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        int[] intArray7 = new int[] { 10, 22, 10 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray7);
        boolean boolean11 = lFSR9.get((int) 'a');
        java.lang.String str12 = lFSR9.toString();
        boolean boolean13 = lFSR9.clock();
        boolean boolean14 = lFSR9.getLastBit();
        boolean boolean15 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 22, 10]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        int[] intArray7 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 1, intArray7);
        boolean boolean11 = lFSR9.get(0);
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.clock();
        boolean boolean14 = lFSR9.getLastBit();
        java.lang.Class<?> wildcardClass15 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[22, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
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
        boolean boolean36 = lFSR33.get((int) (short) 100);
        java.lang.String str37 = lFSR33.toString();
        boolean boolean39 = lFSR33.get(0);
        boolean boolean41 = lFSR33.get((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "{}" + "'", str37, "{}");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getLastBit();
        java.lang.String str15 = lFSR6.toString();
        boolean boolean17 = lFSR6.get(64);
        java.lang.String str18 = lFSR6.toString();
        boolean boolean19 = lFSR6.getLastBit();
        java.lang.Class<?> wildcardClass20 = lFSR6.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) ' ', intArray9);
        boolean boolean13 = lFSR12.getLastBit();
        boolean boolean15 = lFSR12.get((int) 'a');
        boolean boolean17 = lFSR12.get((int) 'a');
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.clock();
        java.lang.String str8 = lFSR6.toString();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean11 = lFSR6.get((int) (short) 1);
        java.lang.String str12 = lFSR6.toString();
        java.lang.String str13 = lFSR6.toString();
        boolean boolean14 = lFSR6.getClockBit();
        boolean boolean15 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) '#', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        boolean boolean35 = lFSR33.get((int) (byte) 10);
        boolean boolean37 = lFSR33.get(0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR37 = new com.thealgorithms.ciphers.a5.LFSR(100, 0, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray27);
        boolean boolean41 = lFSR39.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(1, 10, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (byte) 1, intArray2);
        boolean boolean5 = lFSR3.get((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(0, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, 64, intArray13);
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
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        boolean boolean13 = lFSR9.get(10);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean13 = lFSR9.get((int) '4');
        boolean boolean14 = lFSR9.clock();
        boolean boolean15 = lFSR9.getLastBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(0);
        boolean boolean13 = lFSR6.clock();
        boolean boolean15 = lFSR6.get((int) '#');
        boolean boolean16 = lFSR6.clock();
        boolean boolean17 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.clock();
        boolean boolean15 = lFSR9.get(1);
        boolean boolean16 = lFSR9.getLastBit();
        boolean boolean18 = lFSR9.get((int) ' ');
        java.lang.String str19 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.getLastBit();
        boolean boolean13 = lFSR6.get(22);
        boolean boolean15 = lFSR6.get(0);
        boolean boolean16 = lFSR6.getClockBit();
        boolean boolean18 = lFSR6.get((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray11);
        boolean boolean16 = lFSR15.clock();
        java.lang.String str17 = lFSR15.toString();
        boolean boolean18 = lFSR15.getLastBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 100, intArray11);
        boolean boolean16 = lFSR15.clock();
        java.lang.Class<?> wildcardClass17 = lFSR15.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray15);
        boolean boolean22 = lFSR21.clock();
        boolean boolean23 = lFSR21.getClockBit();
        boolean boolean24 = lFSR21.clock();
        boolean boolean25 = lFSR21.getClockBit();
        boolean boolean26 = lFSR21.clock();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
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
        boolean boolean18 = lFSR9.getClockBit();
        boolean boolean19 = lFSR9.clock();
        java.lang.String str20 = lFSR9.toString();
        boolean boolean21 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) 'a', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 0, intArray11);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean10 = lFSR6.get((int) 'a');
        boolean boolean11 = lFSR6.getClockBit();
        java.util.BitSet bitSet12 = null;
        java.util.BitSet bitSet13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR6.initialize(bitSet12, bitSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 1, intArray17);
        boolean boolean25 = lFSR24.clock();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray11);
        boolean boolean16 = lFSR15.clock();
        java.lang.String str17 = lFSR15.toString();
        boolean boolean19 = lFSR15.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        int[] intArray11 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 64, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 64, intArray11);
        java.lang.String str16 = lFSR15.toString();
        java.lang.String str17 = lFSR15.toString();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[22, 10, 100]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 22, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) '#', intArray19);
        boolean boolean28 = lFSR27.getClockBit();
        boolean boolean30 = lFSR27.get((int) '4');
        boolean boolean32 = lFSR27.get(10);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray13);
        java.lang.Class<?> wildcardClass19 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
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
        java.lang.Class<?> wildcardClass21 = lFSR6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.clock();
        boolean boolean15 = lFSR9.get(1);
        boolean boolean16 = lFSR9.getClockBit();
        boolean boolean17 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        boolean boolean18 = lFSR15.get(10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
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
        boolean boolean21 = lFSR9.getClockBit();
        boolean boolean23 = lFSR9.get((int) 'a');
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
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.get((int) (short) 100);
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.get((int) 'a');
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) '#', intArray2);
        java.util.BitSet bitSet4 = null;
        java.util.BitSet bitSet5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR3.initialize(bitSet4, bitSet5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray11);
        boolean boolean17 = lFSR15.get(64);
        boolean boolean19 = lFSR15.get(22);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        int[] intArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) -1, (int) (short) 100, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
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
        java.lang.Class<?> wildcardClass19 = lFSR6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) (short) 0);
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.get(100);
        java.lang.Class<?> wildcardClass18 = lFSR6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray13);
        java.lang.String str19 = lFSR18.toString();
        java.lang.Class<?> wildcardClass20 = lFSR18.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) ' ', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 100, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) '4', intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(64, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 0, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) -1, (int) ' ', intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.clock();
        boolean boolean12 = lFSR9.get((int) (short) 1);
        boolean boolean14 = lFSR9.get(64);
        java.lang.String str15 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(100, 64, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 0, intArray11);
        boolean boolean17 = lFSR15.get(64);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) -1, intArray25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = lFSR36.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get(10);
        java.lang.String str13 = lFSR6.toString();
        boolean boolean15 = lFSR6.get((int) '4');
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.getClockBit();
        boolean boolean19 = lFSR6.get(22);
        boolean boolean20 = lFSR6.getClockBit();
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
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) -1, intArray21);
        boolean boolean31 = lFSR30.getLastBit();
        boolean boolean32 = lFSR30.clock();
        boolean boolean33 = lFSR30.clock();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean14 = lFSR9.get(22);
        boolean boolean15 = lFSR9.clock();
        boolean boolean17 = lFSR9.get((int) '4');
        java.lang.String str18 = lFSR9.toString();
        java.util.BitSet bitSet19 = null;
        java.util.BitSet bitSet20 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR9.initialize(bitSet19, bitSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) 0, intArray7);
        java.lang.String str10 = lFSR9.toString();
        java.lang.String str11 = lFSR9.toString();
        java.lang.Class<?> wildcardClass12 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        boolean boolean12 = lFSR9.clock();
        boolean boolean13 = lFSR9.clock();
        boolean boolean14 = lFSR9.clock();
        java.util.BitSet bitSet15 = null;
        java.util.BitSet bitSet16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR9.initialize(bitSet15, bitSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray15);
        boolean boolean23 = lFSR21.get((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        int[] intArray7 = new int[] { (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) 100, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 22, intArray7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
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
        boolean boolean20 = lFSR9.get(1);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.get((int) (byte) 0);
        java.lang.String str14 = lFSR6.toString();
        boolean boolean15 = lFSR6.getClockBit();
        boolean boolean16 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
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
        java.lang.String str16 = lFSR6.toString();
        java.lang.String str17 = lFSR6.toString();
        boolean boolean18 = lFSR6.clock();
        java.lang.Class<?> wildcardClass19 = lFSR6.getClass();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        int[] intArray15 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) '#', intArray15);
        java.lang.String str22 = lFSR21.toString();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[52, 52, 1]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (short) 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 64, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(10, 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(100, 22, intArray23);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) -1, (int) (byte) -1, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        int[] intArray5 = new int[] { (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) 100, intArray5);
        com.thealgorithms.ciphers.a5.LFSR lFSR7 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 10, intArray5);
        java.lang.String str8 = lFSR7.toString();
        boolean boolean9 = lFSR7.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) (short) 0);
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.get(100);
        boolean boolean19 = lFSR6.get(10);
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
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
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
        java.lang.Class<?> wildcardClass29 = lFSR27.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{}" + "'", str28, "{}");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        boolean boolean14 = lFSR12.clock();
        java.lang.String str15 = lFSR12.toString();
        boolean boolean17 = lFSR12.get((int) (byte) 0);
        java.lang.String str18 = lFSR12.toString();
        boolean boolean19 = lFSR12.getClockBit();
        boolean boolean21 = lFSR12.get((int) (byte) 100);
        boolean boolean22 = lFSR12.clock();
        java.lang.String str23 = lFSR12.toString();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.getLastBit();
        java.lang.String str12 = lFSR6.toString();
        java.lang.String str13 = lFSR6.toString();
        boolean boolean14 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        int[] intArray9 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 1, intArray9);
        boolean boolean13 = lFSR12.getLastBit();
        boolean boolean14 = lFSR12.clock();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.clock();
        boolean boolean14 = lFSR9.get((int) '#');
        boolean boolean15 = lFSR9.clock();
        boolean boolean16 = lFSR9.clock();
        boolean boolean17 = lFSR9.clock();
        boolean boolean19 = lFSR9.get(100);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(0);
        java.lang.String str13 = lFSR6.toString();
        java.lang.String str14 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.get(1);
        boolean boolean13 = lFSR9.clock();
        boolean boolean14 = lFSR9.getClockBit();
        java.lang.String str15 = lFSR9.toString();
        java.lang.String str16 = lFSR9.toString();
        boolean boolean17 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray17);
        java.lang.String str25 = lFSR24.toString();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 64, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray11);
        boolean boolean16 = lFSR15.clock();
        boolean boolean17 = lFSR15.getClockBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray11);
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
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        int[] intArray7 = new int[] { 10, 22, 10 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, 64, intArray7);
        boolean boolean10 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 22, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(1, 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (-1), intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) 'a', intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, 0, intArray15);
        boolean boolean22 = lFSR21.getClockBit();
        java.util.BitSet bitSet23 = null;
        java.util.BitSet bitSet24 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR21.initialize(bitSet23, bitSet24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get((int) (byte) 0);
        boolean boolean13 = lFSR6.clock();
        java.lang.String str14 = lFSR6.toString();
        java.lang.String str15 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        int[] intArray15 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 10, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) -1, 0, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[52, 52, 1]");
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean13 = lFSR9.get(100);
        boolean boolean14 = lFSR9.clock();
        boolean boolean15 = lFSR9.clock();
        boolean boolean16 = lFSR9.getLastBit();
        java.lang.String str17 = lFSR9.toString();
        boolean boolean19 = lFSR9.get(10);
        boolean boolean20 = lFSR9.getLastBit();
        boolean boolean21 = lFSR9.clock();
        java.util.BitSet bitSet22 = null;
        java.util.BitSet bitSet23 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR9.initialize(bitSet22, bitSet23);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        int[] intArray25 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 100, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) 'a', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 10, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 64, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) 10, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 0, intArray25);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(10, (-1), intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean14 = lFSR6.get((int) '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.clock();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean9 = lFSR6.getLastBit();
        java.lang.Class<?> wildcardClass10 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        int[] intArray9 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.clock();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 52, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) '#');
        boolean boolean15 = lFSR9.getLastBit();
        java.lang.String str16 = lFSR9.toString();
        boolean boolean17 = lFSR9.getClockBit();
        java.lang.String str18 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.clock();
        java.lang.String str14 = lFSR9.toString();
        boolean boolean15 = lFSR9.getClockBit();
        boolean boolean16 = lFSR9.clock();
        boolean boolean17 = lFSR9.clock();
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
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
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
        boolean boolean18 = lFSR6.getClockBit();
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
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
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
        java.lang.String str27 = lFSR24.toString();
        boolean boolean28 = lFSR24.getClockBit();
        java.lang.Class<?> wildcardClass29 = lFSR24.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{}" + "'", str27, "{}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray7);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray9);
        boolean boolean14 = lFSR12.get(100);
        boolean boolean15 = lFSR12.getLastBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
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
        boolean boolean17 = lFSR6.clock();
        java.lang.Class<?> wildcardClass18 = lFSR6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        java.lang.String str14 = lFSR6.toString();
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.getLastBit();
        java.lang.Class<?> wildcardClass18 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean8 = lFSR6.get((int) '4');
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.get(22);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 64, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) ' ', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) -1, intArray23);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean11 = lFSR6.get((int) ' ');
        boolean boolean12 = lFSR6.clock();
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) -1, intArray9);
        boolean boolean14 = lFSR12.get((int) (short) 1);
        boolean boolean16 = lFSR12.get((int) ' ');
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        int[] intArray25 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 10, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 100, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, 100, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) -1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 0, intArray25);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.clock();
        java.lang.String str13 = lFSR9.toString();
        boolean boolean15 = lFSR9.get((int) (byte) 10);
        boolean boolean16 = lFSR9.getLastBit();
        java.lang.String str17 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(0);
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getClockBit();
        boolean boolean15 = lFSR6.getClockBit();
        boolean boolean16 = lFSR6.getClockBit();
        boolean boolean17 = lFSR6.getClockBit();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get(100);
        boolean boolean14 = lFSR6.get((int) (short) 10);
        boolean boolean15 = lFSR6.getClockBit();
        boolean boolean16 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean12 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.get(1);
        boolean boolean16 = lFSR6.get((int) (short) 10);
        boolean boolean18 = lFSR6.get(0);
        boolean boolean19 = lFSR6.clock();
        boolean boolean20 = lFSR6.getLastBit();
        boolean boolean21 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean8 = lFSR6.clock();
        boolean boolean10 = lFSR6.get((int) (byte) 100);
        boolean boolean11 = lFSR6.clock();
        java.util.BitSet bitSet12 = null;
        java.util.BitSet bitSet13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR6.initialize(bitSet12, bitSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) -1, intArray2);
        java.lang.String str4 = lFSR3.toString();
        boolean boolean6 = lFSR3.get((int) (byte) 1);
        boolean boolean7 = lFSR3.getLastBit();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        int[] intArray11 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(64, 0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((-1), (int) (byte) -1, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[22, 10, 100]");
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        int[] intArray11 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) -1, intArray11);
        java.lang.String str16 = lFSR15.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = lFSR15.getClockBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) '4', intArray17);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) -1, (int) (short) 1, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray11);
        boolean boolean16 = lFSR15.clock();
        boolean boolean17 = lFSR15.getLastBit();
        boolean boolean18 = lFSR15.getLastBit();
        boolean boolean20 = lFSR15.get((int) (short) 1);
        boolean boolean22 = lFSR15.get((int) '#');
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) ' ');
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.get((int) (byte) 100);
        boolean boolean14 = lFSR6.get((int) (byte) 100);
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.getLastBit();
        boolean boolean18 = lFSR6.clock();
        boolean boolean20 = lFSR6.get((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        java.lang.String str10 = lFSR9.toString();
        boolean boolean11 = lFSR9.clock();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean13 = lFSR9.getLastBit();
        boolean boolean14 = lFSR9.getLastBit();
        boolean boolean15 = lFSR9.getClockBit();
        java.lang.String str16 = lFSR9.toString();
        boolean boolean17 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.clock();
        boolean boolean14 = lFSR9.get((int) '4');
        boolean boolean15 = lFSR9.getClockBit();
        boolean boolean16 = lFSR9.getClockBit();
        boolean boolean17 = lFSR9.clock();
        boolean boolean19 = lFSR9.get((int) (byte) 10);
        java.util.BitSet bitSet20 = null;
        java.util.BitSet bitSet21 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR9.initialize(bitSet20, bitSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) '#', intArray19);
        java.lang.Class<?> wildcardClass28 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) 1, intArray13);
        boolean boolean19 = lFSR18.getLastBit();
        boolean boolean20 = lFSR18.clock();
        java.lang.String str21 = lFSR18.toString();
        boolean boolean23 = lFSR18.get((int) '4');
        boolean boolean24 = lFSR18.getClockBit();
        boolean boolean25 = lFSR18.clock();
        boolean boolean26 = lFSR18.getLastBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) ' ');
        boolean boolean10 = lFSR6.getLastBit();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean13 = lFSR6.get((int) (short) 1);
        boolean boolean14 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (byte) 100, intArray19);
        boolean boolean28 = lFSR27.getClockBit();
        boolean boolean29 = lFSR27.clock();
        boolean boolean30 = lFSR27.getLastBit();
        java.lang.String str31 = lFSR27.toString();
        boolean boolean32 = lFSR27.getClockBit();
        boolean boolean33 = lFSR27.getClockBit();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "{}" + "'", str31, "{}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(100, 64, intArray17);
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
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.clock();
        boolean boolean14 = lFSR9.get((int) '4');
        java.lang.String str15 = lFSR9.toString();
        boolean boolean17 = lFSR9.get(22);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
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
        boolean boolean32 = lFSR30.clock();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "{}" + "'", str31, "{}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get(100);
        boolean boolean14 = lFSR6.get((int) (short) 10);
        boolean boolean15 = lFSR6.getClockBit();
        boolean boolean17 = lFSR6.get((int) (byte) 1);
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
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
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
        boolean boolean38 = lFSR33.clock();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "{}" + "'", str36, "{}");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        int[] intArray11 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 10, intArray11);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 52, 1]");
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
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
        java.lang.Class<?> wildcardClass40 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.get((int) (short) 100);
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
        java.lang.Class<?> wildcardClass12 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.clock();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean9 = lFSR6.getClockBit();
        boolean boolean10 = lFSR6.clock();
        boolean boolean11 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.getLastBit();
        boolean boolean13 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get(10);
        boolean boolean13 = lFSR6.getLastBit();
        java.lang.String str14 = lFSR6.toString();
        java.lang.String str15 = lFSR6.toString();
        boolean boolean16 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 64, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) '#', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(0, 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 1, intArray23);
        boolean boolean34 = lFSR33.getLastBit();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        java.lang.String str14 = lFSR6.toString();
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.getClockBit();
        java.lang.String str18 = lFSR6.toString();
        boolean boolean19 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.clock();
        boolean boolean14 = lFSR9.get((int) '4');
        boolean boolean16 = lFSR9.get((int) (short) 1);
        boolean boolean17 = lFSR9.getClockBit();
        java.util.BitSet bitSet18 = null;
        java.util.BitSet bitSet19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR9.initialize(bitSet18, bitSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
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
        boolean boolean20 = lFSR6.get((int) (byte) 1);
        java.lang.String str21 = lFSR6.toString();
        boolean boolean23 = lFSR6.get((int) (short) 1);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean13 = lFSR6.get(22);
        java.lang.String str14 = lFSR6.toString();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 1, intArray17);
        java.lang.Class<?> wildcardClass25 = lFSR24.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 22, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 1, intArray21);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) -1, 10, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.getLastBit();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean9 = lFSR6.getLastBit();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.get((int) (short) 1);
        boolean boolean14 = lFSR6.get((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.clock();
        boolean boolean14 = lFSR12.getClockBit();
        java.lang.String str15 = lFSR12.toString();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.clock();
        boolean boolean14 = lFSR9.getLastBit();
        boolean boolean15 = lFSR9.clock();
        boolean boolean16 = lFSR9.getLastBit();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) (short) 0);
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.clock();
        boolean boolean19 = lFSR6.get((int) (short) 1);
        java.lang.String str20 = lFSR6.toString();
        boolean boolean21 = lFSR6.getLastBit();
        java.lang.Class<?> wildcardClass22 = lFSR6.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        boolean boolean17 = lFSR15.getLastBit();
        boolean boolean18 = lFSR15.getLastBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) '4', intArray15);
        boolean boolean22 = lFSR21.clock();
        java.lang.String str23 = lFSR21.toString();
        boolean boolean24 = lFSR21.getClockBit();
        java.util.BitSet bitSet25 = null;
        java.util.BitSet bitSet26 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR21.initialize(bitSet25, bitSet26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        java.lang.String str10 = lFSR9.toString();
        boolean boolean11 = lFSR9.clock();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = lFSR9.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, 100, intArray11);
        java.lang.String str16 = lFSR15.toString();
        java.util.BitSet bitSet17 = null;
        java.util.BitSet bitSet18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR15.initialize(bitSet17, bitSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
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
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
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
        boolean boolean17 = lFSR6.get((int) (short) 10);
        java.lang.String str18 = lFSR6.toString();
        boolean boolean19 = lFSR6.getClockBit();
        java.lang.String str20 = lFSR6.toString();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        boolean boolean14 = lFSR12.clock();
        boolean boolean15 = lFSR12.getClockBit();
        java.lang.String str16 = lFSR12.toString();
        java.lang.String str17 = lFSR12.toString();
        java.util.BitSet bitSet18 = null;
        java.util.BitSet bitSet19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR12.initialize(bitSet18, bitSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean13 = lFSR9.get((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
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
        boolean boolean21 = lFSR6.clock();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 64, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 0, intArray19);
        boolean boolean28 = lFSR27.getClockBit();
        java.lang.Class<?> wildcardClass29 = lFSR27.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        boolean boolean18 = lFSR15.get((int) (short) 100);
        boolean boolean19 = lFSR15.getClockBit();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.getClockBit();
        boolean boolean15 = lFSR6.clock();
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
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) -1, intArray9);
        boolean boolean13 = lFSR12.getLastBit();
        java.lang.String str14 = lFSR12.toString();
        java.lang.Class<?> wildcardClass15 = lFSR12.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 100, intArray2);
        java.util.BitSet bitSet4 = null;
        java.util.BitSet bitSet5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR3.initialize(bitSet4, bitSet5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(1, 0, intArray23);
        java.lang.Class<?> wildcardClass34 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
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
        boolean boolean35 = lFSR33.get(1);
        java.util.BitSet bitSet36 = null;
        java.util.BitSet bitSet37 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR33.initialize(bitSet36, bitSet37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        int[] intArray11 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[22, 10, 100]");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        int[] intArray7 = new int[] { (short) 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) -1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 10, intArray7);
        boolean boolean12 = lFSR10.get(100);
        boolean boolean14 = lFSR10.get((int) '4');
        java.lang.String str15 = lFSR10.toString();
        java.lang.String str16 = lFSR10.toString();
        boolean boolean17 = lFSR10.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(10, 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(100, 22, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 100, intArray23);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
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
        boolean boolean19 = lFSR9.getLastBit();
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
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) ' ', intArray9);
        boolean boolean13 = lFSR12.clock();
        boolean boolean14 = lFSR12.getClockBit();
        java.lang.String str15 = lFSR12.toString();
        boolean boolean16 = lFSR12.clock();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        int[] intArray7 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 100, intArray7);
        java.lang.Class<?> wildcardClass10 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[22, 10, 100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.clock();
        boolean boolean11 = lFSR9.getClockBit();
        boolean boolean13 = lFSR9.get((int) '#');
        boolean boolean15 = lFSR9.get((int) ' ');
        boolean boolean16 = lFSR9.getLastBit();
        boolean boolean18 = lFSR9.get(22);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        boolean boolean12 = lFSR9.getLastBit();
        java.lang.String str13 = lFSR9.toString();
        boolean boolean14 = lFSR9.getClockBit();
        boolean boolean15 = lFSR9.getClockBit();
        boolean boolean17 = lFSR9.get(0);
        java.util.BitSet bitSet18 = null;
        java.util.BitSet bitSet19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR9.initialize(bitSet18, bitSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
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
        boolean boolean17 = lFSR6.get((int) '4');
        boolean boolean18 = lFSR6.clock();
        boolean boolean19 = lFSR6.getClockBit();
        java.lang.Class<?> wildcardClass20 = lFSR6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) ' ', intArray9);
        boolean boolean13 = lFSR12.clock();
        java.lang.String str14 = lFSR12.toString();
        boolean boolean15 = lFSR12.clock();
        boolean boolean16 = lFSR12.getLastBit();
        boolean boolean17 = lFSR12.getClockBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        boolean boolean14 = lFSR12.clock();
        boolean boolean15 = lFSR12.getLastBit();
        boolean boolean17 = lFSR12.get((int) (byte) 0);
        boolean boolean18 = lFSR12.getLastBit();
        boolean boolean20 = lFSR12.get((int) ' ');
        boolean boolean21 = lFSR12.getClockBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.clock();
        boolean boolean14 = lFSR9.get((int) '4');
        boolean boolean15 = lFSR9.getClockBit();
        boolean boolean16 = lFSR9.getClockBit();
        boolean boolean17 = lFSR9.clock();
        boolean boolean19 = lFSR9.get((int) (byte) 10);
        boolean boolean21 = lFSR9.get(100);
        java.util.BitSet bitSet22 = null;
        java.util.BitSet bitSet23 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR9.initialize(bitSet22, bitSet23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        int[] intArray3 = new int[] { (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR4 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) 100, intArray3);
        java.lang.String str5 = lFSR4.toString();
        boolean boolean6 = lFSR4.getLastBit();
        java.lang.String str7 = lFSR4.toString();
        boolean boolean9 = lFSR4.get((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{}" + "'", str5, "{}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
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
        boolean boolean37 = lFSR36.getClockBit();
        java.lang.String str38 = lFSR36.toString();
        boolean boolean39 = lFSR36.clock();
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{}" + "'", str38, "{}");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) ' ', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (-1), intArray11);
        boolean boolean17 = lFSR15.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
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
        boolean boolean18 = lFSR6.get((int) (byte) 100);
        boolean boolean20 = lFSR6.get(0);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean13 = lFSR9.get(100);
        boolean boolean14 = lFSR9.clock();
        boolean boolean15 = lFSR9.clock();
        boolean boolean16 = lFSR9.getLastBit();
        java.lang.String str17 = lFSR9.toString();
        boolean boolean18 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getLastBit();
        boolean boolean10 = lFSR6.getLastBit();
        java.lang.Class<?> wildcardClass11 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.clock();
        boolean boolean13 = lFSR9.clock();
        boolean boolean14 = lFSR9.getLastBit();
        boolean boolean15 = lFSR9.getLastBit();
        boolean boolean16 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.clock();
        boolean boolean14 = lFSR9.get((int) '4');
        boolean boolean16 = lFSR9.get((int) (short) 1);
        java.lang.String str17 = lFSR9.toString();
        java.lang.String str18 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray13);
        java.lang.String str19 = lFSR18.toString();
        boolean boolean20 = lFSR18.getClockBit();
        java.lang.String str21 = lFSR18.toString();
        java.lang.Class<?> wildcardClass22 = lFSR18.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.get((int) (byte) 10);
        boolean boolean14 = lFSR9.clock();
        boolean boolean15 = lFSR9.getClockBit();
        boolean boolean16 = lFSR9.getClockBit();
        java.lang.String str17 = lFSR9.toString();
        boolean boolean18 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
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
        boolean boolean20 = lFSR6.getLastBit();
        boolean boolean21 = lFSR6.clock();
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
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.clock();
        boolean boolean12 = lFSR9.get((int) (short) 10);
        java.lang.String str13 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 10, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        java.lang.Class<?> wildcardClass13 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getClockBit();
        boolean boolean10 = lFSR6.get(22);
        java.lang.String str11 = lFSR6.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = lFSR6.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean11 = lFSR6.getClockBit();
        java.lang.String str12 = lFSR6.toString();
        boolean boolean13 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getLastBit();
        java.lang.String str15 = lFSR6.toString();
        boolean boolean17 = lFSR6.get(64);
        boolean boolean19 = lFSR6.get(1);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) 0, intArray7);
        java.lang.String str10 = lFSR9.toString();
        java.lang.String str11 = lFSR9.toString();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get(0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        int[] intArray9 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        java.lang.String str14 = lFSR12.toString();
        java.lang.Class<?> wildcardClass15 = lFSR12.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 52, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.clock();
        boolean boolean14 = lFSR6.get((int) (short) 10);
        boolean boolean15 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean14 = lFSR9.get(22);
        boolean boolean15 = lFSR9.getClockBit();
        java.lang.String str16 = lFSR9.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = lFSR9.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
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
        boolean boolean37 = lFSR30.get((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        java.lang.String str14 = lFSR12.toString();
        java.lang.String str15 = lFSR12.toString();
        boolean boolean17 = lFSR12.get((int) (short) 0);
        java.lang.String str18 = lFSR12.toString();
        boolean boolean20 = lFSR12.get(64);
        java.lang.String str21 = lFSR12.toString();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        int[] intArray5 = new int[] { (short) 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray5);
        com.thealgorithms.ciphers.a5.LFSR lFSR7 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) -1, intArray5);
        boolean boolean9 = lFSR7.get((int) (short) 0);
        java.lang.Class<?> wildcardClass10 = lFSR7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
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
        boolean boolean21 = lFSR6.getLastBit();
        java.lang.Class<?> wildcardClass22 = lFSR6.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get(10);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 22, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) '4', intArray17);
        java.lang.Class<?> wildcardClass25 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        int[] intArray11 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 100, intArray11);
        java.lang.String str16 = lFSR15.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = lFSR15.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 52, 1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
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
        java.lang.Class<?> wildcardClass40 = lFSR33.getClass();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) ' ');
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.get((int) (byte) 100);
        boolean boolean14 = lFSR6.get((int) (byte) 100);
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.getLastBit();
        boolean boolean18 = lFSR6.clock();
        boolean boolean19 = lFSR6.getLastBit();
        boolean boolean20 = lFSR6.getLastBit();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(22, 64, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray17);
        java.lang.String str25 = lFSR24.toString();
        java.lang.String str26 = lFSR24.toString();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.clock();
        boolean boolean11 = lFSR9.getClockBit();
        boolean boolean13 = lFSR9.get(0);
        boolean boolean14 = lFSR9.getLastBit();
        java.lang.String str15 = lFSR9.toString();
        java.lang.String str16 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
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
        boolean boolean19 = lFSR9.getClockBit();
        boolean boolean20 = lFSR9.getLastBit();
        boolean boolean21 = lFSR9.getLastBit();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) '#', intArray13);
        boolean boolean19 = lFSR18.clock();
        java.lang.String str20 = lFSR18.toString();
        boolean boolean21 = lFSR18.getLastBit();
        boolean boolean23 = lFSR18.get((int) '#');
        java.util.BitSet bitSet24 = null;
        java.util.BitSet bitSet25 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR18.initialize(bitSet24, bitSet25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
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
        boolean boolean31 = lFSR27.getLastBit();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 10, intArray17);
        boolean boolean25 = lFSR24.getClockBit();
        boolean boolean26 = lFSR24.getClockBit();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
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
        java.lang.String str41 = lFSR33.toString();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "{}" + "'", str41, "{}");
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) ' ', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) -1, intArray17);
        boolean boolean25 = lFSR24.getLastBit();
        boolean boolean26 = lFSR24.clock();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.clock();
        java.lang.String str14 = lFSR9.toString();
        boolean boolean15 = lFSR9.getClockBit();
        boolean boolean16 = lFSR9.clock();
        boolean boolean17 = lFSR9.getClockBit();
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
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        boolean boolean11 = lFSR9.get((int) (short) 1);
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.clock();
        boolean boolean14 = lFSR9.getLastBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        int[] intArray7 = new int[] { 10, 22, 10 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray7);
        boolean boolean11 = lFSR9.get((int) 'a');
        java.lang.String str12 = lFSR9.toString();
        boolean boolean13 = lFSR9.getLastBit();
        boolean boolean14 = lFSR9.getLastBit();
        boolean boolean16 = lFSR9.get(0);
        boolean boolean17 = lFSR9.getClockBit();
        boolean boolean18 = lFSR9.getLastBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 22, 10]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.get((int) (short) 100);
        boolean boolean11 = lFSR6.get((int) ' ');
        java.lang.String str12 = lFSR6.toString();
        boolean boolean13 = lFSR6.getClockBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = lFSR6.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) (short) 0);
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.getLastBit();
        java.lang.String str17 = lFSR6.toString();
        java.lang.String str18 = lFSR6.toString();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray15);
        boolean boolean22 = lFSR21.getClockBit();
        boolean boolean23 = lFSR21.getClockBit();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.getClockBit();
        boolean boolean16 = lFSR6.clock();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.get(0);
        java.lang.String str14 = lFSR6.toString();
        boolean boolean16 = lFSR6.get((int) '#');
        boolean boolean17 = lFSR6.clock();
        boolean boolean19 = lFSR6.get((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        int[] intArray13 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) 'a', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(22, 10, intArray13);
        boolean boolean20 = lFSR18.get((int) (short) 1);
        boolean boolean21 = lFSR18.clock();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean8 = lFSR6.get((int) '4');
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean13 = lFSR6.get((int) (byte) 10);
        boolean boolean15 = lFSR6.get((int) 'a');
        java.util.BitSet bitSet16 = null;
        java.util.BitSet bitSet17 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR6.initialize(bitSet16, bitSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        int[] intArray5 = new int[] { (short) 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray5);
        com.thealgorithms.ciphers.a5.LFSR lFSR7 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) -1, intArray5);
        boolean boolean8 = lFSR7.clock();
        java.lang.String str9 = lFSR7.toString();
        java.lang.String str10 = lFSR7.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.clock();
        boolean boolean14 = lFSR9.get((int) '#');
        boolean boolean15 = lFSR9.clock();
        java.lang.String str16 = lFSR9.toString();
        java.lang.String str17 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray13);
        java.lang.String str19 = lFSR18.toString();
        java.lang.String str20 = lFSR18.toString();
        boolean boolean21 = lFSR18.clock();
        boolean boolean23 = lFSR18.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (short) 10, intArray15);
        boolean boolean23 = lFSR21.get((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 10, intArray17);
        boolean boolean25 = lFSR24.getLastBit();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 10, intArray11);
        boolean boolean17 = lFSR15.get(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = lFSR15.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
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
        java.lang.String str21 = lFSR12.toString();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean11 = lFSR6.get((int) ' ');
        boolean boolean12 = lFSR6.clock();
        boolean boolean13 = lFSR6.clock();
        boolean boolean15 = lFSR6.get(1);
        java.lang.String str16 = lFSR6.toString();
        boolean boolean17 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
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
        boolean boolean21 = lFSR6.get((int) (byte) 100);
        boolean boolean22 = lFSR6.getClockBit();
        boolean boolean23 = lFSR6.getLastBit();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) ' ', intArray9);
        boolean boolean13 = lFSR12.clock();
        boolean boolean14 = lFSR12.getClockBit();
        java.lang.String str15 = lFSR12.toString();
        boolean boolean17 = lFSR12.get((int) (short) 100);
        boolean boolean18 = lFSR12.getLastBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.get((int) 'a');
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean14 = lFSR12.clock();
        boolean boolean16 = lFSR12.get(1);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get(10);
        java.lang.String str13 = lFSR6.toString();
        boolean boolean14 = lFSR6.getClockBit();
        boolean boolean16 = lFSR6.get(0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        int[] intArray11 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 64, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray11);
        boolean boolean16 = lFSR15.getLastBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        java.lang.String str4 = lFSR3.toString();
        boolean boolean5 = lFSR3.getLastBit();
        boolean boolean6 = lFSR3.getLastBit();
        java.util.BitSet bitSet7 = null;
        java.util.BitSet bitSet8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR3.initialize(bitSet7, bitSet8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 1, intArray2);
        boolean boolean4 = lFSR3.getClockBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = lFSR3.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
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
        boolean boolean21 = lFSR9.getClockBit();
        boolean boolean23 = lFSR9.get((int) (byte) 100);
        java.lang.Class<?> wildcardClass24 = lFSR9.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) (short) 0);
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.getLastBit();
        java.lang.String str15 = lFSR6.toString();
        java.lang.String str16 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.get((int) 'a');
        boolean boolean10 = lFSR6.getClockBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = lFSR6.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (short) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (-1), intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
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
        boolean boolean22 = lFSR6.getClockBit();
        java.lang.Class<?> wildcardClass23 = lFSR6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 100, intArray15);
        boolean boolean22 = lFSR21.clock();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = lFSR21.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        boolean boolean14 = lFSR12.clock();
        boolean boolean15 = lFSR12.getClockBit();
        boolean boolean16 = lFSR12.clock();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        boolean boolean10 = lFSR6.clock();
        boolean boolean11 = lFSR6.getClockBit();
        java.lang.String str12 = lFSR6.toString();
        java.lang.String str13 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.clock();
        boolean boolean14 = lFSR9.getLastBit();
        boolean boolean15 = lFSR9.getLastBit();
        boolean boolean17 = lFSR9.get((int) 'a');
        boolean boolean18 = lFSR9.getLastBit();
        java.util.BitSet bitSet19 = null;
        java.util.BitSet bitSet20 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR9.initialize(bitSet19, bitSet20);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray15);
        boolean boolean23 = lFSR21.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(0, 64, intArray7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) '#', intArray13);
        boolean boolean19 = lFSR18.clock();
        java.lang.String str20 = lFSR18.toString();
        boolean boolean21 = lFSR18.getLastBit();
        java.lang.String str22 = lFSR18.toString();
        java.lang.String str23 = lFSR18.toString();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
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
        boolean boolean37 = lFSR33.get(1);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        boolean boolean12 = lFSR9.getLastBit();
        java.lang.String str13 = lFSR9.toString();
        boolean boolean14 = lFSR9.getClockBit();
        boolean boolean15 = lFSR9.getClockBit();
        java.lang.String str16 = lFSR9.toString();
        boolean boolean18 = lFSR9.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean15 = lFSR12.get((int) (byte) 10);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) ' ');
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.get((int) (byte) 100);
        boolean boolean14 = lFSR6.get((int) (byte) 100);
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.getLastBit();
        boolean boolean19 = lFSR6.get((int) (byte) 10);
        boolean boolean20 = lFSR6.getLastBit();
        java.lang.String str21 = lFSR6.toString();
        boolean boolean22 = lFSR6.clock();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = lFSR9.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (-1), intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) 100, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray17);
        boolean boolean26 = lFSR24.get(64);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray15);
        java.lang.Class<?> wildcardClass22 = lFSR21.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
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
        boolean boolean19 = lFSR9.getLastBit();
        boolean boolean20 = lFSR9.clock();
        boolean boolean21 = lFSR9.getLastBit();
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
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
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
        boolean boolean22 = lFSR9.getClockBit();
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
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(10, 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(1, 22, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) '4', intArray21);
        java.lang.Class<?> wildcardClass31 = lFSR30.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
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
        boolean boolean20 = lFSR9.getClockBit();
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
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean14 = lFSR9.get(22);
        boolean boolean15 = lFSR9.clock();
        boolean boolean17 = lFSR9.get((int) '4');
        java.lang.String str18 = lFSR9.toString();
        boolean boolean19 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean11 = lFSR6.clock();
        boolean boolean13 = lFSR6.get((int) (short) 10);
        boolean boolean14 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        java.lang.String str14 = lFSR6.toString();
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.getClockBit();
        boolean boolean18 = lFSR6.getClockBit();
        boolean boolean20 = lFSR6.get(10);
        java.lang.String str21 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 1, intArray15);
        java.lang.String str22 = lFSR21.toString();
        java.lang.String str23 = lFSR21.toString();
        boolean boolean24 = lFSR21.getClockBit();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
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
        boolean boolean17 = lFSR6.clock();
        boolean boolean18 = lFSR6.getClockBit();
        java.util.BitSet bitSet19 = null;
        java.util.BitSet bitSet20 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR6.initialize(bitSet19, bitSet20);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
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
        boolean boolean36 = lFSR33.clock();
        java.lang.String str37 = lFSR33.toString();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "{}" + "'", str37, "{}");
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean12 = lFSR6.getLastBit();
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getClockBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = lFSR6.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean11 = lFSR6.get((int) (short) 10);
        boolean boolean12 = lFSR6.getLastBit();
        boolean boolean13 = lFSR6.getClockBit();
        boolean boolean14 = lFSR6.getClockBit();
        boolean boolean15 = lFSR6.getClockBit();
        java.lang.Class<?> wildcardClass16 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean14 = lFSR12.getLastBit();
        boolean boolean15 = lFSR12.getClockBit();
        boolean boolean16 = lFSR12.clock();
        java.lang.String str17 = lFSR12.toString();
        boolean boolean18 = lFSR12.getClockBit();
        boolean boolean19 = lFSR12.getLastBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 64, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) '#', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) 'a', intArray21);
        boolean boolean31 = lFSR30.getClockBit();
        boolean boolean33 = lFSR30.get((int) (byte) 10);
        boolean boolean35 = lFSR30.get((int) (byte) 10);
        boolean boolean37 = lFSR30.get((int) (byte) 100);
        java.util.BitSet bitSet38 = null;
        java.util.BitSet bitSet39 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR30.initialize(bitSet38, bitSet39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 0, intArray21);
        boolean boolean31 = lFSR30.getLastBit();
        boolean boolean33 = lFSR30.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) 1, intArray13);
        boolean boolean19 = lFSR18.getLastBit();
        boolean boolean20 = lFSR18.clock();
        java.lang.String str21 = lFSR18.toString();
        boolean boolean23 = lFSR18.get((int) '4');
        boolean boolean24 = lFSR18.getClockBit();
        boolean boolean25 = lFSR18.clock();
        java.lang.String str26 = lFSR18.toString();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.getLastBit();
        boolean boolean8 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
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
        java.lang.String str16 = lFSR6.toString();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) -1, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 1, intArray2);
        boolean boolean4 = lFSR3.getClockBit();
        boolean boolean6 = lFSR3.get((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 64, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 10, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) ' ', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) 1, intArray17);
        java.lang.String str25 = lFSR24.toString();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
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
        java.lang.String str25 = lFSR6.toString();
        boolean boolean26 = lFSR6.clock();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean12 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) 1, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '4', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(22, 100, intArray21);
        java.util.BitSet bitSet31 = null;
        java.util.BitSet bitSet32 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR30.initialize(bitSet31, bitSet32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) ' ');
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.get((int) (byte) 100);
        boolean boolean14 = lFSR6.get((int) (byte) 100);
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.get(64);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = lFSR6.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        int[] intArray5 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.get(100);
        java.lang.Class<?> wildcardClass12 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 52, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) -1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 0, intArray27);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        int[] intArray7 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        java.lang.String str10 = lFSR9.toString();
        boolean boolean11 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
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
        java.lang.Class<?> wildcardClass21 = lFSR6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
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
        boolean boolean19 = lFSR6.get((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (byte) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray17);
        boolean boolean25 = lFSR24.clock();
        boolean boolean26 = lFSR24.clock();
        boolean boolean27 = lFSR24.getLastBit();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.get((int) ' ');
        boolean boolean13 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray2);
        boolean boolean4 = lFSR3.getLastBit();
        boolean boolean5 = lFSR3.getClockBit();
        java.util.BitSet bitSet6 = null;
        java.util.BitSet bitSet7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR3.initialize(bitSet6, bitSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray9);
        boolean boolean14 = lFSR12.get(64);
        boolean boolean15 = lFSR12.clock();
        java.lang.String str16 = lFSR12.toString();
        java.lang.String str17 = lFSR12.toString();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.get((int) (byte) 10);
        boolean boolean14 = lFSR9.clock();
        boolean boolean15 = lFSR9.getClockBit();
        boolean boolean16 = lFSR9.getClockBit();
        boolean boolean17 = lFSR9.clock();
        java.util.BitSet bitSet18 = null;
        java.util.BitSet bitSet19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR9.initialize(bitSet18, bitSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
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
        boolean boolean19 = lFSR6.get((int) (byte) 10);
        boolean boolean20 = lFSR6.clock();
        boolean boolean21 = lFSR6.getClockBit();
        boolean boolean23 = lFSR6.get(1);
        java.lang.String str24 = lFSR6.toString();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{}" + "'", str24, "{}");
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        int[] intArray33 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR37 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR40 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR41 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR42 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) -1, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR43 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 100, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR44 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 10, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR45 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) -1, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR46 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) 100, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR47 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (byte) 100, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR48 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (short) 10, intArray33);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 1, 1]");
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, 100, intArray15);
        boolean boolean22 = lFSR21.clock();
        boolean boolean23 = lFSR21.getClockBit();
        java.lang.String str24 = lFSR21.toString();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{}" + "'", str24, "{}");
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean14 = lFSR12.getLastBit();
        boolean boolean15 = lFSR12.getClockBit();
        boolean boolean17 = lFSR12.get(0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) '4', intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
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
        boolean boolean18 = lFSR6.getClockBit();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 100, intArray2);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        int[] intArray7 = new int[] { (short) 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) -1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 100, intArray7);
        boolean boolean12 = lFSR10.get((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(0, 64, intArray11);
        boolean boolean17 = lFSR15.get((int) (byte) 1);
        java.lang.String str18 = lFSR15.toString();
        boolean boolean19 = lFSR15.getClockBit();
        java.lang.String str20 = lFSR15.toString();
        boolean boolean21 = lFSR15.getClockBit();
        java.lang.String str22 = lFSR15.toString();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 100, intArray19);
        java.util.BitSet bitSet28 = null;
        java.util.BitSet bitSet29 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR27.initialize(bitSet28, bitSet29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR(100, 22, intArray2);
        java.lang.String str4 = lFSR3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) 10, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, 0, intArray2);
        java.lang.String str4 = lFSR3.toString();
        java.lang.String str5 = lFSR3.toString();
        boolean boolean6 = lFSR3.getClockBit();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{}" + "'", str5, "{}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.getClockBit();
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
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 1, intArray13);
        java.lang.String str19 = lFSR18.toString();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (short) 1, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
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
        boolean boolean18 = lFSR6.getLastBit();
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
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean11 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.getClockBit();
        java.lang.String str13 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        java.lang.String str11 = lFSR6.toString();
        java.lang.String str12 = lFSR6.toString();
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) -1, 64, intArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
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
        boolean boolean36 = lFSR30.get(10);
        java.util.BitSet bitSet37 = null;
        java.util.BitSet bitSet38 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR30.initialize(bitSet37, bitSet38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
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
        java.lang.String str34 = lFSR33.toString();
        boolean boolean36 = lFSR33.get((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 1, intArray15);
        boolean boolean23 = lFSR21.get(22);
        boolean boolean24 = lFSR21.getClockBit();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 22, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray17);
        boolean boolean25 = lFSR24.clock();
        java.lang.String str26 = lFSR24.toString();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean13 = lFSR9.get((int) (short) 0);
        boolean boolean14 = lFSR9.clock();
        boolean boolean15 = lFSR9.getClockBit();
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
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (byte) 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 1, intArray21);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) -1, intArray13);
        java.lang.String str19 = lFSR18.toString();
        boolean boolean20 = lFSR18.getLastBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getLastBit();
        java.lang.String str15 = lFSR6.toString();
        boolean boolean17 = lFSR6.get(64);
        boolean boolean19 = lFSR6.get(1);
        boolean boolean21 = lFSR6.get(64);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        int[] intArray13 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray13);
        java.lang.String str19 = lFSR18.toString();
        boolean boolean21 = lFSR18.get(1);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (byte) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        int[] intArray9 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 1, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        boolean boolean15 = lFSR12.get((int) '#');
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.clock();
        boolean boolean14 = lFSR9.getLastBit();
        boolean boolean15 = lFSR9.clock();
        boolean boolean16 = lFSR9.clock();
        boolean boolean17 = lFSR9.clock();
        java.lang.Class<?> wildcardClass18 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean12 = lFSR6.getLastBit();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.getLastBit();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean9 = lFSR6.getLastBit();
        boolean boolean10 = lFSR6.getLastBit();
        java.util.BitSet bitSet11 = null;
        java.util.BitSet bitSet12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR6.initialize(bitSet11, bitSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        int[] intArray11 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 64, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray11);
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
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (byte) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) 10, intArray19);
        boolean boolean28 = lFSR27.getLastBit();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (byte) 100, intArray19);
        boolean boolean28 = lFSR27.clock();
        boolean boolean29 = lFSR27.clock();
        boolean boolean30 = lFSR27.clock();
        boolean boolean31 = lFSR27.clock();
        boolean boolean32 = lFSR27.getClockBit();
        boolean boolean33 = lFSR27.clock();
        java.lang.String str34 = lFSR27.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = lFSR27.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        int[] intArray29 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 64, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR37 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) '#', intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR(0, 1, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (-1), intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR40 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 100, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR41 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) 1, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR42 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray29);
        java.util.BitSet bitSet43 = null;
        java.util.BitSet bitSet44 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR42.initialize(bitSet43, bitSet44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 1, 1]");
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = lFSR33.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 22, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray21);
        java.util.BitSet bitSet31 = null;
        java.util.BitSet bitSet32 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR30.initialize(bitSet31, bitSet32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
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
        boolean boolean19 = lFSR12.getLastBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.clock();
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.clock();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean5 = lFSR3.get(0);
        boolean boolean6 = lFSR3.getLastBit();
        boolean boolean7 = lFSR3.getClockBit();
        java.util.BitSet bitSet8 = null;
        java.util.BitSet bitSet9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR3.initialize(bitSet8, bitSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.getLastBit();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean9 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.get(0);
        boolean boolean13 = lFSR6.get((int) (short) 1);
        boolean boolean14 = lFSR6.getClockBit();
        boolean boolean15 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(100, 10, intArray19);
        boolean boolean29 = lFSR27.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(10, 10, intArray15);
        boolean boolean22 = lFSR21.getClockBit();
        java.lang.String str23 = lFSR21.toString();
        java.lang.String str24 = lFSR21.toString();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{}" + "'", str24, "{}");
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray13);
        boolean boolean19 = lFSR18.getClockBit();
        boolean boolean20 = lFSR18.clock();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        boolean boolean13 = lFSR9.get((int) ' ');
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
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
        boolean boolean17 = lFSR6.get((int) (short) 10);
        boolean boolean19 = lFSR6.get(1);
        boolean boolean20 = lFSR6.getLastBit();
        boolean boolean21 = lFSR6.getClockBit();
        boolean boolean22 = lFSR6.getClockBit();
        boolean boolean24 = lFSR6.get((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
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
        boolean boolean22 = lFSR6.getLastBit();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.get(0);
        boolean boolean14 = lFSR9.get((int) (byte) 0);
        boolean boolean16 = lFSR9.get((int) '4');
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) ' ', intArray9);
        boolean boolean13 = lFSR12.clock();
        boolean boolean14 = lFSR12.getClockBit();
        java.lang.String str15 = lFSR12.toString();
        boolean boolean17 = lFSR12.get((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = lFSR12.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) ' ', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) '4', intArray15);
        boolean boolean23 = lFSR21.get(22);
        boolean boolean24 = lFSR21.getLastBit();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean14 = lFSR9.get((int) '4');
        java.util.BitSet bitSet15 = null;
        java.util.BitSet bitSet16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR9.initialize(bitSet15, bitSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray13);
        java.lang.String str19 = lFSR18.toString();
        boolean boolean20 = lFSR18.getLastBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = lFSR18.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
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
        boolean boolean19 = lFSR9.clock();
        boolean boolean20 = lFSR9.getLastBit();
        java.lang.String str21 = lFSR9.toString();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray11);
        boolean boolean17 = lFSR15.get(0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 0, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        boolean boolean18 = lFSR15.get(0);
        boolean boolean19 = lFSR15.getLastBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        int[] intArray9 = new int[] { (short) 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) -1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 10, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) '4', intArray9);
        boolean boolean14 = lFSR13.getLastBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
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
        java.util.BitSet bitSet24 = null;
        java.util.BitSet bitSet25 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR6.initialize(bitSet24, bitSet25);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 100, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
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
        boolean boolean37 = lFSR36.getClockBit();
        java.lang.String str38 = lFSR36.toString();
        boolean boolean39 = lFSR36.getLastBit();
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{}" + "'", str38, "{}");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        java.lang.String str14 = lFSR12.toString();
        boolean boolean15 = lFSR12.getLastBit();
        boolean boolean16 = lFSR12.getClockBit();
        boolean boolean17 = lFSR12.clock();
        boolean boolean18 = lFSR12.clock();
        boolean boolean19 = lFSR12.getClockBit();
        java.util.BitSet bitSet20 = null;
        java.util.BitSet bitSet21 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR12.initialize(bitSet20, bitSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.get((int) (byte) 0);
        boolean boolean14 = lFSR6.clock();
        boolean boolean15 = lFSR6.clock();
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
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
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
        boolean boolean19 = lFSR9.get((int) '4');
        java.lang.Class<?> wildcardClass20 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean14 = lFSR9.get(22);
        java.util.BitSet bitSet15 = null;
        java.util.BitSet bitSet16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR9.initialize(bitSet15, bitSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(1, 64, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) '#', intArray11);
        java.lang.String str16 = lFSR15.toString();
        boolean boolean17 = lFSR15.clock();
        boolean boolean18 = lFSR15.clock();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
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
        boolean boolean41 = lFSR33.get((int) (byte) 0);
        boolean boolean42 = lFSR33.getLastBit();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR(64, 100, intArray2);
        boolean boolean5 = lFSR3.get((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = lFSR3.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(100, 64, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray17);
        boolean boolean26 = lFSR24.get(1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean15 = lFSR12.get((int) (byte) 10);
        java.lang.String str16 = lFSR12.toString();
        boolean boolean17 = lFSR12.getLastBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = lFSR12.getClockBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) 'a', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(1, 64, intArray13);
        boolean boolean19 = lFSR18.getLastBit();
        boolean boolean20 = lFSR18.getClockBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
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
        boolean boolean19 = lFSR6.get((int) '#');
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        int[] intArray11 = new int[] { 10, 22, 10 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray11);
        boolean boolean16 = lFSR15.clock();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 22, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        int[] intArray17 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) '4', intArray17);
        boolean boolean25 = lFSR24.getClockBit();
        java.util.BitSet bitSet26 = null;
        java.util.BitSet bitSet27 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR24.initialize(bitSet26, bitSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[22, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.clock();
        boolean boolean13 = lFSR9.getClockBit();
        boolean boolean14 = lFSR9.clock();
        java.util.BitSet bitSet15 = null;
        java.util.BitSet bitSet16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR9.initialize(bitSet15, bitSet16);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.clock();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean9 = lFSR6.getClockBit();
        boolean boolean10 = lFSR6.clock();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean12 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.clock();
        boolean boolean13 = lFSR6.getClockBit();
        boolean boolean15 = lFSR6.get(100);
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean18 = lFSR6.get(0);
        java.lang.Class<?> wildcardClass19 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 100, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        java.lang.String str4 = lFSR3.toString();
        boolean boolean5 = lFSR3.getLastBit();
        boolean boolean6 = lFSR3.getLastBit();
        boolean boolean8 = lFSR3.get((int) (short) 1);
        boolean boolean9 = lFSR3.getLastBit();
        java.lang.Class<?> wildcardClass10 = lFSR3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
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
        boolean boolean18 = lFSR6.clock();
        java.lang.String str19 = lFSR6.toString();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        boolean boolean14 = lFSR12.clock();
        boolean boolean15 = lFSR12.getLastBit();
        boolean boolean16 = lFSR12.getLastBit();
        boolean boolean17 = lFSR12.getClockBit();
        boolean boolean18 = lFSR12.getClockBit();
        java.lang.Class<?> wildcardClass19 = lFSR12.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        java.lang.String str10 = lFSR9.toString();
        boolean boolean11 = lFSR9.getLastBit();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) (byte) 10);
        boolean boolean15 = lFSR9.getLastBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = lFSR9.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        boolean boolean12 = lFSR9.getLastBit();
        java.lang.String str13 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray21);
        java.lang.String str31 = lFSR30.toString();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "{}" + "'", str31, "{}");
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray15);
        boolean boolean23 = lFSR21.get(0);
        java.lang.Class<?> wildcardClass24 = lFSR21.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
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
        boolean boolean40 = lFSR33.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (byte) -1, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = lFSR21.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 64, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
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
        boolean boolean19 = lFSR6.get((int) (byte) 10);
        boolean boolean20 = lFSR6.clock();
        boolean boolean21 = lFSR6.getClockBit();
        boolean boolean22 = lFSR6.clock();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        java.lang.String str4 = lFSR3.toString();
        boolean boolean5 = lFSR3.getLastBit();
        boolean boolean6 = lFSR3.getClockBit();
        boolean boolean7 = lFSR3.getLastBit();
        boolean boolean9 = lFSR3.get((int) ' ');
        java.lang.Class<?> wildcardClass10 = lFSR3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray17);
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
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean12 = lFSR6.getLastBit();
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 64, intArray15);
        boolean boolean23 = lFSR21.get((int) (byte) 1);
        java.lang.Class<?> wildcardClass24 = lFSR21.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get(10);
        java.lang.String str13 = lFSR6.toString();
        boolean boolean15 = lFSR6.get((int) '4');
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.getClockBit();
        boolean boolean18 = lFSR6.getLastBit();
        boolean boolean20 = lFSR6.get((int) 'a');
        java.util.BitSet bitSet21 = null;
        java.util.BitSet bitSet22 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR6.initialize(bitSet21, bitSet22);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.getClockBit();
        boolean boolean16 = lFSR6.clock();
        boolean boolean17 = lFSR6.clock();
        boolean boolean18 = lFSR6.clock();
        boolean boolean19 = lFSR6.clock();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) ' ', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 1, intArray11);
        java.lang.String str16 = lFSR15.toString();
        boolean boolean17 = lFSR15.clock();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        java.lang.String str13 = lFSR9.toString();
        boolean boolean14 = lFSR9.getLastBit();
        boolean boolean15 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 0, intArray17);
        boolean boolean26 = lFSR24.get(22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = lFSR24.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
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
        boolean boolean19 = lFSR6.get((int) (short) 1);
        boolean boolean20 = lFSR6.getClockBit();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) '#', intArray13);
        boolean boolean19 = lFSR18.clock();
        boolean boolean20 = lFSR18.clock();
        boolean boolean21 = lFSR18.clock();
        boolean boolean22 = lFSR18.getClockBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
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
        boolean boolean20 = lFSR9.getLastBit();
        boolean boolean21 = lFSR9.getClockBit();
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
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 0, intArray11);
        java.lang.String str16 = lFSR15.toString();
        boolean boolean17 = lFSR15.getClockBit();
        boolean boolean19 = lFSR15.get((int) (short) 10);
        boolean boolean20 = lFSR15.getLastBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) '#', intArray13);
        boolean boolean19 = lFSR18.clock();
        boolean boolean20 = lFSR18.clock();
        boolean boolean22 = lFSR18.get(100);
        java.lang.Class<?> wildcardClass23 = lFSR18.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (short) -1, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) -1, 0, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
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
            boolean boolean29 = lFSR21.getLastBit();
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
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) ' ', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) '4', intArray15);
        java.lang.Class<?> wildcardClass22 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
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
        boolean boolean37 = lFSR30.getLastBit();
        boolean boolean38 = lFSR30.getClockBit();
        boolean boolean39 = lFSR30.getClockBit();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "{}" + "'", str36, "{}");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.clock();
        java.lang.String str13 = lFSR6.toString();
        boolean boolean14 = lFSR6.getClockBit();
        java.lang.String str15 = lFSR6.toString();
        java.util.BitSet bitSet16 = null;
        java.util.BitSet bitSet17 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR6.initialize(bitSet16, bitSet17);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getLastBit();
        boolean boolean15 = lFSR12.get((int) ' ');
        java.lang.String str16 = lFSR12.toString();
        java.lang.String str17 = lFSR12.toString();
        java.lang.String str18 = lFSR12.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = lFSR12.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (byte) 10, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray17);
        boolean boolean25 = lFSR24.getClockBit();
        boolean boolean26 = lFSR24.getClockBit();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean8 = lFSR6.get((int) '4');
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean13 = lFSR6.get((int) (byte) 10);
        boolean boolean15 = lFSR6.get((int) 'a');
        boolean boolean16 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.get((int) (byte) 0);
        boolean boolean14 = lFSR6.clock();
        boolean boolean16 = lFSR6.get(1);
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
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray9);
        boolean boolean14 = lFSR12.get((int) ' ');
        boolean boolean15 = lFSR12.getClockBit();
        boolean boolean17 = lFSR12.get(100);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean15 = lFSR12.get((int) (byte) 10);
        java.lang.String str16 = lFSR12.toString();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) -1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean11 = lFSR6.clock();
        boolean boolean12 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getClockBit();
        boolean boolean10 = lFSR6.get((int) (short) 0);
        java.lang.String str11 = lFSR6.toString();
        boolean boolean12 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.getClockBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = lFSR6.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
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
        boolean boolean19 = lFSR9.getClockBit();
        java.lang.String str20 = lFSR9.toString();
        boolean boolean21 = lFSR9.getClockBit();
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
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        int[] intArray7 = new int[] { (short) 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) -1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 10, intArray7);
        boolean boolean11 = lFSR10.getLastBit();
        java.util.BitSet bitSet12 = null;
        java.util.BitSet bitSet13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR10.initialize(bitSet12, bitSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean12 = lFSR6.clock();
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.clock();
        boolean boolean15 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray2);
        boolean boolean4 = lFSR3.getClockBit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        int[] intArray11 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        boolean boolean16 = lFSR15.clock();
        boolean boolean17 = lFSR15.clock();
        boolean boolean18 = lFSR15.getClockBit();
        boolean boolean19 = lFSR15.getLastBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 52, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) '#', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
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
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }
}

