package ciphers.RSA;

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
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\005\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?}z0???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\u0302" + "'", str9, "\ufffd\u0302");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "701963639" + "'", str11, "701963639");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str5 = rSA1.encrypt("720881662483885555150199331319");
        java.lang.String str7 = rSA1.decrypt("819271931489141549926823657343");
        java.lang.String str9 = rSA1.encrypt("369");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "154" + "'", str5, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006" + "'", str7, "\006");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "715" + "'", str9, "715");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("1208902895495334527");
        java.lang.String str9 = rSA1.encrypt("95");
        java.lang.String str11 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\u0368\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1430414184773505" + "'", str7, "1430414184773505");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141001386125" + "'", str9, "3141001386125");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2160687462592995" + "'", str11, "2160687462592995");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("432");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35" + "'", str7, "35");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001@" + "'", str7, "\001@");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "938267219992550129539880363558" + "'", str11, "938267219992550129539880363558");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35650010007221349888" + "'", str13, "35650010007221349888");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdF;" + "'", str15, "\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdF;");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\u4cb3\017\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\005\ufffd\u4cb3\017\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "94056136104038297115437172672" + "'", str19, "94056136104038297115437172672");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "351854790313255400266453444612" + "'", str21, "351854790313255400266453444612");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("4089374768");
        java.lang.String str5 = rSA1.encrypt("\000\ufffd\u06d9\003");
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002'" + "'", str3, "\002'");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\ufffd\ufffdE6\030\ufffd\ufffd\ufffd\b" + "'", str7, "\005\ufffd\ufffdE6\030\ufffd\ufffd\ufffd\b");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("11716232800583690748559256041");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\003\ufffd\ufffd\ufffd\030\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??[\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "12793443852401284644678357719" + "'", str5, "12793443852401284644678357719");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "307537262575795311885391441107" + "'", str7, "307537262575795311885391441107");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\022\ufffd\ufffd\ufffd\007\ufffd\ufffd\ufffd\ufffd\007\ufffd" + "'", str9, "\003\022\ufffd\ufffd\ufffd\007\ufffd\ufffd\ufffd\ufffd\007\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd6" + "'", str11, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd6");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("|JH%w\016\t\ufffd\ufffd\001\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("48159020044353377656022340487");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffdD\0239" + "'", str7, "\001\ufffdD\0239");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2968649740" + "'", str9, "2968649740");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd{" + "'", str11, "\001\ufffd\ufffd{");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("288");
        java.lang.String str15 = rSA1.decrypt("1894697952");
        java.lang.String str17 = rSA1.decrypt("1028793282341587");
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002L" + "'", str5, "\002L");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007" + "'", str7, "\007");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "219561391161489832897127328648" + "'", str11, "219561391161489832897127328648");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "235421773333845617424776638809" + "'", str13, "235421773333845617424776638809");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t\n\ufffd\025\ufffd\ufffdW\\\ufffd" + "'", str17, "\t\n\ufffd\025\ufffd\ufffdW\\\ufffd");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        java.lang.String str25 = rSA1.encrypt("28");
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\023\ufffd\ufffd\ufffd\ufffd@" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\023\ufffd\ufffd\ufffd\ufffd@");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\001\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\003\001\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1352002462920949" + "'", str19, "1352002462920949");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2196512260799839" + "'", str21, "2196512260799839");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1258824274017986" + "'", str23, "1258824274017986");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2124797718016" + "'", str25, "2124797718016");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\006" + "'", str3, "\001\006");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\u0628\ufffd" + "'", str7, "\000\ufffd\u0628\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "29316250624" + "'", str11, "29316250624");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\\\ufffd\r\ufffdi" + "'", str13, "\b\\\ufffd\r\ufffdi");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "533817862338426" + "'", str15, "533817862338426");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1219630210838857" + "'", str17, "1219630210838857");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004\t\ufffd\ufffd\ufffd" + "'", str19, "\004\t\ufffd\ufffd\ufffd");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.encrypt("377");
        java.lang.String str9 = rSA1.encrypt("537903484179846573266404376905");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "256" + "'", str5, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "64" + "'", str7, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "501" + "'", str9, "501");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("598936615230950507052406172861");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001f" + "'", str3, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd\ufffd");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("\001F");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "391312030875579776" + "'", str3, "391312030875579776");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd");
        java.lang.String str13 = rSA1.encrypt("187");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "521" + "'", str3, "521");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "D" + "'", str7, "D");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "g" + "'", str9, "g");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "425" + "'", str11, "425");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "148" + "'", str13, "148");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("5824490359974973208230734176");
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u053e\ufffd" + "'", str3, "\u053e\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1328856617" + "'", str5, "1328856617");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\033x=n" + "'", str7, "\033x=n");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
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
        java.lang.String str21 = rSA1.encrypt("147");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001W" + "'", str5, "\001W");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005" + "'", str7, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "370169588491624481478429419755" + "'", str11, "370169588491624481478429419755");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35650010007221349888" + "'", str13, "35650010007221349888");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\ufffd\030\ufffd\037\ufffd\ufffd\ufffd<" + "'", str15, "\006\ufffd\ufffd\ufffd\030\ufffd\037\ufffd\ufffd\ufffd<");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "288" + "'", str19, "288");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "33530503450432431591" + "'", str21, "33530503450432431591");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("432");
        java.lang.String str9 = rSA1.encrypt("1208902895495334527");
        java.lang.String str11 = rSA1.decrypt("5");
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\032\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "225" + "'", str7, "225");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "177" + "'", str9, "177");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "x" + "'", str11, "x");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "101" + "'", str13, "101");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass4 = rSA1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("478");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.decrypt("698");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\020\ufffd\ufffd\002\ufffd\ufffd(" + "'", str7, "\000\ufffd\ufffd\020\ufffd\ufffd\002\ufffd\ufffd(");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "!\003\031\ufffd\ufffd\030\003\ufffd\u014c" + "'", str9, "!\003\031\ufffd\ufffd\030\003\ufffd\u014c");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "126" + "'", str13, "126");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004" + "'", str15, "\004");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.decrypt("287794280118878208");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006\017\ufffd\ufffd\ufffd\ufffd\ufffd:\027\ufffd\016\ufffd" + "'", str7, "\006\017\ufffd\ufffd\ufffd\ufffd\ufffd:\027\ufffd\016\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "149081192980390034894273133091" + "'", str9, "149081192980390034894273133091");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "274951748602528560652169318358" + "'", str11, "274951748602528560652169318358");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\u0244" + "'", str15, "\000\ufffd\u0244");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.decrypt("34089860651578007478246711177");
        java.lang.String str9 = rSA1.encrypt("674338054");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "98" + "'", str3, "98");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "81" + "'", str5, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "490" + "'", str9, "490");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("1075488919");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\024");
        java.lang.String str19 = rSA1.encrypt("\t\ufffd\ufffdu$\"\ufffd\ufffd\023\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "22750475076595990664472268818" + "'", str7, "22750475076595990664472268818");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "508155856824162716697939956745" + "'", str17, "508155856824162716697939956745");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "465814358284413064150285678761" + "'", str19, "465814358284413064150285678761");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("\002\u028e\r\ufffd\ufffd\f\ufffd\ufffd");
        java.lang.String str13 = rSA1.decrypt("211");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.decrypt("3799685695");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "50334980593118017863872015613" + "'", str7, "50334980593118017863872015613");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "50334980593118017863872015613" + "'", str9, "50334980593118017863872015613");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "311681915753254630045703951992" + "'", str11, "311681915753254630045703951992");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\022\ufffd" + "'", str13, "\b\ufffd\ufffd\ufffd\ufffd\022\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\017\ufffd\002\u0408\ufffd\ufffd0@" + "'", str17, "\007\017\ufffd\002\u0408\ufffd\ufffd0@");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23743305474340557104091830591" + "'", str7, "23743305474340557104091830591");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\001" + "'", str13, "\001\001");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "417434269326650616456554046987" + "'", str17, "417434269326650616456554046987");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "55615947401654907962917256448" + "'", str19, "55615947401654907962917256448");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        java.lang.String str9 = rSA1.decrypt("107");
        java.lang.String str11 = rSA1.encrypt("\002M");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i" + "'", str3, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "135" + "'", str5, "135");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "140" + "'", str7, "140");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O" + "'", str9, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "175" + "'", str11, "175");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("\0245|\r\ufffd\004\ufffd\r\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("485974862797680425669299086221");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "477183985048363349208014013445" + "'", str7, "477183985048363349208014013445");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "267849952969717417321963975521" + "'", str9, "267849952969717417321963975521");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("393");
        java.lang.String str7 = rSA1.decrypt("227022896246510918381181022856");
        java.lang.String str9 = rSA1.decrypt("8");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.decrypt("86");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "352" + "'", str5, "352");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Q" + "'", str7, "Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002" + "'", str9, "\002");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\022& " + "'", str13, "\000\ufffd\022& ");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("\025");
        java.lang.String str5 = rSA1.encrypt("\001Y");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1801088541" + "'", str3, "1801088541");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1343116220" + "'", str5, "1343116220");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("1075488919");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\024");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "357" + "'", str3, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "27420526850489918658572730590" + "'", str7, "27420526850489918658572730590");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "23750370249695061592255199327" + "'", str17, "23750370249695061592255199327");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.decrypt("166");
        rSA1.generateKeys((int) (byte) 100);
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("11716232800583690748559256041");
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\006\ufffd\ufffd\ufffdP\017\t\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "531576671361595307807831073279" + "'", str5, "531576671361595307807831073279");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "497413012395115683997121391186" + "'", str7, "497413012395115683997121391186");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\n\032\006\ufffd\ufffd\ufffd\017" + "'", str9, "\001\ufffd\ufffd\n\032\006\ufffd\ufffd\ufffd\017");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\026\ufffd\ufffdx" + "'", str11, "\002\ufffd\ufffd\026\ufffd\ufffdx");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("\002\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\f\b\024\ufffd\ufffd\ufffd\ufffd\013\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "58" + "'", str15, "58");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1611067079503803");
        java.lang.String str13 = rSA1.encrypt("584282792217330789222543235577");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "473" + "'", str5, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "167" + "'", str7, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "314" + "'", str11, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "23" + "'", str13, "23");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("317201802686979902757");
        java.lang.String str11 = rSA1.decrypt("427");
        java.lang.String str13 = rSA1.encrypt("334584945244912143283576554504");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\ufffdei\f\ufffd2" + "'", str7, "\003\ufffd\ufffd\ufffdei\f\ufffd2");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "15" + "'", str9, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffds" + "'", str11, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffds");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "658291252326325840690568191828" + "'", str13, "658291252326325840690568191828");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.encrypt("\001\ufffd\ufffd");
        java.lang.String str5 = rSA1.decrypt("598936615230950507052406172861");
        java.lang.String str7 = rSA1.encrypt("30315461196525470678390548020");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "360091522" + "'", str3, "360091522");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd&*" + "'", str5, "\ufffd&*");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2048756032" + "'", str7, "2048756032");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.encrypt("\003\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\ufffd}\026\ufffd\ufffd\u0530P" + "'", str7, "\005\ufffd}\026\ufffd\ufffd\u0530P");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "30888313338154236390042529694" + "'", str11, "30888313338154236390042529694");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("478");
        java.lang.String str15 = rSA1.encrypt("646");
        java.lang.String str17 = rSA1.encrypt("\001\bl:0");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "42" + "'", str7, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "205" + "'", str9, "205");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "11699837447" + "'", str13, "11699837447");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1184909440" + "'", str15, "1184909440");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "9594294713" + "'", str17, "9594294713");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("302478007679515165391351820133");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str19 = rSA1.encrypt("3256297936976746749947348193");
        java.lang.String str21 = rSA1.decrypt("818354031919437822956478981367");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "166036693186230001735215003163" + "'", str11, "166036693186230001735215003163");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "460377351771406156575599159456" + "'", str13, "460377351771406156575599159456");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "3352453697716576425799205280" + "'", str19, "3352453697716576425799205280");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\035\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdnr" + "'", str21, "\035\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdnr");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("1208902895495334527");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "568160746556750" + "'", str7, "568160746556750");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("4089374768");
        java.lang.String str5 = rSA1.encrypt("\002\u028e\r\ufffd\ufffd\f\ufffd\ufffd");
        java.lang.String str7 = rSA1.encrypt("\001\n+\f\ufffd\004\ufffd\ufffd\006\ufffd\ufffd");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003|" + "'", str3, "\003|");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "784" + "'", str7, "784");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("386206508935491231790569964318");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "304" + "'", str3, "304");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "576" + "'", str5, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "304" + "'", str7, "304");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.encrypt("\001\ufffd\ufffd");
        rSA1.generateKeys(100);
        java.lang.String str7 = rSA1.encrypt("1905795830785729527017781248");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2303897116" + "'", str3, "2303897116");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "62918891876546941586755946200" + "'", str7, "62918891876546941586755946200");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("393");
        java.lang.String str7 = rSA1.decrypt("227022896246510918381181022856");
        java.lang.String str9 = rSA1.encrypt("8");
        java.lang.String str11 = rSA1.encrypt("35650010007221349888");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "235" + "'", str5, "235");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "180" + "'", str9, "180");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "381" + "'", str11, "381");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("387");
        java.lang.String str9 = rSA1.encrypt("i");
        java.lang.String str11 = rSA1.encrypt("693");
        java.lang.String str13 = rSA1.encrypt("2241165714926863");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffdt#\025\ufffd\u065d\ufffd" + "'", str7, "\ufffdt#\025\ufffd\u065d\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12762815625" + "'", str9, "12762815625");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "9487647327245225278764966838" + "'", str11, "9487647327245225278764966838");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "9963144141752132490164602130" + "'", str13, "9963144141752132490164602130");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("582");
        java.lang.String str13 = rSA1.decrypt("52521875");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\002" + "'", str7, "\002\ufffd\002");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1933686572" + "'", str9, "1933686572");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3190217370" + "'", str11, "3190217370");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#" + "'", str13, "#");
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("4089374768");
        java.math.BigInteger bigInteger4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = rSA1.encrypt(bigInteger4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("478");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "478" + "'", str7, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "14584340700" + "'", str13, "14584340700");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\037\ufffd\027\ufffd\ufffdq5");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\ufffdK");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd^\032" + "'", str9, "\ufffd^\032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1555826963" + "'", str11, "1555826963");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1253467370" + "'", str13, "1253467370");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.decrypt("166");
        java.lang.String str13 = rSA1.encrypt("517");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"r\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "285" + "'", str7, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "294" + "'", str9, "294");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "187" + "'", str13, "187");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("222");
        java.lang.String str11 = rSA1.decrypt("374");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2124896789" + "'", str9, "2124896789");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str11, "\ufffd\ufffd\ufffd");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("461");
        java.lang.String str11 = rSA1.encrypt("232");
        java.lang.String str13 = rSA1.encrypt("\031");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001f" + "'", str3, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\u02a8\ufffd" + "'", str7, "\001\ufffd\u02a8\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3958872871" + "'", str9, "3958872871");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3511163339" + "'", str11, "3511163339");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10552031185" + "'", str13, "10552031185");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("461");
        java.lang.String str11 = rSA1.encrypt("598335595765249845160178918537");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\022\ufffd" + "'", str7, "\001\022\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1845962092" + "'", str9, "1845962092");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4738114149" + "'", str11, "4738114149");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("946669947");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd");
        java.lang.String str13 = rSA1.encrypt("174");
        java.lang.String str15 = rSA1.encrypt("32240514587154718931662346782");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "521" + "'", str3, "521");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "D" + "'", str7, "D");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "g" + "'", str9, "g");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "425" + "'", str11, "425");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "249" + "'", str13, "249");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "232" + "'", str15, "232");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("658320474506132562654648259626");
        java.lang.String str13 = rSA1.decrypt("29358506122049777298420844854");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "272969633120771513421161122948" + "'", str11, "272969633120771513421161122948");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdFS" + "'", str13, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdFS");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\002u");
        java.lang.String str9 = rSA1.decrypt("371");
        java.lang.String str11 = rSA1.decrypt("784159943467916");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "304" + "'", str3, "304");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "576" + "'", str5, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "413" + "'", str7, "413");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\016" + "'", str9, "\002\016");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd63^\020j+\r");
        java.lang.String str9 = rSA1.encrypt("2951232610");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("604");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001n" + "'", str5, "\001n");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "122" + "'", str7, "122");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "249" + "'", str9, "249");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001W" + "'", str5, "\001W");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005" + "'", str7, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "902975731783048944247984144092" + "'", str11, "902975731783048944247984144092");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "179753498521976946575734489316" + "'", str13, "179753498521976946575734489316");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\fA\034u\031L" + "'", str15, "\001\ufffd\ufffd\ufffd\ufffd\fA\034u\031L");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\ufffd\006\ufffd\ufffd\ufffd" + "'", str17, "\005\ufffd\ufffd\006\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "156941274429748428347824748532" + "'", str19, "156941274429748428347824748532");
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002!" + "'", str3, "\002!");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\\\ufffd\007\004\ufffd\004k" + "'", str9, "\004\\\ufffd\007\004\ufffd\004k");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "261670176864615986945953262464" + "'", str15, "261670176864615986945953262464");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "174407473204797584396325827253" + "'", str17, "174407473204797584396325827253");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("2155055185841074");
        java.lang.String str11 = rSA1.decrypt("474552");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\004");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\b\ufffd\ufffd\037\ufffd\ufffdw");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??[\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "236" + "'", str3, "236");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\032" + "'", str5, "\001\032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000" + "'", str7, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "163" + "'", str9, "163");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\f" + "'", str11, "\f");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "196" + "'", str13, "196");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.decrypt("279");
        java.lang.String str11 = rSA1.decrypt("177");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "479" + "'", str7, "479");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd63^\020j+\r");
        java.lang.String str9 = rSA1.encrypt("2951232610");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "136" + "'", str7, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "193" + "'", str9, "193");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.decrypt("171");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("4738114149");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\u0195\ufffd\f\ufffd{D" + "'", str11, "\003\u0195\ufffd\f\ufffd{D");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "v\ry," + "'", str15, "v\ry,");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\002\001");
        java.lang.String str13 = rSA1.decrypt("328805791735498462601197839334");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffdF" + "'", str7, "\001\ufffd\ufffdF");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\u05b7\ufffd" + "'", str9, "\000\u05b7\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6878552979" + "'", str11, "6878552979");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\000\ufffd\ufffd\026" + "'", str13, "\002\000\ufffd\ufffd\026");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "20087095620331456667812072427" + "'", str11, "20087095620331456667812072427");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.decrypt("34089860651578007478246711177");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "560" + "'", str3, "560");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "907" + "'", str5, "907");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd" + "'", str7, "\003\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
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
            java.lang.String str17 = rSA1.decrypt("\001\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20" + "'", str3, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "58" + "'", str7, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "220" + "'", str13, "220");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '#');
        java.lang.String str9 = rSA1.decrypt("2063650974266313");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20" + "'", str3, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffd\ufffd");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.decrypt("495");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "622" + "'", str3, "622");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9906371077729385601355304989" + "'", str7, "9906371077729385601355304989");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("222");
        java.lang.String str11 = rSA1.decrypt("135091294");
        java.lang.String str13 = rSA1.decrypt("420302657462966387311701231107");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "142" + "'", str5, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "635004418" + "'", str9, "635004418");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd" + "'", str11, "\007\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("946669947");
        java.lang.String str7 = rSA1.encrypt("414601987065913579031306059745");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("468");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "81" + "'", str7, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5669774164" + "'", str13, "5669774164");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.decrypt("2036231921391631");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "24390844731826541911635370726" + "'", str3, "24390844731826541911635370726");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str5, "\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("168");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd\f\r\ufffd\021x");
        java.lang.String str17 = rSA1.decrypt("1374125732820434");
        java.lang.String str19 = rSA1.encrypt("\000\ufffd\ufffd/");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001G" + "'", str3, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\021" + "'", str7, "\001\ufffd\ufffd\021");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "856648148" + "'", str9, "856648148");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1745829661" + "'", str11, "1745829661");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "635750521463096295022083250892" + "'", str15, "635750521463096295022083250892");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\ufffd\ufffd9\024\ufffd\ufffd\037\ufffd\034" + "'", str17, "\004\ufffd\ufffd\ufffd9\024\ufffd\ufffd\037\ufffd\034");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "756511533255177548032472498810" + "'", str19, "756511533255177548032472498810");
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("495");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.encrypt("Z\013\ufffd\r");
        rSA1.generateKeys((int) '4');
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "D" + "'", str7, "D");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "g" + "'", str9, "g");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "189" + "'", str11, "189");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "24083058815075010780170569265" + "'", str15, "24083058815075010780170569265");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("235");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t\001\ufffd\ufffd\ufffd\u036d\ufffd\000\ufffd\ufffd" + "'", str7, "\t\001\ufffd\ufffd\ufffd\u036d\ufffd\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n\ufffd\026\ufffd\ufffdsEl\"\021K" + "'", str11, "\n\ufffd\026\ufffd\ufffdsEl\"\021K");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        java.lang.String str9 = rSA1.encrypt("\f\ufffdx");
        java.lang.String str11 = rSA1.decrypt("1427855474");
        java.lang.String str13 = rSA1.decrypt("307707995715569958842130375");
        java.lang.String str15 = rSA1.encrypt("519150271579176891438134447055");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "566674464994567073532493552668" + "'", str5, "566674464994567073532493552668");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\u0454\013\ufffd\ufffd\ufffdkk" + "'", str7, "\003\u0454\013\ufffd\ufffd\ufffdkk");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "523933566973639120382530189121" + "'", str9, "523933566973639120382530189121");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffds\f\ufffd\ufffd\u0182\026" + "'", str11, "\005\ufffd\ufffds\f\ufffd\ufffd\u0182\026");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\027\ufffd\ufffd\ufffd\ufffdd" + "'", str13, "\b\ufffd\ufffd\ufffd\ufffd\027\ufffd\ufffd\ufffd\ufffdd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "722524032491836491901650571703" + "'", str15, "722524032491836491901650571703");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("61");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001n" + "'", str7, "\001n");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("23585400911907150218938419175");
        java.lang.String str5 = rSA1.encrypt("\001\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\007" + "'", str3, "\007");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "618" + "'", str5, "618");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("\025");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4084101" + "'", str3, "4084101");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("1571893042486033");
        java.lang.String str9 = rSA1.encrypt("\003\021\ufffd\u076d\ufffd\u06fd\ufffdX\f\020");
        java.lang.String str11 = rSA1.decrypt("519");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "473" + "'", str5, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "424" + "'", str9, "424");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002%" + "'", str11, "\002%");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("565");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "357" + "'", str3, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "17772709741650256861119079446" + "'", str7, "17772709741650256861119079446");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("160015912349121428858268699636");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "53066761467102571533880839235" + "'", str9, "53066761467102571533880839235");
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("461");
        java.lang.String str9 = rSA1.encrypt("\005");
        java.lang.String str11 = rSA1.encrypt("O");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd" + "'", str7, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "125" + "'", str9, "125");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "493039" + "'", str11, "493039");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("531");
        java.lang.String str7 = rSA1.encrypt("\002W");
        java.lang.String str9 = rSA1.decrypt("4448254484");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "394" + "'", str5, "394");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "79" + "'", str7, "79");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001j" + "'", str9, "\001j");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("461");
        java.lang.String str11 = rSA1.encrypt("232");
        java.lang.String str13 = rSA1.encrypt("\031");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u068fP" + "'", str7, "\u068fP");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3669767508" + "'", str9, "3669767508");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5384324366" + "'", str11, "5384324366");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6103515625" + "'", str13, "6103515625");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
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
            java.math.BigInteger bigInteger29 = rSA1.encrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\u05fa\u018f\ufffd\u0133" + "'", str13, "\ufffd\u05fa\u018f\ufffd\u0133");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\ufffd\ufffd}p}" + "'", str17, "\006\ufffd\ufffd}p}");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "366670597332825" + "'", str19, "366670597332825");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\u0204\ufffd\ufffdY" + "'", str21, "\001\u0204\ufffd\ufffdY");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2443063741931864" + "'", str25, "2443063741931864");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1455558307118547" + "'", str27, "1455558307118547");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("441");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001G" + "'", str5, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "509" + "'", str7, "509");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "50001928" + "'", str11, "50001928");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("155325805838506");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "29202645233485732901031627801" + "'", str7, "29202645233485732901031627801");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\025\ufffda]\004\u0124\ufffd\ufffd9," + "'", str9, "\025\ufffda]\004\u0124\ufffd\ufffd9,");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("461");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\f\ufffd\ufffdQ" + "'", str7, "\001\f\ufffd\ufffdQ");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3780589491" + "'", str9, "3780589491");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "62764173167595370267551126827" + "'", str5, "62764173167595370267551126827");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\b\177\u0110\t\ufffd\u07f4\ufffd\ufffdP" + "'", str7, "\b\177\u0110\t\ufffd\u07f4\ufffd\ufffdP");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "620710378238263734089071093480" + "'", str9, "620710378238263734089071093480");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "821386323758378914731386570299" + "'", str11, "821386323758378914731386570299");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("946669947");
        java.lang.String str7 = rSA1.encrypt("414601987065913579031306059745");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("468");
        java.lang.String str15 = rSA1.encrypt("57180256162005942429712285534");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002F" + "'", str5, "\002F");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "260" + "'", str7, "260");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8066576948" + "'", str13, "8066576948");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4914108953" + "'", str15, "4914108953");
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("1208902895495334527");
        java.lang.String str9 = rSA1.decrypt("233006726736920949521554542653");
        java.lang.String str11 = rSA1.encrypt("18");
        java.lang.String str13 = rSA1.encrypt("\ufffd\\\032\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "325583275881108489967887904219" + "'", str5, "325583275881108489967887904219");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\177" + "'", str7, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t\032\ufffd\ufffd\ufffd\ufffd\ufffd\u02d8" + "'", str9, "\t\032\ufffd\ufffd\ufffd\ufffd\ufffd\u02d8");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "50418952181337600000000000000" + "'", str11, "50418952181337600000000000000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "236889870041429538113994045500" + "'", str13, "236889870041429538113994045500");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.encrypt("674589993819081348249");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "461" + "'", str7, "461");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "31" + "'", str11, "31");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "131" + "'", str15, "131");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\u07ba\ufffd\ufffd");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "492499476197320260132950617093" + "'", str5, "492499476197320260132950617093");
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("208642166923338001575549632629");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20" + "'", str3, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "58" + "'", str7, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "724" + "'", str9, "724");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("1906624");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "473" + "'", str5, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "167" + "'", str7, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "|" + "'", str11, "|");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\004\ufffd\ufffd5\021\005" + "'", str3, "\004\ufffd\ufffd5\021\005");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("|");
        java.lang.String str11 = rSA1.decrypt("270");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "470" + "'", str5, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "270" + "'", str7, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "193" + "'", str9, "193");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        java.lang.String str9 = rSA1.encrypt("{");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "708794300559598578451331290498" + "'", str5, "708794300559598578451331290498");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\nN\031\ufffd\033f\027\ufffd33" + "'", str7, "\nN\031\ufffd\033f\027\ufffd33");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "425927596977747" + "'", str9, "425927596977747");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str7 = rSA1.encrypt("393");
        java.lang.String str9 = rSA1.encrypt("\013lf\020\ufffd\034\ufffd\ufffd\ufffd\016\ufffdah");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.encrypt("2953018038");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "260" + "'", str7, "260");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "194" + "'", str9, "194");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "236" + "'", str15, "236");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("160015912349121428858268699636");
        java.lang.String str13 = rSA1.encrypt("524392483020391731177759169026");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "555242936180291648975696326944" + "'", str11, "555242936180291648975696326944");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "86394430543041763115764153648" + "'", str13, "86394430543041763115764153648");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("11987024600102659472279216119");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("<");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"<\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O" + "'", str5, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "416" + "'", str7, "416");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "287" + "'", str9, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5345199598973605748528045161" + "'", str13, "5345199598973605748528045161");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("160015912349121428858268699636");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "248577741061470334709914169871" + "'", str11, "248577741061470334709914169871");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("352232997633148504781500198579");
        java.lang.String str9 = rSA1.encrypt("1102300624");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "601889957708905" + "'", str7, "601889957708905");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1322033034620290" + "'", str9, "1322033034620290");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("61273672939825812829984836584");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\ufffdX");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"_`?X\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\004\ufffd\ufffd" + "'", str7, "\002\004\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11131491768" + "'", str9, "11131491768");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\023" + "'", str11, "\ufffd\023");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.encrypt("\001\031");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd5," + "'", str7, "\ufffd5,");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "22188041" + "'", str13, "22188041");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\000");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "616" + "'", str7, "616");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\001\ufffd\b\ufffd\ufffd\000\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001J\000yr" + "'", str7, "\001J\000yr");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\u0354" + "'", str9, "\001\ufffd\u0354");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("393");
        java.lang.String str7 = rSA1.encrypt("556176107112066662549548393072");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "279" + "'", str5, "279");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "56" + "'", str7, "56");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("461");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3502853330" + "'", str9, "3502853330");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "234" + "'", str13, "234");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
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
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7495170508520981316073909016" + "'", str7, "7495170508520981316073909016");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "U" + "'", str13, "U");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("2155055185841074");
        java.lang.String str11 = rSA1.encrypt("627871141952798007064534203107");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "D" + "'", str7, "D");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "310" + "'", str9, "310");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "334" + "'", str11, "334");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        java.lang.String str9 = rSA1.encrypt("\f\ufffdx");
        java.lang.String str11 = rSA1.decrypt("1427855474");
        java.lang.String str13 = rSA1.decrypt("307707995715569958842130375");
        java.lang.String str15 = rSA1.encrypt("519150271579176891438134447055");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "248593448934468424261821840090" + "'", str5, "248593448934468424261821840090");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\u03af\ufffdJ\022\ufffd\ufffd" + "'", str7, "\005\u03af\ufffdJ\022\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "304812366436618868755353783485" + "'", str9, "304812366436618868755353783485");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\u0210\034\027\ufffd\017\021\u0397\ufffd\ufffd" + "'", str11, "\001\u0210\034\027\ufffd\017\021\u0397\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\013\ufffd\ufffd\ufffd8_" + "'", str13, "\013\ufffd\ufffd\ufffd8_");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "477315728552296989169204222028" + "'", str15, "477315728552296989169204222028");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O" + "'", str5, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "416" + "'", str7, "416");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "287" + "'", str9, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "817106405" + "'", str13, "817106405");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6583054993" + "'", str15, "6583054993");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "46259663033006114956422919230" + "'", str19, "46259663033006114956422919230");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "250047" + "'", str21, "250047");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("\002\n\ufffd\ufffd\020");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\004\ufffdyw\023\ufffd@" + "'", str3, "\004\ufffdyw\023\ufffd@");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "461" + "'", str7, "461");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.decrypt("44874627577612233003");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\003\ufffd\006\ufffd\ufffd\ufffd\ufffd\u07e3" + "'", str5, "\003\ufffd\006\ufffd\ufffd\ufffd\ufffd\u07e3");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("z");
        rSA1.generateKeys((int) 'a');
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "357" + "'", str3, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "27027081632" + "'", str7, "27027081632");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.encrypt("188");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\020\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\ufffd\020\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "98338726380152425811365785789" + "'", str11, "98338726380152425811365785789");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("598936615230950507052406172861");
        java.lang.String str9 = rSA1.encrypt("\001(");
        java.lang.String str11 = rSA1.encrypt("245");
        java.lang.String str13 = rSA1.encrypt("23585400911907150218938419175");
        java.lang.String str15 = rSA1.encrypt("1961392473");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001G" + "'", str3, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25934336" + "'", str9, "25934336");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6666012662" + "'", str11, "6666012662");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6715069232" + "'", str13, "6715069232");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "702888599" + "'", str15, "702888599");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("253");
        java.lang.String str13 = rSA1.decrypt("450766669594624");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\004\ufffd\ufffd\016\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?UB\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001@" + "'", str7, "\001@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\032" + "'", str9, "\001\032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "|" + "'", str13, "|");
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("946669947");
        java.lang.String str7 = rSA1.encrypt("414601987065913579031306059745");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("452749904557785829080067757432");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "81" + "'", str7, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "874670290805152397331497055931" + "'", str11, "874670290805152397331497055931");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("495");
        java.lang.String str9 = rSA1.encrypt("695");
        java.lang.String str11 = rSA1.decrypt("424612467007043689195370760679");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124697016262639" + "'", str7, "124697016262639");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1932634193555192" + "'", str9, "1932634193555192");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002r\t\004\ufffd" + "'", str11, "\002r\t\004\ufffd");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("205");
        java.lang.String str11 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str13 = rSA1.encrypt("D");
        java.lang.String str15 = rSA1.decrypt("1453933568");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "223258859091224637084678250399" + "'", str5, "223258859091224637084678250399");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\u0639\ufffd(\214\000\u04ad" + "'", str7, "\000\ufffd\ufffd\u0639\ufffd(\214\000\u04ad");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "714761929826989600472027347484" + "'", str9, "714761929826989600472027347484");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "63085586324857788648219256585" + "'", str11, "63085586324857788648219256585");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1453933568" + "'", str13, "1453933568");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "D" + "'", str15, "D");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\002k\032Y:");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?k?Y:\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "81661985072952314130166071301" + "'", str5, "81661985072952314130166071301");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "710430165326154925385325564964" + "'", str7, "710430165326154925385325564964");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\035\ufffd\177\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffd\035\ufffd\177\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd>N\0074Y" + "'", str11, "\001\ufffd\ufffd\ufffd\ufffd\ufffd>N\0074Y");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "254" + "'", str19, "254");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("478");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u039d");
        java.lang.String str15 = rSA1.encrypt("720881662483885555150199331319");
        java.lang.String str17 = rSA1.encrypt("139669731288870443998258234849");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\207\177\ufffd\ufffd\025" + "'", str7, "\ufffd\207\177\ufffd\ufffd\025");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\\t\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\\\t\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "488" + "'", str13, "488");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "216" + "'", str15, "216");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "123" + "'", str17, "123");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.decrypt("166");
        java.lang.String str13 = rSA1.encrypt("517");
        java.lang.String str15 = rSA1.decrypt("720881662483885555150199331319");
        java.lang.String str17 = rSA1.encrypt("2977826838347180772119751944");
        java.lang.String str19 = rSA1.decrypt("390");
        java.lang.String str21 = rSA1.decrypt("65");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "42" + "'", str7, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "205" + "'", str9, "205");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\r" + "'", str11, "\r");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "191" + "'", str13, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "K" + "'", str15, "K");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "235" + "'", str17, "235");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "!" + "'", str19, "!");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "k" + "'", str21, "k");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("461");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.decrypt("581261998105623912352259846590");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\021\ufffd\ufffd" + "'", str7, "\000\ufffd\021\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1220798471" + "'", str9, "1220798471");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "178" + "'", str13, "178");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\u03b9\003\ufffd\ufffd\ufffdN\036\ufffd\ufffd" + "'", str17, "\005\u03b9\003\ufffd\ufffd\ufffdN\036\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.decrypt("166");
        java.lang.String str13 = rSA1.encrypt("517");
        java.lang.String str15 = rSA1.decrypt("720881662483885555150199331319");
        java.lang.String str17 = rSA1.encrypt("2977826838347180772119751944");
        java.lang.String str19 = rSA1.decrypt("390");
        java.lang.String str21 = rSA1.decrypt("65");
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\r" + "'", str11, "\r");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "191" + "'", str13, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "K" + "'", str15, "K");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "235" + "'", str17, "235");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "!" + "'", str19, "!");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "k" + "'", str21, "k");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("\002\u028e\r\ufffd\ufffd\f\ufffd\ufffd");
        java.lang.String str13 = rSA1.decrypt("211");
        java.lang.String str15 = rSA1.encrypt("\004\u05b9\ufffd\001Yt\035\ufffd\u04968");
        java.lang.String str17 = rSA1.decrypt("475");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1998947500173" + "'", str7, "1998947500173");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1998947500173" + "'", str9, "1998947500173");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "934970018798578495104945787424" + "'", str11, "934970018798578495104945787424");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t\ufffd\ufffd\036\ufffd\ufffd\ufffd\ufffd?" + "'", str13, "\t\ufffd\ufffd\036\ufffd\ufffd\ufffd\ufffd?");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "679721389907540640835063198742" + "'", str15, "679721389907540640835063198742");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007w\031\ufffd\ufffd2<\177\ufffd\022t" + "'", str17, "\007w\031\ufffd\ufffd2<\177\ufffd\022t");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.encrypt("674589993819081348249");
        java.lang.String str17 = rSA1.decrypt("338002209375332858346862763892");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "531" + "'", str7, "531");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "858" + "'", str11, "858");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "282" + "'", str15, "282");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("\025");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("331");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd\ufffdd*");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9261" + "'", str3, "9261");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "37778857553612031121" + "'", str7, "37778857553612031121");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "57167430239604700756368535102" + "'", str9, "57167430239604700756368535102");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("1208902895495334527");
        java.lang.String str9 = rSA1.decrypt("233006726736920949521554542653");
        java.lang.String str11 = rSA1.encrypt("18");
        java.lang.String str13 = rSA1.encrypt("\ufffd\\\032\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "601412939144148487999277210780" + "'", str5, "601412939144148487999277210780");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd\032\u04af\ufffd>^" + "'", str7, "\001\ufffd\ufffd\ufffd\032\u04af\ufffd>^");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffdL0i]\023\ufffd\u03f8" + "'", str9, "\002\ufffd\ufffdL0i]\023\ufffd\u03f8");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "317579693760000000000" + "'", str11, "317579693760000000000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "137374974200153994336036716583" + "'", str13, "137374974200153994336036716583");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("11716232800583690748559256041");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.decrypt("297390345872291348704589241775");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "421779714064818347205868814772" + "'", str5, "421779714064818347205868814772");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124776309076296774527960185527" + "'", str7, "124776309076296774527960185527");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\ufffd|\013\ufffd\037\ufffd" + "'", str9, "\005\ufffd\ufffd\ufffd|\013\ufffd\037\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\036\"\ufffd\ufffd\\\ufffd\ufffd_" + "'", str11, "\003\ufffd\036\"\ufffd\ufffd\\\ufffd\ufffd_");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd-" + "'", str17, "\ufffd-");
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001n" + "'", str5, "\001n");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001u" + "'", str7, "\001u");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\u0198\ufffd\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffd\u0198\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("\f\ufffd\ufffd\ufffd\ufffd\u061d\ufffd\u06fe");
        java.lang.String str11 = rSA1.decrypt("304417796247364099549471429573");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23509955487960715140744001668" + "'", str7, "23509955487960715140744001668");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "16763038087805259839596194953" + "'", str9, "16763038087805259839596194953");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\024\ufffd\u03c0\ufffd{\177\ufffd\ufffd\034:" + "'", str11, "\024\ufffd\u03c0\ufffd{\177\ufffd\ufffd\034:");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("393");
        java.lang.String str7 = rSA1.decrypt("227022896246510918381181022856");
        java.lang.String str9 = rSA1.decrypt("531");
        java.lang.String str11 = rSA1.encrypt("\005\006\ufffd\000hH");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "279" + "'", str5, "279");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001I" + "'", str7, "\001I");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\t" + "'", str9, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "66" + "'", str11, "66");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\u014c733" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\u014c733");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\u078c" + "'", str17, "\002\ufffd\u078c");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001&" + "'", str9, "\001&");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("6");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002!" + "'", str3, "\002!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.decrypt("314");
        java.lang.String str15 = rSA1.decrypt("2533194306");
        java.lang.String str17 = rSA1.decrypt("25812355359064");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "219" + "'", str9, "219");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001v" + "'", str13, "\001v");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\r" + "'", str15, "\001\r");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001l" + "'", str17, "\001l");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("305");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.decrypt("\000\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\b\025\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\b\025\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2798422632812489" + "'", str5, "2798422632812489");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("\002\ufffd");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\001\ufffd\ufffd\027\033gVf\003\032C\033\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "58" + "'", str15, "58");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        rSA1.generateKeys((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "96" + "'", str5, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "117" + "'", str7, "117");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "403" + "'", str11, "403");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.decrypt("616");
        rSA1.generateKeys((int) 'a');
        java.lang.String str9 = rSA1.decrypt("521");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "z" + "'", str5, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.encrypt("1610322262");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "(\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "604323143283471592830071218511" + "'", str11, "604323143283471592830071218511");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("387");
        java.lang.String str9 = rSA1.encrypt("i");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdW\"" + "'", str7, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdW\"");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12762815625" + "'", str9, "12762815625");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2769335170395739688753675009" + "'", str11, "2769335170395739688753675009");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("703153339289949437747864939069");
        java.lang.String str13 = rSA1.encrypt("167");
        java.lang.String str15 = rSA1.encrypt("24728158503917487987839420576");
        java.lang.String str17 = rSA1.decrypt("23");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffdLV\027\ufffd" + "'", str11, "\004\ufffd\ufffdLV\027\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2381459478685475" + "'", str13, "2381459478685475");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1920982606421916" + "'", str15, "1920982606421916");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t\u01a2\ufffdI" + "'", str17, "\t\u01a2\ufffdI");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("#");
        java.lang.String str11 = rSA1.decrypt("1");
        java.lang.String str13 = rSA1.encrypt("1249781321");
        java.lang.String str15 = rSA1.decrypt("24728158503917487987839420576");
        java.lang.String str17 = rSA1.encrypt("\b+X\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdy");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\005\ufffd\ufffdm\004");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??,F?m?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100034386979973637422059839930" + "'", str5, "100034386979973637422059839930");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006\ufffd\ufffd\t\ufffdyW'" + "'", str7, "\006\ufffd\ufffd\t\ufffdyW'");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "96549157373046875" + "'", str9, "96549157373046875");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "544265866849908657501155778351" + "'", str13, "544265866849908657501155778351");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\024" + "'", str15, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\024");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "50071289065866989368941645430" + "'", str17, "50071289065866989368941645430");
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("208642166923338001575549632629");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "555673510403649237558006483347" + "'", str5, "555673510403649237558006483347");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "292479023073762610226741355366" + "'", str7, "292479023073762610226741355366");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\036\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffd\ufffd\ufffd\036\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd9%\022IH" + "'", str11, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd9%\022IH");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("432");
        java.lang.String str9 = rSA1.encrypt("1208902895495334527");
        java.lang.String str11 = rSA1.decrypt("5");
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\032\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "698" + "'", str7, "698");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "136" + "'", str9, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "118" + "'", str13, "118");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("393");
        java.lang.Class<?> wildcardClass4 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\004\ufffd\ufffd\u03e3\ufffd\004\ufffd\ufffd\ufffdq" + "'", str3, "\004\ufffd\ufffd\u03e3\ufffd\004\ufffd\ufffd\ufffdq");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("12856024970639395620261580662");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "33562394575160520077" + "'", str3, "33562394575160520077");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "20158701596448060843873258362" + "'", str5, "20158701596448060843873258362");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("495");
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\u2804t\021\013");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000" + "'", str7, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001K" + "'", str9, "\001K");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "187" + "'", str11, "187");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "296" + "'", str13, "296");
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002L" + "'", str5, "\002L");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007" + "'", str7, "\007");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "438439162685123146586223534398" + "'", str11, "438439162685123146586223534398");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "358982603686997368015667118504" + "'", str13, "358982603686997368015667118504");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\003\ufffd\ufffd-\002\ufffd\ufffd" + "'", str15, "\000\ufffd\ufffd\003\ufffd\ufffd-\002\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n\ufffd\033\031\ufffdn\035\ufffd\ufffd" + "'", str17, "\n\ufffd\033\031\ufffdn\035\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "387713190352787776253930002553" + "'", str19, "387713190352787776253930002553");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "28190905123586160699701952072" + "'", str21, "28190905123586160699701952072");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd\ufffd\ufffd\u0186\ufffd\ufffd" + "'", str23, "\001\ufffd\ufffd\ufffd\u0186\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\ufffd\u0795\ufffd$");
        java.lang.String str13 = rSA1.decrypt("7058561899");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\035" + "'", str7, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "50" + "'", str9, "50");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "392" + "'", str11, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("478");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u039d");
        java.lang.String str15 = rSA1.encrypt("720881662483885555150199331319");
        java.lang.String str17 = rSA1.encrypt("139669731288870443998258234849");
        java.lang.String str19 = rSA1.decrypt("4");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\017\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\002\017\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\036\005\u0157\ufffd\ufffd\ufffd\u03e7" + "'", str9, "\036\005\u0157\ufffd\ufffd\ufffd\u03e7");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "635" + "'", str13, "635");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "154" + "'", str15, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "92" + "'", str17, "92");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002Q" + "'", str19, "\002Q");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\002u");
        java.lang.String str9 = rSA1.encrypt("453285907300587");
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "752" + "'", str3, "752");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "267" + "'", str5, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "402" + "'", str7, "402");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "613" + "'", str9, "613");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\003\ufffd\ufffd\000");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "323" + "'", str7, "323");
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.encrypt("48524739602976");
        java.lang.String str13 = rSA1.encrypt("172220326272323247298100382231");
        java.lang.String str15 = rSA1.decrypt("539855473183136212072291450591");
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.decrypt("600320534111777632214336950773");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\ufffdG\020\ufffd" + "'", str7, "\002\ufffd\ufffdG\020\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "414018937766987790000812656669" + "'", str11, "414018937766987790000812656669");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "821749520877076041828170317089" + "'", str13, "821749520877076041828170317089");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\013\u0756\ufffd\ufffd$" + "'", str15, "\005\ufffd\013\u0756\ufffd\ufffd$");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004\ufffd\ufffd\ufffd" + "'", str19, "\004\ufffd\ufffd\ufffd");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("441");
        java.lang.String str13 = rSA1.encrypt("573027999461902947452889180577");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "42" + "'", str7, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "125171830" + "'", str11, "125171830");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2716466290" + "'", str13, "2716466290");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        java.lang.String str13 = rSA1.decrypt("324006784837190610335526937353");
        java.lang.String str15 = rSA1.encrypt("692429752057800817142458536884");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\u020e\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\004\ufffd\u020e\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\032\ufffdFg\272\ufffd\ufffd\ufffd" + "'", str13, "\005\ufffd\032\ufffdFg\272\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "199306696913929336767454809076" + "'", str15, "199306696913929336767454809076");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("\002\ufffd");
        java.lang.String str17 = rSA1.encrypt("Q");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "42" + "'", str7, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "205" + "'", str9, "205");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "305" + "'", str15, "305");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "472" + "'", str17, "472");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("42418796185018424088");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("70");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "96" + "'", str5, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\034\ufffd\ufffd\032" + "'", str9, "\034\ufffd\ufffd\032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "633399715" + "'", str11, "633399715");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\024\u05ec7" + "'", str13, "\024\u05ec7");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1733647422" + "'", str15, "1733647422");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1396832607" + "'", str17, "1396832607");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "460753032408026172831360396895" + "'", str5, "460753032408026172831360396895");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1208902895495334527" + "'", str7, "1208902895495334527");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        java.lang.String str9 = rSA1.decrypt("8");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("465270144019721");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "325943873814412891290205142723" + "'", str5, "325943873814412891290205142723");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1208902895495334527" + "'", str7, "1208902895495334527");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\000\ufffdy\007\001\ufffd\ufffd" + "'", str9, "\001\ufffd\000\ufffdy\007\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "11798707231103022265851619017" + "'", str13, "11798707231103022265851619017");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.decrypt("9076220414");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\017\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdI");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?|?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6" + "'", str3, "6");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L" + "'", str5, "L");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.encrypt("\001\031");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\ufffdJ" + "'", str7, "\002\ufffd\ufffdJ");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "36116100" + "'", str13, "36116100");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.decrypt("387");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("84");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\002\034\ufffd\ufffd\ufffdD");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???2??D\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002u" + "'", str3, "\002u");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "491" + "'", str5, "491");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002<" + "'", str7, "\002<");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "201" + "'", str9, "201");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35" + "'", str11, "35");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("2312924388126772");
        java.lang.String str7 = rSA1.encrypt("\005\u04ac\ufffd\u04df\ufffd\ufffd\u067c<5");
        rSA1.generateKeys((int) (short) 10);
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "26238927971461798474684392298" + "'", str5, "26238927971461798474684392298");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "134606053400860826554274899132" + "'", str7, "134606053400860826554274899132");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("42418796185018424088");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "185" + "'", str3, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "266" + "'", str5, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\022" + "'", str9, "\ufffd\ufffd\022");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1938588118" + "'", str11, "1938588118");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffdB," + "'", str13, "\ufffdB,");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\u0646\ufffd\ufffd");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "478" + "'", str7, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\033\ufffd.\001\ufffdUf/\n" + "'", str13, "\033\ufffd.\001\ufffdUf/\n");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "42777182937517881767395310676" + "'", str15, "42777182937517881767395310676");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\002u");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\007\ufffd\016\ufffd\ufffd\ufffd\006\u01d3H");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "266" + "'", str5, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.encrypt("9346881411915179890603869120");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "564965572886776648505585156112" + "'", str5, "564965572886776648505585156112");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\b\ufffd\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\022" + "'", str7, "\b\ufffd\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\022");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "652655615500717409564570452712" + "'", str9, "652655615500717409564570452712");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35294289654930784268803017971" + "'", str11, "35294289654930784268803017971");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "966355800" + "'", str15, "966355800");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
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
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "519" + "'", str13, "519");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.decrypt("166");
        java.lang.String str13 = rSA1.encrypt("517");
        java.lang.String str15 = rSA1.decrypt("720881662483885555150199331319");
        java.lang.String str17 = rSA1.encrypt("2977826838347180772119751944");
        java.lang.String str19 = rSA1.decrypt("630301081524161159585537139484");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\003" + "'", str11, "\001\003");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "64" + "'", str13, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "6" + "'", str17, "6");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str7 = rSA1.encrypt("393");
        java.lang.String str9 = rSA1.encrypt("\013lf\020\ufffd\034\ufffd\ufffd\ufffd\016\ufffdah");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.encrypt("2953018038");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "111" + "'", str7, "111");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "63" + "'", str9, "63");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "444" + "'", str15, "444");
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd63^\020j+\r");
        java.lang.String str9 = rSA1.encrypt("2951232610");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\ufffd\ufffd]");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!??]\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "185" + "'", str3, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "200" + "'", str7, "200");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "69" + "'", str9, "69");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("306842132257782653009905995376");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169599501682828941204810720768" + "'", str5, "169599501682828941204810720768");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("302478007679515165391351820133");
        java.lang.String str15 = rSA1.encrypt("21262565530067871612812451046");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "235015800244836803926963450502" + "'", str11, "235015800244836803926963450502");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "533573214708929314507494411467" + "'", str13, "533573214708929314507494411467");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "156244054753759375983935060247" + "'", str15, "156244054753759375983935060247");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.encrypt("188");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "S\004\ufffd\ufffd\ufffdS\177\ufffd\ufffd" + "'", str7, "S\004\ufffd\ufffd\ufffdS\177\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "389381962882485120175976226839" + "'", str11, "389381962882485120175976226839");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.decrypt("641495569173411");
        java.lang.String str7 = rSA1.decrypt("44690606995474965646087032640");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\001\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\006\032\ufffd\ufffd\ufffd\ufffd\ufffdV" + "'", str5, "\006\032\ufffd\ufffd\ufffd\ufffd\ufffdV");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\r\ufffd\ufffd\ufffd\ufffd\ufffd\034\ufffd" + "'", str7, "\005\r\ufffd\ufffd\ufffd\ufffd\ufffd\034\ufffd");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
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
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\004\ufffdzuO8/\007\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?U$?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "42" + "'", str7, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "205" + "'", str9, "205");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6670091972" + "'", str13, "6670091972");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd&" + "'", str15, "\002\ufffd&");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2490945677" + "'", str17, "2490945677");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4638175903" + "'", str19, "4638175903");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("|");
        java.lang.String str11 = rSA1.decrypt("270");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("\b\u0421\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "473" + "'", str5, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "167" + "'", str7, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "288" + "'", str9, "288");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "427097490359998322002682734015" + "'", str15, "427097490359998322002682734015");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.decrypt("342981671868457888627866774352");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "50334980593118017863872015613" + "'", str7, "50334980593118017863872015613");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0485" + "'", str9, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0485");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("1075488919");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "66" + "'", str3, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "14943198480765773072065624699" + "'", str7, "14943198480765773072065624699");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
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
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "24964049976396369332117583627" + "'", str3, "24964049976396369332117583627");
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\007\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("303508058494898981514062078255");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "96" + "'", str5, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "122" + "'", str7, "122");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "140" + "'", str9, "140");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002!" + "'", str3, "\002!");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd+\034\ufffd\ufffdl]\\" + "'", str9, "\004\ufffd\ufffd+\034\ufffd\ufffdl]\\");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1815848" + "'", str15, "1815848");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "114135712791764170790096327358" + "'", str17, "114135712791764170790096327358");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "419590407174563918221185249436" + "'", str19, "419590407174563918221185249436");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
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
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "576" + "'", str5, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "306" + "'", str7, "306");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "438" + "'", str11, "438");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "535" + "'", str13, "535");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "62" + "'", str17, "62");
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("11716232800583690748559256041");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.encrypt("\001;");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\006\ufffd\ufffd\ufffd\ufffd\u0717\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??(\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "322062382599216897747653145928" + "'", str5, "322062382599216897747653145928");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "433078272362394407418335074832" + "'", str7, "433078272362394407418335074832");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\001U" + "'", str9, "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\001U");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\002\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\004\002\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "31255875" + "'", str17, "31255875");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\b\007\r\ufffd\ufffdaod\037\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "134" + "'", str7, "134");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("23585400911907150218938419175");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "392902437108159562949556809473" + "'", str5, "392902437108159562949556809473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1208902895495334527" + "'", str7, "1208902895495334527");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "23771978221761550669205751816" + "'", str13, "23771978221761550669205751816");
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd");
        java.lang.String str13 = rSA1.encrypt("174");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "304" + "'", str3, "304");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001i" + "'", str7, "\001i");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001q" + "'", str9, "\001q");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "348" + "'", str11, "348");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "337" + "'", str13, "337");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("465270144019721");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("8");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("805453545486090582568173469490");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p" + "'", str3, "p");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "491" + "'", str5, "491");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "33" + "'", str7, "33");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001F" + "'", str11, "\001F");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "285" + "'", str13, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "89" + "'", str15, "89");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("658320474506132562654648259626");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "50334980593118017863872015613" + "'", str7, "50334980593118017863872015613");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "50334980593118017863872015613" + "'", str9, "50334980593118017863872015613");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "252365557741956699088308731922" + "'", str11, "252365557741956699088308731922");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1611067079503803");
        java.lang.String str13 = rSA1.decrypt("18980981751395059997709561778");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("2168059484");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "96" + "'", str5, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "117" + "'", str7, "117");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "143" + "'", str11, "143");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "274525215427351449951782715197" + "'", str5, "274525215427351449951782715197");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd+\0041\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd+\0041\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("432");
        java.lang.String str9 = rSA1.encrypt("1208902895495334527");
        java.lang.String str11 = rSA1.decrypt("5");
        java.lang.String str13 = rSA1.encrypt("497");
        java.lang.String str15 = rSA1.decrypt("9014646877");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "357" + "'", str7, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "415" + "'", str9, "415");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "88" + "'", str13, "88");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\0019" + "'", str15, "\0019");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd7$:\t\ufffd");
        java.lang.String str13 = rSA1.encrypt("I");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001G" + "'", str3, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\ufffd" + "'", str7, "\002\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "894" + "'", str11, "894");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "427" + "'", str13, "427");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "70" + "'", str3, "70");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str11 = rSA1.encrypt("\002\ufffd>");
        java.lang.String str13 = rSA1.decrypt("23264544955983291322485115342");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\ufffd\ufffdl\024\ufffd\\\ufffdP");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"~?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\013\ufffdO\020\ufffd\ufffd\ufffd\ufffdtDy" + "'", str7, "\013\ufffdO\020\ufffd\ufffd\ufffd\ufffdtDy");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12685255957324053129389832061" + "'", str9, "12685255957324053129389832061");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "90118779029259049485052263" + "'", str11, "90118779029259049485052263");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u2cea.\024\ufffd\ufffd\ufffdE" + "'", str13, "\u2cea.\024\ufffd\ufffd\ufffdE");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "29316250624" + "'", str11, "29316250624");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\022," + "'", str13, "\004\ufffd\ufffd\022,");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1419974644396497" + "'", str15, "1419974644396497");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1069453391384477" + "'", str17, "1069453391384477");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\004\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("495");
        java.lang.String str9 = rSA1.encrypt("695");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1824822932870538" + "'", str7, "1824822932870538");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2279753703741519" + "'", str9, "2279753703741519");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("#");
        java.lang.String str11 = rSA1.decrypt("1");
        java.lang.String str13 = rSA1.encrypt("1249781321");
        java.lang.String str15 = rSA1.decrypt("24728158503917487987839420576");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "521703261046933755674890096291" + "'", str5, "521703261046933755674890096291");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\u0197\ufffd\031\ufffd\ufffd" + "'", str7, "\003\ufffd\ufffd\u0197\ufffd\031\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "52521875" + "'", str9, "52521875");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "598875201844406190431409147567" + "'", str13, "598875201844406190431409147567");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":\003\ufffdL2\023\ufffd\ufffd\ufffdc" + "'", str15, ":\003\ufffdL2\023\ufffd\ufffd\ufffdc");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("|");
        java.lang.String str11 = rSA1.decrypt("270");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.encrypt("63340691434617068610410340865");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "167" + "'", str7, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "307" + "'", str9, "307");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1290383391" + "'", str15, "1290383391");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("61273672939825812829984836584");
        java.lang.String str13 = rSA1.decrypt("125");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6292626484" + "'", str9, "6292626484");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\ufffd" + "'", str11, "\t\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd" + "'", str13, "\ufffd");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd63^\020j+\r");
        java.lang.String str9 = rSA1.encrypt("2951232610");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "663" + "'", str7, "663");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "596" + "'", str9, "596");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("\002\ufffd");
        java.lang.String str17 = rSA1.encrypt("Q");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "509" + "'", str17, "509");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        java.lang.String str9 = rSA1.encrypt("{");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\ufffd\034\u06b5\ufffd\u01e1\ufffd\020\ufffd" + "'", str7, "\005\ufffd\034\u06b5\ufffd\u01e1\ufffd\020\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1860867" + "'", str9, "1860867");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.encrypt("\003i\t\ufffd\ufffdn");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "15134324397927427445681832301" + "'", str5, "15134324397927427445681832301");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\f\ufffd" + "'", str7, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\f\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "101921849019820412200723768153" + "'", str9, "101921849019820412200723768153");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "441655618941001392407619569335" + "'", str11, "441655618941001392407619569335");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "904288259" + "'", str15, "904288259");
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.encrypt("9215357598594065411749980871");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "461" + "'", str7, "461");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "176" + "'", str11, "176");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3904395643" + "'", str15, "3904395643");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "z" + "'", str5, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "646" + "'", str7, "646");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "693" + "'", str9, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1107789592" + "'", str13, "1107789592");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1434076774" + "'", str15, "1434076774");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\u86f3\ufffd" + "'", str17, "\000\u86f3\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "6430920296" + "'", str19, "6430920296");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("441");
        java.lang.String str13 = rSA1.encrypt("573027999461902947452889180577");
        java.lang.String str15 = rSA1.encrypt("669");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "436489909" + "'", str11, "436489909");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2756446378" + "'", str13, "2756446378");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2936371104" + "'", str15, "2936371104");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\u02d0\ufffd\016\ufffd\ufffd\ufffd\ufffd\037" + "'", str11, "\006\ufffd\u02d0\ufffd\016\ufffd\ufffd\ufffd\ufffd\037");
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\t" + "'", str5, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "788" + "'", str7, "788");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\b\ufffd\ufffd\ufffd3%\020f+\020i" + "'", str17, "\b\ufffd\ufffd\ufffd3%\020f+\020i");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "592194143451432668387125672274" + "'", str19, "592194143451432668387125672274");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        java.lang.String str15 = rSA1.encrypt("875");
        java.lang.String str17 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str19 = rSA1.encrypt("10");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001G" + "'", str5, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "509" + "'", str7, "509");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8" + "'", str9, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "I\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdW" + "'", str13, "I\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdW");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "50004784369000759949" + "'", str15, "50004784369000759949");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "14147461046875539504371855496" + "'", str17, "14147461046875539504371855496");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1996568178688" + "'", str19, "1996568178688");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1611067079503803");
        java.lang.String str13 = rSA1.decrypt("18980981751395059997709561778");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("2168059484");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "167" + "'", str7, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "438" + "'", str11, "438");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\013" + "'", str13, "\013");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "N" + "'", str17, "N");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("168");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd\f\r\ufffd\021x");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd*\027c" + "'", str7, "\001\ufffd*\027c");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3282173644" + "'", str9, "3282173644");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7043844767" + "'", str11, "7043844767");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "236517562296859348598231548174" + "'", str15, "236517562296859348598231548174");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.encrypt("292429178019428864799183198942");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "153537072906794906594159286926" + "'", str17, "153537072906794906594159286926");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("2\021\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str5 = rSA1.encrypt("12146206517674739852807191692");
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "704267417447115623902792380763" + "'", str3, "704267417447115623902792380763");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "616718606353047392139251512862" + "'", str5, "616718606353047392139251512862");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.encrypt("48524739602976");
        java.lang.String str13 = rSA1.encrypt("172220326272323247298100382231");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd^" + "'", str7, "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd^");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "207630071934257515571541051352" + "'", str11, "207630071934257515571541051352");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "529011904849756866481355467700" + "'", str13, "529011904849756866481355467700");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.encrypt("490");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("4141931971");
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1166409492" + "'", str3, "1166409492");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "54957408261395779601653550638" + "'", str7, "54957408261395779601653550638");
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("718921407");
        java.lang.String str7 = rSA1.encrypt("160447094929101878636944315018");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "79056333548595984150412490642" + "'", str5, "79056333548595984150412490642");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "250039134333393283865270658418" + "'", str7, "250039134333393283865270658418");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str11 = rSA1.encrypt("\002\ufffd>");
        java.lang.String str13 = rSA1.decrypt("55");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\b\ufffd\ufffd\000" + "'", str7, "\ufffd\ufffd\ufffd\ufffd\b\ufffd\ufffd\000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "45918048251226796225871236468" + "'", str9, "45918048251226796225871236468");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5164814492198769846277396329" + "'", str11, "5164814492198769846277396329");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\016\ufffd\u02d0\ufffd\ufffd" + "'", str13, "\016\ufffd\u02d0\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("441");
        java.lang.String str13 = rSA1.encrypt("573027999461902947452889180577");
        java.lang.String str15 = rSA1.encrypt("911315954");
        java.lang.String str17 = rSA1.encrypt("104856550369619112320090550784");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1748568893" + "'", str11, "1748568893");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "494921631" + "'", str13, "494921631");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1673990897" + "'", str15, "1673990897");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3102596869" + "'", str17, "3102596869");
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("292429178019428864799183198942");
        java.lang.String str17 = rSA1.encrypt("\006");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\000\ufffd\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001W" + "'", str5, "\001W");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005" + "'", str7, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\ufffd" + "'", str11, "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\034\u02b3\ufffd" + "'", str15, "\001\ufffd\034\u02b3\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7776" + "'", str17, "7776");
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        java.lang.String str5 = rSA1.decrypt("50334980593118017863872015613");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "477" + "'", str3, "477");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("160015912349121428858268699636");
        java.lang.String str13 = rSA1.encrypt("57636654166173727176000672159");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "14581779323301003119459772261" + "'", str11, "14581779323301003119459772261");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "331353530344858050139818870561" + "'", str13, "331353530344858050139818870561");
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("\003\001\ufffd\ufffd\ufffd\027\001\ufffd\u07a3");
        java.lang.String str15 = rSA1.encrypt("26507047337243548657799763260");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "285" + "'", str7, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "294" + "'", str9, "294");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1133775434" + "'", str13, "1133775434");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "5667959488" + "'", str15, "5667959488");
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "62" + "'", str7, "62");
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\032\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\032\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "64842352205769" + "'", str17, "64842352205769");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1212642542351441" + "'", str19, "1212642542351441");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1563475733117739" + "'", str21, "1563475733117739");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\u07db\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\002\ufffd\u07db\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "901490939034885" + "'", str17, "901490939034885");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "933887886801181" + "'", str19, "933887886801181");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "568269523704812" + "'", str21, "568269523704812");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("11716232800583690748559256041");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\005\ufffd\ufffd\ufffd\ufffd\ufffd\u0335%");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "92610216326661384481277391516" + "'", str5, "92610216326661384481277391516");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11802104273133802718800636288" + "'", str7, "11802104273133802718800636288");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffd\b\ufffd\013\ufffd\ufffd" + "'", str9, "\003\ufffd\ufffd\ufffd\b\ufffd\013\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\006\ufffdv" + "'", str11, "\003\ufffd\ufffd\ufffd\ufffd\006\ufffdv");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("465270144019721");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("8");
        java.lang.String str13 = rSA1.decrypt("110302133409931788576842747570");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\024" + "'", str3, "\024");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "240" + "'", str7, "240");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002" + "'", str11, "\002");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001]" + "'", str13, "\001]");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002L" + "'", str5, "\002L");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\032" + "'", str7, "\032");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "164" + "'", str9, "164");
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd7$:\t\ufffd");
        java.lang.String str13 = rSA1.encrypt("I");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\u0398\024\ufffd" + "'", str7, "\000\u0398\024\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "192" + "'", str11, "192");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "416" + "'", str13, "416");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\002\001");
        java.lang.String str13 = rSA1.decrypt("328805791735498462601197839334");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffdm\026\ufffd\ufffd\u0128");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n\ufffd\ufffd" + "'", str7, "\n\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "8056327796" + "'", str11, "8056327796");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}\032\007\ufffd" + "'", str13, "}\032\007\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7588820255" + "'", str15, "7588820255");
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("|");
        java.lang.String str13 = rSA1.decrypt("3350584720");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "z" + "'", str3, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\034\031\ufffd" + "'", str7, "\002\ufffd\034\031\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "29316250624" + "'", str11, "29316250624");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007eqD\022\ufffd\000" + "'", str13, "\007eqD\022\ufffd\000");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\005\ufffd\ufffd\n\ufffd\ufffd*");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "70" + "'", str3, "70");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6644282755956551184327243733" + "'", str7, "6644282755956551184327243733");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "396439929538632762796654317662" + "'", str11, "396439929538632762796654317662");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("393");
        java.lang.String str7 = rSA1.decrypt("227022896246510918381181022856");
        java.lang.String str9 = rSA1.decrypt("8");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "204" + "'", str5, "204");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
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
        rSA1.generateKeys(10);
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "478" + "'", str7, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "368" + "'", str19, "368");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
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
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("|");
        java.lang.String str13 = rSA1.decrypt("6203695486");
        java.lang.String str15 = rSA1.encrypt("911315954");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\005\005\ufffd" + "'", str7, "\001\ufffd\005\005\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "29316250624" + "'", str11, "29316250624");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffdivQJ" + "'", str13, "\ufffdivQJ");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1697776020287890" + "'", str15, "1697776020287890");
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("314");
        java.lang.String str5 = rSA1.decrypt("211");
        java.lang.String str7 = rSA1.encrypt("3476022725615491");
        java.lang.String str9 = rSA1.decrypt("297390345872291348704589241775");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576092871423363841031682026338" + "'", str3, "576092871423363841031682026338");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd\b\ufffd\ufffd\ufffdFR" + "'", str5, "\001\ufffd\b\ufffd\ufffd\ufffdFR");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "310069231049102456190512000594" + "'", str7, "310069231049102456190512000594");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\b\ufffd\ufffd\ufffd\u0670\ufffd\ufffd\ufffd\005\ufffd" + "'", str9, "\b\ufffd\ufffd\ufffd\u0670\ufffd\ufffd\ufffd\005\ufffd");
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\ufffd\ufffdV");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0485");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??|\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "211674068607666694574945082823" + "'", str5, "211674068607666694574945082823");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "251478812316954274908565349343" + "'", str7, "251478812316954274908565349343");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\u01f96\021\ufffd\005\ufffd\ufffd" + "'", str9, "\003\ufffd\u01f96\021\ufffd\005\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "479311267720309010354018284596" + "'", str11, "479311267720309010354018284596");
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("461");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd'" + "'", str7, "\ufffd'");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3435042064" + "'", str9, "3435042064");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "119" + "'", str13, "119");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        java.lang.String str9 = rSA1.encrypt("48241217274650060621544778321");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "186598289439760846654115054043" + "'", str5, "186598289439760846654115054043");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007\ufffd\ufffd\ufffd\u040f\ufffd\ufffd\031v" + "'", str7, "\007\ufffd\ufffd\ufffd\u040f\ufffd\ufffd\031v");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "342024186464104494653451651988" + "'", str9, "342024186464104494653451651988");
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("304417796247364099549471429573");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "305564906" + "'", str9, "305564906");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("56181887");
        java.lang.String str11 = rSA1.decrypt("7591156848866311702672535389");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1439237314324872003231554158" + "'", str7, "1439237314324872003231554158");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11266384509566211272638584728" + "'", str9, "11266384509566211272638584728");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "&8\027\ufffd\034\035\ufffd\ufffdZ" + "'", str11, "&8\027\ufffd\034\035\ufffd\ufffdZ");
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
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
        java.lang.String str21 = rSA1.encrypt("282");
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
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1916989310" + "'", str13, "1916989310");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "940008844" + "'", str15, "940008844");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd" + "'", str17, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffdu" + "'", str19, "\ufffdu");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "5721764677" + "'", str21, "5721764677");
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd63^\020j+\r");
        java.lang.String str9 = rSA1.decrypt("551955677861788400383088695165");
        java.lang.String str11 = rSA1.encrypt("79469467076407599501471577556");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\034\025\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdQE");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "64" + "'", str7, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007" + "'", str9, "\007");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "126" + "'", str11, "126");
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\022\ufffd" + "'", str7, "\001\ufffd\ufffd\022\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8341842583" + "'", str9, "8341842583");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "68" + "'", str13, "68");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001~\036\ufffd\ufffd\ufffd\ufffd\000\ufffd" + "'", str17, "\001~\036\ufffd\ufffd\ufffd\ufffd\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("72");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "|" + "'", str3, "|");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "67" + "'", str5, "67");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "55" + "'", str7, "55");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("\025");
        java.lang.String str5 = rSA1.encrypt("\001Y");
        java.lang.String str7 = rSA1.decrypt("598335595765249845160178918537");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4084101" + "'", str3, "4084101");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3929988844" + "'", str5, "3929988844");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\u026c\ufffd>" + "'", str7, "\000\u026c\ufffd>");
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("#");
        java.lang.String str11 = rSA1.decrypt("15686160858");
        java.lang.String str13 = rSA1.encrypt("34089860651578007478246711177");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "18927278495707577216951632077" + "'", str5, "18927278495707577216951632077");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\br\020\017\t\ufffdK\024\ufffd\ufffd\ufffd\ufffd(" + "'", str7, "\br\020\017\t\ufffdK\024\ufffd\ufffd\ufffd\ufffd(");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "64339296875" + "'", str9, "64339296875");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\f\ufffd\ufffd\ufffd\ufffd\013\ufffd" + "'", str11, "\f\ufffd\ufffd\ufffd\ufffd\013\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8352349570487546010799022531" + "'", str13, "8352349570487546010799022531");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("511");
        java.lang.String str13 = rSA1.encrypt("\005\u0452\ufffd#YUDhy\177\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\ufffd\ufffdHU\001\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Aum\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001i" + "'", str7, "\001i");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "141" + "'", str9, "141");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P" + "'", str11, "P");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33" + "'", str13, "33");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002u" + "'", str3, "\002u");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\023\ufffd\036\ufffd>" + "'", str17, "\000\ufffd\023\ufffd\036\ufffd>");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\007\ufffdN\016\006\ufffd" + "'", str19, "\007\ufffdN\016\006\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1613029835904387" + "'", str21, "1613029835904387");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1710126419146437" + "'", str23, "1710126419146437");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\035\ufffd\ufffd\ufffd\ufffd\ufffdg");
        java.lang.String str13 = rSA1.encrypt("718748762015117326651085138525");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "271" + "'", str9, "271");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "287" + "'", str11, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "69" + "'", str13, "69");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("32");
        java.lang.String str9 = rSA1.decrypt("150463785061299561387815225633");
        java.lang.String str11 = rSA1.decrypt("101134400554391946566489983360");
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002:" + "'", str3, "\002:");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003" + "'", str9, "\003");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("703153339289949437747864939069");
        java.lang.String str13 = rSA1.decrypt("663");
        java.lang.String str15 = rSA1.decrypt("11745827484");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\025\ufffd\ufffd" + "'", str7, "\003\025\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffd(/fGb" + "'", str11, "\b\ufffd(/fGb");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006G\024\ufffd\ufffd" + "'", str13, "\006G\024\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\r\ufffd\006\ufffd" + "'", str15, "\004\ufffd\ufffd\r\ufffd\006\ufffd");
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.decrypt("\003\ufffd\ufffd\ufffd\ufffd\u2804t\021\013");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?R\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4365418491458141887385085794" + "'", str7, "4365418491458141887385085794");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.decrypt("626302468");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.decrypt("171");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "50334980593118017863872015613" + "'", str7, "50334980593118017863872015613");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "50334980593118017863872015613" + "'", str9, "50334980593118017863872015613");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\ufffd\020\ufffd" + "'", str11, "\007\ufffd\ufffd\ufffd\020\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("\0018");
        java.lang.String str17 = rSA1.encrypt("91");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd\355\ufffd\ufffd&\024\ufffd" + "'", str9, "\000\ufffd\ufffd\ufffd\355\ufffd\ufffd&\024\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "269482393364927080146005184272" + "'", str15, "269482393364927080146005184272");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "185398217436069914797927285972" + "'", str17, "185398217436069914797927285972");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("\001\006");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "478" + "'", str7, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "B\020&v\"\ufffd\ufffd\ufffd\ufffd" + "'", str13, "B\020&v\"\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "195599309335723" + "'", str17, "195599309335723");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "830" + "'", str7, "830");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "822" + "'", str9, "822");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\025\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffd\025\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1094400206606050" + "'", str17, "1094400206606050");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\ufffdP{" + "'", str21, "\003\ufffdP{");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "12852862464" + "'", str23, "12852862464");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str25, "\001\ufffd\ufffd\ufffd");
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("\037\ufffdbM");
        java.lang.String str9 = rSA1.encrypt("12191618230608297297178555740");
        java.lang.String str11 = rSA1.decrypt("68");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002!" + "'", str3, "\002!");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "706" + "'", str7, "706");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "301" + "'", str9, "301");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "D" + "'", str11, "D");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1611067079503803");
        java.lang.String str13 = rSA1.decrypt("18980981751395059997709561778");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "142" + "'", str5, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "393" + "'", str7, "393");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "270" + "'", str11, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3" + "'", str13, "3");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
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
        java.lang.String str21 = rSA1.encrypt("361558751188445895040012700015");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("-L|\r\ufffd\ufffd\ufffdI\332");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"L\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "404" + "'", str9, "404");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "387" + "'", str11, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "52" + "'", str13, "52");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "34" + "'", str15, "34");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\037" + "'", str17, "\001\037");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "170" + "'", str21, "170");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("465270144019721");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("8");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.decrypt("234156854866251850364583870586");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002M" + "'", str3, "\002M");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "684" + "'", str7, "684");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002" + "'", str11, "\002");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "405" + "'", str13, "405");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.encrypt("188");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\u0722\ufffd=\024\016" + "'", str7, "\ufffd\ufffd\ufffd\ufffd\u0722\ufffd=\024\016");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "413238110763407037284465708000" + "'", str11, "413238110763407037284465708000");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("|");
        java.lang.String str11 = rSA1.decrypt("317201802686979902757");
        java.lang.String str13 = rSA1.decrypt("80");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "470" + "'", str5, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "270" + "'", str7, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "193" + "'", str9, "193");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "D" + "'", str11, "D");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("478");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u039d");
        java.lang.String str15 = rSA1.encrypt("720881662483885555150199331319");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\u0653\ufffd\ufffd\ufffd\020XU" + "'", str7, "\ufffd\u0653\ufffd\ufffd\ufffd\020XU");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffde2t" + "'", str9, "\002\ufffd\ufffd\ufffd\ufffde2t");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "347" + "'", str13, "347");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "266" + "'", str15, "266");
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\u0441\ufffdS[R" + "'", str3, "\002\u0441\ufffdS[R");
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
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
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\037\ufffd\ufffd\ufffd\ufffd\ufffd8" + "'", str13, "\037\ufffd\ufffd\ufffd\ufffd\ufffd8");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\b\u0436\ufffd\031\024" + "'", str17, "\b\u0436\ufffd\031\024");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "91489028659047854301597778226" + "'", str21, "91489028659047854301597778226");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\026\ufffd" + "'", str23, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\026\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "217363635846663823924878717228" + "'", str25, "217363635846663823924878717228");
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.decrypt("279");
        java.lang.String str11 = rSA1.decrypt("177");
        java.lang.String str13 = rSA1.encrypt("267");
        java.lang.String str15 = rSA1.encrypt("35");
        java.lang.String str17 = rSA1.encrypt("x!\027\ufffd\ufffd\ufffd\ufffd\013");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\002\ufffd\ufffd\ufffd\r\ufffd\u45e0\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "252" + "'", str7, "252");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8" + "'", str13, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "208" + "'", str15, "208");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "177" + "'", str17, "177");
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("393");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\003\ufffd\017\016\ufffd\ufffd\03183" + "'", str13, "\ufffd\003\ufffd\017\016\ufffd\ufffd\03183");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "137642157118530" + "'", str17, "137642157118530");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("232501808598646088728588706843");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "56181887" + "'", str7, "56181887");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "~" + "'", str11, "~");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("338");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd>\016\ufffd\r\ufffd\024\ufffd" + "'", str7, "\ufffd\ufffd>\016\ufffd\r\ufffd\024\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "o-\021\ufffd\004\ufffd\ufffd2" + "'", str9, "o-\021\ufffd\004\ufffd\ufffd2");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("362");
        java.math.BigInteger bigInteger4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = rSA1.encrypt(bigInteger4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\024" + "'", str3, "\024");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.encrypt("\001\ufffd\ufffd");
        java.lang.String str5 = rSA1.decrypt("598936615230950507052406172861");
        java.lang.String str7 = rSA1.encrypt("30315461196525470678390548020");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "696167516" + "'", str3, "696167516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffdk" + "'", str5, "\ufffd\ufffdk");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3516415954" + "'", str7, "3516415954");
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.decrypt("387");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\002\u028e\r\ufffd\ufffd\f\ufffd\ufffd");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Y" + "'", str7, "Y");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "132" + "'", str9, "132");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "195" + "'", str11, "195");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
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
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str25 = rSA1.decrypt("3799685695");
        java.lang.String str27 = rSA1.encrypt("22188041");
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.encrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "134" + "'", str7, "134");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\000\ufffd\n\ufffd\022" + "'", str13, "\ufffd\ufffd\000\ufffd\n\ufffd\022");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1026732499013808" + "'", str17, "1026732499013808");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "374208727526966" + "'", str19, "374208727526966");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "574695607386901" + "'", str21, "574695607386901");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\ufffd" + "'", str25, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "213" + "'", str27, "213");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\b\ufffd\ufffd\037\ufffd\ufffdw");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??[\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
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
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\025\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\025\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "17984728" + "'", str17, "17984728");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        java.lang.String str9 = rSA1.encrypt("4839922246");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "238265549444406987119484245834" + "'", str5, "238265549444406987119484245834");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8241264822143" + "'", str7, "8241264822143");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "301970389325980451001741482342" + "'", str9, "301970389325980451001741482342");
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.decrypt("576");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40555426681618921713383212376" + "'", str5, "40555426681618921713383212376");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\\\ufffd\ufffd\ufffd\u0217\ufffd\ufffd" + "'", str7, "\ufffd\ufffd\\\ufffd\ufffd\ufffd\u0217\ufffd\ufffd");
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.decrypt("188289157854256346200468674953");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\u03cd\ufffd" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\u03cd\ufffd");
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("142");
        java.lang.String str13 = rSA1.encrypt("\001 ");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "616" + "'", str7, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001q" + "'", str11, "\001q");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "417" + "'", str13, "417");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.decrypt("409247107494479");
        java.lang.String str13 = rSA1.decrypt("33546352872558360619");
        rSA1.generateKeys((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\006\ufffd\ufffd\ufffd\030\ufffd\037\ufffd\ufffd\ufffd<");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffdH[lNkr" + "'", str11, "\000\ufffd\ufffd\ufffdH[lNkr");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd\0246\f\ufffd\ufffd\027Z" + "'", str13, "\006\ufffd\ufffd\0246\f\ufffd\ufffd\027Z");
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("#");
        java.lang.String str11 = rSA1.decrypt("1");
        java.lang.String str13 = rSA1.encrypt("1249781321");
        java.lang.String str15 = rSA1.decrypt("24728158503917487987839420576");
        java.lang.String str17 = rSA1.encrypt("\b+X\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdy");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "834230604760197563974358887240" + "'", str5, "834230604760197563974358887240");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffdjn\f\000\ufffdMz" + "'", str7, "\001\ufffd\ufffd\ufffdjn\f\000\ufffdMz");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "64339296875" + "'", str9, "64339296875");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "867707232022423978954101232634" + "'", str13, "867707232022423978954101232634");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd9\026\ufffd\ufffd\ufffd" + "'", str15, "\003\ufffd\ufffd\ufffd9\026\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "18029030157291667836739990000" + "'", str17, "18029030157291667836739990000");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("478");
        java.lang.String str13 = rSA1.encrypt("\t\ufffdY\005l");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "875" + "'", str5, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "680" + "'", str7, "680");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "367" + "'", str11, "367");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "531" + "'", str13, "531");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("461");
        java.lang.String str11 = rSA1.encrypt("232");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\ufffd\u0649");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001f" + "'", str3, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1686733218" + "'", str9, "1686733218");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "8404378643" + "'", str11, "8404378643");
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("243447641670302309295496962030");
        java.lang.String str15 = rSA1.decrypt("96");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$R\"\ufffd\ufffd\007N92" + "'", str7, "$R\"\ufffd\ufffd\007N92");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25091444012581797990449945539" + "'", str9, "25091444012581797990449945539");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "52157117258074905032537425485" + "'", str11, "52157117258074905032537425485");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "18679670964302707310288697618" + "'", str13, "18679670964302707310288697618");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\033\ufffd\n;U+\031\ufffd\ufffd" + "'", str15, "\033\ufffd\n;U+\031\ufffd\ufffd");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        java.lang.String str9 = rSA1.decrypt("143827611740296741825726282072");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001f" + "'", str3, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001|+])" + "'", str7, "\001|+])");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\025\ufffdVy" + "'", str9, "\002\025\ufffdVy");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\u0475\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\177" + "'", str3, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd4\005" + "'", str7, "\000\ufffd\ufffd4\005");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1436286771" + "'", str9, "1436286771");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "351" + "'", str7, "351");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "283" + "'", str9, "283");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("12856024970639395620261580662");
        java.lang.String str7 = rSA1.decrypt("5411392559");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "33562394575160520077" + "'", str3, "33562394575160520077");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "29086094476319649050281027336" + "'", str5, "29086094476319649050281027336");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("327");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\000\ufffd\ufffd\ufffd\u0370\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "419397653819803752078293017211" + "'", str5, "419397653819803752078293017211");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd*\"T\037\ufffd\t\ufffd0" + "'", str7, "\ufffd\ufffd*\"T\037\ufffd\t\ufffd0");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\0019" + "'", str11, "\0019");
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("465270144019721");
        java.lang.String str9 = rSA1.decrypt("325563476535440691175221444074");
        java.lang.String str11 = rSA1.encrypt("143");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "179" + "'", str7, "179");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001+" + "'", str9, "\001+");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "169" + "'", str11, "169");
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd\u0204");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "27" + "'", str3, "27");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "470" + "'", str5, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "D" + "'", str7, "D");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "444" + "'", str11, "444");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("24913536938563019036853654452");
        java.lang.String str5 = rSA1.encrypt("654236752367953961630478066413");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4722580484" + "'", str3, "4722580484");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3000185803" + "'", str5, "3000185803");
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.encrypt("377");
        java.lang.String str9 = rSA1.encrypt("537903484179846573266404376905");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\b\ufffd\021\ufffd\021\ufffd.\035\ufffd\ufffdx");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???U\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "81" + "'", str5, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "391" + "'", str7, "391");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "87" + "'", str9, "87");
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
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
        java.lang.String str25 = rSA1.encrypt("\013\ufffd\u02ef\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = rSA1.decrypt(":\032\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \":?U?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffdQ\001\ufffd" + "'", str13, "\ufffd\ufffdQ\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "641758583418738" + "'", str17, "641758583418738");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "53854673381823" + "'", str19, "53854673381823");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1832986774896991" + "'", str21, "1832986774896991");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\006\ufffd\ufffd\ufffd|" + "'", str23, "\006\ufffd\ufffd\ufffd|");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "783516244296867" + "'", str25, "783516244296867");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("2155055185841074");
        java.lang.String str11 = rSA1.encrypt("492907557506561327747899369938");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "185" + "'", str3, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000" + "'", str7, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "208" + "'", str9, "208");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "224" + "'", str11, "224");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("288");
        java.lang.String str15 = rSA1.decrypt("377");
        java.lang.String str17 = rSA1.encrypt("1102300624");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\033x=n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?x=n\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "835418381908073493814823616677" + "'", str11, "835418381908073493814823616677");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35650010007221349888" + "'", str13, "35650010007221349888");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\u014e\035\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\b\u014e\035\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "718428686576001671036559576379" + "'", str17, "718428686576001671036559576379");
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.decrypt("166");
        java.lang.String str13 = rSA1.encrypt("517");
        java.lang.String str15 = rSA1.encrypt("1349117468602420864739382143");
        java.lang.String str17 = rSA1.encrypt("\002\ufffd\u0548\ufffd\ufffd\u077e\ufffd\ufffde");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "248" + "'", str13, "248");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "332" + "'", str15, "332");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "244" + "'", str17, "244");
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("\0245|\r\ufffd\004\ufffd\r\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "304446204145149788827413606422" + "'", str7, "304446204145149788827413606422");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("2155055185841074");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002L" + "'", str5, "\002L");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007" + "'", str7, "\007");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2806475544" + "'", str11, "2806475544");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.decrypt("166");
        java.lang.String str13 = rSA1.encrypt("517");
        java.lang.String str15 = rSA1.decrypt("720881662483885555150199331319");
        java.lang.String str17 = rSA1.encrypt("2977826838347180772119751944");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "96" + "'", str13, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\034" + "'", str15, "\001\034");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "444" + "'", str17, "444");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("szE\037");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "99" + "'", str3, "99");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "36378368976856590847359535127" + "'", str7, "36378368976856590847359535127");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6270225601" + "'", str11, "6270225601");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("168");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd\f\r\ufffd\021x");
        java.lang.String str17 = rSA1.decrypt("1374125732820434");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffdIS" + "'", str7, "\002\ufffdIS");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3245683140" + "'", str9, "3245683140");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "137256468" + "'", str11, "137256468");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "17068801601413564534789862485" + "'", str15, "17068801601413564534789862485");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("1571893042486033");
        java.lang.String str9 = rSA1.encrypt("\003\021\ufffd\u076d\ufffd\u06fd\ufffdX\f\020");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("1911054678189828");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "96" + "'", str5, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001g" + "'", str7, "\001g");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "224" + "'", str9, "224");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\r" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffd\r");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("6");
        java.lang.String str9 = rSA1.decrypt("108");
        java.lang.String str11 = rSA1.decrypt("437");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.decrypt("34089860651578007478246711177");
        java.lang.String str9 = rSA1.encrypt("674338054");
        java.lang.String str11 = rSA1.encrypt("567824154010472842391682528857");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "95" + "'", str3, "95");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "194" + "'", str5, "194");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "208" + "'", str9, "208");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "141" + "'", str11, "141");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\004\031\ufffd\ufffd\ufffda");
        java.lang.String str13 = rSA1.encrypt("852");
        java.lang.String str15 = rSA1.decrypt("9478551849");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd88" + "'", str7, "\001\ufffd88");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5211420866" + "'", str11, "5211420866");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "61232347" + "'", str13, "61232347");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\000\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.encrypt("\005\ufffd\ufffd\u0641\ufffd\037I\\");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "351" + "'", str5, "351");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "322" + "'", str7, "322");
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("518");
        java.lang.String str11 = rSA1.decrypt("208642166923338001575549632629");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "608978023" + "'", str9, "608978023");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd" + "'", str11, "\ufffd\ufffd");
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("582");
        java.lang.String str13 = rSA1.encrypt("110");
        java.lang.String str15 = rSA1.encrypt("\003\ufffd\ufffd\024\ufffd\ufffdWA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str7, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "495407753" + "'", str9, "495407753");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4195201025" + "'", str11, "4195201025");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1070964959" + "'", str13, "1070964959");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4458619195" + "'", str15, "4458619195");
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        rSA1.generateKeys((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\001\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?&A??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "168" + "'", str9, "168");
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("302478007679515165391351820133");
        java.lang.String str15 = rSA1.encrypt("21262565530067871612812451046");
        java.lang.String str17 = rSA1.decrypt("490");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002L" + "'", str5, "\002L");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007" + "'", str7, "\007");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "246954347318326904899276565994" + "'", str11, "246954347318326904899276565994");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "75910690401127247614119932971" + "'", str13, "75910690401127247614119932971");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "139586180426920438014339082013" + "'", str15, "139586180426920438014339082013");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\036\ufffd\ufffd\u6fee@NP" + "'", str17, "\005\ufffd\036\ufffd\ufffd\u6fee@NP");
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("\002R");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\032\ufffd\u0235\ufffdXbLo~" + "'", str9, "\007\032\ufffd\u0235\ufffdXbLo~");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "73948986280224" + "'", str15, "73948986280224");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("362");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001," + "'", str3, "\001,");
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.decrypt("394");
        java.lang.String str7 = rSA1.decrypt("946669947");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "317" + "'", str3, "317");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Y" + "'", str7, "Y");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("1571893042486033");
        rSA1.generateKeys((int) ' ');
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "142" + "'", str5, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.decrypt("461");
        java.lang.String str17 = rSA1.decrypt("786759835");
        rSA1.generateKeys((int) '4');
        java.lang.String str21 = rSA1.encrypt("987265067680125495617595687625");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001G" + "'", str5, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "509" + "'", str7, "509");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8" + "'", str9, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003A" + "'", str15, "\003A");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1316200305461871" + "'", str21, "1316200305461871");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\u0475\ufffd");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "z" + "'", str3, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\016\ufffd" + "'", str7, "\000\ufffd\016\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4617776042" + "'", str9, "4617776042");
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str11 = rSA1.encrypt("\002\ufffd>");
        java.lang.String str13 = rSA1.encrypt("163");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\032\ufffd\ufffd\ufffd';" + "'", str7, "\ufffd\ufffd\032\ufffd\ufffd\ufffd';");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1559255819492954518777495088" + "'", str9, "1559255819492954518777495088");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "15469935523691364022738375270" + "'", str11, "15469935523691364022738375270");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "20143628426497808671726917505" + "'", str13, "20143628426497808671726917505");
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "830" + "'", str7, "830");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "822" + "'", str9, "822");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "72" + "'", str19, "72");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("56181887");
        java.lang.String str11 = rSA1.decrypt("7591156848866311702672535389");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "237043868291797544553217100" + "'", str7, "237043868291797544553217100");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "17064198552944979051680163195" + "'", str9, "17064198552944979051680163195");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd)\033\ufffd`" + "'", str11, "\000\ufffd\ufffd\ufffd\ufffd\ufffd)\033\ufffd`");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        java.lang.String str15 = rSA1.encrypt("875");
        java.lang.String str17 = rSA1.decrypt("392170649013389");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32" + "'", str7, "32");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "18" + "'", str9, "18");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffdhc\034X\025\ufffd\ufffd7" + "'", str13, "\ufffdhc\034X\025\ufffd\ufffd7");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "50004784369000759949" + "'", str15, "50004784369000759949");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "E\025\006\ufffd\u058a\ufffd\016\ufffd\u058a" + "'", str17, "E\025\006\ufffd\u058a\ufffd\016\ufffd\u058a");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("56181887");
        java.lang.String str11 = rSA1.decrypt("746226611113599520813292889194");
        java.lang.String str13 = rSA1.decrypt("2783614369450889");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35925952036377761163539433886" + "'", str7, "35925952036377761163539433886");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "16629586980736756825980320288" + "'", str9, "16629586980736756825980320288");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd%\t\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\ufffd%\t\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd_\t\n" + "'", str13, "\ufffd\ufffd\ufffd\ufffd_\t\n");
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        java.lang.String str9 = rSA1.encrypt("{");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "105970442895131973373037281360" + "'", str5, "105970442895131973373037281360");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\017\ufffd\ufffd\ufffd\036\034\024_\177\b" + "'", str7, "\003\017\ufffd\ufffd\ufffd\036\034\024_\177\b");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "425927596977747" + "'", str9, "425927596977747");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("946669947");
        java.lang.String str7 = rSA1.encrypt("31880228988277126542610772385");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "260" + "'", str7, "260");
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("{");
        java.lang.String str13 = rSA1.decrypt("0");
        java.lang.String str15 = rSA1.decrypt("41");
        java.lang.String str17 = rSA1.encrypt("1900954511");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "167" + "'", str7, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "371" + "'", str11, "371");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000" + "'", str13, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003w" + "'", str15, "\003w");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "765" + "'", str17, "765");
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1208902895495334527");
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.encrypt("305746787039348434682381968250");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p" + "'", str3, "p");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "65" + "'", str5, "65");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\b" + "'", str7, "\001\b");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "552" + "'", str9, "552");
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "182" + "'", str7, "182");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.decrypt("171");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\000\304\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\001\ufffd\ufffd\000\304\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("205");
        java.lang.String str11 = rSA1.decrypt("166");
        java.lang.String str13 = rSA1.encrypt("313579402379602599084496040893");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\ufffd\u0787\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\005\ufffd\u0787\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35583402576551630221" + "'", str9, "35583402576551630221");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "658162063618640354816937653641" + "'", str13, "658162063618640354816937653641");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str11 = rSA1.encrypt("\002\ufffd>");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffdB7tx\007" + "'", str7, "\ufffd\ufffd\ufffd\ufffd\ufffdB7tx\007");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33403202635569688250344111987" + "'", str9, "33403202635569688250344111987");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2437008143521211927633910253" + "'", str11, "2437008143521211927633910253");
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("703153339289949437747864939069");
        java.lang.String str13 = rSA1.decrypt("663");
        rSA1.generateKeys((int) '#');
        java.lang.String str17 = rSA1.encrypt("1643460055");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffdX^/" + "'", str7, "\000\ufffdX^/");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004M\024\ufffd\ufffd\ufffd" + "'", str11, "\004M\024\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002E\034\ufffd\ufffd`4" + "'", str13, "\002E\034\ufffd\ufffd`4");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10931502542" + "'", str17, "10931502542");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("11716232800583690748559256041");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt(")");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \")\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "118183086150887512847945513016" + "'", str5, "118183086150887512847945513016");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "532381766409162798426802790224" + "'", str7, "532381766409162798426802790224");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\ufffd\ufffd\020\025\003\ufffd/" + "'", str9, "\007\ufffd\ufffd\020\025\003\ufffd/");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\034S\t\ufffd\ufffd\ufffd\ufffd\016" + "'", str11, "\004\034S\t\ufffd\ufffd\ufffd\ufffd\016");
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("3077056399");
        java.lang.String str15 = rSA1.decrypt("715053248569397442655422819632");
        java.lang.String str17 = rSA1.encrypt("680");
        java.lang.String str19 = rSA1.encrypt("572318888080881357035132732482");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "473" + "'", str5, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "U8\001d" + "'", str9, "U8\001d");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1727962449" + "'", str11, "1727962449");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd)" + "'", str13, "\ufffd)");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd" + "'", str15, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "738109236" + "'", str17, "738109236");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "749343014" + "'", str19, "749343014");
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("\0245|\r\ufffd\004\ufffd\r\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "486438925015532673438926691129" + "'", str7, "486438925015532673438926691129");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("2155055185841074");
        java.lang.String str11 = rSA1.encrypt("492907557506561327747899369938");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002L" + "'", str5, "\002L");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\032" + "'", str7, "\032");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "248" + "'", str9, "248");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "256" + "'", str11, "256");
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
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
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\u0267im" + "'", str9, "\001\u0267im");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "135005697" + "'", str11, "135005697");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4828165285" + "'", str13, "4828165285");
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.decrypt("314");
        java.lang.String str15 = rSA1.decrypt("2533194306");
        java.lang.String str17 = rSA1.decrypt("25812355359064");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "314" + "'", str9, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001j" + "'", str15, "\001j");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001M" + "'", str17, "\001M");
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("489");
        java.lang.String str13 = rSA1.encrypt("\006$\f\ufffd\ufffd\ufffd\ufffd\025xP1");
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\r\025\ufffd\ufffd\ufffd\037\ufffd\ufffd\000\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\016\ufffd" + "'", str11, "\003\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\016\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "308950236509498726719831200141" + "'", str13, "308950236509498726719831200141");
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
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
        java.lang.String str25 = rSA1.decrypt("421");
        java.lang.String str27 = rSA1.encrypt("2425696798257060");
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.encrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "478" + "'", str7, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\037\ufffd\ufffdj\b\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\037\ufffd\ufffdj\b\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\007\ufffd\ufffd$\035" + "'", str17, "\002\007\ufffd\ufffd$\035");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "765651697797999" + "'", str19, "765651697797999");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "770889049770777" + "'", str21, "770889049770777");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "896566080072578" + "'", str23, "896566080072578");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\002\ufffd\ufffd\ufffd\033\ufffd" + "'", str25, "\002\ufffd\ufffd\ufffd\033\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1771339105038753" + "'", str27, "1771339105038753");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
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
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "830" + "'", str7, "830");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "822" + "'", str9, "822");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd&" + "'", str13, "\ufffd&");
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        java.lang.String str9 = rSA1.decrypt("325");
        java.lang.String str11 = rSA1.decrypt("460674236520472073354995943861");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002." + "'", str3, "\002.");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "769" + "'", str5, "769");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "765" + "'", str7, "765");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002=" + "'", str9, "\002=");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd" + "'", str11, "\002\ufffd");
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str7 = rSA1.decrypt("560");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\017" + "'", str7, "\001\017");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\005\002\ufffd\ufffdid");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "616" + "'", str7, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25" + "'", str11, "25");
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\023" + "'", str5, "\001\023");
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("495");
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\u2804t\021\013");
        java.lang.String str15 = rSA1.encrypt("703");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "266" + "'", str5, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000" + "'", str7, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "g" + "'", str9, "g");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "134" + "'", str11, "134");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "21" + "'", str13, "21");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "239" + "'", str15, "239");
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\002u");
        java.lang.String str9 = rSA1.decrypt("371");
        java.lang.String str11 = rSA1.decrypt("784159943467916");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "209" + "'", str3, "209");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "51" + "'", str7, "51");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Z" + "'", str9, "Z");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("208642166923338001575549632629");
        java.lang.String str11 = rSA1.encrypt("460");
        java.lang.String str13 = rSA1.decrypt("663612053");
        java.lang.String str15 = rSA1.encrypt("\001\ufffd\ufffd\ufffdM");
        java.lang.String str17 = rSA1.encrypt("800428690524956154324372637061");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "461" + "'", str7, "461");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11" + "'", str9, "11");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "460" + "'", str11, "460");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\177" + "'", str13, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "428" + "'", str15, "428");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "93" + "'", str17, "93");
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.encrypt("490");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("1757850692");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\000\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??X??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2238526193" + "'", str3, "2238526193");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001x\030\ufffd\ufffd\ufffdwxP\"\ufffd\ufffd" + "'", str7, "\001x\030\ufffd\ufffd\ufffdwxP\"\ufffd\ufffd");
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\037\ufffd\027\ufffd\ufffdq5");
        java.lang.String str13 = rSA1.decrypt("2635132195937723");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "576" + "'", str5, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\005" + "'", str9, "\000\ufffd\ufffd\005");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "316967575" + "'", str11, "316967575");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd");
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
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
        java.lang.String str25 = rSA1.decrypt("439");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = rSA1.decrypt("\r\ufffd\006\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?,!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffdg\f\ufffd\r\u0758\ufffd" + "'", str13, "\ufffdg\f\ufffd\r\u0758\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1737035599113906" + "'", str17, "1737035599113906");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "602543446486915" + "'", str19, "602543446486915");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffd\035\ufffd\ufffd\ufffd" + "'", str21, "\002\ufffd\035\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + ">" + "'", str25, ">");
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.encrypt("377");
        java.lang.String str9 = rSA1.decrypt("673");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "351" + "'", str5, "351");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "325" + "'", str7, "325");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6" + "'", str9, "6");
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("306842132257782653009905995376");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "391184793637077329641676976547" + "'", str5, "391184793637077329641676976547");
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("1998947500173");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("2312924388126772");
        java.lang.String str7 = rSA1.encrypt("\005\u04ac\ufffd\u04df\ufffd\ufffd\u067c<5");
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "138467831015608965225680766644" + "'", str5, "138467831015608965225680766644");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "645346260560420679765859286374" + "'", str7, "645346260560420679765859286374");
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("61273672939825812829984836584");
        java.lang.String str13 = rSA1.encrypt("32");
        java.lang.String str15 = rSA1.decrypt("1090996334");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\177" + "'", str3, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffdfW\033" + "'", str7, "\000\ufffdfW\033");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3122301435" + "'", str9, "3122301435");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd" + "'", str11, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "692792964" + "'", str13, "692792964");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd" + "'", str15, "\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd63^\020j+\r");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "136" + "'", str7, "136");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "33562394575160520077" + "'", str3, "33562394575160520077");
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) '#');
        java.lang.String str17 = rSA1.decrypt("801273974564061309095441664310");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O" + "'", str5, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "416" + "'", str7, "416");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "287" + "'", str9, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "=O\007\ufffd" + "'", str17, "=O\007\ufffd");
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        java.lang.String str9 = rSA1.encrypt("\ufffd\u011d\ufffd\ufffd\ufffd`\002S+f");
        rSA1.generateKeys((int) ' ');
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "38" + "'", str9, "38");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("\002L");
        java.lang.String str11 = rSA1.decrypt("2953018038");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "236" + "'", str3, "236");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "642703149" + "'", str9, "642703149");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffdHm" + "'", str11, "\ufffdHm");
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd63^\020j+\r");
        java.lang.String str9 = rSA1.encrypt("2951232610");
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "185" + "'", str3, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "200" + "'", str7, "200");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "69" + "'", str9, "69");
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
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
            java.lang.String str17 = rSA1.decrypt("\000\ufffdvb");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??vb\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "354489695946570574369128815125" + "'", str5, "354489695946570574369128815125");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006\ufffd\ufffd\027\ufffd\ufffd\n\ufffd\ufffd\ufffd\000\t" + "'", str7, "\006\ufffd\ufffd\027\ufffd\ufffd\n\ufffd\ufffd\ufffd\000\t");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "658611620398515958175317816678" + "'", str9, "658611620398515958175317816678");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "306808598994038808921016506803" + "'", str11, "306808598994038808921016506803");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6771610" + "'", str15, "6771610");
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.decrypt("1008102450");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("w");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"w\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd" + "'", str3, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n\ufffd\004\ufffdv-" + "'", str7, "\n\ufffd\004\ufffdv-");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("72");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\037");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??6\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "283" + "'", str5, "283");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + ")" + "'", str11, ")");
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001G" + "'", str5, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "509" + "'", str7, "509");
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
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
        java.lang.String str23 = rSA1.decrypt("19");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "274" + "'", str15, "274");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "114" + "'", str19, "114");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd" + "'", str21, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001m" + "'", str23, "\001m");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("\002\u028e\r\ufffd\ufffd\f\ufffd\ufffd");
        java.lang.String str13 = rSA1.decrypt("211");
        java.lang.String str15 = rSA1.encrypt("\004\u05b9\ufffd\001Yt\035\ufffd\u04968");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "606476077027751874265716347718" + "'", str11, "606476077027751874265716347718");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001~LM\017@\007\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\001~LM\017@\007\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "112299535187222090446263930349" + "'", str15, "112299535187222090446263930349");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("208642166923338001575549632629");
        java.lang.String str11 = rSA1.encrypt("460");
        java.lang.String str13 = rSA1.encrypt("3638311412");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "110" + "'", str7, "110");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "260" + "'", str9, "260");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "154" + "'", str11, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "15" + "'", str13, "15");
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.encrypt("\001\ufffd\ufffd");
        java.lang.String str5 = rSA1.decrypt("598936615230950507052406172861");
        java.lang.String str7 = rSA1.encrypt("8286593887");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "277477950" + "'", str3, "277477950");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd2" + "'", str5, "\ufffd2");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "50332572" + "'", str7, "50332572");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("9810541998");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u072b\ufffd\ufffd\u0256\034\003\024");
        java.lang.String str9 = rSA1.decrypt("5229405238");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "92" + "'", str5, "92");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "832" + "'", str7, "832");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd" + "'", str9, "\002\ufffd");
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.encrypt("\001+5{1");
        java.lang.String str15 = rSA1.decrypt("410");
        java.lang.String str17 = rSA1.encrypt("\002B");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "509" + "'", str9, "509");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "37" + "'", str13, "37");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "f" + "'", str15, "f");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "335" + "'", str17, "335");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
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
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("582");
        java.lang.String str13 = rSA1.decrypt("52521875");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5" + "'", str3, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffdeh" + "'", str7, "\000\ufffd\ufffdeh");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10670641186" + "'", str9, "10670641186");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1501861589" + "'", str11, "1501861589");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str13, "\001\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.encrypt("188");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd\036\ufffd\ufffd\ufffd" + "'", str7, "\ufffd\ufffd\ufffd\036\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "33562488218783100416" + "'", str11, "33562488218783100416");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str7 = rSA1.decrypt("1");
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("1998947500173");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u0370\ufffd");
        java.lang.String str11 = rSA1.decrypt("15028238390418345727767527777");
        java.lang.String str13 = rSA1.encrypt("X\034R\004\ufffd\ufffd\000\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("317579693760000000000");
        java.lang.String str17 = rSA1.encrypt("2156828580");
        java.lang.String str19 = rSA1.encrypt("427585902676504979978358986537");
        java.lang.String str21 = rSA1.encrypt("603132383584832147934343582090");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "U" + "'", str7, "U");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "239" + "'", str9, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\177" + "'", str11, "\177");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "302" + "'", str13, "302");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "94" + "'", str17, "94");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "247" + "'", str19, "247");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "109" + "'", str21, "109");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("110");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "99" + "'", str3, "99");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\035\ufffd\ufffd\ufffd)\004\037\ufffd" + "'", str7, "\035\ufffd\ufffd\ufffd)\004\037\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("516");
        java.lang.String str5 = rSA1.decrypt("3541590856");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("425");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd\033\ufffd\ufffd\ufffd\ufffd\037$" + "'", str3, "\000\ufffd\033\ufffd\ufffd\ufffd\ufffd\037$");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ua1f5rC\003\007\ufffd\ufffd\ufffd\ufffd" + "'", str5, "\001\ua1f5rC\003\007\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001$" + "'", str11, "\001$");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("\002\ufffd");
        java.lang.String str17 = rSA1.encrypt("Q");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\b\ufffd\ufffd\ufffd\024\ufffdISt");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?f?q\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32" + "'", str7, "32");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "18" + "'", str9, "18");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "677" + "'", str15, "677");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "379" + "'", str17, "379");
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("1998947500173");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u0370\ufffd");
        java.lang.String str11 = rSA1.decrypt("15028238390418345727767527777");
        java.lang.String str13 = rSA1.encrypt("X\034R\004\ufffd\ufffd\000\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("317579693760000000000");
        java.lang.String str17 = rSA1.encrypt("2156828580");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "l" + "'", str3, "l");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003$" + "'", str7, "\003$");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380" + "'", str9, "380");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\021" + "'", str11, "\001\021");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "571" + "'", str13, "571");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "530" + "'", str15, "530");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "229" + "'", str17, "229");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\ufffd\u0795\ufffd$");
        java.lang.String str13 = rSA1.encrypt("292429178019428864799183198942");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001n" + "'", str5, "\001n");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "496" + "'", str9, "496");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "42" + "'", str11, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "293" + "'", str13, "293");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\002u");
        java.lang.String str9 = rSA1.encrypt("453285907300587");
        java.lang.String str11 = rSA1.decrypt("7560459277510187155396998311");
        java.lang.String str13 = rSA1.decrypt("5637094912");
        java.lang.String str15 = rSA1.decrypt("192160172904044033214293183750");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "549" + "'", str3, "549");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "489" + "'", str7, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "555" + "'", str9, "555");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\006" + "'", str11, "\002\006");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "o" + "'", str15, "o");
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("703153339289949437747864939069");
        java.lang.String str13 = rSA1.encrypt("167");
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.decrypt("5616649151");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\ufffd8\013");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"}?8?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001G" + "'", str3, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\uc665\ufffd" + "'", str7, "\000\uc665\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffdb" + "'", str11, "\004\ufffd\ufffdb");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2457243358678218" + "'", str13, "2457243358678218");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\ufffdP" + "'", str17, "\000\ufffd\ufffd\ufffdP");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.decrypt("166");
        java.lang.String str13 = rSA1.encrypt("517");
        java.lang.String str15 = rSA1.encrypt("1349117468602420864739382143");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "96" + "'", str13, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "161" + "'", str15, "161");
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.decrypt("72");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Q" + "'", str7, "Q");
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("558");
        java.lang.String str11 = rSA1.decrypt("185787078128474564534821080385");
        java.lang.String str13 = rSA1.encrypt("1328856617");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "470" + "'", str5, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1317382056" + "'", str9, "1317382056");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\033\u014a" + "'", str11, "\000\ufffd\033\u014a");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "755939437" + "'", str13, "755939437");
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) 'a');
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
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("582");
        java.lang.String str9 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd| ");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "287" + "'", str3, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\f\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\f\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "15400202555906530357783970018" + "'", str9, "15400202555906530357783970018");
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("478");
        java.lang.String str15 = rSA1.decrypt("1028793282341587");
        java.lang.String str17 = rSA1.encrypt("592507074497355564223410845271");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3101759668" + "'", str13, "3101759668");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffdu" + "'", str15, "\001\ufffd\ufffdu");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "676808565" + "'", str17, "676808565");
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.decrypt("616");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "z" + "'", str5, "z");
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.encrypt("553");
        rSA1.generateKeys(10);
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "149" + "'", str11, "149");
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
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
        java.lang.String str23 = rSA1.encrypt("147");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("\001\ufffd\035\177;\006\ufffd\t\ufffd\ufffd\035\002");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "478" + "'", str7, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\u037c\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\u037c\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "383172158696724" + "'", str17, "383172158696724");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "179457090878550" + "'", str19, "179457090878550");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "385" + "'", str23, "385");
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("66");
        java.lang.String str19 = rSA1.decrypt("11745827484");
        java.lang.String str21 = rSA1.encrypt("7560459277510187155396998311");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\002+");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "42" + "'", str7, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "205" + "'", str9, "205");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffdg\\\ufffd\030\ufffd\ufffd\177" + "'", str13, "\ufffdg\\\ufffd\030\ufffd\ufffd\177");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\023\ufffd\037\003_" + "'", str17, "\002\ufffd\023\ufffd\037\003_");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004\016\ufffd\ufffd~tl" + "'", str19, "\004\016\ufffd\ufffd~tl");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "269100531217522" + "'", str21, "269100531217522");
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("693");
        java.lang.String str7 = rSA1.encrypt("\001.");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7838676199054330776226461471" + "'", str3, "7838676199054330776226461471");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "47372229097776852229934002930" + "'", str5, "47372229097776852229934002930");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2512087224032" + "'", str7, "2512087224032");
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.encrypt("3141644858136");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "*\023m\n\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "*\023m\n\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4434093906028513413267473610" + "'", str9, "4434093906028513413267473610");
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        java.lang.String str9 = rSA1.encrypt("4839922246");
        java.lang.String str11 = rSA1.encrypt("\177\ufffd\ufffd5");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "98613268987107211959407644212" + "'", str9, "98613268987107211959407644212");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "485109398513244053461961455065" + "'", str11, "485109398513244053461961455065");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\005\ufffd\ufffd\n\ufffd\ufffd*");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "66" + "'", str3, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23262117341549526332862957887" + "'", str7, "23262117341549526332862957887");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "578069426827146991468228629765" + "'", str11, "578069426827146991468228629765");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        java.lang.String str13 = rSA1.decrypt("32");
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "185" + "'", str3, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "I" + "'", str7, "I");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017\ufffd\ufffd" + "'", str11, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002" + "'", str13, "\002");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("946669947");
        java.lang.String str7 = rSA1.encrypt("414601987065913579031306059745");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("1739946898496621");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\003:" + "'", str5, "\003:");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "608" + "'", str7, "608");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1979640026" + "'", str13, "1979640026");
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\002\001");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd>");
        java.lang.String str15 = rSA1.decrypt("23902682981710767051802338059");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\016\ufffd\ufffd" + "'", str9, "\000\ufffd\016\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "135005697" + "'", str11, "135005697");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8684862678" + "'", str13, "8684862678");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\r\ufffd" + "'", str15, "\000\ufffd\ufffd\r\ufffd");
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.decrypt("409247107494479");
        java.lang.String str13 = rSA1.decrypt("33546352872558360619");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<" + "'", str7, "<");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\r;N\r\ufffd\u075ar\030\ufffd]" + "'", str11, "\001\r;N\r\ufffd\u075ar\030\ufffd]");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.encrypt("262");
        java.lang.String str13 = rSA1.encrypt("630010341");
        java.lang.String str15 = rSA1.encrypt("7542022550");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "292923559625639561449943383548" + "'", str5, "292923559625639561449943383548");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "989572697290203811958895399709" + "'", str7, "989572697290203811958895399709");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t\ufffd\ufffd\016\u02fd\ufffd\ufffd\ufffd" + "'", str9, "\t\ufffd\ufffd\016\u02fd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "933206985629308854320368650426" + "'", str11, "933206985629308854320368650426");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "343889779585634910052343216968" + "'", str13, "343889779585634910052343216968");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1115413130195929483255774577796" + "'", str15, "1115413130195929483255774577796");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("441");
        java.lang.String str13 = rSA1.encrypt("573027999461902947452889180577");
        java.lang.String str15 = rSA1.encrypt("669");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32" + "'", str7, "32");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "195656041" + "'", str11, "195656041");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "294585185" + "'", str13, "294585185");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "552174003" + "'", str15, "552174003");
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("2312924388126772");
        java.lang.String str7 = rSA1.encrypt("\003\004\ufffd");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "39777205806111419278368802437" + "'", str5, "39777205806111419278368802437");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "651107939414574603340139795856" + "'", str7, "651107939414574603340139795856");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("\002!");
        java.lang.Class<?> wildcardClass4 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "49215240027595883211988235236" + "'", str3, "49215240027595883211988235236");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("\037\ufffdbM");
        java.lang.String str9 = rSA1.decrypt("6307084357");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\001\ufffd\ufffd&");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??Z?&\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002!" + "'", str3, "\002!");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "110" + "'", str7, "110");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "?" + "'", str9, "?");
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.encrypt("233006726736920949521554542653");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "411963370208682292743468175808" + "'", str5, "411963370208682292743468175808");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "345269740179789171710304808034" + "'", str7, "345269740179789171710304808034");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\034\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\002\ufffd\ufffd\034\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "109414718074189671154887196458" + "'", str11, "109414718074189671154887196458");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("441");
        java.lang.String str13 = rSA1.encrypt("573027999461902947452889180577");
        java.lang.String str15 = rSA1.encrypt("911315954");
        java.lang.String str17 = rSA1.encrypt("104856550369619112320090550784");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??P?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1196063645" + "'", str11, "1196063645");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1113577711" + "'", str13, "1113577711");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1684215696" + "'", str15, "1684215696");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1267057080" + "'", str17, "1267057080");
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
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
        java.lang.String str21 = rSA1.encrypt("147");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "452174727853920754155139464545" + "'", str11, "452174727853920754155139464545");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "207262700196724585326910199256" + "'", str13, "207262700196724585326910199256");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\022\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\003\ufffd\022\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffdN" + "'", str19, "\003\ufffd\ufffd\ufffd\ufffd\ufffdN");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "397365649731742916243895505690" + "'", str21, "397365649731742916243895505690");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
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
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Y" + "'", str3, "Y");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\ufffd\n\ufffd\ufffdkh" + "'", str9, "\002\ufffd\ufffd\ufffd\n\ufffd\ufffdkh");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2956466552832" + "'", str15, "2956466552832");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "672749994932560009201" + "'", str17, "672749994932560009201");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\007\ufffd\u07fa\b\000\u0245\ufffdh" + "'", str19, "\007\ufffd\u07fa\b\000\u0245\ufffdh");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("703153339289949437747864939069");
        java.lang.String str13 = rSA1.encrypt("167");
        java.lang.String str15 = rSA1.encrypt("24728158503917487987839420576");
        java.lang.String str17 = rSA1.decrypt("31");
        java.lang.String str19 = rSA1.decrypt("24938507447839414211319740366");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\001+YA<");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001.yO6" + "'", str7, "\001.yO6");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004f\001w\035\ufffd" + "'", str11, "\004f\001w\035\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "980187597798259" + "'", str13, "980187597798259");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "736209392603286" + "'", str15, "736209392603286");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\026\ufffd" + "'", str17, "\002\ufffd\ufffd\026\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd\ufffd\ufffdJ5" + "'", str19, "\001\ufffd\ufffd\ufffdJ5");
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\001;");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("6901296438808693457125536937");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "322351555746998823787794448338" + "'", str11, "322351555746998823787794448338");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "31255875" + "'", str13, "31255875");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\027" + "'", str17, "\ufffd\ufffd\ufffd\ufffd\ufffd\027");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("1208902895495334527");
        java.lang.String str9 = rSA1.encrypt("58");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2316639374838414" + "'", str7, "2316639374838414");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2528796634624" + "'", str9, "2528796634624");
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("z");
        java.lang.String str9 = rSA1.encrypt("2757505283");
        java.lang.String str11 = rSA1.decrypt("120292079598856336929756288978");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "368" + "'", str7, "368");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "125" + "'", str9, "125");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("518");
        java.lang.String str11 = rSA1.decrypt("208642166923338001575549632629");
        java.lang.String str13 = rSA1.encrypt("\032\ufffd$\030\ufffd\ufffd\u02c3\ufffd\ufffd{");
        java.lang.String str15 = rSA1.decrypt("9689375820439133685507573070");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "96" + "'", str5, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2413025330" + "'", str9, "2413025330");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd" + "'", str11, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2827312829" + "'", str13, "2827312829");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A1h\020" + "'", str15, "A1h\020");
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.encrypt("48524739602976");
        java.lang.String str13 = rSA1.decrypt("44797199491853112088");
        java.lang.String str15 = rSA1.decrypt("1333165682");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd[\033Z" + "'", str7, "\b\ufffd\ufffd\ufffd\ufffd\ufffd[\033Z");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "213807323464016905827330161754" + "'", str9, "213807323464016905827330161754");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "149435360462114792405912064430" + "'", str11, "149435360462114792405912064430");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd_b" + "'", str13, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd_b");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\u06f9\ufffd\003\ufffd\ufffd" + "'", str15, "\001\ufffd\ufffd\u06f9\ufffd\003\ufffd\ufffd");
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006\ufffd=u^\177\022\ufffd\ufffdn%:" + "'", str7, "\006\ufffd=u^\177\022\ufffd\ufffdn%:");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "377785562693745923665542118069" + "'", str9, "377785562693745923665542118069");
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\ufffdS\020#\022");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001G" + "'", str5, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "509" + "'", str7, "509");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "613" + "'", str9, "613");
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("6");
        java.lang.String str9 = rSA1.encrypt("235");
        java.lang.String str11 = rSA1.encrypt("538");
        java.lang.String str13 = rSA1.encrypt("\007\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "637" + "'", str9, "637");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "613" + "'", str11, "613");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "91" + "'", str13, "91");
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("288");
        java.lang.String str15 = rSA1.decrypt("1894697952");
        java.lang.String str17 = rSA1.decrypt("1028793282341587");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001@" + "'", str7, "\001@");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "353144425583685293876133743677" + "'", str11, "353144425583685293876133743677");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "293760153143116310036223400689" + "'", str13, "293760153143116310036223400689");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd`q\f\ufffd$2" + "'", str15, "\003\ufffd\ufffd`q\f\ufffd$2");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\ufffdK\032\ufffd\ufffd" + "'", str17, "\005\ufffd\ufffdK\032\ufffd\ufffd");
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str7 = rSA1.decrypt("560");
        java.lang.String str9 = rSA1.encrypt("561185535");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001D" + "'", str7, "\001D");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "563" + "'", str9, "563");
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str7 = rSA1.encrypt("\001u");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "51895117" + "'", str7, "51895117");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("1998947500173");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u0370\ufffd");
        java.lang.String str11 = rSA1.decrypt("15028238390418345727767527777");
        java.lang.String str13 = rSA1.encrypt("X\034R\004\ufffd\ufffd\000\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("317579693760000000000");
        java.lang.String str17 = rSA1.encrypt("40072153360267034343");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "l" + "'", str3, "l");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "U" + "'", str7, "U");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "239" + "'", str9, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\177" + "'", str11, "\177");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "302" + "'", str13, "302");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "95" + "'", str17, "95");
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("\001\bl:0");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001z\034i" + "'", str3, "\001z\034i");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2483335961" + "'", str5, "2483335961");
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("288");
        java.lang.String str15 = rSA1.decrypt("377");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "86134352641778045685081733643" + "'", str11, "86134352641778045685081733643");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35650010007221349888" + "'", str13, "35650010007221349888");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "I\031\ufffd\ufffd\ufffd\ufffd\ufffd\233\ufffd=x" + "'", str15, "I\031\ufffd\ufffd\ufffd\ufffd\ufffd\233\ufffd=x");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("\003A");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.decrypt("\000\ufffd\002\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "549" + "'", str3, "549");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        java.lang.String str13 = rSA1.decrypt("289734891292401713311056387999");
        java.lang.String str15 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "131186438245131677815971112613" + "'", str5, "131186438245131677815971112613");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002 6\016\ufffd\037\ufffd\ufffd" + "'", str7, "\002 6\016\ufffd\037\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "360276228628274663062925318770" + "'", str9, "360276228628274663062925318770");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "440899605965192056130604760268" + "'", str11, "440899605965192056130604760268");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\030\031\ufffdk\033\ufffd\031\ufffd\ufffd\ufffd" + "'", str13, "\003\ufffd\ufffd\030\031\ufffdk\033\ufffd\031\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "409660846371983080204494580838" + "'", str15, "409660846371983080204494580838");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("#");
        java.lang.String str11 = rSA1.decrypt("15686160858");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\005\u03c6\ufffd\001\ufffd\ufffd\f\u8d96Sd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "81950850707695719898059494619" + "'", str5, "81950850707695719898059494619");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\002\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "64339296875" + "'", str9, "64339296875");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffdo/\017\ufffd\177\ufffd\ufffd" + "'", str11, "\000\ufffd\ufffdo/\017\ufffd\177\ufffd\ufffd");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("478");
        java.lang.String str15 = rSA1.encrypt("646");
        java.lang.String str17 = rSA1.encrypt("\013lf\020\ufffd\034\ufffd\ufffd\ufffd\016\ufffdah");
        java.lang.String str19 = rSA1.encrypt("258265091322468553983668563257");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\ufffd\031x");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??x\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "9282805537" + "'", str13, "9282805537");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3473163544" + "'", str15, "3473163544");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "159393647" + "'", str17, "159393647");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "11639163514" + "'", str19, "11639163514");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\002\001");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd>");
        java.lang.String str15 = rSA1.encrypt("\002\ufffd\ufffd-");
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\001U");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?U\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\b\ufffd" + "'", str7, "\ufffd\b\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001N7+'" + "'", str9, "\001N7+'");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1068675589" + "'", str11, "1068675589");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4834521762" + "'", str13, "4834521762");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4592023126" + "'", str15, "4592023126");
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.decrypt("9076220414");
        java.lang.String str9 = rSA1.encrypt("3275390824");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6" + "'", str3, "6");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L" + "'", str5, "L");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "157" + "'", str9, "157");
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        java.lang.String str5 = rSA1.decrypt("509");
        rSA1.generateKeys((int) '4');
        java.lang.String str9 = rSA1.decrypt("1015176908361408");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\001l");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?l\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "308" + "'", str3, "308");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\r" + "'", str5, "\001\r");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\ufffdx{" + "'", str9, "\005\ufffd\ufffd\ufffdx{");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("205");
        java.lang.String str11 = rSA1.encrypt("211");
        java.lang.String str13 = rSA1.decrypt("289734891292401713311056387999");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006\ufffd\025\ufffd\ufffd " + "'", str7, "\006\ufffd\025\ufffd\ufffd ");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35583402576551630221" + "'", str9, "35583402576551630221");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35591581950267981457" + "'", str11, "35591581950267981457");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd\u02dd" + "'", str13, "\006\ufffd\ufffd\u02dd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("42418796185018424088");
        java.lang.String str15 = rSA1.decrypt("5839342752");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "!\026\ufffd\ufffd" + "'", str9, "!\026\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1042297851" + "'", str11, "1042297851");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd" + "'", str13, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "T\030\ufffdR" + "'", str15, "T\030\ufffdR");
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1611067079503803");
        java.lang.String str13 = rSA1.decrypt("18980981751395059997709561778");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "461" + "'", str7, "461");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "314" + "'", str11, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "U" + "'", str13, "U");
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.encrypt("\ufffd");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffdQ\b\ufffd\021\006?g_?s" + "'", str11, "\002\ufffdQ\b\ufffd\021\006?g_?s");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "891919931337952" + "'", str15, "891919931337952");
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str5 = rSA1.encrypt("\ufffd\007\0302\006");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "463" + "'", str5, "463");
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("946669947");
        java.lang.String str7 = rSA1.encrypt("414601987065913579031306059745");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("452749904557785829080067757432");
        java.lang.String str13 = rSA1.encrypt("\002I");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Y" + "'", str5, "Y");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "463" + "'", str7, "463");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "123462746190866536471405927952" + "'", str11, "123462746190866536471405927952");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "200201625" + "'", str13, "200201625");
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        java.lang.String str11 = rSA1.encrypt("\u01ce");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002u" + "'", str3, "\002u");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\022\ufffd8" + "'", str9, "\001\ufffd\ufffd\ufffd\ufffd\022\ufffd8");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "563024977558867255299759082639" + "'", str11, "563024977558867255299759082639");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
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
        java.lang.String str21 = rSA1.encrypt("282");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O" + "'", str5, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "416" + "'", str7, "416");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "287" + "'", str9, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2851220549" + "'", str13, "2851220549");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3184042845" + "'", str15, "3184042845");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001Z\023#3" + "'", str17, "\001Z\023#3");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str19, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4153215432" + "'", str21, "4153215432");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("478");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u039d");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("209");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004\ufffd\260\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdA" + "'", str7, "\004\ufffd\260\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdA");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\037\031\ufffd\ufffd\ufffd \r\ufffd&\"<" + "'", str9, "\037\031\ufffd\ufffd\ufffd \r\ufffd&\"<");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "798" + "'", str13, "798");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "47352164938759320260270649059" + "'", str17, "47352164938759320260270649059");
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.decrypt("387");
        java.lang.String str9 = rSA1.decrypt("11860916928095778934456708933");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "M" + "'", str3, "M");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "215" + "'", str5, "215");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\021" + "'", str7, "\001\021");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("23585400911907150218938419175");
        java.lang.String str5 = rSA1.decrypt("4121926944");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001%" + "'", str3, "\001%");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "D" + "'", str5, "D");
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("393");
        java.lang.String str7 = rSA1.decrypt("227022896246510918381181022856");
        java.lang.String str9 = rSA1.encrypt("8");
        java.lang.String str11 = rSA1.encrypt("35650010007221349888");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "235" + "'", str5, "235");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "180" + "'", str9, "180");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "381" + "'", str11, "381");
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.encrypt("228013474449632847102912946578");
        java.lang.String str9 = rSA1.decrypt("42988629419629811268004412533");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001l" + "'", str3, "\001l");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "498" + "'", str7, "498");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.decrypt("616");
        java.lang.String str7 = rSA1.encrypt("4084101");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "211" + "'", str7, "211");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        java.lang.String str15 = rSA1.encrypt("875");
        java.lang.String str17 = rSA1.encrypt("42418796185018424088");
        java.lang.String str19 = rSA1.encrypt("\001\u0280\ufffd");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\006" + "'", str5, "\001\006");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23" + "'", str7, "23");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\214\ufffd\ufffd\036\ufffd\ufffdX" + "'", str13, "\000\ufffd\ufffd\214\ufffd\ufffd\036\ufffd\ufffdX");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "50004784369000759949" + "'", str15, "50004784369000759949");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "14719265198301518234240019518" + "'", str17, "14719265198301518234240019518");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "957955449928224631715394114" + "'", str19, "957955449928224631715394114");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = rSA1.decrypt(bigInteger4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("1208902895495334527");
        java.lang.String str9 = rSA1.encrypt("95");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1608804755315507" + "'", str7, "1608804755315507");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141001386125" + "'", str9, "3141001386125");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '4');
        java.lang.String str9 = rSA1.encrypt("365362228598105534857580613959");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001G" + "'", str5, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2880329739328187" + "'", str9, "2880329739328187");
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.decrypt("166");
        java.lang.String str13 = rSA1.encrypt("517");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("154");
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "42" + "'", str7, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "205" + "'", str9, "205");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\r" + "'", str11, "\r");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "191" + "'", str13, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "380" + "'", str17, "380");
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O" + "'", str5, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "416" + "'", str7, "416");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "287" + "'", str9, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7262238660" + "'", str13, "7262238660");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1338172409" + "'", str15, "1338172409");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\u0162V`" + "'", str17, "\000\u0162V`");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str19, "\000\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("791944786");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t\ufffd\002\ufffd" + "'", str7, "\t\ufffd\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("478");
        java.lang.String str15 = rSA1.encrypt("646");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "830" + "'", str7, "830");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "822" + "'", str9, "822");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3265921956" + "'", str13, "3265921956");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7506610468" + "'", str15, "7506610468");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        java.lang.String str9 = rSA1.encrypt("4839922246");
        java.lang.String str11 = rSA1.encrypt("30962286017337529394493920187");
        java.lang.String str13 = rSA1.encrypt("490");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "607687305650923045758286929145" + "'", str5, "607687305650923045758286929145");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "26012764767708918581052067967" + "'", str7, "26012764767708918581052067967");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "343473819364546566186731513455" + "'", str9, "343473819364546566186731513455");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "284393389408122065309474592124" + "'", str11, "284393389408122065309474592124");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "370288562121688341494735009834" + "'", str13, "370288562121688341494735009834");
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("4089374768");
        java.lang.String str5 = rSA1.encrypt("\000\ufffd\u06d9\003");
        java.lang.String str7 = rSA1.encrypt("127038516285899548678629729898");
        java.lang.String str9 = rSA1.decrypt("1843623970311073");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002'" + "'", str3, "\002'");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "353" + "'", str7, "353");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\002\001");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd>");
        java.lang.String str15 = rSA1.encrypt("\002\ufffd\ufffd-");
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.encrypt("501619215992877544684325066512");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd'" + "'", str7, "\001\ufffd\ufffd'");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "135005697" + "'", str11, "135005697");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5305778972" + "'", str13, "5305778972");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2038368786" + "'", str15, "2038368786");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "359" + "'", str19, "359");
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
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
        java.lang.String str23 = rSA1.encrypt("j");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "456991522694002995070299717036" + "'", str11, "456991522694002995070299717036");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd37v" + "'", str13, "\002\ufffd\ufffd\ufffd\ufffd\ufffd37v");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\024\ufffd\035\ufffd\ufffd\ufffd\u0657\ufffd" + "'", str17, "\001\024\ufffd\035\ufffd\ufffd\ufffd\u0657\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "357931517608805988704347230579" + "'", str19, "357931517608805988704347230579");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "518170606024247507359396239724" + "'", str21, "518170606024247507359396239724");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "13382255776" + "'", str23, "13382255776");
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("|JH%w\016\t\ufffd\ufffd\001\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("48159020044353377656022340487");
        java.lang.String str13 = rSA1.encrypt("586656078404500661980529726446");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\u04d5\ufffd" + "'", str7, "\001\u04d5\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1740089511" + "'", str9, "1740089511");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffdh" + "'", str11, "\ufffd\ufffdh");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2258975108" + "'", str13, "2258975108");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
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
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "138567915591017188146696087088" + "'", str11, "138567915591017188146696087088");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "171301574874819916913888504038" + "'", str13, "171301574874819916913888504038");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n\023D\021\u04341{\f\ufffd\ufffd" + "'", str15, "\n\023D\021\u04341{\f\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "530292841027814857671991103124" + "'", str17, "530292841027814857671991103124");
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        java.lang.String str9 = rSA1.encrypt("43498179141247");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "448625104994844" + "'", str9, "448625104994844");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.decrypt("625554684732559581014312991005");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5" + "'", str3, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd|" + "'", str7, "\002\ufffd|");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\0070ND" + "'", str13, "\0070ND");
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.decrypt("50334980593118017863872015613");
        java.lang.String str5 = rSA1.decrypt("507");
        java.lang.String str7 = rSA1.encrypt("\001Y");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001," + "'", str5, "\001,");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "437" + "'", str7, "437");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
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
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "D" + "'", str7, "D");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "290" + "'", str9, "290");
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        java.lang.String str11 = rSA1.encrypt("\u01ce");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002:" + "'", str3, "\002:");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd6" + "'", str9, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd6");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "290263802952712069787645772560" + "'", str11, "290263802952712069787645772560");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\001(");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?(\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5" + "'", str7, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "90" + "'", str9, "90");
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        java.lang.String str11 = rSA1.encrypt("76525688979612163312788900454");
        java.lang.String str13 = rSA1.encrypt("\b\ufffd{[K\350\026\027\ufffd\ufffd@");
        java.lang.String str15 = rSA1.decrypt("1028793282341587");
        java.lang.String str17 = rSA1.decrypt("342981671868457888627866774352");
        java.lang.String str19 = rSA1.decrypt("2713086850284317");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\032" + "'", str3, "\002\032");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\f\037\ufffd\ufffd\ufffd\\" + "'", str9, "\001\ufffd\ufffd\f\037\ufffd\ufffd\ufffd\\");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "404562186961199544635848844762" + "'", str11, "404562186961199544635848844762");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "208424615175295461924453936343" + "'", str13, "208424615175295461924453936343");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\r\ufffd\ufffd\ufffdY\037\ufffd\r\ufffd\ufffdPf" + "'", str15, "\001\r\ufffd\ufffd\ufffdY\037\ufffd\r\ufffd\ufffdPf");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\r\ufffd\ufffd\ufffd\ufffd\006\u02d5" + "'", str17, "\r\ufffd\ufffd\ufffd\ufffd\006\u02d5");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\013\u0571\ufffd\ufffdM\003\u0494\ufffd" + "'", str19, "\013\u0571\ufffd\ufffdM\003\u0494\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.encrypt("4409664116");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3513031196" + "'", str5, "3513031196");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("516");
        java.lang.String str5 = rSA1.decrypt("3541590856");
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003\ufffd\026\b\ufffd\ufffd\000\013\ufffd|" + "'", str3, "\003\ufffd\026\b\ufffd\ufffd\000\013\ufffd|");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\006\ufffdA.'\022\ufffd\u032d" + "'", str5, "\006\ufffdA.'\022\ufffd\u032d");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("\002\ufffd");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "115" + "'", str15, "115");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("288");
        java.lang.String str15 = rSA1.decrypt("1894697952");
        java.lang.String str17 = rSA1.decrypt("1028793282341587");
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "378692175260944626076264448286" + "'", str11, "378692175260944626076264448286");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "363981543584354224637590281919" + "'", str13, "363981543584354224637590281919");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\ufffd\033\ufffd\u0744" + "'", str15, "\005\ufffd\ufffd\ufffd\033\ufffd\u0744");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\u0373\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\001\ufffd\u0373\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("205");
        java.lang.String str11 = rSA1.encrypt("211");
        java.lang.String str13 = rSA1.decrypt("289734891292401713311056387999");
        java.lang.String str15 = rSA1.encrypt("\001\ufffddJ&");
        java.lang.String str17 = rSA1.encrypt("4525747289");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "164042693383922326594701861573" + "'", str5, "164042693383922326594701861573");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\u024e\ufffd" + "'", str7, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\u024e\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "399818536208862857445585438409" + "'", str9, "399818536208862857445585438409");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "323731513439947027938255427581" + "'", str11, "323731513439947027938255427581");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\r\ufffd\ufffd\ufffd\ufffd\ufffdLA" + "'", str13, "\r\ufffd\ufffd\ufffd\ufffd\ufffdLA");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "492202244156493510845261505813" + "'", str15, "492202244156493510845261505813");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "373769877651714170540341478837" + "'", str17, "373769877651714170540341478837");
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd63^\020j+\r");
        java.lang.String str9 = rSA1.encrypt("2951232610");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("\001\005\ufffd\f");
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("QP\030,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"QP?,\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001W" + "'", str5, "\001W");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "30" + "'", str7, "30");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "341" + "'", str9, "341");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "669" + "'", str13, "669");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "D" + "'", str7, "D");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "103" + "'", str9, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "745139504213927243139828378994" + "'", str13, "745139504213927243139828378994");
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
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
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\013\ufffd\ufffd\ufffd|\017\ufffd=\036," + "'", str9, "\013\ufffd\ufffd\ufffd|\017\ufffd=\036,");
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("208642166923338001575549632629");
        java.lang.String str11 = rSA1.encrypt("460");
        java.lang.String str13 = rSA1.decrypt("663612053");
        java.lang.String str15 = rSA1.encrypt("\001\ufffd\ufffd\ufffdM");
        java.lang.String str17 = rSA1.encrypt("\002\032");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "461" + "'", str7, "461");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11" + "'", str9, "11");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "460" + "'", str11, "460");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\177" + "'", str13, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "428" + "'", str15, "428");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "292" + "'", str17, "292");
    }
}
