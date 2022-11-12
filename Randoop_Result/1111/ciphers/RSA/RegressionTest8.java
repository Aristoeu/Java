package ciphers.RSA;

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
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        java.lang.String str9 = rSA1.decrypt("143827611740296741825726282072");
        java.lang.String str11 = rSA1.encrypt("\ufffdq\007\ufffd\t7Z");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\ufffd" + "'", str7, "\002\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\025o%" + "'", str9, "\000\ufffd\025o%");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "11642493314" + "'", str11, "11642493314");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("495");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.encrypt("Z\013\ufffd\r");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "752" + "'", str3, "752");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "267" + "'", str5, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'" + "'", str7, "'");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd" + "'", str9, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "687" + "'", str11, "687");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "22965210972217142007758068798" + "'", str15, "22965210972217142007758068798");
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '4');
        java.lang.String str9 = rSA1.encrypt("206");
        java.lang.String str11 = rSA1.encrypt("226208872463543249023298211472");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("152900825838224951269381371407");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3057753123396601" + "'", str9, "3057753123396601");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2208835534954819" + "'", str11, "2208835534954819");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "208452718049454313506583212397" + "'", str15, "208452718049454313506583212397");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("|");
        java.lang.String str11 = rSA1.decrypt("270");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.encrypt("63340691434617068610410340865");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "470" + "'", str5, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "270" + "'", str7, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "193" + "'", str9, "193");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "932133006" + "'", str15, "932133006");
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\ufffd\u0795\ufffd$");
        java.lang.String str13 = rSA1.decrypt("940746093901079842094096965328");
        java.lang.String str15 = rSA1.encrypt("1448909856");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\035" + "'", str7, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "50" + "'", str9, "50");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "392" + "'", str11, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001K" + "'", str13, "\001K");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "484" + "'", str15, "484");
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "475972836788645583021005584287" + "'", str5, "475972836788645583021005584287");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\177\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\003\ufffd\ufffd\177\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd7$:\t\ufffd");
        java.lang.String str13 = rSA1.encrypt("I");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\031\ufffd\ufffd" + "'", str7, "\002\031\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "301" + "'", str11, "301");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "202" + "'", str13, "202");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\003\ufffd\ufffd\000");
        java.lang.String str9 = rSA1.decrypt("440");
        java.lang.String str11 = rSA1.encrypt("30932174981127228049911742247");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0016" + "'", str3, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "288" + "'", str5, "288");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "340" + "'", str7, "340");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "417" + "'", str11, "417");
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("155325805838506");
        java.lang.String str11 = rSA1.encrypt("947370313855704349365862998582");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "70" + "'", str3, "70");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35340669417681924876678405702" + "'", str7, "35340669417681924876678405702");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\u0424x" + "'", str9, "\ufffd\ufffd\ufffd\ufffd\ufffd\u0424x");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "8253526506340345052427980787" + "'", str11, "8253526506340345052427980787");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("1998947500173");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u0370\ufffd");
        java.lang.String str11 = rSA1.decrypt("15028238390418345727767527777");
        java.lang.String str13 = rSA1.encrypt("X\034R\004\ufffd\ufffd\000\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("317579693760000000000");
        java.lang.String str17 = rSA1.encrypt("40072153360267034343");
        java.lang.String str19 = rSA1.encrypt("299");
        java.lang.String str21 = rSA1.decrypt("6315943415");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0016" + "'", str3, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\020" + "'", str7, "\001\020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "222" + "'", str9, "222");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001K" + "'", str11, "\001K");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "132" + "'", str13, "132");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "221" + "'", str15, "221");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "282" + "'", str17, "282");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "430" + "'", str19, "430");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("314");
        java.lang.String str5 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd3");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "138657122983399005463410071207" + "'", str3, "138657122983399005463410071207");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "191496619862218127479685274933" + "'", str5, "191496619862218127479685274933");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("1998947500173");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u0370\ufffd");
        java.lang.String str11 = rSA1.decrypt("15028238390418345727767527777");
        java.lang.String str13 = rSA1.encrypt("768443727");
        java.lang.String str15 = rSA1.decrypt("482122105302585323148995773744");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\032" + "'", str3, "\002\032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\020" + "'", str7, "\001\020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "222" + "'", str9, "222");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001K" + "'", str11, "\001K");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "234" + "'", str13, "234");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "R" + "'", str15, "R");
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.decrypt("\t\ufffd1\007\ufffd\ufffd\u0591\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?n\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002:" + "'", str3, "\002:");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.decrypt("\001\ufffd\ufffdpc");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???pc\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "477" + "'", str3, "477");
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd");
        java.lang.String str13 = rSA1.encrypt("174");
        java.lang.String str15 = rSA1.encrypt("144252953354502585977976224207");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str19 = rSA1.decrypt("934838310");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "112" + "'", str3, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "96" + "'", str5, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001" + "'", str9, "\001");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "289" + "'", str11, "289");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "214" + "'", str13, "214");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "116" + "'", str15, "116");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006\ufffd'9\r\ufffd\ufffd\ufffd\030\ufffd\ufffd" + "'", str19, "\006\ufffd'9\r\ufffd\ufffd\ufffd\030\ufffd\ufffd");
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("122987386542487");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "29278535641906038529534558959" + "'", str7, "29278535641906038529534558959");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1638580077" + "'", str11, "1638580077");
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("\002E");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\t" + "'", str3, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\f\ufffd\ufffd" + "'", str7, "\000\ufffd\f\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "66203456086901" + "'", str11, "66203456086901");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\005\ufffd\ufffd\n\ufffd\ufffd*");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "42" + "'", str3, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "24973310881134268120020360253" + "'", str7, "24973310881134268120020360253");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "560215289410273377749494530753" + "'", str11, "560215289410273377749494530753");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("243447641670302309295496962030");
        java.lang.String str15 = rSA1.encrypt("\ufffdo");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "`\034\ufffd\ufffd\ufffd\u011a\ufffd'8S" + "'", str7, "`\034\ufffd\ufffd\ufffd\u011a\ufffd'8S");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37291786593256108085875399201" + "'", str9, "37291786593256108085875399201");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "9560006961443078622109098145" + "'", str11, "9560006961443078622109098145");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "37240709157537393154496797485" + "'", str13, "37240709157537393154496797485");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "11960498567094605094474713572" + "'", str15, "11960498567094605094474713572");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.decrypt("19381198390747190176495422326");
        java.lang.String str15 = rSA1.decrypt("30");
        java.lang.String str17 = rSA1.encrypt("107");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "112" + "'", str9, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(" + "'", str13, "(");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001]" + "'", str15, "\001]");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "136" + "'", str17, "136");
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("222");
        java.lang.String str11 = rSA1.decrypt("135091294");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "185" + "'", str3, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "266" + "'", str5, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1508860312" + "'", str9, "1508860312");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd+\005" + "'", str11, "\000\ufffd\ufffd+\005");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("\0018");
        java.lang.String str17 = rSA1.encrypt("91");
        java.lang.String str19 = rSA1.decrypt("2202857551365157");
        java.lang.String str21 = rSA1.encrypt("1492432233");
        java.lang.String str23 = rSA1.decrypt("10353329666");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("\006\000\ufffd\ufffd\ufffd\ufffd\u0290");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0016" + "'", str3, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd# .\024\ufffd\031\u07aa4" + "'", str9, "\005\ufffd# .\024\ufffd\031\u07aa4");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2956466552832" + "'", str15, "2956466552832");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "672749994932560009201" + "'", str17, "672749994932560009201");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "780271610376285900994361008103" + "'", str21, "780271610376285900994361008103");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\003\ufffd\ufffdjnk#\002 " + "'", str23, "\003\ufffd\ufffdjnk#\002 ");
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("1998947500173");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u0370\ufffd");
        java.lang.String str11 = rSA1.decrypt("15028238390418345727767527777");
        java.lang.String str13 = rSA1.encrypt("X\034R\004\ufffd\ufffd\000\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("317579693760000000000");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25" + "'", str9, "25");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "294" + "'", str13, "294");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "391" + "'", str15, "391");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("304417796247364099549471429573");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2327436185" + "'", str9, "2327436185");
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        java.lang.String str9 = rSA1.decrypt("8");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "407930989990723282739866667951" + "'", str5, "407930989990723282739866667951");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8241264822143" + "'", str7, "8241264822143");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffd\u0249\ufffd" + "'", str9, "\003\ufffd\ufffd\ufffd\u0249\ufffd");
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("1998947500173");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u0370\ufffd");
        java.lang.String str11 = rSA1.decrypt("15028238390418345727767527777");
        java.lang.String str13 = rSA1.encrypt("X\034R\004\ufffd\ufffd\000\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("317579693760000000000");
        java.lang.String str17 = rSA1.encrypt("2156828580");
        java.lang.String str19 = rSA1.decrypt("361004806960609225726300111494");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0016" + "'", str3, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25" + "'", str9, "25");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "294" + "'", str13, "294");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "391" + "'", str15, "391");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "282" + "'", str17, "282");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\r" + "'", str19, "\001\r");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.decrypt("279");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "351" + "'", str7, "351");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\004\031\ufffd\ufffd\ufffda");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\002" + "'", str7, "\ufffd\002");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\u04c7" + "'", str9, "\002\ufffd\ufffd\u04c7");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6049243340" + "'", str11, "6049243340");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("478");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u039d");
        java.lang.String str15 = rSA1.encrypt("720881662483885555150199331319");
        java.lang.String str17 = rSA1.encrypt("139669731288870443998258234849");
        java.lang.String str19 = rSA1.decrypt("612");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\016\ufffd\u0550\ufffd2\002\ufffd;" + "'", str7, "\016\ufffd\u0550\ufffd2\002\ufffd;");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\\g\t\ufffd\u05ec~'" + "'", str9, "\ufffd\ufffd\\g\t\ufffd\u05ec~'");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2" + "'", str13, "2");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "410" + "'", str15, "410");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "328" + "'", str17, "328");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\007" + "'", str19, "\001\007");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("307707995715569958842130375");
        java.lang.String str7 = rSA1.encrypt("304");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\f[j");
        java.lang.String str11 = rSA1.decrypt("24913536938563019036853654452");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\017\031\ufffd&" + "'", str3, "\017\031\ufffd&");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "759329354" + "'", str5, "759329354");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1087283443" + "'", str7, "1087283443");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "92289437" + "'", str9, "92289437");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd" + "'", str11, "\ufffd\ufffd");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("558");
        java.lang.String str11 = rSA1.encrypt("248");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\001n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?n\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "285916213" + "'", str9, "285916213");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2016053929" + "'", str11, "2016053929");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("2312924388126772");
        java.lang.String str7 = rSA1.encrypt("N");
        rSA1.generateKeys(100);
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "406966423070798054186145436254" + "'", str5, "406966423070798054186145436254");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "650190514836423555072" + "'", str7, "650190514836423555072");
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str7 = rSA1.decrypt("1");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("24728158503917487987839420576");
        java.lang.String str9 = rSA1.encrypt("76953254708816336608130262493");
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\ufffd\006X\026\ufffd");
        java.lang.String str13 = rSA1.encrypt("37761667692440245568");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "47052248" + "'", str9, "47052248");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1982749211" + "'", str11, "1982749211");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "927818828" + "'", str13, "927818828");
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.encrypt("\001\ufffd\ufffd");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2060876269" + "'", str3, "2060876269");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.decrypt("160015912349121428858268699636");
        java.lang.String str11 = rSA1.encrypt("505764498321127");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "15629808557179674750489130205" + "'", str7, "15629808557179674750489130205");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\034" + "'", str9, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\034");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "24052955783840566417639619682" + "'", str11, "24052955783840566417639619682");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("419389565479692103354247293600");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd``\006\ufffd3" + "'", str7, "\003\ufffd\ufffd\ufffd\ufffd\ufffd``\006\ufffd3");
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("307707995715569958842130375");
        java.lang.String str7 = rSA1.encrypt("304");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.encrypt("4480877383687016191663601857");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd" + "'", str3, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2851575807" + "'", str5, "2851575807");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2151409202" + "'", str7, "2151409202");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "127" + "'", str11, "127");
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str5 = rSA1.encrypt("720881662483885555150199331319");
        java.lang.String str7 = rSA1.decrypt("819271931489141549926823657343");
        java.lang.String str9 = rSA1.encrypt("\ufffd0\\\ufffd\u01b4\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "216" + "'", str5, "216");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7" + "'", str9, "7");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("\002\n\ufffd\ufffd\020");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\005\n_\\\ufffd\034\ufffd\ufffdm\f");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??_\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\b\ufffd\ufffd\ufffd" + "'", str3, "\b\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "149" + "'", str7, "149");
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.encrypt("99");
        java.lang.String str13 = rSA1.encrypt("\013lf\020\ufffd\034\ufffd\ufffd\ufffd\016\ufffdah");
        java.lang.String str15 = rSA1.encrypt("\006$\f\ufffd\ufffd\ufffd\ufffd\025xP1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\001\ufffd\u05f0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdRp\r\ufffd" + "'", str7, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdRp\r\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "144762426136206881400148655049" + "'", str11, "144762426136206881400148655049");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "185939634981920178356317916874" + "'", str13, "185939634981920178356317916874");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "12935875839848048057741237870" + "'", str15, "12935875839848048057741237870");
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("205");
        java.lang.String str11 = rSA1.encrypt("211");
        java.lang.String str13 = rSA1.decrypt("289734891292401713311056387999");
        java.lang.String str15 = rSA1.decrypt("10");
        java.lang.String str17 = rSA1.encrypt("\0014");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd\002\ufffd\ufffd\u0790S" + "'", str7, "\001\ufffd\ufffd\ufffd\002\ufffd\ufffd\u0790S");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35583402576551630221" + "'", str9, "35583402576551630221");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35591581950267981457" + "'", str11, "35591581950267981457");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd.\005\ufffd\003\ufffd\ufffd\016SUzu" + "'", str13, "\006\ufffd.\005\ufffd\003\ufffd\ufffd\016SUzu");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\030P2" + "'", str15, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\030P2");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "29218112" + "'", str17, "29218112");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("393");
        java.lang.String str7 = rSA1.decrypt("227022896246510918381181022856");
        java.lang.String str9 = rSA1.decrypt("8");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("7591156848866311702672535389");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str21 = rSA1.encrypt("\ufffd\ufffd\ufffd\ud8b2\udc06/|");
        java.lang.String str23 = rSA1.decrypt("615955490989244240625");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "111" + "'", str5, "111");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "y" + "'", str7, "y");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001F" + "'", str9, "\001F");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\013\ufffd\ufffd\ufffd" + "'", str15, "\b\013\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "254" + "'", str21, "254");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002\020" + "'", str23, "\002\020");
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdK," + "'", str9, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdK,");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1988383234505091" + "'", str13, "1988383234505091");
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.decrypt("461");
        java.lang.String str17 = rSA1.encrypt("208642166923338001575549632629");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "478" + "'", str7, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\177" + "'", str15, "\177");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "299" + "'", str17, "299");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("66");
        java.lang.String str19 = rSA1.encrypt("646");
        java.lang.String str21 = rSA1.encrypt("\001u");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "l\016\ufffd\ufffd\031\ufffd\006" + "'", str13, "l\016\ufffd\ufffd\031\ufffd\006");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\ufffd\ufffd" + "'", str17, "\005\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1793007709256208" + "'", str19, "1793007709256208");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2731462377968625" + "'", str21, "2731462377968625");
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("703153339289949437747864939069");
        java.lang.String str13 = rSA1.encrypt("167");
        java.lang.String str15 = rSA1.encrypt("188289157854256346200468674953");
        java.lang.String str17 = rSA1.decrypt("9487647327245225278764966838");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001f" + "'", str3, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffdg" + "'", str11, "\006\ufffd\ufffd\ufffd\ufffdg");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2053110532239992" + "'", str13, "2053110532239992");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1010852217416620" + "'", str15, "1010852217416620");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\013\ufffd\ufffdE4f" + "'", str17, "\013\ufffd\ufffdE4f");
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\035\ufffd\ufffd\ufffd\ufffd\ufffdg");
        java.lang.String str13 = rSA1.encrypt("1184438612620945");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "219" + "'", str9, "219");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "318" + "'", str11, "318");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "55" + "'", str13, "55");
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\005\ufffd\ufffd\n\ufffd\ufffd*");
        java.lang.String str13 = rSA1.decrypt("1996568178688");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "357" + "'", str3, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "37695224586924992221081514034" + "'", str7, "37695224586924992221081514034");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "412209993463170125868834189614" + "'", str11, "412209993463170125868834189614");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("\002\u028e\r\ufffd\ufffd\f\ufffd\ufffd");
        java.lang.String str13 = rSA1.decrypt("211");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\f\n\025\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "50334980593118017863872015613" + "'", str7, "50334980593118017863872015613");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "50334980593118017863872015613" + "'", str9, "50334980593118017863872015613");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "786385755947651987853215881976" + "'", str11, "786385755947651987853215881976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t\ufffd\"\ufffd\ufffd\ufffd\ufffd\ufffd\001" + "'", str13, "\t\ufffd\"\ufffd\ufffd\ufffd\ufffd\ufffd\001");
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.decrypt("39227321947341666623299176560");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "108612409902815460698468070915" + "'", str5, "108612409902815460698468070915");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdW" + "'", str7, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdW");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\ufffd\u0795\ufffd$");
        java.lang.String str13 = rSA1.encrypt("380");
        java.lang.String str15 = rSA1.encrypt("587");
        java.lang.String str17 = rSA1.encrypt("\007\ufffd\ufffdR*\035(`e");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "D" + "'", str7, "D");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "90" + "'", str9, "90");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "390" + "'", str11, "390");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "144" + "'", str13, "144");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "311" + "'", str15, "311");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "346" + "'", str17, "346");
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "473" + "'", str5, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "167" + "'", str7, "167");
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.decrypt("39227321947341666623299176560");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "642925439627126556866488948498" + "'", str5, "642925439627126556866488948498");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("|");
        java.lang.String str13 = rSA1.decrypt("29339648412823630308726258195");
        java.lang.String str15 = rSA1.encrypt("24829636972784436289623304425");
        java.lang.String str17 = rSA1.decrypt("1757553155773477");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "29316250624" + "'", str11, "29316250624");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\001\ufffd\ufffd\ufffd%" + "'", str13, "\005\ufffd\001\ufffd\ufffd\ufffd%");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2094956586142660" + "'", str15, "2094956586142660");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\b\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd7$:\t\ufffd");
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\001\003\ufffd\016\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5" + "'", str3, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "&\025\ufffd" + "'", str7, "&\025\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "167" + "'", str11, "167");
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("582");
        java.lang.String str13 = rSA1.decrypt("52521875");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\r\ufffdK" + "'", str7, "\002\r\ufffdK");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2012554159" + "'", str9, "2012554159");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3675066503" + "'", str11, "3675066503");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ni#." + "'", str13, "ni#.");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("461");
        java.lang.String str9 = rSA1.encrypt("\005");
        java.lang.String str11 = rSA1.encrypt("O");
        java.lang.String str13 = rSA1.encrypt("4084101");
        java.lang.String str15 = rSA1.encrypt("502");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\f\ufffd\ufffd\ufffd" + "'", str7, "\f\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3125" + "'", str9, "3125");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3077056399" + "'", str11, "3077056399");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4691286489" + "'", str13, "4691286489");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10317982175" + "'", str15, "10317982175");
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("461");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2246141488" + "'", str9, "2246141488");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "49" + "'", str13, "49");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("\002\u028e\r\ufffd\ufffd\f\ufffd\ufffd");
        java.lang.String str13 = rSA1.decrypt("211");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.decrypt("3799685695");
        java.lang.String str19 = rSA1.encrypt("242");
        java.lang.String str21 = rSA1.encrypt("382");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "777259619175980634021376111447" + "'", str11, "777259619175980634021376111447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\0032\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\0032\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\u0640\ufffd\ufffd\ufffd\0351\001" + "'", str17, "\001\ufffd\u0640\ufffd\ufffd\ufffd\0351\001");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "273538835379743155872028642663" + "'", str19, "273538835379743155872028642663");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "368285595907725251867843556303" + "'", str21, "368285595907725251867843556303");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        java.lang.String str9 = rSA1.decrypt("107");
        java.lang.String str11 = rSA1.decrypt("40059718235344279847714872762");
        java.lang.String str13 = rSA1.decrypt("614");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002." + "'", str3, "\002.");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "769" + "'", str5, "769");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "765" + "'", str7, "765");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\002\001");
        java.lang.String str13 = rSA1.encrypt("\001\037\ufffd\031\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.decrypt("3258273441");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffdX" + "'", str7, "\001\ufffdX");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd" + "'", str9, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3855964929" + "'", str11, "3855964929");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "145775497" + "'", str13, "145775497");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\034\ufffdZA" + "'", str15, "\001\034\ufffdZA");
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("465270144019721");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("8");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\u077f\ufffd\ufffd");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000" + "'", str3, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "935" + "'", str5, "935");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "95" + "'", str7, "95");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\031" + "'", str11, "\031");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "507" + "'", str13, "507");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("703153339289949437747864939069");
        java.lang.String str13 = rSA1.encrypt("167");
        java.lang.String str15 = rSA1.encrypt("D");
        java.lang.String str17 = rSA1.encrypt("1667522954413744");
        java.lang.String str19 = rSA1.encrypt("576");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A6?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001G" + "'", str3, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\255" + "'", str7, "\000\ufffd\ufffd\255");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\006\b\ufffd" + "'", str11, "\002\ufffd\006\b\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "300026613216208" + "'", str13, "300026613216208");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1453933568" + "'", str15, "1453933568");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1224064299216538" + "'", str17, "1224064299216538");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1613175488540634" + "'", str19, "1613175488540634");
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "269" + "'", str3, "269");
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.decrypt("314");
        java.lang.String str15 = rSA1.encrypt("\001\037\ufffd\031\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("\005\ufffd\ufffd\u0641\ufffd\037I\\");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "547" + "'", str9, "547");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "159" + "'", str15, "159");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "182" + "'", str17, "182");
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("336011552384423252582675852");
        java.lang.String str11 = rSA1.encrypt("47777950521712127746591213977");
        java.lang.String str13 = rSA1.decrypt("258265091322468553983668563257");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\032" + "'", str3, "\002\032");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "769" + "'", str5, "769");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "806" + "'", str7, "806");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd" + "'", str9, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "125" + "'", str11, "125");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003U" + "'", str13, "\003U");
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("\003e\006\ufffdi");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5120950478" + "'", str7, "5120950478");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("166");
        java.lang.String str19 = rSA1.encrypt("483");
        java.lang.String str21 = rSA1.encrypt("285");
        java.lang.String str23 = rSA1.decrypt("351");
        java.lang.String str25 = rSA1.decrypt("182939750793257963236342034709");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O" + "'", str5, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "416" + "'", str7, "416");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "287" + "'", str9, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffdA\004\017\ufffd\ufffd\ufffd\006\ufffd" + "'", str13, "\ufffdA\004\017\ufffd\ufffd\ufffd\006\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "478030247577251" + "'", str17, "478030247577251");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1624363284231356" + "'", str19, "1624363284231356");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1916746184000438" + "'", str21, "1916746184000438");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd\ufffd\ufffd\002\027{" + "'", str23, "\001\ufffd\ufffd\ufffd\002\027{");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\003\ufffd\ufffd\026" + "'", str25, "\003\ufffd\ufffd\026");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "112" + "'", str9, "112");
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("|");
        java.lang.String str11 = rSA1.decrypt("317201802686979902757");
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "576" + "'", str5, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "306" + "'", str7, "306");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "186" + "'", str9, "186");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\035" + "'", str11, "\001\035");
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("518");
        java.lang.String str11 = rSA1.decrypt("208642166923338001575549632629");
        java.lang.String str13 = rSA1.decrypt("214069497769339045003900891766");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.encrypt("73");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "542562609" + "'", str9, "542562609");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd" + "'", str11, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd|/" + "'", str13, "\006\ufffd|/");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "276" + "'", str17, "276");
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("314");
        java.lang.String str5 = rSA1.decrypt("211");
        java.lang.String str7 = rSA1.encrypt("40208053863613346450978315343");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\ufffd\ufffdV");
        java.lang.String str11 = rSA1.decrypt("20634691505708172944605810691");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "407732752987485027041275550353" + "'", str3, "407732752987485027041275550353");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\006\ufffd\ufffd\ufffd\007\f\ufffd" + "'", str5, "\001\006\ufffd\ufffd\ufffd\007\f\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "203183205703158958038635490070" + "'", str7, "203183205703158958038635490070");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "364241922746700422001032629590" + "'", str9, "364241922746700422001032629590");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd95\016\002)kg<\023 " + "'", str11, "\006\ufffd\ufffd95\016\002)kg<\023 ");
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\007\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "473" + "'", str5, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "154" + "'", str7, "154");
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("703153339289949437747864939069");
        java.lang.String str13 = rSA1.encrypt("167");
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.decrypt("5616649151");
        java.lang.String str19 = rSA1.encrypt("1739946898496621");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\001" + "'", str7, "\001\ufffd\ufffd\001");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\037\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffd\037\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "463602371247164" + "'", str13, "463602371247164");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "bQ2+" + "'", str17, "bQ2+");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "346676331" + "'", str19, "346676331");
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("1611067079503803");
        java.lang.String str17 = rSA1.decrypt("910748699");
        java.lang.String str19 = rSA1.encrypt("35039915204721349358906154439");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "l" + "'", str3, "l");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd\017\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffd\ufffd\017\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "448352330662013617232732932648" + "'", str15, "448352330662013617232732932648");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\b\ufffd\026\ufffd\ufffd\ufffdi\r\ufffd" + "'", str17, "\b\ufffd\026\ufffd\ufffd\ufffdi\r\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "109145967610607048816621399106" + "'", str19, "109145967610607048816621399106");
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("66");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\030\ufffd\ufffd\ufffdt\004\ufffd\ufffd" + "'", str13, "\030\ufffd\ufffd\ufffdt\004\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\ufffd\024z\030" + "'", str17, "\004\ufffd\ufffd\024z\030");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("516");
        java.lang.String str5 = rSA1.decrypt("3541590856");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("425");
        java.lang.String str13 = rSA1.encrypt("329964049132614116993653227507");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\006\ufffd\023\u02ae\ufffde\031\ufffd\ufffd" + "'", str3, "\006\ufffd\023\u02ae\ufffde\031\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\003\007\ufffd\ufffd\ufffd\u0499\ufffd\ufffd\ufffd" + "'", str5, "\003\007\ufffd\ufffd\ufffd\u0499\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "101" + "'", str13, "101");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("393");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32" + "'", str7, "32");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "18" + "'", str9, "18");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$\t\ufffd\ufffd\ufffdD6\177\ufffd'" + "'", str13, "$\t\ufffd\ufffd\ufffdD6\177\ufffd'");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1672587584347178" + "'", str17, "1672587584347178");
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\037\ufffd\027\ufffd\ufffdq5");
        java.lang.String str13 = rSA1.decrypt("2635132195937723");
        java.lang.String str15 = rSA1.decrypt("698");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\u01e0\ufffd" + "'", str9, "\004\u01e0\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1216070675" + "'", str11, "1216070675");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\031\ufffd\ufffd" + "'", str13, "\000\ufffd\031\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\035Y" + "'", str15, "\ufffd\035Y");
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("12856024970639395620261580662");
        java.lang.String str7 = rSA1.decrypt("5411392559");
        java.lang.String str9 = rSA1.encrypt("{");
        rSA1.generateKeys(10);
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15426097063093181259359440952" + "'", str3, "15426097063093181259359440952");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "57372341020993604959915339903" + "'", str5, "57372341020993604959915339903");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\034\u02c3\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd\034\u02c3\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "28153056843" + "'", str9, "28153056843");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("66");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str21 = rSA1.encrypt("408");
        java.lang.String str23 = rSA1.encrypt("81");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u02f3\ufffd\023\ufffd\ufffd\r\ufffd\023\n" + "'", str13, "\u02f3\ufffd\023\ufffd\ufffd\r\ufffd\023\n");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\ufffd\ufffd\022" + "'", str17, "\004\ufffd\ufffd\ufffd\022");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "836652344560982100551946894450" + "'", str21, "836652344560982100551946894450");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "615955490989244240625" + "'", str23, "615955490989244240625");
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("2312924388126772");
        java.lang.String str7 = rSA1.encrypt("N");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("102874182579683886317230569348");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "373793513021427636969110665547" + "'", str5, "373793513021427636969110665547");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "17565568854912" + "'", str7, "17565568854912");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "489250101280236084618204180708" + "'", str11, "489250101280236084618204180708");
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.decrypt("679");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001@" + "'", str7, "\001@");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "F" + "'", str13, "F");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1208902895495334527");
        java.lang.String str7 = rSA1.encrypt("\001\n+\f\ufffd\004\ufffd\ufffd\006\ufffd\ufffd");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "139" + "'", str5, "139");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "219" + "'", str7, "219");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("\002R");
        rSA1.generateKeys((int) '#');
        java.lang.String str19 = rSA1.encrypt("\ufffd\ufffd\036");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002u" + "'", str3, "\002u");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\013\ufffd\031\ufffd\u0147\ufffd\u0117)" + "'", str9, "\013\ufffd\031\ufffd\u0147\ufffd\u0117)");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "209584584" + "'", str15, "209584584");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "3701661477" + "'", str19, "3701661477");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("461");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.decrypt("581261998105623912352259846590");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd{\031" + "'", str7, "\000\ufffd\ufffd{\031");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "118140127" + "'", str9, "118140127");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "49" + "'", str13, "49");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffd\255\016\ufffd\ufffd\020" + "'", str17, "\003\ufffd\ufffd\255\016\ufffd\ufffd\020");
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("4084101");
        java.lang.String str9 = rSA1.encrypt("6901296438808693457125536937");
        java.lang.String str11 = rSA1.encrypt("\007\004\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "197" + "'", str7, "197");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "335" + "'", str9, "335");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "214" + "'", str11, "214");
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.decrypt("2202857551365157");
        java.lang.String str7 = rSA1.encrypt("409247107494479");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd1m" + "'", str5, "\ufffd1m");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2274932630" + "'", str7, "2274932630");
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("1571893042486033");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "473" + "'", str5, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.decrypt("389593972886249515515605564460");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "752" + "'", str3, "752");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "267" + "'", str5, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'" + "'", str7, "'");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd" + "'", str9, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "8" + "'", str11, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007WP\032\b\u05a7\ufffd\001\ufffdQW" + "'", str15, "\007WP\032\b\u05a7\ufffd\001\ufffdQW");
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.decrypt("8642470663");
        java.lang.String str5 = rSA1.decrypt("9939232264");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p<\177\ufffd*y7\003\u074dH" + "'", str3, "p<\177\ufffd*y7\003\u074dH");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str5, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("693");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.decrypt("331");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "13748702214449098346602615689" + "'", str3, "13748702214449098346602615689");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "30244942623910950063284157968" + "'", str5, "30244942623910950063284157968");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd.(\r\u049a\ufffd\ufffd\ufffd" + "'", str11, "\000\ufffd\ufffd.(\r\u049a\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("613");
        rSA1.generateKeys((int) ' ');
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "87" + "'", str3, "87");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\0024" + "'", str7, "\0024");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3" + "'", str11, "3");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\002\001");
        java.lang.String str13 = rSA1.encrypt("\001\037\ufffd\031\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("\002\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\u0758\ufffd\ufffd" + "'", str7, "\000\u0758\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\n\ufffd" + "'", str9, "\001\ufffd\n\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3068370906" + "'", str11, "3068370906");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7934985736" + "'", str13, "7934985736");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6988098229" + "'", str15, "6988098229");
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\u07ba\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "888560282133787377730650038537" + "'", str5, "888560282133787377730650038537");
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("\023\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str7 = rSA1.decrypt("37687704605112457902789117609");
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\\\ufffd|");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\\C?|\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4577506583085765225771328658" + "'", str5, "4577506583085765225771328658");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\u0208\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd\ufffd\ufffd\u0208\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.encrypt("I\\\ufffd\031");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "56181887" + "'", str7, "56181887");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "299" + "'", str11, "299");
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("4");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000" + "'", str7, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "86" + "'", str9, "86");
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("205");
        java.lang.String str11 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str13 = rSA1.decrypt("373");
        java.lang.String str15 = rSA1.decrypt("322134328841305854994100193972");
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffdX\033RT\031-" + "'", str7, "\000\ufffd\ufffd\ufffd\ufffdX\033RT\031-");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35583402576551630221" + "'", str9, "35583402576551630221");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "495900774288658352177619026678" + "'", str11, "495900774288658352177619026678");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\003\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\001\ufffd\ufffd\003\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\u06f1\u07de7D;4\030\ufffd" + "'", str15, "\002\u06f1\u07de7D;4\030\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        java.lang.String str15 = rSA1.encrypt("875");
        java.lang.String str17 = rSA1.decrypt("392170649013389");
        rSA1.generateKeys(10);
        java.lang.String str21 = rSA1.decrypt("1823237236");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u0239\ufffd\ufffd\027\ufffd" + "'", str13, "\u0239\ufffd\ufffd\027\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "13325745802052602459624923067" + "'", str15, "13325745802052602459624923067");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\021\ufffd\ufffdw\013\ufffd\021\ufffd\ufffdE" + "'", str17, "\021\ufffd\ufffdw\013\ufffd\021\ufffd\ufffdE");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\027" + "'", str21, "\001\027");
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.decrypt("1091385417287759808405208588958");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("361558751188445895040012700015");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1998947500173" + "'", str7, "1998947500173");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\020\ufffd\ufffd\034\025\ufffd4" + "'", str9, "\ufffd\020\ufffd\ufffd\034\025\ufffd4");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1020467428349238" + "'", str13, "1020467428349238");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("\001\ufffd_\n\027\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1667173753" + "'", str5, "1667173753");
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("12856024970639395620261580662");
        java.lang.String str7 = rSA1.decrypt("5411392559");
        java.lang.String str9 = rSA1.encrypt("{");
        rSA1.generateKeys((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "18049327262408775271647367350" + "'", str3, "18049327262408775271647367350");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "27611704617308508625810788322" + "'", str5, "27611704617308508625810788322");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\006A\036\ufffd\ufffd\ufffd\ufffd\ufffd\002\ufffdR" + "'", str7, "\000\ufffd\006A\036\ufffd\ufffd\ufffd\ufffd\ufffd\002\ufffdR");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "28153056843" + "'", str9, "28153056843");
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.encrypt("616");
        java.lang.String str13 = rSA1.encrypt("\001)");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\017\004\ufffd\ufffd" + "'", str7, "\017\004\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "42675169707052653203633282666" + "'", str11, "42675169707052653203633282666");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "203842691587258713" + "'", str13, "203842691587258713");
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("1571893042486033");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "576" + "'", str5, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("39454960305471");
        java.lang.String str11 = rSA1.encrypt("28810958726693343186799777157");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003]\031\ufffd\\\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\003]\031\ufffd\\\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "43095012626374298918005979010" + "'", str11, "43095012626374298918005979010");
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("4089374768");
        java.lang.String str5 = rSA1.encrypt("\000\ufffd\u06d9\003");
        java.lang.String str7 = rSA1.encrypt("127038516285899548678629729898");
        java.lang.String str9 = rSA1.encrypt("10042235326062642467289362197");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001B" + "'", str3, "\001B");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "111" + "'", str5, "111");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "318" + "'", str7, "318");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "162" + "'", str9, "162");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.encrypt("48524739602976");
        java.lang.String str13 = rSA1.encrypt("172220326272323247298100382231");
        java.lang.String str15 = rSA1.decrypt("539855473183136212072291450591");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\u03ad\ufffd\ufffd\ufffdU" + "'", str7, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\u03ad\ufffd\ufffd\ufffdU");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "447698745032933047779891888087" + "'", str11, "447698745032933047779891888087");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "605993470251704424346081943384" + "'", str13, "605993470251704424346081943384");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\n\000\ufffd+\006\ufffd\ufffd\ufffd" + "'", str15, "\001\ufffd\ufffd\n\000\ufffd+\006\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str5 = rSA1.decrypt("80");
        java.lang.String str7 = rSA1.encrypt("184");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "851" + "'", str7, "851");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        java.lang.String str9 = rSA1.decrypt("107");
        rSA1.generateKeys(100);
        java.lang.String str13 = rSA1.decrypt("418739768099769983098062928547");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "251" + "'", str7, "251");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "z" + "'", str9, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\u031d\ufffd\007\u879c\ufffd\034\ufffd" + "'", str13, "\007\u031d\ufffd\007\u879c\ufffd\034\ufffd");
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "616" + "'", str7, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "101" + "'", str11, "101");
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001W" + "'", str5, "\001W");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "243" + "'", str9, "243");
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("958913602649032");
        java.lang.String str13 = rSA1.decrypt("322206248827960928498686998334");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "875" + "'", str5, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "680" + "'", str7, "680");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "X" + "'", str11, "X");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "w" + "'", str13, "w");
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("160015912349121428858268699636");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "381933003684507079885794312857" + "'", str11, "381933003684507079885794312857");
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("731550677551533714083843213025");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "875" + "'", str5, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "160" + "'", str11, "160");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.encrypt("228013474449632847102912946578");
        java.lang.String str9 = rSA1.decrypt("42988629419629811268004412533");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001l" + "'", str3, "\001l");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "498" + "'", str7, "498");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("302478007679515165391351820133");
        java.lang.String str15 = rSA1.encrypt("21262565530067871612812451046");
        java.lang.String str17 = rSA1.decrypt("490");
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "236" + "'", str3, "236");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\032" + "'", str5, "\001\032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "760059686922360126408682730577" + "'", str11, "760059686922360126408682730577");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "317730187617509206433018473914" + "'", str13, "317730187617509206433018473914");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "331571933370804952578575616986" + "'", str15, "331571933370804952578575616986");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\ufffd\177\ufffd\ufffd&1" + "'", str17, "\001\ufffd\ufffd\ufffd\177\ufffd\ufffd&1");
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("2063650974266313");
        java.lang.String str5 = rSA1.decrypt("333016050965267866760702441046");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "650380965459160657568908722630" + "'", str3, "650380965459160657568908722630");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t\ufffd\020\ufffd\ufffd\021\ufffd\ufffd\ufffd\022" + "'", str5, "\t\ufffd\020\ufffd\ufffd\021\ufffd\ufffd\ufffd\022");
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("307707995715569958842130375");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str9 = rSA1.encrypt("128");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u01f8u" + "'", str3, "\u01f8u");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "715436842" + "'", str5, "715436842");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "297" + "'", str9, "297");
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        java.lang.String str9 = rSA1.encrypt("\f\ufffdx");
        java.lang.String str11 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd\r\ufffd\u0737\037<");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\032\031\ufffd" + "'", str7, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\032\031\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "455784598043500286567602785401" + "'", str9, "455784598043500286567602785401");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "560431746869525689134837272831" + "'", str11, "560431746869525689134837272831");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("56181887");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "13045338514005148586202370848" + "'", str7, "13045338514005148586202370848");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "16915485538040479984353291969" + "'", str9, "16915485538040479984353291969");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\002u");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("1120365802");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "490" + "'", str3, "490");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "196" + "'", str7, "196");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "i" + "'", str11, "i");
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("387");
        java.lang.String str9 = rSA1.decrypt("1229323393739314");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd\036\ufffd\ufffd\ufffd@" + "'", str7, "\ufffd\ufffd\ufffd\036\ufffd\ufffd\ufffd@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\017\ufffd\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd" + "'", str9, "\005\017\ufffd\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '#');
        java.lang.String str9 = rSA1.encrypt("495");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1097490895" + "'", str9, "1097490895");
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.encrypt("\023\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "499283321834358762514091267246" + "'", str5, "499283321834358762514091267246");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004\ufffd\ufffd\u0344\ufffd\ufffd\f\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\004\ufffd\ufffd\u0344\ufffd\ufffd\f\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "15029431732234062799261703386" + "'", str11, "15029431732234062799261703386");
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str11 = rSA1.encrypt("\002\ufffd>");
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\ufffd\ufffd\ufffd\ufffd~3" + "'", str7, "\r\ufffd\ufffd\ufffd\ufffd~3");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "22324597735468343039910778394" + "'", str9, "22324597735468343039910778394");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25904693638261902345894497242" + "'", str11, "25904693638261902345894497242");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        java.lang.String str5 = rSA1.decrypt("50334980593118017863872015613");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "477" + "'", str3, "477");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("478");
        java.lang.String str11 = rSA1.encrypt("488");
        java.lang.String str13 = rSA1.decrypt("126");
        java.lang.String str15 = rSA1.decrypt("381018392633645705650223906599");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\ufffd\025\r\ufffd,\033\ufffd\ufffd\r" + "'", str7, "\005\ufffd\025\r\ufffd,\033\ufffd\ufffd\r");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\035\ufffd\ufffd\ufffd\ufffd\"\ufffd\037fS5c" + "'", str9, "\035\ufffd\ufffd\ufffd\ufffd\"\ufffd\037fS5c");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "9197052655592607508577364799" + "'", str11, "9197052655592607508577364799");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\001\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\034\ufffd\ufffd\ufffd\ufffdS\004\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\034\ufffd\ufffd\ufffd\ufffdS\004\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("302478007679515165391351820133");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "185" + "'", str3, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "I" + "'", str7, "I");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "149069172450807282969300747646" + "'", str11, "149069172450807282969300747646");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "463190861977257013822670282784" + "'", str13, "463190861977257013822670282784");
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("393");
        java.lang.String str7 = rSA1.decrypt("227022896246510918381181022856");
        java.lang.String str9 = rSA1.decrypt("8");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\t\016\ufffd\030\ufffd\ufffd\ufffdL\021\021\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "553" + "'", str5, "553");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\037" + "'", str7, "\037");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd" + "'", str9, "\002\ufffd");
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("\f\ufffd\ufffd\ufffd\ufffd\u061d\ufffd\u06fe");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "308" + "'", str3, "308");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "16709740308023091916694367193" + "'", str7, "16709740308023091916694367193");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5296804613737915130500131542" + "'", str9, "5296804613737915130500131542");
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("\002\u028e\r\ufffd\ufffd\f\ufffd\ufffd");
        java.lang.String str13 = rSA1.decrypt("211");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.decrypt("3799685695");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "701088784060228042574177659113" + "'", str11, "701088784060228042574177659113");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\034\ufffd\021\ufffd" + "'", str13, "\b\ufffd\ufffd\ufffd\ufffd\034\ufffd\021\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\002\n\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\003\002\n\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("z");
        java.lang.String str17 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str19 = rSA1.encrypt("\003\021\ufffd");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd,\n\ufffd" + "'", str9, "\002\ufffd\ufffd\ufffd\ufffd,\n\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "402271083010688" + "'", str15, "402271083010688");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "89657892602608674699189889284" + "'", str17, "89657892602608674699189889284");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "348915302336187188429303818426" + "'", str19, "348915302336187188429303818426");
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("166");
        rSA1.generateKeys((int) '#');
        java.lang.String str21 = rSA1.decrypt("420302657462966387311701231107");
        java.lang.String str23 = rSA1.encrypt("163");
        java.lang.String str25 = rSA1.decrypt("277");
        java.lang.String str27 = rSA1.encrypt("\b\035j\013\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str29 = rSA1.encrypt("2951314786");
        java.lang.String str31 = rSA1.decrypt("483");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\026\034\ufffd\ufffd\u0418\027\ufffd\ufffd" + "'", str13, "\026\034\ufffd\ufffd\u0418\027\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "969114679397742" + "'", str17, "969114679397742");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd\ufffd" + "'", str21, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4912687704" + "'", str23, "4912687704");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\002\ufffd(" + "'", str25, "\002\ufffd(");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "9839850421" + "'", str27, "9839850421");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "9308629766" + "'", str29, "9308629766");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\ufffd9" + "'", str31, "\ufffd9");
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("5824490359974973208230734176");
        java.lang.String str7 = rSA1.encrypt("101185047241793091118311718882");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str3, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3022997331" + "'", str5, "3022997331");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1005018150" + "'", str7, "1005018150");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("703153339289949437747864939069");
        java.lang.String str13 = rSA1.encrypt("167");
        java.lang.String str15 = rSA1.decrypt("1530678394");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\032\ufffd$\030\ufffd\ufffd\u02c3\ufffd\ufffd{");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffdyc" + "'", str7, "\ufffdyc");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\ufffd\ufffd\ufffd\177\ufffd" + "'", str11, "\t\ufffd\ufffd\ufffd\177\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "636097676309885" + "'", str13, "636097676309885");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\"\ufffd\003\ufffd\006\ufffd" + "'", str15, "\003\"\ufffd\003\ufffd\006\ufffd");
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\002\001");
        java.lang.String str13 = rSA1.decrypt("328805791735498462601197839334");
        java.lang.String str15 = rSA1.decrypt("61");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5" + "'", str3, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd]\034" + "'", str7, "\000\ufffd\ufffd]\034");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd\ufffd" + "'", str9, "\006\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "9586899411" + "'", str11, "9586899411");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffdd" + "'", str13, "\001\ufffd\ufffd\ufffdd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\001\ufffd" + "'", str15, "\ufffd\001\ufffd");
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd7$:\t\ufffd");
        java.lang.String str13 = rSA1.encrypt("I");
        java.lang.String str15 = rSA1.decrypt("189");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd" + "'", str7, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "409" + "'", str11, "409");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "261" + "'", str13, "261");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002F" + "'", str15, "\002F");
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("393");
        java.lang.String str7 = rSA1.decrypt("227022896246510918381181022856");
        java.lang.String str9 = rSA1.decrypt("8");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.decrypt("86");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "204" + "'", str5, "204");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd)" + "'", str13, "\000\ufffd\ufffd\ufffd)");
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.decrypt("394");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("508568281192315545547800065020");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "346" + "'", str3, "346");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":" + "'", str5, ":");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "327647006842722790186748575868" + "'", str9, "327647006842722790186748575868");
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.decrypt("171");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.encrypt("\001\ufffd\ufffd");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\n\ufffdxGnh\027\025\027\ufffd\036\ufffd" + "'", str11, "\001\n\ufffdxGnh\027\025\027\ufffd\036\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1282776635" + "'", str15, "1282776635");
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("693");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "33562394575160520077" + "'", str3, "33562394575160520077");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "44874627577612233003" + "'", str5, "44874627577612233003");
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("946669947");
        java.lang.String str7 = rSA1.encrypt("414601987065913579031306059745");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\013" + "'", str5, "\001\013");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "392" + "'", str7, "392");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.decrypt("314");
        java.lang.String str15 = rSA1.encrypt("\001\037\ufffd\031\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.decrypt("415093244113222621604578324165");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "509" + "'", str9, "509");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "83" + "'", str15, "83");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\ufffd\u0795\ufffd$");
        java.lang.String str13 = rSA1.encrypt("380");
        java.lang.String str15 = rSA1.encrypt("587");
        java.lang.String str17 = rSA1.decrypt("342");
        java.lang.String str19 = rSA1.encrypt("\001\u02ec\ufffd\ufffdb");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "160" + "'", str9, "160");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "236" + "'", str11, "236");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "434" + "'", str13, "434");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "258" + "'", str15, "258");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "392" + "'", str19, "392");
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("693");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.decrypt("331");
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\032\ufffd=W\033\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "38845441081807535027694470261" + "'", str3, "38845441081807535027694470261");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "23919757991091435439244711332" + "'", str5, "23919757991091435439244711332");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\u48f9\ufffd\ufffdr4" + "'", str11, "\001\ufffd\u48f9\ufffd\ufffdr4");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "36053609707436491514206433233" + "'", str13, "36053609707436491514206433233");
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\005\002\ufffd\ufffdid");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "531" + "'", str7, "531");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "397" + "'", str11, "397");
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\037\ufffd\027\ufffd\ufffdq5");
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "267" + "'", str5, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u03b5\ufffd" + "'", str9, "\u03b5\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2104869360" + "'", str11, "2104869360");
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\ufffd\ufffd\ufffd\u5b07\ufffd\006\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"C\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("2445186040379015");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7082946282" + "'", str11, "7082946282");
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "267" + "'", str5, "267");
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.encrypt("\005\ufffd\ufffd\u0641\ufffd\037I\\");
        java.lang.String str9 = rSA1.encrypt("\ufffd\031)");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "181" + "'", str5, "181");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "101" + "'", str7, "101");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "94" + "'", str9, "94");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.decrypt("166");
        java.lang.String str13 = rSA1.encrypt("483");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O" + "'", str5, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "416" + "'", str7, "416");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "287" + "'", str9, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\025" + "'", str11, "\025");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "81" + "'", str13, "81");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.decrypt("171");
        java.lang.String str13 = rSA1.decrypt("236");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("361024989561324804339721800250");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffdE\005\u48ce\ufffd(\032" + "'", str11, "\001\ufffd\ufffd\ufffdE\005\u48ce\ufffd(\032");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\026\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\026\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\u05c9\ufffd\r\ufffd\u02ee\u02ba\020" + "'", str17, "\ufffd\u05c9\ufffd\r\ufffd\u02ee\u02ba\020");
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.decrypt("616");
        java.lang.String str7 = rSA1.decrypt("315");
        java.lang.String str9 = rSA1.encrypt("217");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\006" + "'", str3, "\001\006");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001O" + "'", str5, "\001O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007" + "'", str7, "\007");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.decrypt("6027768308437645793663749491");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = rSA1.decrypt("\ufffdO\020");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"R?O?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffdz|" + "'", str3, "\002\ufffdz|");
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("478");
        java.lang.String str11 = rSA1.encrypt("488");
        java.lang.String str13 = rSA1.decrypt("407");
        rSA1.generateKeys((int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\036\ufffd\ufffd\ufffd\ufffd\u05ac\ufffd" + "'", str7, "\036\ufffd\ufffd\ufffd\ufffd\u05ac\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\022\037\ufffd\026!?W" + "'", str9, "\022\037\ufffd\026!?W");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "15329309226062730851504920377" + "'", str11, "15329309226062730851504920377");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffdj\031ZA\027\ufffd" + "'", str13, "\t\ufffd\ufffd\ufffd\ufffdj\031ZA\027\ufffd");
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("72");
        java.lang.String str13 = rSA1.decrypt("215");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001m" + "'", str3, "\001m");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "215" + "'", str5, "215");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12" + "'", str7, "12");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\026" + "'", str13, "\001\026");
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("5824490359974973208230734176");
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\032" + "'", str3, "\ufffd\ufffd\032");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "437899097" + "'", str5, "437899097");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$\022\ufffd\ufffd" + "'", str7, "$\022\ufffd\ufffd");
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("461");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\177" + "'", str3, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\035\ufffd\ufffd\ufffd" + "'", str7, "\003\035\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8462558857" + "'", str9, "8462558857");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "467" + "'", str13, "467");
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("531");
        java.lang.String str7 = rSA1.encrypt("\002W");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "302" + "'", str5, "302");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "392" + "'", str7, "392");
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.decrypt("334064745499191746012789729451");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.decrypt("461");
        java.lang.String str17 = rSA1.decrypt("786759835");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001-" + "'", str15, "\001-");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002k" + "'", str17, "\002k");
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\002u");
        java.lang.String str9 = rSA1.decrypt("371");
        java.lang.String str11 = rSA1.decrypt("784159943467916");
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "266" + "'", str5, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "=" + "'", str9, "=");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\027" + "'", str11, "\027");
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("5824490359974973208230734176");
        java.lang.String str7 = rSA1.decrypt("5164814492198769846277396329");
        java.lang.String str9 = rSA1.encrypt("\b\ufffd\ufffd");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1322348827" + "'", str5, "1322348827");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd;\f\ufffd" + "'", str7, "\000\ufffd;\f\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1521753670" + "'", str9, "1521753670");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        java.lang.String str13 = rSA1.decrypt("3085358694");
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\022\u073b\ufffd\ufffd\ufffd\177\020\ufffd" + "'", str11, "\002\ufffd\022\u073b\ufffd\ufffd\ufffd\177\020\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\u06e5\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\001\ufffd\ufffd\u06e5\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("66");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str21 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str23 = rSA1.decrypt("87");
        java.lang.String str25 = rSA1.decrypt("588395092428200838625746733412");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001G" + "'", str5, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "509" + "'", str7, "509");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8" + "'", str9, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\020\ufffdwh\032\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\020\ufffdwh\032\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\ufffd\u05c3\ufffd\023\ufffd" + "'", str17, "\006\ufffd\u05c3\ufffd\023\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "700198954356021108273090257667" + "'", str21, "700198954356021108273090257667");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\006\ufffd\ufffd\ufffd\026\ufffd\ufffd" + "'", str23, "\006\ufffd\ufffd\ufffd\026\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\ufffd\ufffd/\027\ufffd\ufffdc" + "'", str25, "\001\ufffd\ufffd/\027\ufffd\ufffdc");
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.decrypt("1008102450");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd" + "'", str3, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\003\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd");
        java.lang.String str13 = rSA1.encrypt("187");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\026\025\ufffd\ufffd\ufffd\ufffd\ufffd\013D");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "490" + "'", str3, "490");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002W" + "'", str9, "\002W");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "673" + "'", str11, "673");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "458" + "'", str13, "458");
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.encrypt("1605419445290886");
        java.lang.String str7 = rSA1.encrypt("\001\002\ufffdQ.");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140" + "'", str5, "140");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "887" + "'", str7, "887");
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("393");
        java.lang.String str7 = rSA1.decrypt("227022896246510918381181022856");
        java.lang.String str9 = rSA1.decrypt("8");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "352" + "'", str5, "352");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Q" + "'", str7, "Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002" + "'", str9, "\002");
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.encrypt("674589993819081348249");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str21 = rSA1.encrypt("289903197122185740867720973036");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "110" + "'", str7, "110");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "362" + "'", str11, "362");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "384" + "'", str15, "384");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "38711755176052230931729558226" + "'", str21, "38711755176052230931729558226");
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("465270144019721");
        java.lang.String str9 = rSA1.decrypt("325563476535440691175221444074");
        java.lang.String str11 = rSA1.decrypt("2466608655");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i" + "'", str3, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "135" + "'", str5, "135");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "36" + "'", str7, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005" + "'", str9, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\024" + "'", str11, "\001\024");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("307707995715569958842130375");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6mE&" + "'", str3, "6mE&");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1272313887" + "'", str5, "1272313887");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.decrypt("166");
        java.lang.String str13 = rSA1.encrypt("517");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("232501808598646088728588706843");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "478" + "'", str7, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\025" + "'", str11, "\025");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "336" + "'", str13, "336");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "184" + "'", str17, "184");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1611067079503803");
        java.lang.String str13 = rSA1.decrypt("18980981751395059997709561778");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "616" + "'", str7, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "338" + "'", str11, "338");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001T" + "'", str13, "\001T");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("48524739602976");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002L" + "'", str5, "\002L");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("478");
        java.lang.String str15 = rSA1.encrypt("646");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32" + "'", str7, "32");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "18" + "'", str9, "18");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10799108868" + "'", str13, "10799108868");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9510983963" + "'", str15, "9510983963");
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("235");
        java.lang.String str13 = rSA1.decrypt("93629648365587704361423475727");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006\ufffd\ufffd\ufffd\u0652\ufffd\ufffdx" + "'", str7, "\006\ufffd\ufffd\ufffd\u0652\ufffd\ufffdx");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\u0639\ufffd\ufffde\000\017\021\ufffd" + "'", str11, "\002\u0639\ufffd\ufffde\000\017\021\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd;\f\003\ufffd" + "'", str13, "\006\ufffd\ufffd\ufffd\ufffd\ufffd;\f\003\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("437");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("4746719442");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001Y" + "'", str7, "\001Y");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "103" + "'", str11, "103");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("56181887");
        java.lang.String str11 = rSA1.decrypt("7591156848866311702672535389");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.encrypt("255635653807356729488134260102");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "70" + "'", str3, "70");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11450973092754531317967819648" + "'", str7, "11450973092754531317967819648");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "51027261011812096288740034610" + "'", str9, "51027261011812096288740034610");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\001\002\ufffd" + "'", str11, "\ufffd\ufffd\ufffd\ufffd\001\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "103136656275430" + "'", str15, "103136656275430");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.decrypt("2202857551365157");
        java.lang.String str7 = rSA1.encrypt("409247107494479");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\036\ufffd\027$" + "'", str5, "\036\ufffd\027$");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2239671374" + "'", str7, "2239671374");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("478");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ue\024\ufffd$\025\ufffd\ufffd\ufffd" + "'", str7, "Ue\024\ufffd$\025\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\027\ufffd\ufffd\u0444\ufffd\ufffd\ufffd" + "'", str9, "\027\ufffd\ufffd\u0444\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("56181887");
        java.lang.String str11 = rSA1.decrypt("746226611113599520813292889194");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"W.m?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "28865911851270895664032327330" + "'", str7, "28865911851270895664032327330");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "14067815407097015975591124148" + "'", str9, "14067815407097015975591124148");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + ")\\\004\ufffd\ufffd\u0254x\001\ufffd\ufffd" + "'", str11, ")\\\004\ufffd\ufffd\u0254x\001\ufffd\ufffd");
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.decrypt("44874627577612233003");
        rSA1.generateKeys((int) (short) 10);
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str5, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.encrypt("292429178019428864799183198942");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "270073773247479439930180680104" + "'", str17, "270073773247479439930180680104");
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("\002E");
        java.lang.String str13 = rSA1.encrypt("412855490441922175904469813661");
        java.lang.String str15 = rSA1.encrypt("893715642");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\t" + "'", str3, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\0011)]H" + "'", str7, "\0011)]H");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "66203456086901" + "'", str11, "66203456086901");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "747873875775059" + "'", str13, "747873875775059");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "981987784372345" + "'", str15, "981987784372345");
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1611067079503803");
        java.lang.String str13 = rSA1.decrypt("18980981751395059997709561778");
        java.lang.String str15 = rSA1.encrypt("\001\ufffd\t?");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "110" + "'", str7, "110");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "264" + "'", str11, "264");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "341" + "'", str15, "341");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("314");
        java.lang.String str5 = rSA1.decrypt("211");
        java.lang.String str7 = rSA1.encrypt("40208053863613346450978315343");
        java.lang.String str9 = rSA1.decrypt("9076220414");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "37761667692440245568" + "'", str3, "37761667692440245568");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\013\ufffd" + "'", str5, "\007\ufffd\ufffd\ufffd\ufffd\013\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "58197189572208638723626069969" + "'", str7, "58197189572208638723626069969");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\000\ufffd\ufffd\ufffd\000QU&" + "'", str9, "\006\ufffd\000\ufffd\ufffd\ufffd\000QU&");
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("362");
        java.lang.Class<?> wildcardClass4 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001" + "'", str3, "\001");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.encrypt("\002\ufffd\003\ufffd");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001@" + "'", str7, "\001@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "`" + "'", str9, "`");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "145" + "'", str11, "145");
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.encrypt("674589993819081348249");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "470" + "'", str5, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "270" + "'", str7, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6" + "'", str11, "6");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "282" + "'", str15, "282");
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.decrypt("769");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt(">>\021O[5\036\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \">>?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\u0288\u0104\ufffd\ufffd\031" + "'", str11, "\002\ufffd\ufffd\ufffd\u0288\u0104\ufffd\ufffd\031");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd3h" + "'", str15, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd3h");
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("658320474506132562654648259626");
        java.lang.String str13 = rSA1.decrypt("1739946898496621");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "29262453008872783227555721515" + "'", str11, "29262453008872783227555721515");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\u674a\037\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\003\u674a\037\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("598936615230950507052406172861");
        java.lang.String str9 = rSA1.encrypt("\001(");
        java.lang.String str11 = rSA1.encrypt("245");
        java.lang.String str13 = rSA1.encrypt("23585400911907150218938419175");
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\001`w\025T");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?`w?T\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25934336" + "'", str9, "25934336");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7278703393" + "'", str11, "7278703393");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2624001245" + "'", str13, "2624001245");
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.encrypt("553");
        java.lang.String str13 = rSA1.decrypt("355");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\b\177\ufffd\ufffd\ufffd\030\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32" + "'", str7, "32");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "18" + "'", str9, "18");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "387" + "'", str11, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\031" + "'", str13, "\001\031");
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.encrypt("9346881411915179890603869120");
        java.lang.String str17 = rSA1.encrypt("\002P");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "221366678944150325526937261368" + "'", str5, "221366678944150325526937261368");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdc" + "'", str7, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdc");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "29113989299553269211875301956" + "'", str9, "29113989299553269211875301956");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "547324571635498219706888259210" + "'", str11, "547324571635498219706888259210");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "243714751" + "'", str15, "243714751");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1040267145" + "'", str17, "1040267145");
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        java.lang.String str13 = rSA1.encrypt("2633919501113675109991304621");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h\016\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "h\016\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "120072407633709646859321193106" + "'", str9, "120072407633709646859321193106");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "477214284972173306730972676784" + "'", str11, "477214284972173306730972676784");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "127384693200168367477876328159" + "'", str13, "127384693200168367477876328159");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("393");
        java.lang.String str19 = rSA1.encrypt("g");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "478" + "'", str7, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\024\ufffd\ufffd\n*\022\016" + "'", str13, "\ufffd\ufffd\024\ufffd\ufffd\n*\022\016");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "368815331320036" + "'", str17, "368815331320036");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "11592740743" + "'", str19, "11592740743");
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("317201802686979902757");
        java.lang.String str11 = rSA1.encrypt("\001_");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003X\017\ufffd\ufffd\ufffdQ\016\ufffdwn" + "'", str7, "\003X\017\ufffd\ufffd\ufffdQ\016\ufffdwn");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "15" + "'", str9, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5327648726751" + "'", str11, "5327648726751");
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.encrypt("11860916928095778934456708933");
        java.lang.String str15 = rSA1.encrypt("\001v");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1779889092" + "'", str13, "1779889092");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "282865645" + "'", str15, "282865645");
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("z");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("1Y\002\ufffd\022\ufffd\\\ufffd\ufffdv");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1Y\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "368" + "'", str7, "368");
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.encrypt("262");
        java.lang.String str13 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\017\ufffd.\021\ufffd\ufffd");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("414147211126500775204667198314");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "127550813065850745176648013575" + "'", str5, "127550813065850745176648013575");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "434000923010804514273222303329" + "'", str7, "434000923010804514273222303329");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004W\016\ufffd\ufffd:\\\002oF\n\003" + "'", str9, "\004W\016\ufffd\ufffd:\\\002oF\n\003");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35633179814210302024" + "'", str11, "35633179814210302024");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "154191623012294620333939685274" + "'", str13, "154191623012294620333939685274");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffdT\037\ufffd9" + "'", str17, "\ufffd\ufffdT\037\ufffd9");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\001\ufffd\ufffd\033\ufffd");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "473" + "'", str5, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "367" + "'", str9, "367");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        java.lang.String str13 = rSA1.decrypt("324006784837190610335526937353");
        java.lang.String str15 = rSA1.encrypt("692429752057800817142458536884");
        rSA1.generateKeys(100);
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002L" + "'", str5, "\002L");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007" + "'", str7, "\007");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\024x8" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\024x8");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\001\ufffd\ufffd\ufffd\177\ufffd\ufffd\032" + "'", str13, "\003\ufffd\ufffd\001\ufffd\ufffd\ufffd\177\ufffd\ufffd\032");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "746020837422779915193776218950" + "'", str15, "746020837422779915193776218950");
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("1979640026");
        java.lang.String str13 = rSA1.encrypt("\001\ufffd\ufffd\ufffdJ");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O" + "'", str5, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "416" + "'", str7, "416");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "427223587" + "'", str11, "427223587");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "505678325" + "'", str13, "505678325");
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("66");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\006" + "'", str5, "\001\006");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23" + "'", str7, "23");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\254\ufffd\000\ufffd\ufffd}\002\000\ufffd" + "'", str13, "\000\ufffd\254\ufffd\000\ufffd\ufffd}\002\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str17, "\001\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("3077056399");
        java.lang.String str15 = rSA1.decrypt("715053248569397442655422819632");
        java.lang.String str17 = rSA1.encrypt("\002\ufffd\ufffd\033");
        java.lang.String str19 = rSA1.encrypt("510");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd3" + "'", str9, "\000\ufffd\ufffd3");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2225806909" + "'", str11, "2225806909");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\025\ufffd[" + "'", str13, "\025\ufffd[");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str15, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2144464650" + "'", str17, "2144464650");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1242773803" + "'", str19, "1242773803");
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.decrypt("387");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\002\u028e\r\ufffd\ufffd\f\ufffd\ufffd");
        java.lang.String str13 = rSA1.decrypt("135091294");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\036" + "'", str7, "\036");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "293" + "'", str9, "293");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "83" + "'", str11, "83");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\002u");
        java.lang.String str9 = rSA1.encrypt("453285907300587");
        java.lang.String str11 = rSA1.decrypt("7560459277510187155396998311");
        java.lang.String str13 = rSA1.decrypt("5637094912");
        java.lang.String str15 = rSA1.decrypt("192160172904044033214293183750");
        java.lang.String str17 = rSA1.encrypt("106618729686746388855762464470");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "521" + "'", str3, "521");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "289" + "'", str7, "289");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "387" + "'", str9, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\r" + "'", str13, "\001\r");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "514" + "'", str17, "514");
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("247231579359366");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "383840709494656704168601391358" + "'", str5, "383840709494656704168601391358");
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("222");
        java.lang.String str11 = rSA1.decrypt("135091294");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "236" + "'", str3, "236");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1309682936" + "'", str9, "1309682936");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\025\ufffd\ufffd" + "'", str11, "\025\ufffd\ufffd");
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "769813422797759594890249642976" + "'", str5, "769813422797759594890249642976");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("478");
        java.lang.String str7 = rSA1.decrypt("1666742766");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "252" + "'", str5, "252");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001t" + "'", str7, "\001t");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\u0475\ufffd");
        java.lang.String str11 = rSA1.decrypt("368");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\u072f\ufffd" + "'", str7, "\000\ufffd\u072f\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8996841004" + "'", str9, "8996841004");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\022\ufffd\ufffd" + "'", str11, "\002\022\ufffd\ufffd");
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("|");
        java.lang.String str11 = rSA1.decrypt("270");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\bj9\001");
        java.lang.String str15 = rSA1.decrypt("346");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\007\ufffd\u037a\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "461" + "'", str7, "461");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "248" + "'", str9, "248");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "158" + "'", str13, "158");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.decrypt("34089860651578007478246711177");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("764080762608778560955290362258");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "566" + "'", str3, "566");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "605" + "'", str5, "605");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003*" + "'", str7, "\003*");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\0013P\021DwQ" + "'", str11, "\0013P\021DwQ");
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1611067079503803");
        java.lang.String str13 = rSA1.encrypt("584282792217330789222543235577");
        java.lang.String str15 = rSA1.decrypt("219");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "96" + "'", str5, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "117" + "'", str7, "117");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "338" + "'", str11, "338");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "286" + "'", str13, "286");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1611067079503803");
        java.lang.String str13 = rSA1.encrypt("584282792217330789222543235577");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "96" + "'", str5, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "117" + "'", str7, "117");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "264" + "'", str11, "264");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "279" + "'", str13, "279");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("904879835");
        java.lang.String str11 = rSA1.encrypt("39");
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "719671574" + "'", str9, "719671574");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1233757844" + "'", str11, "1233757844");
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("2063650974266313");
        java.lang.String str5 = rSA1.decrypt("275");
        java.lang.String str7 = rSA1.decrypt("180561759819135041582650684250");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "600220007147163902801044427866" + "'", str3, "600220007147163902801044427866");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\035\ufffd\016\ufffd\ufffd\ufffdwWg," + "'", str5, "\001\035\ufffd\016\ufffd\ufffd\ufffdwWg,");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\b\ufffd\ufffd\ufffd\"\ufffd\347\177\ufffd\026" + "'", str7, "\005\b\ufffd\ufffd\ufffd\"\ufffd\347\177\ufffd\026");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("1208902895495334527");
        java.lang.String str9 = rSA1.encrypt("58");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "789988433459115" + "'", str7, "789988433459115");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2282499580991493" + "'", str9, "2282499580991493");
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.decrypt("495");
        java.lang.String str7 = rSA1.decrypt("44");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\ufffd\ufffd\f\r\ufffd\021x");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"NJ8\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "95" + "'", str3, "95");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "I" + "'", str7, "I");
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("818354031919437822956478981367");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\013\ufffdO@\026\ufffd\ufffd\ufffd\ufffd\ufffdt" + "'", str9, "\013\ufffdO@\026\ufffd\ufffd\ufffd\ufffd\ufffdt");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "667" + "'", str17, "667");
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("253");
        java.lang.String str13 = rSA1.decrypt("450766669594624");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str19 = rSA1.decrypt("495");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001@" + "'", str7, "\001@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\032" + "'", str9, "\001\032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "|" + "'", str13, "|");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\007" + "'", str19, "\002\007");
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("1998947500173");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u0370\ufffd");
        java.lang.String str11 = rSA1.decrypt("15028238390418345727767527777");
        java.lang.String str13 = rSA1.encrypt("768443727");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.decrypt("44724174301547550705031070120");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Y" + "'", str3, "Y");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25" + "'", str9, "25");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "172" + "'", str13, "172");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\034" + "'", str17, "\034");
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("42418796185018424088");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("523560101545386101969462478793");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd0" + "'", str9, "\ufffd0");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "689918962" + "'", str11, "689918962");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd" + "'", str13, "\004\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "546001150" + "'", str15, "546001150");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "741983478" + "'", str17, "741983478");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("167");
        java.lang.String str13 = rSA1.decrypt("180587920");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd4(" + "'", str7, "\001\ufffd4(");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2553937590" + "'", str9, "2553937590");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\003`" + "'", str11, "\001\ufffd\003`");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\u07bcG" + "'", str13, "\001\u07bcG");
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("478");
        java.lang.String str15 = rSA1.decrypt("1028793282341587");
        java.lang.String str17 = rSA1.encrypt("592507074497355564223410845271");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "533038808" + "'", str13, "533038808");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str15, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2620146760" + "'", str17, "2620146760");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        java.lang.String str15 = rSA1.encrypt("875");
        java.lang.String str17 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\022" + "'", str13, "\"\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\022");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "50004784369000759949" + "'", str15, "50004784369000759949");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "23334727881008069926019706102" + "'", str17, "23334727881008069926019706102");
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.decrypt("771929004");
        java.lang.String str9 = rSA1.encrypt("\007\027\ufffd\ufffd\ufffd\016\ufffd\013\ufffd\ufffdh");
        java.lang.String str11 = rSA1.decrypt("1753550185962321");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\016\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002@" + "'", str3, "\002@");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001Q" + "'", str5, "\001Q");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "621" + "'", str9, "621");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001r" + "'", str11, "\001r");
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.decrypt("171");
        java.lang.String str13 = rSA1.decrypt("236");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd+\001\ufffd" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffd+\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\177\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\005\ufffd\ufffd\177\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("11716232800583690748559256041");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.encrypt("\001;");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "30301143341319973237601521367" + "'", str5, "30301143341319973237601521367");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "414700749558872873180434603851" + "'", str7, "414700749558872873180434603851");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\n\ufffdU5S" + "'", str9, "\001\ufffd\ufffd\ufffd\ufffd\n\ufffdU5S");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\033\ufffd\ufffd\ufffd\ufffd\ufffdI" + "'", str11, "\005\ufffd\ufffd\033\ufffd\ufffd\ufffd\ufffd\ufffdI");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "484858829" + "'", str17, "484858829");
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("42418796185018424088");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("70");
        java.lang.String str19 = rSA1.encrypt("416");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "59\"+" + "'", str9, "59\"+");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1113891463" + "'", str11, "1113891463");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd" + "'", str13, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "455087602" + "'", str15, "455087602");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1627725221" + "'", str17, "1627725221");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "73945474" + "'", str19, "73945474");
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("461");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.decrypt("581261998105623912352259846590");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\001\033");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007\ufffd\ufffd" + "'", str7, "\007\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7610219231" + "'", str9, "7610219231");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "380" + "'", str13, "380");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("3077056399");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\ufffd++\023`\036");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd<" + "'", str9, "\001\ufffd\ufffd<");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "335383989" + "'", str11, "335383989");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\035\u05a5P" + "'", str13, "\035\u05a5P");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "684153590" + "'", str15, "684153590");
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("461");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5" + "'", str3, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\u039cX" + "'", str7, "\001\ufffd\u039cX");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "16607484" + "'", str9, "16607484");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "467" + "'", str13, "467");
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\ufffd\u0795\ufffd$");
        java.lang.String str13 = rSA1.encrypt("380");
        java.lang.String str15 = rSA1.encrypt("587");
        java.lang.String str17 = rSA1.encrypt("1082096674");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001n" + "'", str5, "\001n");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "496" + "'", str9, "496");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "42" + "'", str11, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "144" + "'", str13, "144");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "195" + "'", str15, "195");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "489" + "'", str17, "489");
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("387");
        java.lang.String str9 = rSA1.encrypt("&\013\ufffd\003");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "q.\026\ufffdV\b\ufffd\ufffd\ufffdl" + "'", str7, "q.\026\ufffdV\b\ufffd\ufffd\ufffdl");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12707519927873849643667502122" + "'", str9, "12707519927873849643667502122");
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("{");
        java.lang.String str13 = rSA1.decrypt("403");
        java.lang.String str15 = rSA1.decrypt("307");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "875" + "'", str5, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "680" + "'", str7, "680");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "285" + "'", str11, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(" + "'", str13, "(");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\021" + "'", str15, "\001\021");
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("205");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("94");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "730281798886783902090316437808" + "'", str5, "730281798886783902090316437808");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0272\ufffd%\006" + "'", str7, "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0272\ufffd%\006");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "49368692014549578096568754579" + "'", str9, "49368692014549578096568754579");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "200" + "'", str13, "200");
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd");
        java.lang.String str13 = rSA1.encrypt("273293340585438");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "209" + "'", str3, "209");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000" + "'", str7, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "g" + "'", str9, "g");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "272" + "'", str11, "272");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "89" + "'", str13, "89");
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\001%\026\000\020");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?%???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "473" + "'", str5, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "167" + "'", str7, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "307" + "'", str11, "307");
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.decrypt("495");
        java.lang.String str7 = rSA1.decrypt("44");
        java.lang.String str9 = rSA1.encrypt("357");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "98" + "'", str3, "98");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001W" + "'", str5, "\001W");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "88" + "'", str9, "88");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.encrypt("49");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "255" + "'", str3, "255");
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("478");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u039d");
        java.lang.String str15 = rSA1.encrypt("720881662483885555150199331319");
        java.lang.String str17 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\025\000");
        java.lang.String str19 = rSA1.encrypt("185787078128474564534821080385");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\030\ufffd\ufffd" + "'", str7, "\ufffd\ufffd\ufffd\ufffd\030\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\032\b\ufffd\ufffd\u040a\ufffd\177" + "'", str9, "\ufffd\032\b\ufffd\ufffd\u040a\ufffd\177");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "798" + "'", str13, "798");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "619" + "'", str15, "619");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "642" + "'", str17, "642");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "415" + "'", str19, "415");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("29375592229625247748383763465");
        java.lang.String str13 = rSA1.encrypt("430");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "142" + "'", str5, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "28" + "'", str7, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "87" + "'", str13, "87");
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("z");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002!" + "'", str3, "\002!");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\005\003\027\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd3&" + "'", str9, "\007\005\003\027\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd3&");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "402271083010688" + "'", str15, "402271083010688");
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\004\031\ufffd\ufffd\ufffda");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("n\017\ufffd \022\t\b\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"n??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5" + "'", str3, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\004\ufffdbB" + "'", str7, "\001\004\ufffdbB");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\"\017\ufffd" + "'", str9, "\001\ufffd\"\017\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2198449182" + "'", str11, "2198449182");
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("32");
        java.lang.String str9 = rSA1.decrypt("150463785061299561387815225633");
        java.lang.String str11 = rSA1.decrypt("101134400554391946566489983360");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "M" + "'", str3, "M");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001R" + "'", str9, "\001R");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "w" + "'", str11, "w");
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("|");
        java.lang.String str13 = rSA1.decrypt("29339648412823630308726258195");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\0330<]" + "'", str7, "\0330<]");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "29316250624" + "'", str11, "29316250624");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\037|K\177\ufffd" + "'", str13, "\004\037|K\177\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("205");
        java.lang.String str11 = rSA1.decrypt("166");
        java.lang.String str13 = rSA1.encrypt("313579402379602599084496040893");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\001\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?B?H?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "165031087333800944154390435313" + "'", str5, "165031087333800944154390435313");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003n\004\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\003n\004\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "519668457691979114678775657741" + "'", str9, "519668457691979114678775657741");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffd\ufffd\005\ufffd\ufffd\ufffd\004\ufffd\ufffd\ufffd" + "'", str11, "\b\ufffd\ufffd\005\ufffd\ufffd\ufffd\004\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "446583107935617043989198331480" + "'", str13, "446583107935617043989198331480");
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("461");
        java.lang.String str9 = rSA1.encrypt("\005");
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd" + "'", str7, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "125" + "'", str9, "125");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("3066983185");
        java.lang.String str7 = rSA1.decrypt("3077056399");
        java.lang.String str9 = rSA1.encrypt("6103515625");
        java.lang.String str11 = rSA1.decrypt("495729105335719923501365928620");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "105" + "'", str5, "105");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "62" + "'", str9, "62");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        java.lang.String str11 = rSA1.encrypt("76525688979612163312788900454");
        java.lang.String str13 = rSA1.decrypt("3");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Y" + "'", str3, "Y");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\024\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\001\024\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7414894602904750311084004816" + "'", str11, "7414894602904750311084004816");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\004\ufffdw\026\ufffd4" + "'", str13, "\005\ufffd\ufffd\ufffd\004\ufffdw\026\ufffd4");
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("205");
        java.lang.String str11 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str13 = rSA1.encrypt("D");
        java.lang.String str15 = rSA1.decrypt("1453933568");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207865682509772031150016443622" + "'", str5, "207865682509772031150016443622");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\033\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd\033\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "325138504400436410653735624514" + "'", str9, "325138504400436410653735624514");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "167233753597794121684620380958" + "'", str11, "167233753597794121684620380958");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1453933568" + "'", str13, "1453933568");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "D" + "'", str15, "D");
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("598936615230950507052406172861");
        java.lang.String str9 = rSA1.encrypt("\001(");
        java.lang.String str11 = rSA1.encrypt("245");
        java.lang.String str13 = rSA1.encrypt("23585400911907150218938419175");
        java.lang.String str15 = rSA1.encrypt("1961392473");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("By\\\036Z(");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"By\\?Z(\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\t" + "'", str3, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\ufffdZ" + "'", str7, "\000\ufffd\ufffd\ufffdZ");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25934336" + "'", str9, "25934336");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5336926413" + "'", str11, "5336926413");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "629726377" + "'", str13, "629726377");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "915247368" + "'", str15, "915247368");
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\002\001");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd>");
        java.lang.String str15 = rSA1.encrypt("710719841468133");
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\006\ufffd\007\ufffd\ufffdH");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd" + "'", str7, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\036\ufffd\ufffd" + "'", str9, "\036\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3688637501" + "'", str11, "3688637501");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3396674054" + "'", str13, "3396674054");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "756336162" + "'", str15, "756336162");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2497119408" + "'", str17, "2497119408");
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("478");
        java.lang.String str15 = rSA1.encrypt("646");
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "830" + "'", str7, "830");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "822" + "'", str9, "822");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8591457828" + "'", str13, "8591457828");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "647859264" + "'", str15, "647859264");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.decrypt("279");
        java.lang.String str11 = rSA1.decrypt("177");
        java.lang.String str13 = rSA1.encrypt("267");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("423");
        java.lang.String str19 = rSA1.decrypt("1354224900");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "252" + "'", str7, "252");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8" + "'", str13, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "634" + "'", str17, "634");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("205");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "391383199465619694163766634315" + "'", str5, "391383199465619694163766634315");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\026\ufffd\ufffd\026" + "'", str7, "\001\ufffd\026\ufffd\ufffd\026");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317664540264275575709633505067" + "'", str9, "317664540264275575709633505067");
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("658320474506132562654648259626");
        java.lang.String str13 = rSA1.decrypt("29358506122049777298420844854");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "13075884754078476023793850382" + "'", str11, "13075884754078476023793850382");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\003\ufffd\ufffd\ufffd6l\r\ufffd\ufffd\ufffd" + "'", str13, "\003\003\ufffd\ufffd\ufffd6l\r\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\001;");
        java.lang.String str15 = rSA1.decrypt("9215357598594065411749980871");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001W" + "'", str5, "\001W");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005" + "'", str7, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "414823067596063503394703959063" + "'", str11, "414823067596063503394703959063");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3101364196875" + "'", str13, "3101364196875");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\023\ufffd\n\ufffd\ufffd\ufffd\027P" + "'", str15, "\000\ufffd\023\ufffd\n\ufffd\ufffd\ufffd\027P");
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("5824490359974973208230734176");
        java.lang.String str7 = rSA1.decrypt("5164814492198769846277396329");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd" + "'", str3, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2213382314" + "'", str5, "2213382314");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u032aQ" + "'", str7, "\u032aQ");
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("432");
        java.lang.String str9 = rSA1.encrypt("1208902895495334527");
        java.lang.String str11 = rSA1.decrypt("5");
        java.lang.String str13 = rSA1.encrypt("497");
        java.lang.String str15 = rSA1.decrypt("9014646877");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "179" + "'", str7, "179");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "65" + "'", str9, "65");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001U" + "'", str11, "\001U");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "524" + "'", str13, "524");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("1157083253");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4226317116352500658824068690" + "'", str7, "4226317116352500658824068690");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "585002013412621775525264088986" + "'", str11, "585002013412621775525264088986");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("166");
        java.lang.String str19 = rSA1.encrypt("483");
        java.lang.String str21 = rSA1.encrypt("285");
        java.lang.String str23 = rSA1.decrypt("351");
        java.lang.String str25 = rSA1.decrypt("182939750793257963236342034709");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\022\030" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\022\030");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3088923312974289" + "'", str17, "3088923312974289");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "821277740826771" + "'", str19, "821277740826771");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "857706257094017" + "'", str21, "857706257094017");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\004\ufffd\ufffd\ufffd\nx" + "'", str23, "\004\ufffd\ufffd\ufffd\nx");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n\ufffd\ufffd\ufffd\ufffd" + "'", str25, "\n\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        java.lang.String str9 = rSA1.encrypt("862118454");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "442" + "'", str9, "442");
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("5824490359974973208230734176");
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.encrypt("180");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "e78f" + "'", str3, "e78f");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "25147323" + "'", str5, "25147323");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "e\001\ufffd\ufffd" + "'", str7, "e\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "962373120" + "'", str9, "962373120");
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "281" + "'", str3, "281");
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.decrypt("394");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "566" + "'", str3, "566");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\001;");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6606974980070707460108542863" + "'", str11, "6606974980070707460108542863");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3101364196875" + "'", str13, "3101364196875");
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("946669947");
        java.lang.String str7 = rSA1.encrypt("414601987065913579031306059745");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("468");
        java.lang.String str15 = rSA1.encrypt("57180256162005942429712285534");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "M" + "'", str5, "M");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "293" + "'", str7, "293");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10132385530" + "'", str13, "10132385530");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2312171343" + "'", str15, "2312171343");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("\007\ufffd\ufffd\006\ufffd\ufffd\ufffdQ^");
        rSA1.generateKeys(100);
        java.lang.String str9 = rSA1.encrypt("\002\ufffd=\0023\r\ufffda\021");
        java.lang.String str11 = rSA1.decrypt("4701538885");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "220" + "'", str5, "220");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "454097796661591880593768454311" + "'", str9, "454097796661591880593768454311");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fj\n\ufffd\n\ufffd\ufffd.<" + "'", str11, "fj\n\ufffd\n\ufffd\ufffd.<");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("288");
        java.lang.String str15 = rSA1.decrypt("1894697952");
        java.lang.String str17 = rSA1.decrypt("1028793282341587");
        java.lang.String str19 = rSA1.encrypt("\ufffd\ufffd\036");
        java.lang.String str21 = rSA1.encrypt("4003796192");
        java.lang.String str23 = rSA1.decrypt("301");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001@" + "'", str7, "\001@");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "470988690210486128521608041185" + "'", str11, "470988690210486128521608041185");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "581892490871760668600984693970" + "'", str13, "581892490871760668600984693970");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd0\004\ufffd\ufffd\016\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\b\ufffd0\004\ufffd\ufffd\016\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\u0492\ufffd\020\ufffd\ufffd" + "'", str17, "\001\ufffd\ufffd\u0492\ufffd\020\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "642362716800314506703135338046" + "'", str19, "642362716800314506703135338046");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "130296175647282457630766210408" + "'", str21, "130296175647282457630766210408");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd\ufffd\b\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str23, "\001\ufffd\ufffd\b\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("5824490359974973208230734176");
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.encrypt("11593058649");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\ufffd" + "'", str3, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3259273815" + "'", str5, "3259273815");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffdS" + "'", str7, "\ufffdS");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "49367210996231025757448209657" + "'", str11, "49367210996231025757448209657");
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("1571893042486033");
        java.lang.String str9 = rSA1.encrypt("\003\021\ufffd\u076d\ufffd\u06fd\ufffdX\f\020");
        java.lang.String str11 = rSA1.decrypt("2589008067855306");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "875" + "'", str5, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "b" + "'", str7, "b");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "362" + "'", str9, "362");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.decrypt("265482618753364");
        java.lang.String str19 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\u01e9\ufffdm");
        java.lang.String str21 = rSA1.encrypt("\001\ufffd\ufffd[");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n\ufffd\030\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\n\ufffd\030\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "799103756588184208122467393151" + "'", str19, "799103756588184208122467393151");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "710953641251092049316066633256" + "'", str21, "710953641251092049316066633256");
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("2155055185841074");
        java.lang.String str13 = rSA1.decrypt("646");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001n" + "'", str5, "\001n");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001u" + "'", str7, "\001u");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7636668858" + "'", str11, "7636668858");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\u02e89^" + "'", str13, "\000\u02e89^");
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("Fz\005\ufffdcvb\n\ufffde\031");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "42" + "'", str3, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5561610101727963110045681778" + "'", str7, "5561610101727963110045681778");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "231" + "'", str11, "231");
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.encrypt("674589993819081348249");
        java.lang.String str17 = rSA1.decrypt("267732256991725538729642205655");
        java.lang.String str19 = rSA1.encrypt("33530503450432431591");
        java.lang.String str21 = rSA1.decrypt("1801088541");
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "267" + "'", str5, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9" + "'", str7, "9");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "858" + "'", str11, "858");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "472" + "'", str15, "472");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002N" + "'", str17, "\002N");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "322" + "'", str19, "322");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\025" + "'", str21, "\025");
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        java.lang.String str9 = rSA1.decrypt("8");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "241251209447971667555543519783" + "'", str5, "241251209447971667555543519783");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8241264822143" + "'", str7, "8241264822143");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\b\ufffd\ufffd\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\b\ufffd\ufffd\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        java.lang.String str9 = rSA1.encrypt("\f\ufffdx");
        java.lang.String str11 = rSA1.encrypt("3984502495");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "827522645817252599631699763826" + "'", str5, "827522645817252599631699763826");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\177\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd\177\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "360724163346381553334091797557" + "'", str9, "360724163346381553334091797557");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "514264038428370558626285151002" + "'", str11, "514264038428370558626285151002");
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str11 = rSA1.encrypt("\002\ufffd>");
        java.lang.String str13 = rSA1.decrypt("195162320964727969461021020043");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\037\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\037\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "24910607840224317483596072080" + "'", str9, "24910607840224317483596072080");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "8995016998351358840440331465" + "'", str11, "8995016998351358840440331465");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\023\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1611067079503803");
        java.lang.String str13 = rSA1.decrypt("18980981751395059997709561778");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("2168059484");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "461" + "'", str7, "461");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "162" + "'", str11, "162");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\000" + "'", str13, "\001\000");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\024" + "'", str17, "\024");
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        java.lang.String str11 = rSA1.encrypt("2132861796");
        java.lang.String str13 = rSA1.encrypt("\005\ufffd\ufffdq");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<" + "'", str7, "<");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "373" + "'", str9, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "264" + "'", str11, "264");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "89" + "'", str13, "89");
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("2312924388126772");
        java.lang.String str7 = rSA1.encrypt("\005\u04ac\ufffd\u04df\ufffd\ufffd\u067c<5");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\037");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "29577123442887612269759054946" + "'", str5, "29577123442887612269759054946");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "391539385177195999885779354818" + "'", str7, "391539385177195999885779354818");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "401903107" + "'", str11, "401903107");
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("\002\u028e\r\ufffd\ufffd\f\ufffd\ufffd");
        java.lang.String str13 = rSA1.decrypt("211");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.decrypt("3799685695");
        java.lang.String str19 = rSA1.decrypt("1082096674");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4289993650829636523805454626" + "'", str11, "4289993650829636523805454626");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001e\004i\f\ufffd\ufffdRX\022\ufffd8" + "'", str13, "\001e\004i\f\ufffd\ufffdRX\022\ufffd8");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\037\025\ufffd\ufffd\ufffd\ufffd\ufffd~" + "'", str17, "\006\037\025\ufffd\ufffd\ufffd\ufffd\ufffd~");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003Y\024\ufffd\006\ufffd\ufffd>" + "'", str19, "\003Y\024\ufffd\006\ufffd\ufffd>");
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str11 = rSA1.encrypt("\002\ufffd>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\u07d3\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\ufffd\u07d3\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "39413906848934658209078668128" + "'", str9, "39413906848934658209078668128");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7249491166292041102808538384" + "'", str11, "7249491166292041102808538384");
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("|");
        java.lang.String str13 = rSA1.decrypt("6203695486");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\t" + "'", str7, "\000\ufffd\ufffd\t");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "29316250624" + "'", str11, "29316250624");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\003\ufffd\ufffd" + "'", str13, "\007\ufffd\003\ufffd\ufffd");
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.encrypt("1605419445290886");
        java.lang.String str7 = rSA1.encrypt("\001\002\ufffdQ.");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5" + "'", str3, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "111" + "'", str5, "111");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "255" + "'", str7, "255");
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("166");
        java.lang.String str19 = rSA1.encrypt("483");
        java.lang.String str21 = rSA1.encrypt("395");
        rSA1.generateKeys((int) ' ');
        java.lang.String str25 = rSA1.encrypt("402837766122630056242579396245");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001G" + "'", str5, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "509" + "'", str7, "509");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8" + "'", str9, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\177\ufffd\022\r\ufffd\u0546X" + "'", str13, "\000\ufffd\177\ufffd\022\r\ufffd\u0546X");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "750277612198796" + "'", str17, "750277612198796");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1884026523529945" + "'", str19, "1884026523529945");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1931613658608165" + "'", str21, "1931613658608165");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "793705320" + "'", str25, "793705320");
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        java.lang.String str11 = rSA1.encrypt("208193977755069288740804886340");
        java.lang.String str13 = rSA1.decrypt("2877147294");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002u" + "'", str3, "\002u");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "197726225639528387288734213325" + "'", str11, "197726225639528387288734213325");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffdQ\035\"\ufffd\001}" + "'", str13, "\007\ufffd\ufffdQ\035\"\ufffd\001}");
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffdW,m");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002!" + "'", str3, "\002!");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "283" + "'", str5, "283");
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("598936615230950507052406172861");
        java.lang.String str9 = rSA1.encrypt("\001(");
        java.lang.String str11 = rSA1.encrypt("245");
        java.lang.String str13 = rSA1.encrypt("23585400911907150218938419175");
        java.lang.String str15 = rSA1.encrypt("\000\u0662\ufffdo");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\033\ufffd\ufffd" + "'", str7, "\001\033\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25934336" + "'", str9, "25934336");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2949595869" + "'", str11, "2949595869");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2336438664" + "'", str13, "2336438664");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3527120347" + "'", str15, "3527120347");
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.decrypt("495");
        java.lang.String str7 = rSA1.decrypt("44");
        java.lang.String str9 = rSA1.decrypt("30242537688890328294181300595");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "95" + "'", str3, "95");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "I" + "'", str7, "I");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.decrypt("265482618753364");
        java.lang.String str19 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\u01e9\ufffdm");
        java.lang.String str21 = rSA1.encrypt("9014646877");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "42" + "'", str7, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "205" + "'", str9, "205");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\030\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\007\ufffd\ufffd" + "'", str17, "\001\ufffd\ufffd\030\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\007\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "336761444037266471341469642616" + "'", str19, "336761444037266471341469642616");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "96458050769809322899202208012" + "'", str21, "96458050769809322899202208012");
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("392170649013389");
        java.lang.String str17 = rSA1.decrypt("391");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "14290859290188397254870676178" + "'", str15, "14290859290188397254870676178");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\ufffd\ufffd\007\ufffd\u012bG" + "'", str17, "\005\ufffd\ufffd\ufffd\007\ufffd\u012bG");
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("\002\u99ed\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str19 = rSA1.encrypt("2951314786");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002:" + "'", str3, "\002:");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffdwk@\030\ufffd\ufffd\ufffd\ufffdt" + "'", str9, "\006\ufffd\ufffdwk@\030\ufffd\ufffd\ufffd\ufffdt");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "234" + "'", str17, "234");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "254" + "'", str19, "254");
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003\ufffd\ufffd\"\ufffd\ufffd\006\177" + "'", str3, "\003\ufffd\ufffd\"\ufffd\ufffd\006\177");
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("558");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "473" + "'", str5, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1395948718" + "'", str9, "1395948718");
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\007\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\002\ufffdr{U");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??r{U\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20" + "'", str3, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "780" + "'", str7, "780");
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "112" + "'", str3, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "96" + "'", str5, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001" + "'", str9, "\001");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "289" + "'", str11, "289");
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("42418796185018424088");
        java.lang.String str15 = rSA1.decrypt("5839342752");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "576" + "'", str5, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd" + "'", str9, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1089323436" + "'", str11, "1089323436");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "576" + "'", str13, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\034\ufffd\ufffd" + "'", str15, "\034\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("23585400911907150218938419175");
        java.lang.String str5 = rSA1.decrypt("4121926944");
        java.lang.String str7 = rSA1.encrypt("1940190828677481241939172451");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "316" + "'", str7, "316");
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.decrypt("279");
        java.lang.String str11 = rSA1.decrypt("177");
        java.lang.String str13 = rSA1.encrypt("267");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("1075436568615713");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "195" + "'", str7, "195");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\037" + "'", str9, "\001\037");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001A" + "'", str11, "\001A");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "198" + "'", str13, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "862" + "'", str17, "862");
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("\001\ufffd_\n\027\ufffd\ufffd\ufffd");
        java.lang.String str7 = rSA1.encrypt("10257378891");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "968696299" + "'", str5, "968696299");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "148692803" + "'", str7, "148692803");
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("432");
        java.lang.String str9 = rSA1.encrypt("1208902895495334527");
        java.lang.String str11 = rSA1.encrypt("139039132502296347354709636564");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("192160172904044033214293183750");
        java.lang.String str17 = rSA1.decrypt("3037794932");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "340" + "'", str7, "340");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "249" + "'", str9, "249");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "248" + "'", str11, "248");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "349850072858813915650077445581" + "'", str15, "349850072858813915650077445581");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ua8e8\ufffd\ufffd" + "'", str17, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ua8e8\ufffd\ufffd");
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.decrypt("1091385417287759808405208588958");
        java.lang.String str11 = rSA1.encrypt("24728158503917487987839420576");
        java.lang.String str13 = rSA1.decrypt("107");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "50334980593118017863872015613" + "'", str7, "50334980593118017863872015613");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd\ufffd\u059d\ufffd\ufffd" + "'", str9, "\006\ufffd\ufffd\ufffd\u059d\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "110854591483449594307803896929" + "'", str11, "110854591483449594307803896929");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\u0481\ufffd\ufffd9om\034\ufffd\ufffd" + "'", str13, "\b\u0481\ufffd\ufffd9om\034\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.encrypt("674589993819081348249");
        java.lang.String str17 = rSA1.decrypt("267732256991725538729642205655");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "167" + "'", str7, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6" + "'", str11, "6");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "785" + "'", str15, "785");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002N" + "'", str17, "\002N");
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("461");
        java.lang.String str9 = rSA1.encrypt("\005");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\177" + "'", str3, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\027\b\ufffd\ufffd" + "'", str7, "\001\027\b\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3125" + "'", str9, "3125");
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("\002E");
        java.lang.String str13 = rSA1.encrypt("\001\u05f8");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5" + "'", str3, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002&\031\0348" + "'", str7, "\002&\031\0348");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "66203456086901" + "'", str11, "66203456086901");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "391319054366253" + "'", str13, "391319054366253");
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("166");
        java.lang.String str19 = rSA1.encrypt("483");
        java.lang.String str21 = rSA1.encrypt("285");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O" + "'", str5, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "416" + "'", str7, "416");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "287" + "'", str9, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\003\ufffd\u0686\ufffd\ufffdQ\n" + "'", str13, "\ufffd\ufffd\003\ufffd\u0686\ufffd\ufffdQ\n");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1685207691059692" + "'", str17, "1685207691059692");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "844176121570660" + "'", str19, "844176121570660");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "945167300994150" + "'", str21, "945167300994150");
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("#");
        java.lang.String str11 = rSA1.decrypt("1");
        java.lang.String str13 = rSA1.encrypt("1249781321");
        java.lang.String str15 = rSA1.decrypt("24728158503917487987839420576");
        java.lang.String str17 = rSA1.encrypt("\b+X\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdy");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "42875" + "'", str9, "42875");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "104353169441299118959816408610" + "'", str13, "104353169441299118959816408610");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd " + "'", str15, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd ");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "24549094862527007965566079988" + "'", str17, "24549094862527007965566079988");
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.String str17 = rSA1.decrypt("6642943944");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\001r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?r\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "117082328495617628810208286815" + "'", str5, "117082328495617628810208286815");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004\ufffd\"\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\004\ufffd\"\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "814885095201622512129393025609" + "'", str9, "814885095201622512129393025609");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "37796690567253821356882090049" + "'", str11, "37796690567253821356882090049");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str17, "\001\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\003\035");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\006" + "'", str3, "\001\006");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2827274258" + "'", str9, "2827274258");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "353799563" + "'", str11, "353799563");
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\003\035");
        java.lang.String str13 = rSA1.encrypt("223805125323478817181308095756");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001f" + "'", str3, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\017" + "'", str7, "\000\ufffd\ufffd\017");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2923943304" + "'", str9, "2923943304");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7014477279" + "'", str11, "7014477279");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5051796611" + "'", str13, "5051796611");
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd63^\020j+\r");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000h\020");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\032\ufffd$\030\ufffd\ufffd\u02c3\ufffd\ufffd{");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001n" + "'", str5, "\001n");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "122" + "'", str7, "122");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "600" + "'", str9, "600");
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("495");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "319" + "'", str3, "319");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "142" + "'", str5, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "215" + "'", str11, "215");
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.decrypt("1571715407");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "575151104153880197981085086773" + "'", str5, "575151104153880197981085086773");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1208902895495334527" + "'", str7, "1208902895495334527");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\"\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\"\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str11 = rSA1.encrypt("\002\ufffd>");
        java.lang.String str13 = rSA1.decrypt("23264544955983291322485115342");
        java.lang.String str15 = rSA1.encrypt("24024972294026087951291000206");
        java.lang.String str17 = rSA1.encrypt("12582352824821637586033699197");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\013\ufffd\ufffd\ufffd\u0790Cl" + "'", str7, "\013\ufffd\ufffd\ufffd\u0790Cl");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12594612955901653479394070212" + "'", str9, "12594612955901653479394070212");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "43089105175469143581174613274" + "'", str11, "43089105175469143581174613274");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "22471869913549643867177502698" + "'", str15, "22471869913549643867177502698");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "48328367968013690804365895227" + "'", str17, "48328367968013690804365895227");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("518");
        java.lang.String str11 = rSA1.decrypt("432");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1546870242" + "'", str9, "1546870242");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd" + "'", str11, "\ufffd\ufffd");
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("\007\ufffd\ufffd\006\ufffd\ufffd\ufffdQ^");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Y" + "'", str3, "Y");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\013\ufffd\027\ufffd\ufffd\ufffd\ufffd\ufffdo" + "'", str9, "\013\ufffd\027\ufffd\ufffd\ufffd\ufffd\ufffdo");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "372622146082087843788844319907" + "'", str15, "372622146082087843788844319907");
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str9 = rSA1.decrypt("2122968892");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.encrypt("490");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "435065272" + "'", str3, "435065272");
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.encrypt("11860916928095778934456708933");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1261574382" + "'", str13, "1261574382");
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("56181887");
        java.lang.String str11 = rSA1.decrypt("746226611113599520813292889194");
        java.lang.String str13 = rSA1.decrypt("31645931356437998864774805679");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "42" + "'", str3, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "14816517377350789989335151669" + "'", str7, "14816517377350789989335151669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11015745847943487920339638834" + "'", str9, "11015745847943487920339638834");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdk3" + "'", str11, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdk3");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\bp\003\002\ufffd\ufffd" + "'", str13, "\bp\003\002\ufffd\ufffd");
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.decrypt("336");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "616" + "'", str7, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6" + "'", str11, "6");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd" + "'", str15, "\002\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.encrypt("11860916928095778934456708933");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1128164849" + "'", str13, "1128164849");
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("42418796185018424088");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("70");
        java.lang.String str19 = rSA1.encrypt("\001\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "576" + "'", str5, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd" + "'", str9, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "116774919" + "'", str11, "116774919");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "576" + "'", str13, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1263361090" + "'", str15, "1263361090");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "787286121" + "'", str17, "787286121");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "464362230" + "'", str19, "464362230");
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.decrypt("387");
        java.lang.String str9 = rSA1.decrypt("11860916928095778934456708933");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.encrypt("\000\ufffd|6\035");
        java.lang.String str15 = rSA1.decrypt("4839922246");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002u" + "'", str3, "\002u");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "491" + "'", str5, "491");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002<" + "'", str7, "\002<");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "B" + "'", str9, "B");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "912953795279708980278576419073" + "'", str13, "912953795279708980278576419073");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\u0657\ufffd0+x\r\r\ufffd" + "'", str15, "\b\ufffd\u0657\ufffd0+x\r\r\ufffd");
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("\025");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) '#');
        java.lang.String str9 = rSA1.encrypt("\002H");
        java.lang.String str11 = rSA1.decrypt("240918168003118135666656508018");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4084101" + "'", str3, "4084101");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4358226211" + "'", str9, "4358226211");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\u0569\ufffd\ufffd" + "'", str11, "\000\u0569\ufffd\ufffd");
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("208642166923338001575549632629");
        java.lang.String str11 = rSA1.encrypt("501619215992877544684325066512");
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.encrypt("70");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "875" + "'", str5, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "680" + "'", str7, "680");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "477" + "'", str9, "477");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "441" + "'", str11, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "273" + "'", str15, "273");
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("|");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "236" + "'", str3, "236");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "91" + "'", str7, "91");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "174" + "'", str9, "174");
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd");
        java.lang.String str13 = rSA1.encrypt("174");
        java.lang.String str15 = rSA1.encrypt("144252953354502585977976224207");
        java.lang.String str17 = rSA1.decrypt("511");
        java.lang.String str19 = rSA1.encrypt("\033\027\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "209" + "'", str3, "209");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000" + "'", str7, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "g" + "'", str9, "g");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "272" + "'", str11, "272");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "90" + "'", str13, "90");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "23" + "'", str15, "23");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "272" + "'", str19, "272");
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\u07dd\ufffd\ufffd\034\ufffd\033");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd7\023\ufffd" + "'", str7, "\002\ufffd\ufffd\ufffd\ufffd7\023\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "313494352703021400976430908672" + "'", str9, "313494352703021400976430908672");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "291431639986311112722429121627" + "'", str11, "291431639986311112722429121627");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "823584098651051703330286683755" + "'", str13, "823584098651051703330286683755");
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("2155055185841074");
        java.lang.String str11 = rSA1.encrypt("\017|I2\"\037\ufffd\ufffd\023\ufffd");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001n" + "'", str5, "\001n");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "136" + "'", str9, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "228" + "'", str11, "228");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("168");
        java.lang.String str13 = rSA1.decrypt("519150271579176891438134447055");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "599495243" + "'", str9, "599495243");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7512490800" + "'", str11, "7512490800");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}APK" + "'", str13, "}APK");
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("205");
        java.lang.String str11 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str13 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\ufffd\033");
        java.lang.String str15 = rSA1.decrypt("210694636170018958841360670021");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\f\033X\r\ufffd\ufffdSt" + "'", str7, "\003\ufffd\f\033X\r\ufffd\ufffdSt");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35583402576551630221" + "'", str9, "35583402576551630221");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "286772935171935446826777228251" + "'", str11, "286772935171935446826777228251");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "489591859673939836968641627498" + "'", str13, "489591859673939836968641627498");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd\b\ufffdY" + "'", str15, "\007\ufffd\ufffd\b\ufffdY");
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.decrypt("342981671868457888627866774352");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str7 = rSA1.encrypt("\001u");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7220115733093" + "'", str7, "7220115733093");
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("24728158503917487987839420576");
        java.lang.String str9 = rSA1.encrypt("76953254708816336608130262493");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5" + "'", str3, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\024\ufffd\ufffd\ufffd" + "'", str7, "\002\024\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "495609707" + "'", str9, "495609707");
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("322134328841305854994100193972");
        java.lang.String str19 = rSA1.decrypt("1889810326647388");
        java.lang.String str21 = rSA1.encrypt("\001%\026\000\020");
        java.lang.String str23 = rSA1.encrypt("3258273441");
        java.lang.String str25 = rSA1.encrypt("488516477771532412426558767809");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002!" + "'", str3, "\002!");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\033\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\006\033\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\022\ufffd\ufffd\ufffd" + "'", str17, "\002\022\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd\ufffd" + "'", str19, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "536494257668291" + "'", str21, "536494257668291");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1393784389465294" + "'", str23, "1393784389465294");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1569390096749166" + "'", str25, "1569390096749166");
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("393");
        java.lang.String str5 = rSA1.encrypt(";n\025\ufffd");
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\004\025\ufffdi\005\ufffd\ufffd\ufffd\003\ufffd\000\ufffd*" + "'", str3, "\004\025\ufffdi\005\ufffd\ufffd\ufffd\003\ufffd\000\ufffd*");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "349832710113691767304239605797" + "'", str5, "349832710113691767304239605797");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\ufffd\ufffd\033/7ZX");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "268835661690474558211956609497" + "'", str5, "268835661690474558211956609497");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "276905479449340732913197071592" + "'", str7, "276905479449340732913197071592");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd+2" + "'", str9, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd+2");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "586441519854824933671160621972" + "'", str15, "586441519854824933671160621972");
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str5 = rSA1.encrypt("\005\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str9 = rSA1.decrypt("1082096674");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "403411145981901642344617986829" + "'", str3, "403411145981901642344617986829");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "188301966373804998093887660323" + "'", str5, "188301966373804998093887660323");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffdCY" + "'", str9, "\000\ufffd\ufffdCY");
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.decrypt("6027768308437645793663749491");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str7 = rSA1.encrypt("1579535512211996");
        java.lang.String str9 = rSA1.encrypt("\001@");
        java.lang.String str11 = rSA1.encrypt("108");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#`\177@" + "'", str3, "#`\177@");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "691491354351024184567785778772" + "'", str7, "691491354351024184567785778772");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3355443200000" + "'", str9, "3355443200000");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "357421184620095548500611084554" + "'", str11, "357421184620095548500611084554");
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.decrypt("160015912349121428858268699636");
        java.lang.String str11 = rSA1.encrypt("505764498321127");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "357" + "'", str3, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9033236987766479868402013884" + "'", str7, "9033236987766479868402013884");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Jf}\005\ufffd\ufffdj" + "'", str9, "Jf}\005\ufffd\ufffdj");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1320191715952270304248277067" + "'", str11, "1320191715952270304248277067");
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("168");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("\000\ufffd\ufffd");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\t" + "'", str3, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4097572885" + "'", str9, "4097572885");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7117378115" + "'", str11, "7117378115");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "51113233466083550100484788481" + "'", str15, "51113233466083550100484788481");
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("\002\u028e\r\ufffd\ufffd\f\ufffd\ufffd");
        java.lang.String str13 = rSA1.decrypt("211");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "50334980593118017863872015613" + "'", str7, "50334980593118017863872015613");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "50334980593118017863872015613" + "'", str9, "50334980593118017863872015613");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "143345117642613677868841751834" + "'", str11, "143345117642613677868841751834");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd|\t\ufffd\ufffd\ufffd#\034j\\" + "'", str13, "\000\ufffd\ufffd|\t\ufffd\ufffd\ufffd#\034j\\");
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\035\ufffd\ufffd\ufffd\ufffd\ufffdg");
        java.lang.String str13 = rSA1.encrypt("1184438612620945");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "271" + "'", str9, "271");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "287" + "'", str11, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "169" + "'", str13, "169");
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("478");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u039d");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("209");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\001@");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?@\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\033H.\013\ufffd\ufffd" + "'", str7, "\ufffd\ufffd\033H.\013\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd\025\ufffd\ufffd\ufffd\\\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffd\ufffd\025\ufffd\ufffd\ufffd\\\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "416" + "'", str13, "416");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "68532603334950172202387325405" + "'", str17, "68532603334950172202387325405");
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.encrypt("1889810326647388");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "374" + "'", str7, "374");
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("23585400911907150218938419175");
        java.lang.String str5 = rSA1.encrypt("144");
        java.lang.String str7 = rSA1.encrypt("155");
        java.lang.String str9 = rSA1.encrypt("1824531455");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001%" + "'", str3, "\001%");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "66" + "'", str5, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "192" + "'", str7, "192");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "128" + "'", str9, "128");
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        java.lang.String str15 = rSA1.encrypt("875");
        java.lang.String str17 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str19 = rSA1.decrypt("1836473909513684");
        java.lang.String str21 = rSA1.decrypt("1417027933650032");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "z" + "'", str5, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "646" + "'", str7, "646");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "693" + "'", str9, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd~`V" + "'", str13, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd~`V");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "13435974156782233699063008268" + "'", str15, "13435974156782233699063008268");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "8199452757566862981340493898" + "'", str17, "8199452757566862981340493898");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u028eoV)\003\ufffd\ufffd\ufffd\ufffdM" + "'", str19, "\u028eoV)\003\ufffd\ufffd\ufffd\ufffdM");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd\ufffd\ufffdH\003\ufffdS" + "'", str21, "\001\ufffd\ufffd\ufffdH\003\ufffdS");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.decrypt("305");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "260306532115302376775274445614" + "'", str5, "260306532115302376775274445614");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8241264822143" + "'", str7, "8241264822143");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\003\ufffd\ufffd\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("{");
        java.lang.String str13 = rSA1.decrypt("403");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "461" + "'", str7, "461");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "225" + "'", str11, "225");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001@" + "'", str13, "\001@");
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.encrypt("257");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "44" + "'", str7, "44");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "23" + "'", str9, "23");
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("4448254484");
        java.lang.String str9 = rSA1.decrypt("4124289089");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "473" + "'", str5, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "178" + "'", str7, "178");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\177" + "'", str9, "\001\177");
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("\007\ufffd\ufffd\006\ufffd\ufffd\ufffdQ^");
        java.lang.String str17 = rSA1.decrypt("61273672939825812829984836584");
        java.lang.String str19 = rSA1.encrypt("\b\ufffdA3\033\u0459\ufffd\ufffd\030\ufffd\ufffd");
        java.lang.String str21 = rSA1.decrypt("289");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "l" + "'", str3, "l");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffdK\035\\\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\000\ufffdK\035\\\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "234106585244745194203050013912" + "'", str15, "234106585244745194203050013912");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\ufffd\026\ufffde\003\ufffd\ufffdJ:\005" + "'", str17, "\002\ufffd\ufffd\ufffd\026\ufffde\003\ufffd\ufffdJ:\005");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "168512665596622198596569127855" + "'", str19, "168512665596622198596569127855");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\u055d\ufffdM\"\ufffd\ufffdJ$" + "'", str21, "\002\u055d\ufffdM\"\ufffd\ufffdJ$");
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("59889801834004024555618261555");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\177" + "'", str3, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\004" + "'", str9, "\000\ufffd\ufffd\004");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6221031412" + "'", str11, "6221031412");
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("24728158503917487987839420576");
        java.lang.String str9 = rSA1.encrypt("76953254708816336608130262493");
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\ufffd\006X\026\ufffd");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5" + "'", str3, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u92d7" + "'", str7, "\u92d7");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "544565074" + "'", str9, "544565074");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7194494216" + "'", str11, "7194494216");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.decrypt("50334980593118017863872015613");
        java.lang.String str5 = rSA1.encrypt("37345113952975016677704988614");
        rSA1.generateKeys(100);
        java.lang.String str9 = rSA1.decrypt("1447901312790849");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\021" + "'", str3, "\021");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "340" + "'", str5, "340");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004P\016a5mE2\013\u015cpZ" + "'", str9, "\004P\016a5mE2\013\u015cpZ");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("192160172904044033214293183750");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "178" + "'", str7, "178");
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.decrypt("6027768308437645793663749491");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str7 = rSA1.encrypt("1579535512211996");
        java.lang.String str9 = rSA1.encrypt("\001@");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.decrypt("630010341");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "409117690139534804187895238027" + "'", str7, "409117690139534804187895238027");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3602879701896396800000000000" + "'", str9, "3602879701896396800000000000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n\ufffd\ufffd\ufffd\ufffd\ufffd\u0680\001" + "'", str13, "\n\ufffd\ufffd\ufffd\ufffd\ufffd\u0680\001");
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\002u");
        java.lang.String str9 = rSA1.decrypt("371");
        java.lang.String str11 = rSA1.decrypt("784159943467916");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "549" + "'", str3, "549");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "489" + "'", str7, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\006" + "'", str9, "\002\006");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002#" + "'", str11, "\002#");
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str9 = rSA1.encrypt("1157975770142775");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "40706783686342503951064421390" + "'", str9, "40706783686342503951064421390");
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("1571893042486033");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("8610947732");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\177" + "'", str7, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1098163174" + "'", str11, "1098163174");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("\002.");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "15556545457192904858052964717" + "'", str7, "15556545457192904858052964717");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "279" + "'", str13, "279");
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("3077056399");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("\t");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "J\007\006_" + "'", str9, "J\007\006_");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1069758570" + "'", str11, "1069758570");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd" + "'", str13, "\002\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "729" + "'", str17, "729");
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.encrypt("35549168584584202529715460357");
        java.math.BigInteger bigInteger4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = rSA1.encrypt(bigInteger4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1516548161096681" + "'", str3, "1516548161096681");
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.decrypt("314");
        java.lang.String str15 = rSA1.decrypt("2533194306");
        java.lang.String str17 = rSA1.encrypt("d2FD");
        java.lang.String str19 = rSA1.decrypt("1078240112268825");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "509" + "'", str9, "509");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001j" + "'", str15, "\001j");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "668" + "'", str17, "668");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001T" + "'", str19, "\001T");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd");
        java.lang.String str13 = rSA1.encrypt("174");
        java.lang.String str15 = rSA1.encrypt("32240514587154718931662346782");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "319" + "'", str3, "319");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "142" + "'", str5, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "427" + "'", str11, "427");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "467" + "'", str13, "467");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "29" + "'", str15, "29");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("\002\u028e\r\ufffd\ufffd\f\ufffd\ufffd");
        java.lang.String str13 = rSA1.decrypt("211");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.decrypt("3799685695");
        java.lang.String str19 = rSA1.decrypt("1082096674");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\002\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????=?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "13517864085877443059341136612" + "'", str11, "13517864085877443059341136612");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\025\ufffd\ufffd\u0180\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\001\025\ufffd\ufffd\u0180\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\0035\036\ufffd\ufffd\ufffd\ufffd\006\ufffd[" + "'", str17, "\0035\036\ufffd\ufffd\ufffd\ufffd\006\ufffd[");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\0133Oq%\013\u0147\ufffd?\035" + "'", str19, "\0133Oq%\013\u0147\ufffd?\035");
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("1075488919");
        java.lang.String str15 = rSA1.decrypt("250047");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "57231453785640435810305563426" + "'", str7, "57231453785640435810305563426");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\001" + "'", str13, "\001\001");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "?" + "'", str15, "?");
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("302478007679515165391351820133");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18072614173009387080189488071" + "'", str11, "18072614173009387080189488071");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "104684930278290183802567807092" + "'", str13, "104684930278290183802567807092");
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("4084101");
        java.lang.String str9 = rSA1.decrypt("3");
        java.lang.String str11 = rSA1.encrypt("605");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "893" + "'", str7, "893");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "276" + "'", str11, "276");
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("166");
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "336" + "'", str3, "336");
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("\023\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str7 = rSA1.decrypt("37687704605112457902789117609");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "478551020060408947355790824555" + "'", str5, "478551020060408947355790824555");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006v\024\ufffd\ufffd\ufffdH\177\u0370\ufffd" + "'", str7, "\006v\024\ufffd\ufffd\ufffdH\177\u0370\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\002u");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "473" + "'", str5, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "488" + "'", str7, "488");
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "160" + "'", str3, "160");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "875" + "'", str5, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\032" + "'", str7, "\032");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003L" + "'", str9, "\003L");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "685" + "'", str11, "685");
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("205");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("94");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441405218563368332580810580314" + "'", str5, "441405218563368332580810580314");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\013\ufffd\ufffd\ufffd\004\ufffd\006" + "'", str7, "\003\ufffd\ufffd\013\ufffd\ufffd\ufffd\004\ufffd\006");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "233483483340148695447226182872" + "'", str9, "233483483340148695447226182872");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "347" + "'", str13, "347");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\u07dd\ufffd\ufffd\034\ufffd\033");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\u01f2\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd\u01f2\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "519172736525770981361499519994" + "'", str9, "519172736525770981361499519994");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "665772339587410335694373052915" + "'", str11, "665772339587410335694373052915");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "527461943715703587853653950479" + "'", str13, "527461943715703587853653950479");
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("393");
        java.lang.String str7 = rSA1.decrypt("227022896246510918381181022856");
        java.lang.String str9 = rSA1.encrypt("326");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \",A,\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "111" + "'", str5, "111");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "y" + "'", str7, "y");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "337" + "'", str9, "337");
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("3066983185");
        java.lang.String str7 = rSA1.decrypt("3077056399");
        java.lang.String str9 = rSA1.encrypt("6103515625");
        java.lang.String str11 = rSA1.decrypt("495729105335719923501365928620");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "77" + "'", str5, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "D" + "'", str7, "D");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "31" + "'", str9, "31");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str5 = rSA1.decrypt("338664280");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "581289633302345489393324014769" + "'", str3, "581289633302345489393324014769");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\007\ufffd\ufffd\u0567\ufffd\ufffd\ufffd\ufffd" + "'", str5, "\007\ufffd\ufffd\u0567\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("2063650974266313");
        java.lang.String str5 = rSA1.decrypt("275");
        java.lang.String str7 = rSA1.decrypt("180561759819135041582650684250");
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "71767945116745466745561831569" + "'", str3, "71767945116745466745561831569");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd4" + "'", str5, "\ufffd\ufffd\ufffd\ufffd\ufffd4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001I\003\020\ufffd\ufffd\ufffd\ufffd1\034" + "'", str7, "\001I\003\020\ufffd\ufffd\ufffd\ufffd1\034");
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("\002\ufffd\ufffdD");
        java.lang.String str17 = rSA1.encrypt("\001\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "490" + "'", str3, "490");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002W" + "'", str9, "\002W");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "673" + "'", str11, "673");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "323943017262305714472051308355" + "'", str15, "323943017262305714472051308355");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "254024667406952093543960699680" + "'", str17, "254024667406952093543960699680");
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str9 = rSA1.encrypt("\006]l\002\ufffd\000\ufffd");
        java.lang.String str11 = rSA1.encrypt("529");
        java.lang.String str13 = rSA1.decrypt("376246048843492595435359636666");
        java.lang.String str15 = rSA1.encrypt("\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "541465644660527586625956642710" + "'", str9, "541465644660527586625956642710");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "42372216986251659625" + "'", str11, "42372216986251659625");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\003\ufffd\007\ufffd\ufffd\035\r\ufffd\006\ufffd\"" + "'", str13, "\005\003\ufffd\007\ufffd\ufffd\035\r\ufffd\006\ufffd\"");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "457428487897605698845132406980" + "'", str15, "457428487897605698845132406980");
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("4448254484");
        java.lang.String str9 = rSA1.encrypt("1573319938");
        java.lang.String str11 = rSA1.decrypt("6307084357");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\b\u0440\ufffdd\003\ufffdz-\005X");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "267" + "'", str5, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "564" + "'", str7, "564");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "142" + "'", str9, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\017" + "'", str11, "\001\017");
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\001;");
        rSA1.generateKeys((int) '#');
        java.lang.String str17 = rSA1.decrypt("438640715");
        java.lang.String str19 = rSA1.encrypt("432076670134015691603482141593");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20" + "'", str3, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd" + "'", str7, "\003\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "60028920066643817465488842746" + "'", str11, "60028920066643817465488842746");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "307732862434921875" + "'", str13, "307732862434921875");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\023" + "'", str17, "\001\ufffd\ufffd\023");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "9233679448" + "'", str19, "9233679448");
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.decrypt("25361813327098706573674400856");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("@ \177\ufffd\002\ufffd\026\u01c6\ufffdi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"@ \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20" + "'", str3, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "58" + "'", str7, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003R" + "'", str9, "\003R");
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("168");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd\f\r\ufffd\021x");
        java.lang.String str17 = rSA1.decrypt("88");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "z" + "'", str3, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7386829397" + "'", str9, "7386829397");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4648998938" + "'", str11, "4648998938");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "83024144647408098855547838738" + "'", str15, "83024144647408098855547838738");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffdX6QZ" + "'", str17, "\ufffd\ufffd\ufffdX6QZ");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("461");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001/\035\ufffd" + "'", str7, "\001/\035\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "141618142" + "'", str9, "141618142");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "519" + "'", str13, "519");
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.encrypt("432076670134015691603482141593");
        java.lang.String str7 = rSA1.encrypt("513130765460560900877328176159");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "231" + "'", str3, "231");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "24" + "'", str5, "24");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "222" + "'", str7, "222");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.decrypt("616");
        rSA1.generateKeys((int) 'a');
        java.lang.String str9 = rSA1.decrypt("521");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",\017\ufffd\006\ufffd\ufffd\ufffd\004\"\ufffd" + "'", str9, ",\017\ufffd\006\ufffd\ufffd\ufffd\004\"\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "563244441790183363920686352846" + "'", str15, "563244441790183363920686352846");
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.encrypt("230286050865478780396462815956");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "14502897045120538810683242797" + "'", str11, "14502897045120538810683242797");
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("\002R");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str21 = rSA1.decrypt("206102922541089639202521824150");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\032" + "'", str3, "\002\032");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\"" + "'", str9, "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\"");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "73948986280224" + "'", str15, "73948986280224");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\007MYWe\n\031" + "'", str21, "\007MYWe\n\031");
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("3077056399");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.decrypt("35583402576551630221");
        rSA1.generateKeys(100);
        java.lang.String str21 = rSA1.encrypt("1733647422");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20" + "'", str3, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\034\ufffd0" + "'", str9, "\000\ufffd\034\ufffd0");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1748829513" + "'", str11, "1748829513");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\030q\027\032" + "'", str13, "\030q\027\032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\0018" + "'", str17, "\0018");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "338482491298516222434413179948" + "'", str21, "338482491298516222434413179948");
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("32");
        java.lang.String str9 = rSA1.decrypt("375");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002" + "'", str7, "\002");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001*" + "'", str9, "\001*");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("693");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.decrypt("331");
        java.lang.String str13 = rSA1.encrypt("793211856886162384804147772647");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "27536354755265864685223023494" + "'", str3, "27536354755265864685223023494");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "37516270310098459849641232528" + "'", str5, "37516270310098459849641232528");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001H\f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdyL" + "'", str11, "\001H\f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdyL");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "503995936607988986592383063059" + "'", str13, "503995936607988986592383063059");
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.decrypt("394");
        java.lang.String str7 = rSA1.decrypt("118946747121874786982447718921");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "231" + "'", str3, "231");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001=" + "'", str5, "\001=");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        java.lang.String str9 = rSA1.encrypt("\ufffd\u011d\ufffd\ufffd\ufffd`\002S+f");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001W" + "'", str5, "\001W");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005" + "'", str7, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "352" + "'", str9, "352");
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("946669947");
        java.lang.String str7 = rSA1.encrypt("414601987065913579031306059745");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("421538216752639241087728305427");
        java.lang.String str13 = rSA1.encrypt("4084101");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "p" + "'", str5, "p");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "640" + "'", str7, "640");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "184544171989725732823681117709" + "'", str11, "184544171989725732823681117709");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "153488509612963100162054930173" + "'", str13, "153488509612963100162054930173");
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        java.lang.String str13 = rSA1.decrypt("32");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001W" + "'", str5, "\001W");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005" + "'", str7, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffdO\017\021\ufffd\ufffd\ufffd" + "'", str11, "\003\ufffd\ufffd\ufffd\ufffdO\017\021\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\016$\000\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\016$\000\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        java.lang.String str9 = rSA1.encrypt("48241217274650060621544778321");
        java.lang.String str11 = rSA1.encrypt("233522071185160290788315309401");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "139536600218931075488724601808" + "'", str5, "139536600218931075488724601808");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\u0647\ufffd\ufffd\ufffd\ufffd^" + "'", str7, "\001\u0647\ufffd\ufffd\ufffd\ufffd^");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "485187520020348699820729754575" + "'", str9, "485187520020348699820729754575");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "745562770443974778444401446872" + "'", str11, "745562770443974778444401446872");
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.decrypt("265482618753364");
        java.lang.String str19 = rSA1.encrypt("332");
        java.lang.String str21 = rSA1.encrypt("1153409057");
        java.lang.String str23 = rSA1.encrypt("41040010864058381795223349389");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "478" + "'", str7, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n\ufffd\u050a\ufffd\u03f7\ufffd\ufffdK7" + "'", str17, "\n\ufffd\u050a\ufffd\u03f7\ufffd\ufffdK7");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "246645748134111282160220676453" + "'", str19, "246645748134111282160220676453");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "748294429234634606691677978672" + "'", str21, "748294429234634606691677978672");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "50992713368286409169022315051" + "'", str23, "50992713368286409169022315051");
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("56181887");
        java.lang.String str11 = rSA1.encrypt("181970895497689");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1724689858055974204807604090" + "'", str7, "1724689858055974204807604090");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "39671960832818088713566409512" + "'", str9, "39671960832818088713566409512");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40170428748749766608397142789" + "'", str11, "40170428748749766608397142789");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("3077056399");
        java.lang.String str15 = rSA1.decrypt("715053248569397442655422819632");
        java.lang.String str17 = rSA1.encrypt("\002\ufffd\ufffd\033");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "267" + "'", str5, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str9, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1572583680" + "'", str11, "1572583680");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6\024\u01f7" + "'", str13, "6\024\u01f7");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Qx}0" + "'", str15, "Qx}0");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1393451332" + "'", str17, "1393451332");
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.encrypt("262");
        java.lang.String str13 = rSA1.encrypt("630010341");
        java.lang.String str15 = rSA1.decrypt("307987865312104598997785831420");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "705783041649131406726365046519" + "'", str5, "705783041649131406726365046519");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "728499944885328832662746049353" + "'", str7, "728499944885328832662746049353");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffdP\016\ufffd\ufffd\ufffdKA\024[" + "'", str9, "\004\ufffd\ufffdP\016\ufffd\ufffd\ufffdKA\024[");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35633179814210302024" + "'", str11, "35633179814210302024");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "470851406607729000495871704053" + "'", str13, "470851406607729000495871704053");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\u01fd/s\tSN" + "'", str15, "\003\ufffd\ufffd\ufffd\u01fd/s\tSN");
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '4');
        java.lang.String str9 = rSA1.encrypt("206");
        java.lang.String str11 = rSA1.encrypt("226208872463543249023298211472");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3348064752318901" + "'", str9, "3348064752318901");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3345365417955730" + "'", str11, "3345365417955730");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        java.lang.String str13 = rSA1.decrypt("32");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str19 = rSA1.decrypt("137642157118530");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002L" + "'", str5, "\002L");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007" + "'", str7, "\007");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\u0624\ufffd\ufffdH" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffd\u0624\ufffd\ufffdH");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002" + "'", str13, "\002");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\003\tv\034\ufffd\ufffd" + "'", str19, "\ufffd\003\tv\034\ufffd\ufffd");
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("1075488919");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "42386882592555058418078032646" + "'", str7, "42386882592555058418078032646");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\t" + "'", str13, "\001\t");
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("|");
        java.lang.String str13 = rSA1.decrypt("29339648412823630308726258195");
        java.lang.String str15 = rSA1.encrypt("24829636972784436289623304425");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\177" + "'", str3, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffdT" + "'", str7, "\ufffd\ufffdT");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "882595711484397" + "'", str11, "882595711484397");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffdA" + "'", str13, "\ufffd\ufffdA");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1374014002975972" + "'", str15, "1374014002975972");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.decrypt("1091385417287759808405208588958");
        java.lang.String str11 = rSA1.encrypt("24728158503917487987839420576");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\023\007\ufffd\ufffd\ufffd\u057d\u0627" + "'", str9, "\003\023\007\ufffd\ufffd\ufffd\u057d\u0627");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "651670695405319593259226976324" + "'", str11, "651670695405319593259226976324");
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.decrypt("279");
        java.lang.String str11 = rSA1.decrypt("177");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "351" + "'", str7, "351");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("1998947500173");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u0370\ufffd");
        java.lang.String str11 = rSA1.decrypt("15028238390418345727767527777");
        java.lang.String str13 = rSA1.encrypt("X\034R\004\ufffd\ufffd\000\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("317579693760000000000");
        java.lang.String str17 = rSA1.encrypt("2156828580");
        java.lang.String str19 = rSA1.decrypt("361004806960609225726300111494");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str23 = rSA1.encrypt("270");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "529" + "'", str9, "529");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "699" + "'", str13, "699");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "735" + "'", str15, "735");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "538" + "'", str17, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "," + "'", str19, ",");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "35641431795085258752" + "'", str23, "35641431795085258752");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("66");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\006" + "'", str5, "\001\006");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23" + "'", str7, "23");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7\r\ufffd\ufffdN\t<]-" + "'", str13, "7\r\ufffd\ufffdN\t<]-");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\005\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("288");
        java.lang.String str15 = rSA1.decrypt("377");
        java.lang.String str17 = rSA1.encrypt("1102300624");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "289317523179409541956235133490" + "'", str11, "289317523179409541956235133490");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "65453479154384390741235180782" + "'", str13, "65453479154384390741235180782");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffdc\n" + "'", str15, "\002\ufffd\ufffd\ufffd\ufffdc\n");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "597058004150098240916831841524" + "'", str17, "597058004150098240916831841524");
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.decrypt("314");
        java.lang.String str15 = rSA1.decrypt("2533194306");
        java.lang.String str17 = rSA1.encrypt("d2FD");
        java.lang.String str19 = rSA1.encrypt("\000\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "271" + "'", str9, "271");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\022" + "'", str13, "\001\022");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\0016" + "'", str15, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "254" + "'", str17, "254");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "240" + "'", str19, "240");
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.encrypt("9215357598594065411749980871");
        java.lang.String str17 = rSA1.encrypt("5637094912");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "110" + "'", str7, "110");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "490" + "'", str11, "490");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7450213185" + "'", str15, "7450213185");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "5097954452" + "'", str17, "5097954452");
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("3066983185");
        java.lang.String str7 = rSA1.decrypt("61584285635961350532428348479");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\000\ufffd\ufffd\ufffd\u0370\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20" + "'", str3, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "23" + "'", str5, "23");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        java.lang.String str9 = rSA1.encrypt("43498179141247");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "874278378640691" + "'", str9, "874278378640691");
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "42" + "'", str3, "42");
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("461");
        java.lang.String str11 = rSA1.encrypt("232");
        java.lang.String str13 = rSA1.encrypt("338047304738595353326968429562");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001G" + "'", str3, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\ufffd\ufffd" + "'", str7, "\002\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10112669610" + "'", str9, "10112669610");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "9646193817" + "'", str11, "9646193817");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1309063220" + "'", str13, "1309063220");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("5824490359974973208230734176");
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\005" + "'", str3, "\ufffd\ufffd\005");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "455000688" + "'", str5, "455000688");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\034d\037" + "'", str7, "_\034d\037");
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("66");
        java.lang.String str19 = rSA1.encrypt("\037\ufffdbM");
        java.lang.String str21 = rSA1.encrypt("828537841108208");
        java.lang.String str23 = rSA1.encrypt("372");
        java.lang.String str25 = rSA1.encrypt("227367107339445119077413279516");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UG\002\u0340\ufffd\ufffd\ufffd\ufffd" + "'", str13, "UG\002\u0340\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\ufffdo" + "'", str17, "\002\ufffd\ufffd\ufffdo");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1943043039698837" + "'", str19, "1943043039698837");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "692608890298114" + "'", str21, "692608890298114");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "396869505287000" + "'", str23, "396869505287000");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "216441828252076" + "'", str25, "216441828252076");
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("1208902895495334527");
        java.lang.String str9 = rSA1.decrypt("233006726736920949521554542653");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\ufffd\005\0317xyc\022/|\n\ufffd" + "'", str7, "\005\ufffd\005\0317xyc\022/|\n\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t\ufffdH\030\ufffd\ufffd\ufffd\017Id\007\ufffd" + "'", str9, "\t\ufffdH\030\ufffd\ufffd\ufffd\017Id\007\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '4');
        java.lang.String str9 = rSA1.encrypt("206");
        java.lang.String str11 = rSA1.encrypt("226208872463543249023298211472");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2192960979051876" + "'", str9, "2192960979051876");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1881306459309433" + "'", str11, "1881306459309433");
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\005\ufffd\ufffd\n\ufffd\ufffd*");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "20656163705857698082073881308" + "'", str7, "20656163705857698082073881308");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "557462401080676020900500394023" + "'", str11, "557462401080676020900500394023");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("166");
        java.lang.String str19 = rSA1.encrypt("483");
        rSA1.generateKeys(10);
        java.lang.String str23 = rSA1.decrypt("132382889831422523496195035353");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "478" + "'", str7, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "919755898844941" + "'", str17, "919755898844941");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1733796387844847" + "'", str19, "1733796387844847");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\005" + "'", str23, "\001\005");
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1611067079503803");
        java.lang.String str13 = rSA1.decrypt("18980981751395059997709561778");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.encrypt("219434798064789200990255474386");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "531" + "'", str7, "531");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "143" + "'", str11, "143");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "30" + "'", str17, "30");
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("1208902895495334527");
        java.lang.String str9 = rSA1.encrypt("95");
        java.lang.String str11 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\u0368\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("454");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1495917947262464" + "'", str7, "1495917947262464");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "354557872633234" + "'", str9, "354557872633234");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "645828042712008" + "'", str11, "645828042712008");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1480841716203297" + "'", str13, "1480841716203297");
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("\023\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.decrypt("\005\ufffd\ufffd\t^q\f\ufffdpR");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?Y;?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "180558983406890154419849572660" + "'", str5, "180558983406890154419849572660");
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1611067079503803");
        java.lang.String str13 = rSA1.decrypt("18980981751395059997709561778");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.encrypt("219434798064789200990255474386");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "875" + "'", str5, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "680" + "'", str7, "680");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "162" + "'", str11, "162");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\000" + "'", str13, "\001\000");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "166" + "'", str17, "166");
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "478" + "'", str7, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1611067079503803");
        java.lang.String str13 = rSA1.encrypt("475");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "531" + "'", str7, "531");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "512" + "'", str11, "512");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "250" + "'", str13, "250");
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.decrypt("1091385417287759808405208588958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "111428437534914192297562228532" + "'", str7, "111428437534914192297562228532");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\u0665\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\ufffd\ufffd\u0665\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("253");
        java.lang.String str13 = rSA1.decrypt("450766669594624");
        java.lang.String str15 = rSA1.decrypt("60");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20" + "'", str3, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd" + "'", str7, "\003\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd" + "'", str9, "\003\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005" + "'", str11, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000" + "'", str13, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\\" + "'", str15, "\003\\");
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        java.lang.String str13 = rSA1.decrypt("3085358694");
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20" + "'", str3, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd" + "'", str7, "\003\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd6" + "'", str11, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd6");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("3066983185");
        java.lang.String str7 = rSA1.decrypt("61584285635961350532428348479");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "550" + "'", str5, "550");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("1979640026");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\037\ufffd\ufffd\ufffd\ufffd\f");
        java.lang.String str15 = rSA1.encrypt("1328856617");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "830" + "'", str7, "830");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "12849766" + "'", str11, "12849766");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "471212392" + "'", str13, "471212392");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1917604066" + "'", str15, "1917604066");
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("5407583147");
        java.lang.String str11 = rSA1.decrypt("337784137");
        java.lang.String str13 = rSA1.encrypt("6204354126");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "134" + "'", str7, "134");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "75" + "'", str9, "75");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + ";" + "'", str11, ";");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "282" + "'", str13, "282");
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("166");
        java.lang.String str19 = rSA1.encrypt("483");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) ' ');
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "830" + "'", str7, "830");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "822" + "'", str9, "822");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\030\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\"[" + "'", str13, "\030\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\"[");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1121556827300199" + "'", str17, "1121556827300199");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1440433404822581" + "'", str19, "1440433404822581");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("393");
        java.lang.String str7 = rSA1.decrypt("227022896246510918381181022856");
        java.lang.String str9 = rSA1.decrypt("531");
        java.lang.String str11 = rSA1.encrypt("\005\006\ufffd\000hH");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "279" + "'", str5, "279");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\0016" + "'", str7, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "9" + "'", str11, "9");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("z");
        java.lang.String str9 = rSA1.encrypt("\b\ufffdA3\033\u0459\ufffd\ufffd\030\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\022");
        java.lang.String str13 = rSA1.encrypt("490868902938098");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "316" + "'", str7, "316");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "257" + "'", str9, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "407" + "'", str11, "407");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "374" + "'", str13, "374");
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("516");
        java.lang.String str5 = rSA1.decrypt("3541590856");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("425");
        java.lang.String str13 = rSA1.encrypt("329964049132614116993653227507");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\005\ufffd\ufffd\ufffd\013\ufffd\023\ufffdr\tz" + "'", str3, "\005\ufffd\ufffd\ufffd\013\ufffd\023\ufffdr\tz");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffds0\002\ufffd\ufffd\ufffd\ufffd" + "'", str5, "\001\ufffds0\002\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "101" + "'", str13, "101");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("|");
        java.lang.String str13 = rSA1.decrypt("29339648412823630308726258195");
        java.lang.String str15 = rSA1.encrypt("24829636972784436289623304425");
        java.lang.String str17 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5" + "'", str3, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd~t\n" + "'", str7, "\001\ufffd~t\n");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "450766669594624" + "'", str11, "450766669594624");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffdM(S" + "'", str13, "\004\ufffd\ufffdM(S");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "179435669778977" + "'", str15, "179435669778977");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1139616483866779" + "'", str17, "1139616483866779");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("3077056399");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("\000\ufffd\003\022\ufffd");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "473" + "'", str5, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\026.8" + "'", str9, "\004\026.8");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "385463164" + "'", str11, "385463164");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O" + "'", str13, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "379" + "'", str17, "379");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("166");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\f\ufffd\ufffd\032\ufffd4p\034\ufffd\ufffd" + "'", str13, "\f\ufffd\ufffd\032\ufffd4p\034\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1530129016294413" + "'", str17, "1530129016294413");
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("136");
        java.lang.String str5 = rSA1.encrypt("151367136016652851661766167589");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "476995760888498387444797194097" + "'", str5, "476995760888498387444797194097");
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("\037\ufffdbM");
        java.lang.String str9 = rSA1.encrypt("12191618230608297297178555740");
        java.lang.String str11 = rSA1.decrypt("68");
        java.lang.String str13 = rSA1.decrypt("8");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0016" + "'", str3, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "440" + "'", str7, "440");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "50" + "'", str9, "50");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002" + "'", str13, "\002");
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("461");
        java.lang.String str9 = rSA1.encrypt("\001\033");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001G" + "'", str3, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd5" + "'", str7, "\ufffd\ufffd5");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1770060198" + "'", str9, "1770060198");
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("1208902895495334527");
        java.lang.String str9 = rSA1.encrypt("58");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.decrypt("6241420964");
        java.lang.String str15 = rSA1.decrypt("132382889831422523496195035353");
        java.lang.String str17 = rSA1.encrypt("3145466309");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2014972164593488" + "'", str7, "2014972164593488");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1290884239137948" + "'", str9, "1290884239137948");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\\ufffd\ufffd\ufffd\ufffd4\005\ufffd2O\002" + "'", str13, "\\\ufffd\ufffd\ufffd\ufffd4\005\ufffd2O\002");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\022\ufffdN\001\ufffd\ufffd\ufffdO<P" + "'", str15, "\004\ufffd\022\ufffdN\001\ufffd\ufffd\ufffdO<P");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "360544560719247517854989425976" + "'", str17, "360544560719247517854989425976");
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("946669947");
        java.lang.String str7 = rSA1.encrypt("\ufffd\ufffdR[\020\ufffd");
        java.lang.String str9 = rSA1.decrypt("7353787874");
        java.lang.String str11 = rSA1.decrypt("48159020044353377656022340487");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\013" + "'", str5, "\001\013");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "234" + "'", str7, "234");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "s" + "'", str9, "s");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001(" + "'", str11, "\001(");
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("\001\006");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str21 = rSA1.decrypt("955365536537125");
        java.lang.String str23 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\ufffd\016\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\006" + "'", str5, "\001\006");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23" + "'", str7, "23");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\r\ufffd\ufffd\025\ufffd\ufffd\ufffd\ufffd+8" + "'", str13, "\r\ufffd\ufffd\025\ufffd\ufffd\ufffd\ufffd+8");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1234543668832" + "'", str17, "1234543668832");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "837" + "'", str23, "837");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("\0018");
        java.lang.String str17 = rSA1.encrypt("91");
        java.lang.String str19 = rSA1.decrypt("2202857551365157");
        java.lang.String str21 = rSA1.encrypt("1492432233");
        java.lang.String str23 = rSA1.decrypt("10353329666");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd^");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0016" + "'", str3, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffdg\023\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffdg\023\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2956466552832" + "'", str15, "2956466552832");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "672749994932560009201" + "'", str17, "672749994932560009201");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "755719448012519959475304812737" + "'", str21, "755719448012519959475304812737");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\013\ufffdR\030\f\u011e\ufffdo\"\ufffd\ufffd\ufffd" + "'", str23, "\013\ufffdR\030\f\u011e\ufffdo\"\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("X");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"X\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("4084101");
        java.lang.String str9 = rSA1.decrypt("3");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "24" + "'", str7, "24");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\027" + "'", str9, "\001\027");
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("478");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "252" + "'", str5, "252");
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.decrypt("409247107494479");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str15 = rSA1.encrypt("|JH%w\016\t\ufffd\ufffd\001\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\236\ufffd\ufffd \035\ufffd\ufffdR" + "'", str11, "\002\236\ufffd\ufffd \035\ufffd\ufffdR");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "23783937803801727192129367204" + "'", str15, "23783937803801727192129367204");
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("z");
        java.lang.String str9 = rSA1.encrypt("\b\ufffdA3\033\u0459\ufffd\ufffd\030\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("1470301955");
        java.lang.String str13 = rSA1.decrypt("34771552816615312677513613232");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "320" + "'", str7, "320");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "K" + "'", str13, "K");
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("516");
        java.lang.String str5 = rSA1.encrypt("\006\017\u01c0\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str7 = rSA1.encrypt("a\f\ufffd");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\ufffd\u0719\ufffd\ufffd\ufffd" + "'", str3, "\001\ufffd\ufffd\u0719\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "419209849820391901649125837470" + "'", str5, "419209849820391901649125837470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "522872139202632415739165721459" + "'", str7, "522872139202632415739165721459");
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        java.lang.String str13 = rSA1.decrypt("32");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str19 = rSA1.encrypt("19152287741614");
        java.lang.String str21 = rSA1.decrypt("444286381059900859862762305623");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd}Y" + "'", str11, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd}Y");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002" + "'", str13, "\002");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "32546872555750071758334499936" + "'", str19, "32546872555750071758334499936");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ue7f3\ufffd\ufffd\007\ufffd\037" + "'", str21, "\ue7f3\ufffd\ufffd\007\ufffd\037");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("441");
        java.lang.String str13 = rSA1.encrypt("573027999461902947452889180577");
        java.lang.String str15 = rSA1.encrypt("911315954");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str19 = rSA1.encrypt("27663345349974969767929546344");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2562664090" + "'", str11, "2562664090");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2834618102" + "'", str13, "2834618102");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1056761805" + "'", str15, "1056761805");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "721" + "'", str19, "721");
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("12856024970639395620261580662");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("493039");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15406782090135651915836686674" + "'", str3, "15406782090135651915836686674");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "21462477361530295904135577151" + "'", str5, "21462477361530295904135577151");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1453473149" + "'", str11, "1453473149");
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("66");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str21 = rSA1.encrypt("408");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\t" + "'", str5, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "788" + "'", str7, "788");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\u06ae\b\007\ufffd%" + "'", str17, "\005\u06ae\b\007\ufffd%");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "40009267745900637696" + "'", str21, "40009267745900637696");
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.encrypt("228013474449632847102912946578");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p" + "'", str3, "p");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "526" + "'", str7, "526");
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("461");
        java.lang.String str11 = rSA1.encrypt("\0018");
        java.lang.String str13 = rSA1.encrypt("\005\ufffd\ufffdm\004");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8758756759" + "'", str9, "8758756759");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10794330811" + "'", str11, "10794330811");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8235922939" + "'", str13, "8235922939");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        java.lang.String str9 = rSA1.decrypt("26219083027485407049437271166");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "F" + "'", str9, "F");
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("235");
        java.lang.String str13 = rSA1.decrypt("93629648365587704361423475727");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\\\027\023\ufffd`\013\ufffd\ufffd\"" + "'", str7, "\001\\\027\023\ufffd`\013\ufffd\ufffd\"");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\007\ufffd\ufffd\ufffd\ufffd\022\ufffd" + "'", str11, "\002\ufffd\007\ufffd\ufffd\ufffd\ufffd\022\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\016\ufffd\ufffd\005\ufffd\ufffdUd%\016\ufffd\ufffd" + "'", str13, "\007\016\ufffd\ufffd\005\ufffd\ufffdUd%\016\ufffd\ufffd");
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str11 = rSA1.encrypt("\002\ufffd>");
        java.lang.String str13 = rSA1.encrypt("798");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\b\u0108\ufffd\ufffd\ufffd\ufffd\r\ufffd\ufffdP9");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?C??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\025[o\004#\004\032E\005\ufffd\ufffd\ufffd" + "'", str7, "\025[o\004#\004\032E\005\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12279086826643923257260239880" + "'", str9, "12279086826643923257260239880");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2161964279531492631050725194" + "'", str11, "2161964279531492631050725194");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19531171207401153976494914230" + "'", str13, "19531171207401153976494914230");
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("12856024970639395620261580662");
        java.lang.String str7 = rSA1.decrypt("5411392559");
        java.lang.String str9 = rSA1.encrypt("{");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "33562394575160520077" + "'", str3, "33562394575160520077");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "17958097463175976601391498834" + "'", str5, "17958097463175976601391498834");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\002\ufffdk\022o\020\032\ufffd\ufffd\f" + "'", str7, "\002\002\ufffdk\022o\020\032\ufffd\ufffd\f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1860867" + "'", str9, "1860867");
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.encrypt("267732256991725538729642205655");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "42" + "'", str7, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "205" + "'", str9, "205");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "120" + "'", str11, "120");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\037\ufffd\027\ufffd\ufffdq5");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\ufffdK");
        java.lang.String str15 = rSA1.encrypt("\006\ufffd\u767c\ufffd\ufffd\ufffd\ufffd\001");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "96" + "'", str5, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\031\ufffd\000\006" + "'", str9, "\031\ufffd\000\006");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2297564677" + "'", str11, "2297564677");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2791773574" + "'", str13, "2791773574");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2108139505" + "'", str15, "2108139505");
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("\037\ufffdbM");
        java.lang.String str9 = rSA1.encrypt("12191618230608297297178555740");
        java.lang.String str11 = rSA1.decrypt("68");
        java.lang.String str13 = rSA1.decrypt("8");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\032" + "'", str3, "\002\032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "440" + "'", str7, "440");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "50" + "'", str9, "50");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002" + "'", str13, "\002");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("946669947");
        java.lang.String str7 = rSA1.encrypt("414601987065913579031306059745");
        java.lang.String str9 = rSA1.decrypt("43845903535359091850927913216");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "268" + "'", str7, "268");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("szE\037");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "25825540019868510537003350249" + "'", str7, "25825540019868510537003350249");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10836728549" + "'", str11, "10836728549");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.encrypt("1610322262");
        java.lang.String str13 = rSA1.encrypt("\007\ufffdw\003\ufffd\ufffd\n\ufffd\b\ufffd\ufffd");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd|\016\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\ufffd|\016\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "521911363463711187581575353897" + "'", str11, "521911363463711187581575353897");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "981871995653806936169583364008" + "'", str13, "981871995653806936169583364008");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("66");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32" + "'", str7, "32");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "18" + "'", str9, "18");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\037\ufffd\ufffd\ufffdg\013" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\037\ufffd\ufffd\ufffdg\013");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffd\023\032\ufffd" + "'", str17, "\003\ufffd\ufffd\023\032\ufffd");
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("\002\ufffd");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str19 = rSA1.encrypt("17399606650451632470785729796");
        java.lang.String str21 = rSA1.encrypt("18633300585329847492285100346");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "830" + "'", str7, "830");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "822" + "'", str9, "822");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "812" + "'", str15, "812");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "386" + "'", str19, "386");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "444" + "'", str21, "444");
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("168");
        java.lang.String str13 = rSA1.decrypt("519150271579176891438134447055");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\003");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\024Q" + "'", str7, "\000\ufffd\ufffd\024Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5403588318" + "'", str9, "5403588318");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2667069333" + "'", str11, "2667069333");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002-\017\024G" + "'", str13, "\002-\017\024G");
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\002u");
        java.lang.String str9 = rSA1.encrypt("453285907300587");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.encrypt("305");
        java.lang.String str15 = rSA1.encrypt("{\035\ufffd\ufffdy");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "13" + "'", str7, "13");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "158" + "'", str9, "158");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "336093871327308199542888689112" + "'", str13, "336093871327308199542888689112");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "430354282113257093960679487893" + "'", str15, "430354282113257093960679487893");
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.encrypt("674589993819081348249");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str19 = rSA1.decrypt("545317243777228371282435093352");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "236" + "'", str3, "236");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "91" + "'", str7, "91");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "490" + "'", str11, "490");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "144" + "'", str15, "144");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd\ufffd$\n\u06d0\013\ufffd" + "'", str19, "\001\ufffd\ufffd$\n\u06d0\013\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("148019774747790885656882734520");
        java.lang.String str11 = rSA1.encrypt("823793320955474186263669419959");
        java.lang.String str13 = rSA1.decrypt("17984728");
        java.lang.String str15 = rSA1.encrypt("86550299156701658687407103719");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "470" + "'", str5, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "292" + "'", str7, "292");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "141" + "'", str9, "141");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "330" + "'", str11, "330");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\006" + "'", str13, "\001\006");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "162" + "'", str15, "162");
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.encrypt("228013474449632847102912946578");
        java.lang.String str9 = rSA1.decrypt("42988629419629811268004412533");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.decrypt("35583402576551630221");
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "B" + "'", str5, "B");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "213" + "'", str7, "213");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6" + "'", str9, "6");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "205" + "'", str15, "205");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("56181887");
        java.lang.String str11 = rSA1.decrypt("7591156848866311702672535389");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19644515077456957939447417308" + "'", str7, "19644515077456957939447417308");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "36320962582662327358787742178" + "'", str9, "36320962582662327358787742178");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\035\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\000\ufffd\035\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("|");
        java.lang.String str13 = rSA1.decrypt("3350584720");
        java.lang.String str15 = rSA1.decrypt("6241420964");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "z" + "'", str3, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\u07b7\ufffd" + "'", str7, "\001\u07b7\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "29316250624" + "'", str11, "29316250624");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\r\ufffdv" + "'", str13, "\005\ufffd\ufffd\r\ufffdv");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\005\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.decrypt("641495569173411");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\004\003\u01e3\ufffd\ufffd6\026\ufffdC\034\ufffd\ufffd" + "'", str5, "\004\003\u01e3\ufffd\ufffd6\026\ufffdC\034\ufffd\ufffd");
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.decrypt("166");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str15 = rSA1.decrypt("651940208582405295700948505246");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\u0246\ufffd\b\ufffd\u0545\ufffd\ufffd" + "'", str15, "\b\ufffd\u0246\ufffd\b\ufffd\u0545\ufffd\ufffd");
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("4084101");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\001\ufffd\013\013\ufffd\ufffd\020\036");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?9\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "24" + "'", str7, "24");
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.encrypt("\006");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "110" + "'", str7, "110");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "362" + "'", str11, "362");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "216" + "'", str17, "216");
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\007\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("780550156903929067161254379605");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "268" + "'", str7, "268");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "216" + "'", str9, "216");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}
