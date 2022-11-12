package HexaDecimalToBinary;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.Class<?> wildcardClass17 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.Class<?> wildcardClass13 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.Class<?> wildcardClass19 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("00000hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00000hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str30 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str32 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000hi!" + "'", str26, "00000hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000hi!" + "'", str28, "00000hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00000hi!" + "'", str30, "00000hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "00000hi!" + "'", str32, "00000hi!");
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        java.lang.Class<?> wildcardClass25 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000hi!" + "'", str26, "00000hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000000" + "'", str28, "00000000");
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("00000hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00000hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.Class<?> wildcardClass21 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000hi!" + "'", str28, "00000hi!");
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000000" + "'", str28, "00000000");
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.Class<?> wildcardClass27 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.Class<?> wildcardClass15 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.Class<?> wildcardClass13 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("00000hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00000hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("00000hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00000hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.Class<?> wildcardClass23 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str30 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str32 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000hi!" + "'", str28, "00000hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00000000" + "'", str30, "00000000");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "00000000" + "'", str32, "00000000");
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.Class<?> wildcardClass23 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.Class<?> wildcardClass15 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000hi!" + "'", str28, "00000hi!");
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        java.lang.Class<?> wildcardClass25 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.Class<?> wildcardClass19 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.Class<?> wildcardClass17 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str30 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000000" + "'", str28, "00000000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00000000" + "'", str30, "00000000");
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("");
        java.lang.Class<?> wildcardClass29 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000000" + "'", str28, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("00000hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00000hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.Class<?> wildcardClass17 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.Class<?> wildcardClass19 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("00000hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00000hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.Class<?> wildcardClass21 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.Class<?> wildcardClass19 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.Class<?> wildcardClass19 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.Class<?> wildcardClass23 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str30 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str32 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str34 = hexaDecimalToBinary0.completeDigits("");
        java.lang.Class<?> wildcardClass35 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000000" + "'", str28, "00000000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00000hi!" + "'", str30, "00000hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "00000hi!" + "'", str32, "00000hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "00000000" + "'", str34, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.Class<?> wildcardClass17 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str30 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str32 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000hi!" + "'", str26, "00000hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000000" + "'", str28, "00000000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00000000" + "'", str30, "00000000");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "00000000" + "'", str32, "00000000");
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.Class<?> wildcardClass19 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000hi!" + "'", str26, "00000hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000hi!" + "'", str28, "00000hi!");
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.Class<?> wildcardClass29 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.Class<?> wildcardClass23 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("00000hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00000hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000hi!" + "'", str26, "00000hi!");
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str30 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str32 = hexaDecimalToBinary0.completeDigits("");
        java.lang.Class<?> wildcardClass33 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000000" + "'", str28, "00000000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00000hi!" + "'", str30, "00000hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "00000000" + "'", str32, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.Class<?> wildcardClass13 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.Class<?> wildcardClass21 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.Class<?> wildcardClass27 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.Class<?> wildcardClass21 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("00000hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00000hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("00000hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00000hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("00000hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00000hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str30 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000000" + "'", str28, "00000000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00000hi!" + "'", str30, "00000hi!");
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.Class<?> wildcardClass17 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("00000hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00000hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000hi!" + "'", str26, "00000hi!");
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.Class<?> wildcardClass25 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000hi!" + "'", str26, "00000hi!");
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str30 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str32 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str34 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000000" + "'", str28, "00000000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00000000" + "'", str30, "00000000");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "00000000" + "'", str32, "00000000");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "00000hi!" + "'", str34, "00000hi!");
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("00000hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00000hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("00000hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00000hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.Class<?> wildcardClass13 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.Class<?> wildcardClass19 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("00000hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00000hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.Class<?> wildcardClass17 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.Class<?> wildcardClass23 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.Class<?> wildcardClass19 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.Class<?> wildcardClass15 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.Class<?> wildcardClass11 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.Class<?> wildcardClass17 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.Class<?> wildcardClass23 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.Class<?> wildcardClass21 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("00000hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00000hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("00000hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00000hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.Class<?> wildcardClass23 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.Class<?> wildcardClass27 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000hi!" + "'", str26, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("00000hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00000hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.Class<?> wildcardClass29 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000hi!" + "'", str28, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000hi!" + "'", str26, "00000hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000000" + "'", str28, "00000000");
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.Class<?> wildcardClass21 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000hi!" + "'", str26, "00000hi!");
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.Class<?> wildcardClass29 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000hi!" + "'", str28, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str30 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000hi!" + "'", str26, "00000hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000hi!" + "'", str28, "00000hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00000000" + "'", str30, "00000000");
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.Class<?> wildcardClass21 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("00000hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00000hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str30 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str32 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str34 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000000" + "'", str28, "00000000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00000hi!" + "'", str30, "00000hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "00000hi!" + "'", str32, "00000hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "00000hi!" + "'", str34, "00000hi!");
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.Class<?> wildcardClass25 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.Class<?> wildcardClass29 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000hi!" + "'", str26, "00000hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000000" + "'", str28, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str30 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str32 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000hi!" + "'", str26, "00000hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000hi!" + "'", str28, "00000hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00000000" + "'", str30, "00000000");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "00000hi!" + "'", str32, "00000hi!");
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000hi!" + "'", str26, "00000hi!");
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.Class<?> wildcardClass19 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.Class<?> wildcardClass15 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.Class<?> wildcardClass19 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.Class<?> wildcardClass15 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.Class<?> wildcardClass11 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        java.lang.Class<?> wildcardClass21 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("00000hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00000hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        java.lang.Class<?> wildcardClass23 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str30 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str32 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str34 = hexaDecimalToBinary0.completeDigits("hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000hi!" + "'", str28, "00000hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00000hi!" + "'", str30, "00000hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "00000hi!" + "'", str32, "00000hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "00000hi!" + "'", str34, "00000hi!");
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000hi!" + "'", str26, "00000hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000000" + "'", str28, "00000000");
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("00000hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000hi!" + "'", str28, "00000hi!");
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.Class<?> wildcardClass17 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.Class<?> wildcardClass15 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        java.lang.Class<?> wildcardClass21 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        java.lang.Class<?> wildcardClass21 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str30 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str32 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str34 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000hi!" + "'", str28, "00000hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00000hi!" + "'", str30, "00000hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "00000hi!" + "'", str32, "00000hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "00000000" + "'", str34, "00000000");
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str30 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000hi!" + "'", str26, "00000hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000000" + "'", str28, "00000000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00000hi!" + "'", str30, "00000hi!");
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.Class<?> wildcardClass13 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.Class<?> wildcardClass13 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.Class<?> wildcardClass13 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.Class<?> wildcardClass25 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000hi!" + "'", str26, "00000hi!");
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000hi!" + "'", str26, "00000hi!");
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.Class<?> wildcardClass23 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.Class<?> wildcardClass19 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("00000hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00000hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.Class<?> wildcardClass19 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000hi!" + "'", str26, "00000hi!");
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.Class<?> wildcardClass15 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.Class<?> wildcardClass23 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str30 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str32 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str34 = hexaDecimalToBinary0.completeDigits("00000hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000000" + "'", str28, "00000000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00000hi!" + "'", str30, "00000hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "00000hi!" + "'", str32, "00000hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "00000hi!" + "'", str34, "00000hi!");
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        java.lang.Class<?> wildcardClass21 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.Class<?> wildcardClass15 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000hi!" + "'", str26, "00000hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000000" + "'", str28, "00000000");
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000hi!" + "'", str26, "00000hi!");
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.Class<?> wildcardClass19 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000hi!" + "'", str28, "00000hi!");
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.Class<?> wildcardClass23 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.Class<?> wildcardClass25 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.Class<?> wildcardClass13 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str30 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str32 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000000" + "'", str28, "00000000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00000000" + "'", str30, "00000000");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "00000hi!" + "'", str32, "00000hi!");
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000hi!" + "'", str26, "00000hi!");
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.Class<?> wildcardClass15 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("00000hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000hi!" + "'", str28, "00000hi!");
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str30 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000hi!" + "'", str28, "00000hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00000hi!" + "'", str30, "00000hi!");
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        java.lang.Class<?> wildcardClass25 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str30 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.Class<?> wildcardClass33 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00000hi!" + "'", str30, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000hi!" + "'", str26, "00000hi!");
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.Class<?> wildcardClass21 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000000" + "'", str28, "00000000");
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str30 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.Class<?> wildcardClass33 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00000hi!" + "'", str30, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("00000hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00000hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str30 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000hi!" + "'", str28, "00000hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00000hi!" + "'", str30, "00000hi!");
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.Class<?> wildcardClass19 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("00000hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000hi!" + "'", str26, "00000hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000hi!" + "'", str28, "00000hi!");
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str26 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str28 = hexaDecimalToBinary0.completeDigits("");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("00000hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00000hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "00000000" + "'", str26, "00000000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00000000" + "'", str28, "00000000");
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000000" + "'", str24, "00000000");
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.Class<?> wildcardClass13 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000hi!" + "'", str10, "00000hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        // The following exception was thrown during execution in test generation
        try {
            hexaDecimalToBinary0.convert("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000000" + "'", str18, "00000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str24 = hexaDecimalToBinary0.completeDigits("00000hi!");
        hexaDecimalToBinary0.convert("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000hi!" + "'", str20, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000hi!" + "'", str22, "00000hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00000hi!" + "'", str24, "00000hi!");
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.Class<?> wildcardClass17 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000000" + "'", str14, "00000000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000hi!" + "'", str16, "00000hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str20 = hexaDecimalToBinary0.completeDigits("");
        java.lang.Class<?> wildcardClass21 = hexaDecimalToBinary0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000hi!" + "'", str6, "00000hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000hi!" + "'", str8, "00000hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00000000" + "'", str20, "00000000");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str14 = hexaDecimalToBinary0.completeDigits("hi!");
        java.lang.String str16 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str18 = hexaDecimalToBinary0.completeDigits("hi!");
        hexaDecimalToBinary0.convert("00000000");
        java.lang.String str22 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000" + "'", str4, "00000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000hi!" + "'", str12, "00000hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00000hi!" + "'", str14, "00000hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00000hi!" + "'", str18, "00000hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00000000" + "'", str22, "00000000");
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        com.thealgorithms.conversions.HexaDecimalToBinary hexaDecimalToBinary0 = new com.thealgorithms.conversions.HexaDecimalToBinary();
        java.lang.String str2 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str4 = hexaDecimalToBinary0.completeDigits("00000hi!");
        java.lang.String str6 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str8 = hexaDecimalToBinary0.completeDigits("00000000");
        java.lang.String str10 = hexaDecimalToBinary0.completeDigits("");
        java.lang.String str12 = hexaDecimalToBinary0.completeDigits("00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000" + "'", str2, "00000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000hi!" + "'", str4, "00000hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000000" + "'", str6, "00000000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00000000" + "'", str10, "00000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000" + "'", str12, "00000000");
    }
}
