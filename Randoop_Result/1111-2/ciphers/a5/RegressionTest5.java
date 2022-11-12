package ciphers.a5;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(100, 64, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 100, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean8 = lFSR6.get((int) '4');
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
        java.lang.String str12 = lFSR6.toString();
        boolean boolean14 = lFSR6.get(0);
        boolean boolean16 = lFSR6.get((int) (byte) 0);
        boolean boolean18 = lFSR6.get(22);
        java.lang.Class<?> wildcardClass19 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
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
        java.lang.Class<?> wildcardClass17 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean9 = lFSR6.getClockBit();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.getClockBit();
        java.lang.String str13 = lFSR6.toString();
        boolean boolean15 = lFSR6.get((int) (short) 10);
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
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.get((int) (short) 100);
        boolean boolean11 = lFSR6.get((int) ' ');
        java.lang.String str12 = lFSR6.toString();
        java.lang.String str13 = lFSR6.toString();
        java.lang.String str14 = lFSR6.toString();
        boolean boolean16 = lFSR6.get(22);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) (short) 0);
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
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR(1, 0, intArray2);
        java.lang.String str4 = lFSR3.toString();
        boolean boolean6 = lFSR3.get(1);
        boolean boolean7 = lFSR3.getClockBit();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean4 = lFSR3.getClockBit();
        boolean boolean5 = lFSR3.getLastBit();
        boolean boolean7 = lFSR3.get((int) (short) 0);
        boolean boolean9 = lFSR3.get((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
        boolean boolean16 = lFSR6.getClockBit();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 22, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) '#', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (-1), intArray21);
        java.lang.Class<?> wildcardClass31 = lFSR30.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean4 = lFSR3.getClockBit();
        boolean boolean5 = lFSR3.getClockBit();
        boolean boolean6 = lFSR3.getLastBit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray13);
        boolean boolean19 = lFSR18.clock();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        int[] intArray7 = new int[] { 10, 22, 10 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray7);
        boolean boolean11 = lFSR9.get((int) 'a');
        boolean boolean13 = lFSR9.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 22, 10]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 64, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) '#', intArray17);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) -1, (int) (short) 1, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
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
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
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
        boolean boolean17 = lFSR6.getClockBit();
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
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.clock();
        boolean boolean14 = lFSR9.get((int) '4');
        boolean boolean16 = lFSR9.get((int) (short) 1);
        java.lang.String str17 = lFSR9.toString();
        boolean boolean18 = lFSR9.getClockBit();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        boolean boolean31 = lFSR30.clock();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) 0, intArray7);
        java.lang.String str10 = lFSR9.toString();
        boolean boolean11 = lFSR9.getClockBit();
        boolean boolean13 = lFSR9.get((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 64, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) '4', intArray15);
        boolean boolean22 = lFSR21.getLastBit();
        boolean boolean23 = lFSR21.getLastBit();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) '4', intArray15);
        boolean boolean22 = lFSR21.clock();
        boolean boolean23 = lFSR21.getClockBit();
        boolean boolean24 = lFSR21.getClockBit();
        boolean boolean25 = lFSR21.getClockBit();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean14 = lFSR9.get(22);
        boolean boolean15 = lFSR9.clock();
        boolean boolean17 = lFSR9.get((int) '4');
        boolean boolean18 = lFSR9.clock();
        boolean boolean20 = lFSR9.get((int) (short) 10);
        boolean boolean21 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
        boolean boolean20 = lFSR6.get((int) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
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
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        boolean boolean17 = lFSR15.clock();
        boolean boolean18 = lFSR15.clock();
        java.lang.String str19 = lFSR15.toString();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
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
        boolean boolean20 = lFSR9.getLastBit();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(1, 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (-1), intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) ' ', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 10, intArray19);
        java.lang.Class<?> wildcardClass28 = lFSR27.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        int[] intArray15 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(0, 0, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = lFSR21.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[52, 0, 100]");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        java.lang.String str28 = lFSR24.toString();
        boolean boolean29 = lFSR24.getLastBit();
        java.lang.String str30 = lFSR24.toString();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{}" + "'", str28, "{}");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{}" + "'", str30, "{}");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
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
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray15);
        boolean boolean23 = lFSR21.get(10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean12 = lFSR6.getClockBit();
        java.lang.Class<?> wildcardClass13 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(0, 64, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 10, intArray17);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((-1), (int) (byte) -1, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray13);
        boolean boolean19 = lFSR18.getClockBit();
        boolean boolean20 = lFSR18.getLastBit();
        boolean boolean21 = lFSR18.getLastBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(10, 10, intArray15);
        boolean boolean22 = lFSR21.getLastBit();
        java.lang.Class<?> wildcardClass23 = lFSR21.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
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
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
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
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.getLastBit();
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.getLastBit();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray11);
        boolean boolean17 = lFSR15.get((int) (byte) 10);
        boolean boolean19 = lFSR15.get((int) ' ');
        boolean boolean20 = lFSR15.getLastBit();
        boolean boolean21 = lFSR15.getClockBit();
        java.lang.String str22 = lFSR15.toString();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(0);
        boolean boolean13 = lFSR6.clock();
        java.lang.String str14 = lFSR6.toString();
        boolean boolean15 = lFSR6.clock();
        boolean boolean16 = lFSR6.getClockBit();
        java.lang.String str17 = lFSR6.toString();
        java.lang.String str18 = lFSR6.toString();
        boolean boolean20 = lFSR6.get((int) (short) 1);
        boolean boolean21 = lFSR6.clock();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
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
        boolean boolean35 = lFSR33.getLastBit();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.getLastBit();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean10 = lFSR6.get((int) '4');
        java.lang.Class<?> wildcardClass11 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray9);
        java.lang.String str13 = lFSR12.toString();
        java.util.BitSet bitSet14 = null;
        java.util.BitSet bitSet15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR12.initialize(bitSet14, bitSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) '4', intArray21);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) -1, (int) (byte) 100, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
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
            boolean boolean18 = lFSR6.clock();
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
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
        boolean boolean21 = lFSR9.get((int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = lFSR9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        int[] intArray13 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) ' ', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 0, intArray13);
        boolean boolean19 = lFSR18.getClockBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 22, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 1, intArray19);
        java.lang.Class<?> wildcardClass28 = lFSR27.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
        boolean boolean17 = lFSR6.get((int) (byte) 10);
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
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        int[] intArray7 = new int[] { (short) 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) -1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 10, intArray7);
        boolean boolean12 = lFSR10.get(100);
        java.lang.String str13 = lFSR10.toString();
        boolean boolean14 = lFSR10.getLastBit();
        boolean boolean16 = lFSR10.get(0);
        java.lang.String str17 = lFSR10.toString();
        boolean boolean18 = lFSR10.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
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
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean4 = lFSR3.getLastBit();
        java.lang.String str5 = lFSR3.toString();
        java.lang.String str6 = lFSR3.toString();
        java.util.BitSet bitSet7 = null;
        java.util.BitSet bitSet8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR3.initialize(bitSet7, bitSet8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{}" + "'", str5, "{}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{}" + "'", str6, "{}");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get(10);
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.get((int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 64, intArray19);
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
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) '4', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) '4', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) 100, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray13);
        java.lang.Class<?> wildcardClass19 = lFSR18.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray11);
        boolean boolean17 = lFSR15.get(10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
        boolean boolean18 = lFSR6.getLastBit();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) -1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = lFSR12.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 100, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) -1, (int) (short) 100, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        boolean boolean12 = lFSR9.getLastBit();
        java.lang.String str13 = lFSR9.toString();
        boolean boolean14 = lFSR9.getClockBit();
        java.lang.Class<?> wildcardClass15 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
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
        boolean boolean21 = lFSR9.getClockBit();
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
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
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
        boolean boolean21 = lFSR6.get((int) 'a');
        java.lang.Class<?> wildcardClass22 = lFSR6.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.clock();
        boolean boolean14 = lFSR12.getClockBit();
        boolean boolean16 = lFSR12.get((int) '#');
        boolean boolean18 = lFSR12.get((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        boolean boolean18 = lFSR15.get((int) (short) 100);
        boolean boolean20 = lFSR15.get((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
        boolean boolean21 = lFSR6.getLastBit();
        boolean boolean22 = lFSR6.clock();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
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
        boolean boolean21 = lFSR6.clock();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
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
        boolean boolean18 = lFSR9.getLastBit();
        boolean boolean19 = lFSR9.clock();
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
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 64, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 100, intArray17);
        boolean boolean26 = lFSR24.get((int) ' ');
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean12 = lFSR6.getLastBit();
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getClockBit();
        boolean boolean15 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
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
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray11);
        boolean boolean17 = lFSR15.get((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = lFSR15.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 0, intArray17);
        java.lang.Class<?> wildcardClass25 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
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
        boolean boolean19 = lFSR6.getLastBit();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray2);
        java.lang.String str4 = lFSR3.toString();
        java.lang.Class<?> wildcardClass5 = lFSR3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray11);
        boolean boolean16 = lFSR15.getLastBit();
        boolean boolean18 = lFSR15.get(0);
        boolean boolean19 = lFSR15.getLastBit();
        boolean boolean20 = lFSR15.getClockBit();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean15 = lFSR12.get((int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = lFSR12.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) 'a');
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
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
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
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(1, (-1), intArray17);
        java.lang.Class<?> wildcardClass25 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.clock();
        java.lang.String str14 = lFSR12.toString();
        boolean boolean16 = lFSR12.get((int) (byte) 0);
        boolean boolean17 = lFSR12.clock();
        java.lang.String str18 = lFSR12.toString();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        boolean boolean20 = lFSR6.get(22);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 100, intArray9);
        java.lang.String str13 = lFSR12.toString();
        java.lang.Class<?> wildcardClass14 = lFSR12.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean12 = lFSR6.getClockBit();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.get(1);
        boolean boolean14 = lFSR9.get((int) (byte) 10);
        java.lang.String str15 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
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
        boolean boolean19 = lFSR6.clock();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        java.lang.String str10 = lFSR6.toString();
        java.lang.String str11 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
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
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(0, 64, intArray11);
        boolean boolean17 = lFSR15.get((int) (byte) 1);
        java.lang.String str18 = lFSR15.toString();
        boolean boolean19 = lFSR15.getClockBit();
        boolean boolean21 = lFSR15.get((int) (short) 0);
        java.lang.String str22 = lFSR15.toString();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 0, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((-1), (int) (short) 0, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean14 = lFSR9.get(22);
        boolean boolean15 = lFSR9.getClockBit();
        boolean boolean17 = lFSR9.get((int) (byte) 10);
        boolean boolean18 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 64, intArray17);
        boolean boolean26 = lFSR24.get((int) '4');
        boolean boolean27 = lFSR24.getLastBit();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 10, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) 'a', intArray13);
        boolean boolean20 = lFSR18.get((int) ' ');
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray13);
        boolean boolean20 = lFSR18.get((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = lFSR30.getClockBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
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
        boolean boolean32 = lFSR27.get(64);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{}" + "'", str30, "{}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean4 = lFSR3.getLastBit();
        java.lang.String str5 = lFSR3.toString();
        java.lang.String str6 = lFSR3.toString();
        boolean boolean7 = lFSR3.getLastBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = lFSR3.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"<local2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{}" + "'", str5, "{}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{}" + "'", str6, "{}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray11);
        java.lang.String str16 = lFSR15.toString();
        boolean boolean17 = lFSR15.clock();
        boolean boolean18 = lFSR15.clock();
        boolean boolean19 = lFSR15.getClockBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) -1, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) -1, (-1), intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (short) 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(0, 0, intArray21);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray15);
        boolean boolean22 = lFSR21.clock();
        boolean boolean23 = lFSR21.clock();
        boolean boolean24 = lFSR21.getLastBit();
        boolean boolean26 = lFSR21.get((int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = lFSR21.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) 'a', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(0);
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.getClockBit();
        boolean boolean17 = lFSR6.get(0);
        boolean boolean18 = lFSR6.getLastBit();
        boolean boolean19 = lFSR6.clock();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        java.lang.String str11 = lFSR6.toString();
        java.lang.String str12 = lFSR6.toString();
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.get(0);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
        java.lang.String str36 = lFSR33.toString();
        java.util.BitSet bitSet37 = null;
        java.util.BitSet bitSet38 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR33.initialize(bitSet37, bitSet38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "{}" + "'", str36, "{}");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        int[] intArray13 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(1, (-1), intArray13);
        java.lang.String str19 = lFSR18.toString();
        java.lang.String str20 = lFSR18.toString();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) '4', intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.get((int) (byte) 10);
        boolean boolean14 = lFSR9.clock();
        boolean boolean15 = lFSR9.getClockBit();
        java.lang.Class<?> wildcardClass16 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) '4', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray11);
        java.lang.String str16 = lFSR15.toString();
        boolean boolean17 = lFSR15.clock();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        java.lang.String str14 = lFSR12.toString();
        boolean boolean15 = lFSR12.getLastBit();
        boolean boolean16 = lFSR12.getClockBit();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) ' ', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean14 = lFSR12.getClockBit();
        java.lang.Class<?> wildcardClass15 = lFSR12.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR(22, 22, intArray2);
        boolean boolean5 = lFSR3.get((int) (byte) 100);
        boolean boolean6 = lFSR3.getLastBit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.clock();
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
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) ' ');
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.get((int) (byte) 100);
        boolean boolean14 = lFSR6.get((int) (byte) 100);
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.getClockBit();
        boolean boolean17 = lFSR6.getLastBit();
        java.lang.String str18 = lFSR6.toString();
        boolean boolean19 = lFSR6.getClockBit();
        java.lang.String str20 = lFSR6.toString();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(100, 1, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(100, 64, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 0, intArray17);
        java.lang.Class<?> wildcardClass25 = lFSR24.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        java.lang.String str17 = lFSR15.toString();
        boolean boolean18 = lFSR15.getLastBit();
        boolean boolean19 = lFSR15.getClockBit();
        boolean boolean20 = lFSR15.getClockBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        int[] intArray13 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) 'a', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(22, 10, intArray13);
        boolean boolean20 = lFSR18.get((int) (short) 1);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
        java.lang.Class<?> wildcardClass18 = lFSR6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get((int) (byte) 1);
        java.lang.String str13 = lFSR6.toString();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean15 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        java.lang.String str8 = lFSR6.toString();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) 'a', intArray19);
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
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.clock();
        boolean boolean11 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        java.lang.String str10 = lFSR9.toString();
        java.util.BitSet bitSet11 = null;
        java.util.BitSet bitSet12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR9.initialize(bitSet11, bitSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (byte) 100, intArray15);
        boolean boolean22 = lFSR21.clock();
        boolean boolean24 = lFSR21.get(1);
        boolean boolean26 = lFSR21.get((int) '4');
        boolean boolean27 = lFSR21.getLastBit();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
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
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 0, intArray13);
        java.lang.Class<?> wildcardClass19 = lFSR18.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) ' ', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 0, intArray13);
        boolean boolean19 = lFSR18.getClockBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
        boolean boolean29 = lFSR24.get((int) (short) 0);
        java.lang.String str30 = lFSR24.toString();
        java.util.BitSet bitSet31 = null;
        java.util.BitSet bitSet32 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR24.initialize(bitSet31, bitSet32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{}" + "'", str30, "{}");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
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
        boolean boolean16 = lFSR6.getLastBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = lFSR6.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.clock();
        boolean boolean14 = lFSR12.getClockBit();
        boolean boolean16 = lFSR12.get((int) '#');
        java.lang.String str17 = lFSR12.toString();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(10, 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(100, 22, intArray21);
        java.lang.Class<?> wildcardClass31 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) 'a');
        boolean boolean11 = lFSR6.get(22);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR(100, 22, intArray2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = lFSR3.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"<local2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (byte) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray17);
        boolean boolean25 = lFSR24.getLastBit();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(100, 1, intArray11);
        boolean boolean16 = lFSR15.clock();
        boolean boolean17 = lFSR15.clock();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) ' ', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (short) 0, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean8 = lFSR6.clock();
        boolean boolean10 = lFSR6.get((int) (byte) 100);
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) ' ', intArray9);
        boolean boolean13 = lFSR12.clock();
        boolean boolean14 = lFSR12.getClockBit();
        java.lang.String str15 = lFSR12.toString();
        java.lang.Class<?> wildcardClass16 = lFSR12.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray13);
        java.lang.String str19 = lFSR18.toString();
        boolean boolean20 = lFSR18.getLastBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 10, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        int[] intArray9 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 100, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) '4', intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[22, 10, 100]");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean4 = lFSR3.getClockBit();
        boolean boolean5 = lFSR3.getLastBit();
        boolean boolean7 = lFSR3.get((int) (short) 0);
        boolean boolean8 = lFSR3.getLastBit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray27);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = lFSR39.getLastBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 1, 1]");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) -1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean15 = lFSR12.get((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = lFSR12.getClockBit();
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
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
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
        boolean boolean38 = lFSR36.getLastBit();
        boolean boolean39 = lFSR36.getClockBit();
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray11);
        java.lang.String str16 = lFSR15.toString();
        java.lang.String str17 = lFSR15.toString();
        boolean boolean19 = lFSR15.get((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = lFSR15.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        int[] intArray29 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR34 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR37 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR38 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) -1, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR39 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 100, intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR40 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) '#', intArray29);
        com.thealgorithms.ciphers.a5.LFSR lFSR41 = new com.thealgorithms.ciphers.a5.LFSR(22, 0, intArray29);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR42 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) -1, (int) (byte) 0, intArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 1, 1]");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (short) -1, intArray15);
        java.lang.String str22 = lFSR21.toString();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean4 = lFSR3.getLastBit();
        boolean boolean6 = lFSR3.get((int) '4');
        java.lang.String str7 = lFSR3.toString();
        boolean boolean8 = lFSR3.getClockBit();
        boolean boolean10 = lFSR3.get((int) (short) 0);
        java.lang.String str11 = lFSR3.toString();
        boolean boolean12 = lFSR3.getLastBit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(0);
        boolean boolean13 = lFSR6.clock();
        boolean boolean14 = lFSR6.getLastBit();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        int[] intArray15 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 1, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[52, 52, 1]");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
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
        java.lang.String str17 = lFSR6.toString();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        int[] intArray11 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) 10, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (byte) 1, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        boolean boolean18 = lFSR15.get(64);
        boolean boolean19 = lFSR15.getClockBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
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
        boolean boolean21 = lFSR6.getLastBit();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) '4');
        boolean boolean13 = lFSR6.getClockBit();
        boolean boolean15 = lFSR6.get((int) (byte) 10);
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
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 64, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 100, intArray17);
        java.lang.String str25 = lFSR24.toString();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
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
        boolean boolean31 = lFSR30.clock();
        boolean boolean32 = lFSR30.getClockBit();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
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
        java.lang.Class<?> wildcardClass15 = lFSR6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        int[] intArray11 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) 10, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (byte) 1, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        boolean boolean18 = lFSR15.get(64);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = lFSR15.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray17);
        boolean boolean25 = lFSR24.getClockBit();
        boolean boolean26 = lFSR24.clock();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.clock();
        boolean boolean14 = lFSR9.clock();
        boolean boolean15 = lFSR9.getLastBit();
        boolean boolean16 = lFSR9.clock();
        boolean boolean17 = lFSR9.getLastBit();
        boolean boolean19 = lFSR9.get((int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        int[] intArray17 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 64, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 52, 1]");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
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
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
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
        boolean boolean18 = lFSR6.getClockBit();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
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
        java.lang.String str17 = lFSR6.toString();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray17);
        boolean boolean25 = lFSR24.getClockBit();
        boolean boolean27 = lFSR24.get((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) 'a', intArray2);
        boolean boolean4 = lFSR3.getClockBit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray13);
        java.lang.String str19 = lFSR18.toString();
        boolean boolean20 = lFSR18.getLastBit();
        boolean boolean22 = lFSR18.get((int) (short) 10);
        boolean boolean23 = lFSR18.getLastBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        int[] intArray9 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 1, intArray9);
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
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, 22, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(0, (-1), intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        int[] intArray9 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (short) -1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (byte) -1, intArray9);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[22, 10, 100]");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR(1, 0, intArray2);
        java.lang.String str4 = lFSR3.toString();
        boolean boolean5 = lFSR3.getLastBit();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(0);
        boolean boolean14 = lFSR6.get(100);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
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
        boolean boolean19 = lFSR6.getLastBit();
        boolean boolean20 = lFSR6.clock();
        boolean boolean21 = lFSR6.clock();
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
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
        java.lang.Class<?> wildcardClass34 = lFSR30.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "{}" + "'", str32, "{}");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.clock();
        java.lang.String str8 = lFSR6.toString();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getLastBit();
        java.lang.String str11 = lFSR6.toString();
        java.lang.Class<?> wildcardClass12 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
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
        java.lang.String str21 = lFSR6.toString();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) -1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        java.lang.String str14 = lFSR12.toString();
        boolean boolean16 = lFSR12.get(0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 22, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 0, intArray21);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (short) 100, intArray11);
        boolean boolean16 = lFSR15.getLastBit();
        boolean boolean17 = lFSR15.getLastBit();
        boolean boolean18 = lFSR15.getClockBit();
        boolean boolean19 = lFSR15.getClockBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 1, intArray25);
        boolean boolean37 = lFSR36.getClockBit();
        boolean boolean38 = lFSR36.clock();
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
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
        java.lang.String str19 = lFSR6.toString();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray11);
        boolean boolean17 = lFSR15.get((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) -1, 100, intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 100, intArray25);
        boolean boolean37 = lFSR36.clock();
        boolean boolean38 = lFSR36.getClockBit();
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (short) 100, intArray11);
        boolean boolean17 = lFSR15.get((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        int[] intArray7 = new int[] { (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) 100, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 10, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) -1, intArray7);
        java.lang.String str11 = lFSR10.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = lFSR10.getClockBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get((int) (byte) 0);
        boolean boolean13 = lFSR6.getClockBit();
        boolean boolean14 = lFSR6.getClockBit();
        boolean boolean16 = lFSR6.get((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        boolean boolean14 = lFSR12.clock();
        boolean boolean16 = lFSR12.get((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = lFSR12.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
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
        boolean boolean22 = lFSR6.clock();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) 0, intArray7);
        java.lang.String str10 = lFSR9.toString();
        boolean boolean11 = lFSR9.getClockBit();
        java.util.BitSet bitSet12 = null;
        java.util.BitSet bitSet13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR9.initialize(bitSet12, bitSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean15 = lFSR12.get((int) (byte) 10);
        java.lang.String str16 = lFSR12.toString();
        boolean boolean17 = lFSR12.getLastBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        boolean boolean17 = lFSR15.getClockBit();
        java.lang.String str18 = lFSR15.toString();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray9);
        boolean boolean13 = lFSR12.getLastBit();
        boolean boolean14 = lFSR12.getLastBit();
        boolean boolean16 = lFSR12.get((int) '4');
        boolean boolean17 = lFSR12.getLastBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(100, 64, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray19);
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
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean8 = lFSR6.get((int) '4');
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
        java.lang.String str12 = lFSR6.toString();
        boolean boolean14 = lFSR6.get(22);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.getLastBit();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean10 = lFSR6.get((int) '4');
        boolean boolean11 = lFSR6.clock();
        boolean boolean12 = lFSR6.clock();
        boolean boolean13 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
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
        boolean boolean27 = lFSR24.getClockBit();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) '4', intArray23);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, 0, intArray17);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) -1, (int) (byte) 100, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(10, 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(1, 22, intArray21);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) -1, (int) (byte) -1, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
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
        boolean boolean20 = lFSR6.get((int) (short) 1);
        boolean boolean21 = lFSR6.getClockBit();
        boolean boolean22 = lFSR6.getLastBit();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(1, 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(100, 64, intArray15);
        java.lang.Class<?> wildcardClass22 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        int[] intArray9 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 1, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        boolean boolean14 = lFSR12.getLastBit();
        boolean boolean15 = lFSR12.getLastBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
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
        boolean boolean21 = lFSR6.getLastBit();
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
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray13);
        java.lang.String str19 = lFSR18.toString();
        boolean boolean20 = lFSR18.getClockBit();
        java.lang.String str21 = lFSR18.toString();
        boolean boolean22 = lFSR18.getLastBit();
        boolean boolean23 = lFSR18.getLastBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        int[] intArray11 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        boolean boolean16 = lFSR15.clock();
        boolean boolean17 = lFSR15.clock();
        boolean boolean18 = lFSR15.getClockBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 52, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(0, 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (byte) 1, intArray13);
        boolean boolean19 = lFSR18.getClockBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(10, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(1, 1, intArray17);
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
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        boolean boolean10 = lFSR6.clock();
        boolean boolean11 = lFSR6.clock();
        boolean boolean12 = lFSR6.getLastBit();
        boolean boolean13 = lFSR6.clock();
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
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) '#', intArray19);
        boolean boolean28 = lFSR27.clock();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
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
        boolean boolean39 = lFSR36.get((int) (short) 100);
        java.util.BitSet bitSet40 = null;
        java.util.BitSet bitSet41 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR36.initialize(bitSet40, bitSet41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "{}" + "'", str37, "{}");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        boolean boolean17 = lFSR15.getLastBit();
        boolean boolean19 = lFSR15.get(10);
        java.lang.Class<?> wildcardClass20 = lFSR15.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(10, 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (short) 1, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getLastBit();
        boolean boolean14 = lFSR12.clock();
        boolean boolean15 = lFSR12.getClockBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
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
        boolean boolean26 = lFSR21.getLastBit();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(10, 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (short) 0, intArray21);
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
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, 1, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        java.lang.Class<?> wildcardClass17 = lFSR15.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
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
        boolean boolean19 = lFSR9.get((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 100, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) '#', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 0, intArray21);
        java.lang.Class<?> wildcardClass31 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        java.lang.String str4 = lFSR3.toString();
        boolean boolean5 = lFSR3.getLastBit();
        boolean boolean6 = lFSR3.getClockBit();
        boolean boolean7 = lFSR3.getLastBit();
        boolean boolean9 = lFSR3.get((int) ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        boolean boolean14 = lFSR12.clock();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.get((int) (byte) 10);
        boolean boolean15 = lFSR9.get((int) '#');
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
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
        boolean boolean20 = lFSR9.getLastBit();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR((-1), (int) 'a', intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) (short) 0);
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.get(100);
        boolean boolean18 = lFSR6.get((int) '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        java.lang.String str17 = lFSR15.toString();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.get((int) ' ');
        boolean boolean13 = lFSR9.getClockBit();
        boolean boolean14 = lFSR9.getClockBit();
        java.lang.String str15 = lFSR9.toString();
        boolean boolean16 = lFSR9.getLastBit();
        boolean boolean18 = lFSR9.get(100);
        boolean boolean19 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray11);
        boolean boolean17 = lFSR15.get(10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) 1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        java.lang.Class<?> wildcardClass14 = lFSR12.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(10, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 1, intArray17);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) '#', intArray13);
        boolean boolean19 = lFSR18.clock();
        boolean boolean20 = lFSR18.clock();
        java.lang.Class<?> wildcardClass21 = lFSR18.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) ' ', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (-1), intArray15);
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
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) '4', intArray17);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((-1), (int) (short) 100, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
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
        boolean boolean21 = lFSR6.get(100);
        boolean boolean22 = lFSR6.clock();
        java.lang.String str23 = lFSR6.toString();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) 0, intArray7);
        java.lang.String str10 = lFSR9.toString();
        java.lang.String str11 = lFSR9.toString();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray15);
        boolean boolean23 = lFSR21.get(100);
        java.lang.String str24 = lFSR21.toString();
        java.lang.String str25 = lFSR21.toString();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{}" + "'", str24, "{}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 0, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((-1), (int) '#', intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        int[] intArray13 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 10, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 52, 1]");
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
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
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean15 = lFSR12.get(22);
        boolean boolean16 = lFSR12.clock();
        java.lang.String str17 = lFSR12.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = lFSR12.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
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
        boolean boolean19 = lFSR6.getLastBit();
        java.lang.Class<?> wildcardClass20 = lFSR6.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
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
        boolean boolean30 = lFSR27.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = lFSR18.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 0, intArray23);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
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
        java.lang.Class<?> wildcardClass22 = lFSR9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 1, intArray15);
        boolean boolean23 = lFSR21.get(22);
        boolean boolean24 = lFSR21.clock();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(10, 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray19);
        boolean boolean28 = lFSR27.getClockBit();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.get((int) (short) 100);
        boolean boolean11 = lFSR6.get((int) ' ');
        java.lang.String str12 = lFSR6.toString();
        java.lang.String str13 = lFSR6.toString();
        java.lang.String str14 = lFSR6.toString();
        boolean boolean15 = lFSR6.getClockBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = lFSR6.getLastBit();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
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
        boolean boolean18 = lFSR6.clock();
        boolean boolean19 = lFSR6.clock();
        java.lang.Class<?> wildcardClass20 = lFSR6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (byte) 1, intArray25);
        java.lang.Class<?> wildcardClass37 = lFSR36.getClass();
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        int[] intArray9 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 100, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray9);
        java.lang.Class<?> wildcardClass13 = lFSR12.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[22, 10, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.clock();
        boolean boolean11 = lFSR9.getClockBit();
        boolean boolean13 = lFSR9.get(0);
        boolean boolean14 = lFSR9.getLastBit();
        java.lang.String str15 = lFSR9.toString();
        boolean boolean16 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 10, intArray13);
        boolean boolean19 = lFSR18.getClockBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) '4', intArray15);
        boolean boolean23 = lFSR21.get(1);
        boolean boolean24 = lFSR21.getClockBit();
        boolean boolean25 = lFSR21.getClockBit();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 64, intArray17);
        boolean boolean25 = lFSR24.clock();
        java.lang.String str26 = lFSR24.toString();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{}" + "'", str24, "{}");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean14 = lFSR12.clock();
        boolean boolean16 = lFSR12.get((int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 22, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 10, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray13);
        boolean boolean20 = lFSR18.get((int) 'a');
        boolean boolean21 = lFSR18.getClockBit();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray11);
        java.lang.String str16 = lFSR15.toString();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = lFSR15.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
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
        boolean boolean37 = lFSR33.getClockBit();
        java.lang.String str38 = lFSR33.toString();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "{}" + "'", str36, "{}");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{}" + "'", str38, "{}");
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(64, 64, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (byte) 10, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean12 = lFSR6.getClockBit();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
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
        java.lang.Class<?> wildcardClass31 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.getClockBit();
        boolean boolean14 = lFSR6.get(0);
        boolean boolean15 = lFSR6.clock();
        boolean boolean16 = lFSR6.clock();
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
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, 0, intArray2);
        java.lang.String str4 = lFSR3.toString();
        java.lang.String str5 = lFSR3.toString();
        java.util.BitSet bitSet6 = null;
        java.util.BitSet bitSet7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR3.initialize(bitSet6, bitSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{}" + "'", str5, "{}");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
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
        java.lang.Class<?> wildcardClass27 = lFSR21.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.getClockBit();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get((int) 'a');
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (short) 10, intArray11);
        boolean boolean17 = lFSR15.get(10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getLastBit();
        boolean boolean15 = lFSR12.get((int) (short) 0);
        boolean boolean17 = lFSR12.get((int) '#');
        java.lang.String str18 = lFSR12.toString();
        boolean boolean19 = lFSR12.clock();
        boolean boolean20 = lFSR12.getClockBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) 'a', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(10, 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) '#', intArray13);
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
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 0, intArray15);
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
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        boolean boolean17 = lFSR15.getLastBit();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
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
        java.lang.String str18 = lFSR9.toString();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) 0, intArray13);
        boolean boolean20 = lFSR18.get(64);
        java.lang.String str21 = lFSR18.toString();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR42 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR43 = new com.thealgorithms.ciphers.a5.LFSR(0, 100, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR44 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (short) -1, intArray31);
        com.thealgorithms.ciphers.a5.LFSR lFSR45 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray31);
        java.lang.Class<?> wildcardClass46 = lFSR45.getClass();
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
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
        boolean boolean17 = lFSR6.get((int) (short) 0);
        java.lang.String str18 = lFSR6.toString();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.get(1);
        boolean boolean14 = lFSR9.get((int) ' ');
        boolean boolean16 = lFSR9.get((int) '#');
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) (byte) 10);
        boolean boolean13 = lFSR6.clock();
        java.lang.String str14 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        int[] intArray15 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (short) 100, intArray15);
        boolean boolean22 = lFSR21.getClockBit();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        boolean boolean14 = lFSR12.clock();
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
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 100, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.get(1);
        java.lang.String str13 = lFSR9.toString();
        boolean boolean14 = lFSR9.getClockBit();
        boolean boolean15 = lFSR9.getClockBit();
        boolean boolean17 = lFSR9.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 0, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 22, intArray13);
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
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray9);
        boolean boolean13 = lFSR12.getLastBit();
        java.util.BitSet bitSet14 = null;
        java.util.BitSet bitSet15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR12.initialize(bitSet14, bitSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 0, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        java.lang.String str17 = lFSR15.toString();
        boolean boolean18 = lFSR15.clock();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.clock();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (byte) -1, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) -1, intArray17);
        java.lang.String str25 = lFSR24.toString();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.get(1);
        java.lang.String str13 = lFSR9.toString();
        boolean boolean14 = lFSR9.getClockBit();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray15);
        boolean boolean23 = lFSR21.get(0);
        boolean boolean24 = lFSR21.getClockBit();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
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
        boolean boolean22 = lFSR9.getClockBit();
        java.util.BitSet bitSet23 = null;
        java.util.BitSet bitSet24 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR9.initialize(bitSet23, bitSet24);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 0, intArray25);
        boolean boolean37 = lFSR36.clock();
        java.util.BitSet bitSet38 = null;
        java.util.BitSet bitSet39 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR36.initialize(bitSet38, bitSet39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        int[] intArray7 = new int[] { 10, 22, 10 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray7);
        boolean boolean11 = lFSR9.get((int) 'a');
        java.lang.String str12 = lFSR9.toString();
        boolean boolean13 = lFSR9.getLastBit();
        boolean boolean14 = lFSR9.getLastBit();
        boolean boolean15 = lFSR9.getLastBit();
        boolean boolean16 = lFSR9.getClockBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 22, 10]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
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
        boolean boolean21 = lFSR6.clock();
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
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray25);
        boolean boolean37 = lFSR36.getClockBit();
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 64, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 10, intArray17);
        boolean boolean26 = lFSR24.get((int) (short) 0);
        boolean boolean28 = lFSR24.get(22);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        boolean boolean17 = lFSR15.clock();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        boolean boolean17 = lFSR15.getLastBit();
        java.lang.Class<?> wildcardClass18 = lFSR15.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR35 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray25);
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 0, intArray25);
        boolean boolean37 = lFSR36.clock();
        boolean boolean38 = lFSR36.clock();
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
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
        java.lang.Class<?> wildcardClass36 = lFSR33.getClass();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 100, intArray13);
        boolean boolean19 = lFSR18.getLastBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
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
        boolean boolean19 = lFSR12.getClockBit();
        boolean boolean20 = lFSR12.clock();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray2);
        boolean boolean5 = lFSR3.get((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean8 = lFSR6.clock();
        boolean boolean10 = lFSR6.get((int) (byte) 100);
        boolean boolean11 = lFSR6.getLastBit();
        java.lang.String str12 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getLastBit();
        boolean boolean15 = lFSR12.get((int) (short) 0);
        boolean boolean17 = lFSR12.get((int) '#');
        java.lang.String str18 = lFSR12.toString();
        boolean boolean19 = lFSR12.getClockBit();
        boolean boolean20 = lFSR12.getLastBit();
        boolean boolean21 = lFSR12.clock();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = lFSR30.getClockBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean11 = lFSR6.clock();
        boolean boolean12 = lFSR6.getLastBit();
        java.lang.String str13 = lFSR6.toString();
        boolean boolean14 = lFSR6.clock();
        boolean boolean15 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
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
        boolean boolean17 = lFSR6.getLastBit();
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
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = lFSR27.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) (short) 0);
        java.lang.String str13 = lFSR6.toString();
        boolean boolean15 = lFSR6.get((int) (short) 10);
        boolean boolean16 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        java.lang.Class<?> wildcardClass22 = lFSR21.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getClockBit();
        boolean boolean10 = lFSR6.get(22);
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray9);
        boolean boolean13 = lFSR12.getLastBit();
        boolean boolean14 = lFSR12.getLastBit();
        boolean boolean15 = lFSR12.getLastBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
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
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 64, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) '4', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(64, 10, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 1, intArray2);
        boolean boolean4 = lFSR3.getLastBit();
        boolean boolean6 = lFSR3.get((int) '4');
        java.lang.String str7 = lFSR3.toString();
        boolean boolean8 = lFSR3.getClockBit();
        boolean boolean10 = lFSR3.get((int) (short) 0);
        java.lang.String str11 = lFSR3.toString();
        java.lang.String str12 = lFSR3.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = lFSR3.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"<local2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
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
        boolean boolean19 = lFSR12.getClockBit();
        boolean boolean20 = lFSR12.getClockBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get((int) (byte) 0);
        boolean boolean13 = lFSR6.clock();
        boolean boolean15 = lFSR6.get(64);
        java.lang.String str16 = lFSR6.toString();
        java.lang.String str17 = lFSR6.toString();
        boolean boolean19 = lFSR6.get((int) (short) 10);
        boolean boolean20 = lFSR6.getClockBit();
        boolean boolean22 = lFSR6.get((int) '#');
        boolean boolean23 = lFSR6.getLastBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) ' ');
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.get(64);
        boolean boolean13 = lFSR6.getLastBit();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
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
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) ' ');
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.get((int) (byte) 100);
        boolean boolean14 = lFSR6.get((int) (byte) 100);
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.getLastBit();
        java.lang.String str17 = lFSR6.toString();
        boolean boolean18 = lFSR6.clock();
        boolean boolean19 = lFSR6.clock();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        boolean boolean14 = lFSR12.clock();
        java.lang.String str15 = lFSR12.toString();
        boolean boolean17 = lFSR12.get((int) (byte) 0);
        java.lang.String str18 = lFSR12.toString();
        java.lang.String str19 = lFSR12.toString();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        boolean boolean12 = lFSR9.clock();
        boolean boolean13 = lFSR9.getClockBit();
        boolean boolean14 = lFSR9.getLastBit();
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
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) '#', intArray2);
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
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        java.lang.String str14 = lFSR12.toString();
        java.lang.String str15 = lFSR12.toString();
        boolean boolean17 = lFSR12.get((int) (short) 0);
        java.lang.String str18 = lFSR12.toString();
        boolean boolean20 = lFSR12.get(22);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(0, 64, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 100, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
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
        boolean boolean40 = lFSR39.clock();
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 22, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(10, 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 0, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 0, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        boolean boolean17 = lFSR15.getClockBit();
        java.lang.String str18 = lFSR15.toString();
        boolean boolean20 = lFSR15.get(22);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
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
        boolean boolean18 = lFSR6.clock();
        boolean boolean20 = lFSR6.get((int) '4');
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        boolean boolean9 = lFSR6.clock();
        boolean boolean10 = lFSR6.clock();
        boolean boolean11 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.getClockBit();
        boolean boolean13 = lFSR6.getClockBit();
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
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray15);
        boolean boolean22 = lFSR21.clock();
        boolean boolean23 = lFSR21.clock();
        boolean boolean24 = lFSR21.getLastBit();
        boolean boolean25 = lFSR21.clock();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 64, intArray17);
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
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.get((int) (short) 100);
        boolean boolean10 = lFSR6.getClockBit();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.clock();
        java.lang.String str14 = lFSR12.toString();
        java.lang.Class<?> wildcardClass15 = lFSR12.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray9);
        boolean boolean14 = lFSR12.get(64);
        java.lang.String str15 = lFSR12.toString();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray13);
        java.lang.Class<?> wildcardClass19 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
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
        boolean boolean19 = lFSR9.getLastBit();
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
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        int[] intArray21 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) ' ', intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(100, 10, intArray21);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 10, intArray21);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.get(1);
        boolean boolean13 = lFSR9.getClockBit();
        boolean boolean14 = lFSR9.getLastBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        boolean boolean12 = lFSR9.getLastBit();
        java.lang.String str13 = lFSR9.toString();
        boolean boolean14 = lFSR9.getLastBit();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        boolean boolean17 = lFSR15.getClockBit();
        boolean boolean19 = lFSR15.get(1);
        boolean boolean20 = lFSR15.clock();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get(10);
        java.lang.String str13 = lFSR6.toString();
        boolean boolean14 = lFSR6.getClockBit();
        boolean boolean15 = lFSR6.clock();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) -1, intArray17);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) -1, (-1), intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean11 = lFSR6.get((int) ' ');
        boolean boolean12 = lFSR6.clock();
        boolean boolean13 = lFSR6.getClockBit();
        java.lang.Class<?> wildcardClass14 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        int[] intArray3 = new int[] { (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR4 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) 100, intArray3);
        java.lang.String str5 = lFSR4.toString();
        java.lang.String str6 = lFSR4.toString();
        java.lang.Class<?> wildcardClass7 = lFSR4.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{}" + "'", str5, "{}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{}" + "'", str6, "{}");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(100, 64, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) ' ', intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.clock();
        boolean boolean14 = lFSR12.getClockBit();
        boolean boolean16 = lFSR12.get((int) '#');
        java.lang.Class<?> wildcardClass17 = lFSR12.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 0, intArray17);
        boolean boolean25 = lFSR24.getClockBit();
        boolean boolean26 = lFSR24.getClockBit();
        java.lang.Class<?> wildcardClass27 = lFSR24.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 1, intArray2);
        boolean boolean4 = lFSR3.getClockBit();
        boolean boolean6 = lFSR3.get((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
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
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        int[] intArray5 = new int[] { (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) 100, intArray5);
        com.thealgorithms.ciphers.a5.LFSR lFSR7 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (byte) 100, intArray5);
        java.lang.String str8 = lFSR7.toString();
        boolean boolean9 = lFSR7.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR(64, 100, intArray2);
        boolean boolean5 = lFSR3.get((int) (short) 1);
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
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
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
        java.util.BitSet bitSet38 = null;
        java.util.BitSet bitSet39 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR33.initialize(bitSet38, bitSet39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
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
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "{}" + "'", str32, "{}");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
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
        boolean boolean38 = lFSR36.getClockBit();
        java.util.BitSet bitSet39 = null;
        java.util.BitSet bitSet40 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR36.initialize(bitSet39, bitSet40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        int[] intArray11 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) 10, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (byte) 1, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = lFSR15.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray11);
        boolean boolean17 = lFSR15.get((int) (byte) 10);
        boolean boolean19 = lFSR15.get((int) ' ');
        boolean boolean20 = lFSR15.getClockBit();
        boolean boolean21 = lFSR15.clock();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray17);
        boolean boolean25 = lFSR24.getClockBit();
        boolean boolean26 = lFSR24.clock();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray13);
        boolean boolean19 = lFSR18.getClockBit();
        boolean boolean21 = lFSR18.get(0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 1, intArray17);
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
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray11);
        boolean boolean16 = lFSR15.clock();
        boolean boolean17 = lFSR15.getLastBit();
        boolean boolean18 = lFSR15.clock();
        boolean boolean20 = lFSR15.get(0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getLastBit();
        boolean boolean15 = lFSR12.get((int) ' ');
        java.lang.String str16 = lFSR12.toString();
        java.lang.String str17 = lFSR12.toString();
        boolean boolean18 = lFSR12.getClockBit();
        java.lang.String str19 = lFSR12.toString();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '4', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray19);
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
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
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
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.getLastBit();
        boolean boolean13 = lFSR9.getLastBit();
        boolean boolean15 = lFSR9.get(0);
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
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get(0);
        boolean boolean13 = lFSR6.clock();
        boolean boolean15 = lFSR6.get((int) '#');
        boolean boolean16 = lFSR6.clock();
        java.lang.Class<?> wildcardClass17 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray2);
        boolean boolean4 = lFSR3.getLastBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = lFSR3.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (byte) 10, intArray9);
        boolean boolean13 = lFSR12.getClockBit();
        boolean boolean14 = lFSR12.clock();
        boolean boolean15 = lFSR12.getLastBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) ' ', intArray9);
        boolean boolean13 = lFSR12.clock();
        java.lang.String str14 = lFSR12.toString();
        boolean boolean15 = lFSR12.getClockBit();
        boolean boolean16 = lFSR12.getLastBit();
        java.lang.String str17 = lFSR12.toString();
        boolean boolean18 = lFSR12.clock();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) ' ', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, 0, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.clock();
        boolean boolean11 = lFSR9.clock();
        boolean boolean12 = lFSR9.getClockBit();
        boolean boolean13 = lFSR9.getClockBit();
        boolean boolean14 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (byte) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray17);
        boolean boolean26 = lFSR24.get((int) (short) 0);
        java.lang.Class<?> wildcardClass27 = lFSR24.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
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
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "{}" + "'", str41, "{}");
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
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
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        int[] intArray9 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray9);
        boolean boolean13 = lFSR12.clock();
        boolean boolean14 = lFSR12.clock();
        boolean boolean15 = lFSR12.clock();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
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
        java.lang.String str29 = lFSR24.toString();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{}" + "'", str28, "{}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "{}" + "'", str29, "{}");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) ' ', intArray13);
        java.lang.Class<?> wildcardClass19 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) ' ', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) '4', intArray15);
        boolean boolean23 = lFSR21.get(22);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
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
        java.lang.Class<?> wildcardClass32 = lFSR30.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean11 = lFSR6.getClockBit();
        boolean boolean12 = lFSR6.clock();
        boolean boolean14 = lFSR6.get((int) (short) 10);
        boolean boolean15 = lFSR6.getClockBit();
        java.lang.Class<?> wildcardClass16 = lFSR6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean12 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.get(1);
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.get((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        int[] intArray8 = new int[] { (byte) 100, 10, (short) 10, (byte) 100, ' ', (byte) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(22, 0, intArray8);
        java.lang.Class<?> wildcardClass10 = lFSR9.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 10, 10, 100, 32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) -1, intArray13);
        java.lang.String str19 = lFSR18.toString();
        boolean boolean20 = lFSR18.clock();
        java.lang.Class<?> wildcardClass21 = lFSR18.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (byte) 0, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        boolean boolean13 = lFSR12.getLastBit();
        boolean boolean15 = lFSR12.get((int) (short) 0);
        boolean boolean17 = lFSR12.get((int) '#');
        java.lang.String str18 = lFSR12.toString();
        boolean boolean19 = lFSR12.getLastBit();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 10, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) 'a', intArray13);
        boolean boolean19 = lFSR18.getLastBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) '4', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) ' ', intArray15);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((-1), 64, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.clock();
        boolean boolean11 = lFSR9.getClockBit();
        boolean boolean13 = lFSR9.get((int) '#');
        java.lang.String str14 = lFSR9.toString();
        boolean boolean15 = lFSR9.getLastBit();
        java.lang.String str16 = lFSR9.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        int[] intArray13 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 64, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(0, 64, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) '4', intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 0, 100]");
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) 1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean14 = lFSR12.getLastBit();
        boolean boolean15 = lFSR12.getClockBit();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get((int) (byte) 0);
        boolean boolean13 = lFSR6.clock();
        java.lang.String str14 = lFSR6.toString();
        boolean boolean15 = lFSR6.getLastBit();
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
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        int[] intArray10 = new int[] { 100, 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (short) 100, intArray10);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) '4', intArray10);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(0, 1, intArray10);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(10, 10, intArray10);
        java.lang.String str15 = lFSR14.toString();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        boolean boolean10 = lFSR9.getClockBit();
        boolean boolean12 = lFSR9.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR(1, 0, intArray2);
        boolean boolean4 = lFSR3.getClockBit();
        boolean boolean6 = lFSR3.get((int) (short) 1);
        boolean boolean8 = lFSR3.get((int) (byte) 1);
        boolean boolean9 = lFSR3.getClockBit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean15 = lFSR12.get((int) (short) 1);
        java.lang.String str16 = lFSR12.toString();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) -1, intArray15);
        boolean boolean22 = lFSR21.getLastBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = lFSR21.getClockBit();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, 100, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) -1, 10, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) ' ');
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.get((int) (byte) 100);
        boolean boolean14 = lFSR6.get((int) (byte) 100);
        boolean boolean16 = lFSR6.get(1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean14 = lFSR12.getLastBit();
        boolean boolean15 = lFSR12.getClockBit();
        boolean boolean16 = lFSR12.clock();
        boolean boolean18 = lFSR12.get(64);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) ' ', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, 100, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = lFSR15.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.get((int) ' ');
        boolean boolean13 = lFSR9.getClockBit();
        boolean boolean14 = lFSR9.getClockBit();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
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
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR44 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) '4', intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR45 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 10, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR46 = new com.thealgorithms.ciphers.a5.LFSR(0, 10, intArray33);
        com.thealgorithms.ciphers.a5.LFSR lFSR47 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 0, intArray33);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR48 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) -1, (int) (byte) 10, intArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 1, 1]");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
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
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 1]");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        int[] intArray23 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR28 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR29 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR30 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR31 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 1, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR32 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 0, intArray23);
        com.thealgorithms.ciphers.a5.LFSR lFSR33 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 10, intArray23);
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
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) 'a', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (byte) -1, intArray17);
        java.lang.Class<?> wildcardClass25 = lFSR24.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
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
        boolean boolean21 = lFSR6.getLastBit();
        java.lang.String str22 = lFSR6.toString();
        boolean boolean24 = lFSR6.get((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
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
        java.lang.String str21 = lFSR6.toString();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray11);
        boolean boolean17 = lFSR15.get((int) (byte) 10);
        boolean boolean19 = lFSR15.get((int) ' ');
        boolean boolean21 = lFSR15.get((int) 'a');
        boolean boolean22 = lFSR15.getClockBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) (short) 0);
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.getLastBit();
        java.lang.String str15 = lFSR6.toString();
        boolean boolean16 = lFSR6.getLastBit();
        boolean boolean17 = lFSR6.getClockBit();
        boolean boolean18 = lFSR6.clock();
        boolean boolean20 = lFSR6.get(0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) ' ', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) '4', intArray15);
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
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray9);
        boolean boolean14 = lFSR12.get((int) ' ');
        boolean boolean15 = lFSR12.getClockBit();
        java.lang.String str16 = lFSR12.toString();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        int[] intArray9 = new int[] { (short) 0 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) (byte) -1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 10, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) '4', intArray9);
        java.lang.Class<?> wildcardClass14 = lFSR13.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        int[] intArray15 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) '#', intArray15);
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
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.getClockBit();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) (short) 100);
        boolean boolean16 = lFSR9.get((int) (byte) 10);
        boolean boolean17 = lFSR9.clock();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean12 = lFSR6.clock();
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.clock();
        boolean boolean16 = lFSR6.get(0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
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
        java.lang.String str28 = lFSR24.toString();
        java.lang.Class<?> wildcardClass29 = lFSR24.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{}" + "'", str28, "{}");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 64, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) '4', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (byte) 0, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
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
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(100, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 10, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', 0, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray13);
        java.lang.String str19 = lFSR18.toString();
        java.lang.String str20 = lFSR18.toString();
        boolean boolean21 = lFSR18.clock();
        boolean boolean22 = lFSR18.clock();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
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
        boolean boolean28 = lFSR24.getLastBit();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{}" + "'", str27, "{}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) 'a', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '4', intArray17);
        boolean boolean25 = lFSR24.getClockBit();
        java.lang.String str26 = lFSR24.toString();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get((int) ' ');
        boolean boolean10 = lFSR6.getLastBit();
        boolean boolean12 = lFSR6.get((int) (byte) 100);
        boolean boolean14 = lFSR6.get((int) (byte) 100);
        boolean boolean15 = lFSR6.getLastBit();
        boolean boolean16 = lFSR6.getLastBit();
        java.lang.Class<?> wildcardClass17 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        int[] intArray15 = new int[] { '4', '4', (short) 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) '#', intArray15);
        java.lang.Class<?> wildcardClass22 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[52, 52, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 0, intArray2);
        boolean boolean4 = lFSR3.getLastBit();
        boolean boolean5 = lFSR3.getClockBit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) ' ', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) -1, intArray11);
        java.lang.Class<?> wildcardClass16 = lFSR15.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray7);
        boolean boolean10 = lFSR9.clock();
        boolean boolean11 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.clock();
        boolean boolean13 = lFSR9.getClockBit();
        boolean boolean15 = lFSR9.get((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getLastBit();
        java.lang.String str9 = lFSR6.toString();
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get((int) (byte) 0);
        boolean boolean13 = lFSR6.clock();
        boolean boolean15 = lFSR6.get(64);
        java.lang.String str16 = lFSR6.toString();
        java.lang.String str17 = lFSR6.toString();
        boolean boolean19 = lFSR6.get((int) (short) 10);
        boolean boolean20 = lFSR6.getClockBit();
        boolean boolean22 = lFSR6.get((int) '#');
        java.lang.String str23 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        int[] intArray9 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) (byte) 1, intArray9);
        java.lang.String str13 = lFSR12.toString();
        boolean boolean15 = lFSR12.get(22);
        boolean boolean17 = lFSR12.get((int) (short) 10);
        java.lang.Class<?> wildcardClass18 = lFSR12.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (byte) 1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) -1, intArray19);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 64, intArray15);
        boolean boolean23 = lFSR21.get(10);
        java.lang.String str24 = lFSR21.toString();
        boolean boolean25 = lFSR21.getClockBit();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{}" + "'", str24, "{}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
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
        com.thealgorithms.ciphers.a5.LFSR lFSR36 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, 22, intArray25);
        boolean boolean37 = lFSR36.clock();
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
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
        boolean boolean17 = lFSR9.getClockBit();
        boolean boolean18 = lFSR9.clock();
        java.lang.String str19 = lFSR9.toString();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, 64, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 100, intArray17);
        java.lang.Class<?> wildcardClass25 = lFSR24.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '#', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 100, intArray15);
        boolean boolean22 = lFSR21.clock();
        boolean boolean24 = lFSR21.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        int[] intArray19 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR25 = new com.thealgorithms.ciphers.a5.LFSR(10, (int) (byte) 10, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR26 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) (short) -1, intArray19);
        com.thealgorithms.ciphers.a5.LFSR lFSR27 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 1, intArray19);
        boolean boolean28 = lFSR27.getClockBit();
        java.lang.String str29 = lFSR27.toString();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "{}" + "'", str29, "{}");
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        java.lang.String str11 = lFSR9.toString();
        boolean boolean12 = lFSR9.clock();
        boolean boolean14 = lFSR9.get((int) '#');
        java.lang.String str15 = lFSR9.toString();
        boolean boolean16 = lFSR9.getClockBit();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        int[] intArray9 = new int[] { 22, (short) 10, (byte) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR10 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (short) 10, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR11 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, (int) (byte) 100, intArray9);
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = lFSR12.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[22, 10, 100]");
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', (int) (short) -1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, 1, intArray11);
        boolean boolean16 = lFSR15.getClockBit();
        java.lang.String str17 = lFSR15.toString();
        boolean boolean18 = lFSR15.getClockBit();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
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
        java.util.BitSet bitSet46 = null;
        java.util.BitSet bitSet47 = null;
        // The following exception was thrown during execution in test generation
        try {
            lFSR45.initialize(bitSet46, bitSet47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.BitSet.get(int)\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 1, 1]");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean12 = lFSR9.get(1);
        java.lang.String str13 = lFSR9.toString();
        boolean boolean14 = lFSR9.getClockBit();
        boolean boolean15 = lFSR9.getLastBit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = lFSR9.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
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
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
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
        boolean boolean36 = lFSR30.getLastBit();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) (short) 1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) -1, (int) 'a', intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray17);
        boolean boolean25 = lFSR24.getLastBit();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(64, 100, intArray15);
        boolean boolean22 = lFSR21.clock();
        boolean boolean23 = lFSR21.getClockBit();
        boolean boolean24 = lFSR21.clock();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        boolean boolean10 = lFSR6.clock();
        boolean boolean12 = lFSR6.get((int) (short) 0);
        boolean boolean13 = lFSR6.getLastBit();
        boolean boolean14 = lFSR6.clock();
        java.lang.Class<?> wildcardClass15 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.clock();
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        boolean boolean11 = lFSR6.getClockBit();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 0, intArray7);
        boolean boolean10 = lFSR9.clock();
        boolean boolean11 = lFSR9.getClockBit();
        java.lang.String str12 = lFSR9.toString();
        boolean boolean14 = lFSR9.get((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean9 = lFSR6.get(0);
        java.lang.String str10 = lFSR6.toString();
        boolean boolean12 = lFSR6.get(10);
        boolean boolean13 = lFSR6.getLastBit();
        java.lang.String str14 = lFSR6.toString();
        boolean boolean15 = lFSR6.clock();
        boolean boolean17 = lFSR6.get(64);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean8 = lFSR6.get(100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = lFSR6.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: bitIndex < 0: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (-1), intArray11);
        java.lang.Class<?> wildcardClass16 = lFSR15.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        java.lang.String str7 = lFSR6.toString();
        boolean boolean8 = lFSR6.getClockBit();
        java.lang.String str9 = lFSR6.toString();
        java.lang.String str10 = lFSR6.toString();
        java.lang.String str11 = lFSR6.toString();
        java.lang.Class<?> wildcardClass12 = lFSR6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', 0, intArray5);
        boolean boolean7 = lFSR6.clock();
        java.lang.String str8 = lFSR6.toString();
        boolean boolean9 = lFSR6.getClockBit();
        boolean boolean10 = lFSR6.clock();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean12 = lFSR6.getLastBit();
        java.lang.String str13 = lFSR6.toString();
        java.lang.String str14 = lFSR6.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) '#', (int) 'a', intArray13);
        java.lang.String str19 = lFSR18.toString();
        boolean boolean20 = lFSR18.getLastBit();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
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
        java.lang.String str20 = lFSR6.toString();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray11);
        boolean boolean16 = lFSR15.clock();
        boolean boolean17 = lFSR15.clock();
        boolean boolean18 = lFSR15.getLastBit();
        boolean boolean19 = lFSR15.clock();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 10, (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 100, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(10, 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) (byte) 1, intArray17);
        java.lang.Class<?> wildcardClass25 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        int[] intArray11 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR12 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR13 = new com.thealgorithms.ciphers.a5.LFSR(1, 100, intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(1, (int) 'a', intArray11);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR(100, 1, intArray11);
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
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean7 = lFSR6.getClockBit();
        boolean boolean9 = lFSR6.get((int) (short) 100);
        boolean boolean11 = lFSR6.get((int) ' ');
        java.lang.String str12 = lFSR6.toString();
        java.lang.String str13 = lFSR6.toString();
        boolean boolean15 = lFSR6.get((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = lFSR6.getLastBit();
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
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR6 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray5);
        boolean boolean8 = lFSR6.get((int) '4');
        java.lang.String str9 = lFSR6.toString();
        boolean boolean10 = lFSR6.getClockBit();
        java.lang.String str11 = lFSR6.toString();
        boolean boolean13 = lFSR6.get(100);
        boolean boolean14 = lFSR6.getClockBit();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (-1), intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(0, 100, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) -1, (int) 'a', intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: nbits < 0: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR8 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray7);
        com.thealgorithms.ciphers.a5.LFSR lFSR9 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray7);
        boolean boolean10 = lFSR9.getLastBit();
        boolean boolean11 = lFSR9.clock();
        boolean boolean12 = lFSR9.getClockBit();
        boolean boolean14 = lFSR9.get(100);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        int[] intArray2 = null;
        com.thealgorithms.ciphers.a5.LFSR lFSR3 = new com.thealgorithms.ciphers.a5.LFSR(22, 22, intArray2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = lFSR3.clock();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"<local2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR(64, (-1), intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 10, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 1, 1, intArray17);
        boolean boolean25 = lFSR24.clock();
        boolean boolean26 = lFSR24.clock();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 64, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR(22, (int) '#', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 0, 100, intArray17);
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
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        int[] intArray17 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (short) 1, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR22 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) 0, intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR23 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 100, (int) '4', intArray17);
        com.thealgorithms.ciphers.a5.LFSR lFSR24 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 100, (int) '4', intArray17);
        boolean boolean25 = lFSR24.clock();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        int[] intArray15 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 1, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR19 = new com.thealgorithms.ciphers.a5.LFSR(100, (int) ' ', intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR20 = new com.thealgorithms.ciphers.a5.LFSR(64, (int) (byte) 10, intArray15);
        com.thealgorithms.ciphers.a5.LFSR lFSR21 = new com.thealgorithms.ciphers.a5.LFSR(0, 0, intArray15);
        boolean boolean22 = lFSR21.getClockBit();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        int[] intArray13 = new int[] { (byte) 100, (short) 1, 1 };
        com.thealgorithms.ciphers.a5.LFSR lFSR14 = new com.thealgorithms.ciphers.a5.LFSR(0, (int) (byte) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR15 = new com.thealgorithms.ciphers.a5.LFSR((int) (short) 1, (int) (short) 0, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR16 = new com.thealgorithms.ciphers.a5.LFSR((int) (byte) 0, (int) (short) -1, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR17 = new com.thealgorithms.ciphers.a5.LFSR((int) '4', 64, intArray13);
        com.thealgorithms.ciphers.a5.LFSR lFSR18 = new com.thealgorithms.ciphers.a5.LFSR((int) ' ', 100, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1, 1]");
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
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
        boolean boolean30 = lFSR27.get(22);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }
}

