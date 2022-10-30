package RSA;

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
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd8" + "'", str11, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd8");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "72027131290191833224719436816" + "'", str13, "72027131290191833224719436816");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1512739533813279");
        rSA1.generateKeys(100);
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\ufffd\177\ufffd\u02db\ufffd\ufffd\ufffdP\027");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "956686158365351" + "'", str7, "956686158365351");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1811810741660453" + "'", str9, "1811810741660453");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "569590420143326651369866778058" + "'", str13, "569590420143326651369866778058");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        java.lang.String str15 = rSA1.decrypt("44");
        java.lang.String str17 = rSA1.encrypt("225606425835745481338696146574");
        java.lang.String str19 = rSA1.encrypt("525288410");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161" + "'", str3, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002M" + "'", str5, "\002M");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "113930057020549874483464774793" + "'", str13, "113930057020549874483464774793");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\027\ufffd\033=\003\b@\033ty" + "'", str15, "\004\ufffd\027\ufffd\033=\003\b@\033ty");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "371721722550702158607404854307" + "'", str17, "371721722550702158607404854307");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "453344683631273617753481204002" + "'", str19, "453344683631273617753481204002");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.decrypt("478");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161" + "'", str3, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "112" + "'", str5, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        java.lang.String str11 = rSA1.encrypt("517376765656606617096719830177");
        java.lang.String str13 = rSA1.encrypt("\001\ufffd\ufffd");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2222838675" + "'", str3, "2222838675");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7787347545" + "'", str7, "7787347545");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "435810503" + "'", str11, "435810503");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2886579111" + "'", str13, "2886579111");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("\003\ufffd\022\ufffd\ufffd\ufffd\ufffd7");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100" + "'", str5, "100");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "336" + "'", str7, "336");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "204993954399699000225791741967" + "'", str11, "204993954399699000225791741967");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        java.lang.String str5 = rSA1.decrypt("470");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "l" + "'", str5, "l");
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.encrypt("623433996390119");
        java.lang.String str11 = rSA1.decrypt("875");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3775292983" + "'", str3, "3775292983");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10606163833" + "'", str7, "10606163833");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9590042519" + "'", str9, "9590042519");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\020\024\ufffd~" + "'", str11, "\020\024\ufffd~");
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.encrypt("2821440436690149");
        java.lang.String str5 = rSA1.decrypt("1047482469336782699089679928208");
        java.lang.String str7 = rSA1.encrypt("10038248675189789010085843633");
        java.lang.String str9 = rSA1.decrypt("250822840");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "143" + "'", str3, "143");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "430" + "'", str7, "430");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001j" + "'", str9, "\001j");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("489216744821809573348585320231");
        java.lang.String str19 = rSA1.decrypt("445799692660471613043536602155");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "257446047335419762401853560807" + "'", str17, "257446047335419762401853560807");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd\ufffd\ufffdr\032\ufffd\0371>" + "'", str19, "\002\ufffd\ufffd\ufffdr\032\ufffd\0371>");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("4");
        java.lang.String str17 = rSA1.encrypt("\004\024\ufffd\"\ufffd\ufffd\ufffd");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "310395782940280" + "'", str7, "310395782940280");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\036\ufffd\ufffd" + "'", str9, "\002\ufffd\ufffd\036\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1050596075552562" + "'", str13, "1050596075552562");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "380204032" + "'", str15, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "69501088478727" + "'", str17, "69501088478727");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.encrypt("1260379134508742");
        java.lang.String str15 = rSA1.decrypt("755629646");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str19 = rSA1.encrypt("318");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "52185548367846124504672216422" + "'", str9, "52185548367846124504672216422");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "407349113968439258043617203691" + "'", str11, "407349113968439258043617203691");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "501023696633897673823131670684" + "'", str13, "501023696633897673823131670684");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd#\017\ufffd\u0498\ufffd\035" + "'", str15, "\001\ufffd\ufffd#\017\ufffd\u0498\ufffd\035");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "382897772157101211362871302061" + "'", str19, "382897772157101211362871302061");
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("113484804779532097642572840092");
        java.lang.String str17 = rSA1.decrypt("33522487042404985624");
        java.lang.String str19 = rSA1.encrypt("2356297228");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1508343139821822" + "'", str7, "1508343139821822");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "803176952" + "'", str11, "803176952");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "21" + "'", str15, "21");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "`" + "'", str17, "`");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "600" + "'", str19, "600");
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        java.lang.String str17 = rSA1.encrypt("141592947570930378736777989995");
        java.lang.String str19 = rSA1.encrypt("328224799554290748230697521488");
        java.lang.String str21 = rSA1.encrypt("\006\ufffd\ufffdUz\025\ufffdj\001");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "457433457398035549677809395711" + "'", str9, "457433457398035549677809395711");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\024\ufffd\ufffdx,;" + "'", str13, "\006\024\ufffd\ufffdx,;");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "522626526390879" + "'", str15, "522626526390879");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1214129979478381" + "'", str17, "1214129979478381");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2428928773688636" + "'", str19, "2428928773688636");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1512616095884183" + "'", str21, "1512616095884183");
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str5 = rSA1.decrypt("15714219981485676149178301947");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "24347782930095355056301782619" + "'", str3, "24347782930095355056301782619");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\036\ufffd\006\u0228\ufffdp\n" + "'", str5, "\036\ufffd\006\u0228\ufffdp\n");
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.encrypt("79163679617186273630480405800");
        java.lang.String str15 = rSA1.encrypt("163872781480525");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400" + "'", str5, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "328" + "'", str7, "328");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "254" + "'", str11, "254");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "63" + "'", str13, "63");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "74" + "'", str15, "74");
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("289013563216973");
        java.lang.String str19 = rSA1.decrypt("188203500852025286601695210043");
        rSA1.generateKeys((int) 'a');
        java.lang.String str23 = rSA1.encrypt("279424497474531");
        java.lang.String str25 = rSA1.decrypt("359");
        java.lang.String str27 = rSA1.encrypt("613225342614743");
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.decrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1198584922468416" + "'", str7, "1198584922468416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "462704160065034670667608213184" + "'", str13, "462704160065034670667608213184");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\005" + "'", str19, "\001\005");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "27921710322971927684086140526" + "'", str23, "27921710322971927684086140526");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\031\ufffdA$\031\ufffd\ufffd\ufffd\ufffd\023\ufffd" + "'", str25, "\031\ufffdA$\031\ufffd\ufffd\ufffd\ufffd\023\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "29282867628187595482520326654" + "'", str27, "29282867628187595482520326654");
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        java.lang.String str13 = rSA1.decrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("576");
        java.lang.String str19 = rSA1.decrypt("669");
        rSA1.generateKeys((int) '4');
        java.lang.String str23 = rSA1.decrypt("525294166970632550820444821304");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357193952533715936870138270447" + "'", str9, "357193952533715936870138270447");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\u020f\ufffd\ufffd\ufffd\ufffdi\036\ufffd" + "'", str11, "\000\u020f\ufffd\ufffd\ufffd\ufffdi\036\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004`8\n\ufffdHwW\b\ufffd~\007\ufffd" + "'", str13, "\004`8\n\ufffdHwW\b\ufffd~\007\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd]?Jq#\004u\032\ufffd\ufffd\003" + "'", str17, "\000\ufffd]?Jq#\004u\032\ufffd\ufffd\003");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\ufffd\ufffd\021<~#@\034\016" + "'", str19, "\ufffd\ufffd\ufffd\021<~#@\034\016");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffdp\032\ufffd{" + "'", str23, "\ufffdp\032\ufffd{");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\006");
        java.lang.String str15 = rSA1.decrypt("338");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str19 = rSA1.encrypt("752607123907448");
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1132068259708994" + "'", str7, "1132068259708994");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7776" + "'", str13, "7776");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\u0323\ufffdP" + "'", str15, "\001\u0323\ufffdP");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "585" + "'", str19, "585");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        java.lang.String str15 = rSA1.decrypt("5508697251");
        java.lang.String str17 = rSA1.encrypt("353706821132697402012447044730");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2909388438863030" + "'", str7, "2909388438863030");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\f\ufffd\ufffd" + "'", str13, "\f\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str15, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2797800128184763" + "'", str17, "2797800128184763");
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        java.lang.String str15 = rSA1.encrypt("669");
        java.lang.String str17 = rSA1.decrypt("85317131416827023530889570588");
        java.lang.String str19 = rSA1.encrypt("472311133554697");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "112" + "'", str11, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "173" + "'", str15, "173");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "5" + "'", str17, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "288" + "'", str19, "288");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("2064440430059638");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\035" + "'", str5, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "156128725151243292398057205667" + "'", str11, "156128725151243292398057205667");
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        java.lang.String str13 = rSA1.encrypt("567489291482222151985241898549");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("299348896306626429974249510047");
        java.lang.String str19 = rSA1.encrypt("\t\ufffd\ufffd\ufffd\ufffd\004\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "589610733804700442591666959465" + "'", str9, "589610733804700442591666959465");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "180024355783585395431513022120" + "'", str11, "180024355783585395431513022120");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "373621002371511102642815100357" + "'", str13, "373621002371511102642815100357");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "381544539312004684577581864571" + "'", str17, "381544539312004684577581864571");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "405502439862855624210708786456" + "'", str19, "405502439862855624210708786456");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str19 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str21 = rSA1.encrypt("279013794571372335667148699913");
        java.lang.String str23 = rSA1.encrypt("2142835345");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1519986451640367" + "'", str7, "1519986451640367");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "122" + "'", str11, "122");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "470" + "'", str19, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "46" + "'", str21, "46");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "122" + "'", str23, "122");
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.decrypt("86");
        java.lang.String str17 = rSA1.encrypt("119579939769595636001061");
        java.lang.String str19 = rSA1.decrypt("603377111727349");
        java.lang.String str21 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\016\ufffd\ufffd");
        java.lang.String str23 = rSA1.encrypt("356652968780922655022684133052");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "276" + "'", str3, "276");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "428" + "'", str17, "428");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "195" + "'", str21, "195");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "490" + "'", str23, "490");
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("55");
        java.lang.String str17 = rSA1.encrypt("\002Q");
        java.lang.String str19 = rSA1.decrypt("561768809291208891163827375411");
        java.lang.String str21 = rSA1.decrypt("529739232291311412846747135038");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "567334834648204" + "'", str7, "567334834648204");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "24" + "'", str15, "24");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "481" + "'", str17, "481");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\020" + "'", str19, "\020");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.decrypt("32427175380384275892758226492");
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006N\031\ufffd\ufffd\ufffd\034\ufffd" + "'", str11, "\006N\031\ufffd\ufffd\ufffd\034\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "318804399330905736001130466252" + "'", str13, "318804399330905736001130466252");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdB" + "'", str15, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdB");
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("3844015076");
        java.lang.String str15 = rSA1.encrypt("74853551270143319640802282643");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "936048382926819" + "'", str7, "936048382926819");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\007\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1363893847492760" + "'", str15, "1363893847492760");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "458" + "'", str7, "458");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "218" + "'", str9, "218");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\0019" + "'", str11, "\0019");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str21 = rSA1.encrypt("315659635588694");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "150553394767841577210615444604" + "'", str9, "150553394767841577210615444604");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "99384714929142663302469670276" + "'", str11, "99384714929142663302469670276");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "124681006391081715116101721675" + "'", str13, "124681006391081715116101721675");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "120" + "'", str21, "120");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str9 = rSA1.decrypt("156420681989455759137605914496");
        java.lang.String str11 = rSA1.encrypt("325053041126851022637890970422");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str5, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\ufffd]\034\ufffd\u0222\ufffd\ufffd" + "'", str9, "\002\ufffd\ufffd\ufffd]\034\ufffd\u0222\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "249282510121539176696385176960" + "'", str11, "249282510121539176696385176960");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("1396895478287703");
        java.lang.String str5 = rSA1.encrypt("251943736018795");
        java.lang.String str7 = rSA1.encrypt("1024");
        java.lang.String str9 = rSA1.encrypt("\006\035\ufffd\036Y][");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\000\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???i'D?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\017\ufffd" + "'", str3, "\017\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1019673575" + "'", str5, "1019673575");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1185043258" + "'", str7, "1185043258");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1025171959" + "'", str9, "1025171959");
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("891672670784136");
        rSA1.generateKeys((int) ' ');
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "76" + "'", str5, "76");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "547" + "'", str9, "547");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "248" + "'", str13, "248");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        java.lang.String str15 = rSA1.decrypt("965471357883334");
        java.lang.String str17 = rSA1.decrypt("89040210064112265853492837860");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380909275817649103894041636351" + "'", str9, "380909275817649103894041636351");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "437057932281058866141326378333" + "'", str11, "437057932281058866141326378333");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "261770662692455811500296239273" + "'", str13, "261770662692455811500296239273");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\024\036\ufffdDn\007\ufffd\u07f9" + "'", str15, "\003\ufffd\ufffd\ufffd\024\036\ufffdDn\007\ufffd\u07f9");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239890472346857656009379840356" + "'", str3, "239890472346857656009379840356");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.Class<?> wildcardClass2 = rSA1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("1021508253829588");
        java.lang.String str17 = rSA1.decrypt("154");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1849911672839770" + "'", str7, "1849911672839770");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffdJ\021" + "'", str9, "\004\ufffd\ufffd\ufffdJ\021");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "802230643991779" + "'", str13, "802230643991779");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "759194901112647" + "'", str15, "759194901112647");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n\ufffd`\031\u03e7\ufffd" + "'", str17, "\n\ufffd`\031\u03e7\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.decrypt("136");
        java.lang.String str17 = rSA1.decrypt("120");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1340740369973462" + "'", str7, "1340740369973462");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1949151146807888" + "'", str13, "1949151146807888");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\ufffd\ufffd%\001" + "'", str15, "\b\ufffd\ufffd\ufffd%\001");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\u036e\ufffd\ufffdwf" + "'", str17, "\006\u036e\ufffd\ufffdwf");
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.encrypt("2821440436690149");
        java.math.BigInteger bigInteger4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = rSA1.decrypt(bigInteger4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "71" + "'", str3, "71");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.decrypt("612289405983445152292783659486");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7750623069" + "'", str3, "7750623069");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8525572880" + "'", str7, "8525572880");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\034.y" + "'", str9, "\000\ufffd\034.y");
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("197");
        java.lang.String str17 = rSA1.encrypt("489820813679061855661270246862");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "715679338351299664170204900061" + "'", str9, "715679338351299664170204900061");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd.\025\ufffd\ufffd{K\030\ufffd\ufffd\ufffd\025" + "'", str11, "\005\ufffd.\025\ufffd\ufffd{K\030\ufffd\ufffd\ufffd\025");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "313566448161575031891421154858" + "'", str13, "313566448161575031891421154858");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "590173241155171865031744425409" + "'", str15, "590173241155171865031744425409");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "494793614915595315750849152731" + "'", str17, "494793614915595315750849152731");
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("\007\016\ufffd\ufffd\ufffd\ufffd\ufffd\021zl");
        java.lang.String str15 = rSA1.encrypt("54326269148954289324151592843");
        java.lang.String str17 = rSA1.encrypt("690530077128240573643761455271");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "323" + "'", str11, "323");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "245" + "'", str13, "245");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "668" + "'", str15, "668");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "277" + "'", str17, "277");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys(100);
        java.lang.String str9 = rSA1.decrypt("321842069114441562362352839359");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003\016" + "'", str3, "\003\016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\000\n\ufffd\ufffd\004\023" + "'", str9, "\005\ufffd\ufffd\ufffd\ufffd\000\n\ufffd\ufffd\004\023");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("402119530394494");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.encrypt("503");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3558290701" + "'", str3, "3558290701");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3851898214" + "'", str7, "3851898214");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "271392790957603325460787675090" + "'", str11, "271392790957603325460787675090");
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("8589662889");
        java.lang.String str19 = rSA1.encrypt("\001\ufffd\022\u03c7\u0502\ufffd\ufffd\ufffdX");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "552411712317640831435627009280" + "'", str9, "552411712317640831435627009280");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffdu\r\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\005\ufffdu\r\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "28739836372996499555750392314" + "'", str13, "28739836372996499555750392314");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffdV" + "'", str17, "\ufffd\ufffd\ufffdV");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1247325904364049" + "'", str19, "1247325904364049");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("447496868224857299807924535199");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2253624918" + "'", str9, "2253624918");
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("48");
        java.lang.String str13 = rSA1.decrypt("59761034433964984688906952333");
        java.lang.String str15 = rSA1.encrypt("548110071361613660316881187141");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "832068217727630446784266529718" + "'", str9, "832068217727630446784266529718");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2388907372032" + "'", str11, "2388907372032");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\ufffd\u0157\ufffd\ufffd\r\ufffd\ufffd\ufffd" + "'", str13, "\b\ufffd\u0157\ufffd\ufffd\r\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "695213458402406366312293455846" + "'", str15, "695213458402406366312293455846");
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        java.lang.String str17 = rSA1.encrypt("178");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str21 = rSA1.decrypt("5469997232");
        java.lang.String str23 = rSA1.encrypt("287453852200194401992539143141");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t\030\ufffdnL0" + "'", str13, "\t\030\ufffdnL0");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1434874942496692" + "'", str15, "1434874942496692");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "27302830258957" + "'", str17, "27302830258957");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "V" + "'", str21, "V");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "42" + "'", str23, "42");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.decrypt("829");
        java.lang.String str5 = rSA1.encrypt("?");
        java.lang.String str7 = rSA1.decrypt("473642297");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\020\ufffd\016\ufffd\ufffd\ufffd" + "'", str3, "\001\020\ufffd\016\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3938980639167" + "'", str5, "3938980639167");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\"\ufffd\ufffdQ6" + "'", str7, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\"\ufffd\ufffdQ6");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("1863031711965363");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "239307014175108697789296563670" + "'", str9, "239307014175108697789296563670");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "296586482990038219943903851586" + "'", str11, "296586482990038219943903851586");
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("125");
        java.lang.String str15 = rSA1.encrypt("1357889660519486");
        java.lang.String str17 = rSA1.decrypt("2354813854350387");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str23 = rSA1.encrypt("1060484709847550");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "48777882886344883128034792232" + "'", str9, "48777882886344883128034792232");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "48777882886344883128034792232" + "'", str11, "48777882886344883128034792232");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\024\ufffd\ufffd\ufffd\ufffdh" + "'", str13, "\002\ufffd\ufffd\024\ufffd\ufffd\ufffd\ufffdh");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "453903122546506064924666794964" + "'", str15, "453903122546506064924666794964");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\027\u0405\ufffd\ufffd\ufffd" + "'", str17, "\ufffd\027\u0405\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "435475747598124" + "'", str23, "435475747598124");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        java.lang.String str13 = rSA1.decrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("576");
        java.lang.String str19 = rSA1.decrypt("669");
        java.lang.String str21 = rSA1.encrypt("674932422672366921537205620483");
        java.lang.String str23 = rSA1.decrypt("100935160444972936488645408652");
        java.lang.String str25 = rSA1.decrypt("461541918275757628831159648633");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "484311733662715503201147332258" + "'", str9, "484311733662715503201147332258");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\"\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\003\ufffd\ufffd\"\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\\\ufffd" + "'", str13, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\\\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004\ufffd\u0694\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\004\ufffd\u0694\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1033630487734991850004141045" + "'", str21, "1033630487734991850004141045");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u075a\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str23, "\u075a\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ufffd\ufffd\ufffd\ufffdj\t\ufffd" + "'", str25, "\ufffd\ufffd\ufffd\ufffdj\t\ufffd");
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("852");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("1792074056760905");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "846365587740189" + "'", str7, "846365587740189");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\f\ufffd" + "'", str9, "\005\ufffd\f\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("266");
        java.lang.String str13 = rSA1.decrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\021\ufffd");
        java.lang.String str17 = rSA1.encrypt("604599376813224");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\0013" + "'", str13, "\0013");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "324" + "'", str15, "324");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "207" + "'", str17, "207");
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("444705404507775010000301066009");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.decrypt("1663121384982181");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "494853494928728118992352421767" + "'", str9, "494853494928728118992352421767");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "207414191718982530793488991084" + "'", str11, "207414191718982530793488991084");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("521834014122859");
        java.lang.String str13 = rSA1.encrypt("9096294327276631334570801956");
        java.lang.String str15 = rSA1.encrypt("16666078853112263439064677627");
        java.lang.String str17 = rSA1.encrypt("\b\ufffd\ufffd[\021\ufffd\ufffdoQ");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "192570696763101165232851591584" + "'", str9, "192570696763101165232851591584");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "651926369531655853997544461538" + "'", str11, "651926369531655853997544461538");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "440989467796386229779169095701" + "'", str13, "440989467796386229779169095701");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "15880954494557876337536931206" + "'", str15, "15880954494557876337536931206");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "270845870980867302619512553399" + "'", str17, "270845870980867302619512553399");
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\004\ufffd\ufffd\u07d8");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "284" + "'", str5, "284");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "l" + "'", str7, "l");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "102" + "'", str9, "102");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "526" + "'", str11, "526");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\001\ufffd");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("P");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"P\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "77" + "'", str5, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\016" + "'", str7, "\016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "527" + "'", str9, "527");
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("286695718283372156430210651393");
        java.lang.String str5 = rSA1.decrypt("2119828432695955");
        java.lang.String str7 = rSA1.decrypt("925568231498920647360821327791");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1965934458" + "'", str3, "1965934458");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\026\016\035d" + "'", str7, "\026\016\035d");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.decrypt("666852044142564779122674445212");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\n" + "'", str7, "\001\n");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "k" + "'", str9, "k");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("478480907");
        java.lang.String str13 = rSA1.decrypt("10262013576437037109817071209");
        java.lang.String str15 = rSA1.encrypt("\006\n\ufffd\u05b8\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("\ufffd\ufffd\ufffd\u672b\ufffd\n\013j");
        java.lang.String str19 = rSA1.encrypt("546");
        java.lang.String str21 = rSA1.encrypt("56598386470850099107874878848");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "146" + "'", str11, "146");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\030" + "'", str13, "\001\030");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "73" + "'", str15, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "29" + "'", str17, "29");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "114" + "'", str19, "114");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "37" + "'", str21, "37");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("219091099050495");
        java.lang.String str5 = rSA1.decrypt("97779635366941227714181850303");
        java.lang.String str7 = rSA1.encrypt("154144488921717");
        java.lang.String str9 = rSA1.decrypt("2007083759867767");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "419097562680070948424917061242" + "'", str3, "419097562680070948424917061242");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\003\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd%" + "'", str5, "\003\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd%");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "257984058424735577666085422710" + "'", str7, "257984058424735577666085422710");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("125");
        java.lang.String str15 = rSA1.encrypt("1357889660519486");
        java.lang.String str17 = rSA1.decrypt("2354813854350387");
        java.lang.String str19 = rSA1.encrypt("538621452366062192513302577482");
        java.lang.String str21 = rSA1.decrypt("170705708815382296879585480685");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "187210958048295192949838166918" + "'", str9, "187210958048295192949838166918");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "187210958048295192949838166918" + "'", str11, "187210958048295192949838166918");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\026\ufffd\ufffd\fF" + "'", str13, "\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\026\ufffd\ufffd\fF");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "138959847364661262713766390140" + "'", str15, "138959847364661262713766390140");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n\ufffd\017\ufffd\ufffd\u07a6\ufffd\ufffd\ufffd" + "'", str17, "\n\ufffd\017\ufffd\ufffd\u07a6\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "414833486622469167744900148319" + "'", str19, "414833486622469167744900148319");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n\ufffd\ufffd\ufffd\ufffd\u05be\ufffd\ufffd\036\034\ufffd\ufffd" + "'", str21, "\n\ufffd\ufffd\ufffd\ufffd\u05be\ufffd\ufffd\036\034\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("310952423287303162704207659970");
        java.lang.String str17 = rSA1.decrypt("1632923298108129");
        java.lang.String str19 = rSA1.decrypt("6502538600");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "762480223599271105307257992532" + "'", str9, "762480223599271105307257992532");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\004\ufffd\ufffdy\030\027\ufffd7\007I" + "'", str11, "\002\004\ufffd\ufffdy\030\027\ufffd7\007I");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "63801033879049312935362403566" + "'", str13, "63801033879049312935362403566");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "192702922372136944369087254201" + "'", str15, "192702922372136944369087254201");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdp" + "'", str17, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdp");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006\333\n\004\ufffd\u0152}\035\ufffd\ufffd" + "'", str19, "\006\333\n\004\ufffd\u0152}\035\ufffd\ufffd");
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("4");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.encrypt("2411260992603826");
        java.lang.String str17 = rSA1.encrypt("258");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "380204032" + "'", str11, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "212946760" + "'", str15, "212946760");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2044322787" + "'", str17, "2044322787");
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.decrypt("1324891368150122");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "58" + "'", str5, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!" + "'", str7, "!");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\030\ufffd\r\ufffd\ufffd\000\\" + "'", str11, "\002\ufffd\030\ufffd\r\ufffd\ufffd\000\\");
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.lang.String str5 = rSA1.decrypt("429740296");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\007" + "'", str3, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001hz1\002\ufffd\ufffd\ufffd\ufffd" + "'", str5, "\001hz1\002\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        rSA1.generateKeys((int) ' ');
        java.lang.String str7 = rSA1.encrypt("141534893279925187594255106704");
        java.lang.String str9 = rSA1.encrypt("369824009393067");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\006\ufffd;\007\ufffd\ufffd" + "'", str3, "\006\ufffd;\007\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1236959929" + "'", str7, "1236959929");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1874929152" + "'", str9, "1874929152");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("250147309");
        java.lang.String str17 = rSA1.encrypt("350555347807474765631801418392");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "418825263827202562428736677021" + "'", str9, "418825263827202562428736677021");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\f\025\ufffd\ufffd\"\006\023\017\ufffdI\034" + "'", str11, "\001\ufffd\f\025\ufffd\ufffd\"\006\023\017\ufffdI\034");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\"\ufffd\ufffd<wQ" + "'", str15, "\001\ufffd\ufffd\ufffd\"\ufffd\ufffd<wQ");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "436366349311551759777167791083" + "'", str17, "436366349311551759777167791083");
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("257");
        java.lang.String str17 = rSA1.decrypt("608858562594023");
        java.lang.String str19 = rSA1.encrypt("\006\b\ufffd\ufffd\355");
        java.lang.String str21 = rSA1.decrypt("2248184327249614");
        java.lang.String str23 = rSA1.decrypt("791702078590644268354942344794");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2467910256411409" + "'", str7, "2467910256411409");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "198" + "'", str15, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "447" + "'", str19, "447");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\n" + "'", str21, "\002\n");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd" + "'", str23, "\001\ufffd");
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("507735161454502401211578520289");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\005\ufffd-A{\000\u0766\021\ufffd\ufffd|\t");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "414255501245707693446450809298" + "'", str9, "414255501245707693446450809298");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "206166351062660370753049797909" + "'", str11, "206166351062660370753049797909");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002H\005\b\ufffd\ufffd" + "'", str17, "\002H\005\b\ufffd\ufffd");
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("\005g\006\ufffd\ufffda");
        java.lang.String str7 = rSA1.encrypt("\007\025\ufffd\ufffd\ufffd\u0591\ufffd\024\016\006");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7435718851" + "'", str3, "7435718851");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7446085636" + "'", str5, "7446085636");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5287526557" + "'", str7, "5287526557");
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\006");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.encrypt("278806374250498767788908229396");
        java.lang.String str19 = rSA1.encrypt("1970770716349871");
        java.lang.String str21 = rSA1.encrypt("94");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "742523978938414" + "'", str7, "742523978938414");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "216" + "'", str13, "216");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "164461330532576267655034638769" + "'", str17, "164461330532576267655034638769");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "260242743550950436475588752264" + "'", str19, "260242743550950436475588752264");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "673439523396950324224" + "'", str21, "673439523396950324224");
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("125");
        java.lang.String str15 = rSA1.encrypt("1357889660519486");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "487585912663560551990413902312" + "'", str9, "487585912663560551990413902312");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "487585912663560551990413902312" + "'", str11, "487585912663560551990413902312");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\035\016\ufffd\ufffd\021\013\ufffd\ufffd\ufffd" + "'", str13, "\006\ufffd\035\016\ufffd\ufffd\021\013\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "96984744551676646653447470743" + "'", str15, "96984744551676646653447470743");
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1450670214753405");
        java.lang.String str11 = rSA1.encrypt("87203191126925675072023416378");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("\013\ufffd\ufffd\024\r");
        java.lang.String str19 = rSA1.encrypt("612931935153715977341680982304");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "480995398703164" + "'", str7, "480995398703164");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1320831783006959" + "'", str9, "1320831783006959");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "410728639539181" + "'", str11, "410728639539181");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "259269144807324674942666738808" + "'", str17, "259269144807324674942666738808");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "547845720664927314335090324602" + "'", str19, "547845720664927314335090324602");
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\001\ufffd");
        java.lang.String str11 = rSA1.decrypt("10944974464");
        java.lang.String str13 = rSA1.encrypt("2448943656306246");
        java.lang.String str15 = rSA1.decrypt("569046855107122163755734229680");
        java.lang.String str17 = rSA1.encrypt("\001\ufffd\ufffdU\037g\032\ufffdP");
        java.lang.String str19 = rSA1.decrypt("5");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400" + "'", str5, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "356" + "'", str9, "356");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "396" + "'", str13, "396");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\002" + "'", str15, "\001\002");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "98" + "'", str17, "98");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\0016" + "'", str19, "\0016");
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("153853134159497141190339455222");
        java.lang.String str11 = rSA1.decrypt("477335194284590038441746180824");
        java.lang.String str13 = rSA1.decrypt("698830179104320016788462155306");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\020\007|\r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??|?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "506128414612546" + "'", str7, "506128414612546");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\ufffd8" + "'", str9, "\005\ufffd\ufffd\ufffd8");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\024\ufffdN." + "'", str11, "\ufffd\024\ufffdN.");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffdeV0+" + "'", str13, "\002\ufffd\ufffdeV0+");
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        java.lang.String str5 = rSA1.decrypt("6591173097");
        java.lang.String str7 = rSA1.decrypt("1480332030624002");
        java.lang.String str9 = rSA1.decrypt("1308742942572266");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002?" + "'", str9, "\002?");
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1450670214753405");
        java.lang.String str11 = rSA1.encrypt("87203191126925675072023416378");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1197515268714586" + "'", str7, "1197515268714586");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "363424837072433" + "'", str9, "363424837072433");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1060195183634680" + "'", str11, "1060195183634680");
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("461647412419176665142998751479");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "486" + "'", str7, "486");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        java.lang.String str13 = rSA1.decrypt("698830179104320016788462155306");
        rSA1.generateKeys((int) '#');
        java.lang.String str17 = rSA1.encrypt("326");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "20325604337285010030592" + "'", str9, "20325604337285010030592");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "648139243563142168405155423080" + "'", str11, "648139243563142168405155423080");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\020\ufffd\ufffd\ufffd\u07e4" + "'", str13, "\000\ufffd\ufffd\020\ufffd\ufffd\ufffd\u07e4");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "14390840756" + "'", str17, "14390840756");
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "404092737324450084327687544854" + "'", str9, "404092737324450084327687544854");
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str19 = rSA1.decrypt("511");
        java.lang.String str21 = rSA1.decrypt("73931890830183151123801579485");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "122529926446464" + "'", str7, "122529926446464");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "238" + "'", str11, "238");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "211402786068383115934367429603" + "'", str9, "211402786068383115934367429603");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "613525560226473587289643691568" + "'", str11, "613525560226473587289643691568");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\tF\027\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\tF\027\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("286695718283372156430210651393");
        java.lang.String str5 = rSA1.encrypt("114499583605784415240056624559");
        java.lang.String str7 = rSA1.encrypt("1676156159101258");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1216318612" + "'", str3, "1216318612");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2591797249" + "'", str5, "2591797249");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5211342388" + "'", str7, "5211342388");
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("289013563216973");
        java.lang.String str19 = rSA1.decrypt("188203500852025286601695210043");
        rSA1.generateKeys((int) 'a');
        java.lang.String str23 = rSA1.encrypt("279424497474531");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "374806994630104" + "'", str7, "374806994630104");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "754560892356666887167284003918" + "'", str13, "754560892356666887167284003918");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "y" + "'", str17, "y");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\013" + "'", str19, "\002\013");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "22885690660793728609880370266" + "'", str23, "22885690660793728609880370266");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("108862119398595");
        java.lang.String str15 = rSA1.decrypt("192569224470580183531005309777");
        rSA1.generateKeys((int) ' ');
        java.lang.String str19 = rSA1.encrypt("4135191595");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "37805074531238270313" + "'", str11, "37805074531238270313");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\ufffd\u012c\ufffd\ufffd\ufffd\ufffd\ufffd\033H" + "'", str13, "\b\ufffd\u012c\ufffd\ufffd\ufffd\ufffd\ufffd\033H");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007=K\003\ufffd\025\ufffd\ufffd\ufffd\026" + "'", str15, "\007=K\003\ufffd\025\ufffd\ufffd\ufffd\026");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "733470889" + "'", str19, "733470889");
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.decrypt("4");
        java.lang.String str11 = rSA1.encrypt("1955448203012581");
        rSA1.generateKeys(10);
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "234" + "'", str3, "234");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\ufffd\ufffd" + "'", str7, "\002\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003|O(\032" + "'", str9, "\003|O(\032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "11138416654" + "'", str11, "11138416654");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("410");
        java.lang.String str5 = rSA1.decrypt("456351013126802");
        java.lang.String str7 = rSA1.decrypt("121146565524829642818807927021");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "349456512180016837913437787141" + "'", str3, "349456512180016837913437787141");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str5, "\001\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("828944592250846");
        java.lang.String str11 = rSA1.decrypt("60732077159364971136922584801");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\030" + "'", str7, "\030");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd" + "'", str9, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\0023" + "'", str11, "\0023");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\000\ufffdL\024\ufffd\ufffd\ufffd>\032");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "55983564141360696292616257631" + "'", str11, "55983564141360696292616257631");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.decrypt("3989346653526533");
        java.lang.String str15 = rSA1.decrypt("299");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "524" + "'", str7, "524");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\" + "'", str15, "\\");
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("197");
        java.lang.String str17 = rSA1.encrypt("462059788404288851690924494526");
        java.lang.String str19 = rSA1.decrypt("669");
        java.lang.String str21 = rSA1.encrypt("505166351935841957381133710989");
        java.lang.String str23 = rSA1.encrypt("\001\032\207\ufffd");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "342924107805887945297554302538" + "'", str9, "342924107805887945297554302538");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\020\ufffdy\001\ufffd\ufffd" + "'", str11, "\001\ufffd\ufffd\ufffd\020\ufffdy\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "479340447826687910381401273252" + "'", str13, "479340447826687910381401273252");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "47420847554833524213068855334" + "'", str15, "47420847554833524213068855334");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "336427942156356753833979247452" + "'", str17, "336427942156356753833979247452");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\007\ufffd\017\ufffd\u0236\ufffd\ufffdC\007" + "'", str19, "\003\007\ufffd\017\ufffd\u0236\ufffd\ufffdC\007");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "316122467681240453933759998604" + "'", str21, "316122467681240453933759998604");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "544882545226411042428665346643" + "'", str23, "544882545226411042428665346643");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "304584412820436" + "'", str7, "304584412820436");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "774706581" + "'", str11, "774706581");
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str15 = rSA1.decrypt("1630771903");
        rSA1.generateKeys(100);
        java.lang.String str19 = rSA1.encrypt("165516544336771895648557441262");
        java.lang.String str21 = rSA1.encrypt("\t\ufffd\u04bc\ufffd\ufffdz*D#?");
        java.lang.String str23 = rSA1.encrypt("5267573612");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "269846179201629" + "'", str13, "269846179201629");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd\f}V" + "'", str15, "\007\ufffd\ufffd\f}V");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "366029008708059727875119417810" + "'", str19, "366029008708059727875119417810");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "432980084285672566570857133175" + "'", str21, "432980084285672566570857133175");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "204635389825428687846349765786" + "'", str23, "204635389825428687846349765786");
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str19 = rSA1.encrypt("10855030069557170773849298528");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "102271789596390" + "'", str7, "102271789596390");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "183" + "'", str11, "183");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "145" + "'", str19, "145");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        java.lang.String str15 = rSA1.decrypt("59761034433964984688906952333");
        java.lang.String str17 = rSA1.encrypt("1472324714429839");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\035" + "'", str5, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\u058a\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\005\ufffd\u058a\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "492481403156770951554686413723" + "'", str13, "492481403156770951554686413723");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "212716683949135247113055900475" + "'", str17, "212716683949135247113055900475");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("\003\ufffd\ufffdm1");
        java.math.BigInteger bigInteger4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = rSA1.decrypt(bigInteger4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7621528845" + "'", str3, "7621528845");
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("805201222");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("1247429583154038");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161" + "'", str3, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002M" + "'", str5, "\002M");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\0011" + "'", str7, "\0011");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\u045a" + "'", str11, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\u045a");
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("444705404507775010000301066009");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.decrypt("614257699369705");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "103745806010958258382346641750" + "'", str11, "103745806010958258382346641750");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002?" + "'", str17, "\002?");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.decrypt("156420681989455759137605914496");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "51722886825626" + "'", str7, "51722886825626");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\t\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\004\t\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\004\ufffd\ufffd" + "'", str11, "\007\ufffd\004\ufffd\ufffd");
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.encrypt("\006\016\ufffd\ufffda2");
        java.lang.String str17 = rSA1.encrypt("282");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "235571995737155434979013373027" + "'", str13, "235571995737155434979013373027");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "22946438427586506575585910755" + "'", str15, "22946438427586506575585910755");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "35649815032570742856" + "'", str17, "35649815032570742856");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.decrypt("44");
        java.lang.String str15 = rSA1.encrypt("2137939168549185");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1877547294786962" + "'", str7, "1877547294786962");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\0011" + "'", str11, "\0011");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "j" + "'", str13, "j");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "12" + "'", str15, "12");
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("969465452");
        java.lang.String str15 = rSA1.decrypt("582");
        rSA1.generateKeys((int) 'a');
        java.lang.String str19 = rSA1.decrypt("1275316629940412");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1025211686978113" + "'", str7, "1025211686978113");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "696773811284614" + "'", str13, "696773811284614");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\016\ufffd3H\b" + "'", str15, "\002\016\ufffd3H\b");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\005\245\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdG" + "'", str19, "\005\245\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdG");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "211" + "'", str5, "211");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd" + "'", str7, "\002\ufffd");
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.decrypt("1858966504");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "679235788016522" + "'", str7, "679235788016522");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19465109" + "'", str11, "19465109");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("521834014122859");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("`");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"`\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "840376114923524993900040621912" + "'", str9, "840376114923524993900040621912");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "206455675434022793333624025017" + "'", str11, "206455675434022793333624025017");
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        java.lang.String str13 = rSA1.decrypt("151464558644061297306368349467");
        java.lang.String str15 = rSA1.decrypt("418");
        java.lang.String str17 = rSA1.decrypt("323");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "149262783316293774617039616724" + "'", str9, "149262783316293774617039616724");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "167757647647870131971195796965" + "'", str11, "167757647647870131971195796965");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\u055f\ufffd\ufffd\ufffd\ufffd<" + "'", str13, "\003\ufffd\ufffd\ufffd\u055f\ufffd\ufffd\ufffd\ufffd<");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\177\t;o\000\031\ufffd\ufffd\036\ufffd\ufffd-" + "'", str15, "\006\177\t;o\000\031\ufffd\ufffd\036\ufffd\ufffd-");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\u06c2\ufffd\ufffd\u0458\ufffd" + "'", str17, "\000\ufffd\ufffd\u06c2\ufffd\ufffd\u0458\ufffd");
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("2573327249882962");
        java.lang.String str15 = rSA1.encrypt("\036\002\ufffd*");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "348654801971977" + "'", str7, "348654801971977");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\0012" + "'", str13, "\0012");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "497" + "'", str15, "497");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("673899523054237850976");
        java.lang.String str11 = rSA1.decrypt("46925933906613754914094402908");
        java.lang.String str13 = rSA1.encrypt("1699026177576345");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\004s\004\ufffd\ufffd\033\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?s?????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161" + "'", str3, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002M" + "'", str5, "\002M");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "401603193477231511613929699647" + "'", str9, "401603193477231511613929699647");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\006\ufffd\016" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\006\ufffd\016");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "480182982635085724965085681898" + "'", str13, "480182982635085724965085681898");
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        java.lang.String str15 = rSA1.decrypt("59761034433964984688906952333");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\026\ufffd\ufffd\ufffd\030" + "'", str11, "\004\ufffd\ufffd\ufffd\026\ufffd\ufffd\ufffd\030");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "176257648163702412067945274531" + "'", str13, "176257648163702412067945274531");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\"\017\ufffd\036\ufffdF\025\ufffd" + "'", str15, "\000\ufffd\ufffd\"\017\ufffd\036\ufffdF\025\ufffd");
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        java.lang.String str13 = rSA1.encrypt("567489291482222151985241898549");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.decrypt("7");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "123912801006276613272685859463" + "'", str9, "123912801006276613272685859463");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "37822311364830212583" + "'", str11, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "302217765045048369233684973083" + "'", str13, "302217765045048369233684973083");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\uee2e\ufffd\013\037U]" + "'", str17, "\002\ufffd\uee2e\ufffd\013\037U]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("16384");
        java.lang.String str13 = rSA1.encrypt("182896684412517005977800507579");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "163" + "'", str7, "163");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004" + "'", str11, "\004");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "385" + "'", str13, "385");
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.encrypt("314");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4520283028" + "'", str5, "4520283028");
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.encrypt("285");
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.encrypt("3606542550");
        java.lang.String str21 = rSA1.decrypt("661295819657843");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "377936637868398280413250514046" + "'", str9, "377936637868398280413250514046");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd|\013\ufffd" + "'", str11, "\004\ufffd\ufffd|\013\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "96" + "'", str13, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "301880927450029032830412842043" + "'", str15, "301880927450029032830412842043");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "892" + "'", str19, "892");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd" + "'", str21, "\001\ufffd");
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("891672670784136");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "58" + "'", str5, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "138" + "'", str9, "138");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "174" + "'", str13, "174");
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("310952423287303162704207659970");
        java.lang.String str17 = rSA1.decrypt("1632923298108129");
        java.lang.String str19 = rSA1.encrypt("\f\ufffd\001\ufffd\ufffd\ufffd\177\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "232445141019288261081242979483" + "'", str9, "232445141019288261081242979483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\016\ufffd\ufffd\u07e2\ufffd\ufffd\ufffd\005\ufffd\ufffd\ufffd" + "'", str11, "\016\ufffd\ufffd\u07e2\ufffd\ufffd\ufffd\005\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "731667459344234982923459579038" + "'", str15, "731667459344234982923459579038");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\ufffd\031\ufffd\ufffd\ufffd\000\ufffd" + "'", str17, "\006\ufffd\031\ufffd\ufffd\ufffd\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "453498723515818718924461963467" + "'", str19, "453498723515818718924461963467");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.decrypt("416175732479790270497901975791");
        java.lang.String str9 = rSA1.encrypt("491597882470490509387393294253");
        java.lang.String str11 = rSA1.decrypt("332892179453072453431910072674");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003\ufffdh\023\ufffd\017\ufffd\ufffd\ufffd" + "'", str3, "\003\ufffdh\023\ufffd\017\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "525287001993889324889771611046" + "'", str5, "525287001993889324889771611046");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\ufffdj#\027\ufffd\ufffd\ufffd\025\ufffd\ufffd" + "'", str7, "\005\ufffdj#\027\ufffd\ufffd\ufffd\025\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "265283856747545204195994090154" + "'", str9, "265283856747545204195994090154");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\u96e4\035V" + "'", str11, "\001\ufffd\ufffd\ufffd\u96e4\035V");
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("250147309");
        java.lang.String str17 = rSA1.encrypt("#");
        java.lang.String str19 = rSA1.encrypt("88676722964906920545187245209");
        java.lang.String str21 = rSA1.encrypt("1077184317");
        java.lang.String str23 = rSA1.decrypt("214");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "134628262374996920792409178480" + "'", str9, "134628262374996920792409178480");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\f\ufffd\035\ufffd\ufffd\ufffd:\001f" + "'", str11, "\f\ufffd\035\ufffd\ufffd\ufffd:\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "982483847552164826424071730346" + "'", str13, "982483847552164826424071730346");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffdt@\"\022\035V\b\ufffd\ufffd\ufffd\037" + "'", str15, "\b\ufffdt@\"\022\035V\b\ufffd\ufffd\ufffd\037");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "96549157373046875" + "'", str17, "96549157373046875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "456172832970430227696397040524" + "'", str19, "456172832970430227696397040524");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "803658772362270451100390360399" + "'", str21, "803658772362270451100390360399");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffdI" + "'", str23, "\003\ufffd\ufffd\ufffd\ufffdI");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.encrypt("2821440436690149");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str7 = rSA1.encrypt("507616451328483844912348153752");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "19" + "'", str3, "19");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "418" + "'", str7, "418");
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("444705404507775010000301066009");
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "242944834234834298365094927226" + "'", str9, "242944834234834298365094927226");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "947520970892682146009444878716" + "'", str11, "947520970892682146009444878716");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\013T\022\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffd\013T\022\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "36434863658119044450926928581" + "'", str13, "36434863658119044450926928581");
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.decrypt("170142287906490331954515313942");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd" + "'", str5, "\ufffd\ufffd");
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("\007\016\ufffd\ufffd\ufffd\ufffd\ufffd\021zl");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\000\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???(ZT?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "277" + "'", str11, "277");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "74" + "'", str13, "74");
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("113484804779532097642572840092");
        java.lang.String str17 = rSA1.decrypt("33522487042404985624");
        java.lang.String str19 = rSA1.encrypt("382194069583958");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\006\ufffd\ufffd\f\ufffd\ufffd\ufffd4YH1r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??d?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "366308673596645" + "'", str7, "366308673596645");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97633633" + "'", str11, "97633633");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "113" + "'", str15, "113");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\021" + "'", str17, "\001\021");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "205" + "'", str19, "205");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str19 = rSA1.encrypt("10855030069557170773849298528");
        java.lang.String str21 = rSA1.decrypt("512378925200691969490604727668");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "444491932559577" + "'", str7, "444491932559577");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "338" + "'", str11, "338");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "371" + "'", str19, "371");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "b" + "'", str21, "b");
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\006");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.encrypt("278806374250498767788908229396");
        java.lang.String str19 = rSA1.encrypt("1970770716349871");
        java.lang.String str21 = rSA1.encrypt("94");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2004688211416521" + "'", str7, "2004688211416521");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7776" + "'", str13, "7776");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "226073476693178181939619499455" + "'", str17, "226073476693178181939619499455");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "435891354404108761717510276880" + "'", str19, "435891354404108761717510276880");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "3140358001984" + "'", str21, "3140358001984");
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        java.lang.String str17 = rSA1.encrypt("178");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str21 = rSA1.decrypt("5469997232");
        java.lang.String str23 = rSA1.encrypt("287453852200194401992539143141");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("\000\ufffd\ufffd\ufffd\ufffd\u0738\u040b\ufffd\025");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\"\ufffd\ufffd" + "'", str13, "\002\ufffd\ufffd\"\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "699191455738852" + "'", str15, "699191455738852");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1871777939931396" + "'", str17, "1871777939931396");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "V" + "'", str21, "V");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "389" + "'", str23, "389");
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("410");
        java.lang.String str13 = rSA1.decrypt("99");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "602767804815818144936518470471" + "'", str9, "602767804815818144936518470471");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "555279335030838052613988495267" + "'", str11, "555279335030838052613988495267");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\004\ufffd\013\ufffd\007\032\ufffd" + "'", str13, "\b\004\ufffd\013\ufffd\007\032\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.decrypt("136");
        rSA1.generateKeys((int) ' ');
        java.lang.String str19 = rSA1.decrypt("2198391811700185");
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\001\ufffd\ufffd\ufffd\ufffd\u04dc\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?/J\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1290877820399695" + "'", str7, "1290877820399695");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2981835306454919" + "'", str13, "2981835306454919");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\003l\013\ufffd" + "'", str15, "\005\003l\013\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\030\ufffdwr" + "'", str19, "\030\ufffdwr");
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("77");
        java.lang.String str7 = rSA1.encrypt("4135191595");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("529936916062749373766053298845");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1625188068" + "'", str5, "1625188068");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1379807228" + "'", str7, "1379807228");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "105157133403300879287735575022" + "'", str11, "105157133403300879287735575022");
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004");
        java.lang.String str15 = rSA1.encrypt("1092327233");
        java.lang.String str17 = rSA1.encrypt("38254819939697411230932865771");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\005\ufffd\ufffd4\005");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??/ ?4?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "229132604174809420934386202002" + "'", str9, "229132604174809420934386202002");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "428465805863407820206621353273" + "'", str11, "428465805863407820206621353273");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "16384" + "'", str13, "16384");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "513789434352711447552006051163" + "'", str15, "513789434352711447552006051163");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "563352368073899707403266329599" + "'", str17, "563352368073899707403266329599");
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str19 = rSA1.decrypt("511");
        java.lang.String str21 = rSA1.encrypt("13087572778356868098099484487");
        java.lang.String str23 = rSA1.decrypt("30774062305666838944109687145");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1191186416255116" + "'", str7, "1191186416255116");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "338" + "'", str11, "338");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "216" + "'", str21, "216");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd" + "'", str23, "\000\ufffd");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("100935160444972936488645408652");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\001<Q]\026\ufffd\ufffd\ufffd\ufffd\005\ufffdc");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?<Q]\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffdU=\023" + "'", str7, "\002\ufffd\ufffd\ufffd\ufffd\ufffdU=\023");
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("378902689213189788900953928362");
        java.lang.String str15 = rSA1.decrypt("887836866708316");
        java.lang.String str17 = rSA1.encrypt("609650796");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "55327571762836" + "'", str13, "55327571762836");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\002\ufffd\ufffd&" + "'", str15, "\003\ufffd\ufffd\002\ufffd\ufffd&");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1365292223778245" + "'", str17, "1365292223778245");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("439161610538377200236688884473");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "316678507364531531328812851345" + "'", str9, "316678507364531531328812851345");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1312798181993593" + "'", str13, "1312798181993593");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1983477401768826" + "'", str15, "1983477401768826");
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        java.lang.String str15 = rSA1.encrypt("3264782225");
        java.lang.String str17 = rSA1.decrypt("316973227613881101828002122645");
        java.lang.String str19 = rSA1.decrypt("80");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44" + "'", str11, "44");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "151" + "'", str15, "151");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001" + "'", str17, "\001");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        java.lang.String str13 = rSA1.decrypt("214795012199997513219774055720");
        java.lang.String str15 = rSA1.encrypt("432373222534973726506934894382");
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.decrypt("366029008708059727875119417810");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1341987171804762" + "'", str7, "1341987171804762");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1731720909" + "'", str11, "1731720909");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd=#" + "'", str13, "\ufffd=#");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "62312282" + "'", str15, "62312282");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\u058c\ufffd\ufffd" + "'", str19, "\003\u058c\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("1929985830");
        java.lang.String str19 = rSA1.decrypt("87203191126925675072023416378");
        java.lang.String str21 = rSA1.encrypt("816581659876633");
        java.lang.String str23 = rSA1.encrypt("7681765521");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("\b\ufffd\ufffd\ufffd\u027a\ufffd\037\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "188469197490066457265568175548" + "'", str11, "188469197490066457265568175548");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "358598978006150086836065525945" + "'", str13, "358598978006150086836065525945");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "54" + "'", str17, "54");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "367" + "'", str21, "367");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "222" + "'", str23, "222");
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.decrypt("4");
        java.lang.String str11 = rSA1.decrypt("211673788539744279696210156906");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\007O\022\ufffd\ufffdv$");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?O???v$\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "510" + "'", str3, "510");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd~" + "'", str7, "\001\ufffd\ufffd~");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "wPKU" + "'", str9, "wPKU");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd" + "'", str11, "\001\ufffd\ufffd");
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("521834014122859");
        java.lang.String str13 = rSA1.decrypt("6647907366");
        java.lang.String str15 = rSA1.encrypt("1682803771672384");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "547893559427094282936189307547" + "'", str9, "547893559427094282936189307547");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "477434774454457700362728687952" + "'", str11, "477434774454457700362728687952");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\"\ufffd\ufffd\ufffd\ufffdD\016\ufffd" + "'", str13, "\002\ufffd\ufffd\"\ufffd\ufffd\ufffd\ufffdD\016\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "178739579818814183416364945911" + "'", str15, "178739579818814183416364945911");
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("1111166250865836");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "284" + "'", str5, "284");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "l" + "'", str7, "l");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "102" + "'", str9, "102");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97" + "'", str11, "97");
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("1929985830");
        java.lang.String str19 = rSA1.decrypt("87203191126925675072023416378");
        java.lang.String str21 = rSA1.encrypt("1090848745070355892392636574");
        java.lang.String str23 = rSA1.encrypt("1501827037763329");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "154786069296402701852956541496" + "'", str9, "154786069296402701852956541496");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "271927026286497194420805480589" + "'", str11, "271927026286497194420805480589");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "335511487484072099249416109161" + "'", str13, "335511487484072099249416109161");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "314" + "'", str17, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "!" + "'", str19, "!");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "146" + "'", str21, "146");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "176" + "'", str23, "176");
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "76" + "'", str5, "76");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "547" + "'", str9, "547");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str9 = rSA1.decrypt("156420681989455759137605914496");
        java.lang.String str11 = rSA1.encrypt("1247669252889969");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str5, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t3\"\ufffdQj\021\026\ufffd\000\ufffd" + "'", str9, "\t3\"\ufffdQj\021\026\ufffd\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "146704517611856194792807954776" + "'", str11, "146704517611856194792807954776");
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str19 = rSA1.decrypt("727767003863518");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\017\ufffdc\032\ufffd]" + "'", str13, "\007\017\ufffdc\032\ufffd]");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1027033839642862" + "'", str15, "1027033839642862");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\026\u065a\ufffd\032\ufffd\ufffd\r\\b@" + "'", str19, "\026\u065a\ufffd\032\ufffd\ufffd\r\\b@");
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str19 = rSA1.encrypt("725631497966009744199573661670");
        java.lang.String str21 = rSA1.encrypt("85876622623973");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1278376193892342" + "'", str15, "1278376193892342");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "6235788197998172932813966983" + "'", str19, "6235788197998172932813966983");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "252131052767330063092590824" + "'", str21, "252131052767330063092590824");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("37822311364830212583");
        java.lang.String str11 = rSA1.encrypt("576600425658183");
        java.lang.String str13 = rSA1.decrypt("252365513580659");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "y" + "'", str9, "y");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "191" + "'", str11, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("310952423287303162704207659970");
        java.lang.String str17 = rSA1.encrypt("884371775882389478461512527746");
        java.lang.String str19 = rSA1.encrypt("\003#I\007\ufffd\ufffd\ufffd\ufffd\nM");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "142175192236808325550600202081" + "'", str9, "142175192236808325550600202081");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd5=" + "'", str11, "\006\ufffd\ufffd\ufffd\ufffd\ufffd5=");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "423739349705893109587561069647" + "'", str15, "423739349705893109587561069647");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "630280833661330916137992539153" + "'", str17, "630280833661330916137992539153");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "726153673810753521151832178530" + "'", str19, "726153673810753521151832178530");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.decrypt("1028071702528");
        java.lang.String str19 = rSA1.encrypt("\nz\023\ufffd\ufffd");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "355406325966977" + "'", str7, "355406325966977");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "263444950629300" + "'", str13, "263444950629300");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4" + "'", str17, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "283" + "'", str19, "283");
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "207733850722994" + "'", str7, "207733850722994");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "617" + "'", str11, "617");
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "234" + "'", str5, "234");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "342" + "'", str7, "342");
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("125");
        java.lang.String str15 = rSA1.encrypt("1357889660519486");
        java.lang.String str17 = rSA1.decrypt("2354813854350387");
        java.lang.String str19 = rSA1.decrypt("765314849130516");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "145061480071656298274937294555" + "'", str9, "145061480071656298274937294555");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "145061480071656298274937294555" + "'", str11, "145061480071656298274937294555");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005" + "'", str13, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "398160797508971318114301917733" + "'", str15, "398160797508971318114301917733");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\034\ufffd\005\ufffd\ufffd\ufffd\ufffdw" + "'", str17, "\005\ufffd\034\ufffd\005\ufffd\ufffd\ufffd\ufffdw");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\022G\007ic" + "'", str19, "\007\ufffd\ufffd\ufffd\ufffd\022G\007ic");
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.encrypt("3775398402");
        java.lang.String str21 = rSA1.decrypt("3893026519");
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "164954352914751963031406225466" + "'", str9, "164954352914751963031406225466");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\027\006\ufffd\027)\007\ufffdST" + "'", str11, "\002\ufffd\ufffd\027\006\ufffd\027)\007\ufffdST");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "356070712972946644236182324529" + "'", str13, "356070712972946644236182324529");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "588647971624916" + "'", str19, "588647971624916");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\004\ufffddu\032\ufffd" + "'", str21, "\004\ufffddu\032\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        rSA1.generateKeys((int) ' ');
        java.lang.String str7 = rSA1.encrypt("141534893279925187594255106704");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\033U\023C" + "'", str3, "\ufffd\033U\023C");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "643002127" + "'", str7, "643002127");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("266");
        java.lang.String str13 = rSA1.decrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.decrypt("787439318926031104812953602702");
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\ufffd\ufffd8X\031$\001");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P" + "'", str11, "P");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "%" + "'", str15, "%");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "445" + "'", str17, "445");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("852");
        java.lang.String str11 = rSA1.decrypt("6367626140");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1868262391011384" + "'", str7, "1868262391011384");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffdeab" + "'", str9, "\002\ufffd\ufffdeab");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd\005\ufffd\002" + "'", str11, "\000\ufffd\ufffd\ufffd\005\ufffd\002");
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("Z");
        java.lang.String str11 = rSA1.encrypt("1422455974188443");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\006\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\"\ufffd\ufffd0" + "'", str5, "\001\"\ufffd\ufffd0");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5904900000" + "'", str9, "5904900000");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "580372658611554473146061546021" + "'", str11, "580372658611554473146061546021");
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("96");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\u01fe\ufffdz^\025\ufffd\ufffd\ufffd:");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1452840803547254" + "'", str7, "1452840803547254");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd" + "'", str11, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1231652475" + "'", str13, "1231652475");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("887836866708316");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\000\ufffd\ufffd\ufffd\u067b\ufffd\u0444\034");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357485952913322388300876347375" + "'", str9, "357485952913322388300876347375");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002E\035\ufffd\ufffd\345\u0550\ufffd\ufffd" + "'", str11, "\002E\035\ufffd\ufffd\345\u0550\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "214966978432184093166942550680" + "'", str13, "214966978432184093166942550680");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd'k4\036\ufffd\007" + "'", str15, "\003\ufffd\ufffd\ufffd'k4\036\ufffd\007");
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.decrypt("275650827612592659521534319728");
        java.lang.String str13 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffd\005\u027d");
        java.lang.String str15 = rSA1.encrypt("\003\ufffd\022\ufffd\ufffd\ufffd\ufffd7");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "76" + "'", str5, "76");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "628" + "'", str7, "628");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdoX" + "'", str11, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdoX");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "13394253701796588820586473261" + "'", str13, "13394253701796588820586473261");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "13667304985834616276945060746" + "'", str15, "13667304985834616276945060746");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        java.lang.String str15 = rSA1.decrypt("1858995041484385");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str19 = rSA1.decrypt("620029203");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "440054809549553712099527362980" + "'", str9, "440054809549553712099527362980");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "131801659810650648122229907618" + "'", str11, "131801659810650648122229907618");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + " \005\u0116\u04ee\ufffd\ufffdnA" + "'", str13, " \005\u0116\u04ee\ufffd\ufffdnA");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\u058e\ufffd\ufffd\ufffd\ufffd\ufffd\n\ufffdi" + "'", str15, "\006\ufffd\u058e\ufffd\ufffd\ufffd\ufffd\ufffd\n\ufffdi");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\t\ufffd\ufffd\t\ufffd\ufffd\ufffd{V\016\024" + "'", str19, "\001\t\ufffd\ufffd\t\ufffd\ufffd\ufffd{V\016\024");
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.decrypt("3989346653526533");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("|\035\u06a8");
        java.lang.String str19 = rSA1.encrypt("\ufffd\000\ufffd\ufffd\ufffd");
        java.lang.String str21 = rSA1.decrypt("84976429061760964534561967067");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "211" + "'", str5, "211");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "206" + "'", str7, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "24" + "'", str11, "24");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "13498077674163912603394291135" + "'", str17, "13498077674163912603394291135");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "37516027036764071481219171231" + "'", str19, "37516027036764071481219171231");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd\ufffd\ufffd\u39db\ufffd_s" + "'", str21, "\ufffd\ufffd\ufffd\u39db\ufffd_s");
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\025\ufffd\ufffd" + "'", str5, "\000\ufffd\025\ufffd\ufffd");
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("3844394415");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "377" + "'", str7, "377");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "42" + "'", str9, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\023" + "'", str11, "\023");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "25" + "'", str13, "25");
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("77");
        java.lang.String str7 = rSA1.encrypt("4135191595");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("894339554949041523705106573778");
        java.lang.String str13 = rSA1.encrypt("339257337319992927037122241849");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\007\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??eFK|?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "81283932" + "'", str5, "81283932");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "967233675" + "'", str7, "967233675");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\t" + "'", str11, "\002\ufffd\t");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2277285666329802" + "'", str13, "2277285666329802");
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("410");
        java.lang.String str5 = rSA1.decrypt("456351013126802");
        java.lang.String str7 = rSA1.encrypt("268370251453300563787314458062");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "230267507385712733420315233178" + "'", str3, "230267507385712733420315233178");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\b\ufffd\ufffd\t\ufffd\ufffd\ufffd\ufffd" + "'", str5, "\b\ufffd\ufffd\t\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "863432472289965272431399906714" + "'", str7, "863432472289965272431399906714");
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("1396895478287703");
        java.lang.String str5 = rSA1.encrypt("251943736018795");
        java.lang.String str7 = rSA1.encrypt("1024");
        java.lang.String str9 = rSA1.encrypt("32785009004481843571057639692");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffdgt" + "'", str3, "\001\ufffdgt");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "836833405" + "'", str5, "836833405");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "872541626" + "'", str7, "872541626");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "945703680" + "'", str9, "945703680");
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("95057093174212120272332960514");
        java.lang.String str11 = rSA1.encrypt("155795685895605173480434209421");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "211" + "'", str5, "211");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003[" + "'", str7, "\003[");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "285" + "'", str9, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "597" + "'", str11, "597");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1579539181348398");
        java.lang.String str13 = rSA1.encrypt("\003");
        java.lang.String str15 = rSA1.decrypt("307641391968194344643523456830");
        java.lang.String str17 = rSA1.encrypt("253884834105822557075962649811");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "190146662016023" + "'", str7, "190146662016023");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "270" + "'", str11, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "243" + "'", str13, "243");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "131" + "'", str17, "131");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        java.lang.String str9 = rSA1.encrypt("\b\u072b\ufffd\r\023#\033\ufffd\ufffd");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1934458414" + "'", str3, "1934458414");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4821490714" + "'", str7, "4821490714");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3963726711" + "'", str9, "3963726711");
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        rSA1.generateKeys((int) ' ');
        java.lang.String str7 = rSA1.encrypt("141534893279925187594255106704");
        java.lang.String str9 = rSA1.encrypt("210378250090253374708038199698");
        java.lang.String str11 = rSA1.decrypt("227");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\034" + "'", str3, "\004\ufffd\ufffd\ufffd\ufffd\034");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "337462491" + "'", str7, "337462491");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2573480296" + "'", str9, "2573480296");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd" + "'", str11, "\ufffd\ufffd");
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("37822311364830212583");
        java.lang.String str11 = rSA1.encrypt("576600425658183");
        java.lang.String str13 = rSA1.decrypt("252365513580659");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161" + "'", str3, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002M" + "'", str5, "\002M");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\027" + "'", str7, "\027");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001b" + "'", str9, "\001b");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "683" + "'", str11, "683");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "g" + "'", str13, "g");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "172096057616168529091191859759" + "'", str3, "172096057616168529091191859759");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("852");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("740640061907461");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2236133984538810" + "'", str7, "2236133984538810");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffdq+p" + "'", str9, "\000\ufffd\ufffd\ufffdq+p");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("37822311364830212583");
        java.lang.String str11 = rSA1.encrypt("576600425658183");
        java.lang.String str13 = rSA1.decrypt("252365513580659");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("555793519177444192636172018711");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007" + "'", str9, "\007");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "210" + "'", str11, "210");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b" + "'", str13, "\b");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "540742921466967241983934839893" + "'", str17, "540742921466967241983934839893");
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        java.lang.String str7 = rSA1.encrypt("276");
        java.lang.String str9 = rSA1.decrypt("639857867348047546651687203467");
        java.lang.String str11 = rSA1.decrypt("478908770438626");
        java.lang.String str13 = rSA1.encrypt("16754311183890614334413354588");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "802407299" + "'", str3, "802407299");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7704207059" + "'", str5, "7704207059");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3447372918" + "'", str7, "3447372918");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffdu" + "'", str11, "\ufffdu");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5520096949" + "'", str13, "5520096949");
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        java.lang.String str17 = rSA1.encrypt("178");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "73" + "'", str3, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffdHo\b\ufffdv" + "'", str13, "\003\ufffdHo\b\ufffdv");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1081594593049006" + "'", str15, "1081594593049006");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "418576320442001" + "'", str17, "418576320442001");
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.decrypt("86");
        java.lang.String str17 = rSA1.encrypt("119579939769595636001061");
        java.lang.String str19 = rSA1.decrypt("603377111727349");
        java.lang.String str21 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\016\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "V" + "'", str15, "V");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "447" + "'", str17, "447");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001Y" + "'", str19, "\001Y");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "383" + "'", str21, "383");
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.decrypt("829");
        java.lang.String str5 = rSA1.encrypt("?");
        java.lang.String str7 = rSA1.encrypt("\002\u0699[?\024\ufffd\ufffd\ufffd\022Ej");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\005\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd/&A" + "'", str3, "\005\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd/&A");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "992436543" + "'", str5, "992436543");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "58776389269675964706186250296" + "'", str7, "58776389269675964706186250296");
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.encrypt("6318253741");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("688");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1564639908926265" + "'", str7, "1564639908926265");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "193" + "'", str13, "193");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\004\ufffd\ufffd\ufffd" + "'", str17, "\ufffd\ufffd\004\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.encrypt("702947451550003778719770877111");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "463" + "'", str3, "463");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "590729465" + "'", str7, "590729465");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7233898955" + "'", str9, "7233898955");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3758481091" + "'", str11, "3758481091");
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\006");
        java.lang.String str15 = rSA1.encrypt("1396245536455160");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1838026193328265" + "'", str7, "1838026193328265");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7776" + "'", str13, "7776");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1325291008638148" + "'", str15, "1325291008638148");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.decrypt("86");
        java.lang.String str17 = rSA1.encrypt("4597126594");
        java.lang.String str19 = rSA1.encrypt("2085265707");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "J" + "'", str15, "J");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "173" + "'", str17, "173");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "408" + "'", str19, "408");
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("96");
        rSA1.generateKeys((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.decrypt("\002\ufffd\ufffd\ufffd\030");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???>[??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "219" + "'", str3, "219");
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("\ufffd\ufffd<\013\ufffd\024\f\ufffd\021");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\ufffd" + "'", str3, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "733476739742462" + "'", str5, "733476739742462");
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.encrypt("5904631369");
        java.lang.String str11 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffd2");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "676540287867265" + "'", str7, "676540287867265");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "910160641264313" + "'", str9, "910160641264313");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "892261335202880" + "'", str11, "892261335202880");
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        java.lang.String str11 = rSA1.encrypt("\025\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdr\013\ufffd");
        java.lang.String str13 = rSA1.encrypt("208");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "456" + "'", str7, "456");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "299" + "'", str9, "299");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "491" + "'", str11, "491");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "42" + "'", str13, "42");
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str15 = rSA1.decrypt("1311807268931843");
        java.lang.String str17 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\016\ufffd\ufffd\ufffd\005\004");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "140608" + "'", str9, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "175616000" + "'", str11, "175616000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\ufffd\u04c9\ufffd\ufffde\004\ufffd\ufffd\ufffd\001" + "'", str15, "\t\ufffd\u04c9\ufffd\ufffde\004\ufffd\ufffd\ufffd\001");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "429552188206825425208802585818" + "'", str17, "429552188206825425208802585818");
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("313145417605523375439450352290");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("1699026177576345");
        java.lang.String str19 = rSA1.encrypt("\003\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "510" + "'", str3, "510");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4096970021" + "'", str7, "4096970021");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4866225741" + "'", str9, "4866225741");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\022T" + "'", str11, "\001\ufffd\ufffd\022T");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3955620552" + "'", str13, "3955620552");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "462618734508083" + "'", str17, "462618734508083");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1213820701960157" + "'", str19, "1213820701960157");
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("1150231073335486");
        java.lang.String str13 = rSA1.encrypt("171637622630321055768329963023");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "124441223706220009124932717527" + "'", str13, "124441223706220009124932717527");
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\200\ufffd!\023\ufffd\ufffd\ufffd4");
        java.lang.String str17 = rSA1.decrypt("2354813854350387");
        java.lang.String str19 = rSA1.encrypt("\005\ufffd\ufffd\033\ufffd\ufffdu%");
        java.lang.String str21 = rSA1.decrypt("3566878757");
        java.lang.String str23 = rSA1.encrypt("17117520847372171639957514428");
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "609367647631583" + "'", str7, "609367647631583");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007N\005\ufffd" + "'", str9, "\007N\005\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1945913864592437" + "'", str13, "1945913864592437");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3044294123206541" + "'", str15, "3044294123206541");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\035\ufffd\ufffd\020p" + "'", str17, "\003\ufffd\035\ufffd\ufffd\020p");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2232890650772139" + "'", str19, "2232890650772139");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\f\ufffd\ufffd\ufffd" + "'", str21, "\003\f\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1183883942746330" + "'", str23, "1183883942746330");
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("1929985830");
        java.lang.String str19 = rSA1.decrypt("87203191126925675072023416378");
        java.lang.String str21 = rSA1.encrypt("1090848745070355892392636574");
        java.lang.String str23 = rSA1.encrypt("1501827037763329");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "379264796716850183982593499482" + "'", str9, "379264796716850183982593499482");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "794954677176411128071440340584" + "'", str11, "794954677176411128071440340584");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "182272567380671064030569323410" + "'", str13, "182272567380671064030569323410");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "181" + "'", str17, "181");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "241" + "'", str21, "241");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "271" + "'", str23, "271");
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("257");
        java.lang.String str17 = rSA1.decrypt("608858562594023");
        java.lang.String str19 = rSA1.encrypt("611943475129151");
        java.lang.String str21 = rSA1.decrypt("28771434551552552060887602754");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1561172248348063" + "'", str7, "1561172248348063");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "226" + "'", str15, "226");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "265" + "'", str19, "265");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002^" + "'", str21, "\002^");
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "281884956835400821318637343612" + "'", str3, "281884956835400821318637343612");
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("125");
        java.lang.String str15 = rSA1.encrypt("1357889660519486");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str21 = rSA1.decrypt("3");
        java.lang.String str23 = rSA1.decrypt("2991779966325886");
        rSA1.generateKeys(10);
        java.lang.String str27 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.encrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "142867073861622618103788026686" + "'", str9, "142867073861622618103788026686");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "142867073861622618103788026686" + "'", str11, "142867073861622618103788026686");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffdo&\035M\"\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\006\ufffdo&\035M\"\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "8309122187342874316936485796" + "'", str15, "8309122187342874316936485796");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\004\ufffd\ufffd\ufffd\u0752\016\ufffd\005\ufffd\ufffd" + "'", str21, "\004\ufffd\ufffd\ufffd\u0752\016\ufffd\005\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\004\ufffd\ufffd\ufffd\026\ufffd\ufffd\ufffd=\002\ufffd" + "'", str23, "\001\004\ufffd\ufffd\ufffd\026\ufffd\ufffd\ufffd=\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "181" + "'", str27, "181");
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("241");
        java.lang.String str15 = rSA1.encrypt("48545501064253568549105436091");
        java.lang.String str17 = rSA1.encrypt("661295819657843");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str21 = rSA1.encrypt("582");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "258" + "'", str13, "258");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "277" + "'", str15, "277");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "73" + "'", str17, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "279" + "'", str21, "279");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "173269060831182" + "'", str7, "173269060831182");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "237" + "'", str11, "237");
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        java.lang.String str13 = rSA1.encrypt("567489291482222151985241898549");
        java.lang.String str15 = rSA1.decrypt("961072818614308");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str19 = rSA1.decrypt("1169622249");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "77564911592616118680553844977" + "'", str9, "77564911592616118680553844977");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "770145750081764636114443212363" + "'", str11, "770145750081764636114443212363");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "198715491532974164880815864318" + "'", str13, "198715491532974164880815864318");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd\ufffd\007\ufffd*J9\025" + "'", str15, "\ufffd\ufffd\ufffd\007\ufffd*J9\025");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{" + "'", str19, "{");
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.decrypt("674932422672366921537205620483");
        java.lang.String str9 = rSA1.encrypt("34157020103984569493819670058");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161" + "'", str3, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "112" + "'", str5, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "408" + "'", str9, "408");
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        java.lang.String str13 = rSA1.encrypt("589095713527447830713051752917");
        java.lang.String str15 = rSA1.encrypt("\007\ufffd\ufffd\u0117\ufffdNa ");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1258589840203604" + "'", str7, "1258589840203604");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "325" + "'", str11, "325");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "175" + "'", str13, "175");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "16" + "'", str15, "16");
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "59848580402523180972934958513" + "'", str9, "59848580402523180972934958513");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "37822311364830212583" + "'", str11, "37822311364830212583");
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("1929985830");
        java.lang.String str19 = rSA1.decrypt("87203191126925675072023416378");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "547293864831637866359906148315" + "'", str9, "547293864831637866359906148315");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "500490023242018282031361604174" + "'", str11, "500490023242018282031361604174");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "46089182194821494872491008162" + "'", str13, "46089182194821494872491008162");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "177" + "'", str17, "177");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{" + "'", str19, "{");
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "688146781921989" + "'", str7, "688146781921989");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd" + "'", str9, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "240450952230881" + "'", str13, "240450952230881");
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("352");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "148" + "'", str5, "148");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "N" + "'", str7, "N");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3029374497" + "'", str11, "3029374497");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("380204032");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\u0490\ufffd\ufffd0{" + "'", str13, "\005\u0490\ufffd\ufffd0{");
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("125");
        java.lang.String str15 = rSA1.encrypt("1357889660519486");
        java.lang.String str17 = rSA1.decrypt("2354813854350387");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "312881755740750566310974741403" + "'", str9, "312881755740750566310974741403");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "312881755740750566310974741403" + "'", str11, "312881755740750566310974741403");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\b\ufffd\016\f\ufffd\027\035\ufffd\ufffd" + "'", str13, "\005\b\ufffd\016\f\ufffd\027\035\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "283488998316433768740365969639" + "'", str15, "283488998316433768740365969639");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\f\ufffd\ufffd\ufffd\ufffda\177\ufffd" + "'", str17, "\004\f\ufffd\ufffd\ufffd\ufffda\177\ufffd");
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("805201222");
        java.lang.String str9 = rSA1.decrypt("436888915925883347513701815904");
        java.lang.String str11 = rSA1.encrypt("\f\ufffdU\177\ufffd\002\ufffd\ufffd\177\ufffd~\b");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "495" + "'", str11, "495");
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "174" + "'", str3, "174");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11183661421" + "'", str7, "11183661421");
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str19 = rSA1.encrypt("349621352405848");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1214699943378479" + "'", str7, "1214699943378479");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "369" + "'", str11, "369");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "569" + "'", str19, "569");
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("48");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "772311081412852252566149679915" + "'", str9, "772311081412852252566149679915");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "76289550880965645741255032832" + "'", str11, "76289550880965645741255032832");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.decrypt("156420681989455759137605914496");
        java.lang.String str13 = rSA1.decrypt("3531439932933077");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "683317066342473" + "'", str7, "683317066342473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\ufffd\ufffd" + "'", str9, "\007\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\026|j\002\ufffd\ufffd" + "'", str11, "\007\026|j\002\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffd!uH" + "'", str13, "\007\ufffd\ufffd!uH");
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("16384");
        java.lang.String str13 = rSA1.decrypt("394641110643206533541912183688");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\001\ufffd\ufffd\000\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??x3???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "163" + "'", str7, "163");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001X" + "'", str13, "\001X");
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("1408514752349");
        java.lang.String str17 = rSA1.decrypt("715760744860764417509469677307");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "442303298021293" + "'", str7, "442303298021293");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "160" + "'", str15, "160");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\016" + "'", str17, "\001\016");
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("257");
        java.lang.String str17 = rSA1.decrypt("608858562594023");
        java.lang.String str19 = rSA1.encrypt("611943475129151");
        java.lang.String str21 = rSA1.decrypt("28771434551552552060887602754");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "63422471859776" + "'", str7, "63422471859776");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "135" + "'", str15, "135");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "516" + "'", str19, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("515");
        java.lang.String str13 = rSA1.decrypt("1254984174338675");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\027" + "'", str11, "\002\027");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("440342891669040828628643711699");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "9" + "'", str11, "9");
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        java.lang.String str5 = rSA1.decrypt("6591173097");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\003" + "'", str3, "\001\003");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("4");
        java.lang.String str17 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str19 = rSA1.encrypt("758210078578159280931259695371");
        java.lang.String str21 = rSA1.decrypt("487935535487070858957381010441");
        java.lang.String str23 = rSA1.decrypt("2841083509699038");
        java.lang.String str25 = rSA1.encrypt("2038399816887970");
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "210440866077722" + "'", str7, "210440866077722");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\u0257\ufffd\ufffd" + "'", str9, "\004\u0257\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1069304780413577" + "'", str13, "1069304780413577");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "380204032" + "'", str15, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1301183264105891" + "'", str17, "1301183264105891");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "635541767064036" + "'", str19, "635541767064036");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\ufffd\ufffd\b\ufffd" + "'", str21, "\003\ufffd\ufffd\b\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd\f\ufffd" + "'", str23, "\001\ufffd\f\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "896083827050929" + "'", str25, "896083827050929");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "556" + "'", str3, "556");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd~\026" + "'", str7, "\001\ufffd~\026");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str9, "\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("153853134159497141190339455222");
        java.lang.String str11 = rSA1.decrypt("477335194284590038441746180824");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.decrypt("586614665667193");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\001-X#*");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "249789657787793" + "'", str7, "249789657787793");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005I\006\ufffd\ufffd\ufffd" + "'", str9, "\005I\006\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd!h" + "'", str11, "\001\ufffd\ufffd!h");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u3cd3\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\u3cd3\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("153853134159497141190339455222");
        java.lang.String str11 = rSA1.decrypt("3060553596769532");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "121108154590646" + "'", str7, "121108154590646");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\034\ufffdhF0*" + "'", str9, "\004\034\ufffdhF0*");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\031" + "'", str11, "\006\ufffd\ufffd\031");
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.decrypt("17862321440275");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\ufffd\u06de\ufffd\ufffd" + "'", str7, "\005\ufffd\u06de\ufffd\ufffd");
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("3844394415");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.decrypt("30774062305666838944109687145");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\001\ufffd\ufffd\\\ufffd\ufffd\ufffd `b\023");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?xS?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "385" + "'", str7, "385");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19" + "'", str9, "19");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "=" + "'", str11, "=");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "217" + "'", str13, "217");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd" + "'", str17, "\003\ufffd");
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("257");
        java.lang.String str17 = rSA1.decrypt("608858562594023");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1824841946646356" + "'", str7, "1824841946646356");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "632" + "'", str15, "632");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd" + "'", str17, "\002\ufffd");
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        java.lang.String str17 = rSA1.encrypt("178");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str21 = rSA1.encrypt("\000\ufffd\ufffd\ufffd");
        java.lang.String str23 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u37fb\ufffd3*");
        java.lang.String str25 = rSA1.decrypt("1629935995");
        java.lang.String str27 = rSA1.encrypt("\001\ufffd\ufffd\ufffd");
        java.lang.String str29 = rSA1.encrypt("42400116637624927000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = rSA1.decrypt("\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd\030");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\u8b0e\ufffd\016\ufffd" + "'", str13, "\005\u8b0e\ufffd\016\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2294446039178585" + "'", str15, "2294446039178585");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2127386271164188" + "'", str17, "2127386271164188");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "62" + "'", str21, "62");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "313" + "'", str23, "313");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\ufffd" + "'", str25, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "500" + "'", str27, "500");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "118" + "'", str29, "118");
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str11 = rSA1.encrypt("104505243654056990127866040198");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "192" + "'", str5, "192");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "483" + "'", str9, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "46" + "'", str11, "46");
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str15 = rSA1.decrypt("1630771903");
        rSA1.generateKeys(100);
        java.lang.String str19 = rSA1.encrypt("515048652255986807530604950322");
        java.lang.String str21 = rSA1.decrypt("210042137223046135642776229402");
        java.lang.String str23 = rSA1.encrypt("382505594");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "788938706937639" + "'", str13, "788938706937639");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\020\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\b\020\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "695249323362848526948096381542" + "'", str19, "695249323362848526948096381542");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\0074&U\0221\n\ufffd\ufffd\ufffd\ufffdC" + "'", str21, "\0074&U\0221\n\ufffd\ufffd\ufffd\ufffdC");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "276214931931094473476146594019" + "'", str23, "276214931931094473476146594019");
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.decrypt("806729601483697513872336243167");
        java.lang.String str13 = rSA1.decrypt("501195949644590220355519211967");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "212326042933811501872087753897" + "'", str9, "212326042933811501872087753897");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\b\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\005\ufffd\ufffd\b\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004v\177\ufffd\"\017\ufffd\ufffd" + "'", str13, "\004v\177\ufffd\"\017\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
        java.lang.String str15 = rSA1.decrypt("324");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1177237388710047" + "'", str7, "1177237388710047");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "284905378629548213646274893734" + "'", str13, "284905378629548213646274893734");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\004\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\003\ufffd\ufffd\ufffd\004\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.encrypt("138080889686499893923847624");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "604627711743083816482593774735" + "'", str9, "604627711743083816482593774735");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "244329122059977784916506140454" + "'", str11, "244329122059977784916506140454");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "135805714754660552588728014489" + "'", str13, "135805714754660552588728014489");
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("2228954831817383");
        java.lang.String str11 = rSA1.encrypt("418698583979656307630973590279");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "453425143800295698865379092283" + "'", str9, "453425143800295698865379092283");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "149600064820223946579047955636" + "'", str11, "149600064820223946579047955636");
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str5 = rSA1.encrypt("366134921863826681397752986980");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "86" + "'", str5, "86");
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.decrypt("86");
        java.lang.String str17 = rSA1.encrypt("4597126594");
        java.lang.String str19 = rSA1.encrypt("512");
        java.lang.String str21 = rSA1.encrypt("199");
        java.lang.String str23 = rSA1.encrypt("348");
        java.lang.String str25 = rSA1.encrypt("1230363619032745");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001w" + "'", str15, "\001w");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "407" + "'", str17, "407");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "40" + "'", str19, "40");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "101" + "'", str21, "101");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "380" + "'", str23, "380");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "88" + "'", str25, "88");
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.decrypt("1929985830");
        java.lang.String str15 = rSA1.decrypt("94");
        java.lang.String str17 = rSA1.decrypt("228");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "587680198325319147298386455897" + "'", str9, "587680198325319147298386455897");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "9700778154799063360797276739" + "'", str11, "9700778154799063360797276739");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd\ufffd\033\ufffd\ufffd>\017" + "'", str13, "\006\ufffd\ufffd\ufffd\033\ufffd\ufffd>\017");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\0024\037\u07ff\ufffd\ufffd\ufffd8" + "'", str17, "\0024\037\u07ff\ufffd\ufffd\ufffd8");
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("1863031711965363");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.decrypt("900764034");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "540578322830872259908185601083" + "'", str9, "540578322830872259908185601083");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "199669253539200539690533376352" + "'", str11, "199669253539200539690533376352");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\ufffd\016q\t\ufffd8<" + "'", str17, "\001\ufffd\ufffd\ufffd\016q\t\ufffd8<");
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("1863031711965363");
        java.lang.String str17 = rSA1.decrypt("547173891878268756953688155445");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72046287227829630859029674963" + "'", str9, "72046287227829630859029674963");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\ufffd\ufffd\ufffd\022\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\\\ufffd\ufffd\ufffd\022\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "49164506826916626071841692867" + "'", str13, "49164506826916626071841692867");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "52877718049156637678419107913" + "'", str15, "52877718049156637678419107913");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\003\002\ufffd\ufffd\ufffd\ufffd\ufffd[\033_" + "'", str17, "\001\ufffd\003\002\ufffd\ufffd\ufffd\ufffd\ufffd[\033_");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("125");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("316122467681240453933759998604");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "22272730006193245291488048496" + "'", str9, "22272730006193245291488048496");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "22272730006193245291488048496" + "'", str11, "22272730006193245291488048496");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005" + "'", str13, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "174102933244162044551601460989" + "'", str17, "174102933244162044551601460989");
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        java.lang.String str15 = rSA1.decrypt("1858995041484385");
        java.lang.String str17 = rSA1.encrypt("1016767462448868");
        java.lang.String str19 = rSA1.decrypt("1627408822");
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "248116503466552029583735638855" + "'", str9, "248116503466552029583735638855");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "79563710022111819217083738292" + "'", str11, "79563710022111819217083738292");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\005\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffdR3zp\037\ufffd\ufffd\ufffd" + "'", str15, "\004\ufffdR3zp\037\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "233285199109904839767555259790" + "'", str17, "233285199109904839767555259790");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\021\ufffd\ufffdge5~M\f\ufffd\ufffd" + "'", str19, "\002\021\ufffd\ufffdge5~M\f\ufffd\ufffd");
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("86");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\031\ufffd\ufffd\b\ufffd" + "'", str7, "\001\ufffd\ufffd\ufffd\ufffd\031\ufffd\ufffd\b\ufffd");
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        java.lang.String str13 = rSA1.decrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("576");
        java.lang.String str19 = rSA1.decrypt("669");
        java.lang.String str21 = rSA1.encrypt("674932422672366921537205620483");
        java.lang.String str23 = rSA1.decrypt("1626194565");
        java.lang.String str25 = rSA1.encrypt("\000\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = rSA1.decrypt("\005\026\ufffd\b\ufffd\ufffdf");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??????f\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "322217558583831160648007861360" + "'", str9, "322217558583831160648007861360");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdA" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdA");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\u0544\ufffd\ufffd\ufffd\036\u06e9" + "'", str17, "\ufffd\u0544\ufffd\ufffd\ufffd\036\u06e9");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\f\u0110\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\f\u0110\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "34409905927652321408480821842" + "'", str21, "34409905927652321408480821842");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd\ufffd\ufffd\t-\n\ufffd\ufffd" + "'", str23, "\000\ufffd\ufffd\ufffd\t-\n\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "19446640318382041125289863164" + "'", str25, "19446640318382041125289863164");
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1579539181348398");
        java.lang.String str13 = rSA1.encrypt("\003");
        java.lang.String str15 = rSA1.decrypt("307641391968194344643523456830");
        java.lang.String str17 = rSA1.decrypt("119293537935107");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "835678213978028" + "'", str7, "835678213978028");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "178" + "'", str11, "178");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "27" + "'", str13, "27");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001y" + "'", str15, "\001y");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.decrypt("3530960715");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.decrypt("\007\027\ufffd\ufffd\030");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??s?y??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "19" + "'", str3, "19");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("1629935995");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "387" + "'", str11, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffdri[\031\ub9cd\ufffd" + "'", str13, "\003\ufffd\ufffd\ufffdri[\031\ub9cd\ufffd");
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        java.lang.String str15 = rSA1.decrypt("1858995041484385");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "28993963227474153171543636017" + "'", str9, "28993963227474153171543636017");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "90035045659317662983409778327" + "'", str11, "90035045659317662983409778327");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffdP\020\ufffd\b\ufffd\ufffd\035\ufffd" + "'", str13, "\004\ufffdP\020\ufffd\b\ufffd\ufffd\035\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ru" + "'", str15, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ru");
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("577925724882894");
        java.lang.String str13 = rSA1.encrypt("1976051006651625");
        java.lang.String str15 = rSA1.encrypt("_");
        java.lang.String str17 = rSA1.encrypt("403513036606125876254262217813");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "385" + "'", str11, "385");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "264" + "'", str13, "264");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "266" + "'", str15, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7" + "'", str17, "7");
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\033\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("5799003948");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str19 = rSA1.encrypt("196777756323469683884737199099");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\005" + "'", str7, "\002\005");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1939865171550982" + "'", str11, "1939865171550982");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970147847381594" + "'", str13, "1970147847381594");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "540113194907595" + "'", str15, "540113194907595");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "287711787647499648585625574866" + "'", str19, "287711787647499648585625574866");
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.decrypt("4");
        java.lang.String str11 = rSA1.decrypt("211673788539744279696210156906");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "510" + "'", str3, "510");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd" + "'", str7, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\017\ufffd\032" + "'", str9, "\000\ufffd\017\ufffd\032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd" + "'", str11, "\001\ufffd\ufffd");
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        java.lang.String str13 = rSA1.decrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("1534903236613159");
        rSA1.generateKeys((int) 'a');
        java.lang.String str21 = rSA1.encrypt("914181283893724");
        java.lang.String str23 = rSA1.encrypt("8358993001");
        java.lang.String str25 = rSA1.encrypt("\f\035\027\026\ufffd\ufffd\ufffd\t\020\ufffd\u03e0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = rSA1.decrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\001\ufffd?");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"<4s\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffdq5\007\033\ufffd\ufffd\ufffdY" + "'", str11, "\005\ufffd\ufffdq5\007\033\ufffd\ufffd\ufffdY");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\013\f\ufffd\036\ufffd\u06a2\u06b7\ufffd\ufffd" + "'", str13, "\013\f\ufffd\036\ufffd\u06a2\u06b7\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\u6753g\002\ufffd\007\ufffd&8" + "'", str17, "\ufffd\u6753g\002\ufffd\007\ufffd&8");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "7906000071741863291462311751" + "'", str21, "7906000071741863291462311751");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "39879695358612386105984960536" + "'", str23, "39879695358612386105984960536");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "442472131268661018536111220" + "'", str25, "442472131268661018536111220");
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("250147309");
        java.lang.String str17 = rSA1.encrypt("887836866708316");
        rSA1.generateKeys((int) 'a');
        java.lang.String str21 = rSA1.encrypt("\000\ufffd\037\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) 'a');
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "78090796852984402934663266508" + "'", str9, "78090796852984402934663266508");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\u0255\ufffd\ufffd\u065f\ufffd" + "'", str11, "\006\ufffd\ufffd\u0255\ufffd\ufffd\u065f\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "706290863385362634412799508043" + "'", str13, "706290863385362634412799508043");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02aen<" + "'", str15, "\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02aen<");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "235884001252210761354077019699" + "'", str17, "235884001252210761354077019699");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "20399373209159132001269093941" + "'", str21, "20399373209159132001269093941");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("77");
        java.lang.String str7 = rSA1.encrypt("\003\ufffd\ufffd");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3212833539" + "'", str5, "3212833539");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3254469288" + "'", str7, "3254469288");
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("454458126693189319650194474059");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "77" + "'", str5, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "404" + "'", str7, "404");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "16" + "'", str11, "16");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        java.lang.String str13 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\ufffd<");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("3357727758788");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1028071702528" + "'", str9, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "17270948495360000000" + "'", str11, "17270948495360000000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "73124226826797024677801848546" + "'", str13, "73124226826797024677801848546");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "58975782668721114604600439721" + "'", str17, "58975782668721114604600439721");
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str9 = rSA1.decrypt("156420681989455759137605914496");
        java.lang.String str11 = rSA1.encrypt("1247669252889969");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\037\ufffd\ufffd\ufffd" + "'", str5, "\037\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\ufffd\ufffd\u052b\ufffd\ufffdqj%c" + "'", str9, "\007\ufffd\ufffd\u052b\ufffd\ufffdqj%c");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "161843310185372290747688268844" + "'", str11, "161843310185372290747688268844");
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("63126036322318");
        java.math.BigInteger bigInteger4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = rSA1.encrypt(bigInteger4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\013" + "'", str3, "\ufffd\013");
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\002\ufffd\ufffd\177\b\ufffd");
        java.lang.String str13 = rSA1.decrypt("1030676276581334");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\005" + "'", str5, "\002\005");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "408" + "'", str7, "408");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "114947681987826635821037110782" + "'", str11, "114947681987826635821037110782");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd-" + "'", str13, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd-");
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("\004\n\ufffd\ufffd\033\ufffd\020\ufffd\ufffd\007");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3007968898" + "'", str3, "3007968898");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4787012963" + "'", str5, "4787012963");
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.decrypt("239533509989569937544099898666");
        java.lang.String str17 = rSA1.encrypt("518");
        java.lang.String str19 = rSA1.encrypt("742967833984678");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "30387551668371" + "'", str7, "30387551668371");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\001\ufffd\ufffd\ufffd\u0553\032\f" + "'", str15, "\004\001\ufffd\ufffd\ufffd\u0553\032\f");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "378462559794394441370420177700" + "'", str17, "378462559794394441370420177700");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "121102710980721655106916074412" + "'", str19, "121102710980721655106916074412");
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        java.lang.String str15 = rSA1.decrypt("538621452366062192513302577482");
        java.lang.String str17 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdW2");
        java.lang.String str19 = rSA1.encrypt("853");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "753467160555698963505358630200" + "'", str9, "753467160555698963505358630200");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "249027584289935131315499612918" + "'", str11, "249027584289935131315499612918");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "902068368830746614041923270273" + "'", str13, "902068368830746614041923270273");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\013g\007\ufffd\ufffdm\033\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\013g\007\ufffd\ufffdm\033\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "259095351498820998590998098902" + "'", str17, "259095351498820998590998098902");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "37065556339205652744665263295" + "'", str19, "37065556339205652744665263295");
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("250147309");
        java.lang.String str17 = rSA1.encrypt("887836866708316");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19678049555112270006666934803" + "'", str9, "19678049555112270006666934803");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\0139\001\"\ufffd\ufffd" + "'", str11, "\003\ufffd\0139\001\"\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "211777807989122180625901035975" + "'", str13, "211777807989122180625901035975");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\002\ufffd\ufffd\ufffd\ufffdn`H\006\ufffd\ufffd" + "'", str15, "\t\002\ufffd\ufffd\ufffd\ufffdn`H\006\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "626969413771882932862397899415" + "'", str17, "626969413771882932862397899415");
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.encrypt("4334658428");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "148" + "'", str5, "148");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "227" + "'", str7, "227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "17091066386595751958651510091" + "'", str11, "17091066386595751958651510091");
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        java.lang.String str13 = rSA1.decrypt("698830179104320016788462155306");
        rSA1.generateKeys((int) '#');
        java.lang.String str17 = rSA1.encrypt("326");
        java.lang.String str19 = rSA1.encrypt("164341563462254592");
        java.lang.String str21 = rSA1.encrypt("313");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "140608" + "'", str9, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "175616000" + "'", str11, "175616000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\037\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\037\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "742536761" + "'", str17, "742536761");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "5897854869" + "'", str19, "5897854869");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "6541925001" + "'", str21, "6541925001");
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("2064440430059638");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\005\ufffd\ufffd2");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?M>T??2\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "317090973607349146280478725505" + "'", str11, "317090973607349146280478725505");
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "656" + "'", str5, "656");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "679" + "'", str7, "679");
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("197");
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffdN\033\ufffd\u062a");
        java.lang.String str19 = rSA1.encrypt("1931499264044464");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\002\u071a\u0715\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "569600511551634893128844161302" + "'", str9, "569600511551634893128844161302");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\004\ufffd\ufffd\ufffd" + "'", str11, "\006\ufffd\ufffd\ufffd\ufffd\004\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "593485644735322382299310942873" + "'", str13, "593485644735322382299310942873");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "142575025850644966111991856311" + "'", str15, "142575025850644966111991856311");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7735776632674726307744734365" + "'", str17, "7735776632674726307744734365");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "343814723410413637571629371432" + "'", str19, "343814723410413637571629371432");
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str19 = rSA1.decrypt("1140138270580326");
        java.lang.String str21 = rSA1.decrypt("3357727758788");
        java.lang.String str23 = rSA1.encrypt("1020627982397696");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3872983571846909" + "'", str7, "3872983571846909");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "53" + "'", str11, "53");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "215" + "'", str23, "215");
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("\000\u038e\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "51" + "'", str17, "51");
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("4");
        java.lang.String str17 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str19 = rSA1.decrypt("2136143561998568");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2106434676194545" + "'", str7, "2106434676194545");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\024\ufffd\ufffd\ufffd\017" + "'", str9, "\005\024\ufffd\ufffd\ufffd\017");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "607662210051411" + "'", str11, "607662210051411");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2526708772409788" + "'", str13, "2526708772409788");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1028071702528" + "'", str15, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1244023443323428" + "'", str17, "1244023443323428");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd;" + "'", str19, "\004\ufffd\ufffd\ufffd\ufffd\ufffd;");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\013\ufffd\ufffd\ufffd\ufffd\ufffdm");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\037" + "'", str3, "\037");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23403719614645068620130432976" + "'", str7, "23403719614645068620130432976");
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.decrypt("275650827612592659521534319728");
        java.lang.String str13 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffd\005\u027d");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "250" + "'", str5, "250");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "193" + "'", str7, "193");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "]\021\000\ufffd\ufffd\016\032\ufffd" + "'", str11, "]\021\000\ufffd\ufffd\016\032\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "21046665676718864277919973282" + "'", str13, "21046665676718864277919973282");
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str21 = rSA1.decrypt("1610609348121997");
        java.lang.String str23 = rSA1.encrypt("625242562048162756081156433445");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "59248153781669836223803941455" + "'", str9, "59248153781669836223803941455");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "496342070339879823659874155879" + "'", str11, "496342070339879823659874155879");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "594361114949343213615443112253" + "'", str13, "594361114949343213615443112253");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001[" + "'", str21, "\001[");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "250" + "'", str23, "250");
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("568759196801179");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "727696202601607" + "'", str7, "727696202601607");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd" + "'", str11, "\000\ufffd\ufffd");
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("219091099050495");
        java.lang.String str5 = rSA1.decrypt("97779635366941227714181850303");
        java.lang.String str7 = rSA1.encrypt("\001\ufffd\u04ef2");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "88914923359812000294645984901" + "'", str3, "88914923359812000294645984901");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\007\ufffd\ufffd\ufffd\017\023\ufffd\ufffd\ufffd" + "'", str5, "\007\ufffd\ufffd\ufffd\017\023\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "895557541284319499661940699685" + "'", str7, "895557541284319499661940699685");
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("3844394415");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("442380850626800120698932994377");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "458" + "'", str7, "458");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "218" + "'", str9, "218");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\0019" + "'", str11, "\0019");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "502" + "'", str13, "502");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "235" + "'", str17, "235");
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
        java.lang.String str15 = rSA1.decrypt("324");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1267223111245202" + "'", str7, "1267223111245202");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2027842551034432393917931514" + "'", str13, "2027842551034432393917931514");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\u028f\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd8" + "'", str15, "\000\ufffd\u028f\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd8");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str9 = rSA1.decrypt("156420681989455759137605914496");
        java.lang.String str11 = rSA1.encrypt("325053041126851022637890970422");
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\023\ufffd\ufffd\ufffdK\020\ufffdX");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "by|T" + "'", str5, "by|T");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\u04cb\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0478" + "'", str9, "\000\ufffd\u04cb\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0478");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "124663393913529893544037257958" + "'", str11, "124663393913529893544037257958");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "332506614538305586052683220251" + "'", str13, "332506614538305586052683220251");
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("380204032");
        java.lang.String str15 = rSA1.encrypt("380204032");
        java.lang.String str17 = rSA1.encrypt("\n\ufffd\ufffd\ufffd\ufffd\u05be\ufffd\ufffd\036\034\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\032\ufffd\\" + "'", str13, "\001\ufffd\ufffd\032\ufffd\\");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "353159376800783" + "'", str15, "353159376800783");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1299801576594150" + "'", str17, "1299801576594150");
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        java.lang.String str9 = rSA1.encrypt("851388096742496");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("223085954322271099048508011299");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1106420074005048" + "'", str7, "1106420074005048");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1088828891497442" + "'", str9, "1088828891497442");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1688028156438794" + "'", str13, "1688028156438794");
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        java.lang.String str17 = rSA1.encrypt("141592947570930378736777989995");
        java.lang.String str19 = rSA1.encrypt("328224799554290748230697521488");
        java.lang.String str21 = rSA1.encrypt("\016");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\f\ufffd+\r\ufffd\ufffd\ufffd" + "'", str13, "\f\ufffd+\r\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "779212719747463" + "'", str15, "779212719747463");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3537752252138184" + "'", str17, "3537752252138184");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2103531590041540" + "'", str19, "2103531590041540");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "537824" + "'", str21, "537824");
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("95057093174212120272332960514");
        java.lang.String str11 = rSA1.encrypt("363904346928259064880157652878");
        java.lang.String str13 = rSA1.encrypt("2561181311805737");
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400" + "'", str5, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "262" + "'", str9, "262");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "366" + "'", str11, "366");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "106" + "'", str13, "106");
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("250147309");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "329982143524044416922521794067" + "'", str9, "329982143524044416922521794067");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "509029546936833060678871302832" + "'", str13, "509029546936833060678871302832");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\u04be\ufffd" + "'", str15, "\003\ufffd\ufffd\ufffd\ufffd\u04be\ufffd");
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\200\ufffd!\023\ufffd\ufffd\ufffd4");
        java.lang.String str17 = rSA1.encrypt("6318253741");
        rSA1.generateKeys((int) 'a');
        java.lang.String str21 = rSA1.decrypt("6036260850");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "539992472559265" + "'", str7, "539992472559265");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\030\ufffd\ufffd\024\ufffd" + "'", str9, "\001\030\ufffd\ufffd\024\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "199879543505450" + "'", str13, "199879543505450");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2605909061995792" + "'", str15, "2605909061995792");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "435720639680923" + "'", str17, "435720639680923");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("1396895478287703");
        java.lang.String str5 = rSA1.encrypt("251943736018795");
        java.lang.String str7 = rSA1.decrypt("414129663954207");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd" + "'", str3, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1251340458" + "'", str5, "1251340458");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">J3\024" + "'", str7, ">J3\024");
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        java.lang.String str15 = rSA1.decrypt("1858995041484385");
        java.lang.String str17 = rSA1.decrypt("5602292640");
        java.lang.String str19 = rSA1.encrypt(".\005*\\\ufffd\035\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "346124168791148242316503330470" + "'", str9, "346124168791148242316503330470");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "65279397204495836390321782903" + "'", str11, "65279397204495836390321782903");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\023\n\ufffd\t\ufffd\ufffd\ufffdW" + "'", str13, "\002\ufffd\ufffd\023\n\ufffd\t\ufffd\ufffd\ufffdW");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffddQh" + "'", str15, "\001\ufffd\ufffd\ufffd\ufffd\ufffddQh");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd|\036\ufffd\u03e9 \001)" + "'", str17, "\002\ufffd|\036\ufffd\u03e9 \001)");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "481173397420023073269415307114" + "'", str19, "481173397420023073269415307114");
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.decrypt("264484706");
        java.lang.String str15 = rSA1.encrypt("196989163804812");
        java.lang.String str17 = rSA1.encrypt("15531997365273025742698361245");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "73" + "'", str3, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd@\025\u0451\ufffd9" + "'", str13, "\006\ufffd\ufffd\ufffd\ufffd@\025\u0451\ufffd9");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "926865250841566551377933971977" + "'", str15, "926865250841566551377933971977");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "912723217495342037259693474946" + "'", str17, "912723217495342037259693474946");
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.encrypt("3775398402");
        java.lang.String str21 = rSA1.decrypt("3893026519");
        java.lang.String str23 = rSA1.decrypt("848432151975713029114460603977");
        java.lang.String str25 = rSA1.decrypt("165");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "148859330925272321674063969571" + "'", str9, "148859330925272321674063969571");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\023\021\ufffd\ufffd\ufffd" + "'", str11, "\003\ufffd\ufffd\023\021\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "953134166813483" + "'", str19, "953134166813483");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd\u037a\ufffd\ufffd" + "'", str21, "\000\ufffd\u037a\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\007\002\ufffd\ufffd\ufffd\ufffd" + "'", str23, "\007\002\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\002\ufffd\ufffd\r\ufffd\ufffd" + "'", str25, "\002\ufffd\ufffd\r\ufffd\ufffd");
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("\003\ufffd3\026\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("17984750416640363209182140552");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "625896214" + "'", str7, "625896214");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "41980290780069390170114987045" + "'", str13, "41980290780069390170114987045");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\032\ufffd\ufffdb_\020\ufffd\ufffd\ufffd" + "'", str17, "\032\ufffd\ufffdb_\020\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("423");
        java.lang.String str5 = rSA1.encrypt("234");
        java.lang.String str7 = rSA1.decrypt("3014073566531198");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\031" + "'", str3, "\031");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "419" + "'", str5, "419");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'" + "'", str7, "'");
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.decrypt("1007500148816926");
        java.lang.String str13 = rSA1.decrypt("2810229674496929");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "224871350731471145233331410983" + "'", str9, "224871350731471145233331410983");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\u0366\017\u0550?7\006" + "'", str11, "\004\ufffd\ufffd\ufffd\u0366\017\u0550?7\006");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\n\035\ufffd\ufffd\\\ufffd\u02349S" + "'", str13, "\b\n\035\ufffd\ufffd\\\ufffd\u02349S");
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("2064440430059638");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("37761701459156484237");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "359103686931168863178075435852" + "'", str11, "359103686931168863178075435852");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "20676430600030967407509622910" + "'", str15, "20676430600030967407509622910");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("125");
        java.lang.String str15 = rSA1.encrypt("1357889660519486");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str23 = rSA1.encrypt("201844211632348786660449584992");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "233169471013789788114290172960" + "'", str9, "233169471013789788114290172960");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "233169471013789788114290172960" + "'", str11, "233169471013789788114290172960");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\033\u0385\ufffd" + "'", str13, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\033\u0385\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "101965434495550596446195075330" + "'", str15, "101965434495550596446195075330");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "938" + "'", str23, "938");
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        java.lang.String str15 = rSA1.decrypt("44");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007W\027\022\u012d\ufffd\ufffd\n\ufffd\b\"(" + "'", str11, "\007W\027\022\u012d\ufffd\ufffd\n\ufffd\b\"(");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "312228411452431614797170072256" + "'", str13, "312228411452431614797170072256");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffdr\032\ufffd" + "'", str15, "\004\ufffd\ufffd\ufffd\ufffdr\032\ufffd");
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.decrypt("760666216293048255539908876499");
        java.lang.String str15 = rSA1.decrypt("184");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\001QA5\004");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?QA5?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\177=8\037\ufffd?" + "'", str11, "\000\ufffd\ufffd\ufffd\ufffd\177=8\037\ufffd?");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\025\ufffd\ufffd\r\ufffdz2\034" + "'", str13, "\006\025\ufffd\ufffd\r\ufffdz2\034");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd*'\013\ufffd\ufffdxNn" + "'", str15, "\005\ufffd*'\013\ufffd\ufffdxNn");
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("2573327249882962");
        java.lang.String str15 = rSA1.decrypt("40072012838848394027");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "241448692805200" + "'", str7, "241448692805200");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\0012" + "'", str13, "\0012");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001s" + "'", str15, "\001s");
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        java.lang.String str13 = rSA1.decrypt("269030877152135810905269912627");
        java.lang.String str15 = rSA1.encrypt("\007:\\\u1425\b");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "55073177600000" + "'", str11, "55073177600000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\031\ufffd\033\ufffd\ufffdn.\t" + "'", str13, "\003\ufffd\ufffd\ufffd\031\ufffd\033\ufffd\ufffdn.\t");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "129799971888735661335295966205" + "'", str15, "129799971888735661335295966205");
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        java.lang.String str9 = rSA1.encrypt("2498126528283274");
        java.lang.String str11 = rSA1.encrypt("\013\ufffd\u057e");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("678992678904336709456791763410");
        java.lang.String str17 = rSA1.encrypt("120611489739969924523546575003");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1864479940" + "'", str3, "1864479940");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5479478787" + "'", str7, "5479478787");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6506134067" + "'", str9, "6506134067");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6394631254" + "'", str11, "6394631254");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "666" + "'", str15, "666");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "592" + "'", str17, "592");
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\004\ufffd\ufffd\u07d8");
        java.lang.String str13 = rSA1.encrypt("1785750893713219");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "191" + "'", str5, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\177" + "'", str7, "\177");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "75" + "'", str9, "75");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "254" + "'", str11, "254");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "30" + "'", str13, "30");
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        java.lang.String str13 = rSA1.encrypt("567489291482222151985241898549");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\006\ufffd\ufffd\\\ufffd\ufffd\ufffd@");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?aRC\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "453886504419773196443735770346" + "'", str9, "453886504419773196443735770346");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "37822311364830212583" + "'", str11, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "388102493834598769069664683199" + "'", str13, "388102493834598769069664683199");
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\006");
        java.lang.String str15 = rSA1.decrypt("338");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2021196670699016" + "'", str7, "2021196670699016");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "216" + "'", str13, "216");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\bO\027\ufffd\ufffd\ufffd" + "'", str15, "\bO\027\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("454458126693189319650194474059");
        java.lang.String str13 = rSA1.decrypt("329114188050351");
        rSA1.generateKeys((int) '#');
        java.lang.String str17 = rSA1.encrypt("197698200765604");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "77" + "'", str5, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "404" + "'", str7, "404");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "258" + "'", str11, "258");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\017" + "'", str13, "\017");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1701369517" + "'", str17, "1701369517");
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("478480907");
        java.lang.String str13 = rSA1.decrypt("10262013576437037109817071209");
        java.lang.String str15 = rSA1.encrypt("\006\n\ufffd\u05b8\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("\ufffd\ufffd\ufffd\u672b\ufffd\n\013j");
        java.lang.String str19 = rSA1.encrypt("546");
        java.lang.String str21 = rSA1.encrypt("56598386470850099107874878848");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str25 = rSA1.decrypt("62815984277266541495968203646");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "102" + "'", str11, "102");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "344" + "'", str15, "344");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "164" + "'", str17, "164");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "157" + "'", str19, "157");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "201" + "'", str21, "201");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\013" + "'", str25, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\013");
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.decrypt("1282002825616878");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "728579375039707" + "'", str7, "728579375039707");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "232330995" + "'", str11, "232330995");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd8Qo\t\ufffd\027\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("779");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "101" + "'", str3, "101");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002U%\030" + "'", str7, "\002U%\030");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1999629988" + "'", str9, "1999629988");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\"F\001\ufffd" + "'", str11, "\001\"F\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("125");
        java.lang.String str15 = rSA1.encrypt("\0072Z!C>H\023\ufffd9\020\ufffd");
        java.lang.String str17 = rSA1.decrypt("324053092273740555737028151137");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str21 = rSA1.encrypt("613211933330775");
        java.lang.String str23 = rSA1.decrypt("2100449234");
        java.lang.String str25 = rSA1.decrypt("1420723053003400");
        java.lang.String str27 = rSA1.decrypt("119293537935107");
        java.lang.String str29 = rSA1.decrypt("423194135510858684994917032077");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "412465141711881734173276235161" + "'", str9, "412465141711881734173276235161");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "412465141711881734173276235161" + "'", str11, "412465141711881734173276235161");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\u01db\033\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\u01db\033\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "510747636006497065133707743884" + "'", str15, "510747636006497065133707743884");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffdn\001\ufffdGb" + "'", str17, "\002\ufffd\ufffd\ufffd\ufffdn\001\ufffdGb");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "9804620727738284667253429554" + "'", str21, "9804620727738284667253429554");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\007\ufffd\u0312\ufffd\ufffd\ufffd\ufffd" + "'", str23, "\007\ufffd\u0312\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\007\ufffd\ufffd#\036\ufffd\ufffd" + "'", str25, "\007\ufffd\ufffd#\036\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\005\ufffd\ufffdUu?\f\ufffd\016\ufffd" + "'", str27, "\005\ufffd\ufffdUu?\f\ufffd\016\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\0055j\022L\013\ufffd\ufffd*|L3" + "'", str29, "\0055j\022L\013\ufffd\ufffd*|L3");
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("4801815136");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\005\ufffd\u058a\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400" + "'", str5, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "214" + "'", str9, "214");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<" + "'", str13, "<");
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("111158135588212");
        java.lang.String str17 = rSA1.encrypt("567");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "477507193805728" + "'", str7, "477507193805728");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "122" + "'", str11, "122");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\035" + "'", str15, "\001\ufffd\035");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4555466020" + "'", str17, "4555466020");
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        java.lang.String str15 = rSA1.decrypt("1858995041484385");
        java.lang.String str17 = rSA1.decrypt("753709548305681");
        java.lang.String str19 = rSA1.decrypt("407959500339633826858447187405");
        java.lang.String str21 = rSA1.decrypt("206602344");
        java.lang.String str23 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\035\ufffd\ufffd\ufffdOn");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "92641517036207572797356954929" + "'", str9, "92641517036207572797356954929");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "259643712443834720081564654347" + "'", str11, "259643712443834720081564654347");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\022\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\007\022\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffdx8\r\ufffd\005\ufffd\ufffd\ufffd" + "'", str15, "\005\ufffdx8\r\ufffd\005\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "D_\005\ufffd\013\ufffd\ufffd\ufffd\ufffd\030" + "'", str17, "D_\005\ufffd\013\ufffd\ufffd\ufffd\ufffd\030");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006\ufffd\ufffd\016\ufffd\032\ufffd\ufffd" + "'", str19, "\006\ufffd\ufffd\016\ufffd\032\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\005\005mg" + "'", str21, "\002\ufffd\ufffd\ufffd\ufffd\005\005mg");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "420563983243243928506974807467" + "'", str23, "420563983243243928506974807467");
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("63126036322318");
        java.lang.Class<?> wildcardClass4 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd\ufffdbB" + "'", str3, "\000\ufffd\ufffdbB");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd=");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "631900834" + "'", str9, "631900834");
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("266");
        java.lang.String str13 = rSA1.decrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.decrypt("787439318926031104812953602702");
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\ufffd\ufffd8X\031$\001");
        rSA1.generateKeys((int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P" + "'", str11, "P");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "474" + "'", str17, "474");
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("3844394415");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("442380850626800120698932994377");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "458" + "'", str7, "458");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "218" + "'", str9, "218");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\0019" + "'", str11, "\0019");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "502" + "'", str13, "502");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "241" + "'", str17, "241");
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\001\r");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\b\ufffd\ufffd[\021\ufffd\ufffdoQ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?n?8\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19465109" + "'", str11, "19465109");
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        java.lang.String str15 = rSA1.encrypt("3264782225");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str21 = rSA1.decrypt("119886417990077");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "757" + "'", str11, "757");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "523" + "'", str15, "523");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd\ufffd\ufffd\u07c4\ufffd\007\ufffd" + "'", str21, "\001\ufffd\ufffd\ufffd\u07c4\ufffd\007\ufffd");
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("60129198407427");
        java.lang.String str15 = rSA1.encrypt("1555947862956257");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2074853371329355" + "'", str7, "2074853371329355");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1088589074" + "'", str11, "1088589074");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002a@$" + "'", str13, "\002a@$");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2213573471" + "'", str15, "2213573471");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("1927427079013891");
        java.lang.String str15 = rSA1.encrypt("237121674757469760114553009048");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "77" + "'", str5, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\016" + "'", str7, "\016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "24" + "'", str9, "24");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Z" + "'", str13, "Z");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1171944860634512");
        java.lang.String str15 = rSA1.decrypt("1672696756611743");
        java.lang.String str17 = rSA1.encrypt("896");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "698672952" + "'", str3, "698672952");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7148432688" + "'", str5, "7148432688");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5844898012" + "'", str7, "5844898012");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffdBA" + "'", str9, "\002\ufffdBA");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1252276865159201" + "'", str13, "1252276865159201");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd,\177T" + "'", str15, "\003\ufffd\ufffd,\177T");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1580796993870969" + "'", str17, "1580796993870969");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("15573850693655");
        rSA1.generateKeys((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "524" + "'", str7, "524");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd:E" + "'", str11, "\005\ufffd\ufffd\ufffd:E");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1049599860544269" + "'", str13, "1049599860544269");
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.encrypt("569046855107122163755734229680");
        java.lang.String str11 = rSA1.decrypt("71246182698955505680257915552");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "82" + "'", str3, "82");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\022" + "'", str7, "\001\ufffd\022");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1487242062" + "'", str9, "1487242062");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd*" + "'", str11, "\002\ufffd\ufffd*");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("4");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.encrypt("2411260992603826");
        java.lang.String str17 = rSA1.encrypt("258");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1028071702528" + "'", str9, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1028071702528" + "'", str11, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "894405036" + "'", str15, "894405036");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "410154256" + "'", str17, "410154256");
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("257");
        java.lang.String str17 = rSA1.decrypt("608858562594023");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1844983251232546" + "'", str7, "1844983251232546");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "632" + "'", str15, "632");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd" + "'", str17, "\002\ufffd");
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        java.lang.String str13 = rSA1.decrypt("214795012199997513219774055720");
        java.lang.String str15 = rSA1.decrypt("580692768141247");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "118182920244317" + "'", str7, "118182920244317");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1074609079" + "'", str11, "1074609079");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\036\ufffd\025" + "'", str13, "\036\ufffd\025");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd" + "'", str15, "\ufffd\ufffd");
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.decrypt("289544367393524284124525093689");
        java.lang.String str13 = rSA1.decrypt("77381396516715217378311807299");
        java.lang.String str15 = rSA1.encrypt("M\021\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003\ufffd\ufffd\035\ufffd\n" + "'", str3, "\003\ufffd\ufffd\035\ufffd\n");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "556121852629701" + "'", str5, "556121852629701");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "637679711473666" + "'", str7, "637679711473666");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd[2Xm" + "'", str9, "\ufffd[2Xm");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffda\005>" + "'", str11, "\002\ufffd\ufffd\ufffda\005>");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004}\177\ufffd\ufffd*" + "'", str13, "\004}\177\ufffd\ufffd*");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "689864787577936" + "'", str15, "689864787577936");
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("\002\ufffd");
        java.lang.String str5 = rSA1.encrypt("33498445484715677227");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "323760111007837670824422283148" + "'", str3, "323760111007837670824422283148");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "171653250965022059773485985291" + "'", str5, "171653250965022059773485985291");
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("310952423287303162704207659970");
        java.lang.String str17 = rSA1.decrypt("1632923298108129");
        java.lang.String str19 = rSA1.decrypt("6502538600");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "827436375347056659762047236135" + "'", str9, "827436375347056659762047236135");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\031\ufffd\013\ufffd\027\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffd\031\ufffd\013\ufffd\027\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "665732267252627886593445497441" + "'", str15, "665732267252627886593445497441");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd\ufffd`\f\ufffd\ufffd" + "'", str17, "\t\ufffd\ufffd\ufffd\ufffd\ufffd`\f\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\b\ufffd\ufffd\u0279\u0673\ufffd\ufffd\ufffd" + "'", str19, "\b\ufffd\ufffd\u0279\u0673\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\006");
        java.lang.String str15 = rSA1.decrypt("338");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str19 = rSA1.encrypt("752607123907448");
        java.lang.String str21 = rSA1.encrypt("\005\ufffd7\034X\032n");
        java.lang.String str23 = rSA1.decrypt("1783418159594903");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1722823869795606" + "'", str7, "1722823869795606");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7776" + "'", str13, "7776");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\024\\c\0039" + "'", str15, "\005\ufffd\024\\c\0039");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "348" + "'", str19, "348");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "92" + "'", str21, "92");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "T" + "'", str23, "T");
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        java.lang.String str15 = rSA1.encrypt("3264782225");
        java.lang.String str17 = rSA1.decrypt("316973227613881101828002122645");
        java.lang.String str19 = rSA1.decrypt("80");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44" + "'", str11, "44");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "151" + "'", str15, "151");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001" + "'", str17, "\001");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("333538977866196043865277785098");
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\0014\017\ufffd\ufffd\ufffd\036x)c");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?4??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001C" + "'", str5, "\001C");
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("120");
        java.lang.String str9 = rSA1.encrypt("206");
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.decrypt("10496963571");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "]" + "'", str7, "]");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "314" + "'", str9, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str19 = rSA1.encrypt("349621352405848");
        java.lang.String str21 = rSA1.encrypt("\006\n\ufffd\u05b8\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1712609354154104" + "'", str7, "1712609354154104");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "369" + "'", str11, "369");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "197" + "'", str19, "197");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "3" + "'", str21, "3");
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1450670214753405");
        java.lang.String str11 = rSA1.encrypt("87203191126925675072023416378");
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.encrypt("3064477541808429");
        java.lang.String str17 = rSA1.decrypt("2036533559444602");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1151836492267164" + "'", str7, "1151836492267164");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "436098433841933" + "'", str9, "436098433841933");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1169013185885267" + "'", str11, "1169013185885267");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "269" + "'", str15, "269");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.decrypt("367833833811898030444868410919");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "237845659191080" + "'", str7, "237845659191080");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "692931809510652" + "'", str13, "692931809510652");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001a" + "'", str17, "\001a");
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("423");
        java.lang.String str5 = rSA1.decrypt("28771434551552552060887602754");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + ";" + "'", str5, ";");
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("96");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\u01fe\ufffdz^\025\ufffd\ufffd\ufffd:");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1504387288886954" + "'", str7, "1504387288886954");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd" + "'", str11, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "630340404" + "'", str13, "630340404");
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("23596208946137472461782808");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3074073887708814" + "'", str7, "3074073887708814");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t\ufffd{-\031" + "'", str9, "\t\ufffd{-\031");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2230313464982769" + "'", str13, "2230313464982769");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2682969896666895" + "'", str15, "2682969896666895");
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("6972139707");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "77" + "'", str5, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "404" + "'", str7, "404");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1982089882993668" + "'", str11, "1982089882993668");
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.encrypt("4387152023");
        java.lang.String str17 = rSA1.decrypt("52521875");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "690639537886062101128873945844" + "'", str9, "690639537886062101128873945844");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "192545022503694985236913439195" + "'", str11, "192545022503694985236913439195");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2758650767" + "'", str15, "2758650767");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#" + "'", str17, "#");
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        java.lang.String str5 = rSA1.decrypt("6591173097");
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\037" + "'", str3, "\037");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("178");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd" + "'", str7, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2046485029798738" + "'", str11, "2046485029798738");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("\005\ufffd)5\033\ufffd8\"\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\034" + "'", str7, "\001\034");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1203096278" + "'", str11, "1203096278");
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("611820819499251777959422481763");
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.decrypt("238");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "473730786199664890378528750643" + "'", str9, "473730786199664890378528750643");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\004\025\ufffd\ufffd\023/" + "'", str11, "\ufffd\004\025\ufffd\ufffd\023/");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\035\ufffd\"\ufffd\ufffd\ufffd" + "'", str13, "\002\ufffd\035\ufffd\"\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\n" + "'", str17, "\ufffd\ufffd\n");
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(10);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "274245252651958" + "'", str7, "274245252651958");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "638007806" + "'", str11, "638007806");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "55073177600000" + "'", str11, "55073177600000");
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\001\ufffd");
        java.lang.String str11 = rSA1.decrypt("10944974464");
        java.lang.String str13 = rSA1.encrypt("206");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "250" + "'", str5, "250");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_" + "'", str7, "_");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "410" + "'", str9, "410");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "373" + "'", str13, "373");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.encrypt("277");
        java.lang.String str5 = rSA1.encrypt("2724571176865586");
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "326" + "'", str3, "326");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "213" + "'", str5, "213");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\000\ufffdL\024\ufffd\ufffd\ufffd>\032");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "271786716754753497327454312480" + "'", str11, "271786716754753497327454312480");
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.encrypt("358");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\006\025\ufffd\002\ufffdL" + "'", str3, "\006\025\ufffd\002\ufffdL");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "964760522190663" + "'", str5, "964760522190663");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "206862101967336" + "'", str7, "206862101967336");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\032\ufffd G" + "'", str9, "\003\ufffd\ufffd\032\ufffd G");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1062393208139706" + "'", str11, "1062393208139706");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("250147309");
        java.lang.String str17 = rSA1.encrypt("#");
        java.lang.String str19 = rSA1.encrypt("1408514752349");
        java.lang.String str21 = rSA1.decrypt("69973686666167");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "105574989194750982785935979060" + "'", str9, "105574989194750982785935979060");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd?b\023c\036\ufffd\016\ufffd\ufffd" + "'", str11, "\001\ufffd?b\023c\036\ufffd\016\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "658645526242194379899113028084" + "'", str13, "658645526242194379899113028084");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdx-" + "'", str15, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdx-");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "64339296875" + "'", str17, "64339296875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "209370776018903241483477631411" + "'", str19, "209370776018903241483477631411");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\004\ufffdX\031\ufffd\ufffd\ufffd\ufffd\ufffd\000c" + "'", str21, "\004\ufffdX\031\ufffd\ufffd\ufffd\ufffd\ufffd\000c");
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("304740070237960671182697086271");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1477004850" + "'", str5, "1477004850");
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("4");
        java.lang.String str17 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str19 = rSA1.encrypt("\013\ufffd\ufffd\ufffd\ufffd\ufffdm");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2585924382736197" + "'", str7, "2585924382736197");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\tr'\013\ufffd\ufffd\ufffd" + "'", str9, "\tr'\013\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3556316195432936" + "'", str13, "3556316195432936");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "380204032" + "'", str15, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2227151502793867" + "'", str17, "2227151502793867");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2234092111255240" + "'", str19, "2234092111255240");
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("380204032");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("125");
        java.lang.String str15 = rSA1.encrypt("1357889660519486");
        java.lang.String str17 = rSA1.decrypt("161");
        java.lang.String str19 = rSA1.encrypt("2284507059");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "503606644405753706096783483517" + "'", str9, "503606644405753706096783483517");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "503606644405753706096783483517" + "'", str11, "503606644405753706096783483517");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ud876\ude2a\ufffd\u0265\ufffd\003\023\ufffd" + "'", str13, "\002\ufffd\ud876\ude2a\ufffd\u0265\ufffd\003\023\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32841105020661979071867561155" + "'", str15, "32841105020661979071867561155");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\004\035\ufffd\ufffd.64\030" + "'", str17, "\002\ufffd\004\035\ufffd\ufffd.64\030");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "75224427631532933178944403219" + "'", str19, "75224427631532933178944403219");
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "191" + "'", str3, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "784199124" + "'", str7, "784199124");
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str19 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str21 = rSA1.encrypt("1457162401913128");
        java.lang.String str23 = rSA1.decrypt("691019171402730790365030190926");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1147144029430395" + "'", str7, "1147144029430395");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "145" + "'", str11, "145");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "465" + "'", str19, "465");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "495" + "'", str21, "495");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\0013" + "'", str23, "\0013");
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        java.lang.String str11 = rSA1.decrypt("2139198067134255");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2577441777" + "'", str3, "2577441777");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7531515023" + "'", str7, "7531515023");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\030|" + "'", str9, "\000\ufffd\ufffd\030|");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\000\ufffd\ufffd\ufffd" + "'", str11, "\001\000\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("478480907");
        java.lang.String str13 = rSA1.decrypt("10262013576437037109817071209");
        java.lang.String str15 = rSA1.encrypt("\006\n\ufffd\u05b8\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("\ufffd\ufffd\ufffd\u672b\ufffd\n\013j");
        java.lang.String str19 = rSA1.encrypt("546");
        java.lang.String str21 = rSA1.encrypt("56598386470850099107874878848");
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "102" + "'", str11, "102");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "91" + "'", str15, "91");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "486" + "'", str17, "486");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "525" + "'", str19, "525");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "500" + "'", str21, "500");
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("523");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd2\005z" + "'", str5, "\000\ufffd2\005z");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "83871355569793885295649590642" + "'", str9, "83871355569793885295649590642");
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("197");
        java.lang.String str17 = rSA1.encrypt("462059788404288851690924494526");
        java.lang.String str19 = rSA1.decrypt("669");
        java.lang.String str21 = rSA1.encrypt("505166351935841957381133710989");
        java.lang.String str23 = rSA1.encrypt("\001\032\207\ufffd");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "261314891159901603670918246266" + "'", str9, "261314891159901603670918246266");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd^6\027\ufffdj" + "'", str11, "\003\ufffd\ufffd\ufffd^6\027\ufffdj");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "424128405096773786662319260246" + "'", str13, "424128405096773786662319260246");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "71333870939449911650726101701" + "'", str15, "71333870939449911650726101701");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "317049266566973969554114459614" + "'", str17, "317049266566973969554114459614");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\ufffdM*%d" + "'", str19, "\ufffd\ufffdM*%d");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "489554640199241518501398162225" + "'", str21, "489554640199241518501398162225");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "55802030550868083666669014806" + "'", str23, "55802030550868083666669014806");
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("611820819499251777959422481763");
        java.lang.String str15 = rSA1.encrypt("1902662215266297");
        java.lang.String str17 = rSA1.encrypt("2287495933");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "387" + "'", str11, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\001\ufffdu\023\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd\ufffd\001\ufffdu\023\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "47186715834559812684171692918" + "'", str15, "47186715834559812684171692918");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "183858544214142161188479561855" + "'", str17, "183858544214142161188479561855");
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("1565011048071623");
        java.lang.String str11 = rSA1.decrypt("553535743006153129855274469250");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "83" + "'", str5, "83");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\f\ufffd\ufffd\ufffd\ufffdI" + "'", str9, "\003\f\ufffd\ufffd\ufffd\ufffdI");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd^\n\ufffd\ufffd\ufffd3\\\ufffd\ufffd" + "'", str11, "\003\ufffd^\n\ufffd\ufffd\ufffd3\\\ufffd\ufffd");
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("\002\ufffd");
        java.math.BigInteger bigInteger4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = rSA1.encrypt(bigInteger4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "199006318155077207204535464696" + "'", str3, "199006318155077207204535464696");
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("2645095105545624");
        java.lang.String str17 = rSA1.decrypt("28100933696926471903600515426");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str21 = rSA1.encrypt("156005545118765485187887028712");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "79241670927230389842611725118" + "'", str9, "79241670927230389842611725118");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "236304232195258183105399313341" + "'", str11, "236304232195258183105399313341");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\027\ufffd\007\027\ufffd\034" + "'", str15, "\002\027\ufffd\007\027\ufffd\034");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\ufffd\004\ufffd\ufffd\\\ufffd" + "'", str17, "\006\ufffd\004\ufffd\ufffd\\\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "485" + "'", str21, "485");
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str19 = rSA1.encrypt("349621352405848");
        java.lang.String str21 = rSA1.encrypt("73073083040888118419040653382");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "773380165156937" + "'", str7, "773380165156937");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "53" + "'", str11, "53");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "654" + "'", str19, "654");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1" + "'", str21, "1");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("3775398402");
        java.lang.String str15 = rSA1.decrypt("172724761660472190993592461870");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\007\ufffd\ufffd\ufffdV");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?%??V?V\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "406032473840334278827644073225" + "'", str9, "406032473840334278827644073225");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "406032473840334278827644073225" + "'", str11, "406032473840334278827644073225");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\030\ufffd\u7a80\ufffd\ufffd\ufffd" + "'", str13, "\007\ufffd\030\ufffd\u7a80\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\fb[w\r\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\b\fb[w\r\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.encrypt("314");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.decrypt("\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"/??z/?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5706057074" + "'", str5, "5706057074");
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("852");
        java.lang.String str11 = rSA1.decrypt("6367626140");
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("809627930648310897862777565349");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "961236757208826" + "'", str7, "961236757208826");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\u0562\ufffdNV" + "'", str9, "\004\u0562\ufffdNV");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "855619561599707" + "'", str13, "855619561599707");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1010879549265843" + "'", str15, "1010879549265843");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("4");
        java.lang.String str17 = rSA1.encrypt("\004\024\ufffd\"\ufffd\ufffd\ufffd");
        java.lang.String str19 = rSA1.encrypt("17800849128284565855563442903");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1811726005770155" + "'", str7, "1811726005770155");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\ufffdG\031\023" + "'", str9, "\005\ufffd\ufffd\ufffdG\031\023");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1515177884266626" + "'", str11, "1515177884266626");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "292728969186651" + "'", str13, "292728969186651");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1036552536219272" + "'", str15, "1036552536219272");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1364163607051490" + "'", str17, "1364163607051490");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "289481609888411" + "'", str19, "289481609888411");
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.decrypt("239533509989569937544099898666");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1221979565589368" + "'", str7, "1221979565589368");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\004;\037\ufb12\032\ufffd\0256\013\ufffd" + "'", str15, "\001\004;\037\ufb12\032\ufffd\0256\013\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.decrypt("3530960715");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "112" + "'", str3, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\022" + "'", str5, "\002\022");
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "419168331658104262232227489387" + "'", str9, "419168331658104262232227489387");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "197466758789747531812223250681" + "'", str11, "197466758789747531812223250681");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "16384" + "'", str13, "16384");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("266");
        java.lang.String str13 = rSA1.decrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.decrypt("523");
        java.lang.String str17 = rSA1.decrypt("614346653771592189209303265764");
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\024" + "'", str11, "\024");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001m" + "'", str13, "\001m");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "9" + "'", str17, "9");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.decrypt("829");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("97521284580285");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\u0332\ufffd\ufffd\n\004\ufffd\ufffd" + "'", str3, "\001\u0332\ufffd\ufffd\n\004\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "47" + "'", str7, "47");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.encrypt("3775398402");
        java.lang.String str21 = rSA1.decrypt("3893026519");
        java.lang.String str23 = rSA1.decrypt("848432151975713029114460603977");
        java.lang.String str25 = rSA1.decrypt("165");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "86768329969150547540218732189" + "'", str9, "86768329969150547540218732189");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\007\ufffd\ufffd[*" + "'", str11, "\004\ufffd\ufffd\ufffd\ufffd\007\ufffd\ufffd[*");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "226149968221694866170501121490" + "'", str13, "226149968221694866170501121490");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1713814471666494" + "'", str19, "1713814471666494");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\t$\n\r\ufffdWO" + "'", str21, "\t$\n\r\ufffdWO");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\t\ufffd\ufffd\ufffd\005ML" + "'", str23, "\t\ufffd\ufffd\ufffd\005ML");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\005\ufffd\001\u043b;`" + "'", str25, "\005\ufffd\001\u043b;`");
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\007\ufffd\ufffd\ufffd" + "'", str3, "\007\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "459044026366656" + "'", str5, "459044026366656");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1607298151390768" + "'", str7, "1607298151390768");
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\200\ufffd!\023\ufffd\ufffd\ufffd4");
        java.lang.String str17 = rSA1.encrypt("6318253741");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) 'a');
        java.lang.String str23 = rSA1.decrypt("796149774260474");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1791053205719930" + "'", str7, "1791053205719930");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002C\\\ufffd\ufffdH" + "'", str9, "\002C\\\ufffd\ufffdH");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "319120124412687" + "'", str11, "319120124412687");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "490862548746353" + "'", str13, "490862548746353");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1069158833880616" + "'", str15, "1069158833880616");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1962453542434561" + "'", str17, "1962453542434561");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\030\ufffd\ufffd\ufffd4\032\ufffd\ufffd(" + "'", str23, "\030\ufffd\ufffd\ufffd4\032\ufffd\ufffd(");
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("423");
        java.lang.String str5 = rSA1.encrypt("825");
        rSA1.generateKeys((int) 'a');
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\031" + "'", str3, "\031");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "435" + "'", str5, "435");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("274779111525604387596824181322");
        java.lang.String str19 = rSA1.encrypt("688897905429298");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "477446579520764710358504407339" + "'", str9, "477446579520764710358504407339");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\007W\032\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\007\007W\032\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2635828042676204" + "'", str17, "2635828042676204");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1650901657654435" + "'", str19, "1650901657654435");
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("197");
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffdN\033\ufffd\u062a");
        java.lang.String str19 = rSA1.encrypt("1931499264044464");
        java.lang.String str21 = rSA1.decrypt("1768869265");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "688349178000169527711218148973" + "'", str9, "688349178000169527711218148973");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n\ufffd\032\ufffd\ufffd\u056f\ufffd\ufffd" + "'", str11, "\n\ufffd\032\ufffd\ufffd\u056f\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "890065113722335928309860286572" + "'", str13, "890065113722335928309860286572");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "875270729480198433058926524594" + "'", str15, "875270729480198433058926524594");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "561614420935442714255445526851" + "'", str17, "561614420935442714255445526851");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "334231327287054653597595614543" + "'", str19, "334231327287054653597595614543");
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd8Qo\t\ufffd\027\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\007");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "510" + "'", str3, "510");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "142627353" + "'", str9, "142627353");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "16807" + "'", str11, "16807");
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.decrypt("44");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.encrypt("564955806244323");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2976713790568244" + "'", str7, "2976713790568244");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{" + "'", str11, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "I" + "'", str13, "I");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "325458852334529821833002678604" + "'", str17, "325458852334529821833002678604");
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("250147309");
        java.lang.String str17 = rSA1.encrypt("887836866708316");
        rSA1.generateKeys((int) 'a');
        java.lang.String str21 = rSA1.encrypt("\000\ufffd\037\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys(10);
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "287938093837786782232965391820" + "'", str9, "287938093837786782232965391820");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffdCX\036\ufffd" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffdCX\036\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "165616901054503341081022998870" + "'", str13, "165616901054503341081022998870");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\n\ufffd\ufffd\ufffd\ufffd\006\ufffd4" + "'", str15, "\004\ufffd\n\ufffd\ufffd\ufffd\ufffd\006\ufffd4");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "135235168936087894619150487161" + "'", str17, "135235168936087894619150487161");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "6674275370311852468549223476" + "'", str21, "6674275370311852468549223476");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("318");
        java.lang.String str17 = rSA1.decrypt("398936280944224832230450169101");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\002\ufffd\ufffd\023\n\ufffd\t\ufffd\ufffd\ufffdW");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?f??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44" + "'", str11, "44");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\ufffd\031\ufffd" + "'", str15, "\b\ufffd\ufffd\031\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\ufffd\036\ufffd\ufffd\ufffd" + "'", str17, "\007\ufffd\036\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("2645095105545624");
        java.lang.String str17 = rSA1.decrypt("28100933696926471903600515426");
        java.lang.String str19 = rSA1.encrypt("\030\025\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "636965577117824470113692484346" + "'", str9, "636965577117824470113692484346");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "405381881155352785450515617103" + "'", str11, "405381881155352785450515617103");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str15, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\ufffd\t\ufffd" + "'", str17, "\006\ufffd\t\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "128448464023340" + "'", str19, "128448464023340");
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.encrypt("x\001\005\ufffd\ufffd");
        java.lang.String str7 = rSA1.decrypt("2005425809184648");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7985170890" + "'", str5, "7985170890");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd");
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        rSA1.generateKeys((int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "60022565463616635228716391148" + "'", str9, "60022565463616635228716391148");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        java.lang.String str9 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffdN\033\ufffd\u062a");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.encrypt("224495630513799910487095884514");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\001\ufffd\ufffd\ufffd0\036\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??J?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd" + "'", str5, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "848680341" + "'", str7, "848680341");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6352380425" + "'", str9, "6352380425");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "213395077768255323790621379656" + "'", str13, "213395077768255323790621379656");
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("197");
        java.lang.String str17 = rSA1.encrypt("462059788404288851690924494526");
        java.lang.String str19 = rSA1.decrypt("669");
        java.lang.String str21 = rSA1.encrypt("505166351935841957381133710989");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\003\ufffd\ufffd\ufffd\ufffd<");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????Q?<\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "446689974354587303701293890835" + "'", str9, "446689974354587303701293890835");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\034\ufffd\ufffd\ufffd\ufffd\ufffdo" + "'", str11, "\000\ufffd\034\ufffd\ufffd\ufffd\ufffd\ufffdo");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "326390128245804369426868149795" + "'", str13, "326390128245804369426868149795");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "5956984096586829738076734384" + "'", str15, "5956984096586829738076734384");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "158822308055531952587522205810" + "'", str17, "158822308055531952587522205810");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006\ufffd\u02fb\ufffd\ufffd\ufffd\ufffd\ufffd " + "'", str19, "\006\ufffd\u02fb\ufffd\ufffd\ufffd\ufffd\ufffd ");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "510437031241302175768733701870" + "'", str21, "510437031241302175768733701870");
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        java.lang.String str13 = rSA1.decrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("576");
        java.lang.String str19 = rSA1.decrypt("669");
        java.lang.String str21 = rSA1.encrypt("674932422672366921537205620483");
        java.lang.String str23 = rSA1.decrypt("100935160444972936488645408652");
        java.lang.String str25 = rSA1.decrypt("461541918275757628831159648633");
        java.lang.String str27 = rSA1.encrypt("\001\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.encrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "445877896616844058867140325912" + "'", str9, "445877896616844058867140325912");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\ufffd\ufffdsk\032\ufffd\ufffd\ufffdL" + "'", str11, "\t\ufffd\ufffdsk\032\ufffd\ufffd\ufffdL");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\tsD\034\005\ufffd[\030\ufffd\ufffd\ufffd\ufffd\034" + "'", str13, "\tsD\034\005\ufffd[\030\ufffd\ufffd\ufffd\ufffd\034");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\030\006_h" + "'", str17, "\ufffd\ufffd\ufffd\ufffd\030\006_h");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\016\ufffd\ufffd\0328f\t7" + "'", str19, "\ufffd\016\ufffd\ufffd\0328f\t7");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "25520192289085548734847163646" + "'", str21, "25520192289085548734847163646");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\027\ufffd\ufffd\ufffd\ufffd" + "'", str23, "\027\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "j\005\ufffd\ufffd\031\ufffd=%\024\ufffd" + "'", str25, "j\005\ufffd\ufffd\031\ufffd=%\024\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "33631694067354330413993157549" + "'", str27, "33631694067354330413993157549");
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("2645095105545624");
        java.lang.String str17 = rSA1.encrypt("\034\ufffd\035\ufffd");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "356526979873317316732646694504" + "'", str9, "356526979873317316732646694504");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35159651289115136321968720974" + "'", str11, "35159651289115136321968720974");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\ufffd\ufffd\ufffdU" + "'", str15, "\t\ufffd\ufffd\ufffdU");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2685665677284675" + "'", str17, "2685665677284675");
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("257");
        java.lang.String str17 = rSA1.decrypt("608858562594023");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys(10);
        java.lang.String str25 = rSA1.encrypt("\001\031\ufffd\025\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str27 = rSA1.decrypt("313406272692309");
        java.lang.Class<?> wildcardClass28 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "769299810944334" + "'", str7, "769299810944334");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "157" + "'", str15, "157");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "30" + "'", str25, "30");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000\ufffd" + "'", str27, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        java.lang.String str7 = rSA1.encrypt("276");
        java.lang.String str9 = rSA1.encrypt("172");
        java.lang.String str11 = rSA1.encrypt("5693705465");
        java.lang.String str13 = rSA1.encrypt("MZ\033U");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2748759102" + "'", str3, "2748759102");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4552884623" + "'", str5, "4552884623");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9185870670" + "'", str7, "9185870670");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9054413388" + "'", str9, "9054413388");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5175077629" + "'", str11, "5175077629");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3188792419" + "'", str13, "3188792419");
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.decrypt("829");
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003\ufffd\ufffd\035\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\003\ufffd\ufffd\035\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        java.lang.String str9 = rSA1.encrypt("\003\ufffd\024\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "271464844557027" + "'", str7, "271464844557027");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1147009520681208" + "'", str9, "1147009520681208");
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("\003\ufffd\022\ufffd\ufffd\ufffd\ufffd7");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\001\u0141\035\ufffd\003\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?sT\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "83" + "'", str5, "83");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "421" + "'", str7, "421");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "195017984103868826501870136479" + "'", str11, "195017984103868826501870136479");
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.encrypt("353706821132697402012447044730");
        java.lang.String str17 = rSA1.encrypt("\007Os\020\ufffd\ufffd\ufffd\ufffd\006\ufffd\u05b0");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3110845690882965" + "'", str7, "3110845690882965");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "261679608139131" + "'", str13, "261679608139131");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "428381036271531" + "'", str15, "428381036271531");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "140808316499072" + "'", str17, "140808316499072");
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.encrypt("2548512234");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\002\ufffdU\025\ufffd}\\\ufffd\022\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??U?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "211" + "'", str5, "211");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003[" + "'", str7, "\003[");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "587" + "'", str9, "587");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "163" + "'", str17, "163");
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        java.lang.String str5 = rSA1.decrypt("6591173097");
        java.lang.String str7 = rSA1.decrypt("2515314524154825");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\037" + "'", str3, "\037");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.encrypt("698830179104320016788462155306");
        java.lang.String str19 = rSA1.encrypt("224495630513799910487095884514");
        java.lang.String str21 = rSA1.decrypt("2573327249882962");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "436921919836142537191153739106" + "'", str9, "436921919836142537191153739106");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "380647461065024204590702824535" + "'", str11, "380647461065024204590702824535");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "16384" + "'", str13, "16384");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "123757798848571910319831502336" + "'", str17, "123757798848571910319831502336");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "589032623799841122542712543236" + "'", str19, "589032623799841122542712543236");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        java.lang.String str9 = rSA1.encrypt("2498126528283274");
        java.lang.String str11 = rSA1.encrypt("\013\ufffd\u057e");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("678992678904336709456791763410");
        java.lang.String str17 = rSA1.encrypt("543");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3994295581" + "'", str3, "3994295581");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2614535356" + "'", str7, "2614535356");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3315801130" + "'", str9, "3315801130");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5955876417" + "'", str11, "5955876417");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "528" + "'", str15, "528");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "221" + "'", str17, "221");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.decrypt("611820819499251777959422481763");
        rSA1.generateKeys((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd>k\022 b\002 \030\001" + "'", str15, "\006\ufffd\ufffd>k\022 b\002 \030\001");
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.encrypt("\002<|\031\016\ufffdt");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "126" + "'", str9, "126");
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.encrypt("3775398402");
        java.lang.String str21 = rSA1.decrypt("3893026519");
        java.lang.String str23 = rSA1.encrypt("1518050569654082");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("\001\031\ufffd\ufffd\ufffd\ufffd\u03f3\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "229893378989177497540653731262" + "'", str9, "229893378989177497540653731262");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd4\007*\023\ufffd\ufffd\ufffd\026" + "'", str11, "\003\ufffd4\007*\023\ufffd\ufffd\ufffd\026");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "88841935965320549065927059753" + "'", str13, "88841935965320549065927059753");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "923467644352757" + "'", str19, "923467644352757");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\005\ufffd\ufffd\ufffd\000" + "'", str21, "\005\ufffd\ufffd\ufffd\000");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "458774911526519" + "'", str23, "458774911526519");
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.encrypt("2821440436690149");
        java.lang.String str5 = rSA1.decrypt("1047482469336782699089679928208");
        java.lang.String str7 = rSA1.encrypt("10038248675189789010085843633");
        java.lang.String str9 = rSA1.decrypt("1795401699278305");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "67" + "'", str3, "67");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "M" + "'", str5, "M");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "95" + "'", str7, "95");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        java.lang.String str15 = rSA1.encrypt("\000\ufffd\021\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "55" + "'", str11, "55");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000" + "'", str13, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\u07de");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1287781005872158" + "'", str7, "1287781005872158");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\ufffd\026\ufffd" + "'", str9, "\002\ufffd\ufffd\ufffd\026\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "96" + "'", str13, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1491181271768445" + "'", str15, "1491181271768445");
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.encrypt("693179055479091238033090662971");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "167" + "'", str7, "167");
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\001\r");
        java.lang.String str13 = rSA1.encrypt("315");
        java.lang.String str15 = rSA1.encrypt("136");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "73" + "'", str3, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19465109" + "'", str11, "19465109");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "37761701459156484237" + "'", str13, "37761701459156484237");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "33522487042404985624" + "'", str15, "33522487042404985624");
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        java.lang.String str9 = rSA1.encrypt("165");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "163" + "'", str7, "163");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "294" + "'", str9, "294");
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        java.lang.String str9 = rSA1.encrypt("\003\ufffd\024\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "408564486053332" + "'", str7, "408564486053332");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1308350555099337" + "'", str9, "1308350555099337");
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("286695718283372156430210651393");
        java.lang.String str5 = rSA1.decrypt("2119828432695955");
        java.lang.String str7 = rSA1.decrypt("925568231498920647360821327791");
        java.lang.String str9 = rSA1.decrypt("179926235");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3140181931" + "'", str3, "3140181931");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str5, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("489");
        java.lang.String str15 = rSA1.encrypt("\002\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("5447816862");
        java.lang.String str19 = rSA1.encrypt("515048652255986807530604950322");
        java.lang.String str21 = rSA1.decrypt("2198391811700185");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2914489060334846" + "'", str7, "2914489060334846");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6935245860" + "'", str13, "6935245860");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6025775196" + "'", str15, "6025775196");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1174393840" + "'", str17, "1174393840");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1042319940" + "'", str19, "1042319940");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd\ufffd\036" + "'", str21, "\ufffd\ufffd\036");
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("250147309");
        java.lang.String str17 = rSA1.encrypt("#");
        java.lang.String str19 = rSA1.encrypt("\005\u057f\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\001 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"? \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "407011166697971118603620893898" + "'", str9, "407011166697971118603620893898");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffdf\r\031vL\034\u021a" + "'", str11, "\000\ufffd\ufffdf\r\031vL\034\u021a");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "177826632629027706627835766435" + "'", str13, "177826632629027706627835766435");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd!\001\ufffd\ufffd\ufffd\001\n\ufffd" + "'", str15, "\004\ufffd!\001\ufffd\ufffd\ufffd\001\n\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "64339296875" + "'", str17, "64339296875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "381840523641692222005710175500" + "'", str19, "381840523641692222005710175500");
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("3");
        java.lang.String str19 = rSA1.decrypt("214");
        java.lang.String str21 = rSA1.encrypt("Z");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd&)y:" + "'", str11, "\003\ufffd\ufffd\ufffd\ufffd\ufffd&)y:");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "345025251" + "'", str17, "345025251");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\ufffd\017\ufffd\ufffdT" + "'", str19, "\003\ufffd\017\ufffd\ufffdT");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "5904900000" + "'", str21, "5904900000");
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.decrypt("956742419960502");
        java.lang.String str13 = rSA1.encrypt("677515820738920883677057551843");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1292966320243471" + "'", str7, "1292966320243471");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\"\u04fa\ufffd\ufffd" + "'", str9, "\006\ufffd\"\u04fa\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\001\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1252653928362502" + "'", str13, "1252653928362502");
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("125");
        java.lang.String str15 = rSA1.encrypt("1357889660519486");
        java.lang.String str17 = rSA1.decrypt("2354813854350387");
        java.lang.String str19 = rSA1.encrypt("538621452366062192513302577482");
        java.lang.String str21 = rSA1.encrypt("556");
        java.lang.String str23 = rSA1.encrypt("\ufffd\ufffd");
        java.lang.String str25 = rSA1.encrypt("\001\ufffd\001\ufffd");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "54301474298046672975080288996" + "'", str9, "54301474298046672975080288996");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "54301474298046672975080288996" + "'", str11, "54301474298046672975080288996");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\030\005\u7e52\ufffd\ufffd\ufffd" + "'", str13, "\005\ufffd\030\005\u7e52\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "125845604893215804783179340938" + "'", str15, "125845604893215804783179340938");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\b\t\ufffd\ufffd\ufffd;\n\ufffdo\"" + "'", str17, "\002\b\t\ufffd\ufffd\ufffd;\n\ufffdo\"");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "185999566356591064403429423745" + "'", str19, "185999566356591064403429423745");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "501946240852482722297564740551" + "'", str21, "501946240852482722297564740551");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "263092841099365944660149713695" + "'", str23, "263092841099365944660149713695");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "151376742939599912494303504763" + "'", str25, "151376742939599912494303504763");
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("373");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("559478705485095");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "582" + "'", str11, "582");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "748" + "'", str13, "748");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "63855189153205488708916090103" + "'", str17, "63855189153205488708916090103");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("35600054765755498264");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\005\ufffd\ufffd\u0d8c\ufffd:\002\007");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffdvv" + "'", str5, "\ufffdvv");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "299359592512113660788175626139" + "'", str9, "299359592512113660788175626139");
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("805201222");
        java.lang.String str9 = rSA1.decrypt("436888915925883347513701815904");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Z" + "'", str9, "Z");
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        java.lang.String str17 = rSA1.encrypt("178");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str21 = rSA1.encrypt("\000\ufffd\ufffd\ufffd");
        java.lang.String str23 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u37fb\ufffd3*");
        java.lang.String str25 = rSA1.decrypt("1629935995");
        java.lang.String str27 = rSA1.encrypt("\001\ufffd\ufffd\ufffd");
        java.lang.String str29 = rSA1.encrypt("42400116637624927000");
        java.math.BigInteger bigInteger30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger31 = rSA1.decrypt(bigInteger30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\017\ufffdn\020\ufffd" + "'", str13, "\002\017\ufffdn\020\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "608039350591882" + "'", str15, "608039350591882");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "370856105933641" + "'", str17, "370856105933641");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "403" + "'", str21, "403");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "127" + "'", str23, "127");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000\ufffd" + "'", str25, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "593" + "'", str27, "593");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "273" + "'", str29, "273");
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("1927427079013891");
        java.lang.String str15 = rSA1.decrypt("357116198982442");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "286" + "'", str5, "286");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001d" + "'", str7, "\001d");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "214" + "'", str9, "214");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003;" + "'", str15, "\003;");
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("120");
        java.lang.String str9 = rSA1.encrypt("206");
        java.lang.String str11 = rSA1.encrypt("626763080");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "509" + "'", str9, "509");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "37" + "'", str11, "37");
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.decrypt("44");
        java.lang.String str15 = rSA1.decrypt("618443824774458842838968720878");
        java.lang.String str17 = rSA1.encrypt("13987155673");
        java.lang.String str19 = rSA1.encrypt("5447816862");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1565841982856739" + "'", str7, "1565841982856739");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\0011" + "'", str11, "\0011");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "j" + "'", str13, "j");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "717" + "'", str17, "717");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "32" + "'", str19, "32");
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        java.lang.String str13 = rSA1.decrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("576");
        java.lang.String str19 = rSA1.encrypt("523");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "98431276953652601313948993259" + "'", str9, "98431276953652601313948993259");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\u0358\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\003\ufffd\ufffd\ufffd\u0358\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\035H \032\ufffd\ufffd" + "'", str13, "\002\ufffd\ufffd\ufffd\035H \032\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-\002\034\ufffd\ufffd\004\ufffd\ufffd\ufffd" + "'", str17, "-\002\034\ufffd\ufffd\004\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "30069171495726345951809679335" + "'", str19, "30069171495726345951809679335");
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("125");
        java.lang.String str15 = rSA1.encrypt("1357889660519486");
        java.lang.String str17 = rSA1.decrypt("2354813854350387");
        java.lang.String str19 = rSA1.encrypt("538621452366062192513302577482");
        java.lang.String str21 = rSA1.encrypt("556");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "119179210397744179061303384123" + "'", str9, "119179210397744179061303384123");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "119179210397744179061303384123" + "'", str11, "119179210397744179061303384123");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\u013c\u03c5\ufffd\ufffd\022\ufffd\ufffd" + "'", str13, "\005\u013c\u03c5\ufffd\ufffd\022\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "155337469817738506728344107140" + "'", str15, "155337469817738506728344107140");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\u04e3\ufffd\ufffd\ufffd\ufffd\ufffd\013" + "'", str17, "\001\ufffd\u04e3\ufffd\ufffd\ufffd\ufffd\ufffd\013");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "405073852369151597345972574390" + "'", str19, "405073852369151597345972574390");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "226473507805420084081293278163" + "'", str21, "226473507805420084081293278163");
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        java.lang.String str15 = rSA1.decrypt("965471357883334");
        java.lang.String str17 = rSA1.encrypt("583253898306406");
        java.lang.String str19 = rSA1.encrypt("315");
        java.lang.String str21 = rSA1.decrypt("247579467758075242988958887041");
        java.lang.String str23 = rSA1.encrypt("306015976180916364196542218462");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "526006404685397977948539634025" + "'", str9, "526006404685397977948539634025");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "442156773829526009659161816886" + "'", str11, "442156773829526009659161816886");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "505006501267316055729194313322" + "'", str13, "505006501267316055729194313322");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\017\ufffdt!" + "'", str15, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\017\ufffdt!");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "589321918048580688336355973777" + "'", str17, "589321918048580688336355973777");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "385271128324335749581413948006" + "'", str19, "385271128324335749581413948006");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd\013\ufffd\ufffdl@\026\ufffd5" + "'", str21, "\001\ufffd\013\ufffd\ufffdl@\026\ufffd5");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "504651745643934544998070435832" + "'", str23, "504651745643934544998070435832");
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("125");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "379329877740370806207438470102" + "'", str9, "379329877740370806207438470102");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\003\ufffd\177\ufffd\ufffd\u04a9\ufffd" + "'", str11, "\003\ufffd\ufffd\ufffd\003\ufffd\177\ufffd\ufffd\u04a9\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "148494518616996318634797581537" + "'", str13, "148494518616996318634797581537");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\ufffd\u0310\ufffd\ufffd\ufffd\004" + "'", str15, "\004\ufffd\ufffd\ufffd\u0310\ufffd\ufffd\ufffd\004");
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("765314849130516");
        java.lang.String str19 = rSA1.encrypt("50305157274325");
        java.lang.String str21 = rSA1.encrypt("2069495775635953");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\034" + "'", str11, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\034");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "24678567134845096481110674107" + "'", str13, "24678567134845096481110674107");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "M" + "'", str17, "M");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "199" + "'", str19, "199");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "587" + "'", str21, "587");
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("945892428");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003" + "'", str7, "\003");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n\ufffd\033\ufffd\ufffd2C" + "'", str13, "\n\ufffd\033\ufffd\ufffd2C");
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.decrypt("666852044142564779122674445212");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd\ufffd\007\u0529\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("3088882723");
        java.lang.String str19 = rSA1.encrypt("\013\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\0013" + "'", str7, "\0013");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\001" + "'", str9, "\002\001");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001U" + "'", str11, "\001U");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "153" + "'", str15, "153");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "512" + "'", str17, "512");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "390" + "'", str19, "390");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("3844394415");
        java.lang.String str15 = rSA1.encrypt("576838359927970006129927354507");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\030" + "'", str5, "\030");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "459" + "'", str7, "459");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "694" + "'", str9, "694");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "R" + "'", str11, "R");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "129" + "'", str13, "129");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "300" + "'", str15, "300");
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "250" + "'", str5, "250");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_" + "'", str7, "_");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "71" + "'", str9, "71");
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        java.lang.String str11 = rSA1.decrypt("2139198067134255");
        java.lang.String str13 = rSA1.encrypt("\002\ufffdj");
        java.lang.String str15 = rSA1.encrypt("721795374474899375053754166522");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??3????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3952430467" + "'", str3, "3952430467");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4115445984" + "'", str7, "4115445984");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\u06e4\ufffdb" + "'", str11, "\000\u06e4\ufffdb");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6177374490" + "'", str13, "6177374490");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6449553550" + "'", str15, "6449553550");
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("37822311364830212583");
        java.lang.String str11 = rSA1.encrypt("576600425658183");
        java.lang.String str13 = rSA1.decrypt("252365513580659");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\005" + "'", str7, "\002\005");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "77" + "'", str11, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str19 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str21 = rSA1.encrypt("5483845661");
        java.lang.String str23 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\026\ufffd");
        java.lang.String str25 = rSA1.decrypt("1615631866569382");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2605671858120042" + "'", str7, "2605671858120042");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "237" + "'", str11, "237");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "5" + "'", str19, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "374" + "'", str21, "374");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "87" + "'", str23, "87");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\0018" + "'", str25, "\0018");
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("8589662889");
        java.lang.String str19 = rSA1.encrypt("\001\ufffd\022\u03c7\u0502\ufffd\ufffd\ufffdX");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "74556898869466728404264552579" + "'", str9, "74556898869466728404264552579");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\023\ufffd\ufffd\ufffd\ufffdm|" + "'", str11, "\002\ufffd\ufffd\ufffd\023\ufffd\ufffd\ufffd\ufffdm|");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "102452402181894471450136234892" + "'", str13, "102452402181894471450136234892");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\030\ufffd\ufffd" + "'", str17, "\002\ufffd\030\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4222576963882" + "'", str19, "4222576963882");
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("21717639");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "93" + "'", str11, "93");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\0070\020\ufffdZ\022" + "'", str15, "\0070\020\ufffdZ\022");
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("813206094276231374379760053937");
        java.lang.String str13 = rSA1.decrypt("342");
        java.lang.String str15 = rSA1.encrypt("41020759083851174566306088014");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "477498497488595" + "'", str7, "477498497488595");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\025\ufffd\ufffd" + "'", str11, "\025\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1\\\ufffd" + "'", str13, "1\\\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "715585828" + "'", str15, "715585828");
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.encrypt("268");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "238424385225521134194385565414" + "'", str9, "238424385225521134194385565414");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6263222600369332376206507761" + "'", str13, "6263222600369332376206507761");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "369" + "'", str17, "369");
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("219091099050495");
        java.lang.String str5 = rSA1.decrypt("97779635366941227714181850303");
        java.lang.String str7 = rSA1.encrypt("154144488921717");
        java.lang.String str9 = rSA1.decrypt("2007083759867767");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\006\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?e?X???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "243222349108063971656331738670" + "'", str3, "243222349108063971656331738670");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd\r\ufffd\020\ufffd\035\ufffd\ufffd" + "'", str5, "\001\ufffd\r\ufffd\020\ufffd\035\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "398418256314338356512431893038" + "'", str7, "398418256314338356512431893038");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u064a" + "'", str9, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u064a");
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str9 = rSA1.decrypt("156420681989455759137605914496");
        java.lang.String str11 = rSA1.encrypt("325053041126851022637890970422");
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\023\ufffd\ufffd\ufffdK\020\ufffdX");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\020\ufffdT" + "'", str5, "\001\020\ufffdT");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\b\ufffdMz\026\u0132~\177" + "'", str9, "\002\ufffd\b\ufffdMz\026\u0132~\177");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "232555990977122215802010717828" + "'", str11, "232555990977122215802010717828");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "200111855918261596170481672383" + "'", str13, "200111855918261596170481672383");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.decrypt("1282002825616878");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "604770129114423" + "'", str7, "604770129114423");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1353360630" + "'", str11, "1353360630");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\006" + "'", str17, "\001\006");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("\006\b\ufffd\ufffd\355");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400" + "'", str5, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\016" + "'", str7, "\016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "230" + "'", str9, "230");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "17" + "'", str13, "17");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("313145417605523375439450352290");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("1699026177576345");
        java.lang.String str19 = rSA1.encrypt("\003\ufffd\ufffd\ufffd");
        java.lang.String str21 = rSA1.decrypt("196567626694463745563940699682");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "510" + "'", str3, "510");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3647326678" + "'", str7, "3647326678");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5255972944" + "'", str9, "5255972944");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffdQ\022" + "'", str11, "\001\ufffdQ\022");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4603647114" + "'", str13, "4603647114");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "185340251164885" + "'", str17, "185340251164885");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2142041966900151" + "'", str19, "2142041966900151");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\004\ufffd#\021\ufffd(" + "'", str21, "\004\ufffd#\021\ufffd(");
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        java.lang.String str13 = rSA1.encrypt("589095713527447830713051752917");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1162879184870916" + "'", str7, "1162879184870916");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "36" + "'", str11, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "277" + "'", str13, "277");
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.decrypt("239533509989569937544099898666");
        java.lang.String str17 = rSA1.encrypt("518");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "604420641035748" + "'", str7, "604420641035748");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\ufffd\024\ufffd\ufffd\ufffdg" + "'", str15, "\005\ufffd\ufffd\ufffd\024\ufffd\ufffd\ufffdg");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "42362846909373312512" + "'", str17, "42362846909373312512");
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("286695718283372156430210651393");
        java.lang.String str5 = rSA1.decrypt("2119828432695955");
        java.lang.String str7 = rSA1.encrypt("992436543");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("277938194478251");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5392137670" + "'", str3, "5392137670");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffdz(\"" + "'", str5, "\000\ufffdz(\"");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2789421436" + "'", str7, "2789421436");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.decrypt("156420681989455759137605914496");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1580416644626842" + "'", str7, "1580416644626842");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\013\ufffd\003\001\ufffd^" + "'", str9, "\013\ufffd\003\001\ufffd^");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\bf" + "'", str11, "\000\ufffd\ufffd\ufffd\ufffd\bf");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str19 = rSA1.decrypt("511");
        java.lang.String str21 = rSA1.encrypt("13087572778356868098099484487");
        java.lang.String str23 = rSA1.decrypt("30774062305666838944109687145");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str27 = rSA1.encrypt("1747065091032394438226181466");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str31 = rSA1.encrypt("13767138484127607526886772378");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str35 = rSA1.decrypt("542270209732414997322554664540");
        java.math.BigInteger bigInteger36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger37 = rSA1.encrypt(bigInteger36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1024397213633370" + "'", str7, "1024397213633370");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "183" + "'", str11, "183");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "80" + "'", str21, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001/" + "'", str23, "\001/");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "170" + "'", str27, "170");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "214656313295395646575016877025" + "'", str31, "214656313295395646575016877025");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\003u" + "'", str35, "\003u");
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("574410298724081");
        java.lang.String str17 = rSA1.decrypt("304932508390490521686739136958");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "296132865662110" + "'", str7, "296132865662110");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "338" + "'", str11, "338");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str15, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\007U" + "'", str17, "\000\ufffd\ufffd\007U");
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd=");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.decrypt("1814032248");
        java.lang.String str15 = rSA1.encrypt("1198965058209000");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2176657720" + "'", str9, "2176657720");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\n\ufffd\ufffd\ufffd" + "'", str13, "\002\n\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7619260275" + "'", str15, "7619260275");
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        java.lang.String str5 = rSA1.decrypt("470");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("108862119398595");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "332894338261020719850571506044" + "'", str11, "332894338261020719850571506044");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\031\ufffd\u02d2\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\003\031\ufffd\u02d2\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("1249253780109007");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "992993539946886" + "'", str7, "992993539946886");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1584740089" + "'", str11, "1584740089");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffdZ" + "'", str13, "\ufffd\ufffdZ");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.decrypt("86");
        java.lang.String str17 = rSA1.encrypt("119579939769595636001061");
        java.lang.String str19 = rSA1.decrypt("603377111727349");
        java.lang.String str21 = rSA1.encrypt("\005\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "428" + "'", str17, "428");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "462" + "'", str21, "462");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "458" + "'", str7, "458");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("373");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("\005\ufffdQ\017q~\177\ufffd\025\ufffdM0");
        java.lang.String str19 = rSA1.encrypt("147563026464741632979335701288");
        rSA1.generateKeys(100);
        rSA1.generateKeys(10);
        java.lang.String str25 = rSA1.encrypt("100240732388302475470420810056");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "90" + "'", str11, "90");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "13" + "'", str13, "13");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "485349770090953259620179547997" + "'", str17, "485349770090953259620179547997");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "58358372991725720720642523219" + "'", str19, "58358372991725720720642523219");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "148" + "'", str25, "148");
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1450670214753405");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.encrypt("36712578767268098520414318263");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "929212443788406" + "'", str7, "929212443788406");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1160214793191421" + "'", str9, "1160214793191421");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1131634811028110049351205479152" + "'", str13, "1131634811028110049351205479152");
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("969465452");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "51161615678518" + "'", str7, "51161615678518");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1152934184382145" + "'", str13, "1152934184382145");
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        java.lang.String str9 = rSA1.encrypt("851388096742496");
        java.lang.String str11 = rSA1.encrypt("269763592171188072874299671367");
        java.lang.String str13 = rSA1.decrypt("35649815032570742856");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1006655154814156" + "'", str7, "1006655154814156");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2226874542285393" + "'", str9, "2226874542285393");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2406394999260951" + "'", str11, "2406394999260951");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\027\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\007\027\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\013\ufffd\ufffd");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3783894406" + "'", str3, "3783894406");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11339031717" + "'", str7, "11339031717");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3503523196" + "'", str9, "3503523196");
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.decrypt("3989346653526533");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "250" + "'", str5, "250");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "193" + "'", str7, "193");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "407" + "'", str11, "407");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.encrypt("5904631369");
        java.lang.String str11 = rSA1.encrypt("73931890830183151123801579485");
        java.lang.String str13 = rSA1.encrypt("2198614718");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "559086437119567" + "'", str7, "559086437119567");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1595326767324940" + "'", str9, "1595326767324940");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1549248611124391" + "'", str11, "1549248611124391");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1642572504308757" + "'", str13, "1642572504308757");
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1224872603919355" + "'", str7, "1224872603919355");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "118699013773213814207083850577" + "'", str13, "118699013773213814207083850577");
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\001\ufffd");
        java.lang.String str11 = rSA1.decrypt("10944974464");
        java.lang.String str13 = rSA1.encrypt("2448943656306246");
        java.lang.String str15 = rSA1.decrypt("569046855107122163755734229680");
        java.lang.String str17 = rSA1.encrypt("\001\ufffd\ufffdU\037g\032\ufffdP");
        java.lang.String str19 = rSA1.decrypt("5");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003" + "'", str7, "\003");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "268" + "'", str9, "268");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "283" + "'", str13, "283");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "225" + "'", str17, "225");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.math.BigInteger bigInteger4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = rSA1.decrypt(bigInteger4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\007" + "'", str3, "\001\007");
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        java.lang.String str9 = rSA1.decrypt("192");
        java.lang.String str11 = rSA1.decrypt("151464558644061297306368349467");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "732577045373639" + "'", str7, "732577045373639");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffdqIO" + "'", str9, "\000\ufffd\ufffdqIO");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd|N" + "'", str11, "\000\ufffd\ufffd|N");
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.encrypt("380423421443618706983369572489");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "776937713147053" + "'", str7, "776937713147053");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "345920088368201271841033690628" + "'", str13, "345920088368201271841033690628");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1099576113" + "'", str17, "1099576113");
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.encrypt("\007y\031\ufffd-\r\ufffd\ufffd\u0778\ufffd");
        java.lang.String str9 = rSA1.decrypt("227");
        java.lang.String str11 = rSA1.decrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.encrypt("\013\ufffd\ufffd\ufffd\017\bJ");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\005\t)<\034\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\005\t)<\034\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "777289508656427685085120699951" + "'", str5, "777289508656427685085120699951");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "419127705977650689593724338960" + "'", str7, "419127705977650689593724338960");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\u071e\ufffd\ufffd\ufffd\ufffd\ufffdu8\007" + "'", str9, "\003\ufffd\u071e\ufffd\ufffd\ufffd\ufffd\ufffdu8\007");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "115087025808344407891301764638" + "'", str13, "115087025808344407891301764638");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("267");
        rSA1.generateKeys((int) 'a');
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "192" + "'", str5, "192");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "483" + "'", str9, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "160" + "'", str13, "160");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("197");
        java.lang.String str17 = rSA1.encrypt("462059788404288851690924494526");
        java.lang.String str19 = rSA1.decrypt("669");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "619534234663975806936367347630" + "'", str9, "619534234663975806936367347630");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\002\ufffd\ufffd\ufffd(o9" + "'", str11, "\004\ufffd\002\ufffd\ufffd\ufffd(o9");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "449799235448623296517863469254" + "'", str13, "449799235448623296517863469254");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "20688363059669391776158123346" + "'", str15, "20688363059669391776158123346");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "628787395913784989416379416178" + "'", str17, "628787395913784989416379416178");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\u022b\ufffd" + "'", str19, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\u022b\ufffd");
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.encrypt("3775398402");
        java.lang.String str21 = rSA1.decrypt("3893026519");
        java.lang.String str23 = rSA1.decrypt("848432151975713029114460603977");
        java.lang.String str25 = rSA1.decrypt("165");
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "413280397359589914895296244280" + "'", str9, "413280397359589914895296244280");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd1\013\ufffd3\021I" + "'", str11, "\002\ufffd\ufffd\ufffd1\013\ufffd3\021I");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "805958923011072173840785109871" + "'", str13, "805958923011072173840785109871");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1932825650763221" + "'", str19, "1932825650763221");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\007\ufffd(`\003\027" + "'", str21, "\007\ufffd(`\003\027");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\007\ufffd\023\ufffd_K" + "'", str23, "\007\ufffd\023\ufffd_K");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000\ufffd\ufffd\u63f2&" + "'", str25, "\000\ufffd\ufffd\u63f2&");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.encrypt("120278723214103938881357741819");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "570238956310475" + "'", str7, "570238956310475");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "415" + "'", str13, "415");
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("2645095105545624");
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.encrypt("\030\ufffd\"\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd_");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?n?y\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "714792804474684673196991815521" + "'", str9, "714792804474684673196991815521");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "414962978848926391900414861857" + "'", str11, "414962978848926391900414861857");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\u8622D" + "'", str15, "\003\ufffd\u8622D");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1335606875190626" + "'", str19, "1335606875190626");
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7419678105" + "'", str3, "7419678105");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7210836309" + "'", str5, "7210836309");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4517142925" + "'", str7, "4517142925");
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        java.lang.String str11 = rSA1.decrypt("2139198067134255");
        java.lang.String str13 = rSA1.encrypt("3284767720");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2459647630" + "'", str3, "2459647630");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8372044164" + "'", str7, "8372044164");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd#7?" + "'", str9, "\001\ufffd#7?");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\022d" + "'", str11, "\ufffd\022d");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4577390381" + "'", str13, "4577390381");
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("125");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "386289319642311245015849747102" + "'", str9, "386289319642311245015849747102");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004%=F\007\ufffd\027\ufffd\ufffd\ufffd" + "'", str11, "\004%=F\007\ufffd\027\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "340706213820398022818390706733" + "'", str13, "340706213820398022818390706733");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\ufffd\u06a6\ufffd\ufffd" + "'", str15, "\004\ufffd\ufffd\ufffd\u06a6\ufffd\ufffd");
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        java.lang.String str11 = rSA1.encrypt("844129610510235");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1640761000" + "'", str3, "1640761000");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "9328107751" + "'", str5, "9328107751");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1635098108" + "'", str7, "1635098108");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\u51cf\ufffd" + "'", str9, "\000\u51cf\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4946544657" + "'", str11, "4946544657");
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("3844015076");
        java.lang.String str15 = rSA1.encrypt("\u0205\n\ufffdxGy");
        java.lang.String str17 = rSA1.encrypt("\002\ufffd\033\ufffd\ufffd\ufffd\032");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2760211072253907" + "'", str7, "2760211072253907");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1306603209169801" + "'", str15, "1306603209169801");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1297067039208072" + "'", str17, "1297067039208072");
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        java.lang.String str13 = rSA1.decrypt("698830179104320016788462155306");
        rSA1.generateKeys((int) '#');
        java.lang.String str17 = rSA1.encrypt("326");
        java.lang.String str19 = rSA1.encrypt("\001\ufffd{0");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "140608" + "'", str9, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "175616000" + "'", str11, "175616000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\027\ufffd\ufffd\ufffd\ufffd\ufffde\006\ufffd" + "'", str13, "\006\ufffd\027\ufffd\ufffd\ufffd\ufffd\ufffde\006\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "6135804691" + "'", str17, "6135804691");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2937994849" + "'", str19, "2937994849");
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("257");
        java.lang.String str17 = rSA1.decrypt("608858562594023");
        java.lang.String str19 = rSA1.encrypt("\006\b\ufffd\ufffd\355");
        java.lang.String str21 = rSA1.decrypt("2248184327249614");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2579258879877769" + "'", str7, "2579258879877769");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "23" + "'", str15, "23");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "331" + "'", str19, "331");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\\" + "'", str21, "\001\\");
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str19 = rSA1.decrypt("727767003863518");
        java.lang.String str21 = rSA1.encrypt("552243905166864160734208974669");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd" + "'", str13, "\005\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1001739433364899" + "'", str15, "1001739433364899");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "E\032\ufffd\ufffd\ufffd~|" + "'", str19, "E\032\ufffd\ufffd\ufffd~|");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "19128370009618906020831041836" + "'", str21, "19128370009618906020831041836");
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("Z");
        java.lang.String str11 = rSA1.encrypt("1422455974188443");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdF");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?=?9\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd\ufffd\ufffd#" + "'", str5, "\002\ufffd\ufffd\ufffd#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5904900000" + "'", str9, "5904900000");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "791354761647100424866407937723" + "'", str11, "791354761647100424866407937723");
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("101921535994725989");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "533348705290404714572776579017" + "'", str3, "533348705290404714572776579017");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\013\ufffd\ufffd" + "'", str7, "\001\013\ufffd\ufffd");
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("380204032");
        java.lang.String str15 = rSA1.encrypt("380204032");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str19 = rSA1.encrypt("757475929128558377755491464272");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1311224922906453" + "'", str15, "1311224922906453");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "313" + "'", str19, "313");
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("1863031711965363");
        java.lang.String str17 = rSA1.encrypt("765314849130516");
        java.lang.String str19 = rSA1.encrypt("222755943501967");
        java.lang.String str21 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd_");
        java.lang.String str23 = rSA1.encrypt("\006\ufffd\ufffd\021\ufffd\u0156\ufffd");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "537989692527445868297575097545" + "'", str9, "537989692527445868297575097545");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\025\ufffd\035b" + "'", str11, "\001\ufffd\ufffd\ufffd\ufffd\025\ufffd\035b");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "148542011697263879114646183152" + "'", str13, "148542011697263879114646183152");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "653604237289427797804744107229" + "'", str15, "653604237289427797804744107229");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "510989515410507193530108634367" + "'", str17, "510989515410507193530108634367");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "459885191644814984708057635829" + "'", str19, "459885191644814984708057635829");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "654493193483932379222372580220" + "'", str21, "654493193483932379222372580220");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "42422249504311587434725625070" + "'", str23, "42422249504311587434725625070");
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.decrypt("956742419960502");
        java.lang.String str13 = rSA1.decrypt("1486416479923872");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1247281600692935" + "'", str7, "1247281600692935");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\u06e9(v" + "'", str9, "\000\ufffd\ufffd\u06e9(v");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\000\ufffd\013d" + "'", str13, "\004\000\ufffd\013d");
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.decrypt("252606222438286852223175939175");
        java.lang.String str15 = rSA1.encrypt("579337255785304");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "250" + "'", str5, "250");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_" + "'", str7, "_");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "71" + "'", str9, "71");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd" + "'", str13, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3413406803" + "'", str15, "3413406803");
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.decrypt("829");
        java.lang.String str5 = rSA1.encrypt("1709572230870390");
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd-2\034\u052c\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\ufffd-2\034\u052c\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "118913688683205770262382279024" + "'", str5, "118913688683205770262382279024");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.encrypt("344");
        java.lang.String str19 = rSA1.encrypt("\001`");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "152713110979804354134390211323" + "'", str9, "152713110979804354134390211323");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "99095833691681991971850344864" + "'", str11, "99095833691681991971850344864");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1024" + "'", str13, "1024");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "161" + "'", str17, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "113" + "'", str19, "113");
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "368825516276074802734962710479" + "'", str3, "368825516276074802734962710479");
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("313145417605523375439450352290");
        java.lang.String str15 = rSA1.decrypt("472");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "829" + "'", str3, "829");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2081832479" + "'", str7, "2081832479");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4935590045" + "'", str9, "4935590045");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd" + "'", str11, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "143987002" + "'", str13, "143987002");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\002\ufffd5" + "'", str15, "\001\002\ufffd5");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("16384");
        java.lang.String str13 = rSA1.encrypt("182896684412517005977800507579");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("574906336155703129842243982921");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "299" + "'", str7, "299");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "102" + "'", str13, "102");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10797378319848737564645310737" + "'", str17, "10797378319848737564645310737");
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.encrypt("698830179104320016788462155306");
        java.lang.String str19 = rSA1.encrypt("\002t");
        java.lang.String str21 = rSA1.encrypt("272510065543173683216918234861");
        java.lang.String str23 = rSA1.encrypt("1348606978182777");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8582475326546076230727245328" + "'", str9, "8582475326546076230727245328");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "735573144111968366548770408138" + "'", str11, "735573144111968366548770408138");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1024" + "'", str13, "1024");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "196001237857303527586697883520" + "'", str17, "196001237857303527586697883520");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "38522769859174285312" + "'", str19, "38522769859174285312");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "176451912739829101863005397844" + "'", str21, "176451912739829101863005397844");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "27696193126591648421683975004" + "'", str23, "27696193126591648421683975004");
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("461647412419176665142998751479");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "227" + "'", str7, "227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\177" + "'", str11, "\177");
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("673899523054237850976");
        java.lang.String str11 = rSA1.decrypt("46925933906613754914094402908");
        java.lang.String str13 = rSA1.encrypt("1699026177576345");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "276" + "'", str3, "276");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "391036726577087583276636059991" + "'", str9, "391036726577087583276636059991");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd=\035C\017\ufffd\033\b" + "'", str11, "\003\ufffd\ufffd\ufffd\ufffd=\035C\017\ufffd\033\b");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "455571736823613094345951632281" + "'", str13, "455571736823613094345951632281");
    }
}
