package ciphers.RSA;

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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "l" + "'", str3, "l");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffdz\020\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\003\ufffd\ufffdz\020\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "73948986280224" + "'", str15, "73948986280224");
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        java.lang.String str9 = rSA1.decrypt("143827611740296741825726282072");
        java.lang.String str11 = rSA1.encrypt("\ufffdq\007\ufffd\t7Z");
        java.lang.String str13 = rSA1.encrypt("1686607027");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001f" + "'", str3, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd" + "'", str7, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd7" + "'", str9, "\001\ufffd7");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5854378428" + "'", str11, "5854378428");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6012987233" + "'", str13, "6012987233");
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
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
        java.lang.String str23 = rSA1.encrypt("\001\ufffd\ufffd");
        java.lang.String str25 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002L" + "'", str5, "\002L");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007" + "'", str7, "\007");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1316831440421675214010130083" + "'", str11, "1316831440421675214010130083");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "39854983792506834240320020004" + "'", str13, "39854983792506834240320020004");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\ufffdXz" + "'", str15, "\004\ufffd\ufffd\ufffdXz");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffdH\003\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\001\ufffdH\003\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "103233685751852216830994751307" + "'", str19, "103233685751852216830994751307");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "628707943020301321366746394086" + "'", str21, "628707943020301321366746394086");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "307344492483447825617702273869" + "'", str23, "307344492483447825617702273869");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "647163872309298578884733845916" + "'", str25, "647163872309298578884733845916");
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("9810541998");
        java.lang.String str7 = rSA1.encrypt("464474266158928085096919782450");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "332" + "'", str5, "332");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "328" + "'", str7, "328");
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
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
        java.lang.String str21 = rSA1.encrypt("736737326379214042397990489627");
        java.lang.String str23 = rSA1.encrypt("143810726549179278057296440343");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "110" + "'", str7, "110");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "176" + "'", str11, "176");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "279936" + "'", str17, "279936");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "456284106850173131344699417698" + "'", str21, "456284106850173131344699417698");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "319569726997203001034382530189" + "'", str23, "319569726997203001034382530189");
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("791944786");
        java.lang.String str13 = rSA1.encrypt("\013\ufffd\u02ef\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "z" + "'", str3, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str7, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "281" + "'", str13, "281");
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("z");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\023\u049a\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd[\016\ufffd\ufffd\020\ufffd\ufffd&w" + "'", str9, "\ufffd[\016\ufffd\ufffd\020\ufffd\ufffd&w");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "27027081632" + "'", str15, "27027081632");
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\037\ufffd\027\ufffd\ufffdq5");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\ufffdK");
        java.lang.String str15 = rSA1.encrypt("\0260\016\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20" + "'", str3, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\031\ufffd\ufffd" + "'", str9, "\031\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2098190416" + "'", str11, "2098190416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3081907677" + "'", str13, "3081907677");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "964137852" + "'", str15, "964137852");
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("386206508935491231790569964318");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\ufffd\ufffdHU\001\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Aum\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "304" + "'", str3, "304");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "576" + "'", str5, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "304" + "'", str7, "304");
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("465270144019721");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("8");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("805453545486090582568173469490");
        java.lang.String str17 = rSA1.encrypt("1162119021124705");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "283" + "'", str5, "283");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "103" + "'", str7, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\031" + "'", str11, "\031");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "357" + "'", str13, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "221" + "'", str15, "221");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "361" + "'", str17, "361");
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("478");
        java.lang.String str13 = rSA1.encrypt("\t\ufffdY\005l");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "875" + "'", str5, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "680" + "'", str7, "680");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "137" + "'", str11, "137");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "202" + "'", str13, "202");
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("{");
        java.lang.String str13 = rSA1.decrypt("0");
        java.lang.String str15 = rSA1.decrypt("41");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "461" + "'", str7, "461");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "98" + "'", str11, "98");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000" + "'", str13, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001/" + "'", str15, "\001/");
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("\0020O\030\007");
        java.lang.String str15 = rSA1.encrypt("436491829681041234280355093543");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "16249359059220669753076065703" + "'", str13, "16249359059220669753076065703");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "33572269490313086039285511817" + "'", str15, "33572269490313086039285511817");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("489");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\032\ufffd\ufffd\ufffd\ufffdc" + "'", str11, "\003\ufffd\032\ufffd\ufffd\ufffd\ufffdc");
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "110" + "'", str7, "110");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "101" + "'", str11, "101");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "913584220" + "'", str17, "913584220");
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("307707995715569958842130375");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str3, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2094165477" + "'", str5, "2094165477");
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.decrypt("616");
        rSA1.generateKeys((int) 'a');
        java.lang.String str9 = rSA1.decrypt("521");
        java.lang.String str11 = rSA1.encrypt("214");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\003" + "'", str5, "\001\003");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffdQ\025>\035\ufffd\ufffd" + "'", str9, "\ufffdQ\025>\035\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35591679331313571136" + "'", str11, "35591679331313571136");
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        java.lang.String str15 = rSA1.encrypt("875");
        java.lang.String str17 = rSA1.decrypt("392170649013389");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\u068a\ufffd\ufffd\ufffdE\"" + "'", str13, "\000\ufffd\ufffd\ufffd\u068a\ufffd\ufffd\ufffdE\"");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "55330180355803752685534909256" + "'", str15, "55330180355803752685534909256");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "5\026\ufffd\ufffdOI\035\ufffd\ufffd" + "'", str17, "5\026\ufffd\ufffdOI\035\ufffd\ufffd");
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("1208902895495334527");
        java.lang.String str9 = rSA1.encrypt("95");
        java.lang.String str11 = rSA1.encrypt("1798350776157985");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.encrypt("231304546751176212661338793524");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "279366588454725" + "'", str7, "279366588454725");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "782572251296704" + "'", str9, "782572251296704");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "184377390551791" + "'", str11, "184377390551791");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "201" + "'", str17, "201");
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\003\ufffd\ufffd\ufffd\ufffd\005\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?L?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5100221542955268257702070299" + "'", str7, "5100221542955268257702070299");
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("136");
        java.lang.String str5 = rSA1.encrypt("151367136016652851661766167589");
        java.lang.String str7 = rSA1.encrypt("\ufffd\ufffd\ufffd\u0795\ufffd$");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("k");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"k\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\017\ufffd\ufffd\022\ufffd\027\ufffd=>^" + "'", str3, "\017\ufffd\ufffd\022\ufffd\027\ufffd=>^");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "624758804846169998880424948427" + "'", str5, "624758804846169998880424948427");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "607133015109951512073423052596" + "'", str7, "607133015109951512073423052596");
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        java.lang.String str13 = rSA1.encrypt("2633919501113675109991304621");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "819864779741565811691399999375" + "'", str5, "819864779741565811691399999375");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\030\ufffd\032\ufffd\034iP\000;M" + "'", str7, "\002\ufffd\030\ufffd\032\ufffd\034iP\000;M");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "944210189690092293794389722052" + "'", str9, "944210189690092293794389722052");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "298183492994136512890510013330" + "'", str11, "298183492994136512890510013330");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "750330556161606588270712990085" + "'", str13, "750330556161606588270712990085");
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.decrypt("149");
        java.lang.String str9 = rSA1.decrypt("400");
        java.lang.String str11 = rSA1.encrypt("\017");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\t" + "'", str3, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "907" + "'", str5, "907");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002f" + "'", str7, "\002f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd" + "'", str9, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "302" + "'", str11, "302");
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
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
        java.lang.String str21 = rSA1.encrypt("392");
        java.lang.String str23 = rSA1.decrypt("433957177");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O" + "'", str5, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "416" + "'", str7, "416");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "287" + "'", str9, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\002\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffd\002\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "378730061178640" + "'", str17, "378730061178640");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "543974808549598" + "'", str19, "543974808549598");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "535030655374523" + "'", str21, "535030655374523");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd\ufffd\ufffd}" + "'", str23, "\001\ufffd\ufffd\ufffd}");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\002u");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("489");
        java.lang.String str13 = rSA1.encrypt("\031\ufffd\ufffd\ufffd\007\ufffd\ufffd");
        java.lang.String str15 = rSA1.decrypt("217");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "13" + "'", str7, "13");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "473" + "'", str11, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "456" + "'", str13, "456");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "E" + "'", str15, "E");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\001;");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("6901296438808693457125536937");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001@" + "'", str7, "\001@");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "376244896409212782610874637542" + "'", str11, "376244896409212782610874637542");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "31255875" + "'", str13, "31255875");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffdt|\013" + "'", str17, "\ufffd\ufffd\ufffd\ufffd\ufffdt|\013");
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("56181887");
        java.lang.String str11 = rSA1.encrypt("181970895497689");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "190732590202488837125306053" + "'", str7, "190732590202488837125306053");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9782088241786809871778593603" + "'", str9, "9782088241786809871778593603");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "38833792420980783632208676229" + "'", str11, "38833792420980783632208676229");
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("1056808122067448795285291111099");
        java.lang.String str11 = rSA1.encrypt("95713742899465314674436956416");
        java.lang.String str13 = rSA1.encrypt("500843981419849368791895601918");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\035\ufffd\ufffd\ufffdj\003\ufffd\026\ufffd" + "'", str9, "\035\ufffd\ufffd\ufffdj\003\ufffd\026\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "39039469129221594443932821517" + "'", str11, "39039469129221594443932821517");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "24532836005837375321238621134" + "'", str13, "24532836005837375321238621134");
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("478");
        java.lang.String str15 = rSA1.encrypt("646");
        java.lang.String str17 = rSA1.decrypt("1547238756162089");
        java.lang.String str19 = rSA1.decrypt("1311484430155075");
        rSA1.generateKeys(10);
        java.lang.String str23 = rSA1.encrypt(":");
        rSA1.generateKeys((int) ' ');
        java.lang.String str27 = rSA1.encrypt("35836334681033040583371831258");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "285" + "'", str7, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "294" + "'", str9, "294");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6468494234" + "'", str13, "6468494234");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "921257291" + "'", str15, "921257291");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd" + "'", str17, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\ufffd\034" + "'", str19, "\ufffd\ufffd\034");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "728" + "'", str23, "728");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "102812702" + "'", str27, "102812702");
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str11 = rSA1.encrypt("\002\ufffd>");
        java.lang.String str13 = rSA1.decrypt("23264544955983291322485115342");
        java.lang.String str15 = rSA1.encrypt("80152831082072364050376208382");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".\031\ufffd\023\ufffd\ufffd\036\ufffd\000\ufffd\ufffd" + "'", str7, ".\031\ufffd\023\ufffd\ufffd\036\ufffd\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "56161493219709654226797375773" + "'", str9, "56161493219709654226797375773");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "33331229775964756023839119922" + "'", str11, "33331229775964756023839119922");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "30139585359683111401439300526" + "'", str15, "30139585359683111401439300526");
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("1075488919");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "43875052945978333540109500241" + "'", str7, "43875052945978333540109500241");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\022" + "'", str13, "\022");
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\002\001");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd>");
        java.lang.String str15 = rSA1.encrypt("\002\ufffd\ufffd-");
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.encrypt("\002!");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5" + "'", str3, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\013\ufffd\024" + "'", str7, "\000\ufffd\013\ufffd\024");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\020\ufffd\ufffd\\" + "'", str9, "\002\020\ufffd\ufffd\\");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "9785408038" + "'", str11, "9785408038");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3681012676" + "'", str13, "3681012676");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7930730761" + "'", str15, "7930730761");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "393" + "'", str19, "393");
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.decrypt("34089860651578007478246711177");
        java.lang.String str9 = rSA1.encrypt("674338054");
        java.lang.String str11 = rSA1.encrypt("567824154010472842391682528857");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\ufffd\ufffd\ufffd\036\ufffd\ufffd\ufffd@");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"d??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "346" + "'", str3, "346");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "181" + "'", str5, "181");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "21" + "'", str9, "21");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "337" + "'", str11, "337");
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("11987024600102659472279216119");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32" + "'", str7, "32");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "18" + "'", str9, "18");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "27498268841900076750219173254" + "'", str13, "27498268841900076750219173254");
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.encrypt("262");
        java.lang.String str13 = rSA1.encrypt("630010341");
        java.lang.String str15 = rSA1.encrypt("7542022550");
        java.lang.String str17 = rSA1.encrypt("390532808145266816825287671867");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "174256720624610362647504464819" + "'", str5, "174256720624610362647504464819");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "300511594268259100042506175198" + "'", str7, "300511594268259100042506175198");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "72917355710247789703524803307" + "'", str11, "72917355710247789703524803307");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "114657279404071614578331279341" + "'", str13, "114657279404071614578331279341");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "104847652887707199276332633372" + "'", str15, "104847652887707199276332633372");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "157477343484440025261901063392" + "'", str17, "157477343484440025261901063392");
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
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
        java.lang.String str21 = rSA1.encrypt("392");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\t\ufffd\307\ufffd\ufffd\ufffd\027\ufffd\ufffdM");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?B?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\006" + "'", str5, "\001\006");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23" + "'", str7, "23");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1608354290667043" + "'", str17, "1608354290667043");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "838971426575415" + "'", str19, "838971426575415");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2080020015990819" + "'", str21, "2080020015990819");
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.decrypt("394");
        java.lang.String str7 = rSA1.decrypt("650");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "98" + "'", str3, "98");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001=" + "'", str5, "\001=");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001f" + "'", str7, "\001f");
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("23585400911907150218938419175");
        java.lang.String str15 = rSA1.decrypt("18978112990239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "858712441622897811186359512963" + "'", str5, "858712441622897811186359512963");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8241264822143" + "'", str7, "8241264822143");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8011851743938589686378566109" + "'", str13, "8011851743938589686378566109");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd\ufffd\\\ufffd\ufffd\ufffd" + "'", str15, "\ufffd\ufffd\ufffd\\\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("4");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001i" + "'", str7, "\001i");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "48" + "'", str9, "48");
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("703153339289949437747864939069");
        java.lang.String str13 = rSA1.encrypt("167");
        java.lang.String str15 = rSA1.encrypt("188289157854256346200468674953");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffdy" + "'", str7, "\000\ufffd\ufffdy");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\u0301\ufffd" + "'", str11, "\004\ufffd\ufffd\u0301\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2264111673160046" + "'", str13, "2264111673160046");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2069995758234029" + "'", str15, "2069995758234029");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("25781477714155137707289447841");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "477" + "'", str3, "477");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6165399938" + "'", str7, "6165399938");
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.encrypt("239");
        java.math.BigInteger bigInteger4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = rSA1.decrypt(bigInteger4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "686211207395139" + "'", str3, "686211207395139");
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("253");
        java.lang.String str13 = rSA1.decrypt("450766669594624");
        java.lang.String str15 = rSA1.decrypt("60");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001@" + "'", str7, "\001@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "`" + "'", str9, "`");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "|" + "'", str13, "|");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        java.lang.String str15 = rSA1.encrypt("875");
        java.lang.String str17 = rSA1.encrypt("42418796185018424088");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32" + "'", str7, "32");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "18" + "'", str9, "18");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\024\u0719\ufffd\u03eb\ufffd\ufffd4" + "'", str13, "\024\u0719\ufffd\u03eb\ufffd\ufffd4");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "18930351586942423366229630415" + "'", str15, "18930351586942423366229630415");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "14946444877879129254262367123" + "'", str17, "14946444877879129254262367123");
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("288");
        java.lang.String str15 = rSA1.decrypt("377");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str19 = rSA1.encrypt("\003\ufffd\ufffd\ufffdM\001\ufffd\ufffd\003");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "185" + "'", str3, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "I" + "'", str7, "I");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "346888890823691354387246555142" + "'", str11, "346888890823691354387246555142");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "638807686928599997237432742005" + "'", str13, "638807686928599997237432742005");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\r\ufffdf'\022\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\003\ufffd\ufffd\r\ufffdf'\022\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "451336737137319073023359961393" + "'", str19, "451336737137319073023359961393");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("511");
        java.lang.String str13 = rSA1.encrypt("\003");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0014" + "'", str5, "\0014");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'" + "'", str7, "'");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380" + "'", str9, "380");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001M" + "'", str11, "\001M");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "27" + "'", str13, "27");
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str11 = rSA1.encrypt("\002\ufffd>");
        java.lang.String str13 = rSA1.decrypt("23264544955983291322485115342");
        java.lang.String str15 = rSA1.encrypt("80152831082072364050376208382");
        java.lang.String str17 = rSA1.encrypt("2635132195937723");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\ufffdd\035\ufffd\ufffd\u029f\023\ufffd?");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"G?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u0116\ufffd\ufffd\ufffdX" + "'", str7, "\u0116\ufffd\ufffd\ufffdX");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "13082422483736394896576564032" + "'", str9, "13082422483736394896576564032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "22311179561474395955764421648" + "'", str11, "22311179561474395955764421648");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\005\r\u03c4\ufffd\032Y\017\ufffd" + "'", str13, "\000\ufffd\ufffd\005\r\u03c4\ufffd\032Y\017\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32281776358919904207107603149" + "'", str15, "32281776358919904207107603149");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "8365021949074706671568894295" + "'", str17, "8365021949074706671568894295");
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("56181887");
        java.lang.String str11 = rSA1.decrypt("7591156848866311702672535389");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.encrypt("100378343477861623578545126464");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "24501270670360400463452292224" + "'", str7, "24501270670360400463452292224");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19151385254959416624093169010" + "'", str9, "19151385254959416624093169010");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "o\004\ufffd\036\r:\025\ufffd\ufffd\ufffd" + "'", str11, "o\004\ufffd\036\r:\025\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "25663997629814083643472059190" + "'", str15, "25663997629814083643472059190");
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.decrypt("50334980593118017863872015613");
        java.lang.String str5 = rSA1.decrypt("507");
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7" + "'", str5, "7");
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("703153339289949437747864939069");
        java.lang.String str13 = rSA1.encrypt("167");
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.encrypt("241");
        java.lang.String str19 = rSA1.decrypt("4");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\001\017");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\t" + "'", str3, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd" + "'", str11, "\005\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "967599578961943" + "'", str13, "967599578961943");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1953812416" + "'", str17, "1953812416");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd" + "'", str19, "\ufffd");
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.decrypt("171");
        java.lang.String str13 = rSA1.decrypt("236");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "542752807358408645201982617804" + "'", str7, "542752807358408645201982617804");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "542752807358408645201982617804" + "'", str9, "542752807358408645201982617804");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\037\u07419\r\ufffd\ufffdy" + "'", str11, "\007\ufffd\ufffd\037\u07419\r\ufffd\ufffdy");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\r\035\\\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\003\r\035\\\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("478");
        java.lang.String str15 = rSA1.encrypt("646");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001G" + "'", str5, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "509" + "'", str7, "509");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8" + "'", str9, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2870330675" + "'", str13, "2870330675");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "5758868992" + "'", str15, "5758868992");
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("\003\001\ufffd\ufffd\ufffd\027\001\ufffd\u07a3");
        java.lang.String str15 = rSA1.encrypt("26507047337243548657799763260");
        rSA1.generateKeys((int) 'a');
        java.lang.String str19 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str21 = rSA1.encrypt("?");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str27 = rSA1.encrypt("\002\002\ufffd5;\016\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.encrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4677855816" + "'", str13, "4677855816");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9091046516" + "'", str15, "9091046516");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "19106383465543145228903491005" + "'", str19, "19106383465543145228903491005");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "3938980639167" + "'", str21, "3938980639167");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "234" + "'", str27, "234");
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("208424615175295461924453936343");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffdZ\033\ufffd\u06a9\ufffd\013L");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\004<\f\ufffd\030\ufffd\ufffdd\007" + "'", str9, "\000\ufffd\004<\f\ufffd\030\ufffd\ufffdd\007");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "475809622201885618106478893279" + "'", str11, "475809622201885618106478893279");
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str11 = rSA1.encrypt("7882021201");
        java.lang.String str13 = rSA1.encrypt("37695224586924992221081514034");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "167" + "'", str9, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "529" + "'", str11, "529");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "363" + "'", str13, "363");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.encrypt("410411422422033928813383347735");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002M" + "'", str3, "\002M");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "356" + "'", str7, "356");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
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
        java.lang.String str21 = rSA1.decrypt("67274197142905937831872151801");
        rSA1.generateKeys((int) '4');
        java.lang.String str25 = rSA1.encrypt("831614352059959097669941370443");
        java.lang.String str27 = rSA1.decrypt("1858410050");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\004\ufffd\ufffd" + "'", str17, "\002\ufffd\ufffd\004\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "396418978280023" + "'", str19, "396418978280023");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\022\ufffd\ufffd\ufffd" + "'", str21, "\001\022\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "3760303774701763" + "'", str25, "3760303774701763");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\001\ufffd=#J7\023" + "'", str27, "\001\ufffd=#J7\023");
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = rSA1.decrypt("\ufffd\ufffd\"\ufffd:\r\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \">??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\001;");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("286281611158858110965771107047");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "572890681868950697710813087034" + "'", str11, "572890681868950697710813087034");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3101364196875" + "'", str13, "3101364196875");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "18629539682694210386684297386" + "'", str17, "18629539682694210386684297386");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("|");
        java.lang.String str13 = rSA1.decrypt("29339648412823630308726258195");
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd\ufffduV\023\ufffdn");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\ufffd\ufffd\032\030\ufffd\ufffd\ufffd.T");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"x2?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "z" + "'", str3, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\005\ufffd\ufffd" + "'", str7, "\001\ufffd\005\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1906624" + "'", str11, "1906624");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\027" + "'", str13, "\004\ufffd\ufffd\ufffd\ufffd\027");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "547963463875315" + "'", str15, "547963463875315");
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\002\001");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd>");
        java.lang.String str15 = rSA1.encrypt("710719841468133");
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\006\ufffd\007\ufffd\ufffdH");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "z" + "'", str3, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\004\ufffd\033" + "'", str7, "\001\004\ufffd\033");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd=X" + "'", str9, "\000\ufffd\ufffd=X");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2948459355" + "'", str11, "2948459355");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4115869084" + "'", str13, "4115869084");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6582093188" + "'", str15, "6582093188");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "5091936997" + "'", str17, "5091936997");
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("11716232800583690748559256041");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.encrypt("375222114829344077571796106442");
        java.lang.String str21 = rSA1.encrypt("\ufffd\ufffdk\017\ufffdi\025");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "245286931689344048539960875190" + "'", str5, "245286931689344048539960875190");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "219753871740890044653845682013" + "'", str7, "219753871740890044653845682013");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd " + "'", str9, "\001\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd ");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffds" + "'", str11, "\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffds");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "118" + "'", str19, "118");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "91" + "'", str21, "91");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.encrypt("35549168584584202529715460357");
        java.lang.String str5 = rSA1.encrypt("2179191949");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3257924098221477" + "'", str3, "3257924098221477");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2710907339475058" + "'", str5, "2710907339475058");
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.encrypt("228013474449632847102912946578");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\034\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\001");
        java.lang.String str15 = rSA1.encrypt("\002\ufffdIS");
        java.lang.String str17 = rSA1.encrypt("146028369");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "|" + "'", str3, "|");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "15" + "'", str7, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "852" + "'", str11, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "685" + "'", str13, "685");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "119" + "'", str15, "119");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "766" + "'", str17, "766");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("531");
        java.lang.String str7 = rSA1.encrypt("\002W");
        java.lang.String str9 = rSA1.encrypt("314432");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("57022474381017927500879345278");
        java.lang.String str15 = rSA1.decrypt("40026171690607649225868458428");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "408" + "'", str5, "408");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "268" + "'", str7, "268");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "492" + "'", str9, "492");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\022" + "'", str15, "\001\022");
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.decrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdk3");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \";?u\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str7 = rSA1.encrypt("393");
        java.lang.String str9 = rSA1.encrypt("\013lf\020\ufffd\034\ufffd\ufffd\ufffd\016\ufffdah");
        rSA1.generateKeys((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "235" + "'", str7, "235");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "435" + "'", str9, "435");
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "56181887" + "'", str7, "56181887");
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("z");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "42" + "'", str3, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1815848" + "'", str7, "1815848");
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("465270144019721");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("8");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("805453545486090582568173469490");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6" + "'", str3, "6");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "288" + "'", str5, "288");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "410" + "'", str7, "410");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd" + "'", str11, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "285" + "'", str13, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "368" + "'", str15, "368");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        java.lang.String str11 = rSA1.encrypt("63759111757529580548927324030");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "y" + "'", str7, "y");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "67" + "'", str9, "67");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "113" + "'", str11, "113");
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
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
        java.lang.String str23 = rSA1.encrypt("\001\ufffd\ufffd");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0014" + "'", str5, "\0014");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\036" + "'", str7, "\001\036");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "304813974494499100140376892592" + "'", str11, "304813974494499100140376892592");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "143747551253107036932558153924" + "'", str13, "143747551253107036932558153924");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\024\ufffd\ufffd\ufffd" + "'", str15, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\024\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\033\026\ufffd\ufffd\ufffd\ufffd\032" + "'", str17, "\001\ufffd\ufffd\033\026\ufffd\ufffd\ufffd\ufffd\032");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "247258439536126006017457845919" + "'", str19, "247258439536126006017457845919");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "80787736927999385292541506810" + "'", str21, "80787736927999385292541506810");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "225310697200285791145698240830" + "'", str23, "225310697200285791145698240830");
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("658320474506132562654648259626");
        java.lang.String str13 = rSA1.decrypt("63944551038523953702806198424");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "492068629704961307000457922002" + "'", str11, "492068629704961307000457922002");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd(N\031\ufffd\023\ufffd\ufffdIW" + "'", str13, "\004\ufffd(N\031\ufffd\023\ufffd\ufffdIW");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.encrypt("48524739602976");
        java.lang.String str13 = rSA1.decrypt("44797199491853112088");
        java.lang.String str15 = rSA1.encrypt("\001\ufffd\035\177;\006\ufffd\t\ufffd\ufffd\035\002");
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\034@" + "'", str7, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\034@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "286663436999909677044467178708" + "'", str11, "286663436999909677044467178708");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\f\ufffd\ufffd\ufffd\ufffd\ufffd\021\ufffd M" + "'", str13, "\f\ufffd\ufffd\ufffd\ufffd\ufffd\021\ufffd M");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "659360008115138238642073362336" + "'", str15, "659360008115138238642073362336");
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("1688965663905536");
        java.lang.String str9 = rSA1.encrypt("44837785005002574672437604626");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("24910607840224317483596072080");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "337776612895229" + "'", str7, "337776612895229");
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\037\ufffd\027\ufffd\ufffdq5");
        java.lang.String str13 = rSA1.decrypt("2635132195937723");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd[-" + "'", str9, "\ufffd[-");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "254762359" + "'", str11, "254762359");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\022\ufffd" + "'", str13, "\022\ufffd");
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.decrypt("287794280118878208");
        java.lang.String str17 = rSA1.decrypt("24370130279063353844945978627");
        java.lang.String str19 = rSA1.encrypt("\001\ufffdBy");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "12709775711303901526299316323" + "'", str5, "12709775711303901526299316323");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\030\ufffd" + "'", str7, "\005\ufffd\ufffd\ufffd\ufffd\030\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "52235749578316543115017637028" + "'", str9, "52235749578316543115017637028");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "81869274806736025237769768989" + "'", str11, "81869274806736025237769768989");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\022\ufffd\ufffd" + "'", str15, "\000\ufffd\022\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str17, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1390400029" + "'", str19, "1390400029");
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("12856024970639395620261580662");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5623965026307171122974339654" + "'", str3, "5623965026307171122974339654");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "31516809880028718481537361855" + "'", str5, "31516809880028718481537361855");
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd");
        java.lang.String str13 = rSA1.encrypt("174");
        java.lang.String str15 = rSA1.encrypt("144252953354502585977976224207");
        java.lang.String str17 = rSA1.decrypt("511");
        java.lang.String str19 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "160" + "'", str3, "160");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "875" + "'", str5, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\032" + "'", str7, "\032");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003L" + "'", str9, "\003L");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "685" + "'", str11, "685");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "373" + "'", str13, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "814" + "'", str15, "814");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\007" + "'", str17, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "205" + "'", str19, "205");
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("\002E");
        java.lang.String str13 = rSA1.encrypt("412855490441922175904469813661");
        java.lang.String str15 = rSA1.decrypt("311430194");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str19 = rSA1.encrypt("22893996638579745387307395685");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd" + "'", str7, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "66203456086901" + "'", str11, "66203456086901");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1536352761698686" + "'", str13, "1536352761698686");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd" + "'", str15, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "754296130524564666916959661598" + "'", str19, "754296130524564666916959661598");
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.encrypt("49");
        java.lang.String str5 = rSA1.encrypt("\002\ufffd\ufffd\ufffd1");
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "783" + "'", str3, "783");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "804" + "'", str5, "804");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
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
        java.lang.String str21 = rSA1.encrypt("\b\001\037\ufffd\ufffd\ufffd\ufffdN");
        java.lang.String str23 = rSA1.encrypt("\ufffdO");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\032" + "'", str3, "\002\032");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\037\ufffd\ufffd\ufffd\ufffd\ufffd\017\ufffd" + "'", str9, "\002\037\ufffd\ufffd\ufffd\ufffd\ufffd\017\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "89116503268220597577728" + "'", str15, "89116503268220597577728");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "25890261415908089006911339316" + "'", str17, "25890261415908089006911339316");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "335362404394088501743439312522" + "'", str19, "335362404394088501743439312522");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "95218502955660852909689036546" + "'", str21, "95218502955660852909689036546");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "304634613356819851023641327148" + "'", str23, "304634613356819851023641327148");
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '#');
        java.lang.String str9 = rSA1.encrypt("\002:");
        java.lang.String str11 = rSA1.decrypt("330347498407571458385524140683");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2617636949" + "'", str9, "2617636949");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\026:" + "'", str11, "\ufffd\026:");
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        java.lang.String str9 = rSA1.decrypt("107");
        java.lang.String str11 = rSA1.decrypt("40059718235344279847714872762");
        java.lang.String str13 = rSA1.decrypt("614");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002@" + "'", str3, "\002@");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "607" + "'", str5, "607");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "543" + "'", str7, "543");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5" + "'", str9, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\t" + "'", str11, "\002\t");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002Z" + "'", str13, "\002Z");
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("693");
        java.lang.String str7 = rSA1.encrypt("\001.");
        java.lang.String str9 = rSA1.encrypt("2635132195937723");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9764914542297650720545786580" + "'", str3, "9764914542297650720545786580");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "17333864175618918116901885570" + "'", str5, "17333864175618918116901885570");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "229112403180614528" + "'", str7, "229112403180614528");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "20076715363570918616073884123" + "'", str9, "20076715363570918616073884123");
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("|");
        java.lang.String str11 = rSA1.decrypt("455975479829674896565187873983");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "96" + "'", str5, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "117" + "'", str7, "117");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "108" + "'", str9, "108");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("477");
        java.lang.String str9 = rSA1.decrypt("844039074808528");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "15600368650543882309432723" + "'", str7, "15600368650543882309432723");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffdSY4o[\rf\026\ufffd" + "'", str9, "\006\ufffdSY4o[\rf\026\ufffd");
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("168");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("\000\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\f\ufffd\u04a8\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?M\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001f" + "'", str3, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7831294190" + "'", str9, "7831294190");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2998078182" + "'", str11, "2998078182");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "380336894290582747557347364519" + "'", str15, "380336894290582747557347364519");
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.decrypt("166");
        java.lang.String str13 = rSA1.encrypt("483");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O" + "'", str5, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "416" + "'", str7, "416");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "287" + "'", str9, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\025" + "'", str11, "\025");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "81" + "'", str13, "81");
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("461");
        java.lang.String str9 = rSA1.encrypt("\005");
        java.lang.String str11 = rSA1.encrypt("O");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd| ");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\026D\fY" + "'", str7, "\026D\fY");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "125" + "'", str9, "125");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "493039" + "'", str11, "493039");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "970974176175496998135570414957" + "'", str17, "970974176175496998135570414957");
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\t" + "'", str5, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "788" + "'", str7, "788");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\u0224\ufffd\017\ufffdG" + "'", str13, "\ufffd\ufffd\ufffd\u0224\ufffd\017\ufffdG");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\001\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "809617672437587893873261587142" + "'", str21, "809617672437587893873261587142");
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("\f\ufffd\ufffd\ufffd\ufffd\u061d\ufffd\u06fe");
        java.lang.String str11 = rSA1.decrypt("304417796247364099549471429573");
        java.lang.String str13 = rSA1.decrypt("3555494157626530");
        java.lang.String str15 = rSA1.encrypt("4878043978");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "99" + "'", str3, "99");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8613345923158638984186431803" + "'", str7, "8613345923158638984186431803");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7397646235382908697788602332" + "'", str9, "7397646235382908697788602332");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\025\000\ufffd\ufffd\ufffd\u0439\ufffd" + "'", str11, "\000\ufffd\ufffd\025\000\ufffd\ufffd\ufffd\u0439\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n\ufffd\ufffdq\032\u021a\ufffd\ufffd" + "'", str13, "\n\ufffd\ufffdq\032\u021a\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "53501309453627492113995229801" + "'", str15, "53501309453627492113995229801");
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\007\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "154" + "'", str7, "154");
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("\000\u047f\013\ufffd7mb\037\017\ufffd");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "142" + "'", str5, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\u047d" + "'", str9, "\ufffd\u047d");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1168213338" + "'", str11, "1168213338");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("465270144019721");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("8");
        java.lang.String str13 = rSA1.decrypt("964790187012434");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "283" + "'", str5, "283");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "103" + "'", str7, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "~" + "'", str11, "~");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\032" + "'", str13, "\002\032");
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("1056808122067448795285291111099");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd\ufffdi\t" + "'", str7, "\ufffd\ufffd\ufffd\ufffdi\t");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\r\003\ufffd\u0133\ufffd\ufffd\ufffd" + "'", str9, "\r\003\ufffd\u0133\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.encrypt("553");
        java.lang.String str13 = rSA1.decrypt("355");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\006" + "'", str5, "\001\006");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23" + "'", str7, "23");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "238" + "'", str11, "238");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("1998947500173");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u0370\ufffd");
        java.lang.String str11 = rSA1.decrypt("15028238390418345727767527777");
        java.lang.String str13 = rSA1.encrypt("X\034R\004\ufffd\ufffd\000\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("317579693760000000000");
        java.lang.String str17 = rSA1.encrypt("40072153360267034343");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003$" + "'", str7, "\003$");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380" + "'", str9, "380");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\021" + "'", str11, "\001\021");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "571" + "'", str13, "571");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "530" + "'", str15, "530");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "504" + "'", str17, "504");
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("302478007679515165391351820133");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "264819361598423890631121961167" + "'", str9, "264819361598423890631121961167");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "48374754649717697710027938067" + "'", str11, "48374754649717697710027938067");
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.encrypt("262");
        java.lang.String str13 = rSA1.encrypt("630010341");
        java.lang.String str15 = rSA1.decrypt("307987865312104598997785831420");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\002\u028e\r\ufffd\ufffd\f\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "800326295099990461277353651810" + "'", str5, "800326295099990461277353651810");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1062143110945655304217710396585" + "'", str7, "1062143110945655304217710396585");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\017\ufffd\013\ufffd\u0263\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\017\ufffd\013\ufffd\u0263\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "978344376128576431386346852891" + "'", str11, "978344376128576431386346852891");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "980778554731313007486199529177" + "'", str13, "980778554731313007486199529177");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\u03bc\ufffd\ufffd\ufffd\ufffd!\036\ufffd\t\ufffd" + "'", str15, "\006\u03bc\ufffd\ufffd\ufffd\ufffd!\036\ufffd\t\ufffd");
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.encrypt("267732256991725538729642205655");
        java.lang.String str13 = rSA1.encrypt("54957408261395779601653550638");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "358" + "'", str11, "358");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "273" + "'", str13, "273");
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        java.lang.String str9 = rSA1.decrypt("143827611740296741825726282072");
        java.lang.String str11 = rSA1.encrypt("\ufffdq\007\ufffd\t7Z");
        java.lang.String str13 = rSA1.encrypt("1686607027");
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd'{" + "'", str7, "\002\ufffd'{");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffdO" + "'", str9, "\000\ufffd\ufffd\ufffdO");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5383125419" + "'", str11, "5383125419");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "9590369750" + "'", str13, "9590369750");
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\u07dd\ufffd\ufffd\034\ufffd\033");
        rSA1.generateKeys((int) (short) 10);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "67300539117500840902396612752" + "'", str5, "67300539117500840902396612752");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006\ufffdF\021\ufffdsA\027\030\ufffd\ufffd\ufffd" + "'", str7, "\006\ufffdF\021\ufffdsA\027\030\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "736706702216749342674901816283" + "'", str9, "736706702216749342674901816283");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "655687187669080782975732921359" + "'", str11, "655687187669080782975732921359");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "78779426310188474483498140174" + "'", str13, "78779426310188474483498140174");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("\002\ufffd");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str19 = rSA1.encrypt("618");
        java.lang.String str21 = rSA1.decrypt("384868008312393945810680244781");
        java.lang.String str23 = rSA1.encrypt("\001\ufffdl`");
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
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "274" + "'", str15, "274");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "233" + "'", str19, "233");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd" + "'", str21, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "138" + "'", str23, "138");
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("61");
        java.lang.String str9 = rSA1.decrypt("457");
        java.lang.String str11 = rSA1.decrypt("164902535331847");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001n" + "'", str7, "\001n");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\f" + "'", str11, "\001\f");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("393");
        java.lang.String str19 = rSA1.encrypt("\bk@U\177\ufffd\ufffd\034\ufffdZm");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\u02a0\ufffd\037\035\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd\u02a0\ufffd\037\035\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1179580341205937" + "'", str17, "1179580341205937");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1517003690980006" + "'", str19, "1517003690980006");
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("307707995715569958842130375");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str9 = rSA1.encrypt(":");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffdw" + "'", str3, "\ufffd\ufffdw");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "349471311" + "'", str5, "349471311");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "96" + "'", str9, "96");
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("478");
        java.lang.String str15 = rSA1.encrypt("646");
        java.lang.String str17 = rSA1.encrypt("\001\bl:0");
        java.lang.String str19 = rSA1.encrypt("\001r");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\006" + "'", str5, "\001\006");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23" + "'", str7, "23");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "9555014887" + "'", str13, "9555014887");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4626454095" + "'", str15, "4626454095");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "5485619375" + "'", str17, "5485619375");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "50653000" + "'", str19, "50653000");
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.decrypt("1091385417287759808405208588958");
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "50334980593118017863872015613" + "'", str7, "50334980593118017863872015613");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\020_\023\ufffd\ufffd0a" + "'", str9, "\001\020_\023\ufffd\ufffd0a");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("1757850692");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "337326253129233264674802184993" + "'", str5, "337326253129233264674802184993");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "128965573378667498467670222936" + "'", str7, "128965573378667498467670222936");
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.encrypt("99");
        java.lang.String str13 = rSA1.encrypt("\013lf\020\ufffd\034\ufffd\ufffd\ufffd\016\ufffdah");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\u0604\ufffd" + "'", str7, "\005\ufffd\ufffd\ufffd\ufffd\u0604\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "674589993819081348249" + "'", str11, "674589993819081348249");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "86926253205616133615825114612" + "'", str13, "86926253205616133615825114612");
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\005\ufffd\ufffd\n\ufffd\ufffd*");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("907");
        java.lang.String str17 = rSA1.encrypt("36610813181912391220010029849");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "357" + "'", str3, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "21625668712838447888490773412" + "'", str7, "21625668712838447888490773412");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "662864495939786626876216341839" + "'", str11, "662864495939786626876216341839");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "636276198009641197004848275946" + "'", str15, "636276198009641197004848275946");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "255097737114740148139964721177" + "'", str17, "255097737114740148139964721177");
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\ufffd\u0795\ufffd$");
        java.lang.String str13 = rSA1.encrypt("380");
        java.lang.String str15 = rSA1.encrypt("587");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002L" + "'", str5, "\002L");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\032" + "'", str7, "\032");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "164" + "'", str9, "164");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "763" + "'", str11, "763");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "231" + "'", str13, "231");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "69" + "'", str15, "69");
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("304417796247364099549471429573");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.encrypt("\002T");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1895369614" + "'", str9, "1895369614");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "429" + "'", str13, "429");
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\003\035");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd'" + "'", str7, "\000\ufffd\ufffd'");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6727431524" + "'", str9, "6727431524");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3141277811" + "'", str11, "3141277811");
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("|");
        java.lang.String str11 = rSA1.decrypt("270");
        java.lang.String str13 = rSA1.encrypt("390725756241900707004298957200");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "167" + "'", str7, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "307" + "'", str9, "307");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "190" + "'", str13, "190");
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        java.lang.String str13 = rSA1.decrypt("35583402576551630221");
        java.lang.String str15 = rSA1.decrypt("662");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "267" + "'", str5, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9" + "'", str7, "9");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "362" + "'", str11, "362");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\000" + "'", str13, "\002\000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("4448254484");
        java.lang.String str9 = rSA1.encrypt("\ufffd6 ");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\u07cb\ufffd\ufffd\ufffd&");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "470" + "'", str5, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "187" + "'", str7, "187");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "468" + "'", str9, "468");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "124" + "'", str11, "124");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
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
        java.lang.String str21 = rSA1.encrypt("\b\001\037\ufffd\ufffd\ufffd\ufffdN");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\032" + "'", str3, "\002\032");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\u0277\ufffd" + "'", str9, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\u0277\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1815848" + "'", str15, "1815848");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "193186633393731903120836319657" + "'", str17, "193186633393731903120836319657");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "565074851185958604081486632121" + "'", str19, "565074851185958604081486632121");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "638275819114067925202123398574" + "'", str21, "638275819114067925202123398574");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.encrypt("\001\ufffd\ufffd");
        java.lang.String str5 = rSA1.decrypt("598936615230950507052406172861");
        java.lang.String str7 = rSA1.encrypt("30315461196525470678390548020");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\006\ufffd\ufffd\027\ufffd\ufffdP");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??????P\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2351531576" + "'", str3, "2351531576");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\001\ufffd" + "'", str5, "\ufffd\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "738388898" + "'", str7, "738388898");
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.decrypt("314");
        java.lang.String str15 = rSA1.encrypt("\001\037\ufffd\031\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002E" + "'", str7, "\002E");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "478" + "'", str9, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\031" + "'", str13, "\001\031");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "399" + "'", str15, "399");
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("477");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\f\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??J?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "34391826086455092131575355590" + "'", str7, "34391826086455092131575355590");
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.encrypt("99");
        java.lang.String str13 = rSA1.encrypt("\013lf\020\ufffd\034\ufffd\ufffd\ufffd\016\ufffdah");
        java.lang.String str15 = rSA1.decrypt("3524858751645091769072738871");
        java.lang.String str17 = rSA1.encrypt("669333556180003");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\u051e\u01e5\ufffd\f" + "'", str7, "\001\ufffd\ufffd\ufffd\ufffd\u051e\u01e5\ufffd\f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3143575801449" + "'", str11, "3143575801449");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "25765628333006341200783199274" + "'", str13, "25765628333006341200783199274");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\020\ufffd\ufffd\ufffd\ufffd\n\ufffd$" + "'", str15, "\006\ufffd\020\ufffd\ufffd\ufffd\ufffd\n\ufffd$");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "298521073144701495556189826968" + "'", str17, "298521073144701495556189826968");
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.encrypt("553");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\u5755\ufffd");
        java.lang.String str15 = rSA1.decrypt("642");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "131" + "'", str13, "131");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\002\001");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd>");
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\024" + "'", str7, "\ufffd\024");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "835729653" + "'", str11, "835729653");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "881276396" + "'", str13, "881276396");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("402");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\004\ufffd\001\ufffd" + "'", str9, "\004\ufffd\004\ufffd\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        java.lang.String str9 = rSA1.encrypt("48241217274650060621544778321");
        java.lang.String str11 = rSA1.encrypt("315");
        java.lang.String str13 = rSA1.encrypt("1037608623");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "713740082030434260632525234026" + "'", str5, "713740082030434260632525234026");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\006\036\ufffdN" + "'", str7, "\002\ufffd\ufffd\ufffd\ufffd\006\036\ufffdN");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "471113983004794233944617268601" + "'", str9, "471113983004794233944617268601");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "683445254652697390165327801028" + "'", str11, "683445254652697390165327801028");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "257745803424910471509202106482" + "'", str13, "257745803424910471509202106482");
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("136");
        java.lang.String str5 = rSA1.encrypt("151367136016652851661766167589");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\020\177\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\n\020\177\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "802679653927317405628179942743" + "'", str5, "802679653927317405628179942743");
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd9\013\ufffd\ufffd\021\ufffd\ufffd\ufffd" + "'", str13, "\ufffd9\013\ufffd\ufffd\021\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\005\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("2155055185841074");
        java.lang.String str11 = rSA1.decrypt("474552");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\004");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "D" + "'", str7, "D");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "310" + "'", str9, "310");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\0018" + "'", str11, "\0018");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "315" + "'", str13, "315");
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\002\1776r\037\ufffdN\037\ufffds");
        java.lang.String str11 = rSA1.decrypt("44690606995474965646087032640");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "67" + "'", str5, "67");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "434" + "'", str7, "434");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "344" + "'", str9, "344");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "I" + "'", str11, "I");
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "112" + "'", str3, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "96" + "'", str5, "96");
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.decrypt("6027768308437645793663749491");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str7 = rSA1.encrypt("240604614659424583434967357866");
        java.lang.String str9 = rSA1.decrypt("1326410034644195374346903552");
        java.lang.String str11 = rSA1.encrypt("\003\030\ufffd\ufffd\035");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str3, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "480617198607108079971768416876" + "'", str7, "480617198607108079971768416876");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffd4MR{\tL2\031" + "'", str9, "\004\ufffd\ufffd\ufffd4MR{\tL2\031");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "507739625027505500098924549779" + "'", str11, "507739625027505500098924549779");
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("142");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "461" + "'", str7, "461");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001q" + "'", str11, "\001q");
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("25781477714155137707289447841");
        java.lang.String str9 = rSA1.decrypt("40021916406662028876239884409");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "70" + "'", str3, "70");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "863244090" + "'", str7, "863244090");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\n" + "'", str9, "\ufffd\ufffd\n");
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
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
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\t" + "'", str5, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "788" + "'", str7, "788");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\032\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd&1$" + "'", str13, "\032\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd&1$");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\ufffd\031\005" + "'", str17, "\004\ufffd\ufffd\031\005");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "40009267745900637696" + "'", str21, "40009267745900637696");
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("478");
        java.lang.String str11 = rSA1.encrypt("488");
        java.lang.String str13 = rSA1.decrypt("126");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.encrypt("\001\026");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd&@|\023\ufffd\ufffd\ufffd*g" + "'", str7, "\ufffd&@|\023\ufffd\ufffd\ufffd*g");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\024\037\ufffd\ufffd\ufffdh?\027" + "'", str9, "\ufffd\ufffd\024\037\ufffd\ufffd\ufffdh?\027");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40081182550045535744" + "'", str11, "40081182550045535744");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4\024\ufffd\ufffd\ufffd\ufffd\u07ce\ufffd\ufffd\ufffd" + "'", str13, "4\024\ufffd\ufffd\ufffd\ufffd\u07ce\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1660443030368" + "'", str17, "1660443030368");
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("495");
        java.lang.String str13 = rSA1.encrypt("26473901013199856375128902653");
        java.lang.String str15 = rSA1.decrypt("351911857970627497367275765431");
        java.lang.String str17 = rSA1.decrypt("2201502625");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "549" + "'", str3, "549");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002W" + "'", str9, "\002W");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "629" + "'", str11, "629");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "276" + "'", str13, "276");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007" + "'", str15, "\007");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\0010" + "'", str17, "\0010");
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("693");
        java.lang.String str7 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "33562394575160520077" + "'", str3, "33562394575160520077");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "44874627577612233003" + "'", str5, "44874627577612233003");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "27543608" + "'", str7, "27543608");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        java.lang.String str11 = rSA1.encrypt("2132861796");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "225" + "'", str9, "225");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "13" + "'", str11, "13");
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
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
        java.lang.String str25 = rSA1.encrypt("\ufffd\ufffd\003\u06d0\ufffd2");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "!\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "!\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1197630646814539" + "'", str17, "1197630646814539");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1939275296968457" + "'", str19, "1939275296968457");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "502305732601694" + "'", str21, "502305732601694");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "99621408587615573254153941738" + "'", str25, "99621408587615573254153941738");
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str7 = rSA1.decrypt("1");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("336011552384423252582675852");
        java.lang.String str11 = rSA1.encrypt("47777950521712127746591213977");
        java.lang.String str13 = rSA1.decrypt("258265091322468553983668563257");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0016" + "'", str3, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "288" + "'", str5, "288");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "314" + "'", str7, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001W" + "'", str9, "\001W");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "245" + "'", str11, "245");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001h" + "'", str13, "\001h");
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("791944786");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\025\ufffdF" + "'", str7, "\001\025\ufffdF");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\007" + "'", str11, "\003\007");
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("\0245|\r\ufffd\004\ufffd\r\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("485974862797680425669299086221");
        java.lang.String str11 = rSA1.decrypt("19");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "443602557574465798298581912500" + "'", str7, "443602557574465798298581912500");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "684201394212404496755281199042" + "'", str9, "684201394212404496755281199042");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\u8665\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\005\ufffd\u8665\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("#");
        java.lang.String str11 = rSA1.decrypt("1");
        java.lang.String str13 = rSA1.encrypt("1249781321");
        java.lang.String str15 = rSA1.decrypt("24728158503917487987839420576");
        java.lang.String str17 = rSA1.encrypt("\024");
        java.lang.String str19 = rSA1.encrypt("3746550740");
        java.lang.String str21 = rSA1.encrypt("331191962865303552193438657588");
        java.lang.String str23 = rSA1.decrypt("1242173746346150");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "189798382671343480029170305341" + "'", str5, "189798382671343480029170305341");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\b\ufffd\n\ufffd\u5219\ufffd\007\ufffd\ufffdd" + "'", str7, "\b\ufffd\n\ufffd\u5219\ufffd\007\ufffd\ufffdd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "52521875" + "'", str9, "52521875");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "242423905864708889514539416460" + "'", str13, "242423905864708889514539416460");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffdcw\\\ufffd\ufffd" + "'", str15, "\001\ufffd\ufffd\ufffdcw\\\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3200000" + "'", str17, "3200000");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "697381454399388146214568391241" + "'", str19, "697381454399388146214568391241");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "549515626474614320297066435985" + "'", str21, "549515626474614320297066435985");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002\u066a\ufffd\ufffd\ufffd\ufffd\ufffd\b\ufffdZ" + "'", str23, "\002\u066a\ufffd\ufffd\ufffd\ufffd\ufffd\b\ufffdZ");
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.encrypt("228013474449632847102912946578");
        java.lang.String str9 = rSA1.decrypt("42988629419629811268004412533");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.decrypt("465270144019721");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("72917355710247789703524803307");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001_" + "'", str5, "\001_");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\007" + "'", str9, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\f\ufffd\ufffd\ufffd\ufffd\ufffdT\027\ufffdJ\"" + "'", str13, "\f\ufffd\ufffd\ufffd\ufffd\ufffdT\027\ufffdJ\"");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100636888765105" + "'", str17, "100636888765105");
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        java.lang.String str9 = rSA1.decrypt("143827611740296741825726282072");
        java.lang.String str11 = rSA1.encrypt("\003E");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\036\ufffdX\035" + "'", str9, "\001\036\ufffdX\035");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3646566288" + "'", str11, "3646566288");
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("\037\ufffdbM");
        java.lang.String str9 = rSA1.encrypt("12191618230608297297178555740");
        java.lang.String str11 = rSA1.decrypt("68");
        java.lang.String str13 = rSA1.encrypt("402271083010688");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "440" + "'", str7, "440");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "108" + "'", str9, "108");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001T" + "'", str11, "\001T");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "159" + "'", str13, "159");
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("495");
        java.lang.String str13 = rSA1.encrypt("26473901013199856375128902653");
        java.lang.String str15 = rSA1.decrypt("351911857970627497367275765431");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "304" + "'", str3, "304");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001i" + "'", str7, "\001i");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001q" + "'", str9, "\001q");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "377" + "'", str11, "377");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "414" + "'", str13, "414");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd63^\020j+\r");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000h\020");
        java.lang.String str11 = rSA1.decrypt("26068184350350682707214522131");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "64" + "'", str7, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "339" + "'", str9, "339");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.encrypt("228013474449632847102912946578");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002." + "'", str3, "\002.");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "399" + "'", str7, "399");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "485" + "'", str11, "485");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("#");
        java.lang.String str11 = rSA1.decrypt("1");
        java.lang.String str13 = rSA1.encrypt("1249781321");
        java.lang.String str15 = rSA1.decrypt("24728158503917487987839420576");
        java.lang.String str17 = rSA1.encrypt("\024");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "444510852039989330506245914775" + "'", str5, "444510852039989330506245914775");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\ufffd\ufffd\ufffdwJ\020\ufffd\ufffd\001\ufffd" + "'", str7, "\005\ufffd\ufffd\ufffdwJ\020\ufffd\ufffd\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "64339296875" + "'", str9, "64339296875");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "327381718604247440775690896917" + "'", str13, "327381718604247440775690896917");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\003\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1280000000" + "'", str17, "1280000000");
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffdk%" + "'", str9, "\ufffdk%");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "952145725" + "'", str11, "952145725");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O" + "'", str13, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "N" + "'", str17, "N");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100175052872679325867996526611" + "'", str21, "100175052872679325867996526611");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("3077056399");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("\t");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "275553156" + "'", str11, "275553156");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O" + "'", str13, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "92" + "'", str17, "92");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("\002E");
        java.lang.String str13 = rSA1.encrypt("\004(\005\ufffd\024\177");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "z" + "'", str3, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\021" + "'", str7, "\001\ufffd\ufffd\021");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1204260631926910" + "'", str11, "1204260631926910");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "453556789158305" + "'", str13, "453556789158305");
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.encrypt("\001\ufffd");
        java.lang.String str13 = rSA1.decrypt("508033016224262850469053451670");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "20826230307695548936118502268" + "'", str7, "20826230307695548936118502268");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "211229520847879502487071090642" + "'", str11, "211229520847879502487071090642");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\f\ufffd\ufffd\ufffd\ufffd\u0361\004Cw" + "'", str13, "\003\f\ufffd\ufffd\ufffd\ufffd\u0361\004Cw");
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("478");
        java.lang.String str11 = rSA1.encrypt("488");
        java.lang.String str13 = rSA1.decrypt("126");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.encrypt("\037\ufffd\ufffd\005\ufffd\ufffd\021\ufffd\ufffdm_");
        java.lang.String str19 = rSA1.encrypt("10");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0\016\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "0\016\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\023\ufffd\ufffd\ufffd\ufffdR\001\ufffdB" + "'", str9, "\023\ufffd\ufffd\ufffd\ufffdR\001\ufffdB");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40081182550045535744" + "'", str11, "40081182550045535744");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\u01cc\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\u01cc\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "95375851415111274611129201079" + "'", str17, "95375851415111274611129201079");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "316572783684046815232" + "'", str19, "316572783684046815232");
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("1208902895495334527");
        java.lang.String str9 = rSA1.encrypt("95");
        java.lang.String str11 = rSA1.encrypt("1798350776157985");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.encrypt("231304546751176212661338793524");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1023789453825010" + "'", str7, "1023789453825010");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "353922729699236" + "'", str9, "353922729699236");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2190465672303267" + "'", str11, "2190465672303267");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "224" + "'", str17, "224");
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.decrypt("576");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "439805837859935092695039405393" + "'", str5, "439805837859935092695039405393");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004\ufffd\ufffd\ufffd\017\ufffd\u0326\ufffd\ufffd" + "'", str7, "\004\ufffd\ufffd\ufffd\017\ufffd\u0326\ufffd\ufffd");
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("958913602649032");
        java.lang.String str13 = rSA1.decrypt("322206248827960928498686998334");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "185" + "'", str3, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "266" + "'", str5, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "49" + "'", str7, "49");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001t" + "'", str13, "\001t");
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("704267417447115623902792380763");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002L" + "'", str5, "\002L");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007" + "'", str7, "\007");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "200747162377630367034691043172" + "'", str11, "200747162377630367034691043172");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "222370142189026469717525862553" + "'", str13, "222370142189026469717525862553");
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("\025");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("331");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd\ufffdd*");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1801088541" + "'", str3, "1801088541");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "779306951630389253685565978149" + "'", str7, "779306951630389253685565978149");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "867723712892908680365433058191" + "'", str9, "867723712892908680365433058191");
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        java.lang.String str15 = rSA1.encrypt("875");
        java.lang.String str17 = rSA1.decrypt("392170649013389");
        java.lang.String str19 = rSA1.encrypt("581487859790390260902423556635");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/\003\206\ufffd\ufffd\ufffd\u0330\ufffd\022" + "'", str13, "/\003\206\ufffd\ufffd\ufffd\u0330\ufffd\022");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "50004784369000759949" + "'", str15, "50004784369000759949");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd\000\ufffd\ufffd\177\u031a\ufffd" + "'", str17, "\ufffd\ufffd\ufffd\000\ufffd\ufffd\177\u031a\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "26526145907753817856056477913" + "'", str19, "26526145907753817856056477913");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.decrypt("6027768308437645793663749491");
        java.lang.String str5 = rSA1.decrypt("25812355359064");
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd([\003" + "'", str3, "\000\ufffd([\003");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\ufffd" + "'", str5, "\000\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("\003\001\ufffd\ufffd\ufffd\027\001\ufffd\u07a3");
        java.lang.String str15 = rSA1.encrypt("26507047337243548657799763260");
        rSA1.generateKeys((int) 'a');
        java.lang.String str19 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str21 = rSA1.encrypt("?");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str27 = rSA1.encrypt("\002\002\ufffd5;\016\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\006" + "'", str5, "\001\006");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23" + "'", str7, "23");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2984389348" + "'", str13, "2984389348");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10888442483" + "'", str15, "10888442483");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "3725310026005416625188452654" + "'", str19, "3725310026005416625188452654");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "62050608388552823487" + "'", str21, "62050608388552823487");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2" + "'", str27, "2");
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("393");
        java.lang.String str19 = rSA1.encrypt("808");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\t" + "'", str5, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "788" + "'", str7, "788");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\u0465\ufffd\u04ff\ufffdN" + "'", str13, "\000\ufffd\u0465\ufffd\u04ff\ufffdN");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1860266345762913" + "'", str17, "1860266345762913");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1631090183133125" + "'", str19, "1631090183133125");
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("11716232800583690748559256041");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.encrypt("375222114829344077571796106442");
        java.lang.String str21 = rSA1.decrypt("772648570002884559471380374683");
        java.lang.String str23 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdD\034\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "860463562279551808654758583790" + "'", str5, "860463562279551808654758583790");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "121793484779742371036171135036" + "'", str7, "121793484779742371036171135036");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\032\ufffd\u03aed\037*bw" + "'", str9, "\002\ufffd\032\ufffd\u03aed\037*bw");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\f\ufffd\ufffd\ufffd\u03aa\ufffd" + "'", str11, "\f\ufffd\ufffd\ufffd\u03aa\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "288" + "'", str19, "288");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\033" + "'", str21, "\033");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "286" + "'", str23, "286");
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("208642166923338001575549632629");
        java.lang.String str11 = rSA1.encrypt("7345347997");
        java.lang.String str13 = rSA1.encrypt("1506896065904167");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "461" + "'", str7, "461");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11" + "'", str9, "11");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "292" + "'", str11, "292");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100" + "'", str13, "100");
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd");
        java.lang.String str13 = rSA1.encrypt("174");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\004\ub140\ufffd\u0601");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "549" + "'", str3, "549");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002W" + "'", str9, "\002W");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "588" + "'", str11, "588");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7" + "'", str13, "7");
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("478");
        java.lang.String str15 = rSA1.encrypt("646");
        java.lang.String str17 = rSA1.decrypt("1547238756162089");
        java.lang.String str19 = rSA1.encrypt("\003\ufffd\ufffd\u03a6\ufffd\031\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "93447250" + "'", str13, "93447250");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1871895280" + "'", str15, "1871895280");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd" + "'", str17, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "591370682" + "'", str19, "591370682");
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("232501808598646088728588706843");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "56181887" + "'", str7, "56181887");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001)" + "'", str11, "\001)");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str11 = rSA1.encrypt("7882021201");
        java.lang.String str13 = rSA1.encrypt("37695224586924992221081514034");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\ufffd)k,\001\u02b2\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"'?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "531" + "'", str9, "531");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "368" + "'", str11, "368");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "177" + "'", str13, "177");
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.decrypt("964000649640988");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "470" + "'", str5, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\036\ufffd@" + "'", str9, "\000\ufffd\036\ufffd@");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\026\ufffd\ufffd\ufffd" + "'", str11, "\026\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.encrypt("553");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "295" + "'", str11, "295");
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("\025");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("331");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\ufffd\ufffd\ufffd\u077d\ufffd\ufffd\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"~y\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1801088541" + "'", str3, "1801088541");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "37778857553612031121" + "'", str7, "37778857553612031121");
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.decrypt("616");
        java.lang.String str7 = rSA1.encrypt("4084101");
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "45" + "'", str7, "45");
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("z");
        java.lang.String str9 = rSA1.encrypt("\b\ufffdA3\033\u0459\ufffd\ufffd\030\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("25881465153328890912467033366");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\t" + "'", str5, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "647" + "'", str7, "647");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "786" + "'", str9, "786");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("5407583147");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "59" + "'", str9, "59");
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
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
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002u" + "'", str3, "\002u");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\002\ufffd\ufffd\036p\025\ufffd" + "'", str9, "\ufffd\002\ufffd\ufffd\036p\025\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "398110870522987" + "'", str13, "398110870522987");
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        java.lang.String str9 = rSA1.encrypt("\ufffd\u011d\ufffd\ufffd\ufffd`\002S+f");
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.encrypt("58468531515623494501554799972");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "467" + "'", str9, "467");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "653811644" + "'", str13, "653811644");
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("693");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "18897642370682142717347914752" + "'", str3, "18897642370682142717347914752");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40581378252743207904947460619" + "'", str5, "40581378252743207904947460619");
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("461");
        java.lang.String str9 = rSA1.encrypt("\003\ufffd\ufffd\177\ufffd\ufffd\ufffd:@{\017");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\006" + "'", str7, "\001\ufffd\006");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "366630551" + "'", str9, "366630551");
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str5 = rSA1.encrypt("\ufffd\ufffd\f\r\ufffd\021x");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "809" + "'", str5, "809");
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("\0245|\r\ufffd\004\ufffd\r\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("547671091991961331210645481860");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "455138863409860895548712252638" + "'", str7, "455138863409860895548712252638");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\033\036DH\034\u04fd\ufffd\u022d" + "'", str9, "\003\033\036DH\034\u04fd\ufffd\u022d");
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("946669947");
        java.lang.String str7 = rSA1.encrypt("414601987065913579031306059745");
        java.lang.String str9 = rSA1.decrypt("43845903535359091850927913216");
        java.lang.String str11 = rSA1.encrypt("3258273441");
        java.lang.String str13 = rSA1.decrypt("596401059599743893504017655064");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "p" + "'", str5, "p");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "640" + "'", str7, "640");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd" + "'", str9, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "111" + "'", str11, "111");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\002\ufffd\ufffd\u02c6]cY\013f");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2199784553" + "'", str9, "2199784553");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "8909917845" + "'", str11, "8909917845");
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\002\001");
        java.lang.String str13 = rSA1.encrypt("\ufffd8\013");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001G" + "'", str3, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\027\035\034@" + "'", str7, "\001\027\035\034@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffdH" + "'", str9, "\000\ufffd\ufffdH");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "135005697" + "'", str11, "135005697");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "415213232" + "'", str13, "415213232");
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("4448254484");
        java.lang.String str9 = rSA1.decrypt("2533194306");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "102" + "'", str7, "102");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001?" + "'", str9, "\001?");
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        java.lang.String str13 = rSA1.encrypt("~");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002L" + "'", str5, "\002L");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007" + "'", str7, "\007");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffdN\033\ufffd\031\ufffd9" + "'", str11, "\005\ufffd\ufffd\ufffdN\033\ufffd\031\ufffd9");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "31757969376" + "'", str13, "31757969376");
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        java.lang.String str11 = rSA1.encrypt("\u01ce");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "l" + "'", str3, "l");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\017\ufffd\ufffd\ufffd\ufffd;" + "'", str9, "\ufffd\ufffd\017\ufffd\ufffd\ufffd\ufffd;");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "531203733134173508638655672" + "'", str11, "531203733134173508638655672");
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("166");
        java.lang.String str19 = rSA1.encrypt("\ufffd\ufffd\b\ufffd\u07b8\ufffd|");
        java.lang.String str21 = rSA1.encrypt("\000\ufffd\ufffd\ufffdO");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\027\uac90OE2x\"\ufffdT" + "'", str13, "\027\uac90OE2x\"\ufffdT");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1192095626076612" + "'", str17, "1192095626076612");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "201885944287890" + "'", str19, "201885944287890");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1548886834176357" + "'", str21, "1548886834176357");
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("495");
        java.lang.String str13 = rSA1.encrypt("26473901013199856375128902653");
        java.lang.String str15 = rSA1.decrypt("351911857970627497367275765431");
        java.lang.String str17 = rSA1.decrypt("2201502625");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "27" + "'", str3, "27");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "470" + "'", str5, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "D" + "'", str7, "D");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "49" + "'", str11, "49");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "421" + "'", str13, "421");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\016" + "'", str17, "\016");
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("\025");
        java.lang.String str5 = rSA1.encrypt("\001Y");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("2951232610");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9261" + "'", str3, "9261");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "41063625" + "'", str5, "41063625");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd9" + "'", str9, "\003\ufffd\ufffd\ufffd\ufffd\ufffd9");
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("693");
        rSA1.generateKeys((int) 'a');
        java.lang.String str9 = rSA1.encrypt("559022853183225123364289860429");
        java.lang.String str11 = rSA1.decrypt("6944997256");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "49646687349512926445784046559" + "'", str3, "49646687349512926445784046559");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "37417460219015986645622874474" + "'", str5, "37417460219015986645622874474");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35447081836632474773806770245" + "'", str9, "35447081836632474773806770245");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\025\ufffd" + "'", str11, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\025\ufffd");
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\001;");
        rSA1.generateKeys((int) '#');
        java.lang.String str17 = rSA1.decrypt("438640715");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001@" + "'", str7, "\001@");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "429689943502252404993171828857" + "'", str11, "429689943502252404993171828857");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "31255875" + "'", str13, "31255875");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\037\ufffd\017" + "'", str17, "\001\ufffd\037\ufffd\017");
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd63^\020j+\r");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000h\020");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001n" + "'", str5, "\001n");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "122" + "'", str7, "122");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "600" + "'", str9, "600");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("478");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u039d");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\001\004\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\ufffd\001\004\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "x4\r\034\006\ufffd\ufffd\ufffd0" + "'", str9, "x4\r\034\006\ufffd\ufffd\ufffd0");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "23" + "'", str13, "23");
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("\002\ufffd\ufffdD");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "304" + "'", str3, "304");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001i" + "'", str7, "\001i");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001q" + "'", str9, "\001q");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "348" + "'", str11, "348");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "215609096138423330296102551225" + "'", str15, "215609096138423330296102551225");
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("946669947");
        java.lang.String str7 = rSA1.encrypt("414601987065913579031306059745");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("468");
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt(";n\025\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \";n??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "30" + "'", str7, "30");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "13269662680" + "'", str13, "13269662680");
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\037\ufffd\027\ufffd\ufffdq5");
        java.lang.String str13 = rSA1.encrypt("63340691434617068610410340865");
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\035\177K" + "'", str9, "\000\ufffd\035\177K");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1833423316" + "'", str11, "1833423316");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "770218459" + "'", str13, "770218459");
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.decrypt("149");
        java.lang.String str9 = rSA1.encrypt("\ufffd\t\ufffd\t\ufffd\ufffd|E)<");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "605" + "'", str5, "605");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "485" + "'", str9, "485");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("516");
        java.lang.String str5 = rSA1.decrypt("3541590856");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("425");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd\u0656\036\f\ufffd\r" + "'", str3, "\002\ufffd\u0656\036\f\ufffd\r");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\004\u07e4\ufffd\b\ufffdb" + "'", str5, "\004\u07e4\ufffd\b\ufffdb");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\037\ufffd\027\ufffd\ufffdq5");
        java.lang.String str13 = rSA1.decrypt("2635132195937723");
        java.lang.String str15 = rSA1.decrypt("698");
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "875" + "'", str5, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "388311705" + "'", str11, "388311705");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffdo" + "'", str13, "\000\ufffd\ufffd\ufffdo");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\006" + "'", str15, "\004\ufffd\006");
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.decrypt("1091385417287759808405208588958");
        java.lang.String str11 = rSA1.encrypt("24728158503917487987839420576");
        java.lang.String str13 = rSA1.decrypt("107");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd>" + "'", str9, "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd>");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "535971426283652467263265116387" + "'", str11, "535971426283652467263265116387");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\030\ufffd\ufffd\ufffd\ufffd\u0717\ufffd\ufffd(" + "'", str13, "\003\ufffd\030\ufffd\ufffd\ufffd\ufffd\u0717\ufffd\ufffd(");
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("658320474506132562654648259626");
        java.lang.String str13 = rSA1.decrypt("29358506122049777298420844854");
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\003\ufffd\ufffd\030\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??j?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "660243021936549916547132245793" + "'", str11, "660243021936549916547132245793");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\023\ufffd\ufffd\ufffd\ufffd\ufffdej\005\ufffd" + "'", str13, "\000\ufffd\023\ufffd\ufffd\ufffd\ufffd\ufffdej\005\ufffd");
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str7 = rSA1.encrypt("\001u");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7220115733093" + "'", str7, "7220115733093");
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.decrypt("72");
        java.lang.String str9 = rSA1.decrypt("1234543668832");
        java.lang.String str11 = rSA1.decrypt("266");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Q" + "'", str7, "Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001-" + "'", str9, "\001-");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.decrypt("287794280118878208");
        java.lang.String str17 = rSA1.encrypt("\ufffd\u04d5");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "72661970048157903748528399653" + "'", str5, "72661970048157903748528399653");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd`" + "'", str7, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd`");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "524028342892495400171683049176" + "'", str9, "524028342892495400171683049176");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "344447694832215732025452071295" + "'", str11, "344447694832215732025452071295");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd" + "'", str15, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "929802955" + "'", str17, "929802955");
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("393");
        java.lang.String str7 = rSA1.decrypt("227022896246510918381181022856");
        java.lang.String str9 = rSA1.decrypt("8");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.decrypt("86");
        rSA1.generateKeys((int) (short) 10);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "279" + "'", str5, "279");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001I" + "'", str7, "\001I");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "~" + "'", str9, "~");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\004\ufffd" + "'", str13, "\001\ufffd\004\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("478");
        java.lang.String str15 = rSA1.encrypt("646");
        java.lang.String str17 = rSA1.encrypt("\001\bl:0");
        java.lang.String str19 = rSA1.decrypt("16");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "42" + "'", str7, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "205" + "'", str9, "205");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10469866629" + "'", str13, "10469866629");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "13262684356" + "'", str15, "13262684356");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "12241206722" + "'", str17, "12241206722");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd" + "'", str19, "\002\ufffd");
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("\007\ufffd\ufffd\006\ufffd\ufffd\ufffdQ^");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\013\ufffd\ufffd\ufffd\034\"\ufffd\"" + "'", str9, "\013\ufffd\ufffd\ufffd\034\"\ufffd\"");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "290694045698044867986195789316" + "'", str15, "290694045698044867986195789316");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd63^\020j+\r");
        java.lang.String str9 = rSA1.encrypt("2951232610");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("\001\005\ufffd\f");
        rSA1.generateKeys((int) '#');
        java.lang.String str17 = rSA1.encrypt("283828185923712655441037297950");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "663" + "'", str7, "663");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "596" + "'", str9, "596");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "703" + "'", str13, "703");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "732090612" + "'", str17, "732090612");
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.encrypt("\005\ufffd\ufffd\u0641\ufffd\037I\\");
        rSA1.generateKeys(10);
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "181" + "'", str5, "181");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "101" + "'", str7, "101");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("|");
        java.lang.String str13 = rSA1.decrypt("6203695486");
        java.lang.String str15 = rSA1.encrypt("911315954");
        java.lang.String str17 = rSA1.encrypt("271");
        java.lang.String str19 = rSA1.decrypt("3541590856");
        java.lang.String str21 = rSA1.decrypt("343487621828977585630590427274");
        java.lang.String str23 = rSA1.encrypt("902536808429485");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001G" + "'", str3, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd4\034U" + "'", str7, "\000\ufffd4\034U");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "29316250624" + "'", str11, "29316250624");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "?,\033\ufffdg" + "'", str13, "?,\033\ufffdg");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2181000167338565" + "'", str15, "2181000167338565");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1837146714768602" + "'", str17, "1837146714768602");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\007\ufffd\ufffd\ufffd" + "'", str19, "\007\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd)" + "'", str21, "\007\ufffd\ufffd\ufffd\ufffd)");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1799210589027498" + "'", str23, "1799210589027498");
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("|");
        java.lang.String str13 = rSA1.decrypt("29339648412823630308726258195");
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd\ufffduV\023\ufffdn");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5" + "'", str3, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001r\030\ufffd\ufffd" + "'", str7, "\001r\030\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "29316250624" + "'", str11, "29316250624");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd$\034\ufffd" + "'", str13, "\002\ufffd$\034\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "503621835173236" + "'", str15, "503621835173236");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("208642166923338001575549632629");
        java.lang.String str11 = rSA1.encrypt("460");
        java.lang.String str13 = rSA1.decrypt("663612053");
        java.lang.String str15 = rSA1.encrypt("\001\ufffd\ufffd\ufffdM");
        java.lang.String str17 = rSA1.encrypt("800428690524956154324372637061");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str21 = rSA1.decrypt("1404055938755150");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "110" + "'", str7, "110");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "260" + "'", str9, "260");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "154" + "'", str11, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "248" + "'", str15, "248");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "36" + "'", str17, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\002\ufffd\ufffd\ufffd(,1\001\ufffd" + "'", str21, "\002\002\ufffd\ufffd\ufffd(,1\001\ufffd");
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\002\001");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd>");
        java.lang.String str15 = rSA1.encrypt("\002\ufffd\ufffd-");
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.encrypt("2347738556684758");
        java.lang.String str21 = rSA1.decrypt("5229405238");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\t" + "'", str3, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\035\ufffd" + "'", str7, "\ufffd\035\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\023\ufffd\000" + "'", str9, "\001\ufffd\023\ufffd\000");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "580483666" + "'", str11, "580483666");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3296585885" + "'", str13, "3296585885");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6704608091" + "'", str15, "6704608091");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "289" + "'", str19, "289");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("697");
        java.lang.String str15 = rSA1.encrypt("\000\ufffd\ufffd\ufffdV");
        java.lang.String str17 = rSA1.encrypt("448");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "423" + "'", str9, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "418498495072360008372873404930" + "'", str13, "418498495072360008372873404930");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "216110181543307371486443949531" + "'", str15, "216110181543307371486443949531");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "177231653234739197686224573512" + "'", str17, "177231653234739197686224573512");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("703153339289949437747864939069");
        java.lang.String str13 = rSA1.encrypt("167");
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.encrypt("241");
        java.lang.String str19 = rSA1.decrypt("4");
        java.lang.String str21 = rSA1.decrypt("744857250482925789611196184886");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\343\ufffd" + "'", str7, "\001\343\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\006\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "242258350500968" + "'", str13, "242258350500968");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "203864009" + "'", str17, "203864009");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\ufffd\ufffd" + "'", str19, "\003\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd\032" + "'", str21, "\ufffd\032");
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("148019774747790885656882734520");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "875" + "'", str5, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "246" + "'", str7, "246");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "848" + "'", str9, "848");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("387");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str7, "\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("|");
        java.lang.String str11 = rSA1.decrypt("270");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("\b\u0421\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.decrypt("24829636972784436289623304425");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\ufffd[");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \",4?[\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "110" + "'", str7, "110");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "269" + "'", str9, "269");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "387813581771020476820622951299" + "'", str15, "387813581771020476820622951299");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\013\ufffd\033#\0172tu\002\ufffd\ufffd!" + "'", str17, "\013\ufffd\033#\0172tu\002\ufffd\ufffd!");
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("4089374768");
        java.lang.String str5 = rSA1.encrypt("\000\ufffd\u06d9\003");
        java.lang.String str7 = rSA1.encrypt("20914855833503360039624631433");
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "398" + "'", str5, "398");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "364" + "'", str7, "364");
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\001\027\ufffd\ufffd");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "699920911295512" + "'", str7, "699920911295512");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("336011552384423252582675852");
        java.lang.String str11 = rSA1.encrypt("47777950521712127746591213977");
        java.lang.String str13 = rSA1.decrypt("258265091322468553983668563257");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\000\ufffd]}\024\ufffd(\037\ufffdj>u#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??]}\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002!" + "'", str3, "\002!");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "359" + "'", str5, "359");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "451" + "'", str7, "451");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "236" + "'", str11, "236");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("582");
        java.lang.String str13 = rSA1.encrypt("\ufffdi");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd&&\025" + "'", str7, "\000\ufffd&&\025");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3200244975" + "'", str9, "3200244975");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "717438014" + "'", str11, "717438014");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6755496765" + "'", str13, "6755496765");
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd7$:\t\ufffd");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffdb\007\ufffd" + "'", str7, "\000\ufffdb\007\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "161" + "'", str11, "161");
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("658320474506132562654648259626");
        java.lang.String str13 = rSA1.decrypt("29358506122049777298420844854");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1998947500173" + "'", str7, "1998947500173");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1998947500173" + "'", str9, "1998947500173");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1002910794325872469068845998716" + "'", str11, "1002910794325872469068845998716");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd\035\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\001\ufffd\ufffd\ufffd\035\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\007\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "284" + "'", str7, "284");
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("518");
        java.lang.String str11 = rSA1.decrypt("432");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\ufffd\ufffd\u068b\ufffd\ufffd\0219");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"IQ\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "185" + "'", str3, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "266" + "'", str5, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2490689776" + "'", str9, "2490689776");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\r\ufffd)" + "'", str11, "\000\ufffd\r\ufffd)");
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("56181887");
        java.lang.String str11 = rSA1.decrypt("7591156848866311702672535389");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "42" + "'", str3, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "16845196662419646966819654935" + "'", str7, "16845196662419646966819654935");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11189633941833355098142843264" + "'", str9, "11189633941833355098142843264");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\032\ufffd\022\ufffd\u07050f" + "'", str11, "\032\ufffd\022\ufffd\u07050f");
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        java.lang.String str15 = rSA1.encrypt("875");
        java.lang.String str17 = rSA1.decrypt("392170649013389");
        java.lang.String str19 = rSA1.encrypt("581487859790390260902423556635");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "43713225977634569913767471674" + "'", str15, "43713225977634569913767471674");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\u1bb1\005\ufffd\ufffd\ufffd" + "'", str17, "\007\u1bb1\005\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "44758726476042906897798797758" + "'", str19, "44758726476042906897798797758");
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("1075488919");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("109");
        java.lang.String str19 = rSA1.encrypt("3063415839");
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "70" + "'", str3, "70");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8954237916964445863180247218" + "'", str7, "8954237916964445863180247218");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002&" + "'", str13, "\002&");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "954381133956320328157098105017" + "'", str17, "954381133956320328157098105017");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "109769313556046491890943053877" + "'", str19, "109769313556046491890943053877");
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.decrypt("461");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\ufffd\020\ufffd\013\ufffd\ufffd\030\ufffdz");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001-" + "'", str15, "\001-");
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("302478007679515165391351820133");
        java.lang.String str15 = rSA1.encrypt("21262565530067871612812451046");
        java.lang.String str17 = rSA1.encrypt("784828597287076");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001@" + "'", str7, "\001@");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "199888085586568818378217759731" + "'", str11, "199888085586568818378217759731");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "89000771353147376180454999889" + "'", str13, "89000771353147376180454999889");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "16414008396795869891842363897" + "'", str15, "16414008396795869891842363897");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "823896902713753560073241383140" + "'", str17, "823896902713753560073241383140");
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.encrypt("\001+5{1");
        java.lang.String str15 = rSA1.decrypt("410");
        java.lang.String str17 = rSA1.encrypt("201505539860873048562977932183");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\007" + "'", str7, "\002\007");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "261" + "'", str9, "261");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "531" + "'", str13, "531");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "154" + "'", str17, "154");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "D" + "'", str7, "D");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "90" + "'", str9, "90");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "390" + "'", str11, "390");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "144" + "'", str13, "144");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "311" + "'", str15, "311");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\031" + "'", str17, "\031");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "148" + "'", str19, "148");
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("674589993819081348249");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\0373\177n" + "'", str7, "\0373\177n");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3947882185" + "'", str9, "3947882185");
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.decrypt("1091385417287759808405208588958");
        java.lang.String str11 = rSA1.encrypt("24728158503917487987839420576");
        java.lang.String str13 = rSA1.encrypt("166869500146933535004111431966");
        java.lang.String str15 = rSA1.decrypt("375");
        java.lang.String str17 = rSA1.encrypt("27369156496563179311100591053");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1998947500173" + "'", str7, "1998947500173");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\u0321" + "'", str9, "\001\ufffd\ufffd\ufffd\ufffd\u0321");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "519849591303853919722994068130" + "'", str11, "519849591303853919722994068130");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "389739044813427179174206958915" + "'", str13, "389739044813427179174206958915");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd%" + "'", str15, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd%");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "40261031171319167407582518455" + "'", str17, "40261031171319167407582518455");
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3958818885447861921138250491" + "'", str3, "3958818885447861921138250491");
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.decrypt("279");
        java.lang.String str11 = rSA1.decrypt("177");
        java.lang.String str13 = rSA1.decrypt("442");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "252" + "'", str7, "252");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\020" + "'", str13, "\001\020");
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("\025");
        java.lang.String str5 = rSA1.encrypt("28");
        java.lang.String str7 = rSA1.encrypt("255635653807356729488134260102");
        java.lang.String str9 = rSA1.decrypt("4090139582");
        java.lang.String str11 = rSA1.encrypt("529818989354615977058880819959");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1801088541" + "'", str3, "1801088541");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3121947424" + "'", str5, "3121947424");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5412129692" + "'", str7, "5412129692");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd\\" + "'", str9, "\000\ufffd\ufffd\ufffd\\");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "197176914" + "'", str11, "197176914");
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        java.lang.String str9 = rSA1.encrypt("\f\ufffdx");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "30753058011725798788211035959" + "'", str9, "30753058011725798788211035959");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("23585400911907150218938419175");
        java.lang.String str5 = rSA1.encrypt("144");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "153" + "'", str5, "153");
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("478");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "447" + "'", str5, "447");
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("11716232800583690748559256041");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.encrypt("375222114829344077571796106442");
        rSA1.generateKeys((int) '#');
        java.lang.String str23 = rSA1.encrypt("249839559035698604228398522433");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "293759051413305361354048524986" + "'", str5, "293759051413305361354048524986");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "380993334940120045293315619935" + "'", str7, "380993334940120045293315619935");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffdf\177\020\036\ufffd" + "'", str9, "\003\ufffd\ufffd\ufffd\ufffdf\177\020\036\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd{\\\ufffd\033\ufffd" + "'", str11, "\003\ufffd\ufffd\ufffd\ufffd{\\\ufffd\033\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "662" + "'", str19, "662");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1786655353" + "'", str23, "1786655353");
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
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
        java.lang.String str25 = rSA1.encrypt("\ufffd\ufffd\003\u06d0\ufffd2");
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "285" + "'", str7, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "294" + "'", str9, "294");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\002q\026\ufffd_P;:" + "'", str13, "\000\ufffd\ufffd\002q\026\ufffd_P;:");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3234186043708632" + "'", str17, "3234186043708632");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1408257552770397" + "'", str19, "1408257552770397");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "234558535345906" + "'", str21, "234558535345906");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "138537527242403817012416909542" + "'", str25, "138537527242403817012416909542");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("4084101");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "24" + "'", str7, "24");
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("42418796185018424088");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str19 = rSA1.encrypt("370169588491624481478429419755");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "236" + "'", str3, "236");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + ")v7\004" + "'", str9, ")v7\004");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1746582196" + "'", str11, "1746582196");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\r\ufffd" + "'", str13, "\ufffd\r\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "330351535935252279983908433475" + "'", str19, "330351535935252279983908433475");
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.encrypt("99");
        java.lang.String str13 = rSA1.encrypt("\013lf\020\ufffd\034\ufffd\ufffd\ufffd\016\ufffdah");
        java.lang.String str15 = rSA1.decrypt("3524858751645091769072738871");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd[}pJ\031" + "'", str7, "\004\ufffd\ufffd\ufffd\ufffd[}pJ\031");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3143575801449" + "'", str11, "3143575801449");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "674636442982119645100625495808" + "'", str13, "674636442982119645100625495808");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd}" + "'", str15, "\001\ufffd\ufffd\ufffd\ufffd\ufffd}");
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("3066983185");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "519" + "'", str5, "519");
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("4089374768");
        java.lang.String str5 = rSA1.encrypt("\000\ufffd\u06d9\003");
        java.lang.String str7 = rSA1.encrypt("20914855833503360039624631433");
        java.lang.String str9 = rSA1.encrypt("16156209496766550638227152486");
        java.lang.String str11 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\025\ufffd\u0247");
        java.lang.String str13 = rSA1.encrypt("785539727012536");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001/" + "'", str3, "\001/");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "320" + "'", str7, "320");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "461" + "'", str9, "461");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "508" + "'", str11, "508");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "479" + "'", str13, "479");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("1208902895495334527");
        java.lang.String str9 = rSA1.encrypt("95");
        java.lang.String str11 = rSA1.encrypt("1798350776157985");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.encrypt("1166426200069845");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "17832489911232" + "'", str7, "17832489911232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141001386125" + "'", str9, "3141001386125");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "488698225829849" + "'", str11, "488698225829849");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1197384666949858" + "'", str15, "1197384666949858");
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("\002R");
        rSA1.generateKeys((int) '#');
        java.lang.String str19 = rSA1.encrypt("5411392559");
        java.lang.String str21 = rSA1.encrypt("539908087753964666720331391300");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0016" + "'", str3, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\fI\025\ufffd\n\027\ufffd" + "'", str9, "\ufffd\ufffd\fI\025\ufffd\n\027\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "209584584" + "'", str15, "209584584");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "3242093181" + "'", str19, "3242093181");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2268879881" + "'", str21, "2268879881");
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("658320474506132562654648259626");
        java.lang.String str13 = rSA1.decrypt("29358506122049777298420844854");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "178619480460285804228285716627" + "'", str11, "178619480460285804228285716627");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("697");
        java.lang.String str15 = rSA1.encrypt("\000\ufffd\ufffd\ufffdV");
        java.lang.String str17 = rSA1.encrypt("448");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "693" + "'", str9, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "318628339174355791358462438556" + "'", str13, "318628339174355791358462438556");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "467219795058651851577986352265" + "'", str15, "467219795058651851577986352265");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "664555126960624576586476755302" + "'", str17, "664555126960624576586476755302");
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("2063650974266313");
        java.lang.String str5 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\u0321");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "156140012311465687041785903700" + "'", str3, "156140012311465687041785903700");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "76408264041945026781791663970" + "'", str5, "76408264041945026781791663970");
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("693");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("1866775173145135");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10397097079355867099538946602" + "'", str3, "10397097079355867099538946602");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "15930352093051289224495254400" + "'", str5, "15930352093051289224495254400");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2051295717692160" + "'", str11, "2051295717692160");
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.encrypt("410411422422033928813383347735");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002M" + "'", str3, "\002M");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "356" + "'", str7, "356");
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.encrypt("I\\\ufffd\031");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "56181887" + "'", str7, "56181887");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "109" + "'", str11, "109");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("322134328841305854994100193972");
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\037\ufffd\002" + "'", str9, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\037\ufffd\002");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\ufffdi" + "'", str17, "\002\ufffd\ufffd\ufffdi");
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '4');
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd\030\\\ufffdM");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\006" + "'", str5, "\001\006");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "435238229408843" + "'", str9, "435238229408843");
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.decrypt("409247107494479");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\007" + "'", str7, "\002\007");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd{\024\ufffd\ufffd\ufffd" + "'", str11, "\004\ufffd\ufffd\ufffd\ufffd{\024\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("502069562720669011972970389935");
        java.lang.String str9 = rSA1.decrypt("1836473909513684");
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.encrypt("5747602594");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("Y");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Y\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0016" + "'", str3, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "607" + "'", str5, "607");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "440" + "'", str7, "440");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\030" + "'", str9, "\002\030");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2454861965" + "'", str13, "2454861965");
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\001\ufffd\ufffd\033\ufffd");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.encrypt("404562186961199544635848844762");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "209" + "'", str3, "209");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000" + "'", str7, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "291" + "'", str9, "291");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "402" + "'", str15, "402");
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        java.lang.String str13 = rSA1.decrypt("35583402576551630221");
        java.lang.String str15 = rSA1.encrypt("11716232800583690748559256041");
        java.lang.String str17 = rSA1.encrypt("604");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "110" + "'", str7, "110");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "101" + "'", str11, "101");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\0018" + "'", str13, "\0018");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "347" + "'", str15, "347");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "375" + "'", str17, "375");
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
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
        java.lang.String str21 = rSA1.decrypt("236");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\b\035\ufffd\ufffd\ufffd\022\ufffdv.\004\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd5\021\007\ufffd\013" + "'", str13, "\ufffd\ufffd5\021\007\ufffd\013");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "724170268313996" + "'", str17, "724170268313996");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1444235517410603" + "'", str19, "1444235517410603");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\b\026\ufffd\ufffdF" + "'", str21, "\b\026\ufffd\ufffdF");
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("51");
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "52" + "'", str11, "52");
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str5 = rSA1.encrypt("\ufffd\007\0302\006");
        java.lang.String str7 = rSA1.decrypt("216821936674241640187261588274");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "269" + "'", str5, "269");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "v" + "'", str7, "v");
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.decrypt("34089860651578007478246711177");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("764080762608778560955290362258");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.decrypt("368600707613005943035554527983");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "281" + "'", str3, "281");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "256" + "'", str5, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002" + "'", str7, "\002");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffdl" + "'", str11, "\002\ufffd\ufffdl");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\001;");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("35583402576551630221");
        java.lang.String str19 = rSA1.encrypt("\002\u0341Z");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "53933965840939024945601534923" + "'", str11, "53933965840939024945601534923");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3101364196875" + "'", str13, "3101364196875");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "22377768887302657979511220671" + "'", str17, "22377768887302657979511220671");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1302785190376977074297675525" + "'", str19, "1302785190376977074297675525");
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("658320474506132562654648259626");
        java.lang.String str13 = rSA1.decrypt("63944551038523953702806198424");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "522129390082684666358320254996" + "'", str11, "522129390082684666358320254996");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd\034\ufffd\ufffd" + "'", str13, "\007\ufffd\ufffd\ufffd\ufffd\ufffd\034\ufffd\ufffd");
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str5 = rSA1.encrypt("\005\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "440809345347114079341683641543" + "'", str3, "440809345347114079341683641543");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "450433218525941014482918792765" + "'", str5, "450433218525941014482918792765");
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("518");
        java.lang.String str11 = rSA1.decrypt("208642166923338001575549632629");
        java.lang.String str13 = rSA1.decrypt("214069497769339045003900891766");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "576" + "'", str5, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "245957630" + "'", str9, "245957630");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\030\ufffd\026" + "'", str11, "\030\ufffd\026");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\016\ufffd\ufffd" + "'", str13, "\016\ufffd\ufffd");
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("432");
        java.lang.String str9 = rSA1.encrypt("\026\025\u0763\ufffd\ufffd\037\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "165" + "'", str9, "165");
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.decrypt("72");
        java.lang.String str9 = rSA1.decrypt("1234543668832");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\t" + "'", str5, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002u" + "'", str7, "\002u");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002q" + "'", str9, "\002q");
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.encrypt("490");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("4141931971");
        java.lang.String str9 = rSA1.encrypt("311430194");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "954357638" + "'", str3, "954357638");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "291264316883690019366605473545" + "'", str7, "291264316883690019366605473545");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "352689424683791191206857647279" + "'", str9, "352689424683791191206857647279");
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.decrypt("9076220414");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\001\ufffd\ufffd\ufffd\000\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??@????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "|" + "'", str3, "|");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\016" + "'", str7, "\001\016");
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.decrypt("34089860651578007478246711177");
        java.lang.String str9 = rSA1.encrypt("674338054");
        java.lang.String str11 = rSA1.encrypt("36054434870690696155932301913");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "566" + "'", str3, "566");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "605" + "'", str5, "605");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003*" + "'", str7, "\003*");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "127" + "'", str9, "127");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "706" + "'", str11, "706");
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("5824490359974973208230734176");
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\006\017\u01c0\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u0173\ufffd" + "'", str3, "\u0173\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1660408023" + "'", str5, "1660408023");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str7, "\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\002u");
        java.lang.String str9 = rSA1.decrypt("371");
        java.lang.String str11 = rSA1.encrypt("18284470307236561615055147777");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "266" + "'", str5, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "=" + "'", str9, "=");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35" + "'", str11, "35");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "116" + "'", str13, "116");
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("2155055185841074");
        java.lang.String str11 = rSA1.decrypt("474552");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "236" + "'", str3, "236");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\032" + "'", str5, "\001\032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000" + "'", str7, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "163" + "'", str9, "163");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\f" + "'", str11, "\f");
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("2445186040379015");
        java.lang.String str13 = rSA1.encrypt("90875166998927");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001W" + "'", str5, "\001W");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005" + "'", str7, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6803323757" + "'", str11, "6803323757");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6308680788" + "'", str13, "6308680788");
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("461");
        java.lang.String str9 = rSA1.encrypt("\005");
        java.lang.String str11 = rSA1.decrypt("1139797615");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\027\ufffd" + "'", str7, "\001\ufffd\027\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "48828125" + "'", str9, "48828125");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd9\177" + "'", str11, "\000\ufffd\ufffd9\177");
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.encrypt("262");
        java.lang.String str13 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\017\ufffd.\021\ufffd\ufffd");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("1996568178688");
        java.lang.String str19 = rSA1.encrypt("\ufffd[");
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "274833335900568611862842830578" + "'", str5, "274833335900568611862842830578");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "524385301537508573494327626619" + "'", str7, "524385301537508573494327626619");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd~" + "'", str9, "\002\ufffd\ufffd\ufffd\ufffd\ufffd~");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "462201949492129576501867124479" + "'", str11, "462201949492129576501867124479");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "136926206631812530468692572504" + "'", str13, "136926206631812530468692572504");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "13370489878050181180354286682" + "'", str17, "13370489878050181180354286682");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "39406223824906982809968981307" + "'", str19, "39406223824906982809968981307");
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("35039915204721349358906154439");
        java.lang.String str11 = rSA1.decrypt("26624023838936183373062913224");
        java.lang.String str13 = rSA1.decrypt("7194494216");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\ufffd,\030\ufffd^9" + "'", str9, "\002\ufffd\ufffd\ufffd,\030\ufffd^9");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd/\013)*" + "'", str11, "\007\ufffd\ufffd\ufffd\ufffd\ufffd/\013)*");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\u07a7\ufffd\ufffdm" + "'", str13, "\006\ufffd\u07a7\ufffd\ufffdm");
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str15 = rSA1.decrypt("399232864");
        java.lang.String str17 = rSA1.decrypt("26473901013199856375128902653");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "134" + "'", str7, "134");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "k$\037\u01a2\030\ufffd\ufffd\ufffd\005\ufffd" + "'", str13, "k$\037\u01a2\030\ufffd\ufffd\ufffd\005\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\013W\f\ufffdS~\177\ufffd\021\ufffd\ufffd" + "'", str15, "\013W\f\ufffdS~\177\ufffd\021\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\002\001");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd>");
        java.lang.String str15 = rSA1.encrypt("\002\ufffd\ufffd-");
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.encrypt("\002!");
        java.lang.String str21 = rSA1.decrypt("744857250482925789611196184886");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "z" + "'", str3, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str7, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd\b" + "'", str9, "\000\ufffd\ufffd\ufffd\b");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "135005697" + "'", str11, "135005697");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "12369307943" + "'", str13, "12369307943");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7585698148" + "'", str15, "7585698148");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "188" + "'", str19, "188");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[" + "'", str21, "[");
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("208642166923338001575549632629");
        java.lang.String str11 = rSA1.encrypt("501619215992877544684325066512");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "473" + "'", str5, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "167" + "'", str7, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "51" + "'", str9, "51");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "42" + "'", str11, "42");
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("142");
        java.lang.String str13 = rSA1.encrypt("371");
        java.lang.String str15 = rSA1.encrypt("4409664116");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\ufffd\ufffd7$:\t\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"CF?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "461" + "'", str7, "461");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "624" + "'", str13, "624");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "112" + "'", str15, "112");
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        java.lang.String str9 = rSA1.encrypt("4839922246");
        rSA1.generateKeys((int) (byte) 10);
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "303026126681962478663847503833" + "'", str9, "303026126681962478663847503833");
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "252" + "'", str7, "252");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "223" + "'", str9, "223");
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        java.lang.String str15 = rSA1.encrypt("875");
        java.lang.String str17 = rSA1.encrypt("42418796185018424088");
        rSA1.generateKeys((int) '#');
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
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\f\ufffd\ufffd\ufffd\ufffd\004" + "'", str13, "\ufffd\f\ufffd\ufffd\ufffd\ufffd\004");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "50004784369000759949" + "'", str15, "50004784369000759949");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "14992847315326951585403560412" + "'", str17, "14992847315326951585403560412");
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.encrypt("490");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("1757850692");
        java.lang.String str9 = rSA1.encrypt("412858181120265885230303940175");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1081924027" + "'", str3, "1081924027");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004\n\025\ufffd\ufffdP\n\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\004\n\025\ufffd\ufffdP\n\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "563522466986456970161738558130" + "'", str9, "563522466986456970161738558130");
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\ufffd\u0795\ufffd$");
        java.lang.String str13 = rSA1.encrypt("380");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.decrypt("172821415010628830484441450609");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000" + "'", str7, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "27" + "'", str9, "27");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "84" + "'", str11, "84");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "168" + "'", str13, "168");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\037z" + "'", str17, "\ufffd\ufffd\ufffd\ufffd\ufffd\037z");
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("3077056399");
        java.lang.String str15 = rSA1.decrypt("715053248569397442655422819632");
        java.lang.String str17 = rSA1.encrypt("\002\ufffd\ufffd\ufffd");
        java.lang.String str19 = rSA1.encrypt("\004\ufffd\ufffd\ufffd4MR{\tL2\031");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\r\ufffd\ufffdD" + "'", str9, "\r\ufffd\ufffdD");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1380534778" + "'", str11, "1380534778");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffdR\t" + "'", str13, "\ufffdR\t");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd%" + "'", str15, "\002\ufffd\ufffd%");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "513719547" + "'", str17, "513719547");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1413333998" + "'", str19, "1413333998");
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("\025");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("331");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd\ufffdd*");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4084101" + "'", str3, "4084101");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "37778857553612031121" + "'", str7, "37778857553612031121");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37910248630719109870311443228" + "'", str9, "37910248630719109870311443228");
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.decrypt("409247107494479");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\u03adG\030\ufffd\ufffd" + "'", str11, "\006\u03adG\030\ufffd\ufffd");
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
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
        java.lang.String str21 = rSA1.decrypt("236");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass28 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffdwX\000\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffdwX\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "934444808991531" + "'", str17, "934444808991531");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "387323033009024" + "'", str19, "387323033009024");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\022" + "'", str21, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\022");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("511");
        java.lang.String str13 = rSA1.decrypt("4032293728");
        java.lang.String str15 = rSA1.encrypt("315605441812025565077840749459");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "236" + "'", str3, "236");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\032" + "'", str5, "\001\032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000" + "'", str7, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "274" + "'", str9, "274");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002" + "'", str13, "\002");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "299" + "'", str15, "299");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.encrypt("188");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "50\037\ufffd\ufffd\ufffdJ" + "'", str7, "50\037\ufffd\ufffd\ufffdJ");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "304273185052100515618380581123" + "'", str11, "304273185052100515618380581123");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd63^\020j+\r");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("690675774561579157326569817971");
        java.lang.String str13 = rSA1.encrypt("\001\ufffd\006\ufffd");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "353" + "'", str7, "353");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\000\025\016\ufffd\u0313\ufffd\ufffd" + "'", str11, "\003\ufffd\ufffd\000\025\016\ufffd\u0313\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "871543707841547553742759206187" + "'", str13, "871543707841547553742759206187");
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("253");
        java.lang.String str13 = rSA1.decrypt("450766669594624");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\007\ufffd\ufffd\ufffdD-z\037\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001n" + "'", str5, "\001n");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001u" + "'", str7, "\001u");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002y" + "'", str9, "\002y");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001." + "'", str13, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "29979841286896196676114231295" + "'", str17, "29979841286896196676114231295");
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("511");
        java.lang.String str13 = rSA1.encrypt("\005\u0452\ufffd#YUDhy\177\ufffd");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0014" + "'", str5, "\0014");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'" + "'", str7, "'");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380" + "'", str9, "380");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001M" + "'", str11, "\001M");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "312" + "'", str13, "312");
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("393");
        java.lang.String str7 = rSA1.decrypt("227022896246510918381181022856");
        java.lang.String str9 = rSA1.encrypt("326");
        java.lang.String str11 = rSA1.encrypt("693163497185261709622839235979");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\021\ufffd\u05eb\ufffdIn\031\ufffdW");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "279" + "'", str5, "279");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\0016" + "'", str7, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "151" + "'", str9, "151");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "95" + "'", str11, "95");
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "531" + "'", str7, "531");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "101" + "'", str11, "101");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("3077056399");
        java.lang.String str15 = rSA1.decrypt("715053248569397442655422819632");
        java.lang.String str17 = rSA1.encrypt("680");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\000FY" + "'", str9, "\000\ufffd\000FY");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1105775451" + "'", str11, "1105775451");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004k\027L" + "'", str13, "\004k\027L");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd" + "'", str15, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "241789400" + "'", str17, "241789400");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.decrypt("166");
        java.lang.String str13 = rSA1.encrypt("483");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001G" + "'", str5, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "509" + "'", str7, "509");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8" + "'", str9, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "205" + "'", str13, "205");
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str11 = rSA1.encrypt("\002\ufffd>");
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\ufffd\ufffd\b\ufffd\ufffd+\035\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\017\030\ufffd\033\005\ufffd\ufffd\u031e" + "'", str7, "\017\030\ufffd\033\005\ufffd\ufffd\u031e");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "638656024808392105790817400" + "'", str9, "638656024808392105790817400");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1861375299638850868070620470" + "'", str11, "1861375299638850868070620470");
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
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
        java.lang.String str25 = rSA1.encrypt("289734891292401713311056387999");
        java.lang.String str27 = rSA1.encrypt("270");
        java.lang.String str29 = rSA1.encrypt("311781438590811775956980340544");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "285" + "'", str7, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "294" + "'", str9, "294");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffdX\005\ufffd\n\ufffd\ufffd\177\ufffd\ufffd" + "'", str13, "\ufffdX\005\ufffd\n\ufffd\ufffd\177\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "83778632467742" + "'", str17, "83778632467742");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd\ufffdl" + "'", str21, "\ufffd\ufffdl");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "656962302" + "'", str23, "656962302");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "5733373978" + "'", str25, "5733373978");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1820038592" + "'", str27, "1820038592");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "5319789480" + "'", str29, "5319789480");
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        java.lang.String str13 = rSA1.encrypt("1135680707");
        rSA1.generateKeys((int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "616" + "'", str7, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "176" + "'", str11, "176");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32" + "'", str13, "32");
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("6027768308437645793663749491");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\020" + "'", str7, "\020");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd(>\024\u067e\ufffd" + "'", str11, "\001\ufffd(>\024\u067e\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002" + "'", str13, "\002");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd\ufffd\ufffd\ud8c8\udf8ea@/" + "'", str19, "\002\ufffd\ufffd\ufffd\ud8c8\udf8ea@/");
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("1611067079503803");
        java.lang.String str17 = rSA1.encrypt("524120347");
        java.lang.String str19 = rSA1.decrypt("642");
        java.lang.String str21 = rSA1.encrypt("3317830731");
        java.lang.String str23 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "343398647238819051955715964110" + "'", str15, "343398647238819051955715964110");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "561735988480498488483739947900" + "'", str17, "561735988480498488483739947900");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd\ufffd\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\001\ufffd\ufffd\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "556762239637428199865401676362" + "'", str21, "556762239637428199865401676362");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "408398925441022624019178258392" + "'", str23, "408398925441022624019178258392");
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.encrypt("\003i\t\ufffd\ufffdn");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str19 = rSA1.encrypt("\000\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "177709174286119696651823538536" + "'", str5, "177709174286119696651823538536");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006\ufffd\ufffd\ufffd\022\ufffd\u0302" + "'", str7, "\006\ufffd\ufffd\ufffd\022\ufffd\u0302");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "288784871767895143335483469466" + "'", str9, "288784871767895143335483469466");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "237766339633502861282790648582" + "'", str11, "237766339633502861282790648582");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "163684370" + "'", str15, "163684370");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "39190002054643133536788596010" + "'", str19, "39190002054643133536788596010");
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("946669947");
        java.lang.String str7 = rSA1.encrypt("423298601721002386028737058800");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u039d");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "74" + "'", str7, "74");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "58" + "'", str9, "58");
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("5824490359974973208230734176");
        java.lang.String str7 = rSA1.encrypt("\t\ufffd\f\007\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\032\001\033+" + "'", str3, "\032\001\033+");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "656843012" + "'", str5, "656843012");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "921457308" + "'", str7, "921457308");
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd");
        java.lang.String str13 = rSA1.encrypt("174");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "27" + "'", str3, "27");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "470" + "'", str5, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "D" + "'", str7, "D");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "153" + "'", str11, "153");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "384" + "'", str13, "384");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("657405682890675031523377180014");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\017");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002!" + "'", str3, "\002!");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "203" + "'", str7, "203");
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("465270144019721");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.decrypt("255990944756328140947606350659");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i" + "'", str3, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "135" + "'", str5, "135");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "36" + "'", str7, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\024\u019a\ufffd:\021\u03d8Ht" + "'", str11, "\024\u019a\ufffd:\021\u03d8Ht");
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("1611067079503803");
        java.lang.String str17 = rSA1.encrypt("524120347");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd)" + "'", str9, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd)");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "103156496375284919153883701970" + "'", str15, "103156496375284919153883701970");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "264549554498671427150781091743" + "'", str17, "264549554498671427150781091743");
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\002\001");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd>");
        java.lang.String str15 = rSA1.encrypt("\002\ufffd\ufffd-");
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.encrypt("1543227387957993574038458665");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001G" + "'", str3, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "}}\004\ufffd" + "'", str7, "}}\004\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001h\n\004\ufffd" + "'", str9, "\001h\n\004\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7673091213" + "'", str11, "7673091213");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5267466508" + "'", str13, "5267466508");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2858097726" + "'", str15, "2858097726");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "137" + "'", str19, "137");
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.decrypt("265482618753364");
        java.lang.String str19 = rSA1.encrypt("\u01ac\ufffd\ufffd\ufffd\031B");
        java.lang.String str21 = rSA1.decrypt("277285434111556256763152259316");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\f\ufffd\ufffd\ufffd\ufffd\ufffd\u0177" + "'", str17, "\004\ufffd\f\ufffd\ufffd\ufffd\ufffd\ufffd\u0177");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "72403421917469517205160538549" + "'", str19, "72403421917469517205160538549");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffd\ufffd\032\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\002\ufffd\ufffd\032\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("\002E");
        java.lang.String str13 = rSA1.encrypt("412855490441922175904469813661");
        java.lang.String str15 = rSA1.decrypt("311430194");
        java.lang.String str17 = rSA1.encrypt("2071189378");
        java.lang.String str19 = rSA1.decrypt("44463634112024188088789181680");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001d\321=" + "'", str7, "\001d\321=");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "66203456086901" + "'", str11, "66203456086901");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2252135569456619" + "'", str13, "2252135569456619");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002X\000\ufffd\ufffd" + "'", str15, "\002X\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1211578250616715" + "'", str17, "1211578250616715");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\005\ufffd\ufffd\ufffdz&" + "'", str19, "\005\ufffd\ufffd\ufffdz&");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("24728158503917487987839420576");
        java.lang.String str9 = rSA1.encrypt("76953254708816336608130262493");
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\ufffd\006X\026\ufffd");
        java.lang.String str13 = rSA1.encrypt("37761667692440245568");
        java.lang.String str15 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\u0732w");
        java.lang.String str17 = rSA1.encrypt("8000");
        java.lang.String str19 = rSA1.decrypt("572318888080881357035132732482");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\003~\006F" + "'", str7, "\002\003~\006F");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7929518577" + "'", str9, "7929518577");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5719420707" + "'", str11, "5719420707");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4359720163" + "'", str13, "4359720163");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6258605390" + "'", str15, "6258605390");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "898511085" + "'", str17, "898511085");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufffd\ufffd\033" + "'", str19, "\000\ufffd\ufffd\ufffd\033");
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "279" + "'", str5, "279");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\0016" + "'", str7, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\035\ufffd\ufffd" + "'", str15, "\003\ufffd\ufffd\035\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "87" + "'", str21, "87");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd" + "'", str23, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("441");
        java.lang.String str13 = rSA1.encrypt("573027999461902947452889180577");
        java.lang.String str15 = rSA1.encrypt("669");
        java.lang.String str17 = rSA1.encrypt("\004\ufffd\002\ufffd\ufffd\ufffdL$\017\ufffd\f.");
        java.lang.String str19 = rSA1.encrypt("\001\u0788\003\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1122968611" + "'", str11, "1122968611");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "956169992" + "'", str13, "956169992");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "199589461" + "'", str15, "199589461");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "930089611" + "'", str17, "930089611");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "654534281" + "'", str19, "654534281");
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("703153339289949437747864939069");
        java.lang.String str13 = rSA1.encrypt("167");
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.decrypt("5616649151");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffd&c" + "'", str11, "\006\ufffd\ufffd\ufffd&c");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "949342008803356" + "'", str13, "949342008803356");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffdq" + "'", str17, "\ufffd\ufffdq");
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("314");
        java.lang.String str5 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd3");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.decrypt("\001\005\ufffd\f");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??2??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "343888546341694874091864160004" + "'", str3, "343888546341694874091864160004");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "485168354114978641832240054766" + "'", str5, "485168354114978641832240054766");
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\002u");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "27" + "'", str3, "27");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "470" + "'", str5, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "170" + "'", str7, "170");
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("\002\ufffd");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str19 = rSA1.encrypt("618");
        java.lang.String str21 = rSA1.decrypt("384868008312393945810680244781");
        java.lang.String str23 = rSA1.encrypt("18500643531705236304075842419");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "478" + "'", str7, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "677" + "'", str15, "677");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "436" + "'", str19, "436");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd" + "'", str21, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "304" + "'", str23, "304");
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1611067079503803");
        java.lang.String str13 = rSA1.decrypt("18980981751395059997709561778");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("445470397338159114115981620023");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "96" + "'", str5, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "117" + "'", str7, "117");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "264" + "'", str11, "264");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
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
        java.lang.String str23 = rSA1.encrypt("5462210268");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "134" + "'", str7, "134");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\033\ufffd\034\ufffd\ufffd0 " + "'", str13, "\ufffd\033\ufffd\034\ufffd\ufffd0 ");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "942130750154174" + "'", str17, "942130750154174");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1729207453215775" + "'", str19, "1729207453215775");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1042464440" + "'", str23, "1042464440");
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0016" + "'", str3, "\0016");
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.decrypt("394");
        java.lang.String str7 = rSA1.decrypt("650");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "281" + "'", str3, "281");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.encrypt("490");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("1757850692");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.decrypt("474056181514113440240671949593");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1494798198" + "'", str3, "1494798198");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\r\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\001" + "'", str7, "\003\r\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\001");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001U" + "'", str17, "\001U");
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("518");
        java.lang.String str11 = rSA1.decrypt("208642166923338001575549632629");
        java.lang.String str13 = rSA1.decrypt("214069497769339045003900891766");
        rSA1.generateKeys((int) (byte) 10);
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1241074637" + "'", str9, "1241074637");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\027\u1f1c" + "'", str11, "\027\u1f1c");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd" + "'", str13, "\ufffd");
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
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
        java.lang.String str27 = rSA1.decrypt("77867258");
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.decrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\032\004\ufffd\ufffd\f\ufffdk" + "'", str13, "\ufffd\ufffd\032\004\ufffd\ufffd\f\ufffdk");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1206443603691754" + "'", str17, "1206443603691754");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd#" + "'", str21, "\ufffd#");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "6854291717" + "'", str23, "6854291717");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ufffd\ufffd" + "'", str25, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str27, "\001\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("\023\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str7 = rSA1.decrypt("271");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "636105019918413827388041789939" + "'", str5, "636105019918413827388041789939");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\005\ufffd\ufffd\ufffd\021\021\ufffd\ufffd" + "'", str7, "\ufffd\005\ufffd\ufffd\ufffd\021\021\ufffd\ufffd");
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.encrypt("262");
        java.lang.String str13 = rSA1.encrypt("630010341");
        java.lang.String str15 = rSA1.encrypt("7542022550");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "705421327569248052589289628244" + "'", str5, "705421327569248052589289628244");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "656585904823728860150799366428" + "'", str7, "656585904823728860150799366428");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\b\ufffd\u072f\ufffd\ufffd/\034\ufffd\ufffd\ufffd" + "'", str9, "\b\ufffd\u072f\ufffd\ufffd/\034\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "681061490171313980428055747631" + "'", str11, "681061490171313980428055747631");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "821561576882969109719096153904" + "'", str13, "821561576882969109719096153904");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "674743911871808729697222928536" + "'", str15, "674743911871808729697222928536");
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("24913536938563019036853654452");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "418978499" + "'", str3, "418978499");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd\ufffd\037\ufffd\ufffd\ufffd\ufffd\f");
        java.lang.String str11 = rSA1.decrypt("266392338881691887050140218831");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "381" + "'", str9, "381");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002i" + "'", str11, "\002i");
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1611067079503803");
        java.lang.String str13 = rSA1.encrypt("475");
        java.lang.String str15 = rSA1.decrypt("236");
        java.lang.String str17 = rSA1.encrypt("\001\ufffd\ufffd\027\033gVf\003\032C\033\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "531" + "'", str7, "531");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "454" + "'", str11, "454");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "212" + "'", str13, "212");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\0020" + "'", str15, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "515" + "'", str17, "515");
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.decrypt("771929004");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002M" + "'", str3, "\002M");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001c" + "'", str7, "\001c");
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.decrypt("39227321947341666623299176560");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "363567018486687918050111745171" + "'", str5, "363567018486687918050111745171");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\ufffd(\025\ufffdy" + "'", str7, "\003\ufffd\ufffd\ufffd(\025\ufffdy");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        java.lang.String str9 = rSA1.decrypt("107");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.encrypt("40021916406662028876239884409");
        java.lang.String str17 = rSA1.decrypt("606785054325890502753303704230");
        java.lang.String str19 = rSA1.encrypt("57871922763596790861247573518");
        java.lang.String str21 = rSA1.encrypt("887549839668016186028927618781");
        java.lang.String str23 = rSA1.encrypt("7542022550");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001l" + "'", str3, "\001l");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "359" + "'", str5, "359");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "403" + "'", str7, "403");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2526243872" + "'", str15, "2526243872");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\r\ufffd\ufffd\000" + "'", str17, "\002\r\ufffd\ufffd\000");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "11010833291" + "'", str19, "11010833291");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10943967703" + "'", str21, "10943967703");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "8008421669" + "'", str23, "8008421669");
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("478");
        java.lang.String str11 = rSA1.encrypt("488");
        java.lang.String str13 = rSA1.decrypt("126");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.encrypt("\037\ufffd\ufffd\005\ufffd\ufffd\021\ufffd\ufffdm_");
        java.lang.String str19 = rSA1.encrypt("10");
        java.lang.String str21 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd| ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\001\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?O???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\027\030\024\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\ufffd\027\030\024\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\033D\030B\"\030\ufffd\ufffd\ufffd" + "'", str9, "\000\ufffd\033D\030B\"\030\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32838299936178513053830817805" + "'", str11, "32838299936178513053830817805");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\u077d@" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffd\u077d@");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "610158829264505781182701832318" + "'", str17, "610158829264505781182701832318");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "50195294325146724327277723648" + "'", str19, "50195294325146724327277723648");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "307101662412831088287962820431" + "'", str21, "307101662412831088287962820431");
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "830" + "'", str7, "830");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "822" + "'", str9, "822");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\0161\034\u04e6\ufffd\ufffd" + "'", str13, "\ufffd\0161\034\u04e6\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1509133254831045787344248683" + "'", str15, "1509133254831045787344248683");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\u0715\ufffd\ufffd\ufffd\ufffd6" + "'", str17, "\ufffd\u0715\ufffd\ufffd\ufffd\ufffd6");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("208642166923338001575549632629");
        java.lang.String str11 = rSA1.encrypt("460");
        java.lang.String str13 = rSA1.decrypt("663612053");
        java.lang.String str15 = rSA1.encrypt("\001\ufffd\ufffd\ufffdM");
        java.lang.String str17 = rSA1.encrypt("\002\032");
        java.lang.String str19 = rSA1.encrypt("\005\ufffd\372\ufffd\ufffd\ufffd\"\ufffd\ufffd\003");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "236" + "'", str3, "236");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "91" + "'", str7, "91");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "336" + "'", str9, "336");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "306" + "'", str11, "306");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "191" + "'", str15, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "5" + "'", str17, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "75" + "'", str19, "75");
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\037\ufffd\027\ufffd\ufffdq5");
        java.lang.String str13 = rSA1.decrypt("2635132195937723");
        java.lang.String str15 = rSA1.encrypt("\001\u064d\023d");
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd" + "'", str9, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "594173540" + "'", str11, "594173540");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd" + "'", str13, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1226187206" + "'", str15, "1226187206");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("1979640026");
        java.lang.String str13 = rSA1.encrypt("\001\ufffd\ufffd\ufffdJ");
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3209754943" + "'", str11, "3209754943");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "328220072" + "'", str13, "328220072");
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.decrypt("171");
        java.lang.String str13 = rSA1.decrypt("236");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("361024989561324804339721800250");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\035\024\ufffd\ufffd\003\f\ufffd\027\ufffd\006G" + "'", str11, "\006\035\024\ufffd\ufffd\003\f\ufffd\027\ufffd\006G");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n\u01ab<(\b\ufffd\r\ufffd\ufffd" + "'", str13, "\n\u01ab<(\b\ufffd\r\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\030\034\032\ufffd\ufffd\ufffd#" + "'", str17, "\030\034\032\ufffd\ufffd\ufffd#");
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("478");
        java.lang.String str15 = rSA1.encrypt("646");
        java.lang.String str17 = rSA1.decrypt("1547238756162089");
        java.lang.String str19 = rSA1.decrypt("1311484430155075");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4255087107" + "'", str13, "4255087107");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1204475962" + "'", str15, "1204475962");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str17, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\020N" + "'", str19, "\ufffd\020N");
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = rSA1.decrypt("\003a\035\ufffd\ufffd|\027\006\ufffd\000\ufffd\022\030");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?a??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("\025");
        java.lang.String str5 = rSA1.encrypt("\001Y");
        java.lang.String str7 = rSA1.decrypt("598335595765249845160178918537");
        java.lang.String str9 = rSA1.decrypt("230219258663613242517163403433");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\ufffd\ufffd\ufffd\ufffd\u1e0c\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"$\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8496905866" + "'", str3, "8496905866");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "9376087729" + "'", str5, "9376087729");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\016v" + "'", str7, "\002\ufffd\016v");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffd");
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("478");
        rSA1.generateKeys((int) '#');
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\t\001\ufffd\ufffdZ\003\ufffd\ufffd~");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "137" + "'", str5, "137");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7731200469" + "'", str9, "7731200469");
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("12856024970639395620261580662");
        java.lang.String str7 = rSA1.decrypt("5411392559");
        java.lang.String str9 = rSA1.encrypt("{");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("467661271651430950630646188690");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15201245388038200059522028450" + "'", str3, "15201245388038200059522028450");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3274337882363254845910713697" + "'", str5, "3274337882363254845910713697");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\036\ufffdW*v\020\ufffd\ufffd\ufffd" + "'", str7, "\036\ufffdW*v\020\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "28153056843" + "'", str9, "28153056843");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "270" + "'", str13, "270");
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("465270144019721");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("8");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\u077f\ufffd\ufffd");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "|" + "'", str3, "|");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "67" + "'", str5, "67");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "219" + "'", str7, "219");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd" + "'", str11, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "159" + "'", str13, "159");
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("110");
        java.lang.String str9 = rSA1.encrypt("642622633261757814741586969");
        java.lang.String str11 = rSA1.decrypt("333");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "357" + "'", str3, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"u\037\005\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\"u\037\005\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "20435759597320298841490337666" + "'", str9, "20435759597320298841490337666");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u02a3\032\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\u02a3\032\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("\003\001\ufffd\ufffd\ufffd\027\001\ufffd\u07a3");
        java.lang.String str15 = rSA1.encrypt("26507047337243548657799763260");
        rSA1.generateKeys((int) 'a');
        java.lang.String str19 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str21 = rSA1.encrypt("?");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str27 = rSA1.encrypt("\002\002\ufffd5;\016\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass28 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32" + "'", str7, "32");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "18" + "'", str9, "18");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4846510695" + "'", str13, "4846510695");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4808314487" + "'", str15, "4808314487");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "21613707268374976459008999692" + "'", str19, "21613707268374976459008999692");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "3938980639167" + "'", str21, "3938980639167");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "814" + "'", str27, "814");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\u07ba\ufffd\ufffd");
        java.lang.String str7 = rSA1.encrypt("\001\\\001\ufffd\ufffdv\021\ufffd");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "361702589682644132000486406951" + "'", str5, "361702589682644132000486406951");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "233405043785190850067707245092" + "'", str7, "233405043785190850067707245092");
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("136");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(\025\016S\031\ufffdI7\017\ufffd<" + "'", str3, "(\025\016S\031\ufffdI7\017\ufffd<");
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.decrypt("34089860651578007478246711177");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "560" + "'", str3, "560");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "907" + "'", str5, "907");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd" + "'", str7, "\003\ufffd");
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1611067079503803");
        java.lang.String str13 = rSA1.encrypt("475");
        java.lang.String str15 = rSA1.decrypt("236");
        java.lang.String str17 = rSA1.encrypt("\001\ufffd\ufffd\027\033gVf\003\032C\033\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "110" + "'", str7, "110");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "512" + "'", str11, "512");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "250" + "'", str13, "250");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L" + "'", str15, "L");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "124" + "'", str17, "124");
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\ufffd\u0795\ufffd$");
        java.lang.String str13 = rSA1.encrypt("380");
        java.lang.String str15 = rSA1.encrypt("587");
        java.lang.String str17 = rSA1.decrypt("342");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str21 = rSA1.decrypt("3063415839");
        java.lang.String str23 = rSA1.decrypt("154373708709881814069259883968");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002L" + "'", str5, "\002L");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\032" + "'", str7, "\032");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "164" + "'", str9, "164");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "763" + "'", str11, "763");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "231" + "'", str13, "231");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "69" + "'", str15, "69");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "^" + "'", str17, "^");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001B" + "'", str21, "\001B");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd" + "'", str23, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.encrypt("48524739602976");
        java.lang.String str13 = rSA1.decrypt("44797199491853112088");
        java.lang.String str15 = rSA1.encrypt("\001\ufffd\035\177;\006\ufffd\t\ufffd\ufffd\035\002");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t\ufffd\023\ufffd\ufffdN\t\ufffd" + "'", str7, "\t\ufffd\023\ufffd\ufffdN\t\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "199028685874492992421748545756" + "'", str11, "199028685874492992421748545756");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\000\ufffd\ufffd\ufffd\u076du\037j\035\020\r" + "'", str13, "\006\000\ufffd\ufffd\ufffd\u076du\037j\035\020\r");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "720691339949566510053621636377" + "'", str15, "720691339949566510053621636377");
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str15 = rSA1.encrypt("28278189249816783717227491423");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\002\033\ufffd\ufffd\ufffd\ufffd\ufffd<D]\020" + "'", str13, "\000\ufffd\002\033\ufffd\ufffd\ufffd\ufffd\ufffd<D]\020");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "8557876161298856296039960268" + "'", str15, "8557876161298856296039960268");
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.decrypt("34089860651578007478246711177");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("764080762608778560955290362258");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "346" + "'", str3, "346");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "558" + "'", str5, "558");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd" + "'", str7, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\026\ufffd\ufffd\023" + "'", str11, "\004\ufffd\026\ufffd\ufffd\023");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\007");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002:" + "'", str3, "\002:");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "31" + "'", str7, "31");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "28" + "'", str9, "28");
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.encrypt("\005\ufffd\ufffd\u0641\ufffd\037I\\");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("229296298363699");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "121" + "'", str5, "121");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\033" + "'", str11, "\002\033");
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("322134328841305854994100193972");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdB\"" + "'", str9, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdB\"");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd. \023\ufffd2" + "'", str17, "\001\ufffd. \023\ufffd2");
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str7 = rSA1.encrypt("393");
        java.lang.String str9 = rSA1.encrypt("\013lf\020\ufffd\034\ufffd\ufffd\ufffd\016\ufffdah");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "185" + "'", str3, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "184" + "'", str7, "184");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "18" + "'", str9, "18");
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.encrypt("49");
        java.lang.String str5 = rSA1.encrypt("\002\ufffd\ufffd\ufffd1");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "377" + "'", str3, "377");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "475" + "'", str5, "475");
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.decrypt("166");
        java.lang.String str13 = rSA1.encrypt("517");
        java.lang.String str15 = rSA1.encrypt("1349117468602420864739382143");
        java.lang.String str17 = rSA1.encrypt("\002\ufffd\u0548\ufffd\ufffd\u077e\ufffd\ufffde");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O" + "'", str5, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "416" + "'", str7, "416");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "287" + "'", str9, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\025" + "'", str11, "\025");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "305" + "'", str13, "305");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "491" + "'", str15, "491");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "479" + "'", str17, "479");
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("393");
        java.lang.String str7 = rSA1.decrypt("227022896246510918381181022856");
        java.lang.String str9 = rSA1.decrypt("8");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "222" + "'", str5, "222");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001b" + "'", str9, "\001b");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        java.lang.String str9 = rSA1.decrypt("143827611740296741825726282072");
        java.lang.String str11 = rSA1.encrypt("18882941853954095198627545224");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\f\ufffd\ufffd" + "'", str7, "\001\f\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\ufffd" + "'", str9, "\002\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4450344020" + "'", str11, "4450344020");
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\003\ufffd\006\ufffd\ufffd\001\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???J\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "225" + "'", str9, "225");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001v" + "'", str13, "\001v");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "182" + "'", str15, "182");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "102" + "'", str17, "102");
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("nq\003\ufffd");
        java.lang.String str9 = rSA1.decrypt("1210101131");
        java.lang.String str11 = rSA1.decrypt("238574385966381");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "17677010364322020985658592369" + "'", str5, "17677010364322020985658592369");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "855180605381072130207699339649" + "'", str7, "855180605381072130207699339649");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\b\ufffd\004\ufffd\ufffd\013{\002\ufffd\ufffd\ufffd\030" + "'", str9, "\b\ufffd\004\ufffd\ufffd\013{\002\ufffd\ufffd\ufffd\030");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd?\016\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffd?\016\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.decrypt("72");
        java.lang.String str9 = rSA1.decrypt("1234543668832");
        java.lang.String str11 = rSA1.decrypt("266");
        java.lang.String str13 = rSA1.encrypt("5959263759");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002A" + "'", str7, "\002A");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002(" + "'", str9, "\002(");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002+" + "'", str11, "\002+");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "303" + "'", str13, "303");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("511");
        java.lang.String str13 = rSA1.decrypt("4032293728");
        java.lang.String str15 = rSA1.encrypt("635");
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "230" + "'", str15, "230");
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        java.lang.String str15 = rSA1.encrypt("875");
        java.lang.String str17 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str19 = rSA1.decrypt("375222114829344077571796106442");
        java.lang.String str21 = rSA1.decrypt("64037679241642740792323135881");
        java.lang.String str23 = rSA1.decrypt("1273016665");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7X_Ln\r\004\ufffd\ufffd\ufffd\ufffd" + "'", str13, "7X_Ln\r\004\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "17209736600855545570785129203" + "'", str15, "17209736600855545570785129203");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "36724355547369596050209643533" + "'", str17, "36724355547369596050209643533");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\b\300\u0767" + "'", str19, "\ufffd\ufffd\ufffd\ufffd\b\300\u0767");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\t\ufffd\ufffd\u03a2\ufffd\ufffd" + "'", str21, "\t\ufffd\ufffd\u03a2\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffd\ufffd\372\024\ufffd\ufffd\u6d03" + "'", str23, "\ufffd\ufffd\372\024\ufffd\ufffd\u6d03");
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("92");
        java.lang.String str11 = rSA1.decrypt("499");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "950" + "'", str9, "950");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001m" + "'", str11, "\001m");
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        java.lang.String str9 = rSA1.decrypt("107");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\024" + "'", str3, "\024");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "242" + "'", str7, "242");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "q" + "'", str9, "q");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("131222746997146929506994054470");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "473" + "'", str5, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("18");
        java.math.BigInteger bigInteger4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = rSA1.encrypt(bigInteger4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "443" + "'", str3, "443");
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("1075488919");
        java.lang.String str15 = rSA1.encrypt("334531945748092781506056629291");
        java.lang.String str17 = rSA1.decrypt("4525747289");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "53685093359717851142847870812" + "'", str7, "53685093359717851142847870812");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\001" + "'", str13, "\001\001");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "427" + "'", str15, "427");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\002" + "'", str17, "\002\002");
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("z");
        java.lang.String str9 = rSA1.encrypt("251809012515860");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001G" + "'", str5, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "120" + "'", str7, "120");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "700" + "'", str9, "700");
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("29375592229625247748383763465");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "149" + "'", str7, "149");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str5 = rSA1.encrypt("\005\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str9 = rSA1.encrypt("B");
        java.lang.String str11 = rSA1.decrypt("22549721295290863866320683761");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28981188104517593137262407802" + "'", str3, "28981188104517593137262407802");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "534106075738442489169616324474" + "'", str5, "534106075738442489169616324474");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1252332576" + "'", str9, "1252332576");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffdWA" + "'", str11, "\000\ufffd\ufffdWA");
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.decrypt("19381198390747190176495422326");
        java.lang.String str15 = rSA1.decrypt("30");
        java.lang.String str17 = rSA1.encrypt("107");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "547" + "'", str9, "547");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\f" + "'", str13, "\001\f");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "@" + "'", str15, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "288" + "'", str17, "288");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\005\ufffd\ufffd\n\ufffd\ufffd*");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("907");
        java.lang.String str17 = rSA1.encrypt("36610813181912391220010029849");
        java.lang.String str19 = rSA1.encrypt("7405334988557184101886694284");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "21630583096067226058470328040" + "'", str7, "21630583096067226058470328040");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "436648581318439042656557618806" + "'", str11, "436648581318439042656557618806");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "52645620152203942375" + "'", str15, "52645620152203942375");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "559018344806529149953671129609" + "'", str17, "559018344806529149953671129609");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "403713242655684227562910960098" + "'", str19, "403713242655684227562910960098");
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.encrypt("262");
        java.lang.String str13 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\017\ufffd.\021\ufffd\ufffd");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "63858695492926928274469196354" + "'", str5, "63858695492926928274469196354");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "169984432083088506569362856093" + "'", str7, "169984432083088506569362856093");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\u0162\ufffd" + "'", str9, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\u0162\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "430184606871571490689058734631" + "'", str11, "430184606871571490689058734631");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "257081617886943529740399111419" + "'", str13, "257081617886943529740399111419");
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\u0662\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\031" + "'", str7, "\001\ufffd\ufffd\031");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3475199753" + "'", str9, "3475199753");
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
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
        java.lang.String str25 = rSA1.encrypt("\ufffd\032\ufffd\ufffd\u01e4");
        java.lang.String str27 = rSA1.encrypt("\000\ufffd\u0555\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "z" + "'", str5, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "646" + "'", str7, "646");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "693" + "'", str9, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffdL-\016\ufffd\002\ufffd\ufffd@+\031" + "'", str13, "\ufffdL-\016\ufffd\002\ufffd\ufffd@+\031");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\177\000\ufffd\ufffd" + "'", str17, "\002\ufffd\177\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "114547600544538279174076814826" + "'", str21, "114547600544538279174076814826");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\006\036\ufffd\016Eh\f\ufffd\ufffd\007\ufffd" + "'", str23, "\006\036\ufffd\016Eh\f\ufffd\ufffd\007\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "200420954964914723001172097218" + "'", str25, "200420954964914723001172097218");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "253411405569598301839187895347" + "'", str27, "253411405569598301839187895347");
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\005\b\ufffd\ufffd\ufffd\"\ufffd\347\177\ufffd\026");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\n\ufffd\ufffd^\034\ufffd\ufffd?" + "'", str7, "\000\ufffd\n\ufffd\ufffd^\034\ufffd\ufffd?");
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str7 = rSA1.encrypt("393");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "260" + "'", str7, "260");
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("11716232800583690748559256041");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.encrypt("375222114829344077571796106442");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "299618005893157767956794962567" + "'", str5, "299618005893157767956794962567");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "201051903350252839001446639107" + "'", str7, "201051903350252839001446639107");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\016\ufffd\u0179\ufffd\ufffd\024\ufffd\ufffd1" + "'", str9, "\002\016\ufffd\u0179\ufffd\ufffd\024\ufffd\ufffd1");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\017\ufffd[\021\023\ufffd\ufffd\ufffd" + "'", str11, "\ufffd\017\ufffd[\021\023\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4" + "'", str19, "4");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("295655242858698839782451220669");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\002\ufffdO\\");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?i?O\\\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd^\037\003\u9c99\ufffdT" + "'", str13, "\ufffd\ufffd^\037\003\u9c99\ufffdT");
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("18");
        java.lang.String str5 = rSA1.decrypt("198");
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "243" + "'", str3, "243");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "~" + "'", str5, "~");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("\025");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("331");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4084101" + "'", str3, "4084101");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "625923936935144435112081277194" + "'", str7, "625923936935144435112081277194");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("314");
        java.lang.String str5 = rSA1.encrypt("875");
        java.lang.String str7 = rSA1.encrypt("87410427340921");
        java.lang.String str9 = rSA1.decrypt("4330178492");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "14568638669711135179104658352" + "'", str3, "14568638669711135179104658352");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "460360816835408392364124868688" + "'", str5, "460360816835408392364124868688");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "546840729987813838412516009888" + "'", str7, "546840729987813838412516009888");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004IikI5\030\ufffd\022\ufffd\377" + "'", str9, "\004IikI5\030\ufffd\022\ufffd\377");
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
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
        java.lang.String str21 = rSA1.encrypt("803");
        java.lang.String str23 = rSA1.encrypt("26483223552903068015403589737");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "285" + "'", str7, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "294" + "'", str9, "294");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd|\b\ufffd\ufffd\ufffd\ufffdT\034" + "'", str13, "\ufffd\ufffd\ufffd|\b\ufffd\ufffd\ufffd\ufffdT\034");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "803676540964971" + "'", str17, "803676540964971");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1541344984" + "'", str21, "1541344984");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "775405896" + "'", str23, "775405896");
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("478");
        java.lang.String str15 = rSA1.decrypt("45739559234940083783638906525");
        java.lang.String str17 = rSA1.encrypt("\025\ufffd\ufffd\ufffd\t\u04ab\ufffd\u0124F");
        java.lang.String str19 = rSA1.encrypt("\ufffd\ufffd\ufffd\u077f\ufffd\ufffd");
        java.lang.String str21 = rSA1.decrypt("1417366819");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5038019032" + "'", str13, "5038019032");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\001\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1361492981" + "'", str17, "1361492981");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "3962747528" + "'", str19, "3962747528");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001[C1`" + "'", str21, "\001[C1`");
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("208424615175295461924453936343");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffdZ\033\ufffd\u06a9\ufffd\013L");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4e\006\017\024\ufffd\ufffd\u0570\b" + "'", str9, "4e\006\017\024\ufffd\ufffd\u0570\b");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "261283293587280437777091121914" + "'", str11, "261283293587280437777091121914");
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("478");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) 'a');
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "96" + "'", str5, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "117" + "'", str7, "117");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "137" + "'", str11, "137");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.decrypt("166");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str15 = rSA1.decrypt("651940208582405295700948505246");
        java.lang.String str17 = rSA1.encrypt("Vl]#{\177\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdI" + "'", str15, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdI");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "532937816171935839296660778403" + "'", str17, "532937816171935839296660778403");
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "185" + "'", str3, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "266" + "'", str5, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "a\024\ufffd\ufffd" + "'", str9, "a\024\ufffd\ufffd");
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.encrypt("\006");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "110" + "'", str7, "110");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "703" + "'", str11, "703");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7776" + "'", str17, "7776");
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.encrypt("9346881411915179890603869120");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "63354916294527133197076173887" + "'", str5, "63354916294527133197076173887");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004\u92e6\ufffd\ufffdp\017\ufffd" + "'", str7, "\004\u92e6\ufffd\ufffdp\017\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "66530913680567209221714984695" + "'", str9, "66530913680567209221714984695");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "187446603460399631374879282166" + "'", str11, "187446603460399631374879282166");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1309970753" + "'", str15, "1309970753");
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("3066983185");
        java.lang.String str7 = rSA1.decrypt("3077056399");
        java.lang.String str9 = rSA1.encrypt("6103515625");
        java.lang.String str11 = rSA1.decrypt("495729105335719923501365928620");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "417" + "'", str5, "417");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O" + "'", str7, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8" + "'", str9, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001O" + "'", str11, "\001O");
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("|");
        rSA1.generateKeys((int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001f" + "'", str3, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$j\001\ufffd" + "'", str7, "$j\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "29316250624" + "'", str11, "29316250624");
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\005\ufffd\ufffd\n\ufffd\ufffd*");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("907");
        java.lang.String str17 = rSA1.encrypt("36610813181912391220010029849");
        java.lang.String str19 = rSA1.encrypt("7405334988557184101886694284");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "287" + "'", str3, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5999679567429776201084290538" + "'", str7, "5999679567429776201084290538");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "20281572059680115027210160431" + "'", str11, "20281572059680115027210160431");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "76225962439650007256700278409" + "'", str15, "76225962439650007256700278409");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "191670212441467511547404223871" + "'", str17, "191670212441467511547404223871");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "148382648717455579919894493509" + "'", str19, "148382648717455579919894493509");
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("24728158503917487987839420576");
        java.lang.String str9 = rSA1.encrypt("76953254708816336608130262493");
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\ufffd\006X\026\ufffd");
        java.lang.String str13 = rSA1.encrypt("37761667692440245568");
        java.lang.String str15 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\u0732w");
        java.lang.String str17 = rSA1.encrypt("8000");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\t" + "'", str3, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\030" + "'", str7, "\001\ufffd\ufffd\030");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1514757939" + "'", str9, "1514757939");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2783260014" + "'", str11, "2783260014");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4414323059" + "'", str13, "4414323059");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "5557753385" + "'", str15, "5557753385");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1188921251" + "'", str17, "1188921251");
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\ufffd\u0795\ufffd$");
        java.lang.String str13 = rSA1.encrypt("380");
        java.lang.String str15 = rSA1.encrypt("587");
        java.lang.String str17 = rSA1.decrypt("1102137549");
        java.lang.String str19 = rSA1.decrypt("2633919501113675109991304621");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "160" + "'", str9, "160");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "236" + "'", str11, "236");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "434" + "'", str13, "434");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "258" + "'", str15, "258");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2" + "'", str17, "2");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("z");
        java.lang.String str9 = rSA1.encrypt("\b\ufffdA3\033\u0459\ufffd\ufffd\030\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("292429178019428864799183198942");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001G" + "'", str5, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "120" + "'", str7, "120");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "538" + "'", str9, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("305");
        java.lang.String str7 = rSA1.encrypt("543355786218422");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\007\ufffd\ufffd\ufffdF" + "'", str3, "\007\ufffd\ufffd\ufffdF");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2656687536976983" + "'", str5, "2656687536976983");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "517940404696593" + "'", str7, "517940404696593");
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("334584945244912143283576554504");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\036\ufffd\020\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\002\ufffd\036\ufffd\020\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t\ufffd\u01f3\u01fd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\t\ufffd\u01f3\u01fd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str9 = rSA1.encrypt("\006]l\002\ufffd\000\ufffd");
        java.lang.String str11 = rSA1.encrypt("257394135226060934765222613463");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20" + "'", str3, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "414016738267642624110812446230" + "'", str9, "414016738267642624110812446230");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "588471892783496030810573838331" + "'", str11, "588471892783496030810573838331");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "674312106972597554877343209213" + "'", str13, "674312106972597554877343209213");
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        java.lang.String str9 = rSA1.decrypt("8");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "397890601328028645969086393645" + "'", str5, "397890601328028645969086393645");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8241264822143" + "'", str7, "8241264822143");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\177\ufffdQ\005\ufffd\ufffdx\006\ufffd\ufffd\ufffd" + "'", str9, "\004\177\ufffdQ\005\ufffd\ufffdx\006\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("288");
        java.lang.String str15 = rSA1.decrypt("377");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str19 = rSA1.decrypt("35650010007221349888");
        java.lang.String str21 = rSA1.encrypt("\002H");
        java.lang.String str23 = rSA1.decrypt("164042049245279241614334625504");
        java.lang.String str25 = rSA1.encrypt("620232298428776661101045332976");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "510508996908794292191886213738" + "'", str11, "510508996908794292191886213738");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "236822508267619092676756862917" + "'", str13, "236822508267619092676756862917");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd\ufffd\u047d\ufffd\ufffdt" + "'", str15, "\ufffd\ufffd\ufffd\u047d\ufffd\ufffdt");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\020\ufffda" + "'", str19, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\020\ufffda");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "67930409959424" + "'", str21, "67930409959424");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002\ufffd\033@\"\b\ufffd\ufffd\ufffd" + "'", str23, "\002\ufffd\033@\"\b\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "351549955515206687388436796249" + "'", str25, "351549955515206687388436796249");
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.decrypt("771929004");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "B" + "'", str5, "B");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\b" + "'", str7, "\001\b");
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("32");
        java.lang.String str9 = rSA1.decrypt("150463785061299561387815225633");
        rSA1.generateKeys((int) 'a');
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002!" + "'", str3, "\002!");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002/" + "'", str7, "\002/");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.encrypt("1605419445290886");
        java.lang.String str7 = rSA1.encrypt("\001\002\ufffdQ.");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "71" + "'", str5, "71");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "137" + "'", str7, "137");
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.decrypt("34089860651578007478246711177");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "566" + "'", str3, "566");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "605" + "'", str5, "605");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003*" + "'", str7, "\003*");
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("3077056399");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.decrypt("533820506");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "473" + "'", str5, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1796556399" + "'", str11, "1796556399");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u0532`" + "'", str13, "\u0532`");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        java.lang.String str9 = rSA1.encrypt("4839922246");
        java.lang.String str11 = rSA1.encrypt("\177\ufffd\ufffd5");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "405721387434959355662150003472" + "'", str5, "405721387434959355662150003472");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "26012764767708918581052067967" + "'", str7, "26012764767708918581052067967");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "104006517897960903691747050376" + "'", str9, "104006517897960903691747050376");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "418045182798280368775468367555" + "'", str11, "418045182798280368775468367555");
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("478");
        java.lang.String str15 = rSA1.encrypt("646");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5021898471" + "'", str13, "5021898471");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3351227239" + "'", str15, "3351227239");
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        java.lang.String str9 = rSA1.encrypt("48241217274650060621544778321");
        java.lang.String str11 = rSA1.encrypt("315");
        java.lang.String str13 = rSA1.encrypt("10317982175");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "310646275936939618733963646262" + "'", str5, "310646275936939618733963646262");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd" + "'", str7, "\006\ufffd\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "145166489354413397885111708949" + "'", str9, "145166489354413397885111708949");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "775580502038877507107390022150" + "'", str11, "775580502038877507107390022150");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "709924782928029079344845657844" + "'", str13, "709924782928029079344845657844");
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
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
        java.lang.String str21 = rSA1.decrypt("67274197142905937831872151801");
        rSA1.generateKeys((int) '4');
        java.lang.String str25 = rSA1.encrypt("\007\ufffd\ufffd\u0752\ufffd\ufffd\u0675\ufffd");
        java.lang.String str27 = rSA1.encrypt("910748699");
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.decrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O" + "'", str5, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "416" + "'", str7, "416");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "287" + "'", str9, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\u051d\ufffd\ufffd\ufffd\035;+" + "'", str13, "\ufffd\u051d\ufffd\ufffd\ufffd\035;+");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\0072At>zz" + "'", str17, "\0072At>zz");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "547278606679635" + "'", str19, "547278606679635");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\006\ufffd\ufffd\u0331" + "'", str21, "\006\ufffd\ufffd\u0331");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "642491163635604" + "'", str25, "642491163635604");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "643975540872535" + "'", str27, "643975540872535");
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str11 = rSA1.encrypt("7882021201");
        java.lang.String str13 = rSA1.encrypt("37695224586924992221081514034");
        java.lang.String str15 = rSA1.encrypt("3962635602");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "z" + "'", str5, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "646" + "'", str7, "646");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9" + "'", str9, "9");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "803" + "'", str11, "803");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "815" + "'", str13, "815");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "26" + "'", str15, "26");
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("168");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd\f\r\ufffd\021x");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\177" + "'", str3, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\ufffd\t" + "'", str7, "\000\ufffd\ufffd\ufffd\t");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8334274059" + "'", str9, "8334274059");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "12969654796" + "'", str11, "12969654796");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "608191077729400322151818069431" + "'", str15, "608191077729400322151818069431");
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.encrypt("48524739602976");
        java.lang.String str13 = rSA1.decrypt("44797199491853112088");
        java.lang.String str15 = rSA1.decrypt("1333165682");
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\005\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "45241377133994331626460318897" + "'", str11, "45241377133994331626460318897");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd<5ar\003\ufffd\f" + "'", str13, "\000\ufffd\ufffd\ufffd<5ar\003\ufffd\f");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004G\021\ufffd\177\ufffd\ufffdo\017Q\005\ufffd{" + "'", str15, "\004G\021\ufffd\177\ufffd\ufffdo\017Q\005\ufffd{");
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("#");
        java.lang.String str11 = rSA1.decrypt("1");
        java.lang.String str13 = rSA1.encrypt("1249781321");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "30472044180270770162290916190" + "'", str5, "30472044180270770162290916190");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\026\006\n\ufffd " + "'", str7, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\026\006\n\ufffd ");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "52521875" + "'", str9, "52521875");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "606149645512911438195863498364" + "'", str13, "606149645512911438195863498364");
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("\025");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\002\ufffd\ufffdN");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?S??N\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4084101" + "'", str3, "4084101");
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1611067079503803");
        java.lang.String str13 = rSA1.encrypt("584282792217330789222543235577");
        java.lang.String str15 = rSA1.decrypt("219");
        java.lang.String str17 = rSA1.encrypt("16156209496766550638227152486");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "473" + "'", str5, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "167" + "'", str7, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "438" + "'", str11, "438");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "558" + "'", str13, "558");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001W" + "'", str15, "\001W");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "215" + "'", str17, "215");
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("11716232800583690748559256041");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.encrypt("375222114829344077571796106442");
        java.lang.String str21 = rSA1.encrypt("\003\005\ufffd\ufffd9)A\001\ufffd\ufffd");
        java.lang.String str23 = rSA1.decrypt("284848575057039318277050302485");
        rSA1.generateKeys((int) '#');
        java.lang.String str27 = rSA1.encrypt("\t\ufffd\ufffd\022\ufffd\ufffd\033\u073f");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "631131695781256307778546968835" + "'", str5, "631131695781256307778546968835");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "311304005122333327335589871600" + "'", str7, "311304005122333327335589871600");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd\ufffd\004\ufffd\ufffd\ufffdY" + "'", str9, "\006\ufffd\ufffd\ufffd\004\ufffd\ufffd\ufffdY");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\033\ufffd\ufffd\ufffd\ufffd/X\032\ufffd>Hf" + "'", str11, "\003\033\ufffd\ufffd\ufffd\ufffd/X\032\ufffd>Hf");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "152" + "'", str19, "152");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "288" + "'", str21, "288");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd" + "'", str23, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "4536164586" + "'", str27, "4536164586");
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.decrypt("265482618753364");
        java.lang.String str19 = rSA1.encrypt("\u01ac\ufffd\ufffd\ufffd\031B");
        java.lang.String str21 = rSA1.decrypt("277285434111556256763152259316");
        java.lang.String str23 = rSA1.encrypt("3201999688");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "134" + "'", str7, "134");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002D\005\u026e\ufffd\ufffd\ufffd\u037f\ufffd" + "'", str17, "\002D\005\u026e\ufffd\ufffd\ufffd\u037f\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "421822535901783874037293490951" + "'", str19, "421822535901783874037293490951");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\004\ufffd\ufffd\037\ufffd\ufffd\ufffd\u0659\003" + "'", str21, "\004\ufffd\ufffd\037\ufffd\ufffd\ufffd\u0659\003");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "373463446715639742647288657020" + "'", str23, "373463446715639742647288657020");
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "267" + "'", str5, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9" + "'", str7, "9");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32" + "'", str11, "32");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000" + "'", str13, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\005" + "'", str17, "\001\005");
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("3165379325");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0014" + "'", str5, "\0014");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'" + "'", str7, "'");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001C" + "'", str9, "\001C");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("160015912349121428858268699636");
        java.lang.String str11 = rSA1.decrypt("3101364196875");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Y" + "'", str3, "Y");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "334889622902053102433863579834" + "'", str9, "334889622902053102433863579834");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\0048\"\ufffd\ufffdHR\032\ufffdJPP" + "'", str11, "\0048\"\ufffd\ufffdHR\032\ufffdJPP");
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
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
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "y" + "'", str7, "y");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "84219857" + "'", str13, "84219857");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1542886564" + "'", str15, "1542886564");
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("|");
        java.lang.String str13 = rSA1.decrypt("6203695486");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("296");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\177" + "'", str3, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001d\b\ufffd\ufffd" + "'", str7, "\001d\b\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "29316250624" + "'", str11, "29316250624");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ub1a3\ufffd\ufffdy" + "'", str13, "\000\ub1a3\ufffd\ufffdy");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\026" + "'", str17, "\026");
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.encrypt("490");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("1757850692");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.decrypt("2806475544");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1666157100" + "'", str3, "1666157100");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\003\ufffdj\004\ufffdN" + "'", str7, "\003\ufffd\003\ufffdj\004\ufffdN");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        java.lang.String str13 = rSA1.decrypt("35583402576551630221");
        java.lang.String str15 = rSA1.encrypt("11716232800583690748559256041");
        java.lang.String str17 = rSA1.encrypt("604");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "616" + "'", str7, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "703" + "'", str11, "703");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "N" + "'", str13, "N");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "371" + "'", str15, "371");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "632" + "'", str17, "632");
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.encrypt("|");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\004\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?Y&??B?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001f" + "'", str3, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1906624" + "'", str13, "1906624");
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.decrypt("279");
        java.lang.String str11 = rSA1.decrypt("177");
        java.lang.String str13 = rSA1.encrypt("267");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.decrypt("449976981647208350843955950310");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\002\ufffdA\n\ufffdV");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??A??V\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "195" + "'", str7, "195");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\037" + "'", str9, "\001\037");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001A" + "'", str11, "\001A");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "198" + "'", str13, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffd\033\ufffd\ufffd\ufffd\ufffd!\024" + "'", str17, "\003\ufffd\ufffd\033\ufffd\ufffd\ufffd\ufffd!\024");
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.decrypt("171");
        java.lang.String str13 = rSA1.encrypt("g");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("361076758876107404816564116528");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "50334980593118017863872015613" + "'", str7, "50334980593118017863872015613");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "50334980593118017863872015613" + "'", str9, "50334980593118017863872015613");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\u0182\ufffd\ufffd/\177" + "'", str11, "\004\u0182\ufffd\ufffd/\177");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "122987386542487" + "'", str13, "122987386542487");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "709" + "'", str17, "709");
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.decrypt("279");
        java.lang.String str11 = rSA1.decrypt("177");
        java.lang.String str13 = rSA1.encrypt("267");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("423");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "62" + "'", str7, "62");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001k" + "'", str9, "\001k");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "46" + "'", str13, "46");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "376" + "'", str17, "376");
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.decrypt("334064745499191746012789729451");
        java.lang.String str15 = rSA1.decrypt("2951232610");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\005\ufffd\ufffd\u0274VU1\004\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?L?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "z" + "'", str5, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "646" + "'", str7, "646");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "693" + "'", str9, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffdRk" + "'", str13, "\ufffdRk");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\035\ufffd" + "'", str15, "\\\035\ufffd");
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("\002E");
        java.lang.String str13 = rSA1.encrypt("412855490441922175904469813661");
        java.lang.String str15 = rSA1.encrypt("893715642");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\005\ufffd[ " + "'", str7, "\001\005\ufffd[ ");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "196122941" + "'", str11, "196122941");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2758303779640148" + "'", str13, "2758303779640148");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "755893763387065" + "'", str15, "755893763387065");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.decrypt("625554684732559581014312991005");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "w\004k\021" + "'", str13, "w\004k\021");
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("1208902895495334527");
        java.lang.String str9 = rSA1.encrypt("58");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.decrypt("6241420964");
        java.lang.String str15 = rSA1.encrypt("29120983423639189443457020880");
        java.lang.String str17 = rSA1.decrypt("83");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1413268572686253" + "'", str7, "1413268572686253");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2146761983220167" + "'", str9, "2146761983220167");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\ufffd\013\ufffd\002\ufffd\ufffd\ufffd" + "'", str13, "\b\ufffd\013\ufffd\002\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "604383815063090340833050730787" + "'", str15, "604383815063090340833050730787");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\b\007\ufffd\ufffd\ufffd\b\ufffd\ufffd\ufffd" + "'", str17, "\b\007\ufffd\ufffd\ufffd\b\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("\002\u028e\r\ufffd\ufffd\f\ufffd\ufffd");
        java.lang.String str13 = rSA1.decrypt("211");
        java.lang.String str15 = rSA1.encrypt("\004\u05b9\ufffd\001Yt\035\ufffd\u04968");
        java.lang.String str17 = rSA1.encrypt("186");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "50334980593118017863872015613" + "'", str7, "50334980593118017863872015613");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "50334980593118017863872015613" + "'", str9, "50334980593118017863872015613");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "257278368909703578533775434391" + "'", str11, "257278368909703578533775434391");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd<t\007\ufffd6" + "'", str13, "\003\ufffd\ufffd\ufffd\ufffd<t\007\ufffd6");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "292911122207053458766556958034" + "'", str15, "292911122207053458766556958034");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "682464984841415726627621705562" + "'", str17, "682464984841415726627621705562");
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("1611154414937711");
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("478");
        java.lang.String str11 = rSA1.encrypt("488");
        java.lang.String str13 = rSA1.decrypt("126");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.encrypt("\037\ufffd\ufffd\005\ufffd\ufffd\021\ufffd\ufffdm_");
        java.lang.String str19 = rSA1.encrypt("2751494989");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\u039f\ufffd\ufffd\u0562\ufffd" + "'", str7, "\ufffd\u039f\ufffd\ufffd\u0562\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d\023\ufffd\016\ufffd\ufffd\u9434\ufffd\ufffd" + "'", str9, "d\023\ufffd\016\ufffd\ufffd\u9434\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "27796548576748101703019534519" + "'", str11, "27796548576748101703019534519");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd5\031\037\ufffd\ufffd\013\ufffd\ufffd" + "'", str13, "\004\ufffd5\031\037\ufffd\ufffd\013\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "761962486474090255330639231533" + "'", str17, "761962486474090255330639231533");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "564338588720932761035399523401" + "'", str19, "564338588720932761035399523401");
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '4');
        java.lang.String str9 = rSA1.encrypt("206");
        java.lang.String str11 = rSA1.encrypt("226208872463543249023298211472");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("152900825838224951269381371407");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1789450002025735" + "'", str9, "1789450002025735");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1661102683969686" + "'", str11, "1661102683969686");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "295789769189361899303777440832" + "'", str15, "295789769189361899303777440832");
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("1979640026");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "42" + "'", str7, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "589509880" + "'", str11, "589509880");
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("255635653807356729488134260102");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd*" + "'", str3, "\001\ufffd\ufffd\ufffd\ufffd*");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffdKZQ" + "'", str7, "\000\ufffdKZQ");
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\ufffd\ufffd\ufffd\036\ufffd\ufffd\ufffd@");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"d??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002]g\"\0258\023\ufffd\ufffd\ufffd\ufffdR" + "'", str9, "\002]g\"\0258\023\ufffd\ufffd\ufffd\ufffdR");
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("29358506122049777298420844854");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\004");
        java.lang.String str13 = rSA1.encrypt("214");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "66" + "'", str11, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("292429178019428864799183198942");
        java.lang.String str17 = rSA1.encrypt("\006");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\022\u0318*R5?" + "'", str11, "\002\ufffd\ufffd\022\u0318*R5?");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\022\ufffd\ufffd\ufffd" + "'", str15, "\002\ufffd\022\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "216" + "'", str17, "216");
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
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
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "209" + "'", str3, "209");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "51" + "'", str7, "51");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "310" + "'", str9, "310");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "113733959372677875124468323380" + "'", str13, "113733959372677875124468323380");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "384832237466769475359354043012" + "'", str15, "384832237466769475359354043012");
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        java.lang.String str15 = rSA1.encrypt("875");
        java.lang.String str17 = rSA1.encrypt("769813422797759594890249642976");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffdIt" + "'", str13, "\000\ufffd\ufffd\ufffd\ufffdIt");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6649029928001853538489890842" + "'", str15, "6649029928001853538489890842");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "20889185360781078525405819147" + "'", str17, "20889185360781078525405819147");
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("253");
        java.lang.String str13 = rSA1.decrypt("450766669594624");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("8261899730695270217127585390");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\0013" + "'", str13, "\0013");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\022^C\013\ufffd\ufffdC@" + "'", str17, "\ufffd\ufffd\022^C\013\ufffd\ufffdC@");
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("307707995715569958842130375");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str9 = rSA1.encrypt(":");
        java.lang.String str11 = rSA1.encrypt("10533540197701377965021536254");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\017\ufffd\ufffdy" + "'", str3, "\017\ufffd\ufffdy");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "559226328" + "'", str5, "559226328");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3" + "'", str9, "3");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "20" + "'", str11, "20");
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("904879835");
        java.lang.String str11 = rSA1.encrypt("39");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\177" + "'", str3, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\000" + "'", str7, "\000\ufffd\ufffd\000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7834611471" + "'", str9, "7834611471");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3343795923" + "'", str11, "3343795923");
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("488268062867093539922400418770");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd'\027d");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\002P");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?P\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "142" + "'", str5, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "516" + "'", str9, "516");
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("\003\001\ufffd\ufffd\ufffd\027\001\ufffd\u07a3");
        java.lang.String str15 = rSA1.encrypt("26507047337243548657799763260");
        rSA1.generateKeys((int) 'a');
        java.lang.String str19 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\023\031\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??y\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "399038037" + "'", str13, "399038037");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1916075749" + "'", str15, "1916075749");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "36219500169288125938519006800" + "'", str19, "36219500169288125938519006800");
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("495");
        java.lang.String str9 = rSA1.encrypt("695");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "239218449264214" + "'", str7, "239218449264214");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1607250657761071" + "'", str9, "1607250657761071");
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\037\ufffd\027\ufffd\ufffdq5");
        java.lang.String str13 = rSA1.decrypt("187");
        java.lang.String str15 = rSA1.encrypt("32");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1313024202" + "'", str11, "1313024202");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd-" + "'", str13, "\ufffd-");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1063037675" + "'", str15, "1063037675");
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
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
        java.lang.String str23 = rSA1.decrypt("136");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25125442025283376687045271535" + "'", str11, "25125442025283376687045271535");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35650010007221349888" + "'", str13, "35650010007221349888");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd`\004$4\017\ufffd\002\ufffd8" + "'", str15, "\001\ufffd`\004$4\017\ufffd\002\ufffd8");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\177\ufffd\t\002\ufffd\ufffd\ufffd;B" + "'", str17, "\002\177\ufffd\t\002\ufffd\ufffd\ufffd;B");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "204877301113577184772768049428" + "'", str19, "204877301113577184772768049428");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "149146731054325387238239342894" + "'", str21, "149146731054325387238239342894");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\007\ufffd\ufffd\f\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str23, "\007\ufffd\ufffd\f\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("657405682890675031523377180014");
        java.lang.String str9 = rSA1.decrypt("376230106637114381994083478121");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\032" + "'", str3, "\002\032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "186" + "'", str7, "186");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\007" + "'", str9, "\002\007");
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\002X\000\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?X?9l??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002!" + "'", str3, "\002!");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\ufffd\037\ufffd\n\ufffd\ufffd" + "'", str9, "\005\ufffd\ufffd\ufffd\037\ufffd\n\ufffd\ufffd");
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str5 = rSA1.encrypt("\005\ufffd\ufffd\ufffd");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "102654411159260889513888183908" + "'", str3, "102654411159260889513888183908");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483679472944856007159150031448" + "'", str5, "483679472944856007159150031448");
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("18");
        java.lang.String str5 = rSA1.encrypt("839781259776750366986808080725");
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "338" + "'", str3, "338");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "446" + "'", str5, "446");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("958913602649032");
        java.lang.String str13 = rSA1.decrypt("322206248827960928498686998334");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "267" + "'", str5, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9" + "'", str7, "9");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001u" + "'", str13, "\001u");
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("5407583147");
        java.lang.String str11 = rSA1.encrypt("6151599162");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\t" + "'", str5, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "788" + "'", str7, "788");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "257" + "'", str9, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "380" + "'", str11, "380");
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("465270144019721");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("8");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\u077f\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001l" + "'", str3, "\001l");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "359" + "'", str5, "359");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "179" + "'", str7, "179");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002" + "'", str11, "\002");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "231" + "'", str13, "231");
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        java.lang.String str9 = rSA1.decrypt("107");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000" + "'", str3, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "935" + "'", str5, "935");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "365" + "'", str7, "365");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\034" + "'", str9, "\034");
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\007\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("780550156903929067161254379605");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "268" + "'", str7, "268");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "216" + "'", str9, "216");
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
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
        java.lang.String str23 = rSA1.encrypt("30822019617233960135898227164");
        java.lang.String str25 = rSA1.decrypt("326798441013952621039777753944");
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffd\022\003\ufffd\ufffdU4C" + "'", str17, "\003\ufffd\ufffd\022\003\ufffd\ufffdU4C");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "563519358410783181618140271159" + "'", str19, "563519358410783181618140271159");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "369848546495029533725536591765" + "'", str21, "369848546495029533725536591765");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1030509888023135072107119471648" + "'", str23, "1030509888023135072107119471648");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd\u024b\ufffd\ufffd\ufffdr>%" + "'", str25, "\t\ufffd\ufffd\ufffd\ufffd\u024b\ufffd\ufffd\ufffdr>%");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        java.lang.String str15 = rSA1.encrypt("875");
        java.lang.String str17 = rSA1.decrypt("202750866110673");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "z" + "'", str5, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "646" + "'", str7, "646");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "693" + "'", str9, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\u02d5\ufffd\u025c\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\u02d5\ufffd\u025c\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35468124946775613774156127125" + "'", str15, "35468124946775613774156127125");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd&\"\ufffd\006\ufffd)7.\r" + "'", str17, "\000\ufffd&\"\ufffd\006\ufffd)7.\r");
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("\0020O\030\007");
        java.lang.String str15 = rSA1.decrypt("706279662");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10659636378321073562680472589" + "'", str13, "10659636378321073562680472589");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\013\ufffd\u01a4\ufffd\ufffd\ufffd" + "'", str15, "\013\ufffd\u01a4\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("\ufffd\ufffdI\023\ufffd\ufffd+");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\ufffd\ufffd/" + "'", str3, "\001\ufffd\ufffd\ufffd/");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "413" + "'", str7, "413");
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("\002\ufffd");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str19 = rSA1.encrypt("618");
        java.lang.String str21 = rSA1.decrypt("384868008312393945810680244781");
        java.lang.String str23 = rSA1.encrypt("\001\ufffdl`");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001G" + "'", str5, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "509" + "'", str7, "509");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8" + "'", str9, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "15" + "'", str15, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "68" + "'", str19, "68");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\025" + "'", str21, "\025");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "236" + "'", str23, "236");
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.decrypt("25361813327098706573674400856");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "142" + "'", str5, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "393" + "'", str7, "393");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001T" + "'", str9, "\001T");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.encrypt("1605419445290886");
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5" + "'", str3, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "111" + "'", str5, "111");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("478");
        java.lang.String str15 = rSA1.decrypt("45739559234940083783638906525");
        java.lang.String str17 = rSA1.encrypt("141");
        java.lang.String str19 = rSA1.encrypt("1145968261");
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3088050694" + "'", str13, "3088050694");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001aZ]\024" + "'", str15, "\001aZ]\024");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "17462284" + "'", str17, "17462284");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "520394897" + "'", str19, "520394897");
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.encrypt("|");
        java.lang.String str15 = rSA1.encrypt("\007\ufffd\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\177" + "'", str3, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "iD#g" + "'", str7, "iD#g");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1657950289" + "'", str13, "1657950289");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1139544965" + "'", str15, "1139544965");
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str5 = rSA1.decrypt("2977826838347180772119751944");
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\001;");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("\002\ufffd\u0548\ufffd\ufffd\u077e\ufffd\ufffde");
        java.lang.String str19 = rSA1.encrypt("80619524939636215007406243428");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "730414229160645047792129250948" + "'", str11, "730414229160645047792129250948");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3101364196875" + "'", str13, "3101364196875");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "5176501403674425936632651686" + "'", str17, "5176501403674425936632651686");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2656269775891060901331017612" + "'", str19, "2656269775891060901331017612");
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("432");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35" + "'", str7, "35");
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("495");
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\u2804t\021\013");
        java.lang.String str15 = rSA1.decrypt("329964049132614116993653227507");
        java.lang.String str17 = rSA1.encrypt("850127554175508");
        java.lang.String str19 = rSA1.encrypt("\004\ub140\ufffd\u0601");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "549" + "'", str3, "549");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002W" + "'", str9, "\002W");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "629" + "'", str11, "629");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "559" + "'", str13, "559");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002y" + "'", str15, "\002y");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "482" + "'", str17, "482");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "69" + "'", str19, "69");
    }
}
