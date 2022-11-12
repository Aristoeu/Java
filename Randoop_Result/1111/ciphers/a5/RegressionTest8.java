package ciphers.a5;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
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
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
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
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
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
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
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
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
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
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
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
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
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
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
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
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
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
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
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
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
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
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
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
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
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
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
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
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
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
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "{}" + "'", str29, "{}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{}" + "'", str30, "{}");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
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
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
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
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
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
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        int[] intArray9 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (short) -1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (short) 0, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[22, 10, 100]");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
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
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
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
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
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
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) '4', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) '4', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
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
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
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
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        int[] intArray11 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 64, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray11);
        boolean boolean17 = lFSR15.get(64);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
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
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
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
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
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
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
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
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
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
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
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
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
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
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
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
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
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
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
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
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
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
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.clock();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean9 = lFSR6.getClockBit();
        boolean boolean10 = lFSR6.clock();
        boolean boolean11 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
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
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
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
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
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
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
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
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
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
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
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
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
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
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 100, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 100, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '4', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 100, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(22, 100, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(0, (-1), intArray23);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
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
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (byte) 1, intArray2);
        boolean boolean5 = lFSR3.get((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
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
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) 'a', intArray15);
        java.lang.String str22 = lFSR21.toString();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
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
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
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
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
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
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
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
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
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
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
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
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
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
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
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
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
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
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
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
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
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
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
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
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
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
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
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
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
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
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
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
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
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
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
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
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
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
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
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
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
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
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
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
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
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
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
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
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
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
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
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
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
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
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
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
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
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
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
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
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
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
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
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
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
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
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
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
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        int[] intArray9 = new int[] { 10, 22, 10 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(1, 64, intArray9);
        java.lang.String str13 = lFSR12.toString();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 22, 10]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
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
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
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
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
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
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
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
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        int[] intArray11 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) ' ', intArray11);
        boolean boolean16 = lFSR15.getLastBit();
        boolean boolean17 = lFSR15.getClockBit();
        boolean boolean18 = lFSR15.getLastBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
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
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
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
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
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
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        int[] intArray7 = new int[] { (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) 100, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 22, intArray7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
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
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
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
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
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
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
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
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
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
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
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
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
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
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 100, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) '#', intArray27);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
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
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
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
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
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
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
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
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
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
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
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
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
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
        boolean boolean19 = lFSR6.get((int) (byte) 100);
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
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
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
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
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
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
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
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 64, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
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
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
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
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        int[] intArray7 = new int[] { 10, 22, 10 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, 64, intArray7);
        boolean boolean10 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 22, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
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
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
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
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
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
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
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
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
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
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
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
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(10, (-1), intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 1, intArray23);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) 0, intArray15);
        boolean boolean23 = lFSR21.get(64);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
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
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
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
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
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
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean15 = lFSR12.get(22);
        boolean boolean16 = lFSR12.clock();
        boolean boolean17 = lFSR12.clock();
        boolean boolean18 = lFSR12.getClockBit();
        boolean boolean20 = lFSR12.get(100);
        boolean boolean22 = lFSR12.get((int) 'a');
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
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
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
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
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
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
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
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
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
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
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
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
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
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
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 100, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
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
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
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
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
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
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
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
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
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
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
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
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
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
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
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
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
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
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
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
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
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
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
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
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
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
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
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
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
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
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
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
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        java.lang.String str13 = lFSR9.toString();
        boolean boolean15 = lFSR9.get(10);
        java.lang.String str16 = lFSR9.toString();
        boolean boolean17 = lFSR9.getLastBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
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
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
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
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
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
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
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
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
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
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
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
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
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
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
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
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
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
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
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
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
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
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
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
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
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
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
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
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
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
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
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
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
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
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
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
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
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
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
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
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
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
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 1, 1]");
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
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
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
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
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
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
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
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
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
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
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
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
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
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
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
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
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
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
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
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
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
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
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
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
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
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
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        int[] intArray12 = new int[] { 100, 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) 100, intArray12);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) '4', intArray12);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(0, 1, intArray12);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(10, 10, intArray12);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0]");
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
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
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
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
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
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
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
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
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
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
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
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
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
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
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
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
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
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
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
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
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
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
        boolean boolean18 = lFSR6.getClockBit();
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
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
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
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
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
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
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
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
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
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
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
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
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
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
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
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean4 = lFSR3.getLastBit();
        boolean boolean6 = lFSR3.get((int) '4');
        boolean boolean7 = lFSR3.getClockBit();
        boolean boolean8 = lFSR3.getClockBit();
        java.lang.String str9 = lFSR3.toString();
        java.lang.String str10 = lFSR3.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.clock();
        java.lang.String str8 = lFSR6.toString();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.get((int) (short) 10);
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.clock();
        boolean boolean16 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        int[] intArray11 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[22, 10, 100]");
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
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
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(1, 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) -1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
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
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
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
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
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
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        int[] intArray7 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 100, intArray7);
        java.lang.Class<?> wildcardClass10 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[22, 10, 100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
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
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        java.lang.String str10 = lFSR9.toString();
        boolean boolean11 = lFSR9.clock();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) (short) 0);
        boolean boolean15 = lFSR9.getClockBit();
        boolean boolean17 = lFSR9.get((int) (short) 1);
        boolean boolean18 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
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
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
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
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
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
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
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
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
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
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
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
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 0, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
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
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
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
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
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
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
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
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
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
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
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
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
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
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
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
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
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
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
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
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
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
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
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
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
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
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
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
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
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
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
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
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
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
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray2);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
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
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) -1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
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
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
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
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
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
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
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
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray17);
        java.lang.String str25 = lFSR24.toString();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
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
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        java.lang.String str10 = lFSR9.toString();
        boolean boolean11 = lFSR9.clock();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) (short) 0);
        boolean boolean15 = lFSR9.getClockBit();
        boolean boolean16 = lFSR9.clock();
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
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
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
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
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
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
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
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
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
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
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
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
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
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
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
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
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
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
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
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
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
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
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
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) '#');
        boolean boolean15 = lFSR9.getClockBit();
        java.lang.String str16 = lFSR9.toString();
        boolean boolean17 = lFSR9.getLastBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
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
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
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
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
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
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
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
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
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
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
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
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) 100, intArray2);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.clock();
        java.lang.String str8 = lFSR6.toString();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean11 = lFSR6.get((int) (short) 1);
        boolean boolean12 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.getClockBit();
        boolean boolean14 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
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
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray9);
        boolean boolean13 = lFSR12.clock();
        boolean boolean14 = lFSR12.getLastBit();
        java.lang.String str15 = lFSR12.toString();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
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
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
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
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(1, 64, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) '#', intArray11);
        java.lang.String str16 = lFSR15.toString();
        boolean boolean17 = lFSR15.clock();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
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
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
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
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
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
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
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
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
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
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.clock();
        boolean boolean19 = lFSR6.get((int) ' ');
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
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
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
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
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
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
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
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
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
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
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
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
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
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
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
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
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
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
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
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
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
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        int[] intArray25 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 10, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 22, intArray25);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
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
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
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
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
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
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
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
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
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
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
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
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
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
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
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
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 1, intArray27);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
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
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
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
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
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
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
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
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
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
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
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
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
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
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
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
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
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
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
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
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(0, 64, intArray7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
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
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean13 = lFSR9.get(100);
        boolean boolean14 = lFSR9.clock();
        boolean boolean15 = lFSR9.clock();
        boolean boolean17 = lFSR9.get((int) (byte) 100);
        boolean boolean19 = lFSR9.get((int) 'a');
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(1, 64, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 100, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
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
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
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
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
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
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
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
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
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
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR42 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 10, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR43 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) -1, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR44 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) 100, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR45 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 100, intArray31);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 1, 1]");
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
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
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
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
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
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
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
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
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
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
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
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
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
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
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
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
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
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
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
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
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
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
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
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
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
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
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
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
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
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
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
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
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(10, 10, intArray15);
        boolean boolean22 = lFSR21.getClockBit();
        java.lang.String str23 = lFSR21.toString();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
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
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
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
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
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
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
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
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
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
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
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
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
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
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
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
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 1, intArray2);
        boolean boolean4 = lFSR3.getClockBit();
        boolean boolean6 = lFSR3.get((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
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
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
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
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
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
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
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
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
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
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
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
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
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
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
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
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
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
}

