package a5;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 1, intArray19);
        java.lang.Class<?> wildcardClass28 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        java.lang.String str18 = lFSR6.toString();
        java.lang.String str19 = lFSR6.toString();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        int[] intArray11 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) ' ', intArray11);
        boolean boolean16 = lFSR15.getLastBit();
        java.lang.Class<?> wildcardClass17 = lFSR15.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 0, intArray11);
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
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) ' ', intArray9);
        boolean boolean13 = lFSR12.clock();
        boolean boolean14 = lFSR12.getClockBit();
        boolean boolean15 = lFSR12.clock();
        boolean boolean16 = lFSR12.clock();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.clock();
        boolean boolean14 = lFSR9.get((int) '#');
        boolean boolean15 = lFSR9.clock();
        java.lang.Class<?> wildcardClass16 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) ' ', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (byte) 1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        boolean boolean22 = lFSR9.getClockBit();
        java.lang.Class<?> wildcardClass23 = lFSR9.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        java.lang.String str20 = lFSR9.toString();
        java.util.BitSet bitSet21 = null;
        java.util.BitSet bitSet22 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR9.initialize(bitSet21, bitSet22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean13 = lFSR9.get((int) '4');
        boolean boolean14 = lFSR9.getLastBit();
        boolean boolean16 = lFSR9.get((int) '#');
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        boolean boolean43 = lFSR33.get(10);
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
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '4', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = lFSR27.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(10, 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(1, 10, intArray15);
        java.lang.Class<?> wildcardClass22 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray11);
        boolean boolean16 = lFSR15.getLastBit();
        boolean boolean17 = lFSR15.getClockBit();
        boolean boolean18 = lFSR15.getLastBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        java.lang.String str17 = lFSR6.toString();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        int[] intArray7 = new int[] { 10, 22, 10 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray7);
        boolean boolean11 = lFSR9.get((int) 'a');
        java.lang.String str12 = lFSR9.toString();
        boolean boolean13 = lFSR9.getClockBit();
        boolean boolean14 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 22, 10]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray17);
        boolean boolean26 = lFSR24.get((int) (short) 1);
        java.lang.String str27 = lFSR24.toString();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{}" + "'", str27, "{}");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        java.lang.Class<?> wildcardClass21 = lFSR6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        int[] intArray7 = new int[] { (short) 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) -1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 10, intArray7);
        boolean boolean12 = lFSR10.get(100);
        java.lang.String str13 = lFSR10.toString();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        int[] intArray11 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (short) 10, intArray11);
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
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        boolean boolean21 = lFSR9.get((int) (short) 100);
        boolean boolean23 = lFSR9.get(10);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        java.lang.String str34 = lFSR30.toString();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        java.lang.String str17 = lFSR15.toString();
        boolean boolean18 = lFSR15.getClockBit();
        java.lang.Class<?> wildcardClass19 = lFSR15.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        int[] intArray11 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 100, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 52, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = lFSR6.get((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) -1, intArray2);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.clock();
        boolean boolean13 = lFSR9.getClockBit();
        java.lang.String str14 = lFSR9.toString();
        java.lang.Class<?> wildcardClass15 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        boolean boolean20 = lFSR6.clock();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        java.lang.Class<?> wildcardClass19 = lFSR6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 22, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 1, intArray17);
        boolean boolean25 = lFSR24.getLastBit();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        boolean boolean16 = lFSR6.clock();
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
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (short) 10, intArray19);
        boolean boolean29 = lFSR27.get((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        java.lang.String str17 = lFSR6.toString();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean14 = lFSR12.getLastBit();
        boolean boolean16 = lFSR12.get((int) 'a');
        boolean boolean17 = lFSR12.getClockBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        int[] intArray9 = new int[] { 10, 22, 10 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, 1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 22, 10]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean12 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(1, 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(100, 64, intArray15);
        boolean boolean22 = lFSR21.clock();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.get((int) 'a');
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        java.lang.Class<?> wildcardClass12 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean8 = lFSR6.get((int) '4');
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean13 = lFSR6.get(100);
        boolean boolean15 = lFSR6.get((int) (short) 10);
        boolean boolean16 = lFSR6.getClockBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = lFSR6.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 64, intArray15);
        boolean boolean23 = lFSR21.get(10);
        boolean boolean25 = lFSR21.get(10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(0);
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.getClockBit();
        boolean boolean16 = lFSR6.getLastBit();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 0, intArray17);
        boolean boolean25 = lFSR24.getClockBit();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) -1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (byte) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 10, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) 10, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 10, intArray11);
        boolean boolean17 = lFSR15.get(10);
        java.lang.String str18 = lFSR15.toString();
        boolean boolean19 = lFSR15.getClockBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 100, intArray11);
        boolean boolean16 = lFSR15.clock();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.clock();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean11 = lFSR6.get(22);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        java.lang.Class<?> wildcardClass31 = lFSR30.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 100, intArray13);
        boolean boolean19 = lFSR18.clock();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean13 = lFSR9.clock();
        boolean boolean14 = lFSR9.clock();
        boolean boolean15 = lFSR9.getLastBit();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.clock();
        java.lang.String str8 = lFSR6.toString();
        java.lang.String str9 = lFSR6.toString();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get((int) (byte) 100);
        boolean boolean14 = lFSR6.get((int) (short) 10);
        java.lang.String str15 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 10, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 64, intArray17);
        boolean boolean26 = lFSR24.get((int) '4');
        boolean boolean27 = lFSR24.clock();
        boolean boolean28 = lFSR24.getClockBit();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.getLastBit();
        java.lang.String str13 = lFSR6.toString();
        boolean boolean14 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        boolean boolean37 = lFSR36.getClockBit();
        boolean boolean39 = lFSR36.get(10);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray11);
        boolean boolean16 = lFSR15.clock();
        boolean boolean17 = lFSR15.getLastBit();
        boolean boolean18 = lFSR15.clock();
        java.lang.Class<?> wildcardClass19 = lFSR15.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (byte) -1, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.get((int) (short) 100);
        boolean boolean11 = lFSR6.get((int) ' ');
        boolean boolean13 = lFSR6.get((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = lFSR6.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 22, intArray2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = lFSR3.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"<local2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        java.lang.String str19 = lFSR6.toString();
        boolean boolean21 = lFSR6.get(64);
        boolean boolean22 = lFSR6.getLastBit();
        java.lang.Class<?> wildcardClass23 = lFSR6.getClass();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        int[] intArray7 = new int[] { (short) 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) -1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 10, intArray7);
        boolean boolean12 = lFSR10.get(100);
        boolean boolean14 = lFSR10.get((int) '4');
        java.lang.String str15 = lFSR10.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = lFSR10.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 10, intArray17);
        java.lang.Class<?> wildcardClass25 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 100, intArray13);
        boolean boolean20 = lFSR18.get((int) '#');
        boolean boolean21 = lFSR18.clock();
        boolean boolean22 = lFSR18.getClockBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get(10);
        java.lang.String str13 = lFSR6.toString();
        boolean boolean14 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 22, intArray2);
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
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.get(22);
        java.lang.String str13 = lFSR6.toString();
        boolean boolean14 = lFSR6.clock();
        boolean boolean16 = lFSR6.get(1);
        boolean boolean17 = lFSR6.getLastBit();
        java.lang.Class<?> wildcardClass18 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        java.lang.String str10 = lFSR9.toString();
        boolean boolean11 = lFSR9.clock();
        boolean boolean12 = lFSR9.getLastBit();
        java.lang.Class<?> wildcardClass13 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean12 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.get(1);
        boolean boolean16 = lFSR6.get(22);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        boolean boolean17 = lFSR15.clock();
        boolean boolean18 = lFSR15.clock();
        boolean boolean19 = lFSR15.getClockBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        int[] intArray13 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 10, intArray13);
        boolean boolean19 = lFSR18.clock();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        boolean boolean18 = lFSR6.clock();
        boolean boolean20 = lFSR6.get(64);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray15);
        java.lang.Class<?> wildcardClass22 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray13);
        java.lang.Class<?> wildcardClass19 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(0, 64, intArray11);
        boolean boolean17 = lFSR15.get((int) (byte) 1);
        java.lang.String str18 = lFSR15.toString();
        boolean boolean19 = lFSR15.getClockBit();
        boolean boolean21 = lFSR15.get((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        int[] intArray11 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 0, intArray11);
        java.lang.Class<?> wildcardClass16 = lFSR15.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 52, 1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.clock();
        boolean boolean14 = lFSR9.get((int) '#');
        java.lang.String str15 = lFSR9.toString();
        boolean boolean17 = lFSR9.get((int) 'a');
        java.lang.Class<?> wildcardClass18 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) '#');
        boolean boolean15 = lFSR9.getLastBit();
        boolean boolean16 = lFSR9.getClockBit();
        boolean boolean17 = lFSR9.getClockBit();
        boolean boolean18 = lFSR9.getClockBit();
        java.lang.Class<?> wildcardClass19 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) '4', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) '4', intArray19);
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
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) ' ', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 1, intArray11);
        java.lang.String str16 = lFSR15.toString();
        java.lang.Class<?> wildcardClass17 = lFSR15.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
        java.lang.String str31 = lFSR30.toString();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "{}" + "'", str31, "{}");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.getLastBit();
        java.lang.String str13 = lFSR6.toString();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR(64, 100, intArray2);
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
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        boolean boolean12 = lFSR9.clock();
        java.lang.String str13 = lFSR9.toString();
        java.lang.String str14 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.getLastBit();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 64, intArray15);
        boolean boolean23 = lFSR21.get(10);
        java.lang.String str24 = lFSR21.toString();
        boolean boolean25 = lFSR21.getLastBit();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{}" + "'", str24, "{}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray13);
        java.lang.String str19 = lFSR18.toString();
        java.lang.String str20 = lFSR18.toString();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) 'a', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, 0, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean14 = lFSR12.getLastBit();
        java.lang.String str15 = lFSR12.toString();
        java.lang.String str16 = lFSR12.toString();
        boolean boolean17 = lFSR12.getLastBit();
        java.lang.String str18 = lFSR12.toString();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean8 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray17);
        java.lang.Class<?> wildcardClass25 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 10, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((-1), 0, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 100, intArray19);
        boolean boolean28 = lFSR27.clock();
        boolean boolean29 = lFSR27.getClockBit();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        java.lang.String str19 = lFSR6.toString();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.getLastBit();
        java.lang.String str12 = lFSR6.toString();
        boolean boolean13 = lFSR6.getClockBit();
        boolean boolean15 = lFSR6.get((int) '#');
        boolean boolean16 = lFSR6.clock();
        java.lang.Class<?> wildcardClass17 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        java.lang.String str30 = lFSR27.toString();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{}" + "'", str30, "{}");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        java.lang.Class<?> wildcardClass31 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(0);
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.getClockBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = lFSR6.get((-1));
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean12 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.getClockBit();
        boolean boolean14 = lFSR6.clock();
        boolean boolean15 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray17);
        java.lang.Class<?> wildcardClass25 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR(0, 100, intArray27);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = lFSR39.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        java.lang.String str10 = lFSR9.toString();
        boolean boolean11 = lFSR9.clock();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        boolean boolean38 = lFSR33.getClockBit();
        java.lang.String str39 = lFSR33.toString();
        java.lang.Class<?> wildcardClass40 = lFSR33.getClass();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "{}" + "'", str39, "{}");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) ' ', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 0, intArray13);
        boolean boolean20 = lFSR18.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        boolean boolean11 = lFSR9.get((int) (short) 1);
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.clock();
        boolean boolean15 = lFSR9.get((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        boolean boolean12 = lFSR9.clock();
        boolean boolean13 = lFSR9.clock();
        java.lang.String str14 = lFSR9.toString();
        java.lang.String str15 = lFSR9.toString();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        java.lang.Class<?> wildcardClass17 = lFSR6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.get(22);
        java.lang.String str13 = lFSR6.toString();
        boolean boolean15 = lFSR6.get((int) (short) 100);
        boolean boolean16 = lFSR6.getLastBit();
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
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.get(22);
        boolean boolean16 = lFSR6.get((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.get((int) (byte) 10);
        boolean boolean15 = lFSR9.get(100);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
        java.lang.String str18 = lFSR6.toString();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.getLastBit();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean10 = lFSR6.get((int) '4');
        boolean boolean11 = lFSR6.clock();
        boolean boolean12 = lFSR6.clock();
        java.lang.Class<?> wildcardClass13 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        int[] intArray9 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 100, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) -1, (int) (short) 1, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[22, 10, 100]");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 22, intArray11);
        java.lang.String str16 = lFSR15.toString();
        java.lang.Class<?> wildcardClass17 = lFSR15.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean13 = lFSR9.getLastBit();
        boolean boolean14 = lFSR9.getLastBit();
        java.lang.Class<?> wildcardClass15 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        java.lang.String str19 = lFSR6.toString();
        boolean boolean20 = lFSR6.getClockBit();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray11);
        boolean boolean17 = lFSR15.get((int) (byte) 10);
        boolean boolean18 = lFSR15.getLastBit();
        boolean boolean20 = lFSR15.get((int) (short) 0);
        java.lang.Class<?> wildcardClass21 = lFSR15.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        int[] intArray9 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) 1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 52, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        boolean boolean12 = lFSR9.getClockBit();
        boolean boolean13 = lFSR9.getLastBit();
        boolean boolean15 = lFSR9.get(0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get((int) (byte) 1);
        java.lang.String str13 = lFSR6.toString();
        java.lang.String str14 = lFSR6.toString();
        java.lang.String str15 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean13 = lFSR9.get(100);
        boolean boolean14 = lFSR9.clock();
        boolean boolean15 = lFSR9.clock();
        boolean boolean16 = lFSR9.clock();
        boolean boolean17 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        int[] intArray5 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.clock();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = lFSR6.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 52, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray15);
        java.lang.String str22 = lFSR21.toString();
        boolean boolean24 = lFSR21.get((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = lFSR21.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '4', intArray17);
        boolean boolean25 = lFSR24.getClockBit();
        java.lang.Class<?> wildcardClass26 = lFSR24.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get((int) (byte) 1);
        boolean boolean13 = lFSR6.getClockBit();
        java.lang.String str14 = lFSR6.toString();
        boolean boolean16 = lFSR6.get((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(10, 1, intArray19);
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
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.get(22);
        boolean boolean16 = lFSR6.get((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 22, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray17);
        boolean boolean26 = lFSR24.get((int) '#');
        java.lang.String str27 = lFSR24.toString();
        boolean boolean29 = lFSR24.get((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{}" + "'", str27, "{}");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) '#', intArray13);
        boolean boolean19 = lFSR18.clock();
        boolean boolean20 = lFSR18.clock();
        boolean boolean21 = lFSR18.getClockBit();
        boolean boolean22 = lFSR18.getClockBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = lFSR18.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (short) -1, intArray13);
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
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) ' ', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 1, intArray11);
        java.lang.String str16 = lFSR15.toString();
        boolean boolean17 = lFSR15.getLastBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) ' ', intArray9);
        java.lang.Class<?> wildcardClass13 = lFSR12.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (short) -1, intArray25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = lFSR36.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (short) -1, intArray17);
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
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) -1, intArray19);
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
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray2);
        boolean boolean4 = lFSR3.getClockBit();
        java.util.BitSet bitSet5 = null;
        java.util.BitSet bitSet6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR3.initialize(bitSet5, bitSet6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) ' ');
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(1);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 10, intArray13);
        java.lang.String str19 = lFSR18.toString();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.get((int) (short) 100);
        java.lang.String str10 = lFSR6.toString();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean13 = lFSR6.get((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = lFSR6.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getClockBit();
        boolean boolean11 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.get((int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR40 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) '4', intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR41 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 10, intArray29);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR42 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) -1, (int) 'a', intArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 1, 1]");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        boolean boolean16 = lFSR6.get((int) (short) 0);
        boolean boolean17 = lFSR6.getLastBit();
        java.lang.String str18 = lFSR6.toString();
        java.lang.Class<?> wildcardClass19 = lFSR6.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.clock();
        java.lang.String str8 = lFSR6.toString();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.get((int) (short) 10);
        boolean boolean14 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(1, 10, intArray13);
        java.lang.Class<?> wildcardClass19 = lFSR18.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) (short) 0);
        boolean boolean10 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        int[] intArray3 = new int[] { (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR4 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) 100, intArray3);
        boolean boolean5 = lFSR4.getLastBit();
        boolean boolean6 = lFSR4.getLastBit();
        java.util.BitSet bitSet7 = null;
        java.util.BitSet bitSet8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR4.initialize(bitSet7, bitSet8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean13 = lFSR9.getLastBit();
        java.lang.String str14 = lFSR9.toString();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = lFSR24.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.clock();
        java.lang.String str8 = lFSR6.toString();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean11 = lFSR6.get((int) (short) 1);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.clock();
        boolean boolean11 = lFSR9.getClockBit();
        boolean boolean13 = lFSR9.get((int) '#');
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        boolean boolean21 = lFSR6.clock();
        java.lang.String str22 = lFSR6.toString();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean5 = lFSR3.get((int) (byte) 100);
        java.util.BitSet bitSet6 = null;
        java.util.BitSet bitSet7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR3.initialize(bitSet6, bitSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray13);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) -1, 1, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean11 = lFSR6.get((int) ' ');
        boolean boolean13 = lFSR6.get(100);
        boolean boolean14 = lFSR6.getClockBit();
        boolean boolean15 = lFSR6.getClockBit();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean13 = lFSR9.get((int) (short) 0);
        boolean boolean14 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        boolean boolean10 = lFSR9.clock();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        java.lang.Class<?> wildcardClass13 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        int[] intArray9 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 1, intArray9);
        boolean boolean13 = lFSR12.getLastBit();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 64, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) '4', intArray15);
        boolean boolean22 = lFSR21.getLastBit();
        java.lang.Class<?> wildcardClass23 = lFSR21.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) ' ', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) -1, intArray17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = lFSR24.getClockBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        int[] intArray7 = new int[] { (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) 100, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 100, intArray7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) 'a', intArray21);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) -1, 10, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        int[] intArray13 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 10, intArray13);
        boolean boolean19 = lFSR18.clock();
        boolean boolean21 = lFSR18.get((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) '4');
        boolean boolean10 = lFSR6.getClockBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = lFSR6.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        int[] intArray7 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        boolean boolean12 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, 52, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        boolean boolean12 = lFSR9.clock();
        boolean boolean14 = lFSR9.get((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        int[] intArray11 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (short) 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) '4', intArray11);
        java.lang.Class<?> wildcardClass16 = lFSR15.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        boolean boolean18 = lFSR6.get(0);
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
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean4 = lFSR3.getClockBit();
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
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        java.lang.String str8 = lFSR6.toString();
        java.lang.String str9 = lFSR6.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = lFSR6.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(0);
        boolean boolean13 = lFSR6.clock();
        java.lang.Class<?> wildcardClass14 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
        boolean boolean33 = lFSR27.getClockBit();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean8 = lFSR6.getClockBit();
        java.util.BitSet bitSet9 = null;
        java.util.BitSet bitSet10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR6.initialize(bitSet9, bitSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.get(1);
        boolean boolean14 = lFSR9.get((int) (byte) 10);
        boolean boolean15 = lFSR9.getClockBit();
        boolean boolean16 = lFSR9.getClockBit();
        boolean boolean17 = lFSR9.clock();
        boolean boolean18 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.clock();
        boolean boolean14 = lFSR9.get((int) '4');
        boolean boolean16 = lFSR9.get((int) (short) 1);
        boolean boolean17 = lFSR9.getLastBit();
        boolean boolean19 = lFSR9.get((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.get(22);
        boolean boolean15 = lFSR6.get((int) (byte) 0);
        java.lang.String str16 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean13 = lFSR9.get((int) (short) 0);
        boolean boolean15 = lFSR9.get((int) '4');
        java.lang.Class<?> wildcardClass16 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        boolean boolean12 = lFSR9.getLastBit();
        java.lang.String str13 = lFSR9.toString();
        boolean boolean14 = lFSR9.clock();
        java.lang.String str15 = lFSR9.toString();
        java.lang.Class<?> wildcardClass16 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
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
        boolean boolean19 = lFSR12.clock();
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
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        boolean boolean38 = lFSR33.getClockBit();
        java.lang.String str39 = lFSR33.toString();
        java.lang.String str40 = lFSR33.toString();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "{}" + "'", str39, "{}");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "{}" + "'", str40, "{}");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(0, 64, intArray11);
        boolean boolean17 = lFSR15.get((int) (byte) 1);
        java.lang.String str18 = lFSR15.toString();
        boolean boolean19 = lFSR15.getClockBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = lFSR15.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) ' ');
        boolean boolean10 = lFSR6.getLastBit();
        java.lang.String str11 = lFSR6.toString();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get(10);
        java.lang.String str13 = lFSR6.toString();
        java.lang.String str14 = lFSR6.toString();
        boolean boolean15 = lFSR6.getLastBit();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        java.lang.String str10 = lFSR6.toString();
        java.lang.Class<?> wildcardClass11 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR(22, 10, intArray2);
        boolean boolean5 = lFSR3.get(0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        int[] intArray5 = new int[] { (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) 100, intArray5);
        com.thealgorithms.ciphers.a5.LFSR lFSR7 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 10, intArray5);
        boolean boolean8 = lFSR7.getLastBit();
        boolean boolean9 = lFSR7.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.get((int) (byte) 10);
        boolean boolean14 = lFSR9.clock();
        boolean boolean15 = lFSR9.getClockBit();
        boolean boolean16 = lFSR9.clock();
        boolean boolean18 = lFSR9.get(10);
        java.lang.Class<?> wildcardClass19 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        boolean boolean18 = lFSR6.clock();
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
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) '4', intArray9);
        boolean boolean13 = lFSR12.getLastBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(1, 10, intArray13);
        boolean boolean19 = lFSR18.getLastBit();
        boolean boolean20 = lFSR18.clock();
        boolean boolean21 = lFSR18.getClockBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (short) -1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = lFSR18.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        int[] intArray5 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.get(100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = lFSR6.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 52, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean4 = lFSR3.getLastBit();
        boolean boolean5 = lFSR3.getClockBit();
        java.lang.String str6 = lFSR3.toString();
        boolean boolean7 = lFSR3.getClockBit();
        java.lang.String str8 = lFSR3.toString();
        java.util.BitSet bitSet9 = null;
        java.util.BitSet bitSet10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR3.initialize(bitSet9, bitSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{}" + "'", str6, "{}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean14 = lFSR12.getClockBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = lFSR12.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(0);
        boolean boolean13 = lFSR6.getLastBit();
        java.lang.String str14 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray9);
        boolean boolean14 = lFSR12.get((int) ' ');
        java.lang.Class<?> wildcardClass15 = lFSR12.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get((int) (byte) 0);
        boolean boolean13 = lFSR6.clock();
        boolean boolean15 = lFSR6.get(100);
        java.lang.Class<?> wildcardClass16 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean14 = lFSR9.get(22);
        java.lang.Class<?> wildcardClass15 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) '#');
        boolean boolean15 = lFSR9.getLastBit();
        boolean boolean16 = lFSR9.getClockBit();
        boolean boolean17 = lFSR9.getClockBit();
        boolean boolean19 = lFSR9.get((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = lFSR9.get((-1));
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        boolean boolean39 = lFSR33.getClockBit();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        int[] intArray9 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 1, intArray9);
        boolean boolean13 = lFSR12.getLastBit();
        java.lang.String str14 = lFSR12.toString();
        boolean boolean15 = lFSR12.getClockBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) 'a', intArray13);
        java.lang.Class<?> wildcardClass19 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((-1), (int) (short) 100, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = lFSR21.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) 'a', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(10, 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray13);
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
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 64, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 10, intArray17);
        boolean boolean25 = lFSR24.getClockBit();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.clock();
        boolean boolean11 = lFSR9.getClockBit();
        boolean boolean13 = lFSR9.get((int) '#');
        java.lang.String str14 = lFSR9.toString();
        java.lang.String str15 = lFSR9.toString();
        boolean boolean16 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) -1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = lFSR12.getClockBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        java.lang.String str13 = lFSR9.toString();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 64, intArray17);
        java.lang.Class<?> wildcardClass25 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
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
        boolean boolean19 = lFSR9.get((int) '4');
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
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        int[] intArray9 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) 10, intArray9);
        java.lang.Class<?> wildcardClass13 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean8 = lFSR6.get((int) '4');
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
        java.lang.String str12 = lFSR6.toString();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray9);
        boolean boolean14 = lFSR12.get((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray13);
        boolean boolean20 = lFSR18.get((int) 'a');
        boolean boolean21 = lFSR18.getClockBit();
        boolean boolean22 = lFSR18.getClockBit();
        java.lang.String str23 = lFSR18.toString();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray15);
        boolean boolean23 = lFSR21.get((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) '#', intArray13);
        boolean boolean19 = lFSR18.clock();
        boolean boolean20 = lFSR18.clock();
        boolean boolean22 = lFSR18.get(100);
        boolean boolean23 = lFSR18.clock();
        boolean boolean24 = lFSR18.getLastBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        boolean boolean14 = lFSR12.clock();
        boolean boolean15 = lFSR12.getLastBit();
        boolean boolean16 = lFSR12.getLastBit();
        java.lang.String str17 = lFSR12.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = lFSR12.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray13);
        java.lang.String str19 = lFSR18.toString();
        java.lang.String str20 = lFSR18.toString();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) -1, intArray15);
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
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        boolean boolean14 = lFSR12.clock();
        boolean boolean15 = lFSR12.clock();
        java.lang.String str16 = lFSR12.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = lFSR12.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray11);
        boolean boolean17 = lFSR15.get((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
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
        java.lang.String str21 = lFSR9.toString();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean11 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR42 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) 'a', intArray29);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 1, 1]");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray13);
        boolean boolean19 = lFSR18.getClockBit();
        boolean boolean20 = lFSR18.getLastBit();
        boolean boolean21 = lFSR18.getClockBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) 'a', intArray9);
        boolean boolean14 = lFSR12.get((int) (byte) 10);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        java.lang.String str21 = lFSR6.toString();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) ' ', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 64, intArray11);
        java.lang.Class<?> wildcardClass16 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean14 = lFSR12.getLastBit();
        boolean boolean15 = lFSR12.clock();
        boolean boolean16 = lFSR12.getClockBit();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        int[] intArray5 = new int[] { (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) 100, intArray5);
        com.thealgorithms.ciphers.a5.LFSR lFSR7 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray5);
        boolean boolean8 = lFSR7.getClockBit();
        boolean boolean9 = lFSR7.clock();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = lFSR7.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        boolean boolean12 = lFSR9.getClockBit();
        boolean boolean13 = lFSR9.getLastBit();
        boolean boolean14 = lFSR9.clock();
        boolean boolean15 = lFSR9.getLastBit();
        boolean boolean16 = lFSR9.getLastBit();
        boolean boolean17 = lFSR9.getLastBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
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
        boolean boolean18 = lFSR6.get((int) (short) 1);
        boolean boolean19 = lFSR6.getClockBit();
        boolean boolean21 = lFSR6.get(0);
        boolean boolean23 = lFSR6.get(0);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        boolean boolean21 = lFSR9.getLastBit();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray13);
        java.lang.Class<?> wildcardClass19 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 10, intArray13);
        java.lang.Class<?> wildcardClass19 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        java.lang.String str8 = lFSR6.toString();
        java.lang.String str9 = lFSR6.toString();
        java.lang.String str10 = lFSR6.toString();
        java.lang.Class<?> wildcardClass11 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR(100, 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (-1), intArray25);
        java.lang.Class<?> wildcardClass37 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean4 = lFSR3.getLastBit();
        boolean boolean6 = lFSR3.get((int) '4');
        java.lang.String str7 = lFSR3.toString();
        boolean boolean8 = lFSR3.getClockBit();
        boolean boolean9 = lFSR3.getClockBit();
        java.lang.Class<?> wildcardClass10 = lFSR3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 0, intArray11);
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
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 22, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 1, intArray17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = lFSR24.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 0, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        boolean boolean17 = lFSR15.clock();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray11);
        java.lang.String str16 = lFSR15.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = lFSR15.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray11);
        java.lang.String str16 = lFSR15.toString();
        boolean boolean17 = lFSR15.clock();
        boolean boolean18 = lFSR15.getClockBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray9);
        java.lang.String str13 = lFSR12.toString();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR45 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 0, intArray31);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = lFSR45.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 1, 1]");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        boolean boolean24 = lFSR18.get((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) ' ', intArray9);
        boolean boolean13 = lFSR12.getLastBit();
        java.lang.String str14 = lFSR12.toString();
        boolean boolean15 = lFSR12.getLastBit();
        boolean boolean17 = lFSR12.get(22);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.get((int) (byte) 0);
        boolean boolean14 = lFSR6.getLastBit();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
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
        boolean boolean38 = lFSR33.getClockBit();
        boolean boolean40 = lFSR33.get((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        int[] intArray7 = new int[] { 10, 22, 10 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray7);
        java.lang.Class<?> wildcardClass10 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 22, 10]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray15);
        boolean boolean22 = lFSR21.getLastBit();
        boolean boolean23 = lFSR21.clock();
        boolean boolean24 = lFSR21.clock();
        java.lang.String str25 = lFSR21.toString();
        java.lang.Class<?> wildcardClass26 = lFSR21.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean8 = lFSR6.get(1);
        boolean boolean9 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        int[] intArray7 = new int[] { (short) 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) -1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 10, intArray7);
        boolean boolean12 = lFSR10.get(100);
        boolean boolean14 = lFSR10.get((int) '4');
        java.lang.String str15 = lFSR10.toString();
        boolean boolean16 = lFSR10.getClockBit();
        boolean boolean17 = lFSR10.getLastBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        int[] intArray13 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 100, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) -1, (int) (byte) 100, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 52, 1]");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.clock();
        java.lang.String str8 = lFSR6.toString();
        java.lang.String str9 = lFSR6.toString();
        java.lang.String str10 = lFSR6.toString();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        int[] intArray9 = new int[] { (short) 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) ' ', intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (byte) 100, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 100, intArray9);
        java.lang.Class<?> wildcardClass14 = lFSR13.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray13);
        java.lang.Class<?> wildcardClass19 = lFSR18.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        boolean boolean14 = lFSR12.getClockBit();
        boolean boolean15 = lFSR12.getClockBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        int[] intArray15 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (-1), intArray15);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[52, 52, 1]");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        java.lang.String str12 = lFSR9.toString();
        java.lang.String str13 = lFSR9.toString();
        boolean boolean14 = lFSR9.getLastBit();
        java.lang.String str15 = lFSR9.toString();
        boolean boolean16 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) 'a', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 0, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((-1), (int) (short) 10, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray11);
        boolean boolean16 = lFSR15.clock();
        boolean boolean17 = lFSR15.getClockBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray13);
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
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 22, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) ' ', intArray19);
        java.lang.Class<?> wildcardClass28 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
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
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.get((int) (short) 100);
        boolean boolean11 = lFSR6.get((int) ' ');
        java.lang.String str12 = lFSR6.toString();
        java.lang.String str13 = lFSR6.toString();
        boolean boolean15 = lFSR6.get((int) 'a');
        java.lang.String str16 = lFSR6.toString();
        java.lang.String str17 = lFSR6.toString();
        boolean boolean18 = lFSR6.getClockBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = lFSR6.clock();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get((int) (byte) 0);
        boolean boolean13 = lFSR6.getClockBit();
        boolean boolean14 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray11);
        boolean boolean16 = lFSR15.getLastBit();
        boolean boolean17 = lFSR15.getLastBit();
        java.lang.Class<?> wildcardClass18 = lFSR15.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
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
        boolean boolean17 = lFSR9.getLastBit();
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
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
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
        java.lang.String str19 = lFSR6.toString();
        boolean boolean20 = lFSR6.clock();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        boolean boolean21 = lFSR9.get((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) -1, intArray2);
        boolean boolean4 = lFSR3.getLastBit();
        java.lang.Class<?> wildcardClass5 = lFSR3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean13 = lFSR9.getClockBit();
        boolean boolean14 = lFSR9.clock();
        boolean boolean15 = lFSR9.getLastBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) 0, intArray15);
        java.lang.Class<?> wildcardClass22 = lFSR21.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.get((int) (short) 100);
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = lFSR6.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray15);
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
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 64, intArray2);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean14 = lFSR9.get((int) (byte) 10);
        boolean boolean15 = lFSR9.clock();
        boolean boolean17 = lFSR9.get(0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        int[] intArray13 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray13);
        java.lang.Class<?> wildcardClass19 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
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
        java.lang.String str18 = lFSR6.toString();
        boolean boolean19 = lFSR6.clock();
        boolean boolean21 = lFSR6.get((int) (short) 10);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        java.lang.String str10 = lFSR9.toString();
        boolean boolean11 = lFSR9.clock();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) (short) 0);
        boolean boolean15 = lFSR9.getClockBit();
        boolean boolean17 = lFSR9.get((int) (short) 100);
        boolean boolean18 = lFSR9.clock();
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
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
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
        java.lang.String str19 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.getLastBit();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean9 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.get(0);
        boolean boolean12 = lFSR6.clock();
        boolean boolean13 = lFSR6.clock();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray15);
        boolean boolean22 = lFSR21.clock();
        java.lang.Class<?> wildcardClass23 = lFSR21.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get(10);
        boolean boolean13 = lFSR6.getLastBit();
        java.lang.String str14 = lFSR6.toString();
        boolean boolean16 = lFSR6.get((int) ' ');
        java.lang.Class<?> wildcardClass17 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
        boolean boolean18 = lFSR6.get((int) (short) 1);
        boolean boolean19 = lFSR6.getClockBit();
        boolean boolean21 = lFSR6.get(0);
        boolean boolean23 = lFSR6.get(0);
        java.lang.Class<?> wildcardClass24 = lFSR6.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.clock();
        boolean boolean11 = lFSR9.getClockBit();
        boolean boolean13 = lFSR9.get((int) '#');
        boolean boolean15 = lFSR9.get((int) ' ');
        boolean boolean16 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
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
        boolean boolean19 = lFSR9.clock();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        boolean boolean10 = lFSR9.clock();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getClockBit();
        java.lang.String str13 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray17);
        java.lang.String str25 = lFSR24.toString();
        boolean boolean26 = lFSR24.getLastBit();
        boolean boolean27 = lFSR24.clock();
        java.lang.String str28 = lFSR24.toString();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{}" + "'", str28, "{}");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        java.lang.Class<?> wildcardClass18 = lFSR6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getClockBit();
        boolean boolean12 = lFSR9.get(100);
        java.lang.Class<?> wildcardClass13 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) '#');
        boolean boolean15 = lFSR9.getClockBit();
        boolean boolean17 = lFSR9.get((int) (byte) 10);
        boolean boolean18 = lFSR9.getClockBit();
        java.lang.String str19 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        int[] intArray5 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.getLastBit();
        boolean boolean10 = lFSR6.getLastBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = lFSR6.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 52, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.get((int) (byte) 10);
        boolean boolean14 = lFSR9.clock();
        boolean boolean15 = lFSR9.getClockBit();
        boolean boolean16 = lFSR9.clock();
        boolean boolean17 = lFSR9.clock();
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
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = lFSR9.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean14 = lFSR12.getLastBit();
        boolean boolean15 = lFSR12.clock();
        java.lang.String str16 = lFSR12.toString();
        boolean boolean17 = lFSR12.clock();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean8 = lFSR6.get((int) '4');
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean13 = lFSR6.get(100);
        boolean boolean15 = lFSR6.get((int) (short) 10);
        boolean boolean16 = lFSR6.getClockBit();
        boolean boolean18 = lFSR6.get((int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.getLastBit();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean9 = lFSR6.getLastBit();
        boolean boolean10 = lFSR6.getLastBit();
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
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray15);
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
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
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
        java.lang.String str39 = lFSR33.toString();
        java.util.BitSet bitSet40 = null;
        java.util.BitSet bitSet41 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR33.initialize(bitSet40, bitSet41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "{}" + "'", str39, "{}");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) ' ', intArray9);
        boolean boolean13 = lFSR12.clock();
        java.lang.String str14 = lFSR12.toString();
        boolean boolean15 = lFSR12.getClockBit();
        boolean boolean16 = lFSR12.getLastBit();
        boolean boolean18 = lFSR12.get((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        int[] intArray7 = new int[] { (short) 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) -1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 10, intArray7);
        java.lang.Class<?> wildcardClass11 = lFSR10.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) ' ', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 1, intArray11);
        java.lang.String str16 = lFSR15.toString();
        java.lang.String str17 = lFSR15.toString();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
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
        java.lang.String str33 = lFSR30.toString();
        java.lang.Class<?> wildcardClass34 = lFSR30.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "{}" + "'", str33, "{}");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.clock();
        java.lang.String str13 = lFSR6.toString();
        java.lang.Class<?> wildcardClass14 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 22, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 10, intArray15);
        java.lang.Class<?> wildcardClass22 = lFSR21.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        int[] intArray5 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean8 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[22, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean11 = lFSR6.clock();
        boolean boolean12 = lFSR6.getLastBit();
        java.lang.String str13 = lFSR6.toString();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean8 = lFSR6.get((int) '4');
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean13 = lFSR6.get((int) (byte) 10);
        java.lang.String str14 = lFSR6.toString();
        java.lang.String str15 = lFSR6.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = lFSR6.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getClockBit();
        java.lang.Class<?> wildcardClass15 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) '#');
        boolean boolean15 = lFSR9.getLastBit();
        java.lang.String str16 = lFSR9.toString();
        java.lang.String str17 = lFSR9.toString();
        java.lang.String str18 = lFSR9.toString();
        boolean boolean19 = lFSR9.clock();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
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
        boolean boolean17 = lFSR6.getLastBit();
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
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray17);
        boolean boolean25 = lFSR24.clock();
        boolean boolean26 = lFSR24.getLastBit();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean4 = lFSR3.getClockBit();
        boolean boolean5 = lFSR3.getLastBit();
        boolean boolean7 = lFSR3.get((int) (short) 0);
        java.util.BitSet bitSet8 = null;
        java.util.BitSet bitSet9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR3.initialize(bitSet8, bitSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean11 = lFSR6.clock();
        boolean boolean12 = lFSR6.getClockBit();
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
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        int[] intArray9 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) ' ', intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(22, 0, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[22, 10, 100]");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean11 = lFSR6.get((int) ' ');
        boolean boolean12 = lFSR6.clock();
        boolean boolean14 = lFSR6.get(22);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        boolean boolean10 = lFSR9.clock();
        boolean boolean11 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.clock();
        boolean boolean14 = lFSR9.get((int) '#');
        boolean boolean15 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean11 = lFSR6.get(64);
        boolean boolean12 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.getClockBit();
        boolean boolean14 = lFSR6.getLastBit();
        java.lang.Class<?> wildcardClass15 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
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
        java.lang.Class<?> wildcardClass31 = lFSR30.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        int[] intArray7 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 100, intArray7);
        boolean boolean10 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[22, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (-1), intArray15);
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
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean13 = lFSR9.get(100);
        boolean boolean14 = lFSR9.clock();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.clock();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean10 = lFSR6.get((int) (short) 100);
        java.lang.Class<?> wildcardClass11 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray17);
        java.lang.String str25 = lFSR24.toString();
        boolean boolean26 = lFSR24.getLastBit();
        boolean boolean27 = lFSR24.clock();
        boolean boolean28 = lFSR24.clock();
        boolean boolean29 = lFSR24.getLastBit();
        java.lang.String str30 = lFSR24.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = lFSR24.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{}" + "'", str30, "{}");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
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
        boolean boolean38 = lFSR33.clock();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "{}" + "'", str37, "{}");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray9);
        boolean boolean14 = lFSR12.get(64);
        boolean boolean15 = lFSR12.getClockBit();
        java.lang.String str16 = lFSR12.toString();
        boolean boolean17 = lFSR12.getLastBit();
        boolean boolean18 = lFSR12.clock();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray11);
        java.lang.String str16 = lFSR15.toString();
        boolean boolean18 = lFSR15.get((int) (short) 0);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.get((int) (short) 100);
        boolean boolean11 = lFSR6.get((int) ' ');
        java.lang.String str12 = lFSR6.toString();
        java.lang.String str13 = lFSR6.toString();
        boolean boolean15 = lFSR6.get((int) 'a');
        boolean boolean17 = lFSR6.get(0);
        java.lang.Class<?> wildcardClass18 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (-1), intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean8 = lFSR6.get((int) '4');
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.get(64);
        boolean boolean14 = lFSR6.get((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        int[] intArray5 = new int[] { (short) 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray5);
        com.thealgorithms.ciphers.a5.LFSR lFSR7 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) ' ', intArray5);
        boolean boolean8 = lFSR7.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) '4', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) '4', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) -1, intArray19);
        boolean boolean28 = lFSR27.clock();
        java.lang.Class<?> wildcardClass29 = lFSR27.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
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
        boolean boolean18 = lFSR9.clock();
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
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) -1, intArray9);
        boolean boolean14 = lFSR12.get((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        int[] intArray5 = new int[] { (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) 100, intArray5);
        com.thealgorithms.ciphers.a5.LFSR lFSR7 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray5);
        boolean boolean8 = lFSR7.getClockBit();
        boolean boolean9 = lFSR7.clock();
        boolean boolean10 = lFSR7.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = lFSR21.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray13);
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
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        java.lang.String str17 = lFSR15.toString();
        boolean boolean19 = lFSR15.get((int) ' ');
        boolean boolean20 = lFSR15.getLastBit();
        java.util.BitSet bitSet21 = null;
        java.util.BitSet bitSet22 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR15.initialize(bitSet21, bitSet22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean9 = lFSR6.getClockBit();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.getClockBit();
        java.lang.String str13 = lFSR6.toString();
        boolean boolean15 = lFSR6.get(100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = lFSR6.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        int[] intArray11 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 0, intArray11);
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
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
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
        java.lang.String str16 = lFSR6.toString();
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
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean14 = lFSR12.clock();
        boolean boolean16 = lFSR12.get((int) '4');
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 64, intArray17);
        java.lang.Class<?> wildcardClass25 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        boolean boolean17 = lFSR15.getClockBit();
        boolean boolean18 = lFSR15.getLastBit();
        boolean boolean19 = lFSR15.getClockBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        int[] intArray11 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        boolean boolean17 = lFSR15.get((int) '#');
        boolean boolean18 = lFSR15.clock();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 52, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 0, intArray17);
        java.lang.Class<?> wildcardClass25 = lFSR24.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray15);
        boolean boolean23 = lFSR21.get(100);
        boolean boolean25 = lFSR21.get((int) (short) 0);
        boolean boolean27 = lFSR21.get((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = lFSR21.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray9);
        boolean boolean13 = lFSR12.getLastBit();
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
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        java.lang.String str11 = lFSR6.toString();
        java.lang.Class<?> wildcardClass12 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        int[] intArray9 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (short) -1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (byte) -1, intArray9);
        java.lang.Class<?> wildcardClass13 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[22, 10, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.get((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) '4', intArray27);
        java.lang.Class<?> wildcardClass40 = lFSR39.getClass();
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        int[] intArray11 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        boolean boolean16 = lFSR15.clock();
        boolean boolean17 = lFSR15.getLastBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 52, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean12 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        int[] intArray25 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) ' ', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) '4', intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 100, intArray25);
        boolean boolean37 = lFSR36.clock();
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 22, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) ' ', intArray17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = lFSR24.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (-1), intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.get((int) (short) 100);
        java.lang.String str10 = lFSR6.toString();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean12 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.getClockBit();
        java.lang.String str14 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        int[] intArray5 = new int[] { (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) 100, intArray5);
        com.thealgorithms.ciphers.a5.LFSR lFSR7 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 10, intArray5);
        boolean boolean8 = lFSR7.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.getLastBit();
        java.lang.String str13 = lFSR6.toString();
        java.lang.String str14 = lFSR6.toString();
        boolean boolean16 = lFSR6.get(100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
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
        java.lang.Class<?> wildcardClass28 = lFSR24.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        java.lang.String str14 = lFSR12.toString();
        boolean boolean15 = lFSR12.getLastBit();
        boolean boolean16 = lFSR12.getClockBit();
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
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) ' ');
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.get(64);
        boolean boolean13 = lFSR6.getLastBit();
        java.lang.Class<?> wildcardClass14 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.clock();
        boolean boolean13 = lFSR9.getLastBit();
        boolean boolean14 = lFSR9.getClockBit();
        boolean boolean15 = lFSR9.getLastBit();
        java.lang.Class<?> wildcardClass16 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 100, intArray13);
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
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray15);
        boolean boolean22 = lFSR21.getLastBit();
        boolean boolean23 = lFSR21.getClockBit();
        boolean boolean25 = lFSR21.get(10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = lFSR21.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get((int) (byte) 1);
        boolean boolean13 = lFSR6.getClockBit();
        java.lang.String str14 = lFSR6.toString();
        boolean boolean15 = lFSR6.clock();
        boolean boolean16 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) '#', intArray13);
        boolean boolean19 = lFSR18.clock();
        boolean boolean20 = lFSR18.clock();
        boolean boolean22 = lFSR18.get(100);
        boolean boolean23 = lFSR18.clock();
        java.lang.String str24 = lFSR18.toString();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{}" + "'", str24, "{}");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
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
        java.lang.Class<?> wildcardClass41 = lFSR33.getClass();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
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
        boolean boolean22 = lFSR9.clock();
        java.lang.Class<?> wildcardClass23 = lFSR9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray17);
        boolean boolean25 = lFSR24.getClockBit();
        java.lang.String str26 = lFSR24.toString();
        java.lang.Class<?> wildcardClass27 = lFSR24.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
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
        boolean boolean20 = lFSR6.getLastBit();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.get(1);
        boolean boolean14 = lFSR9.get((int) (byte) 10);
        boolean boolean15 = lFSR9.getClockBit();
        boolean boolean16 = lFSR9.clock();
        boolean boolean18 = lFSR9.get(64);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) 'a', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(10, 1, intArray11);
        boolean boolean17 = lFSR15.get((int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 100, intArray17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = lFSR24.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
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
        boolean boolean16 = lFSR6.clock();
        boolean boolean18 = lFSR6.get(0);
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
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, 100, intArray15);
        boolean boolean22 = lFSR21.clock();
        boolean boolean23 = lFSR21.getClockBit();
        java.lang.Class<?> wildcardClass24 = lFSR21.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getLastBit();
        java.lang.String str11 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray15);
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
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray13);
        boolean boolean19 = lFSR18.clock();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
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
        boolean boolean21 = lFSR6.getClockBit();
        java.lang.String str22 = lFSR6.toString();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) ' ', intArray9);
        boolean boolean13 = lFSR12.clock();
        java.lang.String str14 = lFSR12.toString();
        boolean boolean15 = lFSR12.clock();
        boolean boolean16 = lFSR12.getClockBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (byte) 1, intArray27);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 1, intArray27);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.getLastBit();
        boolean boolean13 = lFSR6.getClockBit();
        boolean boolean14 = lFSR6.clock();
        boolean boolean15 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) 'a', intArray9);
        java.lang.String str13 = lFSR12.toString();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 64, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 10, intArray17);
        boolean boolean26 = lFSR24.get((int) (short) 0);
        java.lang.String str27 = lFSR24.toString();
        boolean boolean29 = lFSR24.get((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{}" + "'", str27, "{}");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
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
        java.lang.Class<?> wildcardClass34 = lFSR33.getClass();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 1, intArray17);
        java.lang.Class<?> wildcardClass25 = lFSR24.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = lFSR6.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 0, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        boolean boolean17 = lFSR15.getClockBit();
        boolean boolean18 = lFSR15.clock();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (short) 0, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        boolean boolean10 = lFSR9.clock();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getClockBit();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        int[] intArray9 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 100, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) -1, (int) (short) 100, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[22, 10, 100]");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
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
        boolean boolean35 = lFSR33.getLastBit();
        boolean boolean36 = lFSR33.getLastBit();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
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
        boolean boolean17 = lFSR6.getClockBit();
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
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        java.lang.String str10 = lFSR9.toString();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR40 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) '4', intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR41 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 10, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR42 = new com.thealgorithms.ciphers.a5.LFSR(0, 10, intArray29);
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
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(0, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, 64, intArray13);
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
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) ' ', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 0, intArray13);
        boolean boolean19 = lFSR18.clock();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        boolean boolean12 = lFSR9.getLastBit();
        java.lang.String str13 = lFSR9.toString();
        boolean boolean14 = lFSR9.getClockBit();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get((int) (byte) 1);
        java.lang.String str13 = lFSR6.toString();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.get((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = lFSR3.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"<local2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean5 = lFSR3.get(0);
        boolean boolean6 = lFSR3.getLastBit();
        java.lang.Class<?> wildcardClass7 = lFSR3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (short) 10, intArray13);
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
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = lFSR33.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (-1), intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, 100, intArray13);
        boolean boolean19 = lFSR18.getClockBit();
        boolean boolean20 = lFSR18.getClockBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) -1, intArray11);
        boolean boolean17 = lFSR15.get((int) (short) 100);
        boolean boolean18 = lFSR15.getLastBit();
        boolean boolean19 = lFSR15.getLastBit();
        boolean boolean21 = lFSR15.get(0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
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
        java.lang.String str27 = lFSR24.toString();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{}" + "'", str27, "{}");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        int[] intArray11 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, 64, intArray11);
        boolean boolean17 = lFSR15.get(0);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 52, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.get(1);
        java.lang.String str13 = lFSR9.toString();
        boolean boolean14 = lFSR9.getClockBit();
        boolean boolean15 = lFSR9.getLastBit();
        boolean boolean16 = lFSR9.getLastBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
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
        boolean boolean20 = lFSR6.get(0);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (byte) 100, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.clock();
        boolean boolean14 = lFSR9.get((int) '4');
        boolean boolean15 = lFSR9.getClockBit();
        boolean boolean16 = lFSR9.clock();
        boolean boolean17 = lFSR9.getClockBit();
        boolean boolean18 = lFSR9.getLastBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray11);
        boolean boolean16 = lFSR15.getLastBit();
        java.lang.String str17 = lFSR15.toString();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        int[] intArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) -1, (int) (short) 1, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean4 = lFSR3.getLastBit();
        boolean boolean6 = lFSR3.get((int) '4');
        java.lang.String str7 = lFSR3.toString();
        boolean boolean8 = lFSR3.getClockBit();
        boolean boolean10 = lFSR3.get((int) (short) 0);
        java.lang.String str11 = lFSR3.toString();
        java.lang.String str12 = lFSR3.toString();
        boolean boolean13 = lFSR3.getClockBit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean8 = lFSR6.get((int) '4');
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean12 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.clock();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) 'a', intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.getLastBit();
        boolean boolean13 = lFSR6.getLastBit();
        java.lang.String str14 = lFSR6.toString();
        boolean boolean16 = lFSR6.get((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.getLastBit();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean9 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.get((int) ' ');
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (-1), intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray11);
        boolean boolean16 = lFSR15.clock();
        boolean boolean17 = lFSR15.getLastBit();
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
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.clock();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean9 = lFSR6.getClockBit();
        boolean boolean10 = lFSR6.clock();
        java.lang.String str11 = lFSR6.toString();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(0);
        boolean boolean13 = lFSR6.clock();
        java.lang.String str14 = lFSR6.toString();
        boolean boolean15 = lFSR6.clock();
        java.lang.String str16 = lFSR6.toString();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        boolean boolean10 = lFSR6.getLastBit();
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
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        int[] intArray9 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 100, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 22, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) '4', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray23);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) -1, (int) (short) 0, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.clock();
        boolean boolean14 = lFSR6.get((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
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
        boolean boolean34 = lFSR30.getLastBit();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) 1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean14 = lFSR12.getLastBit();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.getClockBit();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        boolean boolean12 = lFSR9.getClockBit();
        boolean boolean13 = lFSR9.getLastBit();
        boolean boolean14 = lFSR9.clock();
        boolean boolean15 = lFSR9.getLastBit();
        boolean boolean16 = lFSR9.getLastBit();
        java.lang.Class<?> wildcardClass17 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        java.lang.String str12 = lFSR9.toString();
        java.lang.String str13 = lFSR9.toString();
        java.lang.String str14 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(0, 0, intArray11);
        boolean boolean17 = lFSR15.get((int) 'a');
        boolean boolean18 = lFSR15.getClockBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = lFSR15.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
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
        java.lang.Class<?> wildcardClass43 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
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
        java.lang.Class<?> wildcardClass17 = lFSR6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean8 = lFSR6.get((int) '4');
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean13 = lFSR6.get((int) (byte) 10);
        boolean boolean14 = lFSR6.getClockBit();
        boolean boolean15 = lFSR6.getClockBit();
        boolean boolean16 = lFSR6.getClockBit();
        java.lang.String str17 = lFSR6.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = lFSR6.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        boolean boolean23 = lFSR21.get((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
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
        java.lang.Class<?> wildcardClass21 = lFSR15.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
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
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 0, intArray2);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        boolean boolean12 = lFSR9.clock();
        boolean boolean13 = lFSR9.clock();
        java.lang.String str14 = lFSR9.toString();
        java.lang.String str15 = lFSR9.toString();
        java.lang.Class<?> wildcardClass16 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(0, 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (byte) 1, intArray13);
        java.lang.Class<?> wildcardClass19 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
        java.lang.Class<?> wildcardClass20 = lFSR9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = lFSR6.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
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
        boolean boolean19 = lFSR9.get((int) (short) 0);
        boolean boolean21 = lFSR9.get((int) (byte) 10);
        boolean boolean22 = lFSR9.clock();
        boolean boolean23 = lFSR9.clock();
        java.lang.String str24 = lFSR9.toString();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{}" + "'", str24, "{}");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray17);
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
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.clock();
        java.lang.String str14 = lFSR6.toString();
        java.lang.String str15 = lFSR6.toString();
        java.lang.String str16 = lFSR6.toString();
        boolean boolean17 = lFSR6.getClockBit();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean14 = lFSR9.get(22);
        boolean boolean15 = lFSR9.getClockBit();
        java.lang.String str16 = lFSR9.toString();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        int[] intArray13 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(1, (-1), intArray13);
        java.lang.String str19 = lFSR18.toString();
        boolean boolean21 = lFSR18.get((int) '4');
        java.lang.Class<?> wildcardClass22 = lFSR18.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
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
        boolean boolean19 = lFSR6.getLastBit();
        boolean boolean20 = lFSR6.clock();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean11 = lFSR6.get((int) ' ');
        java.lang.Class<?> wildcardClass12 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray17);
        java.lang.Class<?> wildcardClass25 = lFSR24.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean8 = lFSR6.get((int) '4');
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
        java.lang.String str12 = lFSR6.toString();
        boolean boolean14 = lFSR6.get(0);
        java.lang.String str15 = lFSR6.toString();
        java.lang.Class<?> wildcardClass16 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray17);
        java.lang.String str25 = lFSR24.toString();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = lFSR24.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.get((int) ' ');
        boolean boolean13 = lFSR9.getClockBit();
        boolean boolean14 = lFSR9.getClockBit();
        java.lang.String str15 = lFSR9.toString();
        boolean boolean17 = lFSR9.get((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        int[] intArray13 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(1, (-1), intArray13);
        java.lang.String str19 = lFSR18.toString();
        boolean boolean21 = lFSR18.get((int) '4');
        java.lang.String str22 = lFSR18.toString();
        java.util.BitSet bitSet23 = null;
        java.util.BitSet bitSet24 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR18.initialize(bitSet23, bitSet24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (short) 100, intArray15);
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
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 1, intArray11);
        java.lang.Class<?> wildcardClass16 = lFSR15.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) ' ', intArray9);
        boolean boolean13 = lFSR12.getLastBit();
        java.lang.String str14 = lFSR12.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = lFSR12.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) 0, intArray17);
        boolean boolean25 = lFSR24.getClockBit();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
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
        java.lang.String str33 = lFSR27.toString();
        java.util.BitSet bitSet34 = null;
        java.util.BitSet bitSet35 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR27.initialize(bitSet34, bitSet35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "{}" + "'", str33, "{}");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
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
        boolean boolean18 = lFSR6.clock();
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
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((-1), (int) (byte) -1, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray11);
        boolean boolean16 = lFSR15.clock();
        boolean boolean17 = lFSR15.clock();
        boolean boolean18 = lFSR15.getClockBit();
        boolean boolean19 = lFSR15.clock();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        int[] intArray9 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 100, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 0, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[22, 10, 100]");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        int[] intArray9 = new int[] { 10, 22, 10 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, 1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = lFSR12.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 22, 10]");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
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
        java.lang.String str21 = lFSR6.toString();
        boolean boolean22 = lFSR6.getClockBit();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
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
        boolean boolean18 = lFSR6.getClockBit();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 22, intArray13);
        java.lang.Class<?> wildcardClass19 = lFSR18.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean11 = lFSR6.get((int) ' ');
        boolean boolean13 = lFSR6.get(100);
        boolean boolean14 = lFSR6.getClockBit();
        java.lang.String str15 = lFSR6.toString();
        java.lang.String str16 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
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
        java.lang.String str24 = lFSR9.toString();
        java.lang.String str25 = lFSR9.toString();
        boolean boolean26 = lFSR9.clock();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{}" + "'", str24, "{}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR42 = new com.thealgorithms.ciphers.a5.LFSR((-1), 64, intArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 1, 1]");
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.clock();
        boolean boolean11 = lFSR9.getClockBit();
        boolean boolean13 = lFSR9.get(0);
        boolean boolean14 = lFSR9.getLastBit();
        java.lang.String str15 = lFSR9.toString();
        boolean boolean16 = lFSR9.clock();
        java.lang.Class<?> wildcardClass17 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
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
        boolean boolean42 = lFSR33.get(0);
        java.lang.Class<?> wildcardClass43 = lFSR33.getClass();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.clock();
        boolean boolean15 = lFSR12.get(1);
        boolean boolean17 = lFSR12.get((int) ' ');
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (byte) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 1, intArray19);
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
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        int[] intArray7 = new int[] { (short) 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) -1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 100, intArray7);
        boolean boolean11 = lFSR10.clock();
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
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
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
        boolean boolean22 = lFSR6.getLastBit();
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
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean4 = lFSR3.getLastBit();
        boolean boolean6 = lFSR3.get((int) '4');
        java.lang.String str7 = lFSR3.toString();
        boolean boolean8 = lFSR3.getClockBit();
        boolean boolean9 = lFSR3.getClockBit();
        boolean boolean10 = lFSR3.getClockBit();
        boolean boolean11 = lFSR3.getClockBit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 22, intArray15);
        java.lang.Class<?> wildcardClass22 = lFSR21.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        int[] intArray7 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 100, intArray7);
        java.lang.Class<?> wildcardClass10 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[22, 10, 100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
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
        java.lang.Class<?> wildcardClass16 = lFSR6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
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
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
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
        boolean boolean38 = lFSR33.getClockBit();
        java.lang.String str39 = lFSR33.toString();
        boolean boolean40 = lFSR33.getLastBit();
        boolean boolean41 = lFSR33.getClockBit();
        boolean boolean43 = lFSR33.get((int) '4');
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "{}" + "'", str39, "{}");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }
}

